package com.school.management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.dto.SchoolDto;
import com.school.management.entity.School;
import com.school.management.exception.UserNotFoundException;
import com.school.management.repo.SchoolRepo;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	SchoolRepo schoolRepo;
	
	@Override
	public SchoolDto createSchool(SchoolDto dto) {
		School school = this.schoolRepo.save(this.dtoToEntity(dto));
		return this.entityToDto(school);
	}
	
	@Override
	public List<SchoolDto> getAllSchool() {
		return this.entityListToDtoList(this.schoolRepo.findAll());
	}
	
	@Override
	public void delete(Long id) {
		if(this.schoolRepo.findById(id).isEmpty()) {
			throw new UserNotFoundException();
		}
		this.schoolRepo.deleteById(id);
		
	}
	
	@Override
	public SchoolDto getById(Long id) {
		Optional<School> schoolContainer = this.schoolRepo.findById(id);
		if(schoolContainer.isEmpty()) {
			throw new UserNotFoundException();
		}
		return this.entityToDto(this.schoolRepo.findById(id).get());
	}
	
	private SchoolDto entityToDto(School school) {
		SchoolDto schoolDto= new SchoolDto();
		schoolDto.setId(Objects.isNull(school.getId()) ? null:  school.getId());
		schoolDto.setName(StringUtils.isEmpty(school.getName()) ? null : school.getName());
		schoolDto.setAddress(StringUtils.isEmpty(school.getAddress()) ? null : school.getAddress());
		return schoolDto;
	}
	
	private School dtoToEntity(SchoolDto dto) {
		School school= new School();
		school.setId(Objects.isNull(dto.getId()) ? null:  dto.getId());
		school.setName(StringUtils.isEmpty(dto.getName()) ? null : dto.getName());
		school.setAddress(StringUtils.isEmpty(dto.getAddress()) ? null : dto.getAddress());
		return school;
	}

	private List<SchoolDto> entityListToDtoList(List<School> schoolList){
		List<SchoolDto> schoolDtoList = new ArrayList<>();
		schoolList.stream().forEach(x ->{
			schoolDtoList.add(this.entityToDto(x));
		});
		return schoolDtoList;
	}
	
	private List<School> dtoListToEntityList(List<SchoolDto> schoolDtoList){
		List<School> schoolList = new ArrayList<>();
		schoolDtoList.stream().forEach(x->{
			schoolList.add(this.dtoToEntity(x));
		});
		return schoolList;
	}

}
