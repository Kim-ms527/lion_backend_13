package org.example.jpa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JPAUtil {
    private static final EntityManagerFactory emfInstance =
            Persistence.createEntityManagerFactory("UserPU");

    // Java 어플리케이션이 종료될 때 자동으로 close()메소드가 호출되도록 합니다.
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (emfInstance != null) {
//                System.out.println("---- emf close ---");
                log.info("---- emf close ---");
                emfInstance.close();
            }
        }));
    }

    private JPAUtil() {}

    public static EntityManagerFactory getEntityManagerFactory() {
        return emfInstance;
    }
}
