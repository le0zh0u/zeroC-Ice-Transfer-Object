# zeroC-Ice-Transfer-Object
The project of zeroC Ice. It contains file about transfering Object from server to client.

### First. install slice2java in mac

```
brew install ice
```

it will install slice2java.

### Second. write BondDef.ice file and MainOperatorDef.ice

**BondDef.ice**
```
#ifndef DTO_BOND_DEF
#define DTO_BOND_DEF

module com{
    module example{
      module transfer{
        module dto{
            // 债券对象
            class Bond{

                //Fields
                string name;
                string code;

                //Methods
                string getName();
                void setName(string name);

                string getCode();
                void setCode(string code);
            };
        };
      };
    };
};
#endif
```

**MainOperatorDef.ice**
```
#ifndef OPERATOR_MAINOPERATOR_DEF
#define OPERATOR_MAINOPERATOR_DEF

module com{

    module example{
        module transfer{
            module dto{
                class Bond;
            };

            module operator{
                interface MainOperator{
                    idempotent void transferBond(com::example::transfer::dto::Bond bond);
                    idempotent com::example::transfer::dto::Bond getBond(string name);
                };
            };
        };
    };
};
#endif
```

It define two interfaces named transferBond and getBond

### Third. run the transform code

```
slice2java BondDef.ice
slice2java MainOperatorDef.ice
```

It will add some java files.

***

To be continue. Next will add some codes about transfer Bond from server to client.

***

### Fourth. extent abstract class to implement the function

add BondI to implement functions in Bond class

```
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
```

add MainOperatorI to implement functions in MainOperator

```
public class MainOperatorI extends _MainOperatorDisp implements Serializable {

    public void transferBond(Bond bond, Current __current) {
        // TODO next time
    }

    public Bond getBond(String name, Current __current) {
        // 获取一个BondLC对象
        Bond bond = BondLCData.BONDLC_DATA_SINGLE;

        return bond;
    }
}
```

and it need to add a file to define data

```
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
```

### Fifth. add server point

add server file named MainOperatorServer.java

first. add Ice.communicator
```
Ice.Communicator ic = null;
```
it has throw some exception, so it needs *try {..} catch(.. e){..}*

and in the block of *try*

It needs to init the communicator
```
ic = Ice.Util.initialize();
```
And then init the adapter with end point
```
String name = "XXXXXXX";
String endPoint = "default -h 127.0.0.1 -p 10000"; //For exapmle
ObjectAdapter objectAdapter = ic.Util.createObjectAdapterWithEndPoint(name,endPoint);
```

And then create servant for mainOperator
```
Ice.Object servant = new MainOperatorI();
```

And then add the servant to objectAdapter
```
objectAdapter.add(servant,Ice.Util.StringToIdentity("MainOperatorUID");
```

And the active the ObjectAdapter
```
objectAdapter.activate();
```

And then wait the shutdown

```
objectAdapter.waitForShutdown();
```

And finally
```
if(ic!=null){
    ic.close();
}
System.exit(status);
```

Finish to add Server.

***

To be continue. Next will add file about client.

***

***

PS.it refer from [Zeroc Ice返回值类型对象的实现](http://www.2cto.com/kf/201107/97871.html "Page Link")
   if it is not allowed , please contact me.
