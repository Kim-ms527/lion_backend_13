package day12.exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    // 파일 경로 상수
    private static final String FILE_PATH = "src/day12/exam/phone.txt";

    // 연락처 정보를 저장하는 내부 클래스
    static class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return name + " " + phoneNumber;
        }
    }

    // 연락처 입력 메서드
    public List<Contact> getContactsFromUser(int numberOfContacts) {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();

        for (int i = 0; i < numberOfContacts; i++) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("전화번호: ");
            String phoneNumber = scanner.nextLine();
            contacts.add(new Contact(name, phoneNumber));
        }
        return contacts;
    }

    // 파일에 연락처 저장
    public void saveContactsToFile(List<Contact> contacts) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(FILE_PATH))) {
            for (Contact contact : contacts) {
                writer.println(contact);
            }
            System.out.println("... 전화번호가 " + FILE_PATH + "에 저장되었습니다.");
        } catch (IOException e) {
            System.err.println("파일에 저장하는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    // 파일에서 연락처 읽기
    public void readContactsFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println(FILE_PATH + " 파일이 존재하지 않습니다.");
            return;
        }

        System.out.println("\n" + FILE_PATH + "의 내용은 다음과 같습니다...");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    // 메인 실행 메서드
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        int numberOfContacts = 3;

        // 1. 사용자로부터 연락처 입력받기
        List<Contact> contacts = phoneBook.getContactsFromUser(numberOfContacts);

        // 2. 연락처를 파일에 저장
        phoneBook.saveContactsToFile(contacts);

        // 3. 파일에서 연락처 읽어와 출력
        phoneBook.readContactsFromFile();
    }
}

