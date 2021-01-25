package com.lucasluigi.satisfactoryoptim.chainitems;

import java.io.Serializable;

public class ChainItem implements Serializable {

    private static final long serialVersionUID = -475190245374612596L;

    protected static Integer itemCounter = 0;

    protected Integer id;
    protected String description;

    protected ChainItem inputChainItem = null;
    protected ChainItem outputChainItem = null;

    protected ChainItem() {

    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 
     * @return id value that must be used for an inherited constructor
     */
    protected static Integer getANewValueForId() {
        ChainItem.itemCounter++;
        return ChainItem.itemCounter - 1;
    }

    public ChainItem getInputChainItem() {
        return inputChainItem;
    }

    public void setInputChainItem(ChainItem inputChainItem) {
        this.inputChainItem = inputChainItem;
    }

    public ChainItem getOutputChainItem() {
        return outputChainItem;
    }

    public void setOutputChainItem(ChainItem outputChainItem) {
        this.outputChainItem = outputChainItem;
    }
}
