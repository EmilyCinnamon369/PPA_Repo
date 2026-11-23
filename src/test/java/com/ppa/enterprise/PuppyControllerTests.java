package com.ppa.enterprise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Integration tests for the puppy directory endpoint (Functional Requirement #1).
 */
@SpringBootTest
@AutoConfigureMockMvc
class PuppyControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void listReturnsDirectoryViewWithAllPuppies() throws Exception {
        mockMvc.perform(get("/Puppies/list"))
                .andExpect(status().isOk())
                .andExpect(view().name("list-puppies"))
                .andExpect(model().attribute("puppies", hasSize(3)));
    }

    @Test
    void listRendersEachPuppyInTheTable() throws Exception {
        mockMvc.perform(get("/Puppies/list"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Petey")))
                .andExpect(content().string(containsString("Toy Poodle")))
                .andExpect(content().string(containsString("Pomeranian")));
    }

    @Test
    void listShowsReadableGenderLabelsInsteadOfEnumConstants() throws Exception {
        mockMvc.perform(get("/Puppies/list"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(">Male<")))
                .andExpect(content().string(containsString(">Female<")))
                .andExpect(content().string(not(containsString("FEMALE"))));
    }
}
