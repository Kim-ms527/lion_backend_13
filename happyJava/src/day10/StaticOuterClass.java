package day10;

import org.w3c.dom.ls.LSOutput;

public class StaticOuterClass {
    private int outerFiled = 10;
    private static  int staticOuterField  = 20;
    public void outerMethod(){

    }
    static class InnerClass{
        public void innerMethod(){
            System.out.println(staticOuterField);
        }

        public static void staticInnerMethod(){
            System.out.println("static");
        }
    }
    public static void main(String[] args) {
        StaticOuterClass.InnerClass inner = new StaticOuterClass.InnerClass();
        inner.innerMethod();

        StaticOuterClass.InnerClass.staticInnerMethod();

    }
}
