package com.example.ocr.Repository;
import org.springframework.stereotype.Repository;
import com.example.ocr.Model.OcrUser;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface OcrUserRepositoryextends CrudRepository<OcrUser,String> {
    OcrUser findOcrUsersByUsername(String username);

}
