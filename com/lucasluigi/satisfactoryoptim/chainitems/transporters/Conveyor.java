package com.lucasluigi.satisfactoryoptim.chainitems.transporters;

import com.lucasluigi.satisfactoryoptim.chainitems.ChainItem;

public class Conveyor extends ChainItem {
    public Integer transportSpeed;
    public ChainItem inputChainItem;
    public ChainItem outputChainItem;

    @SuppressWarnings("unused")
    private Conveyor() {
    }

    /**
     * 
     * @param transportSpeed
     */
    protected Conveyor(ChainItem inputChainItem, ChainItem outputChainItem, Integer transportSpeed) {
        this.inputChainItem = inputChainItem;
        this.outputChainItem = outputChainItem;
        this.transportSpeed = transportSpeed;
    }

    public Integer getTransportSpeed() {
        return this.transportSpeed;
    }

    public ChainItem getInputChainItem() {
        return this.inputChainItem;
    }

    public ChainItem getOutputChainItem() {
        return this.outputChainItem;
    }

    public String toString() {
        return "Conveyor:\n  transportSpeed=" + this.transportSpeed + "\n  inputChainItem=" + this.inputChainItem
                + "\n  outputChainItem=" + this.outputChainItem + "\n";
    }

}
