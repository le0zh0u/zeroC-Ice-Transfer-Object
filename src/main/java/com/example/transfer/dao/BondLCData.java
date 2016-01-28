package com.example.transfer.dao;

import com.example.transfer.servant.BondI;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/28.
 */
public class BondLCData implements Serializable {

    // 单值
    public static BondI BONDLC_DATA_SINGLE = null;

    static {
        BondI bondI = new BondI();
        bondI.setCode("600006");
        bondI.setName("青岛啤酒");

        BONDLC_DATA_SINGLE = bondI;
    }
}
