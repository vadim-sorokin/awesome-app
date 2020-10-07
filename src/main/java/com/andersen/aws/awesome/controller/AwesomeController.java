package com.andersen.aws.awesome.controller;

import java.util.List;

import com.andersen.aws.awesome.dto.AwesomeDTO;

public interface AwesomeController {
	String save(AwesomeDTO awesomeDTO);

	List<AwesomeDTO> findAll();
}
