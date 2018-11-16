package com.crpytopriceinfo.mainserver.domain;

import java.util.List;

public class PriceResponse {
    public List<PriceInfo> prices;
    public PriceResponse() {};
    public PriceResponse(List<PriceInfo> prices) {
        this.prices = prices;
    }
}
