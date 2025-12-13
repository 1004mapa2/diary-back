package com.example.diary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class PageDto {

    private int page;

    @JsonIgnore
    private int count;
}
