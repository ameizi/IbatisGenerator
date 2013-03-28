package com.ibatis.service.impl;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibatis.model.Product;
import com.ibatis.service.ProductService;

public class ProductServiceImplTest {
	
	@Test
	public void listAll(){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService=applicationContext.getBean("productServiceImpl",ProductService.class);
		List<Product> lists=productService.listAll();
		for (Product product : lists) {
			System.out.println(product.getName()+"\t"+product.getDescription()+"\t"+product.getCategoryid());
		}
	}
	
	@Test
	public void save(){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService=applicationContext.getBean("productServiceImpl",ProductService.class);
		Product product=new Product();
		product.setName("ipad4");
		product.setPrice(3000.f);
		product.setDescription("ipad4");
		product.setCategoryid("2");
		boolean b=productService.save(product);
		System.out.println(b);
		
	}
	
	
	@Test
	public void update(){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService=applicationContext.getBean("productServiceImpl",ProductService.class);
		Product product=productService.getModel(3);
		product.setName("´÷¶û");
		product.setDescription("´÷¶û±Ê¼Ç±¾");
		boolean b=productService.update(product);
		System.out.println(b);
		
	}
	
}
