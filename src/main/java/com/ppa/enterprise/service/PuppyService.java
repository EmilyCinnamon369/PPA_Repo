package com.ppa.enterprise.service;

import com.ppa.enterprise.model.Puppy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PuppyService {

    private final List<Puppy> puppies = new ArrayList<>();

    public PuppyService() {

        puppies.add(new Puppy(
                1, "Petey", "Black", "Yorkie-Poo", "Male"
        ));

        puppies.add(new Puppy(
                2, "Biggie", "Apricot", "Toy Poodle", "Male"
        ));

        puppies.add(new Puppy(
                3, "Chili", "Red", "Pomeranian", "Female"
        ));
    }

    public List<Puppy> findAll() {

        return List.copyOf(puppies);
    }
}

