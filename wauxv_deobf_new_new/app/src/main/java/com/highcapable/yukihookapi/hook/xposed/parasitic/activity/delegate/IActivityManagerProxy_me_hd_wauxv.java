package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000.AbstractC0705;
import p000.AbstractC1469;
import p000.AbstractC1586;
import p000.AbstractC2236;
import p000.AbstractC2574;
import p000.C0261;
import p000.C2641;
import p000.InterfaceC1771;
import p000.InterfaceC2031;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1771
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
        Object c2641;
        String str;
        Object obj2 = this.baseInstance;
        Class<InterfaceC2031> cls = InterfaceC2031.class;
        if (AbstractC1469.m3322(method != null ? method.getName() : null, "startActivity") && objArr != null) {
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
                C0261.f1489.getClass();
                if (AbstractC1469.m3322(packageName, C0261.m1484()) && (classLoader = AbstractC1586.class.getClassLoader()) != null && AbstractC0705.m2227(classLoader, component.getClassName())) {
                    Intent intent2 = new Intent();
                    String packageName2 = component.getPackageName();
                    Class<?> clsM2226 = AbstractC0705.m2226(component.getClassName(), null, 3);
                    if (clsM2226 != null) {
                        try {
                            if (AbstractC2574.m4549(cls).mo2209().isAssignableFrom(clsM2226)) {
                                try {
                                    Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
                                    AbstractC0705.m2224(clsM2226, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                                    Class<InterfaceC2031> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                                    if (clsM4232 != null) {
                                        cls = clsM4232;
                                    }
                                    throw new IllegalStateException((clsM2226 + "'s instance cannot be cast to type " + cls + ".").toString());
                                } catch (Throwable unused) {
                                }
                            }
                            c2641 = null;
                        } catch (Throwable th) {
                            c2641 = new C2641(th);
                        }
                        if (c2641 != null) {
                            c2641 = null;
                        }
                        str = (String) c2641;
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
