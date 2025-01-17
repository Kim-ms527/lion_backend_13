package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import sample.bean.Book;
import sample.bean.MyBean;

public class MyBeanConfig {
    //스프링 공장에게 나 어떤 빈을 관리하게 할건지를 알려줄 필요가 있어요.
    //XML
    //<bean id="myBean" class = "sample.bean.MyBean" />
    //기본설정이 싱글턴
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public MyBean myBean2(){
        return new MyBean();
    }

    @Bean
    public MyBean myBean4(){
        return new MyBean("kyungmi",30);
    }

    @Bean
    @Scope("prototype")
    public MyBean myBean3(){
        return new MyBean();
    }



    @Bean
    public Book book(){
        return new Book();
    }

    @Bean
    public Book book2(){
        return new Book();
    }
}
