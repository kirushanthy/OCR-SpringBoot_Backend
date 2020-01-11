package com.example.ocr.Repository;
import org.springframework.stereotype.Repository;
import com.example.ocr.Model.OcrTextMobile;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface OcrTextMobileRepository extends CrudRepository<OcrTextMobile,Integer>{
}
