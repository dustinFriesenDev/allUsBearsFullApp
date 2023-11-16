package com.MVC.allUsBears.contollers;

import com.MVC.allUsBears.models.Recipient;
import com.MVC.allUsBears.models.data.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recipient")
public class RecipientController {

    @Autowired
    private RecipientRepository recipientRepository;

    @PostMapping("add")
    public String processAddRecipientForm(@RequestBody Recipient recipient){
        recipientRepository.save(recipient);
        return "Recipient added.";
    }

}
