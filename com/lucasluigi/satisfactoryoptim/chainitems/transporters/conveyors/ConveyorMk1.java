package com.lucasluigi.satisfactoryoptim.chainitems.transporters.conveyors;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;
import com.lucasluigi.satisfactoryoptim.chainitems.transporters.Conveyor;

public class ConveyorMk1 extends Conveyor {
    public ConveyorMk1(ChainItem inputChainItem, ChainItem outputChainItem) {
        super(inputChainItem, outputChainItem, 60);
    }
}
