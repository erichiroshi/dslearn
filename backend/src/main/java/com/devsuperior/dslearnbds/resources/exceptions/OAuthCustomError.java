package com.devsuperior.dslearnbds.resources.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OAuthCustomError implements Serializable {
	private static final long serialVersionUID = 1L;

	private String error;

	@JsonProperty("error_description")
	private String errorDescription;

}