package com.example.ocr.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.Email;

@Document("OcrUser")
public class OcrUser {
    @Id
    private String username;
    private String email;
    private String password;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OcrUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public OcrUser() {
    }

    public OcrUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
