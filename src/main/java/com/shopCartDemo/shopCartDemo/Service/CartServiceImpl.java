package com.shopCartDemo.shopCartDemo.Service;

import com.shopCartDemo.shopCartDemo.Repository.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Long> items) {

    }

    @Override
    public List<Long> get() {
        return null;
    }
}
