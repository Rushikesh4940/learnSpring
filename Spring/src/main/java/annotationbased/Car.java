package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public void move(){
        System.out.println("car is moving....");
    }
}
