package org.example.newman;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserRepositoryMock {

    public List<User> getAll(){
        return Arrays.asList(buildUserGeneric(), buildUserGeneric());
    }

    public User getUser(){
        return buildUserGeneric();
    }

    public User craeteUser(User user){
        return user;
    }

    private User buildUserGeneric(){
        return User.builder().name("Jorge").age(18).build();
    }

}
