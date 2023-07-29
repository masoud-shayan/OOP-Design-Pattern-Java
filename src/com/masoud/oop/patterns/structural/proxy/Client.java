package com.masoud.oop.patterns.structural.proxy;

import com.masoud.oop.patterns.structural.proxy.c.SensitiveResourceProxy;

public class Client {
    public static void main(String[] args) {

        // Accessing sensitive resource via the proxy
        SensitiveResourceProxy proxy = new SensitiveResourceProxy("admin", "secret");
        proxy.accessResource();

        // Trying to access sensitive resource with incorrect credentials
        SensitiveResourceProxy invalidProxy = new SensitiveResourceProxy("user", "wrong_password");
        invalidProxy.accessResource();
    }
}
