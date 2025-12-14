package com.example.diary.service;

import com.example.diary.model.FormDto;
import com.example.diary.model.PageDto;
import com.example.diary.model.StatisticsDto;
import com.example.diary.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void registerPost(FormDto formDto) {

        boardMapper.registerPost(formDto);
    }

    public List<FormDto> getBoardList() {
        //한 페이지 표시 값 설정
//        pageDto.setCount(10);
//        if(pageDto.getPage() == 0) {
//            pageDto.setPage(1);
//        }
//        pageDto.setPage(pageDto.getPage() - 1);

        return boardMapper.getBoardList();
    }

    public StatisticsDto getStatistics() {

        return boardMapper.getStatistics();
    }

    public void deletePost(int id) {
        boardMapper.deletePost(id);
    }
}
