package com.example.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    //    @Autowired
    //    DB db;

    private DB db;

    //this is constructor injection
    //either use constructor or autowired
    //prefer constructor dependency because we can make field immutable using final keyword
    DBService(DB db){
        this.db=db;
    }

    String getData(){

        return db.getData();
    }
}
