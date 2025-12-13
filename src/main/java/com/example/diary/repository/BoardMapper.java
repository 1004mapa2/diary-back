package com.example.diary.repository;

import com.example.diary.model.FormDto;
import com.example.diary.model.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    void saveBoardContent(FormDto formDto);

    List<FormDto> getBoardList(PageDto pageDto);
}
