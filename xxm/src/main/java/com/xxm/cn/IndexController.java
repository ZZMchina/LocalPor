package com.xxm.cn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String indexTo() {
        // return "index1.html";
        return "index";
        // return "index";
    }

    @RequestMapping("/myindex")
    public String indexTo1() {
        // return "index1.html";
        return "redirect:/html/myindex.html";
        // return "index";
    }

}
