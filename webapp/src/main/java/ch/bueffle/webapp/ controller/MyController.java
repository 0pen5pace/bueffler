package  ch.bueffle.webapp.controller;

import ch.bueffle.webapp.model.Cards;
import ch.bueffle.webapp.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    @Autowired
    private ICardService cardService;

    @GetMapping("/showCards")
    public String findCards(Model model) {

        var cards = (List<Cards>) cardService.findAll();

        model.addAttribute("cards", cards);

        return "showCards";
    }
}