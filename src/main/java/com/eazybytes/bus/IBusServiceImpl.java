package com.eazybytes.bus;

import com.eazybytes.bus.entity.Bus;
import com.eazybytes.bus.repository.BusRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IBusServiceImpl implements IBusService {
    private final BusRepository busRepository;
    /**
     * @param bus - list of buses
     */
    @Override
    @Transactional
    public void createBus(List<Bus> bus) {
        List<Bus> fail = new ArrayList<>();
        bus.forEach(el->{
            if(valideBus(el)){
                busRepository.save(el);
            }
            fail.add(el);
        });
        if(!fail.isEmpty()){

        }
    }

    /**
     * @return list of buses
     */
    @Override
    public List<Bus> fetchAllBus() {
        return List.of();
    }

    /**
     * @param id - bus ID
     * @return - bus
     */
    @Override
    public Bus fetchBusById(String id) {
        return null;
    }


}
