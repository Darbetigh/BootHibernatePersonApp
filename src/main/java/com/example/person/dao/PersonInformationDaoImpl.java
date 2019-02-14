package com.example.person.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.person.model.PersonInformation;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonInformationDaoImpl implements PersonInformationDao {

    @Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    @Override
    public void save(PersonInformation person) {
        getSession().save(person);
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<PersonInformation> getPersonInformationList() {
        return getSession().createCriteria(PersonInformation.class).list();
    }

    @Override
    public PersonInformation getPerson(Integer id) {
        PersonInformation PersonInformation = (PersonInformation)getSession().get(PersonInformation.class, id);
        return PersonInformation;
    }
    @Override
    public void updatePerson(PersonInformation person) {
        getSession().update(person);

    }
    @Override
    public void deletePerson(PersonInformation person) {
        getSession().delete(person);
    }



}
