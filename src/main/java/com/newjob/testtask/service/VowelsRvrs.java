package com.newjob.testtask.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

@Component
public class VowelsRvrs {


    private static final ArrayList<Character> arr = new ArrayList<>(Arrays
            .asList('a', 'e', 'o', 'i', 'o', 'u', 'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'));



    @SuppressWarnings("rawtypes")
    public LinkedList createValueQueue(String str) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            if (arr.contains(Character.toLowerCase(c))) {
                list.add(c);
            }
        } return list;
    }

    @SuppressWarnings("rawtypes")
    public String replaceVolve(String str, LinkedList list) {
        StringBuilder newStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (arr.contains(c)) {
                newStr.append(list.removeLast());
            } else {
                newStr.append(c);
            }
        }
        return newStr.toString();
    }

}
