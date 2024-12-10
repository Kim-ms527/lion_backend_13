package day07;

import java.util.Objects;

class MyClass {
    int i;

    public int concat(int j){
         i += j;
         return i;
    }

    @Override
    public String toString() {
        return i + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass myClass)) return false;
        return i == myClass.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
