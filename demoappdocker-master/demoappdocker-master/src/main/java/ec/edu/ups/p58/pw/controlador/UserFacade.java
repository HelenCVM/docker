package ec.edu.ups.p58.pw.controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.p58.pw.model.User;

@Stateless
public class UserFacade  extends AbstractFacade<User>{

	    @PersistenceContext(unitName = "demoappdockerPersistenceUnit")
	    private EntityManager em;
	    
	    public UserFacade() {
		  super(User.class);
	    }    

	    protected EntityManager getEntityManager() {
	        return em;
	    }
}
