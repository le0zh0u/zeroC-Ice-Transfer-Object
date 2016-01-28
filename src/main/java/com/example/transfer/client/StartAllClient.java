package com.example.transfer.client;

import com.example.transfer.dto.Bond;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/28.
 */
public class StartAllClient implements Serializable {
    public static void main(String[] args) {

        MainOperatorClient moc = new MainOperatorClient();
        Bond bond = moc.getBond("something");

        StringBuffer info = new StringBuffer();
        if (bond == null) {
            info.append("null");
        } else {
            info.append("Bond@" + bond.hashCode() + ":");

            info.append("bName=" + bond.name);
            info.append(",bCode=" + bond.code);

            info.append(":");
            info.append("bName=" + bond.getName());
            info.append(",bCode=" + bond.getCode());
        }

        System.out.println(info.toString());
        System.exit(0);
    }
}
