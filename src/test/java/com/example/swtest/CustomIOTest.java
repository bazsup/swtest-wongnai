package com.example.swtest;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomIOTest {
    Mockery mockery = new JUnit4Mockery();

    @Test
    public void testPrint() {
        RequestBinSender sender = mockery.mock(RequestBinSender.class);

        mockery.checking(new Expectations() {{
            oneOf(sender).send("message");
        }});

        CustomIO io = new CustomIO();
        io.setSender(sender);
        io.print("message");
    }
}