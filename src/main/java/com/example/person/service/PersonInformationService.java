package com.example.person.service;

import com.example.person.model.PersonInformation;

import java.util.List;

public interface PersonInformationService {
    PersonInformation getPerson(Integer id);
    public void save(PersonInformation person);
    List<PersonInformation> getPersonInformationList();
    void updatePerson(PersonInformation person);
    void deletePerson(PersonInformation person);
}
