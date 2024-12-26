package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumerExample {
    private static final List<Integer> sharedList = new ArrayList<>(); // 공유 자원
    private static final int MAX_SIZE = 5; // 리스트 최대 크기
    private static final Object lock = new Object(); // 동기화를 위한 lock 객체
    private static final Random random = new Random(); // 랜덤 객체 생성

    // 생산자 스레드
    static class Producer extends Thread {
        @Override
        public void run() {
            int value = 0;
            while (true) {
                synchronized (lock) {
                    while (sharedList.size() >= MAX_SIZE) {
                        try {
                            System.out.println("생산자가 대기 중... (리스트가 가득 찼습니다)");
                            lock.wait(); // 리스트가 가득 찬 경우 대기
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("생산자가 데이터 추가: " + value);
                    sharedList.add(value++); // 데이터 추가
                    lock.notify(); // 소비자에게 알림
                }

                try {
                    Thread.sleep(100); // 생산 속도 조절
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 소비자 스레드
    static class Consumer extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (sharedList.isEmpty()) {
                        try {
                            System.out.println("소비자가 대기 중... (리스트가 비어 있습니다)");
                            lock.wait(); // 리스트가 비어 있는 경우 대기
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = sharedList.remove(0); // 데이터 제거
                    System.out.println("소비자가 데이터 소비: " + value);
                    lock.notify(); // 생산자에게 알림
                }

                try {
                    // 소비 속도를 0~1000ms 사이 랜덤으로 설정
                    int delay = random.nextInt(1001); // 0~1000 사이의 랜덤 값 생성
                    Thread.sleep(delay);
                    System.out.println("소비자가 " + delay + "ms 동안 대기 후 다시 실행");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        producer.start();
        consumer.start();
    }
}
