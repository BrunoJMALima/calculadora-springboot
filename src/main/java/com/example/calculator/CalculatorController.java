package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public Map<String, Double> add(@RequestParam double a, @RequestParam double b) {
        double result = a + b;
        Map<String, Double> response = new HashMap<>();
        response.put("result", result); // Coloca o resultado em um mapa
        return response; // Retorna o mapa como JSON
    }

    @GetMapping("/subtract")
    public Map<String, Double> subtract(@RequestParam double a, @RequestParam double b) {
        double result = a - b;
        Map<String, Double> response = new HashMap<>();
        response.put("result", result);
        return response;
    }

    @GetMapping("/multiply")
    public Map<String, Double> multiply(@RequestParam double a, @RequestParam double b) {
        double result = a * b;
        Map<String, Double> response = new HashMap<>();
        response.put("result", result);
        return response;
    }

    @GetMapping("/divide")
    public Map<String, Double> divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = a / b;
        Map<String, Double> response = new HashMap<>();
        response.put("result", result);
        return response;
    }
}
