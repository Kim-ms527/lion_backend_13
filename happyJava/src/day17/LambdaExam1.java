package day17;

import day15.a.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExam1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kang");
        names.add("kim");
        names.add("hong");

        List<String> nameList = Arrays.asList("kang","kim","hong");
        MyComparator myComparator = new MyComparator();

        names.sort(myComparator);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(names);

        nameList.sort((o1,o2) -> o1.compareTo(o2));

        System.out.println(nameList);

    }
}
