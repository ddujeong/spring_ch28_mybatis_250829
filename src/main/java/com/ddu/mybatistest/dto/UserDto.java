package com.ddu.mybatistest.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private String userid;
	private String username;
	
	private List<OrderDto> orderDto;
}
