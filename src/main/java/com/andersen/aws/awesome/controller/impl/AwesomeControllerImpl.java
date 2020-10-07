package com.andersen.aws.awesome.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.andersen.aws.awesome.controller.AwesomeController;
import com.andersen.aws.awesome.dto.AwesomeDTO;
import com.andersen.aws.awesome.service.impl.AwesomeServiceImpl;

@RestController
public class AwesomeControllerImpl implements AwesomeController {
	private static final String BASE_VERSION = "/v1";
	private static final String AWESOMES_ENDPOINT = BASE_VERSION + "/awesomes";

	private final AwesomeServiceImpl awesomeService;

	public AwesomeControllerImpl(final AwesomeServiceImpl pAwesomeService) {
		this.awesomeService = pAwesomeService;
	}

	@Override
	@PostMapping(path = AWESOMES_ENDPOINT)
	public String save(final @RequestBody @Valid AwesomeDTO pAwesomeDTO) {
		final AwesomeDTO awesomeDTO = this.awesomeService.save(pAwesomeDTO);
		return awesomeDTO.getData();
	}

	@Override
	@GetMapping(path = AWESOMES_ENDPOINT)
	public List<AwesomeDTO> findAll() {
		return this.awesomeService.findAll();
	}

}
