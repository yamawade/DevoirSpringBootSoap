package com.groupeisi.DevoirSoap.endpoint;

import com.groupeisi.DevoirSoap.model.GetClasseDevoirRequest;
import com.groupeisi.DevoirSoap.model.GetClasseDevoirResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClasseDevoirEndpoint {

    private static final String NAMESPACE_URI = "http://groupeisi.com/DevoirSoap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetClasseDevoirRequest")
    @ResponsePayload
    public GetClasseDevoirResponse getClasse(@RequestPayload GetClasseDevoirRequest request) {
        GetClasseDevoirResponse response = new GetClasseDevoirResponse();

        // Simule un retour basé sur l'id
        if (request.getId() == 1) {
            response.setClassName("GL");
            response.setDescription("Génie Logiciel");
        } else {
            response.setClassName("???");
            response.setDescription("Inconnu");
        }

        return response;
    }
}
