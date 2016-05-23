package com.jacocobug;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Hellower {

    static String sayHello(String personName) {
        return "Hello " + personName + "!";
    }

}
