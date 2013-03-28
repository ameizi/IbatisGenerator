package com.ibatis.generator.service.impl;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibatis.generator.model.Product;
import com.ibatis.generator.model.ProductCriteria;
import com.ibatis.generator.service.GeneratorProductService;

public class ProductServiceImplTest {
	
	@Test
	public void listAll(){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		GeneratorProductService productService=applicationContext.getBean("generatorProductService",GeneratorProductService.class);
		ProductCriteria criteria=new ProductCriteria();
		List<Product> lists=productService.selectByExample(criteria);
		for (Product product : lists) {
			System.out.println(product.getName()+"\t"+product.getDescription()+"\t"+product.getCategoryid());
		}
	}
	
	@Test
	public void save(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		GeneratorProductService productService=applicationContext.getBean("generatorProductService",GeneratorProductService.class);
		Product product=new Product();
		product.setName("Surface平板电脑");
		product.setPrice(4680.f);
		product.setDescription("Surface平板电脑");
		product.setCategoryid(2);
		
		productService.insertSelective(product);
		
		listAll();
		
	}
	
	
	@Test
	public void update(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		GeneratorProductService productService=applicationContext.getBean("generatorProductService",GeneratorProductService.class);
		Product product = productService.selectByPrimaryKey(4);
		product.setName("SONY手机");
		product.setDescription("SONY手机,手机中的战斗机!");
		productService.updateByPrimaryKey(product);
		
		listAll();
		
	}
	
	
}
