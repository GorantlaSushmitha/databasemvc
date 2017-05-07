package com.mvc.controllers;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  
  
import com.mvc.model.Item;
import com.mvc.services.ItemService;  
  
  
@Controller  
public class DataController {  
  
 @Autowired  
 private ItemService itemService;  
  
 @RequestMapping("form")  
 public ModelAndView getForm(@ModelAttribute Item item) 
 {  
  return new ModelAndView("form");  
 }  
  
 @RequestMapping("register")  
 public ModelAndView registerUser(@ModelAttribute Item item) 
 {  
  itemService.insertRow(item);  
  return new ModelAndView("redirect:list");  
 }  
  
 @RequestMapping("list")  
 public ModelAndView getList() 
 {  
  List itemList = itemService.getList();  
  return new ModelAndView("list", "itemList", itemList);  
 }  
  
 @RequestMapping("delete")  
 public ModelAndView deleteUser(@RequestParam int id) 
 {  
  itemService.deleteRow(id);  
  return new ModelAndView("redirect:list");  
 }  
  
 @RequestMapping("edit")  
 public ModelAndView editUser(@RequestParam int id,  
   @ModelAttribute Item employee) {  
  Item itemObject = itemService.getRowById(id);  
  return new ModelAndView("edit", "employeeObject", itemObject);  
 }  
  
 @RequestMapping("update")  
 public ModelAndView updateUser(@ModelAttribute Item item) 
 {  
  itemService.updateRow(item);  
  return new ModelAndView("redirect:list");  
 }  
  
}  