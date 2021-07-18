package ec.edu.ups.p58.pw.demoappdocker;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.p58.pw.controlador.UserFacade;


import ec.edu.ups.p58.pw.model.User;

@Path("/hola")
public class HolaMundoService {


	@EJB
	private UserFacade ejbUserFacade;
	
	
	@GET
	@Produces("application/json")
	public String getSaludo() {
		return "{ \"mensaje\": \"Hola mundo\" }";
	}
	
	
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<User> listProductos() {
		return ejbUserFacade.findAll();

	}

	@POST
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User saveUser(User user) {
		ejbUserFacade.create(user);
		return user;

	}
	
	
	
}
