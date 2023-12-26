package com.puppymetrics.statistics.client;

import com.puppymetrics.statistics.domain.Currency;
import com.puppymetrics.statistics.domain.ExchangeRatesContainer;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class ExchangeRatesClientFallback implements ExchangeRatesClient {

    @Override
    public ExchangeRatesContainer getRates(Currency base) {
        ExchangeRatesContainer container = new ExchangeRatesContainer();
        container.setBase(Currency.getBase());
        container.setRates(Collections.emptyMap());
        return container;
    }
}
