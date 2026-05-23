package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᤝᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2180 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2180 f7141 = new C2180();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void addNetSceneToQueue(Object obj) {
        Method methodM3315 = AbstractC1574.dexToMethod(C2178.f7139);
        methodM3315.invoke(C1878.m3656(), obj, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m3961(Object obj, final C2165 c2165) {
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(obj).m3492();
        c1973M3492.name = "doScene";
        c1973M3492.f4485 = 2;
        c1973M3492.superclass();
        C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.resolve());
        if (c1982 == null) {
            return;
        }
        Class<?> cls = c1982.f6566.getParameterTypes()[1];
        
        Object objNewProxyInstance = Proxy.newProxyInstance(C1565.m3275(), new Class[]{cls}, new InvocationHandler() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᛸᤝᲀ
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method, Object[] objArr) {
                Object c2585;
                C2165 c2166 = c2165;
                String[] strArr = AbstractC1574.f5469;
                String name = method.getName();
                if (true) {
                    switch (name.hashCode()) {
                        case -1776922004:
                            if (name.equals("toString")) {
                                return obj2.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj2));
                            }
                            break;
                        case -1295482945:
                            if (name.equals("equals")) {
                                return Boolean.valueOf(obj2 == objArr[0]);
                            }
                            break;
                        case 147696667:
                            if (name.equals("hashCode")) {
                                return Integer.valueOf(System.identityHashCode(obj2));
                            }
                            break;
                        case 1994440622:
                            if (name.equals("onSceneEnd")) {
                                try {
                                    Object obj3 = objArr[0];
                                    Integer num = (Integer) obj3;
                                    
                                    Object obj4 = objArr[1];
                                    Integer num2 = (Integer) obj4;
                                    
                                    Object obj5 = objArr[2];
                                    String str = obj5 instanceof String ? (String) obj5 : null;
                                    Object obj6 = objArr[3];
                                    int i2 = 0;
                                    MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(objArr[3]).m3492();
                                    c1973M3493.name = "getReqResp";
                                    c1973M3493.superclass();
                                    Object objM3831 = ((C1982) AbstractC0744.firstInList(c1973M3493.resolve())).m3831(new Object[0]);
                                    if (objM3831 != null) {
                                        MethodResolver c1973M3494 = AbstractC0968.startMethodResolution_(objM3831).m3492();
                                        c1973M3494.name = "getRespObj";
                                        c1973M3494.superclass();
                                        Object objM3832 = ((C1982) AbstractC0744.firstInList(c1973M3494.resolve())).m3831(new Object[0]);
                                        if (objM3832 != null) {
                                            C1299 c1299M3490 = AbstractC0968.startMethodResolution_(objM3832).m3490();
                                            c1299M3490.name = "a";
                                            c1299M3490.superclass();
                                            Object objM3023 = ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3023();
                                            if (objM3023 != null) {
                                                MethodResolver c1973M3495 = AbstractC0968.startMethodResolution_(objM3023).m3492();
                                                c1973M3495.name = "toByteArray";
                                                c1973M3495.superclass();
                                                byte[] bArr = (byte[]) ((C1982) AbstractC0744.firstInList(c1973M3495.resolve())).invoke(new Object[0]);
                                                if (bArr != null) {
                                                    c2166.m3957(num, num2, str, bArr);
                                                }
                                            }
                                        }
                                    }
                                    c2585 = Unit.INSTANCE;
                                    break;
                                } catch (Throwable th) {
                                    c2585 = new C2585(th);
                                }
                                return new C2586(c2585);
                            }
                            break;
                    }
                }
                return null;
            }
        });
        Method methodM3315 = AbstractC1574.dexToMethod(C2179.f7140);
        
        c1982.m3831(methodM3315.invoke(C1878.m3656(), null), objNewProxyInstance);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2178.f7139, dexKitBridge, new C2174(1));
        AbstractC1574.findMethod(C2179.f7140, dexKitBridge, new C2174(2));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
