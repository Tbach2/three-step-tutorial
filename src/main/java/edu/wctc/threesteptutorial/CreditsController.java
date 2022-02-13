package edu.wctc.threesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreditsController {
    @RequestMapping("/credits")
    public String showCreditsPage() {
        return "pages/credits";
    }
}
