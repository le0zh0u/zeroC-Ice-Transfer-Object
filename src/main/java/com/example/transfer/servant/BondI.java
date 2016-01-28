package com.example.transfer.servant;

import Ice.Current;
import com.example.transfer.dto.Bond;

import java.io.Serializable;

/**
 * 自定义债券
 * 注：实现Bond时，直接实现Override即可，无需添加其他的类元素。
 * Created by zhouchunjie on 16/1/28.
 */
public class BondI extends Bond implements Serializable {

    public String getName(Current __current) {
        return this.name;
    }

    public void setName(String name, Current __current) {
        this.name = name;
    }

    public String getCode(Current __current) {
        return this.code;
    }

    public void setCode(String code, Current __current) {
        this.code = code;
    }
}
