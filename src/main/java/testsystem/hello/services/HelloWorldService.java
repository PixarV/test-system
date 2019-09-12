package testsystem.hello.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HelloWorldService {
    private static final String HELLO_WORLD = "Hello, World!";

    public String getHelloWorldMessage() {
        return HELLO_WORLD;
    }
}
