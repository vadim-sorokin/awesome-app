package com.andersen.aws.awesome.dto;

import javax.validation.constraints.NotBlank;

public class AwesomeDTO {
	@NotBlank
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
