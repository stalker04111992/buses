package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class PersonnelDao {

    @PersistenceContext(unitName = "Depot")
    private EntityManager em;



}
