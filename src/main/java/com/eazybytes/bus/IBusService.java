package com.eazybytes.bus;

import com.eazybytes.bus.entity.Bus;

import java.util.List;

public interface IBusService {
    String success ="Request processed successfully";
    String error ="Request processed failed";
    /**
     * @param bus - list of buses
     */
    void createBus(List<Bus> bus);

    /**
     * @return list of buses
     */
    List<Bus> fetchAllBus();

    /**
     * @param id - bus ID
     * @return - bus
     */
    Bus fetchBusById(String id);

    default boolean valideBus(Bus bus){
        return bus.getBusName() != null && bus.getBusName().length() > 0;
    }

}
