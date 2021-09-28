import com.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)context.getBean("user");
//        User user = (User)context.getBean("userT");
//        User user = (User)context.getBean("userNew");
        user.show();

    }
}
