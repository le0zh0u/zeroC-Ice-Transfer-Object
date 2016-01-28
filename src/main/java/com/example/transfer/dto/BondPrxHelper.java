// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.1
//
// <auto-generated>
//
// Generated from file `BondDef.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.example.transfer.dto;

public final class BondPrxHelper extends Ice.ObjectPrxHelperBase implements BondPrx
{
    private static final String __getCode_name = "getCode";

    public String getCode()
    {
        return getCode(null, false);
    }

    public String getCode(java.util.Map<String, String> __ctx)
    {
        return getCode(__ctx, true);
    }

    private String getCode(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getCode_name);
        return end_getCode(begin_getCode(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getCode()
    {
        return begin_getCode(null, false, false, null);
    }

    public Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx)
    {
        return begin_getCode(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getCode(Ice.Callback __cb)
    {
        return begin_getCode(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getCode(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getCode(Callback_Bond_getCode __cb)
    {
        return begin_getCode(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx, Callback_Bond_getCode __cb)
    {
        return begin_getCode(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getCode(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getCode(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getCode(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getCode(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getCode(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getCode(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getCode(__ctx, __explicitCtx, __synchronous, 
                             new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                 {
                                     public final void __completed(Ice.AsyncResult __result)
                                     {
                                         BondPrxHelper.__getCode_completed(this, __result);
                                     }
                                 });
    }

    private Ice.AsyncResult begin_getCode(java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getCode_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getCode_name, __cb);
        try
        {
            __result.prepare(__getCode_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_getCode(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getCode_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getCode_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        com.example.transfer.dto.BondPrx __proxy = (com.example.transfer.dto.BondPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_getCode(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __getName_name = "getName";

    public String getName()
    {
        return getName(null, false);
    }

    public String getName(java.util.Map<String, String> __ctx)
    {
        return getName(__ctx, true);
    }

    private String getName(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getName_name);
        return end_getName(begin_getName(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getName()
    {
        return begin_getName(null, false, false, null);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx)
    {
        return begin_getName(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getName(Ice.Callback __cb)
    {
        return begin_getName(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getName(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getName(Callback_Bond_getName __cb)
    {
        return begin_getName(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, Callback_Bond_getName __cb)
    {
        return begin_getName(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getName(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getName(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getName(IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getName(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getName(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getName(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getName(__ctx, __explicitCtx, __synchronous, 
                             new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                 {
                                     public final void __completed(Ice.AsyncResult __result)
                                     {
                                         BondPrxHelper.__getName_completed(this, __result);
                                     }
                                 });
    }

    private Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getName_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getName_name, __cb);
        try
        {
            __result.prepare(__getName_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_getName(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getName_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getName_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        com.example.transfer.dto.BondPrx __proxy = (com.example.transfer.dto.BondPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_getName(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __setCode_name = "setCode";

    public void setCode(String code)
    {
        setCode(code, null, false);
    }

    public void setCode(String code, java.util.Map<String, String> __ctx)
    {
        setCode(code, __ctx, true);
    }

    private void setCode(String code, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_setCode(begin_setCode(code, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_setCode(String code)
    {
        return begin_setCode(code, null, false, false, null);
    }

    public Ice.AsyncResult begin_setCode(String code, java.util.Map<String, String> __ctx)
    {
        return begin_setCode(code, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_setCode(String code, Ice.Callback __cb)
    {
        return begin_setCode(code, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_setCode(String code, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setCode(code, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_setCode(String code, Callback_Bond_setCode __cb)
    {
        return begin_setCode(code, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_setCode(String code, java.util.Map<String, String> __ctx, Callback_Bond_setCode __cb)
    {
        return begin_setCode(code, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_setCode(String code, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_setCode(code, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_setCode(String code, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setCode(code, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_setCode(String code, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_setCode(code, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_setCode(String code, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setCode(code, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_setCode(String code, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setCode(code, 
                             __ctx, 
                             __explicitCtx, 
                             __synchronous, 
                             new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_setCode(String code, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__setCode_name, __cb);
        try
        {
            __result.prepare(__setCode_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(code);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_setCode(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __setCode_name);
    }

    private static final String __setName_name = "setName";

    public void setName(String name)
    {
        setName(name, null, false);
    }

    public void setName(String name, java.util.Map<String, String> __ctx)
    {
        setName(name, __ctx, true);
    }

    private void setName(String name, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_setName(begin_setName(name, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_setName(String name)
    {
        return begin_setName(name, null, false, false, null);
    }

    public Ice.AsyncResult begin_setName(String name, java.util.Map<String, String> __ctx)
    {
        return begin_setName(name, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_setName(String name, Ice.Callback __cb)
    {
        return begin_setName(name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_setName(String name, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setName(name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_setName(String name, Callback_Bond_setName __cb)
    {
        return begin_setName(name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_setName(String name, java.util.Map<String, String> __ctx, Callback_Bond_setName __cb)
    {
        return begin_setName(name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_setName(String name, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_setName(name, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_setName(String name, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setName(name, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_setName(String name, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_setName(name, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_setName(String name, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setName(name, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_setName(String name, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_setName(name, 
                             __ctx, 
                             __explicitCtx, 
                             __synchronous, 
                             new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_setName(String name, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__setName_name, __cb);
        try
        {
            __result.prepare(__setName_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(name);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_setName(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __setName_name);
    }

    public static BondPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), BondPrx.class, BondPrxHelper.class);
    }

    public static BondPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), BondPrx.class, BondPrxHelper.class);
    }

    public static BondPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), BondPrx.class, BondPrxHelper.class);
    }

    public static BondPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), BondPrx.class, BondPrxHelper.class);
    }

    public static BondPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, BondPrx.class, BondPrxHelper.class);
    }

    public static BondPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, BondPrx.class, BondPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::com::example::transfer::dto::Bond"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, BondPrx v)
    {
        __os.writeProxy(v);
    }

    public static BondPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            BondPrxHelper result = new BondPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
