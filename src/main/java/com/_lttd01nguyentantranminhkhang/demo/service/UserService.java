package com._lttd01nguyentantranminhkhang.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com._lttd01nguyentantranminhkhang.demo.models.User;
import com._lttd01nguyentantranminhkhang.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User luuUser(User user) {
        return this.userRepository.save(user);
    }

    public void deleteUser(Long id) {
        Optional<User> user = this.userRepository.findById(id);
        this.userRepository.delete(user.get());

    }

    public List<User> getAllUSer() {
        return this.userRepository.findAll();
    }

    public User suaUser(Long id, User userSua) {

        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {

            User userHienTai = optionalUser.get();

            userHienTai.setTen(userSua.getTen());
            userHienTai.setLop(userSua.getLop());
            userHienTai.setMaSinhVien(userSua.getMaSinhVien());

            return userRepository.save(userHienTai);
        } else {
        	return null;
        }
    }
}
