package com.sw.spring.web.service.list;

import com.sw.spring.web.domain.list.MyList;
import com.sw.spring.web.dto.ListResponseDto;
import com.sw.spring.web.dto.ListsAllResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sw.spring.web.domain.list.ListRepository;
import com.sw.spring.web.dto.ListSaveRequestDto;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Service
public class ListService {
	@Autowired
	private ListRepository listRepository;

	@Transactional
	public Long save(ListSaveRequestDto requestDto) {
		return listRepository.save(requestDto.ToEntity()).getId();
	}

	@Transactional(readOnly = true)
	public List<ListsAllResponseDto> findAllDesc() {
		return listRepository.findAllDesc().stream()
				.map(ListsAllResponseDto::new)
				.collect(Collectors.toList());
	}
}
