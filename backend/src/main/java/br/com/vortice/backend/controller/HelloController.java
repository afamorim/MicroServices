package br.com.vortice.backend.controller;

import br.com.vortice.backend.domain.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping
    @ResponseBody
    public Hello hello() {
        return new Hello("OLHA EU AI");
    }

}
