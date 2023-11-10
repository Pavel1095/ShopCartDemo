package com.shopCartDemo.shopCartDemo.Repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class Cart {

    private List<Long> cartList = new ArrayList<>();

    public void add(Long id) {
        cartList.add(id) ;
    }

    public List<Long> get(){
        return Collections.unmodifiableList(cartList);
    }
}
