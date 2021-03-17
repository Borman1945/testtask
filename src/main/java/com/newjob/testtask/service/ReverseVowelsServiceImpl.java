package com.newjob.testtask.service;

import com.newjob.testtask.db.entity.ReverseVowels;
import com.newjob.testtask.db.entity.repository.ReverseVowelsRepository;
import org.springframework.stereotype.Service;

@Service
public class ReverseVowelsServiceImpl implements ReverseVowelsService{

    private final ReverseVowelsRepository reverseVowelsRepository;

    public ReverseVowelsServiceImpl(ReverseVowelsRepository reverseVowelsRepository) {
        this.reverseVowelsRepository = reverseVowelsRepository;
    }

    @Override
    public void addReverseVowels(ReverseVowels reverseVowels) {
        reverseVowelsRepository.save(reverseVowels);
    }

    @Override
    public ReverseVowels getReverseVowelesById(int id) {
        return reverseVowelsRepository.getOne(id);
    }
}
