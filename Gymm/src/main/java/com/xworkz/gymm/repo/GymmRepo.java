package com.xworkz.gymm.repo;

import java.util.List;

import com.xworkz.gymm.dto.GymmDto;

public interface GymmRepo {

	public boolean save(GymmDto dto);

	public List<GymmDto> readAll();

}
