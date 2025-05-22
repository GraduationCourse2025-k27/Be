package com.kltn.medicalwebsite.service;

import com.kltn.medicalwebsite.entity.CustomerSupport;
import com.kltn.medicalwebsite.entity.New;
import com.kltn.medicalwebsite.repository.CustomerSupportRepository;
import com.kltn.medicalwebsite.repository.NewsRepository;
import com.kltn.medicalwebsite.request.NewRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class NewsServiceImlp implements  NewService{


    private NewsRepository repository;
    private CustomerSupportRepository customerSupportRepository;



    public NewsServiceImlp(NewsRepository repository, CustomerSupportRepository customerSupportRepository) {
        this.repository = repository;
        this.customerSupportRepository = customerSupportRepository;
    }

    @Override
    public New createNews(NewRequest news) {
        CustomerSupport customerSupport = customerSupportRepository.findById(news.getCustomerSupportId()).orElseThrow(() -> new RuntimeException("not found with id customerSupport :"+news.getCustomerSupportId()));
        New  createNew = new New();
        createNew.setContent(news.getContent());
        createNew.setImagePath(news.getImagePath());
        createNew.setTitle(news.getTitle());
        createNew.setPublisherAt(LocalDateTime.now());
        createNew.setCustomerSupport(customerSupport);

        return repository.save(createNew);
    }

    @Override
    public New updateNews(NewRequest updateNew, Long id) {
        New exstingNew = findNewById(id);
        CustomerSupport customerSupport = customerSupportRepository.findById(updateNew.getCustomerSupportId()).orElseThrow(() -> new RuntimeException("customer not found with id :"+id));
        exstingNew.setPublisherAt(LocalDateTime.now());
        exstingNew.setCustomerSupport(customerSupport);
        if(updateNew.getContent() != null){
            exstingNew.setContent(updateNew.getContent());
        }
        if(updateNew.getImagePath() != null){
            exstingNew.setImagePath(updateNew.getImagePath());
        }
        if(updateNew.getTitle() != null){
            exstingNew.setTitle(updateNew.getTitle());
        }

        return repository.save(exstingNew);
    }

    @Override
    public String deleteNewsById(Long id) {
        Optional<New> exstingNew = repository.findById(id);
        if(exstingNew.isPresent()){
            repository.deleteById(id);
            return  "deleted success with id :"+id;
        }else {
            throw  new RuntimeException("Not found with id New:"+id);
        }
    }

    @Override
    public List<New> findAllNewsBySupportId(Long supportId) {
        List<New> news = repository.getNewsByCustomerSupportId(supportId);
        news = news.stream().sorted(Comparator.comparing(New::getId).reversed()).collect(Collectors.toList());
        return news;
    }

    @Override
    public New findNewById(Long id) {
        New exstingNew = repository.findById(id).orElseThrow(() -> new RuntimeException("not found with new id:"+id));

        return exstingNew;
    }
}
