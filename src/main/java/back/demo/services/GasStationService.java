package back.demo.services;


import back.demo.classes.Gasstation;
import back.demo.responseMappers.GasStationToResponseMapper;
import back.demo.requestMappers.RequestToGasStationMapper;
import back.demo.repositories.GasStationRepository;
import back.demo.requests.GasStationRequest;
import back.demo.responses.GasStationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GasStationService {

    private final GasStationRepository gasStationRepository;
    private final GasStationToResponseMapper gasStationToResponseMapper;
    private final RequestToGasStationMapper requestToGasStationMapper;

    public List<GasStationResponse> getGasStation() {
        return gasStationRepository.findAll().stream()
                .map(gasStationToResponseMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional
    public void alterGasStation(GasStationRequest gasStationRequest) {
        Gasstation gasstation = requestToGasStationMapper.mapToGasStation(gasStationRequest);
        Gasstation editedStation = gasStationRepository.findById(gasStationRequest.getId_gas_station()).orElseThrow();
        editedStation.setCostOn(gasstation.getCostOn());
        editedStation.setCostBenz(gasstation.getCostBenz());
        editedStation.setCostLpg(gasstation.getCostLpg());
    }

    public void addStation(GasStationRequest gasStationRequest) {
        gasStationRepository.save(requestToGasStationMapper.mapToGasStation(gasStationRequest));
    }

    public void deleteStation(GasStationRequest gasStationRequest) {
        Gasstation gasstation = requestToGasStationMapper.mapToGasStation(gasStationRequest);
        gasStationRepository.deleteById(gasstation.getIdGasStation());

    }


}
