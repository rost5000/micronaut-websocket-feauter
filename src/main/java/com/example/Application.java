package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
//        io.micronaut.serde.support.AbstractStreamDecoder decoder;
        Micronaut.run(Application.class, args);
    }
}