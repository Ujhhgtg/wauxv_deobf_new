package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.AbstractC0959feyxiexzfUjhhgtg;
import p000.AbstractC2842feyxiexzfUjhhgtg;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.C0919feyxiexzfUjhhgtg;
import p000.C2374Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.InterfaceC0155Ujhhgtgfeyxiexzf;
import p000.InterfaceC0284Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0155Ujhhgtgfeyxiexzf
public final class IActivityManagerProxy_me_hd_wauxv implements InvocationHandler {
    private final Object baseInstance;

    public IActivityManagerProxy_me_hd_wauxv(Object obj) {
        this.baseInstance = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        ComponentName component;
        ClassLoader classLoader;
        Object c0919feyxiexzfUjhhgtg;
        String str;
        Object obj2 = this.baseInstance;
        Class<InterfaceC0284Ujhhgtgfeyxiexzf> cls = InterfaceC0284Ujhhgtgfeyxiexzf.class;
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(method != null ? method.getName() : null, "startActivity") && objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (objArr[i] instanceof Intent) {
                    break;
                }
                i++;
            }
            Object obj3 = objArr[i];
            Intent intent = obj3 instanceof Intent ? (Intent) obj3 : null;
            if (intent != null && (component = intent.getComponent()) != null) {
                String packageName = component.getPackageName();
                C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(packageName, C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf()) && (classLoader = AbstractC0615Ujhhgtgfeyxiexzf.class.getClassLoader()) != null && AbstractC2842feyxiexzfUjhhgtg.m4171Ujhhgtgfeyxiexzf(classLoader, component.getClassName())) {
                    Intent intent2 = new Intent();
                    String packageName2 = component.getPackageName();
                    Class<?> clsM4170Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4170Ujhhgtgfeyxiexzf(component.getClassName(), null, 3);
                    if (clsM4170Ujhhgtgfeyxiexzf != null) {
                        try {
                            if (AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls).mo2998Ujhhgtgfeyxiexzf().isAssignableFrom(clsM4170Ujhhgtgfeyxiexzf)) {
                                try {
                                    Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
                                    AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(clsM4170Ujhhgtgfeyxiexzf, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                                    Class<InterfaceC0284Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                                    if (clsM5159Ujhhgtgfeyxiexzf != null) {
                                        cls = clsM5159Ujhhgtgfeyxiexzf;
                                    }
                                    throw new IllegalStateException((clsM4170Ujhhgtgfeyxiexzf + "'s instance cannot be cast to type " + cls + ".").toString());
                                } catch (Throwable unused) {
                                }
                            }
                            c0919feyxiexzfUjhhgtg = null;
                        } catch (Throwable th) {
                            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                        }
                        if (c0919feyxiexzfUjhhgtg != null) {
                            c0919feyxiexzfUjhhgtg = null;
                        }
                        str = (String) c0919feyxiexzfUjhhgtg;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    intent2.setClassName(packageName2, str);
                    intent2.putExtra("", intent);
                    objArr[i] = intent2;
                }
            }
        }
        if (method == null) {
            return null;
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return method.invoke(obj2, Arrays.copyOf(objArr, objArr.length));
    }
}
