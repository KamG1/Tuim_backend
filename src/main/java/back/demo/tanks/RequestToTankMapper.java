package back.demo.tanks;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Locale;

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
