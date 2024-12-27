package day14;
class User {
    private String username;
    private String password;

    public User(String username) {
        this.username = username;
    }

    public void setPassword(String password) {

//        //패스워드 검증로직이 User클래스에 있다면???
//        if (password != null && password.length() >= 6) {
//            this.password = password;
//        } else {
//            throw new IllegalArgumentException("Invalid password");
//        }
        // SRP 적용: 검증 로직은 별도 클래스로 분리
        if (PasswordValidator.isValid(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid password");
        }
    }

    public String getUsername() {
        return username;
    }
}

class PasswordValidator {
    public static boolean isValid(String password) {
        return password != null && password.length() >= 6;
    }
}
public class SRPDemo {
    public static void main(String[] args) {
        User user = new User("Alice");
        user.setPassword("df"); // 유효한 패스워드
        System.out.println(user.getUsername());
    }
}
