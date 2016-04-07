package service;

import entities.Bus;
import javax.ejb.*;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BusDao {

    @PersistenceContext(unitName = "Depot")
    private EntityManager em;

    public void saveBus(Bus bus)throws SQLException, NamingException{
        Query query = em.createNativeQuery("{call saveBus(?,?,?,?,?)}",
                Bus.class)
                .setParameter(1, bus.getRegNumber())
                .setParameter(2, bus.getMark())
                .setParameter(3, bus.getModel())
                .setParameter(4, bus.isState())
                .setParameter(5, bus.getDescription());
        int result = query.executeUpdate();
        if (result == 0){
            throw new SQLException();
        }
    }


    public ArrayList<Bus> findByMark (String mark) throws SQLException, NamingException {
        Query query = em.createNativeQuery("{call findByMark(?)}",
                Bus.class)
                .setParameter(1, mark);
        return new ArrayList<Bus>(query.getResultList());
    }

    public ArrayList<Bus> findByRegNumber (String regNumber) throws SQLException, NamingException{
        Query query = em.createNativeQuery("{call findByRegNumber(?)}",
                Bus.class)
                .setParameter(1, regNumber);
        return new ArrayList<Bus>(query.getResultList());
    }

    public ArrayList<Bus> findAll()throws SQLException, NamingException {
        Query query = em.createNativeQuery("{call getAllBuses()}", Bus.class);
        return new ArrayList<Bus>(query.getResultList());
    }
}
