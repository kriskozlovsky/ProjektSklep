/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author krzysztof
 */
@Entity
@Table(name="CLIENT", schema="SKLEP")

public class ClientDTO extends PersonDTO{
    private static final long serialVersionUID = 1L;
    @Embedded
    private AddressEmbedable address;
    @OneToMany(mappedBy = "orderClient", cascade = CascadeType.ALL)
    private List<OrderDTO> orders;
}
