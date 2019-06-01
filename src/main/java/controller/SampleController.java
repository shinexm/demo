package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuming on 2019/6/1.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/wm/")
    @ResponseBody
    String home(){
        return "Hello World is my wum!!!";
    }

    @RequestMapping("/wm1/")
    @ResponseBody
    String print(){
        return "打印方法...";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
