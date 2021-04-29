package com.lamark.business.triyacom.core.service;

import com.lamark.shared.dto.DeliveryData;
import com.lamark.architecture.corems.exception.BaseException;
import com.lamark.shared.dto.RegistrationData;

import java.lang.reflect.InvocationTargetException;

public interface TriyakomService{

    void delivery(DeliveryData data);

    void processRenewDaily(String dateIniStr, String dateEndStr);

    void subscription(RegistrationData data) throws BaseException, InvocationTargetException, IllegalAccessException;
}