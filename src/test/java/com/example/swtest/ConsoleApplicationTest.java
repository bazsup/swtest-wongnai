package com.example.swtest;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Scanner;

import static org.junit.Assert.*;

@RunWith(JMock.class)
public class ConsoleApplicationTest {
    private Mockery mockery = new JUnit4Mockery();

    @Test
    public void testMain() {
        IO io = mockery.mock(IO.class);
        mockery.checking(new Expectations() {{
            Sequence seq = mockery.sequence("call seq 1");

            oneOf(io).getInput();
            will(returnValue("1 2 3 4"));
            inSequence(seq);

            oneOf(io).print("The result is: 10");
            inSequence(seq);
        }});

        ConsoleApplication.io = io;
        ConsoleApplication.main(null);

    }
}