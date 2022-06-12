package back.demo.controllers;


import back.demo.requests.GasStationRequest;
import back.demo.responses.GasStationResponse;
import back.demo.services.GasStationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class GasStationController {

    private final GasStationService gasStationService;

    @GetMapping("/getStation")
    public List<GasStationResponse> getStation(){
        return gasStationService.getGasStation();
    }

    @PutMapping("/alterGasStation/")
    public void alterGasStation(@RequestBody GasStationRequest request) {
        gasStationService.alterGasStation(request);
    }

    @PostMapping("/addStation")
    public void addStation(@RequestBody GasStationRequest request) {
        gasStationService.addStation(request);
    }

    @PostMapping("/deleteStation")
    public void deleteStation(@RequestBody GasStationRequest request) {
        gasStationService.deleteStation(request);
    }

}
