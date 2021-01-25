package com.lucasluigi.satisfactoryoptim.chainitems.transporters.conveyors;

import com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.ProductionChainItem;
import com.lucasluigi.satisfactoryoptim.chainitems.transporters.Conveyor;

public class ConveyorMk1 extends Conveyor {

    private static final long serialVersionUID = 8042947548534964691L;

    public ConveyorMk1(ProductionChainItem inputChainItem, ProductionChainItem outputChainItem) {
        super(inputChainItem, outputChainItem, 60.0);
        this.description = "ConvMk1";
    }
}
