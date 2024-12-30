package day15;

class Logger{
    private static Logger instance;

    private Logger(){
        System.out.println("Logger 생성");
    }

    public synchronized static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println("[LOG]:: "+msg);
    }
}
public class SingletonExam {
    public static void main(String[] args) {
        new LoggerUser().methodA();

        new LoggerUser2().methodB();
    }
}

class LoggerUser{
    public void methodA(){
        Logger logger = Logger.getInstance();
        logger.log("LoggerUser 가 Logger를 이용해서 log를 남깁니다.");
    }
}

class LoggerUser2{
    public void methodB(){
        Logger logger = Logger.getInstance();
        logger.log("LoggerUser2 가 Logger를 이용해서 log를 남깁니다.");
    }
}
