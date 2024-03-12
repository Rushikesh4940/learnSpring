package annotationbased;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveler {
    private vehicle vehicle;
    @Autowired
    public  Traveler(@Qualifier("car") vehicle vehicle){
        this.vehicle= vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
