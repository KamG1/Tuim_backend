package back.demo.requestMappers;


import back.demo.requests.TankRequest;
import back.demo.classes.Tankrecords;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestToTankMapper {


    public Tankrecords mapToTank(TankRequest request) {
        Tankrecords tank = new Tankrecords();
        System.out.println("Date .. " + request.getDate());
        tank.setIdTankRecords(request.getIdTankRecords());

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.GERMANY);
        tank.setDate((request.getDate()));
        tank.setMillage(request.getMillage());
        tank.setLiters(request.getLiters());
        tank.setCostInPln(request.getCostInPln());
        tank.setFkauto(request.getFkauto());
        return tank;
    }
}
