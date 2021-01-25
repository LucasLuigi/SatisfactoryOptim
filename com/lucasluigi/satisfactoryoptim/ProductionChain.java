package com.lucasluigi.satisfactoryoptim;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;
import com.lucasluigi.satisfactoryoptim.chainitems.ChainItemsDescription;

public class ProductionChain {
    public ProductionChain(ChainItemsDescription itemList) {
        Integer itemCounter = 1;
        ChainItem chainItemIterator;

        System.out.println(itemList);

        ChainItem sourceChainItem = itemList.getSourceChainItem();

        System.out.println("ChainItemsDescription ordered list:");
        chainItemIterator = sourceChainItem;
        while (chainItemIterator != null) {
            System.out.println(itemCounter + ") " + chainItemIterator.toString());
            itemCounter++;
            chainItemIterator = chainItemIterator.getOutputChainItem();
        }
    }
}
