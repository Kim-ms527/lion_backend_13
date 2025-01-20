package optional;

import java.util.Optional;

public class OptionalExam {
    public static void main(String[] args) {
        String msg = null;

        if(msg != null)
            System.out.println(msg.charAt(0));

//       Optional<Todo> todo  =  todoServer.getTodo(1);
//
//        if(todo != null){
//
//        }

        Optional<String> optional = Optional.empty();

        //값이 존재하는지 확인해서 처리.
        if(optional.isPresent()){
            System.out.println("값이 존재할 때만 처리 ");
            System.out.println(optional.get());
        }

        if(optional.isEmpty()) {
            System.out.println("값이 없다면 처리할 부분 구현 ");

            System.out.println(optional.orElse("hi"));

        }

        try{
            optional.orElseThrow();  //값이 없다면 예외 발생 시키기.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
