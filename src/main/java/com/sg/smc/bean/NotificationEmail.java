package com.sg.smc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NotificationEmail {
	private String subject;
    private String recipient;
    private String body;
}
