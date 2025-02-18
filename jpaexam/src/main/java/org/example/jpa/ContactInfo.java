package org.example.jpa;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
public class ContactInfo {
    private String email;
    private String phoneNumber;

    public ContactInfo(String phoneNumber, String eMail) {
        this.phoneNumber = phoneNumber;
        this.email = eMail;
    }
}