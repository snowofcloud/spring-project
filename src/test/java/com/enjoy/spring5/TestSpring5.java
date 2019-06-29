package com.enjoy.spring5;

import com.enjoy.spring.Dog;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.spring5.config.DogConfig5;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @auther xuxq
 * @date 2019/4/27 22:13
 */
public class TestSpring5 {
    @Test
    public void testSpring5(){
        //当声明IOC容器时，
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DogConfig5.class);
        System.out.println("ioc容器创建完成。。。");
        String[] names1 = app.getBeanNamesForType(Dog.class);
        for (String name: names1) {
            System.out.println(name);
        }
        //把所有的bean都打印出来，把所有的对象和id发到map里key  value
        Map<String, Dog> beansOfType = app.getBeansOfType(Dog.class);
        System.out.println(beansOfType);

        /*打印结果：
            给容器中注入dog
            给容器中注入haBaDog
            给容器中注入langDog
            ioc容器创建完成。。。
            dog1
            haBaDog1
            langDog1
            {dog1=Dog{color='黑色', age=12, size='large'}, haBaDog1=Dog{color='百色', age=22, size='small'}, langDog1=Dog{color='黄色', age=32, size='middle'}}*/


    }

    //当引入@Conditional时, 容器可以选择性的注册bean.
    @Test
    public void testSpring55(){
        //当声明IOC容器时，
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //拿到IOC容器的环境
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
    }



}
