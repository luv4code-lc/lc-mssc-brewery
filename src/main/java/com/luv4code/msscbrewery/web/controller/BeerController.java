package com.luv4code.msscbrewery.web.controller;

import com.luv4code.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable String beerId) {
        BeerDto storedBeer = BeerDto.builder().build();
        return new ResponseEntity<>(storedBeer, HttpStatus.OK);
    }
}
