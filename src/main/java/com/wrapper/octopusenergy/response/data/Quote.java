package com.wrapper.octopusenergy.response.data;

import java.util.List;

public class Quote {

    String gsp;
    String mpan;
    String postCode;
    String brandCode;
    List<String> productCodes;
    int consumptionDay;
    boolean hasSmartMeter;
    boolean businessProductsOnly;
    int consumptionStandard;
    int consumptionNight;
    int consumptionOffPeak;

    private Quote(QuoteBuilder quoteBuilder) {
        this.gsp = quoteBuilder.gsp;
        this.mpan = quoteBuilder.mpan;
        this.postCode = quoteBuilder.postCode;
        this.consumptionDay = quoteBuilder.consumptionDay;
        this.hasSmartMeter = quoteBuilder.hasSmartMeter;
        this.consumptionStandard = quoteBuilder.consumptionStandard;
        this.consumptionNight = quoteBuilder.consumptionNight;
        this.consumptionOffPeak = quoteBuilder.consumptionOffPeak;
        this.brandCode = quoteBuilder.brandCode;
        this.productCodes = quoteBuilder.productCodes;
        this.businessProductsOnly = quoteBuilder.businessProductsOnly;
    }

    public static class QuoteBuilder {
        String gsp;
        String mpan;
        String postCode;
        String brandCode;
        int consumptionStandard;
        List<String> productCodes;
        int consumptionDay;
        int consumptionNight;
        boolean hasSmartMeter;
        boolean businessProductsOnly;
        int consumptionOffPeak;

        public QuoteBuilder withGSP(String gsp) {
            this.gsp = gsp;
            return this;
        }

        public QuoteBuilder withPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public QuoteBuilder withConsumptionStandard(int consumptionStandard) {
            this.consumptionStandard = consumptionStandard;
            return this;
        }

        public QuoteBuilder withConsumptionDay(int consumptionDay) {
            this.consumptionDay = consumptionDay;
            return this;
        }

        public QuoteBuilder withConsumptionNight(int consumptionNight) {
            this.consumptionNight = consumptionNight;
            return this;
        }

        public QuoteBuilder withConsumptionOffPeak(int consumptionOffPeak) {
            this.consumptionOffPeak = consumptionOffPeak;
            return this;
        }

        public QuoteBuilder withHasSmartMeter(boolean hasSmartMeter) {
            this.hasSmartMeter = hasSmartMeter;
            return this;
        }

        public QuoteBuilder withProductCodes(List<String> productCodes) {
            this.productCodes = productCodes;
            return this;
        }

        public QuoteBuilder withBrandCode(String brandCode) {
            this.brandCode = brandCode;
            return this;
        }

        public QuoteBuilder withBusinessProductsOnly(boolean businessProductsOnly) {
            this.businessProductsOnly = businessProductsOnly;
            return this;
        }

        public Quote build() {
            return new Quote(this);
        }
    }
}
