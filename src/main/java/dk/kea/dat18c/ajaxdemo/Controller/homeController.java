package dk.kea.dat18c.ajaxdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController
{
    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/js_basics")
    public String jsBasics() { return "js_basics"; }

    @GetMapping("/htmltagds")
    public String htmlTagDs() { return "htmltagds"; }
}

