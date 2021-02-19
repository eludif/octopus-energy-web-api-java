package com.wrapper.octopusenergy.request;

import java.time.LocalDateTime;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.OctopusEnergyProduct;

import static com.wrapper.octopusenergy.util.ISODateFormatter.getFormattedDateTimeString;

public class RetrieveProductRequest extends Request<OctopusEnergyProduct> {
    private final String productCode;
    private final String tariffsActiveAt;

    RetrieveProductRequest(Builder builder) {
        super(builder.octopusEnergyApi);
        this.productCode = builder.productCode;
        this.tariffsActiveAt = builder.tariffsActiveAt;
    }

    protected OctopusEnergyProduct execute() {
        return super.execute(octopusEnergyApi
                .octopusEnergyApiService().getProduct(productCode, tariffsActiveAt), OctopusEnergyProduct.class);
    }

    public static class Builder extends AbstractBuilder<OctopusEnergyProduct> {

        private final String productCode;
        private String tariffsActiveAt;

        public Builder(OctopusEnergyApi octopusEnergyApi, String productCode) {
            super(octopusEnergyApi);
            this.productCode = productCode;
        }

        @Override
        public OctopusEnergyProduct execute() {
            return new RetrieveProductRequest(this).execute();
        }

        public Builder tariffsActiveAt(LocalDateTime tariffsActiveAt) {
            this.tariffsActiveAt = getFormattedDateTimeString(tariffsActiveAt);
            return this;
        }
    }
}
