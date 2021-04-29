package com.lamark.business.triyacom.core.util;

import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.architecture.corems.exception.ExceptionHelper;

import java.math.BigDecimal;

public class Util {
    private static final String WAP_TAG = "W";

    public static String addZero(String msisdn) {
        String zero = msisdn.substring(2, 3);
        if (BigDecimal.ZERO.toString().equals(zero)) {
            return msisdn;
        } else {
            StringBuffer sb = new StringBuffer(msisdn.substring(0, 2)).append(BigDecimal.ZERO);
            sb = sb.append(msisdn.substring(2));
            return sb.toString();
        }
    }

    public static String removeZero(String msisdn){
        String zero = msisdn.substring(2,3);
        if(BigDecimal.ZERO.toString().equals(zero)){
            StringBuffer sb = new StringBuffer(msisdn.substring(0,2));
            sb = sb.append(msisdn.substring(3));
            return sb.toString();
        }else{
            return msisdn;
        }
    }


    public static Integer toInteger(String integer) throws BaseException {
        if (integer != null)
            return Integer.valueOf(integer);
        else
            throw ExceptionHelper.buildGenericException("Valor nulo no se puede convertir a entero");
    }

}
