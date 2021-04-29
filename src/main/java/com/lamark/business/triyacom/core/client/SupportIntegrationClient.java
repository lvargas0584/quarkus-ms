package com.lamark.business.triyacom.core.client;

import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.shared.dto.PixelDto;
import com.lamark.shared.dto.ResponseValidatePixelDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@RegisterRestClient(configKey = "support-integration")
@Path("/support/integration/v1")
public interface SupportIntegrationClient {

    @GET
    @Path("/validateSendPixel")
    public ResponseValidatePixelDto validateSendPixel(@QueryParam( "siteId") Integer siteId,
                                                      @QueryParam( "msisdnBD") String msisdnBD,
                                                      @QueryParam( "adProvider" ) String adProvider,
                                                      @QueryParam( "keyword" ) String keyword,
                                                      @QueryParam( "operator" ) String operator,
                                                      @QueryParam( "channel" ) String channel,
                                                      @QueryParam( "operationType" ) String operationType )
            throws BaseException;

    @POST
    @Path("/sendPixel")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sendPixel(PixelDto pixelDto) ;
}
