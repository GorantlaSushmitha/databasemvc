package com.mvc.services;

import java.util.List;

import com.mvc.model.Item;

public interface ItemService 
{
	public int insertRow(Item item);  
	  
	 public List<Item> getList();  
	  
	 public Item getRowById(int id);  
	  
	 public int updateRow(Item item);  
	  
	 public int deleteRow(int id);  
}
