package com.MVC.allUsBears.contollers;

import com.MVC.allUsBears.models.Transaction;
import com.MVC.allUsBears.models.data.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("checkout")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("purchase")
    public String processAddTransactionForm(@RequestBody Transaction transaction){
        transactionRepository.save(transaction);
        return "Transaction add.";
    }

}
