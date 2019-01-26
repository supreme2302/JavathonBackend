package com.javathon.backend.dao;

import com.javathon.backend.model.User;
import com.javathon.backend.service.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findById(long id);
    User findByImei(long imei);
    User findByVk_id(long id);
}
