package com.crud.cruud.service;

import com.crud.cruud.entity.User;
import com.crud.cruud.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    public  List<User> getUsers(Long id){
        return null;
    }

}
