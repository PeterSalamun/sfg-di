package com.salamun.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class I18EnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
}
