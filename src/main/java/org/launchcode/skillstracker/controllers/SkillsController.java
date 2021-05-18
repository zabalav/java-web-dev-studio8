package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String skillTracker() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    public String skillTrackerForm () {
        return "<html>" +
                "<body>" +
                "<form method='post'>" +
                "Name:<br/>" +
                "<input type='text' name='name' />" +
                "<br>My favorite language: <br>" +
                "<select name= 'firstChoice'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" +
                "<br>My second favorite language: <br>" +
                "<select name= 'secondChoice'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" +
                "<br>My third favorite language: <br>" +
                "<select name= 'thirdChoice'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" +
                "<br> <input type='submit'> </input>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="form", method= RequestMethod.POST)
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        return "<h1>" + name + "</h1>" +
            "<ol>" +
            "<li>" + firstChoice + "</li>" +
            "<li>" + secondChoice + "</li>" +
            "<li>" + thirdChoice + "</li>" +
            "</ol>";
    }

}