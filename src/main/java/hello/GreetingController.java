package hello;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import controller.Calculate;
import Application.CalculatriceException;

@RestController
public class GreetingController
{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/calculate")
    public Greeting calculate(@RequestParam(value = "operande2", defaultValue = "") Double operand1, @RequestParam(value = "operande", defaultValue = "") Double operand2,@RequestParam(value = "operation", defaultValue = "") Character operation) throws CalculatriceException {
        Double result;
        try {
            result = Calculate.calculate(operand1,operand2,operation);
            System.out.println("result : " + result);
        } finally {
            System.out.println("nothing");
        }
        return new Greeting(counter.incrementAndGet(),
                String.format(template, result));
}
}
