package com.picpay.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpay.domain.user.User;
import com.picpay.domain.user.UserType;
import com.picpay.dtos.UserDTO;
import com.picpay.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {

        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Este tipo de usuário não pode realizar transações");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente");
        }
    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }    

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

    public User saveUser(User user) {
        return this.repository.save(user);
    }
}
