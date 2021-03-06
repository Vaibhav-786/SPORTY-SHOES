package com.simplilearn.springmvcsportyshoes.dao;

import com.simplilearn.springmvcsportyshoes.entity.Product;
import com.simplilearn.springmvcsportyshoes.model.PaginationResult;
import com.simplilearn.springmvcsportyshoes.model.ProductInfo;
 
public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}