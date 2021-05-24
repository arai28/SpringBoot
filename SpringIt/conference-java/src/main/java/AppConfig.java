import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerSerivceImpl;
import com.pluralsight.service.SpeakerService;

@Configuration
@ComponentScan({"com.pluralsight"}) //just tells this is where to start looking for beans to autowire
public class AppConfig {
	
	/*@Bean(name="speakerService")
//	@Scope(value="singleton")  <-- you can also do this instead of below one
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerService() {
//		return new SpeakerSerivceImpl();
		
		
//		So remember bean were a singleton ya..so you might call this getSpeakerService 50 times but only 1 
//		HibernateSpeakerRepositoryImpl() will be created because this has been implemented as a bean
//		and this is a good thing for us
		
//		SETTER INJECTION
//		SpeakerSerivceImpl service =new SpeakerSerivceImpl();
//		service.setRepository(getSpeakerRepository());
//		return service;
		
//		CONSTRUCTOR INJECTION
//		SpeakerSerivceImpl service =new SpeakerSerivceImpl(getSpeakerRepository());
//		return service;
		
		
//		Autowired Auto INJECTION
		SpeakerSerivceImpl service =new SpeakerSerivceImpl();
		return service;
	}
	
	
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}*/

//	So here the speakerRepository Bean is setter injected into speakerService bean
}
