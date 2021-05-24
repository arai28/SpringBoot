import com.pluralsight.service.SpeakerSerivceImpl;
import com.pluralsight.service.SpeakerService;

public class Application {
	public static void main(String[] args) {
		SpeakerService service=new SpeakerSerivceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
	}

}
