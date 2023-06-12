package org.acme.security.keycloak.authorization;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/public")
public class PublicResource {

    @GET
    public String serve() {
        // no-op
		
		 return "Hello my Test Keycloak";
    }
}
