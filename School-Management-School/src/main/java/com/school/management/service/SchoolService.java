package com.school.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.management.dto.SchoolDto;


public interface SchoolService {

	SchoolDto createSchool(SchoolDto dto);

	List<SchoolDto> getAllSchool();

	void delete(Long id);

	SchoolDto getById(Long id);

}
