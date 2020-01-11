package com.example.ocr.Repository;
import com.example.ocr.Model.OcrTextMobile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcrTextMobileRepository extends CrudRepository<OcrTextMobile,Integer> {
}
