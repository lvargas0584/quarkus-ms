package com.lamark.business.triyacom.core.client;

import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.shared.dto.RegistrationDto;
import com.lamark.shared.dto.RetryDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@RequestScoped
@RegisterRestClient(configKey = "data-triyakom")
@Path("/data/v1/triyacom")
public interface DataTriyakomClient {

    @GET
    @Path("/registration/findByPushId/{pushId}")
    RegistrationDto findByPushId(@PathParam("pushId") String pushId);

    @GET
    @Path("/retry/findRetryById/{id}")
    @Consumes("application/json")
    RetryDto findRetryById(@PathParam("id") Long id);

    @POST
    @Path("/retry/save")
    void saveRetry(RetryDto userRetryDto);

    @POST
    @Path("registration")
    public String saveRegistration(RegistrationDto registration) throws BaseException;

    @POST
    @Path("/retry/update")
    public void updateRetry(RetryDto retryDto);

}
