package com.ppa.enterprise;

import com.ppa.enterprise.model.Gender;
import com.ppa.enterprise.model.Puppy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.Context;

import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Renders list-puppies.html directly so the empty-directory case can be
 * tested without changing the controller's seed data.
 */
@SpringBootTest
class ListPuppiesTemplateTests {

    private static final String EMPTY_MESSAGE = "No puppies are currently registered.";

    @Autowired
    private ITemplateEngine templateEngine;

    private String render(List<Puppy> puppies) {
        Context context = new Context(Locale.US);
        context.setVariable("puppies", puppies);
        return templateEngine.process("list-puppies", context);
    }

    @Test
    void showsEmptyStateMessageWhenThereAreNoPuppies() {
        String html = render(List.of());

        assertThat(html).contains(EMPTY_MESSAGE);
    }

    @Test
    void hidesEmptyStateMessageWhenPuppiesExist() {
        String html = render(List.of(new Puppy(1, "Petey", "Black", "Yorkie-Poo", Gender.MALE)));

        assertThat(html)
                .contains("Petey")
                .doesNotContain(EMPTY_MESSAGE);
    }

    @Test
    void columnHeadersDeclareTheirScopeForScreenReaders() {
        String html = render(List.of());

        assertThat(html).contains("<th scope=\"col\">Name</th>");
    }
}
