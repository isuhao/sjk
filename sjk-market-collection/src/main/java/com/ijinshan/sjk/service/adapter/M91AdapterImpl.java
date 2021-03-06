package com.ijinshan.sjk.service.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ijinshan.sjk.po.MarketApp;

@Service
public class M91AdapterImpl implements MarketAppFromMarketAdapter {
    private static final Logger logger = LoggerFactory.getLogger(M91AdapterImpl.class);

    @Override
    public void preHandle(MarketApp mApp) {
        if (mApp.getName().length() > 80) {
            logger.error("{}", mApp.toString());
            final String name = new StringBuilder(80).append(mApp.getName().substring(0, 76)).append("...").toString();
            mApp.setName(name);
        }
        // set to db
        if (mApp.getId() != null) {
            mApp.setApkId(mApp.getId());
        }
    }

}
