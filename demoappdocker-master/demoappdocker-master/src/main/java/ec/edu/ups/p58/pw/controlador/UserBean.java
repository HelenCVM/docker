package ec.edu.ups.p58.pw.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ec.edu.ups.p58.pw.model.User;
//http://localhost:8082/demoappdocker/Pacientedos.xhtml
@Named
@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private UserFacade ejbPacienteCabecera;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	
	private List<User> listaProductos;
	private User pac;
	
	public UserBean() {
		
	}
	

	public User getPac() {
		return pac;
	}


	public void setPac(User pac) {
		this.pac = pac;
	}


	@PostConstruct
	public void init() {
		//ejbProductoFacade.create(new Producto("Papel","Scot",1.35,1.12));
		//ejbProductoFacade.create(new Producto("Deja","Ariel",2.49,1.89));
		
		//listaProductos = ejbPacienteCabecera.findAll();
		
	}
	
	
	
	public UserFacade getEjbPacienteCabecera() {
		return ejbPacienteCabecera;
	}


	public void setEjbPacienteCabecera(UserFacade ejbPacienteCabecera) {
		this.ejbPacienteCabecera = ejbPacienteCabecera;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<User> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<User> listaProductos) {
		this.listaProductos = listaProductos;
	}


	public User registrarPacientes() {
		System.out.println("cedula"+this.firstName);
		System.out.println("nombre"+this.lastName);
		System.out.println("apellidos"+this.email);
		System.out.println("telefono"+this.address);
		User paciente= new User(this.firstName,this.lastName,this.email,this.address);
		ejbPacienteCabecera.create(paciente);
		return null;		
	}
	
	
			

	
	
}
