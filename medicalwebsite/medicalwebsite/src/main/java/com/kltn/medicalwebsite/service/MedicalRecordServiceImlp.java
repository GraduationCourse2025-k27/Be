package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.entity.Client;
import com.kltn.medicalwebsite.entity.Doctor;
import com.kltn.medicalwebsite.entity.MedicalRecord;
import com.kltn.medicalwebsite.exception.ClientException;
import com.kltn.medicalwebsite.exception.DoctorException;
import com.kltn.medicalwebsite.exception.MedicalRecordException;
import com.kltn.medicalwebsite.repository.ClientRepository;
import com.kltn.medicalwebsite.repository.DoctorRepository;
import com.kltn.medicalwebsite.repository.MeidcalRecordRepository;
import com.kltn.medicalwebsite.request.MedicalRecordRequest;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MedicalRecordServiceImlp implements MedicalRecordService {


    private MeidcalRecordRepository medicalRecordRepository;

    private DoctorRepository doctorRepository;
    private ClientRepository clientRepository;

    public MedicalRecordServiceImlp(MeidcalRecordRepository medicalRecordRepository, DoctorRepository doctorRepository, ClientRepository clientRepository) {
        this.medicalRecordRepository = medicalRecordRepository;
        this.doctorRepository = doctorRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    public MedicalRecord addMedicalRecord(MedicalRecordRequest medicalRecord) {
        Doctor doctor = doctorRepository.findById(medicalRecord.getDoctorId()).orElseThrow(() -> new DoctorException("Doctor not found"));
        Client client = clientRepository.findById(medicalRecord.getClientId()).orElseThrow(() -> new ClientException("Client not found"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localdate = LocalDate.parse(medicalRecord.getBirthDatePatient(), formatter);
        LocalTime now = LocalTime.now();
        LocalDateTime birthDate = LocalDateTime.of(localdate, now);
        MedicalRecord newMedicalRecord = new MedicalRecord();
        newMedicalRecord.setClient(client);
        newMedicalRecord.setDoctor(doctor);
        newMedicalRecord.setDiagnosis(medicalRecord.getDiagnosis());
        newMedicalRecord.setPrescription(medicalRecord.getPrescription());
        newMedicalRecord.setBirthDatePatient(birthDate);
        newMedicalRecord.setNote(medicalRecord.getNote());
        newMedicalRecord.setGender(medicalRecord.getGender());
        newMedicalRecord.setNamePatient(medicalRecord.getNamePatient());
        newMedicalRecord.setCreatedAt(LocalDateTime.now());
        return medicalRecordRepository.save(newMedicalRecord);
    }

    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecordRequest medicalRecordRequest, Long medicalRecordId) {
        MedicalRecord record = findMedicalRecordById(medicalRecordId);
        Client client = clientRepository.findById(medicalRecordRequest.getClientId()).orElseThrow(() -> new ClientException("client not found"));
        Doctor doctor = doctorRepository.findById(medicalRecordRequest.getDoctorId()).orElseThrow((() -> new DoctorException("doctor not found")));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localdate = LocalDate.parse(medicalRecordRequest.getBirthDatePatient(), formatter);
        LocalTime now = LocalTime.now();
        LocalDateTime birthDate = LocalDateTime.of(localdate, now);
        record.setCreatedAt(LocalDateTime.now());
        record.setClient(client);
        record.setDoctor(doctor);
        if (medicalRecordRequest.getDiagnosis() != null) {
            record.setDiagnosis(medicalRecordRequest.getDiagnosis());

        }
        if (medicalRecordRequest.getNote() != null) {
            record.setNote(medicalRecordRequest.getNote());

        }
        if (medicalRecordRequest.getNamePatient() != null) {
            record.setNamePatient(medicalRecordRequest.getNamePatient());

        }
        if (medicalRecordRequest.getGender() != null) {
            record.setGender(medicalRecordRequest.getGender());

        }
        if (medicalRecordRequest.getPrescription() != null) {
            record.setPrescription(medicalRecordRequest.getPrescription());

        }
        if (medicalRecordRequest.getBirthDatePatient() != null) {
            record.setBirthDatePatient(birthDate);
        }

        return medicalRecordRepository.save(record);
    }

    @Override
    public List<MedicalRecord> findMedicalRecordByDoctor(Long doctorId, String namePatient) {
        List<MedicalRecord> medicalRecords = medicalRecordRepository.findMedicalRecordByDoctor(doctorId);
        if (namePatient != null) {
            medicalRecords = medicalRecords.stream().filter((medicalRecord -> medicalRecord.getNamePatient().toLowerCase().contains(namePatient.toLowerCase()))).collect(Collectors.toList());
        }
        medicalRecords = medicalRecords.stream().sorted(Comparator.comparing(MedicalRecord::getId).reversed()).collect(Collectors.toList());
        return medicalRecords;
    }

    @Override
    public List<MedicalRecord> findMedicalRecordByUser(Long userId) {
        List<MedicalRecord> medicalRecords = medicalRecordRepository.findMedicalRecordByClient(userId);
        medicalRecords = medicalRecords.stream().sorted(Comparator.comparing(MedicalRecord::getId).reversed()).collect(Collectors.toList());
        return medicalRecords;
    }

    @Override
    public MedicalRecord findMedicalRecordById(Long medicalRecordId) {
        MedicalRecord medicalRecord = medicalRecordRepository.findById(medicalRecordId).orElseThrow(() -> new MedicalRecordException("MedicalRecord not found with :" + medicalRecordId));
        return medicalRecord;
    }
}
