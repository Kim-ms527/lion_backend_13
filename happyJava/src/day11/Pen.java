package day11;

import java.util.Objects;

public class Pen {
    String color;
    public Pen(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return  color ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pen pen)) return false;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }
}
