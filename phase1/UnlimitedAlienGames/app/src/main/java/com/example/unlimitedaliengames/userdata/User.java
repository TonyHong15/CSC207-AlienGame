package com.example.unlimitedaliengames.userdata;

import java.io.Serializable;

/*
An User object.
 */
public class User implements Serializable {
    /*
    User's information.
     */
    public String name;
    private String password;

    /*
    Stats for the guesser game.
     */
    private GuesserData guesserData;

    /*
    Initialize a user with not game info.
     */
    User(String name, String password){
        this.name = name;
        this.password = password;
    }

    void setPassword(String pass){
        this.password = pass;
    }

    boolean matchPassword(String pass){
        return password.equals(pass);
    }

    void saveGuesser(GuesserData data){
        this.guesserData = data;
    }

    void eraseGuesser(){
        this.guesserData = null;
    }
}
