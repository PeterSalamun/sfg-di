package com.salamun.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18Service")
public class I18SpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - Espana";
    }
}
