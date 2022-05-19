package back.demo.gasstations;


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

}
