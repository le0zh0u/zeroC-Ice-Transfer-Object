package com.example.transfer.servant;


import Ice.Object;
import Ice.ObjectFactory;

/**
 * Created by zhouchunjie on 16/1/28.
 */
public class ObjectFactory4Bond implements ObjectFactory {
    public Object create(String s) {
        System.out.println("!!>type=" + s);
        if (s.equals(com.example.transfer.servant.BondI.ice_staticId())) {
            return new BondI();
        }
        return null;
    }

    public void destroy() {

    }
}
