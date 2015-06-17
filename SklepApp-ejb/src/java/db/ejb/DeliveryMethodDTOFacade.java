/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.ejb;

import db.model.DeliveryMethodDTO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author krzysztof
 */
@Stateless
public class DeliveryMethodDTOFacade extends AbstractFacade<DeliveryMethodDTO> {
    @PersistenceContext(unitName = "SklepAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DeliveryMethodDTOFacade() {
        super(DeliveryMethodDTO.class);
    }
    
}
