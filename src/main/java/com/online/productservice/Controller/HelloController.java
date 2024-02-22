package com.online.productservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController
{
    @GetMapping("/say/{name}/{age}")
            public String hello(@PathVariable("name") String name, @PathVariable("age") int age)
    {
            String answer = "";
            for(int i=0;i<age;i++)
            {
                answer+= "hello "+name;
                answer+= "<br>";
            }
            return answer;
    }

}
