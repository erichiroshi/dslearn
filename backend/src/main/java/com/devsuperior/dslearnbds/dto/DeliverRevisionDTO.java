package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

import lombok.Data;

@Data
public class DeliverRevisionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;

}