package fr.arolla.macavavin.web;

import fr.arolla.macavavin.services.CorkedReferenceBottleDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/macave")
public class MacavavinController {

    @Autowired
    private CorkedReferenceBottleDictionary referenceBottleDictionary;

    @RequestMapping(method = RequestMethod.GET)
    public String mainPage(Model model){
        model.addAttribute("bottles", referenceBottleDictionary.getAllReferences());
        return "macave";
    }

}
