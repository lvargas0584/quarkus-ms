package com.lamark.business.triyacom.core.client;

import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.shared.dto.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
@RequestScoped
@RegisterRestClient(configKey = "business-command")
@Path("/business/v1/command")
public interface BusinessCommandClient {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/subscribe")
    ResponseSubscribeDto subscribe(SubscriptionDto subscriptionDto) throws BaseException;

    @PUT
    @Path("/renew")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    SubscriptionResourceDto renew(SubscriptionDataDto data);

    @PUT
    @Path("/cancel")
    Response cancel(CancellationDto cancellationDto) throws BaseException;

    @PUT
    @Path("/suspend")
    @Consumes("application/json")
    public Response suspend( SuspendDto suspendDto );
}
