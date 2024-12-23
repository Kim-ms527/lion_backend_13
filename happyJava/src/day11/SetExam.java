package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        set.add("a");
        System.out.println(set);


        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("========================");

        if(set.contains("h"))
            System.out.println("true");

        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("white"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("yellow"));

        System.out.println(penSet);

        penSet.add(new Pen("white"));

        System.out.println(penSet);

        if(penSet.contains(new Pen("white")))
            System.out.println("있어요.");
        else
            System.out.println("없어요.");

        Iterator<Pen>  penIter = penSet.iterator();
        while (penIter.hasNext()){
            System.out.println(penIter.next());
        }

    }
}
