package com.andersen.aws.awesome.mapper;

import java.util.List;

import com.andersen.aws.awesome.dto.AwesomeDTO;
import com.andersen.aws.awesome.entitiy.AwesomeEntity;

public interface AwesomeMapper {
	AwesomeDTO toDTO(AwesomeEntity awesomeEntity);

	List<AwesomeDTO> toDTO(List<AwesomeEntity> awesomeEntities);

	AwesomeEntity toEntity(AwesomeDTO awesomeDTO);
}
