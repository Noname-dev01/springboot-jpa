package com.book.springbootjpa.web.dto;

import lombok.Data;


@Data
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
