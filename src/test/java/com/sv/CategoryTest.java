package com.sv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    public void initializeCategory() {

        Keyword keyword1 = Keyword.builder().name("Lawn").build();
        Keyword keyword2 = Keyword.builder().name("Garden").build();

        Category category = Category.builder()
                .name("Lawn & Garden ")
                .keywords(List.of(keyword1, keyword2))
                .build();

        assertNotNull(category);

        assertEquals(2, category.getKeywords().size());
    }

}