package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.MedicalType;
import com.kltn.medicalwebsite.response.MedicalTypeReviewUsageResponse;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface MedicalTypeService {

    MedicalType create(MedicalType medicalType);
    MedicalType update(MedicalType medicalType,Long id);
    MedicalType findMedicalTypeById(Long id);

    List<MedicalType> getAllMedicalType();

    List<MedicalType> findMedicalTypeByNameService(String nameService);

    List<Map<String, Object>> getMedicalTypeUsage();

    List<MedicalTypeReviewUsageResponse> getMedicalTypeReviews();


    void delete(Long id);



}
