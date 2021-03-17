package com.newjob.testtask.db.entity;

import javax.persistence.*;


@Entity
public class ReverseVowels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rvrsvalue")
    private String reverseValue;

    public ReverseVowels(String reverseValue) {
        this.reverseValue = reverseValue;
    }

    public ReverseVowels() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReverseValue() {
        return reverseValue;
    }

    public void setReverseValue(String reverseValue) {
        this.reverseValue = reverseValue;
    }
}
