package com.betus.dbdemo.service;

import com.betus.dbdemo.model.Address;
import com.betus.dbdemo.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository= addressRepository;
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(long id) {
        return addressRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Address updateAddress(long id, Address AddressDetails) {
        Address address = addressRepository.findById(id).orElseThrow(()->new RuntimeException("Address not found"));
        address.setCity(AddressDetails.getCity());
        address.setState(AddressDetails.getState());
        return addressRepository.save(address);
    }

    public void deleteAddress(long id) {
        Address address = addressRepository.findById(id).orElseThrow(()->new RuntimeException("Address not found"));
        addressRepository.delete(address);
    }
}
