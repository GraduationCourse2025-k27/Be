package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.entity.New;
import com.kltn.medicalwebsite.request.NewRequest;
import com.kltn.medicalwebsite.service.NewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewController {

    private NewService newService;

    public NewController(NewService newService) {
        this.newService = newService;
    }


    @GetMapping("/list")
    public ResponseEntity<List<New>> getAllNews(@RequestParam("SupportId")Long supportId){
        List<New> news = newService.findAllNewsBySupportId(supportId);
        if(news.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return  new ResponseEntity<>(news,HttpStatus.OK);
        }
    }

    @PostMapping("/create")
    public  ResponseEntity<New> createNews(@RequestBody NewRequest newRequest){
        New createnew = newService.createNews(newRequest);
        return  new ResponseEntity<>(createnew,HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<New> updateNews(@RequestBody NewRequest newRequest,@PathVariable("id")Long id){
        New updateNew = newService.updateNews(newRequest,id);
        return  new ResponseEntity<>(updateNew,HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public  ResponseEntity<New> findNewById(@PathVariable("id")Long id){
        New exstingNew = newService.findNewById(id);
        return  new ResponseEntity<>(exstingNew,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteNewById(@PathVariable("id")Long id){
        String exstingNew = newService.deleteNewsById(id);
        return  new ResponseEntity<>(exstingNew,HttpStatus.OK);
    }

}
