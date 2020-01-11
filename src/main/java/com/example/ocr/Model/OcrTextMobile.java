package com.example.ocr.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("OcrTextMobile")
public class OcrTextMobile {
    @Id
    private int textid;
    private int imageid;
    private String textresult;

    public int getTextid() {
        return textid;
    }

    public void setTextid(int textid) {
        this.textid = textid;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getTextresult() {
        return textresult;
    }

    public void setTextresult(String textresult) {
        this.textresult = textresult;
    }
    public OcrTextMobile() {
    }

    public OcrTextMobile(int textid, int imageid, String textresult) {
        this.textid = textid;
        this.imageid = imageid;
        this.textresult = textresult;
    }
}
