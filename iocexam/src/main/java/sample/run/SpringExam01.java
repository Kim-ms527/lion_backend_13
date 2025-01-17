package sample.run;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Book;
import sample.bean.MyBean;
import sample.config.MyBeanConfig;

public class SpringExam01 {
    public static void main(String[] args) {
        //직접사용하는 경우
        MyBean bean = new MyBean();
        bean.setName("kang");

        System.out.println(bean.getName());


        //spring ioc container 를 이용해서 사용!!!
        //빈을 등록해야한다.  (1.xml 을 이용해서,  2. 자바컨피그 이용  3. 애노테이션을 붙혀서!! )

        //스프링이 제공하는 공장을 통해서 사용!!
        //1. BeanFactory  --  단순한일만 한다.  aop 같은 기술은 사용할 수 없다.
        //공장이 세워질때 필요한 빈을 생성한다.
        System.out.println("ApplicationContext 생성 전!!");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class); //이 공장은 세워질때 뭘 참조해야할까요? 
        System.out.println("ApplicationContext 생성 후!!");

        MyBean bean1 =(MyBean) context.getBean("myBean");  //lookup방식..     di는??
        bean1.setName("carami");
        System.out.println(bean1);

        MyBean bean2 = context.getBean("myBean",MyBean.class);

        System.out.println(bean2);

        if(bean1 == bean2)
            System.out.println("bean1 == bean2 같은 인스턴스입니다.");
        else
            System.out.println("bean1 == bean2 다른 인스턴스입니다.");


        MyBean bean3 = context.getBean("myBean2", MyBean.class);

        if(bean1 == bean3)
            System.out.println("bean1 == bean3 같은 인스턴스입니다.");
        else
            System.out.println("bean1 == bean3 다른 인스턴스입니다.");



        MyBean bean4 = context.getBean("myBean3", MyBean.class);
        MyBean bean5 = context.getBean("myBean3", MyBean.class);

        if(bean4 == bean5)
            System.out.println("bean4 == bean5 같은 인스턴스입니다.");
        else
            System.out.println("bean4 == bean5 다른 인스턴스입니다.");


        //id없이 타입만 가지고 룩업해줌.
        Book book = context.getBean("book",Book.class);

        System.out.println(book);

        MyBean bean6 = context.getBean("myBean4",MyBean.class);
        System.out.println(bean6);
    }
}
