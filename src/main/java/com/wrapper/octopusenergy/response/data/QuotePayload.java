package com.wrapper.octopusenergy.response.data;

import java.util.ArrayList;
import java.util.List;

public class QuotePayload {

    final String brandCode;
    final List<String> productCodes;
    final List<Quote> meterPointQuotes;
    final Boolean businessProductsOnly;

    public QuotePayload(QuotePayloadBuilder builder) {
        this.brandCode = builder.brandCode;
        this.productCodes = builder.productCodes;
        this.meterPointQuotes = builder.meterPointQuotes;
        this.businessProductsOnly = builder.businessProductsOnly;
    }

    public static class QuotePayloadBuilder {

        String brandCode;
        List<String> productCodes;
        final List<Quote> meterPointQuotes;
        Boolean businessProductsOnly;

        public QuotePayloadBuilder() {
            meterPointQuotes = new ArrayList<>();
        }

        public QuotePayloadBuilder addQuote(Quote quote) {
            this.meterPointQuotes.add(quote);
            return this;
        }

        public QuotePayloadBuilder addQuotes(List<Quote> quotes) {
            this.meterPointQuotes.addAll(quotes);
            return this;
        }

        public QuotePayloadBuilder withProductCodes(List<String> productCode) {
            this.productCodes = productCode;
            return this;
        }

        public QuotePayloadBuilder withBusinessProductsOnly(Boolean businessProductsOnly) {
            this.businessProductsOnly = businessProductsOnly;
            return this;
        }

        public QuotePayloadBuilder withBrandCode(String brandCode) {
            this.brandCode = brandCode;
            return this;
        }

        public QuotePayload build() {
            if (productCodes.isEmpty()) {
                throw new IllegalStateException("An array of Octopus Energy product codes to create quotes for is required");
            }

            if (businessProductsOnly) {
                // When set to true only a single electricity meter-point must be included with an associated mpan.
            }

            return new QuotePayload(this);
        }
    }
}
