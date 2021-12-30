import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 终于白发始于青丝
 * @create 2021-12-30 下午 21:15
 * @program ssm
 * @Version 1.0
 * @ClassName SpringTest
 */
public class SpringTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context);
    }


}
