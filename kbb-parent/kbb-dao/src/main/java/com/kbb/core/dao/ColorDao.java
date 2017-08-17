package com.kbb.core.dao;

import java.util.List;

import com.kbb.core.pojo.Color;

public interface ColorDao {
	/**
	 * TODO 查看所有颜色
	 * @return
	 */
	public List<Color> findAll();
}
