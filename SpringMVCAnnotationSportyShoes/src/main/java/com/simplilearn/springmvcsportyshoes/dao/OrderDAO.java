package com.simplilearn.springmvcsportyshoes.dao;

import java.util.List;

import com.simplilearn.springmvcsportyshoes.model.CartInfo;
import com.simplilearn.springmvcsportyshoes.model.OrderDetailInfo;
import com.simplilearn.springmvcsportyshoes.model.OrderInfo;
import com.simplilearn.springmvcsportyshoes.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
