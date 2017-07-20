package com.lakey.web;

import com.lakey.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Daemon {

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("盖伦", 18);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("蛮王", 18);
        Person p2 = new Person("易大师", 18);
        Person p3 = new Person("赵信", 18);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Daemon.class, args);
    }
}