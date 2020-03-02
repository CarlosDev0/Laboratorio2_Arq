/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author USER
 */

@LocalBean
@Stateless
public class customerManager {

    @PersistenceContext(unitName = "Sakila-ejbPU")
    private EntityManager em;

    public List<Customer> getAllCustomers() {
        List<Customer> lista=null;
        Customer customer = null;
        customer.setFirstName("carlos");
        customer.setLastName("sanchez");
        customer.setEmail("carlosEmail@");
        lista.add(customer); 
        return lista;
        
      /*
      Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList(); */
    }
    
    public Customer update(Customer customer){
        return em.merge(customer);
    }

    public void persist(Object object) {
        em.persist(object);
    }
    public customerManager(){
        
    }
  
}
