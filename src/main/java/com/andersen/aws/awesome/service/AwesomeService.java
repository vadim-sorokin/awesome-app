package com.andersen.aws.awesome.service;

import java.util.List;

import com.andersen.aws.awesome.dto.AwesomeDTO;

public interface AwesomeService {
	AwesomeDTO save(AwesomeDTO awesomeDTO);

	List<AwesomeDTO> findAll();
}
