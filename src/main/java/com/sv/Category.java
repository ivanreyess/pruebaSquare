package com.sv;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Category implements Comparable<Category> {

    private String name;

    private List<Keyword> keywords;


    @Override
    public int compareTo(Category o) {
        return  o.getName().compareTo(this.getName());
    }
}
