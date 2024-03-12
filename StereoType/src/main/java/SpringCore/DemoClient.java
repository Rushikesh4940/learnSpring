package SpringCore;

import SpringCore.controller.demoController;
import SpringCore.service.demoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        demoController demoController= applicationContext.getBean(SpringCore.controller.demoController.class);
        System.out.println(demoController.hello());
        demoService demoService= applicationContext.getBean(SpringCore.service.demoService.class);
        System.out.println(demoService.hello());
    }
}
