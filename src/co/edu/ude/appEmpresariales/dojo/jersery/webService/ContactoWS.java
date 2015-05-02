package co.edu.ude.appEmpresariales.dojo.jersery.webService;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.ude.appEmpresariales.dojo.jersery.pojos.Contacto;

@Path("/contacto")
public class ContactoWS {
	private List<Contacto> misContactos;
	
	public ContactoWS() {
        super();
        this.misContactos=new ArrayList<Contacto>();
        Contacto contacto1=new Contacto(1,"Jorge","Cazorla","5723438","jorge@gmail.com");
        Contacto contacto2= new Contacto(2, "Pedro", "Perez", "5903033", "pedro@gmail.com");
        Contacto contacto3= new Contacto(3, "Carlos", "Figueroa", "4444445", "carlos@gmail.com");
        misContactos.add(contacto1);
        misContactos.add(contacto2);
        misContactos.add(contacto3);
    }
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/todosContactos")
	public List<Contacto> obtenerContactos(){
		return misContactos;
	}
}
