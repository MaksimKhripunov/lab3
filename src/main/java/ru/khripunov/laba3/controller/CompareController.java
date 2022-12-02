package ru.khripunov.laba3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.khripunov.laba3.Compare;

import java.util.ArrayList;


@Controller
@RequestMapping("/compare")
public class CompareController {

    private Compare compare;

    @Autowired
    public CompareController (Compare compare){this.compare=compare;}

  @GetMapping()
   public String result(Model model)
   {

       model.addAttribute("timeAddLastA", compare.timeAddLastA());
       model.addAttribute("timeAddA", compare.timeAddA());
       model.addAttribute("timeGetA", compare.timeGetA());
       model.addAttribute("timeDeleteA", compare.timeDeleteA());
       model.addAttribute("timeDeleteLastA", compare.timeDeleteLastA());
       model.addAttribute("timeAddLastL", compare.timeAddLastL());
       model.addAttribute("timeAddL", compare.timeAddL());
       model.addAttribute("timeGetL", compare.timeGetL());
       model.addAttribute("timeDeleteL", compare.timeDeleteL());
       model.addAttribute("timeDeleteLastL", compare.timeDeleteLastL());

       return "compare/showPage";
    }

}
