import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeakerService;

public class Application {
	public static void main(String[] args) {
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
//		SpeakerService service=new SpeakerSerivceImpl();
		
		SpeakerService service=appContext.getBean("speakerService",SpeakerService.class);
		System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		
//		Remove comment of these 2 lines and check the scope result..If singleton both service and service2
//		will print the same object
//		SpeakerService service2=appContext.getBean("speakerService",SpeakerService.class);
//		System.out.println(service2);
		
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
