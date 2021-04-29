package com.lamark.business.triyacom.core.client;

import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.shared.dto.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequestScoped
@RegisterRestClient(configKey = "data-core")
@Path("/data/v1/core")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface DataCoreClient {
    @GET
    @Path("/config/{parentName}")
    List<LamarkConfigDto> getConfig(@PathParam("parentName") String parentName);

    @POST
    @Path("/user")
    public Long saveUser(UserDto userDto) throws InvocationTargetException, IllegalAccessException;

    @PUT
    @Path("/user")
    public Long updateUser(UserDto userDto) throws InvocationTargetException, IllegalAccessException, BaseException;


    @POST
    @Path("/integrationMsisdn/save")
    public void saveInCorrelationTable(IntegrationDto integrationDto) throws BaseException, InvocationTargetException, IllegalAccessException;

    @GET
    @Path("/user/getNumbersOfBilling")
    public Integer getNumbersOfBilling(@QueryParam("msisdn") String msisdn,
                                @QueryParam("siteId") Integer siteId);

    @GET
    @Path("/config/triyakom/{shortCode}/{operator}/{keyword}")
    public TriyakomConfigDto getTriyakomConfig(@PathParam("shortCode") String shortCode, @PathParam("operator") String operator, @PathParam("keyword") String keyword) throws BaseException;

    @GET
    @Path("/user/{msisdn}/{siteId}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserDto getUser(@PathParam("msisdn") String msisdn, @PathParam("siteId") Integer siteId) throws BaseException, InvocationTargetException, IllegalAccessException ;


    @GET
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserDto getUser(@PathParam("id") Long id  ) throws BaseException, InvocationTargetException, IllegalAccessException  ;

    @GET
    @Path("/integrationMsisdn/getMsisdn")
    public IntegrationMsisdnDto getMsisdn(@QueryParam("siteId") Integer siteId , @QueryParam("keyName") String keyName,
                                          @QueryParam("keyValue") String keyValue  );

}
