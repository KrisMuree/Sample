package com.telstra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kris on 9/5/17.
 */
@RestController()
@RequestMapping("/api")
public class SampleRestEndpoint {

    @GetMapping("/")
    public String greeting() {
        return "Hello World !";
    }

    @GetMapping("/{user}")
    public String user(@PathVariable("user") String user) {
        return "Hello "+user;
    }
}
