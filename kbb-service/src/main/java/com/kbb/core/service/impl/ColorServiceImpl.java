package com.kbb.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbb.core.dao.ColorDao;
import com.kbb.core.pojo.Color;
import com.kbb.core.service.ColorService;

@Service("colorService")
public class ColorServiceImpl implements ColorService{
	@Autowired
	private ColorDao colorDao;
	
	
	@Override
	public List<Color> findAll() {
		// TODO Auto-generated method stub
		return colorDao.findAll();
	}
	
}
