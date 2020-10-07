package com.andersen.aws.awesome.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.andersen.aws.awesome.dao.AwesomeRepository;
import com.andersen.aws.awesome.dto.AwesomeDTO;
import com.andersen.aws.awesome.entitiy.AwesomeEntity;
import com.andersen.aws.awesome.mapper.AwesomeMapper;
import com.andersen.aws.awesome.service.AwesomeService;

@Service
public class AwesomeServiceImpl implements AwesomeService {
	private final AwesomeRepository awesomeRepository;
	private final AwesomeMapper awesomeMapper;

	public AwesomeServiceImpl(final AwesomeRepository pAwesomeRepository, final AwesomeMapper pAwesomeMapper) {
		this.awesomeRepository = pAwesomeRepository;
		this.awesomeMapper = pAwesomeMapper;
	}

	@Override
	public AwesomeDTO save(final AwesomeDTO pAwesomeDTO) {
		AwesomeDTO result = null;

		final AwesomeEntity toBePersistedAwesomeEntity = this.awesomeMapper.toEntity(pAwesomeDTO);
		final AwesomeEntity persistedAwesomeEntity = this.awesomeRepository.save(toBePersistedAwesomeEntity);
		result = this.awesomeMapper.toDTO(persistedAwesomeEntity);

		return result;
	}

	@Override
	public List<AwesomeDTO> findAll() {
		List<AwesomeDTO> result = new ArrayList<>();

		final List<AwesomeEntity> awesomeEntities = this.awesomeRepository.findAll();
		final List<AwesomeDTO> awesomeDTOs = this.awesomeMapper.toDTO(awesomeEntities);
		result.addAll(awesomeDTOs);

		return result;
	}

}
