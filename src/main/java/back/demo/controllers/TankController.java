package back.demo.controllers;


import back.demo.requests.TankRequest;
import back.demo.responses.TankResponse;
import back.demo.services.TankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class TankController {

    private final TankService tankService;

    @GetMapping("/getTank")
    public List<TankResponse> getTank() {
        return tankService.getTank();
    }

    @PostMapping("/addTank")
    public void addTank(@RequestBody TankRequest request) throws ParseException {
        tankService.addTank(request);
    }

    @PostMapping("/deleteTank")
    public void deleteTank(@RequestBody TankRequest request) throws ParseException {
        tankService.deleteTank(request);
    }

}
