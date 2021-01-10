package com.wrapper.octopusenergy.request;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.GridSupplyPointsData;

public class GridSupplyPointsRequest extends Request<GridSupplyPointsData> {

    String postCode;

    GridSupplyPointsRequest(Builder builder) {
        super(builder.octopusEnergyApi);

        this.postCode = builder.postCode;
    }

    protected GridSupplyPointsData execute() {
        return super.execute(octopusEnergyApi
                .octopusEnergyApiService()
                .getGridSupplyPoints(
                        postCode), GridSupplyPointsData.class);
    }

    public static class Builder extends AbstractBuilder<GridSupplyPointsData> {

        String postCode;

        public Builder(OctopusEnergyApi octopusEnergyApi) {
            super(octopusEnergyApi);
        }

        public Builder postCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        @Override
        public GridSupplyPointsData execute() {
            return new GridSupplyPointsRequest(this).execute();
        }
    }
}
