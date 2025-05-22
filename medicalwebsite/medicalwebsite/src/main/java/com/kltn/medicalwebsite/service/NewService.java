package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.New;
import com.kltn.medicalwebsite.request.NewRequest;

import java.util.List;

public interface NewService {

    New createNews(NewRequest news);
    New updateNews(NewRequest updateNew,Long id);
    String deleteNewsById(Long id);
    List<New> findAllNewsBySupportId(Long supportId);
    New findNewById(Long id);
}
