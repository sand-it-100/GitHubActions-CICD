
package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void testHome() {

        HelloController controller = new HelloController();

        String result = controller.home();

        assertEquals(
            "Hello! CI/CD Pipeline is Working Successfully!",
            result
        );
    }
}
