package com.betus.dbdemo.controller;


import com.betus.dbdemo.model.Address;
import com.betus.dbdemo.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable long id) {
        Address theAddress=addressService.getAddressById(id);
        System.out.println(theAddress);
        return theAddress;
    }

    @PutMapping("/{id}")
    public void deleteAddress(@PathVariable long id) {
        addressService.deleteAddress(id);
    }
}
