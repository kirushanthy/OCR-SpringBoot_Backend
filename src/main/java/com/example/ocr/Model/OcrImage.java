package com.example.ocr.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("OcrImage")
public class OcrImage {
    @Id
    private int imgid;
    private String username;
    private String imgPath;

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public OcrImage(String username, String imgPath) {
        this.username = username;
        this.imgPath = imgPath;
    }
    public OcrImage(int imgid, String username, String imgPath) {
        this.imgid = imgid;
        this.username = username;
        this.imgPath = imgPath;
    }

    public OcrImage() {
    }
}
