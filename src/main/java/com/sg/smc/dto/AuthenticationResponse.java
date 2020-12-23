package com.sg.smc.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthenticationResponse {
	private String authenticationToken;
    private String refreshToken;
    private Instant expiresAt;
    private String username;
}
