package com.wrapper.octopusenergy.request;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.EnergyType;
import com.wrapper.octopusenergy.response.data.RateType;
import com.wrapper.octopusenergy.response.data.TariffChargeData;
import com.wrapper.octopusenergy.util.ISODateFormatter;

import java.time.LocalDateTime;

public class TariffChargesListRequest extends Request<TariffChargeData> {
    private final String periodTo;
    private final String pageSize;
    private final String periodFrom;
    private final RateType rateType;
    private final String tariffCode;
    private final String productCode;
    private final EnergyType energyType;

    TariffChargesListRequest(Builder builder) {
        super(builder.octopusEnergyApi);

        this.productCode = builder.productCode;
        this.tariffCode = builder.tariffCode;
        this.periodTo = builder.periodTo;
        this.pageSize = builder.pageSize;
        this.periodFrom = builder.periodFrom;
        this.rateType = builder.rateType;
        this.energyType = builder.energyType;
    }

    protected TariffChargeData execute() {
        return super.execute(octopusEnergyApi.octopusEnergyApiService()
                                             .getTariffCharges(
                                                     productCode,
                                                     tariffCode,
                                                     energyType.getValue(),
                                                     rateType.getValue(),
                                                     periodFrom,
                                                     periodTo,
                                                     pageSize), TariffChargeData.class);
    }

    public static class Builder extends AbstractBuilder<TariffChargeData> {

        private final String tariffCode;
        private final RateType rateType;
        private final String productCode;
        private final EnergyType energyType;
        private String periodTo;
        private String pageSize;
        private String periodFrom;

        public Builder(OctopusEnergyApi octopusEnergyApi, String productCode, String tariffCode, EnergyType energyType, RateType rateType) {
            super(octopusEnergyApi);
            this.productCode = productCode;
            this.tariffCode = tariffCode;
            this.energyType = energyType;
            this.rateType = rateType;
        }

        public Builder periodFrom(LocalDateTime periodFrom) {
            this.periodFrom = ISODateFormatter.getFormattedDateTimeString(periodFrom);
            return this;
        }

        public Builder periodTo(LocalDateTime periodTo) {
            this.periodTo = ISODateFormatter.getFormattedDateTimeString(periodTo);
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize.toString();
            return this;
        }

        @Override
        public TariffChargeData execute() {
            return new TariffChargesListRequest(this).execute();
        }
    }
}
