package com.PersistentObject;

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager daoManager = new DAOManager();
        daoManager.setPersonDAO(new MySQLPersonDAO());
        
        try {
            daoManager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
