package com.test.producto.dao;

import com.test.producto.dto.Product;

public interface ProductoDAO {

	public void create(Product product);
	
	public Product read(int id);
	
	public void update(Product product);
	
	public void delete(int id);
	
}//Close interface ProductoDAO.
