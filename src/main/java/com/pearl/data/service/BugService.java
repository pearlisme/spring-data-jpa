package com.pearl.data.service;

import com.pearl.data.Repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugService {

    @Autowired
    BugRepository bugRepository;

    public String findAll() {

        return bugRepository.findAll().stream().toString();
    }
}
