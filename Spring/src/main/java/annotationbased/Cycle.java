package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Cycle  implements vehicle{
    public void move(){
        System.out.println("Cycle is moving....");
    }
}
