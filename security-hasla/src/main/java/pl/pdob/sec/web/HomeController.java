package pl.pdob.sec.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pdob.sec.message.WelcomeMessageService;

@Controller
class HomeController {
    private WelcomeMessageService welcomeMessageService;

    public HomeController(WelcomeMessageService welcomeMessageService) {
        this.welcomeMessageService = welcomeMessageService;
    }

    @GetMapping("/")
    String home(@RequestParam(defaultValue = "en") String lang, Model model) {
        String welcomeMessage = welcomeMessageService.getWelcomeMessage(lang);
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "index";
    }

//    @GetMapping("/")
//    String home(Authentication authentication, Model model) {
//        model.addAttribute("username", authentication.getName());
//        return "index";
//    }

//    @GetMapping("/")
//    String home(@CurrentSecurityContext(expression = "authentication.name") String username, Model model) {
//        model.addAttribute("username", username);
//        return "index";
//    }
}
