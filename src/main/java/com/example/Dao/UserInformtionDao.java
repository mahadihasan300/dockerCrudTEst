package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserInformation;

@Repository
public interface UserInformtionDao extends JpaRepository<UserInformation, String>{

}
