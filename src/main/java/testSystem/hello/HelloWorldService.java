package testSystem.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    private static final String HELLO_WORLD_STRING = "Hello, World!";

    public String makeHelloString() {
        return HELLO_WORLD_STRING;
    }
}
