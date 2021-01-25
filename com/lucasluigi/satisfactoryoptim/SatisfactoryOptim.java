package com.lucasluigi.satisfactoryoptim;

import java.util.ArrayList;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;
import com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.iron.*;
import com.lucasluigi.satisfactoryoptim.chainitems.transporters.conveyors.*;

public class SatisfactoryOptim {
    public static void main(String[] args) {
        ArrayList<ChainItem> ironChainItemList = new ArrayList<ChainItem>();

        IronMiner ironMinerA = new IronMiner();
        ironChainItemList.add(ironMinerA);

        IronSmelter ironSmelterA = new IronSmelter();
        ironChainItemList.add(ironSmelterA);

        ironChainItemList.add(new ConveyorMk1(ironMinerA, ironSmelterA));

        ProductionChain ironChain = new ProductionChain(ironChainItemList);
    }
}
