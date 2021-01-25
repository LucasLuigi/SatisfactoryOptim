package com.lucasluigi.satisfactoryoptim;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItemsDescription;
import com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.iron.*;
import com.lucasluigi.satisfactoryoptim.chainitems.transporters.conveyors.*;

public class SatisfactoryOptim {

    private static ChainItemsDescription createChain1() {
        ChainItemsDescription ironChainItemList = new ChainItemsDescription();

        IronMiner ironMinerA = new IronMiner();
        ironChainItemList.add(ironMinerA);

        // Iron source of the chain
        ironChainItemList.setSourceChainItem(ironMinerA);

        IronSmelter ironSmelterA = new IronSmelter();
        ironChainItemList.add(ironSmelterA);

        ironChainItemList.add(new ConveyorMk1(ironMinerA, ironSmelterA));

        return ironChainItemList;
    }

    public static void main(String[] args) {
        ChainItemsDescription ironChainItemList = createChain1();
        ProductionChain ironChain = new ProductionChain(ironChainItemList);
    }
}
