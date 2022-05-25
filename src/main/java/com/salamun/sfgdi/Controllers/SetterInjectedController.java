package com.salamun.sfgdi.Controllers;

import com.salamun.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class SetterInjectedController {

    private GreetingService service;
    @Qualifier("setterGreetingService")
    @Autowired
    public void setService(GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.sayGreeting();
    }
}
