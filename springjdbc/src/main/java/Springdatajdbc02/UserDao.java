package Springdatajdbc02;

public interface UserDao {
    void createAndUpdateUser(String name, String email, String newEmail);
    public void addUser(String name, String email);
    public void updateUser(String name, String newEmail);
}
