package com.sw.spring.web.dto;

import com.sw.spring.web.domain.list.MyList;
import lombok.Getter;

@Getter
public class ListResponseDto {
    private Long id;
    private String content;

    public ListResponseDto (MyList entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
    }
}
