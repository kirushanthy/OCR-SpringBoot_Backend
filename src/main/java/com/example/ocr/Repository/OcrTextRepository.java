package com.example.ocr.Repository;
import org.springframework.stereotype.Repository;
import com.example.ocr.Model.OcrText;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface OcrTextRepository extends CrudRepository<OcrText,Integer>{
}
