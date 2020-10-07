package com.andersen.aws.awesome.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.andersen.aws.awesome.dto.AwesomeDTO;
import com.andersen.aws.awesome.entitiy.AwesomeEntity;
import com.andersen.aws.awesome.mapper.AwesomeMapper;

@Component
public class AwesomeMapperImpl implements AwesomeMapper {

	@Override
	public AwesomeDTO toDTO(final AwesomeEntity pAwesomeEntity) {
		final AwesomeDTO result = new AwesomeDTO();

		if (pAwesomeEntity != null) {
			result.setData(pAwesomeEntity.getData());
		}

		return result;
	}

	@Override
	public List<AwesomeDTO> toDTO(List<AwesomeEntity> pAwesomeEntities) {
		final List<AwesomeDTO> result = new ArrayList<>();

		if (pAwesomeEntities != null && !pAwesomeEntities.isEmpty()) {
			for (final AwesomeEntity awesomeEntity : pAwesomeEntities) {
				if (awesomeEntity != null) {
					result.add(toDTO(awesomeEntity));
				}
			}
		}

		return result;
	}

	@Override
	public AwesomeEntity toEntity(final AwesomeDTO pPhraseDTO) {
		final AwesomeEntity result = new AwesomeEntity();

		result.setData(pPhraseDTO.getData());

		return result;
	}

}
