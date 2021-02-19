package com.wrapper.octopusenergy.response.data;

import java.util.List;

public class Quote {

    String gsp;
    String mpan;
    String postCode;
    String brandCode;
    MeterType meterType;
    List<String> productCodes;
    Integer consumptionDay;
    Boolean hasSmartMeter;
    Boolean businessProductsOnly;
    Integer consumptionStandard;
    Integer consumptionNight;
    Integer consumptionOffPeak;

    private Quote(QuoteBuilder quoteBuilder) {
        this.gsp = quoteBuilder.gsp;
        this.mpan = quoteBuilder.mpan;
        this.postCode = quoteBuilder.postCode;
        this.meterType = quoteBuilder.meterType;
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
        MeterType meterType;
        Integer consumptionStandard;
        List<String> productCodes;
        Integer consumptionDay;
        Integer consumptionNight;
        Boolean hasSmartMeter;
        Boolean businessProductsOnly;
        Integer consumptionOffPeak;

        public QuoteBuilder(MeterType meterType) {
            this.meterType = meterType;
        }

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
            if (meterType == null)
                throw new IllegalStateException("Meter type must be specified for quote");
            if (gsp == null || postCode == null)
                throw new IllegalStateException("For all meter-points, at least one of gsp or postcode must be included.");

            switch (meterType) {
                case GAS: {
                    if (consumptionStandard == null) {
                        throw new IllegalStateException("For a gas meter-point, consumption_standard must be included.");
                    }
                }
                case ELECTRICITY: {
                    if (consumptionStandard == null || (consumptionDay == null && consumptionNight == null)) {
                        throw new IllegalStateException("At least one of `consumption_standard` or a combination of `consumption_day` and `consumption_night` must be included");
                    }
                }
                case ELECTRICITY_THREE_REGISTER: {
                    if (consumptionDay == null && consumptionNight == null && consumptionOffPeak == null) {
                        throw new IllegalStateException("At least one of `consumption_standard` or a combination of `consumption_day` and `consumption_night` must be included");
                    }
                }
            }
            return new Quote(this);
        }
    }
}
