package com._lttd01nguyentantranminhkhang.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._lttd01nguyentantranminhkhang.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
