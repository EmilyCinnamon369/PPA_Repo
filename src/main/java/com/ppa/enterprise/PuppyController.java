package com.ppa.enterprise;


import com.ppa.enterprise.model.Puppy;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Puppies")
public class PuppyController {

    //Upload Puppy Info
    private List<Puppy> thePuppies;

    @PostConstruct
    private void loadData(){

        //Create Puppies
        Puppy pup1 = new Puppy(1,"Petey", "Black", "Yorkie-Poo", "Male");
        Puppy pup2 = new Puppy(2,"Biggie", "Apricot", "Toy Poodle", "Male");
        Puppy pup3 = new Puppy(3,"Chili", "Red", "Pomeranian", "Female");


        //Create our List
        thePuppies = new ArrayList<>();

        //Add to our List
        thePuppies.add(pup1);
        thePuppies.add(pup2);
        thePuppies.add(pup3);




    }




    //Mapping for "/List"
    @GetMapping("/list")
    public String listPuppies(Model theModel){


      //Add Puppies to the Model
        theModel.addAttribute("puppies", thePuppies);


        return "list-puppies";
    }


}
