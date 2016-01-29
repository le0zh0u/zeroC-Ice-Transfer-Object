package com.example.transfer.client;

import Ice.ObjectPrx;
import com.example.transfer.dto.Bond;
import com.example.transfer.operator.MainOperatorPrx;
import com.example.transfer.operator.MainOperatorPrxHelper;
import com.example.transfer.servant.ObjectFactory4Bond;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/28.
 */
public class MainOperatorClient implements Serializable {

    public Bond getBond(String bondUID) {
        Bond bond = null;
        try {
            // 获取代理
            MainOperatorPrx mainOperatorPrx = this.getOwnPrx();


            // 添加自定义类
            Ice.ObjectFactory factory = new ObjectFactory4Bond();
            this.ic.addObjectFactory(factory, com.example.transfer.servant.BondI.ice_staticId());


            bond = mainOperatorPrx.getBond("anyThingAsArg");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bond;
    }

    public void transferBone(Bond bond) {
        try {
            MainOperatorPrx mainOperatorPrx = this.getOwnPrx();

            mainOperatorPrx.transferBond(bond);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取服务端提供的代理
    private MainOperatorPrx mainOperatorPrx = null;

    // Ice通讯员（为回收资源时，方便自动回收）
    private Ice.Communicator ic = null;

    // GC回收时，自动销毁Ice.Communicator。
    @Override
    protected void finalize() throws Throwable {
        if (this.ic != null) {
            ic.destroy();
        }
        super.finalize();
    }

    /**
     * 获取代理
     *
     * @return 本类的代理
     */
    private MainOperatorPrx getOwnPrx() throws Exception {

        // 代理为空时，自动获取代理。
        if (this.mainOperatorPrx == null) {
            // 环境为空时，初始化环境
            if (this.ic == null) {
                // 1, 初始化环境
                ic = Ice.Util.initialize();
            }
            // 2, 创建代理基类对象
            String str = "MainOperatorUID:default -h 127.0.0.1 -p 10000";

            ObjectPrx objPrx = this.ic.stringToProxy(str);
            // 3, 获取代理
            this.mainOperatorPrx = MainOperatorPrxHelper.checkedCast(objPrx);

            // 4, 测试是否可用，不可用时抛出异常。
            if (this.mainOperatorPrx == null) {
                throw new Exception(str + ", request proxy faild.");
            }
        }
        return this.mainOperatorPrx;
    }
}
