package com.model2.mvc.service.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductDao;
import com.model2.mvc.service.product.ProductService;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {
	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;
	
	@Override
	public int insertProduct(Product product) {
		return productDao.insertProduct(product);
	}

	@Override
	public Product getProduct(int prodNo) {
		return productDao.getProduct(prodNo);
	}

	@Override
	public int updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

	@Override
	public int deleteProduct(int prodNo) {
		return productDao.deleteProduct(prodNo);
	}

	@Override
	public List<Product> getProductList(Search search) {
		return productDao.getProductList(search);
	}

	@Override
	public int makeTotalCount(Search search) {
		return productDao.makeTotalCount(search);
	}

}
