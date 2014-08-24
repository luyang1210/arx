/*
 * ARX: Powerful Data Anonymization
 * Copyright (C) 2012 - 2014 Florian Kohlmayer, Fabian Prasser
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.deidentifier.arx.metric.v2;

import org.deidentifier.arx.framework.lattice.Node;


/**
 * This class provides an implementation of the non-uniform entropy
 * metric. TODO: Add reference
 * 
 * @author Fabian Prasser
 * @author Florian Kohlmayer
 */
public class MetricMDNUEntropy extends MetricMDNUEntropyPrecomputed {

    /** SVUID*/
    private static final long serialVersionUID = -8114158144622853288L;

    /**
     * Creates a new instance
     */
    protected MetricMDNUEntropy() {
        super();
    }
    
    /**
     * Creates a new instance
     * @param function
     */
    protected MetricMDNUEntropy(AggregateFunction function){
        super(function);
    }

    @Override
    public boolean isIndependent() {
        return false;
    }

    @Override
    public String toString() {
        return "Non-uniform entropy";
    }

    @Override
    protected AbstractILMultiDimensional getLowerBoundInternal(Node node) {
        return null;
    }
}