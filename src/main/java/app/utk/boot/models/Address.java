package app.utk.boot.models;

import javax.annotation.PostConstruct;

public class Address {

    @PostConstruct
    public void init(){
        System.out.println("Address bean initialized");
    }

}
