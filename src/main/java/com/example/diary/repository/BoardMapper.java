package com.example.diary.repository;

import com.example.diary.model.FormDto;
import com.example.diary.model.PageDto;
import com.example.diary.model.StatisticsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    void registerPost(FormDto formDto);

    List<FormDto> getBoardList();

    StatisticsDto getStatistics();

    void deletePost(int id);
}
