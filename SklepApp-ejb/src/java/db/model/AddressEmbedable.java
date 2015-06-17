/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author krzysztof
 */
@Embeddable
public class AddressEmbedable implements Serializable {
    private static final long serialVersionUID = 1L;
    private String streetLine;
    private String city;
    private String zipCode;

    /**
     * @return the streetLine
     */
    public String getStreetLine() {
        return streetLine;
    }

    /**
     * @param streetLine the streetLine to set
     */
    public void setStreetLine(String streetLine) {
        this.streetLine = streetLine;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    @Override
    public String toString(){
        return streetLine+", "+zipCode+" "+city;
    }
    
}
