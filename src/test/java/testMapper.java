import domain.Administrator;
import mapper.AdminMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class testMapper {
    @Test
    
    public testMapper(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("mybatis-config.xml");
        AdminMapper adminMapper = ac.getBean(AdminMapper.class);
        Administrator a1 = new Administrator("wjy","123");
        Administrator a11 = adminMapper.adminLogin(a1);
        System.out.println(a1);
        Administrator a2 = new Administrator("wsp","123");
        Administrator a22 = adminMapper.adminLogin(a2);
        System.out.println(a2);
    }
}
