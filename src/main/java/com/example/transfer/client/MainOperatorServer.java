package com.example.transfer.client;

import Ice.ObjectAdapter;
import com.example.transfer.servant.MainOperatorI;
import com.example.transfer.servant.ObjectFactory4Bond;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/28.
 */
public class MainOperatorServer implements Serializable {

    public static void main(String[] args) {
        // 0, 声明执行状态
        int status = 0;

        Ice.Communicator ic = null;

        try {
            // 1, 初始化环境
            // 加载属性文件
            ic = Ice.Util.initialize();

            Ice.ObjectFactory factory = new ObjectFactory4Bond();
            ic.addObjectFactory(factory, com.example.transfer.servant.BondI.ice_staticId());

            // 2, 初始化Adapter
            String name = "MainOperatorServer";
            String endPoints = "default -h 127.0.0.1 -p 10000";
            ObjectAdapter objectAdapter = ic.createObjectAdapterWithEndpoints(name, endPoints);

            // 3, 创建伺服者
            Ice.Object servant = new MainOperatorI();

            // 4, 添加伺服者至适配器
            objectAdapter.add(servant, Ice.Util.stringToIdentity("MainOperatorUID"));

            // 5, 激活
            objectAdapter.activate();

            System.out.println("<<MainOperatorUID started>>");
            // 6, 等待关闭

            ic.waitForShutdown();
        } catch (Exception e) {
            e.printStackTrace();
            status = 1;
        } finally {
            if (ic != null) {
                ic.destroy();
            }
            System.exit(status);
        }
    }
}
