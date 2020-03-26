package com.sw.spring.web.dto;

import com.sw.spring.web.domain.list.MyList;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ListSaveRequestDto {
	private String content;
	
	@Builder
	public ListSaveRequestDto (String content) {
		this.content = content;
	}
	
	public MyList ToEntity() {
		return MyList.builder().content(content).build();
	}
}
