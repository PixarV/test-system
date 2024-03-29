package testsystem.hello.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import testsystem.hello.services.HelloWorldService;

@RestController
@AllArgsConstructor
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping("/hello")
    public String helloWorld() {
        return helloWorldService.getHelloWorldMessage();
    }
}
