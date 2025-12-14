package com.example.diary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class FormDto {
    private int id;
    private String title;
    private String content;

    // 입력 시에 필요없는 컬럼이므로 해당 어노테이션 추가
    @JsonIgnore
    private String createdAt;

}
