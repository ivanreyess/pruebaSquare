package com.sv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeywordTest {

    @Test
    public void initializeKeywordEntity() {
        Keyword keyword = new Keyword();
        keyword.setName("Garden");
        assertEquals("Garden", keyword.getName());
    }

}