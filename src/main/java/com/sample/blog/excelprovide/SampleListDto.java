package com.sample.blog.excelprovide;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SampleListDto<T1, T2> {
    private Page<BoardDto> boardList;
    private List<ExcelDto> excelList;

    public SampleListDto(Page<BoardDto> boardList, List<ExcelDto> excelList) {
        this.boardList = boardList;
        this.excelList = excelList;
    }
}


