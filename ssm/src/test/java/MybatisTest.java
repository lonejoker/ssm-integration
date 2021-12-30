import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 终于白发始于青丝
 * @create 2021-12-30 下午 22:27
 * @program ssm
 * @Version 1.0
 * @ClassName MybatisTest
 */
public class MybatisTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory factoryBean = (SqlSessionFactory) context.getBean("sqlSessionFactoryBean");
        System.out.println(factoryBean);
    }

}
