package com.example.enlections.service;

import com.example.enlections.entity.Lection;
import com.example.enlections.repository.LectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LectionService {

    private final LectionRepository lectionRepository;


    //create
    public void createClass(String title, String level){
        lectionRepository.save(new Lection(title,level));
    }
    //read
    public List<Lection> allLection(){
        return lectionRepository.findAll();
    }

    //update
    public void addUserToLection(Long id,String email){

        Lection lection = lectionRepository.getReferenceById(id);
        String emails = lection.getEmails();
        String emailToAdd = ","+email;
        if (emails==null){
            emails = email;
        }else {
            emails += emailToAdd;
        }
       lection.setEmails(emails);
        lectionRepository.saveAndFlush(lection);
    }

    //delete
    public void deleteLection(Long id){
        lectionRepository.deleteById(id);
    }


    public List<String> emailsOfStudentsOnLection(Long id){
        List<String> emails = List.of(lectionRepository.getReferenceById(id).getEmails().split(","));
        return emails;
    }
}
