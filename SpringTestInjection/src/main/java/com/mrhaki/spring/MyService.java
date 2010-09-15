// Class to test: src/main/java/com/mrhaki/spring/MyService.java
package com.mrhaki.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    @Autowired
    MessageService messageService;

    public String say(String name) {
        return messageService.getMessage() + name;
    }
}
