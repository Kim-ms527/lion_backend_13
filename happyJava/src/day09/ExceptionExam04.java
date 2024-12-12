package day09;

public class ExceptionExam04 {
    //심부름()  -- 예외가 발생했을때 내가 직접 처리하는 방식으로
    public static void 심부름(){
        //예외를 직접
        System.out.println("심부름 시작!!");

        int i = 0;
        try {
            System.out.println(10 / i);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("다른마트 감");
            //아무일도 안함
        }

        System.out.println("심부름 끝");
    }


    //심부름2() -- 예외가 발생했을때 throws 하는 방식으로 메서드를 만들어 보세요.
    public static void 심부름2() throws Exception{
        //예외를 엄마에게 던짐.
        System.out.println("심부름 시작!!");
        int i = 0;
        System.out.println(10 / i);
        System.out.println("심부름 끝");
    }


    public static void main(String[] args) {
        //엄마가 심부름 시킴.
        심부름();
//        try {
//            심부름2();
//        }catch (Exception e){
//            System.out.println("동생에게 시킴");
//        }
    }
}
