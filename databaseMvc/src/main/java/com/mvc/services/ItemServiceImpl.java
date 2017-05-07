package com.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.dao.ItemDao;
import com.mvc.model.Item;

public class ItemServiceImpl implements ItemService {


	 @Autowired  
	 private ItemDao itemDao;  
	  
	 public int insertRow(Item item) {  
	  return itemDao.insertRow(item);  
	 }  
	  
	 public List<Item> getList() {  
	  return itemDao.getList();  
	 }  
	  
	 public Item getId(int id) {  
	  return itemDao.getRowById(id);  
	 }  
	  
	 public int update(Item item) {  
	  return itemDao.updateRow(item);  
	 }  
	  
	  
	 public int deleteRow(int id) {  
	  return itemDao.deleteRow(id);  
	 }

	public Item getRowById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateRow(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
