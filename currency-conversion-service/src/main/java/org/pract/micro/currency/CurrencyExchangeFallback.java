package org.pract.micro.currency;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CurrencyExchangeFallback implements CurrencyExchangeServiceProxy {
    @Override
    public CurrencyConversionBean retrieveExchangeValue(String from, String to) {
        CurrencyConversionBean ccb = new CurrencyConversionBean( 1000l, "EUR", "INR", new BigDecimal(71), new BigDecimal(10), new BigDecimal(0), 00000);
        return ccb;
    }
}
