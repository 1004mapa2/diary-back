package com.example.diary.service;

import com.example.diary.model.FormDto;
import com.example.diary.model.PageDto;
import com.example.diary.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void saveBoardContent(FormDto formDto) {

        boardMapper.saveBoardContent(formDto);
    }

    public List<FormDto> getBoardList(PageDto pageDto) {
        //한 페이지 표시 값 설정
        pageDto.setCount(10);
        pageDto.setPage(pageDto.getPage() - 1);

        return boardMapper.getBoardList(pageDto);
    }
}
