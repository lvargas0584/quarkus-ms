//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.lamark.business.triyacom.core.dto;

import javax.ws.rs.core.Response;

public class ResponseService {
    private String code;
    private String message;

    public ResponseService() {
        this.code =  Integer.valueOf(Response.Status.OK.getStatusCode()).toString();
    }

    public ResponseService(String message) {
        this();
        this.message = message;
    }

    public ResponseService(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
