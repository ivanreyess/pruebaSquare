package com.sv;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Tree<Category> categories = new Tree<>();
        Keyword keyword1 = Keyword.builder().name("Lawn").build();
        Keyword keyword2 = Keyword.builder().name("Garden").build();


        Category category1 = Category.builder()
                .name("Lawn & Garden")
                .keywords(List.of(keyword1, keyword2))
                .build();

        Category category2 = Category.builder()
                .name("Cars")
                .keywords(List.of(keyword1, keyword2))
                .build();

        Category category3 = Category.builder()
                .name("Dogs")
                .keywords(List.of(keyword1, keyword2))
                .build();


        categories.add(category1);
        categories.add(category2);
        categories.add(category3);

        System.out.println(categories);

        boolean result = categories.contains(category1);

        System.out.println(result);


    }
}