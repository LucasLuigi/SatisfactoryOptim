package com.lucasluigi.satisfactoryoptim;

import java.util.List;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;

public class ProductionChain {
    public ProductionChain(List<ChainItem> itemList) {
        for (ChainItem item : itemList) {
            System.out.println(item);
        }
    }
}
