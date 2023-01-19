package com.school.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.dto.Response;
import com.school.management.dto.SchoolDto;
import com.school.management.service.SchoolService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("school")
public class SchoolController {

	@Autowired
	SchoolService schoolService;
	
	@PostMapping("create")
	@ApiOperation(value = "checkDevice", response = Response.class)
	public ResponseEntity<Response> createSchool(@RequestBody SchoolDto dto){
		log.info("[SchoolController] Inside createSchool Method {}",dto);
		Response response = new Response();
		response.succeed();
		response.setData(this.schoolService.createSchool(dto));
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("getAllSchool")
	@ApiOperation(value = "getAllSchool", response = Response.class)
	public ResponseEntity<Response> getAllSchool(){
		log.info("[SchoolController] Inside getAllSchool Method {}");
		Response response = new Response();
		response.succeed();
		response.setData(this.schoolService.getAllSchool());
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("getById")
	@ApiOperation(value = "getById", response = Response.class)
	public ResponseEntity<Response> getById(@RequestParam Long id){
		log.info("[SchoolController] Inside getById Method {}");
		Response response = new Response();
		response.succeed();
		response.setData(this.schoolService.getById(id));
		return ResponseEntity.ok().body(response);
	}
	
	@DeleteMapping("delete")
	@ApiOperation(value = "delete", response = Response.class)
	public ResponseEntity<Response> delete(@RequestParam Long id){
		log.info("[SchoolController] Inside delete Method {}",id);
		Response response = new Response();
		response.succeed();
		this.schoolService.delete(id);
		return ResponseEntity.ok().body(response);
	}
}
