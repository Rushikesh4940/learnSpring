package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle {
    public void move(){
        System.out.println("bike is moving....");
    }
}
