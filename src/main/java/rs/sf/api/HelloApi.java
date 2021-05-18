package rs.sf.api;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import rs.sf.service.HelloService;

@Path("v1/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HelloApi {

	@Inject
	private HelloService helloService;

	@GET
	@Path("/hello")
	public Response hello() {
		return Response.ok(helloService.hello()).build();
	}

}
