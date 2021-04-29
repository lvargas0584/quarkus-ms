package com.lamark.business.triyacom.core.client;

import com.lamark.business.triyacom.core.dto.RequestOperator;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;

@RegisterRestClient(configKey = "handler-pbp")
@Path("/v1/integration-management/pbp")
public interface PbpClient {

    @POST
    @Path("/inform")
    void send(RequestOperator requestPbp);





}
