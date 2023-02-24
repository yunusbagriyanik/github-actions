package com.yunusbagriyanik.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

    @GetMapping("/main")
    public String release() {
        return "1.0.0";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

}
