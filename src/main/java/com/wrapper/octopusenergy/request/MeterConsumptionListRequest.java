package com.wrapper.octopusenergy.request;

import java.time.LocalDateTime;

import com.wrapper.octopusenergy.OctopusEnergyApi;
import com.wrapper.octopusenergy.response.data.*;

import static com.wrapper.octopusenergy.util.ISODateFormatter.getFormattedDateTimeString;

public class MeterConsumptionListRequest extends Request<MeterConsumptionList> {

    private final String meterType;
    private final String meterId;
    private final String serialNumber;
    private final String periodFrom;
    private final String periodTo;
    private final String pageSize;
    private final String orderBy;
    private final String groupBy;

    MeterConsumptionListRequest(Builder builder) {
        super(builder.octopusEnergyApi);

        this.meterType = builder.meterType;
        this.meterId = builder.meterId;
        this.serialNumber = builder.serialNumber;
        this.periodFrom = builder.periodFrom;
        this.periodTo = builder.periodTo;
        this.pageSize = builder.pageSize;
        this.orderBy = builder.orderBy;
        this.groupBy = builder.groupBy;
    }

    protected MeterConsumptionList execute() {
        return super.execute(
                octopusEnergyApi.octopusEnergyApiService().getMeterConsumption(
                        meterType,
                        meterId,
                        serialNumber,
                        periodFrom,
                        periodTo,
                        pageSize,
                        orderBy,
                        groupBy
                ), MeterConsumptionList.class
        );
    }

    public static class Builder extends AbstractBuilder<MeterConsumptionList> {

        private final String meterType;
        private final String meterId;
        private final String serialNumber;
        private String periodFrom;
        private String periodTo;
        private String pageSize;
        private String orderBy;
        private String groupBy;

        public Builder(OctopusEnergyApi octopusEnergyApi, MeterType meterType, String meterId, String serialNumber) {
            super(octopusEnergyApi);

            this.meterType = meterType.getValue();
            this.meterId = meterId;
            this.serialNumber = serialNumber;
        }

        public Builder periodFrom(LocalDateTime localDateTime) {
            this.periodFrom = getFormattedDateTimeString(localDateTime);
            return this;
        }

        public Builder periodTo(LocalDateTime localDateTime) {
            this.periodTo = getFormattedDateTimeString(localDateTime);
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize.toString();
            return this;
        }

        public Builder orderBy(OrderType orderType) {
            this.orderBy = orderType.getValue();
            return this;
        }

        public Builder groupBy(GroupType groupBy) {
            this.groupBy = groupBy.getValue();
            return this;
        }

        @Override
        public MeterConsumptionList execute() {
            return new MeterConsumptionListRequest(this).execute();
        }
    }
}
