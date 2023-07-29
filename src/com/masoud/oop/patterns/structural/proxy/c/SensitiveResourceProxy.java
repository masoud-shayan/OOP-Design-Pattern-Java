package com.masoud.oop.patterns.structural.proxy.c;

import com.masoud.oop.patterns.structural.proxy.a.SensitiveResource;
import com.masoud.oop.patterns.structural.proxy.b.RealSensitiveResource;

public class SensitiveResourceProxy implements SensitiveResource {

    private RealSensitiveResource realResource;
    private String username;
    private String password;

    public SensitiveResourceProxy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void accessResource() {
        if (authenticate()) {
            if (realResource == null) {
                realResource = new RealSensitiveResource(username, password);
            }
            realResource.accessResource();
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    private boolean authenticate() {
        // Simulate some authentication logic here (e.g., check username and password)
        return "admin".equals(username) && "secret".equals(password);
    }
}
