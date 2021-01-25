package com.lucasluigi.satisfactoryoptim.chainitems;

import java.util.ArrayList;

public class ChainItemsDescription extends ArrayList<ChainItem> {

    private static final long serialVersionUID = 393667416411988101L;

    /**
     * Defines the source item, the one providing the ore for the production chain
     */
    private ChainItem sourceChainItem;

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("====== ChainItemsDescription ======\n\n");

        for (ChainItem item : this) {
            s.append(item + "\n");
        }

        s.append("===================================");
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        boolean returnValue = super.equals(o);
        if (o instanceof ChainItemsDescription) {
            returnValue &= (this.sourceChainItem.equals(((ChainItemsDescription) o).sourceChainItem));
        }
        return returnValue;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() & this.sourceChainItem.hashCode());
    }

    public ChainItem getSourceChainItem() {
        return sourceChainItem;
    }

    public void setSourceChainItem(ChainItem sourceChainItem) {
        this.sourceChainItem = sourceChainItem;
    }

}
