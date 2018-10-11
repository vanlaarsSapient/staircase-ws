package staircase.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import staircase.logic.Fibonacci;
import staircase.model.Staircase;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StairCaseController {

    private Fibonacci fibonacciCalculator = new Fibonacci();

    @RequestMapping(method=GET, path = "/staircase")
    public Staircase get_number_of_ways(@RequestParam(value="height", defaultValue= "1") int height) {
        return new Staircase(height, fibonacciCalculator.numWays(height));
    }


}
