package pl.pdob.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Home Text";
    }
}
