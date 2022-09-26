package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping()
public class SkillsController {

    @GetMapping()
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/skills' method = 'post'>" +
                "<div>Name:</div>" +
                "<input type = 'text' name = 'name' >" +
                "<div>My favorite language:</div>" +
                "<select name='favoriteLanguage' id='favorite-language'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select>" +
                "<div>My second favorite language:</div>" +
                "<select name='secondFavoriteLanguage' id='second-favorite-language'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select>" +
                "<div>My third favorite language:</div>" +
                "<select name='thirdFavoriteLanguage' id='third-favorite-language'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(path="skills", method = {RequestMethod.GET, RequestMethod.POST})
    public String skillsWithQueryParam(@RequestParam String name, @RequestParam String favoriteLanguage, @RequestParam String secondFavoriteLanguage, @RequestParam String thirdFavoriteLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favoriteLanguage + "</li>" +
                "<li>" + secondFavoriteLanguage + "</li>" +
                "<li>" + thirdFavoriteLanguage + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
