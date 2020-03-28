package com.example.swtest;

import org.junit.Ignore;
import org.junit.Test;

public class RequestSenderImplTest {

    // integration test
    @Ignore
    @Test
    public void testSendWithDeveloperMode() {
        RequestBinSender sender = new RequestBinSenderImpl();
        sender.send("LFH is stand for Learn from Home");
    }
}