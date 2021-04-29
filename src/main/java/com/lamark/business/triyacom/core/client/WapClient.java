package com.lamark.business.triyacom.core.client;

import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.shared.dto.IntegrationDto;
import com.lamark.shared.dto.LamarkConfigDto;
import com.lamark.shared.dto.UserDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequestScoped
@RegisterRestClient(configKey = "data-core")
@Path("/data/v1/core")
public interface WapClient {
    @GET
    @Path("/config/{parentName}")
    @Produces("application/json")
    List<LamarkConfigDto> getConfig(@PathParam("parentName") String parentName);

    @GET
    @Path("/user/{msisdn}/{siteId}")
    public UserDto getUser(@PathParam("msisdn") String msisdn,
                           @PathParam("siteId") Integer siteId) throws BaseException, InvocationTargetException, IllegalAccessException ;

    @PUT
    @Path("/user")
    public Long updateUser(UserDto userDto) throws InvocationTargetException, IllegalAccessException, BaseException;


    @POST
    @Path("/integrationMsisdn/save")
    public void  saveInCorrelationTable(IntegrationDto integrationDto) throws BaseException, InvocationTargetException, IllegalAccessException ;

}
