package com.lamark.business.triyacom.core.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@RequestScoped
@RegisterRestClient(configKey = "send-mt")
public interface SendMTClient {

    @GET
    @Consumes(MediaType.APPLICATION_XML)
    String sendMT(@QueryParam("dest_addr") String   dest_addr ,
                  @QueryParam("op") String   op ,
                  @QueryParam("data") String   data ,
                  @QueryParam("app_id") String   app_id ,
                  @QueryParam("service") String   service ,
                  @QueryParam("app_pwd") String   app_pwd ,
                  @QueryParam("alphabet_id") String   alphabet_id ,
                  @QueryParam("rtx_id") String   rtx_id
                          );

    @GET
    @Consumes(MediaType.APPLICATION_XML)
    String sendMT(@QueryParam("dest_addr") String   dest_addr ,
                  @QueryParam("op") String   op ,
                  @QueryParam("data") String   data ,
                  @QueryParam("app_id") String   app_id ,
                  @QueryParam("service") String   service ,
                  @QueryParam("app_pwd") String   app_pwd ,
                  @QueryParam("alphabet_id") String   alphabet_id
    );
}
