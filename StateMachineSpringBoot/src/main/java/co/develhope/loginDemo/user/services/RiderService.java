package co.develhope.loginDemo.user.services;

import co.develhope.loginDemo.user.entities.User;
import co.develhope.loginDemo.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RiderService{
    @Autowired
    private UserRepository userRepository;

    public User pickRider(){
        if(userRepository.pickRider().isPresent()){
            return userRepository.pickRider().get();
        }else{
            return userRepository.findAll(PageRequest.of(0,1)).toList().get(0);
        }
    }
}
