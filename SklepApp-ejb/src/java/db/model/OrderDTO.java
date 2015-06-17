/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author krzysztof
 */
@Entity
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ClientDTO orderClient;
    @ManyToOne
    private DeliveryMethodDTO delivery;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar submitedOn;
    @OneToMany(mappedBy = "order")
    private List<OrderItemDTO> orderItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDTO)) {
            return false;
        }
        OrderDTO other = (OrderDTO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.model.OrderDTO[ id=" + id + " ]";
    }

    /**
     * @return the orderClient
     */
    public ClientDTO getOrderClient() {
        return orderClient;
    }

    /**
     * @param orderClient the orderClient to set
     */
    public void setOrderClient(ClientDTO orderClient) {
        this.orderClient = orderClient;
    }

    /**
     * @return the delivery
     */
    public DeliveryMethodDTO getDelivery() {
        return delivery;
    }

    /**
     * @param delivery the delivery to set
     */
    public void setDelivery(DeliveryMethodDTO delivery) {
        this.delivery = delivery;
    }

    /**
     * @return the submitedOn
     */
    public Calendar getSubmitedOn() {
        return submitedOn;
    }

    /**
     * @param submitedOn the submitedOn to set
     */
    public void setSubmitedOn(Calendar submitedOn) {
        this.submitedOn = submitedOn;
    }

    /**
     * @return the orderItems
     */
    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    /**
     * @param orderItems the orderItems to set
     */
    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
    
}
