/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import entities.Customer;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.annotation.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.push.EventBusFactory;
import session.customerManager;

/**
 *
 * @author USER
 */
@Named(value = "customerMBean")
@ViewScoped
@ManagedBean
public class customerMBean implements Serializable {
    private static final long serialVersionUID = -2403138958014741653L;
@ManagedProperty(value="#{customerManager}")
private customerManager administradorCliente;

    @EJB
    private customerManager customerManager;
    private Customer customer;
    private List<Customer> customers;
    private String email;
    private Short customerId;
    private String firstName;
    private String lastName;
    private boolean active;
    private Date createDate;
    private Date lastUpdate;
    private Short addressId;
    private Short storeId;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Short getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public Short getStoreId() {
        return storeId;
    }

    public void setStoreId(Short storeId) {
        this.storeId = storeId;
    }
    /**
     * Creates a new instance of customerMBean
     */
    public customerMBean() {
        
        System.out.println("Va32 CMB");
        lastName = "Alzate";
        email = "Prueba1@";
        customerId = 1;
        firstName = "carlos2";
        active= true;
        addressId = 1;
        storeId=1;
        
        //customer.setLastName("Alzate");
        //customer.setEmail("prueba@");
       // customers.add(customer);
    }
    
    public customerManager getCustomers(){
    //public List<Customer> getCustomers(){
        customers = administradorCliente.getAllCustomers();
        return administradorCliente;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String _email){
        email = _email;
    }
    public String getValidation() {
        System.out.println("Va_130 CMB");
        return "Hola";
    }
}
