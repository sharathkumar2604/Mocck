package com.xworkz.gymm.service;

import java.util.List;

import com.xworkz.gymm.dto.GymmDto;
import com.xworkz.gymm.repo.GymmRepo;
import com.xworkz.gymm.repo.GymmRepoImpl;

public class GymmServiceImpl implements GymmService {

	GymmRepo repo = new GymmRepoImpl();
	@Override
	public boolean save(GymmDto dto) {
		if(dto!=null)
		{
			System.out.println("valid dto");
			return repo.save(dto);
		}
		
		return false;
	}

	@Override
	public List<GymmDto> readAll() {
		
		
		return repo.readAll();
	}

}
