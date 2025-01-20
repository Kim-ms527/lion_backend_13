package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ServiceRun {
    public static void main(String[] args) {
       Service service = new Service();
       Method[] declareMethods =  service.getClass().getDeclaredMethods();

       for(Method method : declareMethods){
           if(method.isAnnotationPresent(PrintAnnotaion.class)){
               System.out.println("[[[[[[[[[["+method.getName()+"]]]]]]]]]]]]]]]]]");

               PrintAnnotaion printAnnotaion =  method.getAnnotation(PrintAnnotaion.class);

               for(int i = 0; i < printAnnotaion.number(); i++){
                   System.out.print(printAnnotaion.value());
               }
               System.out.println();
           }
           try {
               method.invoke(service);
           } catch (IllegalAccessException e) {
               throw new RuntimeException(e);
           } catch (InvocationTargetException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
