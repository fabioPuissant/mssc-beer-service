package com.fabio.msscbeerservice.web.controller;

import com.fabio.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@Validated
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController
{
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        // todo: Implement

        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Valid BeerDto beerDto)
    {
        // todo: Implement

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeerById(@PathVariable UUID beerId, @RequestBody @Valid BeerDto beerDto){
        // todo: Implement
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID beerId){
        // todo: Implement

    }


}
