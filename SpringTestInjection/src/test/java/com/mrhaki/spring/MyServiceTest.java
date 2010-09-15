// Test class for testing MyService: src/test/java/com/mrhaki/spring/MyServiceTest.java
package com.mrhaki.spring;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    @Test
    public void sayHi() {
        MessageService messageService = mock(MessageService.class);
        when(messageService.getMessage()).thenReturn("Hi, ");

        MyService myService = new MyService();
        // Inject mock into private field:
        ReflectionTestUtils.setField(myService, "messageService", messageService);

        assertEquals("Hi, mrhaki", myService.say("mrhaki"));
    }
}
