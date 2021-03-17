package com.newjob.testtask.service;

import com.newjob.testtask.db.entity.ReverseVowels;

public interface ReverseVowelsService {

    void addReverseVowels(ReverseVowels reverseVowels);
    ReverseVowels getReverseVowelesById(int id);

}
