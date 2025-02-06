package day17stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExam07 {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("src/day17stream/");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p-> System.out.println(p.getFileName()));
        stream.close();

        Stream<String> stream2 =
                Files.lines(Paths.get("src/day17stream/StreamExam01.java"));
        stream2.forEach(System.out::println);
    }
}
