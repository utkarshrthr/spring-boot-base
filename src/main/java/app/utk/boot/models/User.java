package app.utk.boot.models;

import javax.annotation.PostConstruct;

public class User {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @PostConstruct
    public void init(){
        System.out.println("User bean initialized");
    }

    public void startup(){
        System.out.println("User bean loaded");
    }
}
