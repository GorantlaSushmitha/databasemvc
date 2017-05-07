package com.mvc.dao;

import java.util.List;

import com.mvc.model.Item;

public interface ItemDao 
{

	int insertRow(Item item);

	List<Item> getList();

	Item getRowById(int id);

	int updateRow(Item item);

	int deleteRow(int id);

}
