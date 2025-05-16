package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.MedicalType;
import com.kltn.medicalwebsite.entity.Review;
import com.kltn.medicalwebsite.exception.MedicalTypeException;
import com.kltn.medicalwebsite.repository.AppointmentRepository;
import com.kltn.medicalwebsite.repository.MedicalTypeRepository;
import com.kltn.medicalwebsite.response.MedicalTypeReviewUsageResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MedicalTypeServiceImlp implements  MedicalTypeService{


    private MedicalTypeRepository medicalTypeRepository;

    private AppointmentRepository appointmentRepository;

    public MedicalTypeServiceImlp(MedicalTypeRepository medicalTypeRepository, AppointmentRepository appointmentRepository) {
        this.medicalTypeRepository = medicalTypeRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public MedicalType create(MedicalType medicalType) {
        medicalType.setCreateAt(LocalDateTime.now());
        return medicalTypeRepository.save(medicalType);
    }

    @Override
    public MedicalType update(MedicalType medicalType, Long id) {
        MedicalType existingMedicalType = medicalTypeRepository.findById(id).orElseThrow(() -> new MedicalTypeException("Medical Type not found with id:"+id));
        existingMedicalType.setNameService(medicalType.getNameService());
        existingMedicalType.setCreateAt(LocalDateTime.now());
        existingMedicalType.setPrice(medicalType.getPrice());
        existingMedicalType.setImagePath(medicalType.getImagePath());
        existingMedicalType.setDescription(medicalType.getDescription());
        return medicalTypeRepository.save(existingMedicalType);
    }

    @Override
    public MedicalType findMedicalTypeById(Long id) {
        MedicalType medicalType = medicalTypeRepository.findById(id).orElseThrow(() -> new MedicalTypeException("Medical type not found with Id :"+id));
        return medicalTypeRepository.save(medicalType);
    }

    @Override
    public List<MedicalType> getAllMedicalType() {
        List<MedicalType> medicalTypes = medicalTypeRepository.findAll();
        medicalTypes = medicalTypes.stream().sorted(Comparator.comparing(MedicalType::getId).reversed()).collect(Collectors.toList());
        return medicalTypes;
    }

    @Override
    public List<MedicalType> findMedicalTypeByNameService(String nameService) {
        List<MedicalType> medicalTypes = medicalTypeRepository.findAll();
        if("tongquat".contains(nameService)){
            medicalTypes =medicalTypes.stream().filter(medicalType -> medicalType.getNameService().contains("Tổng quát")).collect(Collectors.toList());
            return  medicalTypes;
        }
        if("xetnghiem".contains(nameService)){
            medicalTypes =medicalTypes.stream().filter(medicalType -> medicalType.getNameService().contains("Xét nghiệm")).collect(Collectors.toList());
            return  medicalTypes;
        }
        if("phauthuat".contains(nameService)){
            medicalTypes =medicalTypes.stream().filter(medicalType -> medicalType.getNameService().contains("Phẫu Thuật")).collect(Collectors.toList());
            return  medicalTypes;
        }
        if("sieuam".contains(nameService)){
            medicalTypes =medicalTypes.stream().filter(medicalType -> medicalType.getNameService().contains("Siêu âm")).collect(Collectors.toList());
            return  medicalTypes;
        }
        if("ungthu".contains(nameService)){
            medicalTypes =medicalTypes.stream().filter(medicalType -> medicalType.getNameService().contains("Ung thư")).collect(Collectors.toList());
            return  medicalTypes;
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> getMedicalTypeUsage() {
        // Lấy tất cả MedicalType
        List<MedicalType> medicalTypes = medicalTypeRepository.findAll();
        // Lấy số lần sử dụng từ Appointment
        List<Object[]> appointmentCounts = appointmentRepository.countAppointmentsByMedicalType();

        // Tạo map để lưu số lần sử dụng theo medicalTypeId
        Map<Long, Long> usageMap = new HashMap<>();
        for (Object[] result : appointmentCounts) {
            Long medicalTypeId = (Long) result[0];
            Long count = (Long) result[2];
            usageMap.put(medicalTypeId, count);
        }

        // Tạo danh sách kết quả
        List<Map<String, Object>> usageList = new ArrayList<>();
        for (MedicalType medicalType : medicalTypes) {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("id", medicalType.getId());
            resultMap.put("name", medicalType.getNameService());
            // Gán usage = 0 nếu không có cuộc hẹn
            resultMap.put("usage", usageMap.getOrDefault(medicalType.getId(), 0L));
            usageList.add(resultMap);
        }

        return usageList;
    }

    @Override
    public List<MedicalTypeReviewUsageResponse> getMedicalTypeReviews() {
        List<MedicalType> medicalTypes = medicalTypeRepository.findAll();
        return medicalTypes.stream().map(medicalType -> {
            MedicalTypeReviewUsageResponse response = new MedicalTypeReviewUsageResponse();
            response.setIdMedical(medicalType.getId());
            response.setNameService(medicalType.getNameService());
            List<Review> reviews = medicalType.getReviews();
            int totalReviews = reviews != null ? reviews.size() : 0 ;
            int goodReviews = reviews != null ? (int) reviews.stream().filter(review ->
                 review.getRate() != null && review.getRate() >= 4
            ).count() : 0 ;
            int badReviews = totalReviews - goodReviews;

            response.setAll(totalReviews);
            response.setGood(goodReviews);
            response.setBad(badReviews);
            return  response;
        }).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        MedicalType existingMedicalType = findMedicalTypeById(id);
        if(existingMedicalType != null){
            medicalTypeRepository.deleteById(id);
        }else {
            throw  new MedicalTypeException("Medical Type not found with id:"+id);
        }
    }
}
