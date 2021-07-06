package com.kite.backend.service;

import com.kite.backend.exception.NotFoundException;
import com.kite.backend.model.User;
import com.kite.backend.repository.UserRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @Cacheable(cacheNames = "userListCache")
    public List<User> getUsers() throws InterruptedException{
        return userRepository.findAll();
    }

    @CacheEvict(cacheNames = "userListCache")
    public void clearCache(){
        //...
        System.out.println("userListCache cleaned");
    }

    public void delete(long id) {
        Optional<User> trainerOptional = userRepository.findById(id);
        if (trainerOptional.isPresent()) {
            userRepository.deleteById(id);
        }
        throw new NotFoundException("ID " + id + "Not Found!");
    }

    public User getTrainer(long id) {
        Optional<User> trainerOptional = userRepository.findById(id);
        if (trainerOptional.isPresent()) {
            return userRepository.findById(id).get();
        }
        throw new NotFoundException("ID " + id + "Not Found!");
    }
}
