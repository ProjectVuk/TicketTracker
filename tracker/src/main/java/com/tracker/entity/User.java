package com.tracker.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userType;
}
