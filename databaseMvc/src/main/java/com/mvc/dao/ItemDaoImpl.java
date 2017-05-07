package com.mvc.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.model.Item;

public class ItemDaoImpl implements ItemDao 
{
	 @Autowired  
	 private SessionFactory sessionFactory;  
	  
	 @Transactional  
	 public int insertRow(Item item) {  
	  Session session = sessionFactory.openSession();  
	  Transaction tx = session.beginTransaction();  
	  session.saveOrUpdate(item);  
	  tx.commit();  
	  Serializable id = session.getIdentifier(item);  
	  session.close();  
	  return (Integer) id;  
	 }  
	    
	 public List<Item> getList() {  
	  Session session = sessionFactory.openSession();  
	  @SuppressWarnings("unchecked")  
	  List<Item> itemList = session.createQuery("from Item")  
	   .list();  
	  session.close();  
	  return itemList;  
	 }  
	  
	 public Item getRowById(int id) {  
	  Session session = sessionFactory.openSession();  
	  Item item = (Item) session.load(Item.class, id);  
	  return item;  
	 }  
	  
	 public int updateRow(Item item) {  
	  Session session = sessionFactory.openSession();  
	  Transaction tx = session.beginTransaction();  
	  session.saveOrUpdate(item);  
	  tx.commit();  
	  Serializable id = session.getIdentifier(item);  
	  session.close();  
	  return (Integer) id;  
	 }  
	  
	 public int deleteRow(int id) {  
	  Session session = sessionFactory.openSession();  
	  Transaction tx = session.beginTransaction();  
	  Item item = (Item) session.load(Item.class, id);  
	  session.delete(item);  
	  tx.commit();  
	  Serializable ids = session.getIdentifier(item);  
	  session.close();  
	  return (Integer) ids;  
	 }  
	  
}
