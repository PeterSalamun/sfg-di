package com.salamun.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SK", "default"})
@Service("i18Service")
public class I18DefaultGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Zdar Svete - Slovak";
    }
}
