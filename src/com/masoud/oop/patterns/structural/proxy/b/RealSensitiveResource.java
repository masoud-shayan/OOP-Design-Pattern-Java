package com.masoud.oop.patterns.structural.proxy.b;

import com.masoud.oop.patterns.structural.proxy.a.SensitiveResource;

public class RealSensitiveResource implements SensitiveResource {
    private String username;
    private String password;

    public RealSensitiveResource(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("RealSensitiveResource initialized with username: " + username);
    }

    @Override
    public void accessResource() {
        System.out.println("Accessing sensitive resource for user: " + username);
    }
}
