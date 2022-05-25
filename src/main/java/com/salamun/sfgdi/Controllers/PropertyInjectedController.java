package com.salamun.sfgdi.Controllers;

import com.salamun.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
