package p000;

import bsh.AbstractC0016;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0469 implements InvocationHandler {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2097;

    public /* synthetic */ C0469(Object obj, int i) {
        this.f2096 = i;
        this.f2097 = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object c2641;
        int i = this.f2096;
        byte b = 2;
        Object obj2 = this.f2097;
        boolean z = false;
        switch (i) {
            case 0:
                AbstractC0472 abstractC0472 = (AbstractC0472) obj2;
                abstractC0472.getClass();
                if (method.getDeclaringClass() == Object.class) {
                    String name = method.getName();
                    name.getClass();
                    switch (name.hashCode()) {
                        case -1776922004:
                            b = !name.equals("toString") ? (byte) -1 : (byte) 0;
                            break;
                        case -1295482945:
                            b = !name.equals("equals") ? (byte) -1 : (byte) 1;
                            break;
                        case 147696667:
                            if (!name.equals("hashCode")) {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            return "BshLambdaProxy[" + abstractC0472 + "]";
                        case 1:
                            if (objArr != null && objArr.length == 1 && obj == objArr[0]) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 2:
                            return Integer.valueOf(System.identityHashCode(obj));
                    }
                }
                if (objArr == null) {
                    objArr = AbstractC0016.f568;
                }
                return abstractC0472.invoke(objArr, method.getExceptionTypes(), method.getReturnType());
            default:
                C2198 c2198 = (C2198) obj2;
                String[] strArr = AbstractC1471.f5234;
                String name2 = method.getName();
                if (name2 == null) {
                    return null;
                }
                switch (name2.hashCode()) {
                    case -1776922004:
                        if (!name2.equals("toString")) {
                            return null;
                        }
                        return obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    case -1295482945:
                        if (name2.equals("equals")) {
                            return Boolean.valueOf(obj == objArr[0]);
                        }
                        return null;
                    case 147696667:
                        if (name2.equals("hashCode")) {
                            return Integer.valueOf(System.identityHashCode(obj));
                        }
                        return null;
                    case 1994440622:
                        if (!name2.equals("onSceneEnd")) {
                            return null;
                        }
                        try {
                            Object obj3 = objArr[0];
                            "null cannot be cast to non-null type kotlin.Int";
                            Integer num = (Integer) obj3;
                            num.getClass();
                            Object obj4 = objArr[1];
                            "null cannot be cast to non-null type kotlin.Int";
                            Integer num2 = (Integer) obj4;
                            num2.getClass();
                            Object obj5 = objArr[2];
                            String str = obj5 instanceof String ? (String) obj5 : null;
                            Object obj6 = objArr[3];
                            "null cannot be cast to non-null type kotlin.Any";
                            int i2 = AbstractC1768.f5906;
                            C2004 c2004M3560 = AbstractC2727.m4713(objArr[3]).m3560();
                            c2004M3560.f6475 = "getReqResp";
                            c2004M3560.m3926();
                            Object objM4025 = ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(new Object[0]);
                            if (objM4025 != null) {
                                C2004 c2004M3561 = AbstractC2727.m4713(objM4025).m3560();
                                c2004M3561.f6475 = "getRespObj";
                                c2004M3561.m3926();
                                Object objM4026 = ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4025(new Object[0]);
                                if (objM4026 != null) {
                                    C1300 c1300M3558 = AbstractC2727.m4713(objM4026).m3558();
                                    c1300M3558.f6475 = "a";
                                    c1300M3558.m3926();
                                    Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126();
                                    if (objM3126 != null) {
                                        C2004 c2004M3562 = AbstractC2727.m4713(objM3126).m3560();
                                        c2004M3562.f6475 = "toByteArray";
                                        c2004M3562.m3926();
                                        byte[] bArr = (byte[]) ((C2013) AbstractC0739.m2290(c2004M3562.m3993())).m4026(new Object[0]);
                                        if (bArr != null) {
                                            c2198.m4141(num, num2, str, bArr);
                                        }
                                    }
                                }
                            }
                            c2641 = C3554.UNIT;
                            break;
                        } catch (Throwable th) {
                            c2641 = new C2641(th);
                        }
                        return new C2642(c2641);
                    default:
                        return null;
                }
        }
    }
}
