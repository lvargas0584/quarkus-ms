package com.lamark.business.triyacom.api;

import com.lamark.architecture.corems.api.BaseController;
import com.lamark.business.triyacom.core.dto.ResponseService;
import com.lamark.business.triyacom.core.service.TriyakomService;
import com.lamark.shared.dto.DeliveryData;
import com.lamark.shared.dto.RegistrationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.Duration;
import java.time.Instant;

@Path("/business/v1/triyacom")
public class TriyakomController extends BaseController {

    @Inject
    private TriyakomService triyacomService;

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @GET
    @Path("/registration")
    @Produces(MediaType.APPLICATION_JSON)
    public Response registration(@QueryParam("X-Source-Addr") String msisdn,
                                 @QueryParam("X-Dest-Addr") String shortCode,
                                 @QueryParam("_sc") String command,
                                 @QueryParam("_tid") String tid,
                                 @QueryParam("op") String operator) {
        RegistrationData data = new RegistrationData();
        try {

            data.setSource(msisdn);
            data.setShortCode(shortCode);
            data.setCommand(command.toUpperCase());
            data.setOperator(operator.toUpperCase());
            data.setTid(tid);
            logger.info("[POST][START] /registration {}", data);
            triyacomService.subscription(data);
        } catch (Exception  e) {
            logger.error("Exception " , e);
            e.printStackTrace();
            logger.error("[POST][END] /registration {}", data);
        } finally {
            logger.info("[POST][END] /registration {}", data);
        }
        return buildSuccessWrapperResponse(new ResponseService());
    }

    @GET
    @Path("/delivery")
    @Produces("application/json")
    public Response delivery(@QueryParam("status_id") Integer status,
                             @QueryParam("_tid") String tid,
                             @QueryParam("op") String operator) {
        DeliveryData data = new DeliveryData();
        Instant start = Instant.now();
        try {
            data.setOperator(operator.toUpperCase());
            data.setStatus(status);
            data.setTid(tid);
            logger.info("[POST][START] /delivery {}", data);
            triyacomService.delivery(data);
            Instant finish = Instant.now();
            logger.info("[LATENCY DELIVERY] : " + (Duration.between(start, finish).toMillis()) + "ms");
            return buildSuccessWrapperResponse(new ResponseService());
        } finally {
            logger.debug("[POST][END] /delivery {}", data);
        }
    }

    @GET
    @Path("/renew")
    public Response renew(@QueryParam("dateIniStr") String dateIniStr,
                          @QueryParam("dateEndStr") String dateEndStr) {
        logger.info("[GET][START] /renew");
        triyacomService.processRenewDaily(dateIniStr, dateEndStr);
        logger.debug("[GET][END] /renew");
        return buildSuccessWrapperResponse();

    }
}
