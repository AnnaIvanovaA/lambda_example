package com.jet.reproduce;

import com.jet.breakpoints.User;

import java.util.ArrayList;
import java.util.List;

public class VariablesSearch {

    public static void main(String[] args) {

        VariablesSearch variablesSearch = new VariablesSearch();
        List<String> user = variablesSearch.createList("user");
        List<String> person = variablesSearch.createList("person");
        List<String> team = variablesSearch.createList("team");
        List<String> captain = variablesSearch.createList("captain");
        List<String> major = variablesSearch.createList("major");


        user.set(10, "expand");
        user.set(50, "search");
        person.set(10, "team");
        person.set(50, "replace");
        captain.set(10, "search");
        captain.set(50, "expand");
        team.set(10, "expand");
        team.set(50, "expand");
        major.set(10, "expand");
        major.set(50, "search");

        List<List<String>> namesList = new ArrayList<>();


        System.out.println();
    }

    public List<String> createList(String listName){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(listName);
        }
        return list;
    }

}
