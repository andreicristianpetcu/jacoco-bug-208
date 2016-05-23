package com.jacocobug;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class HellowerTest {

    @Test
    public void givenAPersonName_whenSayHello_thenCorrectStringIsReturned() throws Exception {
        assertEquals("Hello Jane!", Hellower.sayHello("Jane"));
    }

}
