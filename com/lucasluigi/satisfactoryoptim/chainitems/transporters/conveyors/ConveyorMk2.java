package com.lucasluigi.satisfactoryoptim.chainitems.transporters.conveyors;

import com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.ProductionChainItem;
import com.lucasluigi.satisfactoryoptim.chainitems.transporters.Conveyor;

public class ConveyorMk2 extends Conveyor {

    private static final long serialVersionUID = -8406089818717402070L;

    public ConveyorMk2(ProductionChainItem inputChainItem, ProductionChainItem outputChainItem) {
        super(inputChainItem, outputChainItem, 120.0);
        this.description = "ConvMk2";
    }
}
