package com.calculator.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorService {
    public String welcome(){
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String calcPlus(@RequestParam(name ="num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра num1 и num2 должны быть указаны!";
        }
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }
    public String calcMinus(@RequestParam(name ="num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра num1 и num2 должны быть указаны!";
        }
        int res = num1 - num2;
        return num1 + " - " + num2 + " = " + res;
    }

    public String calcMultiply(@RequestParam(name ="num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра num1 и num2 должны быть указаны!";
        }
        int res = num1 * num2;
        return num1 + " * " + num2 + " = " + res;
    }

    public String calcDivide(@RequestParam(name ="num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра num1 и num2 должны быть указаны!";
        }
        if (num2 == 0) {
            return "На ноль делить нельзя.";
        }
        int res = num1 / num2;
        return num1 + " / " + num2 + " = " + res;
    }
}
