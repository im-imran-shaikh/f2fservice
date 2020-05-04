package com.tat.f2fservice.ExceptionHandle;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionResponse
{
	private Date timeStemp;
	private String message;
	private String description;
}
