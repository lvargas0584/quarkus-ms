//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.lamark.business.triyacom.core.dto;

import com.google.gson.Gson;
import java.util.Date;

public class RequestOperator {
    private String requestID;
    private String userType;
    private String userID;
    private String partnerProductCode;
    private String keyword;
    private String operator;
    private String integrator;
    private Integer optionRecaudation;
    private Integer errorCOnfigurationId;
    private Date dateCreated;

    public RequestOperator() {
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getErrorCOnfigurationId() {
        return this.errorCOnfigurationId;
    }

    public void setErrorCOnfigurationId(Integer errorCOnfigurationId) {
        this.errorCOnfigurationId = errorCOnfigurationId;
    }

    public String getIntegrator() {
        return this.integrator;
    }

    public void setIntegrator(String integrator) {
        this.integrator = integrator;
    }

    public Integer getOptionRecaudation() {
        return this.optionRecaudation;
    }

    public void setOptionRecaudation(Integer optionRecaudation) {
        this.optionRecaudation = optionRecaudation;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getRequestID() {
        return this.requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPartnerProductCode() {
        return this.partnerProductCode;
    }

    public void setPartnerProductCode(String partnerProductCode) {
        this.partnerProductCode = partnerProductCode;
    }

    public String toString() {
        Gson g = new Gson();
        return g.toJson(this).toString();
    }
}
