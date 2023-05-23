package com.sv;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    private String name;

    private List<Keyword> keywords;

}
