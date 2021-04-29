package com.lamark.business.triyacom.core.constants;

public class Constants {

    //Proveedor de campañas adNetNov20

    public final  static String  operationSubs_AdNetNov20 = "S";
    public final  static String  operationDelivery_AdNetNov20 = "D";
    public final  static String paramTypeName = "type";
    public final  static String paramTypeValue = "mt";
    public static final String SHORTCODE_TRIYACOM = "93230";

    //pbp

    public static String USER_TYPE = "MSISDN";
    public static String PARTNER_PRODUCT_CODE_1RA_OPCION_PROD = "LM100MB3D";
    public static String PARTNER_PRODUCT_CODE_3RA_OPCION_PROD = "LM400MB3D";
    public static final String ZONE = "Asia/Jakarta";
    public static final String ZONE_LIMA = "America/Lima";
    public static final String INTEGRATOR_TRIYACOM = "TRY";
    public static final Integer STATUS_PRESENT_ACTIVE = 1;
    public static final Integer INTEGRATION_TYPE_IN_SUBSCRIPTION_TRIYACOM = 1;
    public static final Integer INTEGRATION_TYPE_IN_DELIVERY_TRIYACOM = 2;

    //wap

    public static String SUFFIX_CAMPAIGN_MCS = "A";
    public static String SUFFIX_CAMPAIGN_INDOSAT = "B";
    public static String SUFFIX_CAMPAIGN_ADNETNOV20 = "C";
    public static String VALUE_DB_CAMPAIGN_MCS = "MCS";
    public static String VALUE_DB_CAMPAIGN_INDOSAT = "APIGATE";
    public static String VALUE_DB_CAMPAIGN_ADNETNOV20= "ADNETNOV20";
    public static String WITHOUT_TID = "without_tid";
    public static String WITH_TID = "with_tid";
    public static String SITE_XL = "149";




    public static enum PbpOperators {
        OPERATOR_INDOSAT("IM3");

        private String operatorId;

        private PbpOperators(String i) {
            this.operatorId = i;
        }

        public String getOperatorId() {
            return this.operatorId;
        }

        public void setOperatorId(String operatorId) {
            this.operatorId = operatorId;
        }
    }



}
