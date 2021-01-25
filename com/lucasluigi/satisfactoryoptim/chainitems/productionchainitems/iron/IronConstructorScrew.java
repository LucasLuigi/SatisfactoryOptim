package com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.iron;

import com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.ProductionChainItem;

public class IronConstructorScrew extends ProductionChainItem {

    private static final long serialVersionUID = -6822899042817197583L;

    public IronConstructorScrew() {
        super(10.0, 40.0);
        this.description = "IronConstructorScrew";
    }
}
