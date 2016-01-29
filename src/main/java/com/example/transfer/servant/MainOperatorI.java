package com.example.transfer.servant;

import Ice.Current;
import com.example.transfer.dao.BondLCData;
import com.example.transfer.dto.Bond;
import com.example.transfer.operator._MainOperatorDisp;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/28.
 */
public class MainOperatorI extends _MainOperatorDisp implements Serializable {

    public void transferBond(Bond bond, Current __current) {

        System.out.print("Bond Code is " + bond.getCode() + ",Bond Name is " + bond.getName());
    }

    public Bond getBond(String name, Current __current) {
        // 获取一个BondLC对象
        Bond bond = BondLCData.BONDLC_DATA_SINGLE;

        return bond;
    }
}
