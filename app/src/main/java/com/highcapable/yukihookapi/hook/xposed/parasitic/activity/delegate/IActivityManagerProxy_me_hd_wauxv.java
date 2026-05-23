package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000.AbstractC0710;
import p000.AbstractC0743;
import p000.AbstractC1574;
import p000.AbstractC2207;
import p000.AbstractC2519;
import p000.C0251;
import p000.C2585;
import p000.InterfaceC1748;
import p000.InterfaceC2001;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1748
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
        Object c2585;
        String str;
        Object obj2 = this.baseInstance;
        Class<InterfaceC2001> cls = InterfaceC2001.class;
        if (AbstractC2207.m4087(method != null ? method.getName() : null, "startActivity") && objArr != null) {
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
                C0251.f1415.getClass();
                if (AbstractC2207.m4087(packageName, C0251.m1338()) && (classLoader = AbstractC1574.class.getClassLoader()) != null && AbstractC0710.m2134(classLoader, component.getClassName())) {
                    Intent intent2 = new Intent();
                    String packageName2 = component.getPackageName();
                    Class<?> clsM2133 = AbstractC0710.m2133(component.getClassName(), null, 3);
                    if (clsM2133 != null) {
                        try {
                            if (AbstractC2519.m4527(cls).mo2114().isAssignableFrom(clsM2133)) {
                                try {
                                    Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
                                    AbstractC0710.m2131(clsM2133, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                                    Class<InterfaceC2001> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                                    if (clsM2183 != null) {
                                        cls = clsM2183;
                                    }
                                    throw new IllegalStateException((clsM2133 + "'s instance cannot be cast to type " + cls + ".").toString());
                                } catch (Throwable unused) {
                                }
                            }
                            c2585 = null;
                        } catch (Throwable th) {
                            c2585 = new C2585(th);
                        }
                        if (c2585 != null) {
                            c2585 = null;
                        }
                        str = (String) c2585;
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
