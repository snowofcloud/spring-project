package com.enjoy.spring9;

import com.enjoy.spring9.config.MainConfig9;
import com.enjoy.spring9.dao.TestDao;
import com.enjoy.spring9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/5/3 0:10
 */

public class TestSpring9 {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfig9.class);

        /*TestService testService = app.getBean(TestService.class);
        testService.println();
        //直接从容器中获取TestDao, 和使用Autowired注解来取比较
        TestDao testDao = app.getBean(TestDao.class);
        System.out.println(testDao);
*/
        System.out.println(app);
        app.close();

    }
}
