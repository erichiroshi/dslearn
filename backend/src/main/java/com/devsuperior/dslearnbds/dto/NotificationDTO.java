package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.devsuperior.dslearnbds.entities.Notification;

import lombok.Data;

@Data
public class NotificationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private LocalDateTime moment;
	private boolean read;
	private String route;
	private Long userId;

	public NotificationDTO(Notification entity) {
		id = entity.getId();
		text = entity.getText();
		moment = entity.getMoment();
		read = entity.isRead();
		route = entity.getRoute();
		userId = entity.getUser().getId();
	}

}