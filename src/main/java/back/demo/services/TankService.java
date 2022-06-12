package back.demo.services;

import back.demo.repositories.TankRepository;
import back.demo.requests.TankRequest;
import back.demo.requestMappers.RequestToTankMapper;
import back.demo.responses.TankResponse;
import back.demo.responseMappers.TankToResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TankService {

    private final TankRepository tankRepository;
    private final TankToResponseMapper tankToResponseMapper;
    private final RequestToTankMapper requestToTankMapper;

    public List<TankResponse> getTank() {
        return tankRepository.findAll().stream()
                .map(tankToResponseMapper::toResponse)
                .collect(Collectors.toList());
    }

    public void addTank(TankRequest tankRequest) {
        tankRepository.save(requestToTankMapper.mapToTank(tankRequest));
    }

    public void deleteTank(TankRequest tankRequest) {
        tankRepository.delete(requestToTankMapper.mapToTank(tankRequest));
    }
}
