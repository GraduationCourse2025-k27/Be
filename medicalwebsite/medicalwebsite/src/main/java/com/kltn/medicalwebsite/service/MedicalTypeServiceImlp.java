package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.MedicalType;
import com.kltn.medicalwebsite.exception.MedicalTypeException;
import com.kltn.medicalwebsite.repository.MedicalTypeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MedicalTypeServiceImlp implements  MedicalTypeService{


    private MedicalTypeRepository medicalTypeRepository;

    public MedicalTypeServiceImlp(MedicalTypeRepository medicalTypeRepository) {
        this.medicalTypeRepository = medicalTypeRepository;
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
        return medicalTypeRepository.save(existingMedicalType);
    }

    @Override
    public MedicalType findMedicalTypeById(Long id) {
        MedicalType medicalType = medicalTypeRepository.findById(id).orElseThrow(() -> new MedicalTypeException("Medical type not found with Id :"+id));
        return medicalTypeRepository.save(medicalType);
    }

    @Override
    public List<MedicalType> getAllMedicalType() {
        return medicalTypeRepository.findAll();
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
