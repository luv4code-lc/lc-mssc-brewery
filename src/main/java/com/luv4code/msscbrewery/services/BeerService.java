package com.luv4code.msscbrewery.services;

import com.luv4code.msscbrewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(String beerId);
}
