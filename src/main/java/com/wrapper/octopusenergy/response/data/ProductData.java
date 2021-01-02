package com.wrapper.octopusenergy.response.data;

import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.octopusenergy.response.Response;

public class ProductData extends Response<ProductData> {
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<OctopusEnergyProduct> products = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<OctopusEnergyProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OctopusEnergyProduct> products) {
        this.products = products;
    }

    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
