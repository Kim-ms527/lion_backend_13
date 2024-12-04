package day03;

public class ArrayExam4 {
    public static void main(String[] args) {
        ItemForArray[] itemArr ;

        itemArr = new ItemForArray[3];

        ItemForArray item1 = new ItemForArray(3000, "연필");
        ItemForArray item2 = new ItemForArray(5000, "컵");
        ItemForArray item3 = new ItemForArray(10000, "공책");

        System.out.println(item1.getName());
        String name = item2.getName();
        int price = item3.getPrice();



        itemArr[0] = item1;
        itemArr[1] = item2;
        itemArr[2] = item3;
//
        for (int i = 0; i < itemArr.length; i++){
            System.out.println(itemArr[i].getName());
        }


        int total = 0;
        for(int i = 0; i < itemArr.length; i++) {
            total+=itemArr[i].getPrice();
        }
        System.out.println(total);

    //    sum = sum + i;  sum+=i;


        String s =  new String();  // String 클래스의 디폴트 생성자를 이용해서 객체를 만들겠다.
        String s2 = new String("abc"); //String 클래스의 스트링값을 갖는 생성자로 객체를 만들겠다.

    }
}
