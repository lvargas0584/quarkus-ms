package com.lamark.business.triyacom.core.dto;

public class SubscriptionVoucherData {

    private String msisdn;
    private String voucher;
    private String operator;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "SubscriptionVoucherData{" +
                "msisdn='" + msisdn + '\'' +
                ", voucher='" + voucher + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
