package com.amrut.prabhu.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RefreshScope
@RestController
public class Controller {


    @Value("${welcome.message}")
    private String message;

    @GetMapping("/welcome")
    public String getMessage() {
        return message;
    }


    
    @GetMapping("/user/{id}")
    //@RolesAllowed({"product_read"})
    public String getUser(@PathVariable("id") String userId) {
        return "User ID: " + userId;
    }



}
