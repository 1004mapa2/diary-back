package com.example.diary.controller;

import com.example.diary.model.FormDto;
import com.example.diary.model.PageDto;
import com.example.diary.model.StatisticsDto;
import com.example.diary.service.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "일기장 API", description = "세부 설명 필요 시 작성")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @Operation(summary = "게시판 리스트 반환")
    @GetMapping("/boardList")
    public ResponseEntity<List<FormDto>> getBoardList() { //객체 바인딩하면 RequestParam 한 것과 동일
        List<FormDto> boardList = boardService.getBoardList();
//        ApiResponse<List<FormDto>> response = new ApiResponse<>(ResponseCode.SUCCESS, boardList);

        return ResponseEntity.ok(boardList);
    }

    @Operation(summary = "글 등록")
    @PostMapping("/register")
    public void register(@RequestBody FormDto formDto) {

        boardService.registerPost(formDto);
    }

    @Operation(summary = "통계 데이터 반환")
    @GetMapping("/statistics")
    public ResponseEntity<StatisticsDto> getStatistics() {
        StatisticsDto statistics = boardService.getStatistics();

        return ResponseEntity.ok(statistics);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable int id) {
        boardService.deletePost(id);
    }
}
