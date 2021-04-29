package com.lamark.business.triyacom.core.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CallbackData {

    private String response;
    private String status;
    private String msisdn;
}
