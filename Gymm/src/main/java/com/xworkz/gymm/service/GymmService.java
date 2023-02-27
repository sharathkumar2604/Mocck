
package com.xworkz.gymm.service;

import java.util.List;

import com.xworkz.gymm.dto.GymmDto;


public interface GymmService {

	public boolean save(GymmDto dto);

	public List<GymmDto> readAll();

}
