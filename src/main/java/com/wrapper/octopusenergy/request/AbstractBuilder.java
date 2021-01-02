package com.wrapper.octopusenergy.request;

import com.wrapper.octopusenergy.OctopusEnergyApi;

public abstract class AbstractBuilder<T> {

    protected final OctopusEnergyApi octopusEnergyApi;

    AbstractBuilder(OctopusEnergyApi octopusEnergyApi) {
        this.octopusEnergyApi = octopusEnergyApi;
    }

    public abstract T execute();
}
