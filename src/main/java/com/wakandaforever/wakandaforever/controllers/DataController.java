package com.wakandaforever.wakandaforever.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wakandaforever.wakandaforever.dtos.DataDto;
import com.wakandaforever.wakandaforever.models.Data;
import com.wakandaforever.wakandaforever.services.data.DataService;

@RestController
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	private DataService dataService;
		
	private ModelMapper modelMapper = new ModelMapper();
	
	@PostMapping("/save")
	public ResponseEntity<DataDto> saveData(@RequestBody DataDto dataDto) {
		System.out.println("Called saveData");
		if(dataDto == null) {
			System.out.println("dto is null, returning BAD_REQUEST");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Data newData = dataService.save(dataDto);
		DataDto newDto = modelMapper.map(newData, DataDto.class);
		return new ResponseEntity<>(newDto, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://80.240.21.133:7777")
	@GetMapping("/all")
	public ResponseEntity<List<DataDto>> getAllData() {
		System.out.println("Called getAllData");
		List<DataDto> dataList = new ArrayList<>();
		dataService.findAll().forEach(data -> {
			dataList.add(modelMapper.map(data, DataDto.class));
		});
		
		return new ResponseEntity<>(dataList, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://80.240.21.133:7777")
	@GetMapping("/all/{id}")
	public ResponseEntity<DataDto> getDataById(@PathVariable Long id) {		
		System.out.println("Called getDataById");
		if(id == null) {
			System.out.println("Id is null, returning BAD_REQUEST" + id);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Data data = dataService.findById(id);		
		if(data == null) {
			System.out.println("Could not found entity with id = " + id);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<DataDto>(modelMapper.map(data, DataDto.class), HttpStatus.OK);
	}

}
