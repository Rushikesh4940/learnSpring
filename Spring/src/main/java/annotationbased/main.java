package annotationbased;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Config.class);
   Car car =applicationContext.getBean(Car.class);
    bike bike=applicationContext.getBean(bike.class);
    Traveler traveler=applicationContext.getBean(Traveler.class);
}
