package com.wrapper.octopusenergy.request;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.ProductData;

public class ProductsRequest extends Request<ProductData> {

    private final String isVariable;
    private final String isGreen;
    private final String isTracker;
    private final String isPrepay;
    private final String isBusiness;
    private final String availableAt;

    ProductsRequest(Builder builder) {
        super(builder.octopusEnergyApi);

        this.isVariable = builder.isVariable;
        this.isGreen = builder.isGreen;
        this.isTracker = builder.isTracker;
        this.isPrepay = builder.isPrepay;
        this.isBusiness = builder.isBusiness;
        this.availableAt = builder.availableAt;
    }

    protected ProductData execute() {
        return super.execute(octopusEnergyApi
                .octopusEnergyApiService().getProducts(
                        isVariable,
                        isGreen,
                        isTracker,
                        isPrepay,
                        isBusiness,
                        availableAt
                ), ProductData.class);
    }

    public static class Builder extends AbstractBuilder<ProductData> {
        private String isVariable;
        private String isGreen;
        private String isTracker;
        private String isPrepay;
        private String isBusiness;
        private String availableAt;

        public Builder(OctopusEnergyApi octopusEnergyApi) {
            super(octopusEnergyApi);
        }

        @Override
        public ProductData execute() {
            return new ProductsRequest(this).execute();
        }

        public Builder isVariable(boolean isVariable) {
            this.isVariable = String.valueOf(isVariable);
            return this;
        }

        public Builder isGreen(boolean isGreen) {
            this.isGreen = String.valueOf(isGreen);
            return this;
        }

        public Builder isTracker(boolean isTracker) {
            this.isTracker = String.valueOf(isTracker);
            return this;
        }

        public Builder isPrepay(boolean isPrepay) {
            this.isPrepay = String.valueOf(isPrepay);
            return this;
        }

        public Builder isBusiness(boolean isBusiness) {
            this.isBusiness = String.valueOf(isBusiness);
            return this;
        }

        public Builder availableAt(LocalDateTime availableAt) {
            this.availableAt = getFormattedDateTimeString(availableAt);
            return this;
        }

        private static String getFormattedDateTimeString(LocalDateTime availableAt) {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");
            ZonedDateTime zonedDateTime = availableAt.atZone(ZoneId.of("UTC"));
            return zonedDateTime.format(df);
        }
    }
}
