package com.lucasluigi.satisfactoryoptim.chainitems.transporters;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;
import com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems.ProductionChainItem;

public class Conveyor extends ChainItem {

    private static final long serialVersionUID = 6389801430652630003L;

    protected Double maxTransportSpeed;

    @SuppressWarnings("unused")
    private Conveyor() {

    }

    protected Conveyor(ProductionChainItem inputChainItem, ProductionChainItem outputChainItem,
            Double maxTransportSpeed) {

        this.id = ChainItem.getANewValueForId();
        this.maxTransportSpeed = maxTransportSpeed;

        this.inputChainItem = inputChainItem;
        // Link the inputChainItem with myself
        if (inputChainItem != null) {
            inputChainItem.setOutputChainItem(this);
        }

        this.outputChainItem = outputChainItem;
        // Link the outputChainItem with myself
        if (outputChainItem != null) {
            outputChainItem.setInputChainItem(this);
        }

    }

    public Double getMaxTransportSpeed() {
        return this.maxTransportSpeed;
    }

    public String toString() {
        return "Conv#" + this.id + " - " + this.description + "\n  In: inputChainItem#" + this.inputChainItem.getId()
                + " - " + this.inputChainItem.getDescription() + "\n  Out: outputChainItem#"
                + this.outputChainItem.getId() + " - " + this.outputChainItem.getDescription() + "\n";
    }
}
