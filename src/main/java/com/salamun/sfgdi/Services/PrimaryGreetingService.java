package com.salamun.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Helo World - from the PRIMARY Bean!";
    }
}
