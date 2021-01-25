package com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;

public class ProductionChainItem extends ChainItem {

    private static final long serialVersionUID = -5678910880719359218L;

    protected Double maxInputPerMinute;
    protected Double maxOutputPerMinute;

    @SuppressWarnings("unused")
    private ProductionChainItem() {
    }

    /**
     * Used for elements with only one output (such as miners)
     * 
     * @param outputPerMinute
     */
    protected ProductionChainItem(Double maxOutputPerMinute) {
        this.id = ChainItem.getANewValueForId();

        // FIXME To set correctly
        this.maxInputPerMinute = maxOutputPerMinute;
        this.maxOutputPerMinute = maxOutputPerMinute;
    }

    /**
     * Used for 1 input - 1 output elements
     * 
     * @param inputPerMinute
     * @param outputPerMinute
     */
    protected ProductionChainItem(Double maxInputPerMinute, Double maxOutputPerMinute) {
        this.id = ChainItem.getANewValueForId();

        this.maxInputPerMinute = maxInputPerMinute;
        this.maxOutputPerMinute = maxOutputPerMinute;
    }

    public Double getMaxInputPerMinute() {
        return this.maxInputPerMinute;
    }

    public Double getMaxOutputPerMinute() {
        return this.maxOutputPerMinute;
    }

    public ChainItem geInputChainItem() {
        return inputChainItem;
    }

    public String toString() {
        return "Prod#" + this.id + " - " + this.description + ":\n  maxInputPerMinute=" + this.maxInputPerMinute
                + "\n  maxOutputPerMinute=" + this.maxOutputPerMinute + "\n";
    }
}
