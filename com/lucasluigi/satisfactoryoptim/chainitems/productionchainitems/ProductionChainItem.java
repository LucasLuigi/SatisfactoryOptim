package com.lucasluigi.satisfactoryoptim.chainitems.productionchainitems;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;

public class ProductionChainItem extends ChainItem {
    public Integer inputPerMinute;
    public Integer outputPerMinute;

    @SuppressWarnings("unused")
    private ProductionChainItem() {
    }

    /**
     * Used for elements with only one output (such as miners)
     * 
     * @param outputPerMinute
     */
    protected ProductionChainItem(Integer outputPerMinute) {
        // FIXME To set correctly
        this.inputPerMinute = outputPerMinute;
        this.outputPerMinute = outputPerMinute;
    }

    /**
     * Used for 1 input - 1 output elements
     * 
     * @param inputPerMinute
     * @param outputPerMinute
     */
    protected ProductionChainItem(Integer inputPerMinute, Integer outputPerMinute) {
        this.inputPerMinute = inputPerMinute;
        this.outputPerMinute = outputPerMinute;
    }

    public Integer getInputPerMinute() {
        return this.inputPerMinute;
    }

    public Integer getOutputPerMinute() {
        return this.outputPerMinute;
    }

    public String toString() {
        return "Prod:\n  inputPerMinute=" + this.inputPerMinute + "\n  outputPerMinute=" + this.outputPerMinute + "\n";
    }

}
