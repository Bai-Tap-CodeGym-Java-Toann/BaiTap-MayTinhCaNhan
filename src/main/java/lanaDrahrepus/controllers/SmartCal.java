package lanaDrahrepus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class SmartCal {

    @GetMapping
    private ModelAndView toCalculator() {
        ModelAndView modelAndView = new ModelAndView("calculator");
        return modelAndView;
    }

    @PostMapping
    private ModelAndView handleOperation(@RequestParam String operator, double operand1, double operand2) {
        Object rawAnswer = calculator(operand1, operand2, operator);
        String answer;
        if (rawAnswer == null){
           answer = "không chia được cho 0 !";
        }
        answer = String.valueOf(rawAnswer);
        ModelAndView operation = new ModelAndView("answer");
        operation.addObject("answer",answer);
        return operation;
    }

    private Object calculator(double o1, double o2, String operator) {
        switch (operator) {
            case "+":
                return o1 + o2;
            case "-":
                return o1 - o2;
            case ":":
                if (o2 == 0) {
                    return null;
                }
                return o1 / o2;
            default:
                return o1 * o2;
        }
    }
}
