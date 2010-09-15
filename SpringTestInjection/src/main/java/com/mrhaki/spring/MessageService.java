// Support class used in MyService: src/main/java/com/mrhaki/spring/MessageService.java
package com.mrhaki.spring;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String getMessage() {
        return "Hello, ";
    }
}
