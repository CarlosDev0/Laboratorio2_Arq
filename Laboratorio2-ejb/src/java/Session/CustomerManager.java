/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

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
@Stateless
//@LocalBean
public class CustomerManager {
    @PersistenceContext
    private EntityManager em;
    
    public CustomerManager(){
    }
    public List<Customer> getAllCustomers() {
        List<Customer> lista=null;
        Customer customer = new Customer();
        customer.setFirstName("carlos");
        customer.setEmail("emailCARLOS@");
        lista.add(customer);
        Query query = em.createNamedQuery("Customer.findAll");
        //return query.getResultList();
        return lista;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public Customer update(Customer customer) {
        return em.merge(customer);
    }
     public void persist(Object object){
        em.persist(object);
    }
}
