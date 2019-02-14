package com.example.person.dao;

import java.util.List;

import com.example.person.model.PersonInformation;

public interface PersonInformationDao {

    PersonInformation getPerson(Integer id);

    void save(PersonInformation person);

    List<PersonInformation> getPersonInformationList();

    void updatePerson(PersonInformation person);

    void deletePerson(PersonInformation person);

}
