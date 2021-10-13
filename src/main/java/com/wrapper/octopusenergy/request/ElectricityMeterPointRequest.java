package com.wrapper.octopusenergy.request;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.ElectricityMeterPoint;

public class ElectricityMeterPointRequest extends Request<ElectricityMeterPoint> {

    final String mpan;

    public ElectricityMeterPointRequest(Builder builder) {
        super(builder.octopusEnergyApi);
        this.mpan = builder.mpan;
    }

    private ElectricityMeterPoint execute() {
        return super.execute(octopusEnergyApi.octopusEnergyApiService()
                                             .getElectricityMeterPoint(mpan)
                , ElectricityMeterPoint.class);
    }

    public static class Builder extends AbstractBuilder<ElectricityMeterPoint> {

        final String mpan;

        public Builder(OctopusEnergyApi octopusEnergyApi, String mpan) {
            super(octopusEnergyApi);
            this.mpan = mpan;
        }

        @Override
        public ElectricityMeterPoint execute() {
            return new ElectricityMeterPointRequest(this).execute();
        }
    }
}
