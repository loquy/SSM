import com.config.Config;
import com.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 如果完全使用了配置类方式做，只能通过 AnnotationConfigApplicationContext 上下文获取容器，通过配置类的Class加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
