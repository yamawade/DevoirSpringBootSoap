package com.groupeisi.DevoirSoap.endpoint;

import com.groupeisi.DevoirSoap.model.GetSectorRequest;
import com.groupeisi.DevoirSoap.model.GetSectorResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SectorEndpoint {

    private static final String NAMESPACE_URI = "http://groupeisi.com/DevoirSoap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSectorRequest")
    @ResponsePayload
    public GetSectorResponse getSector(@RequestPayload GetSectorRequest request) {
        GetSectorResponse response = new GetSectorResponse();

        // Tu peux remplacer cette logique par un appel réel à un service
        if (request.getId() == 1) {
            response.setName("Informatique");
        } else {
            response.setName("Inconnu");
        }

        return response;
    }
}
