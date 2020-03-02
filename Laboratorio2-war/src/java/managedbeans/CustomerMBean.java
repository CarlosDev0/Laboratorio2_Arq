/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import Session.CustomerFacadeLocal;
import Session.CustomerManager;
import entities.Customer;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author USER
 */
@ManagedBean
@Named(value = "customerMBean")
@RequestScoped
public class CustomerMBean {

    @EJB
    private CustomerManager customerManager;

    @EJB
    private CustomerFacadeLocal customerFacade;
    
    private int customer_id;
    private String first_name;
    
    private Customer customer;
    private List<Customer> customers;
  
    public CustomerMBean() {
        customer = new Customer();
    }
   private void setCustomer_id(int id){
       customer_id=id;
   }
   private int getCustomer_id(){
       return customer_id;
   }
   private void setFirst_name(String _first_name){
       first_name=_first_name;
   }
   private String getFirst_name(){
       return first_name;
   }
    public List<Customer> getCustomers(){
        return customerFacade.findAll();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<Customer> findAll(){
        List<Customer> lista = customerManager.getAllCustomers();
        customers = lista;
        return lista;
    }
}
