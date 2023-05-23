package com.sv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    private Tree<Category> categoryTree = new Tree<>();

    @Test
    void add() {
        Tree<Category> categoryTree = new Tree<>();

        Keyword keyword1 = Keyword.builder().name("Lawn").build();
        Keyword keyword2 = Keyword.builder().name("Garden").build();

        Category category = Category.builder()
                .name("Lawn & Garden ")
                .keywords(List.of(keyword1, keyword2))
                .build();

        assertNull(categoryTree.root);
        assertDoesNotThrow(() -> categoryTree.add(category));
        assertNotNull(categoryTree);

    }

    @Test
    void search() {
        Tree<Category> categoryTree = new Tree<>();

        Keyword keyword1 = Keyword.builder().name("Lawn").build();
        Keyword keyword2 = Keyword.builder().name("Garden").build();

        Category category = Category.builder()
                .name("Lawn & Garden ")
                .keywords(List.of(keyword1, keyword2))
                .build();


        assertDoesNotThrow(()-> categoryTree.contains(category));

        boolean result = categoryTree.contains(category);
        assertFalse(result);

    }

}