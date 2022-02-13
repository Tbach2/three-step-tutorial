package edu.wctc.threesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepController {
    @RequestMapping("/step-one")
    public String showStepOne() {
        return "pages/step-one";
    }

    @RequestMapping("/step-two")
    public String showStepTwo() {
        return "pages/step-two";
    }

    @RequestMapping("/step-three")
    public String showStepThree() {
        return "pages/step-three";
    }
}
