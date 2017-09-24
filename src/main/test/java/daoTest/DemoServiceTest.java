package daoTest;

import domain.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.DemoServiceService;

/**
 * Created by huangzhenwei on 2017/09/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class DemoServiceTest {
    @Autowired
    private DemoServiceService demoServiceService;
    @Test
    public void getDemoService(){
        Integer id =1;
        DemoService demoService = demoServiceService.getDemoService(id);
        System.out.print(demoService.getName());
    }
}
