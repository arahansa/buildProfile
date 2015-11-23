package com.example.controller;



import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * Created by arahansa on 2015-11-05.
 */
@Data
public class TestUser {

	@NotBlank
    private String secId;
    private String passwd;

}
