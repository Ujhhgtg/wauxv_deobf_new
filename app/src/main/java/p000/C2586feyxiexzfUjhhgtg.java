package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2586feyxiexzfUjhhgtg implements InvocationHandler {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8376Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8377Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2586feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8376Ujhhgtgfeyxiexzf = i;
        this.f8377Ujhhgtgfeyxiexzf = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object c0919feyxiexzfUjhhgtg;
        int i = this.f8376Ujhhgtgfeyxiexzf;
        byte b = 2;
        Object obj2 = this.f8377Ujhhgtgfeyxiexzf;
        boolean z = false;
        switch (i) {
            case 0:
                AbstractC2584feyxiexzfUjhhgtg abstractC2584feyxiexzfUjhhgtg = (AbstractC2584feyxiexzfUjhhgtg) obj2;
                abstractC2584feyxiexzfUjhhgtg.getClass();
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
                            return "BshLambdaProxy[" + abstractC2584feyxiexzfUjhhgtg + "]";
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
                    objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
                }
                return abstractC2584feyxiexzfUjhhgtg.invoke(objArr, method.getExceptionTypes(), method.getReturnType());
            default:
                C0451Ujhhgtgfeyxiexzf c0451Ujhhgtgfeyxiexzf = (C0451Ujhhgtgfeyxiexzf) obj2;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String name2 = method.getName();
                if (name2 == null) {
                    return null;
                }
                switch (name2.hashCode()) {
                    case -1776922004:
                        if (!name2.equals(MagicFactory.get(4928251238723618186L, strArr))) {
                            return null;
                        }
                        return obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    case -1295482945:
                        if (name2.equals(MagicFactory.get(4928251268788389258L, strArr))) {
                            return Boolean.valueOf(obj == objArr[0]);
                        }
                        return null;
                    case 147696667:
                        if (name2.equals(MagicFactory.get(4928251170004141450L, strArr))) {
                            return Integer.valueOf(System.identityHashCode(obj));
                        }
                        return null;
                    case 1994440622:
                        if (!name2.equals(MagicFactory.get(4928251337507865994L, strArr))) {
                            return null;
                        }
                        try {
                            Object obj3 = objArr[0];
                            MagicFactory.get(4928251290263225738L, strArr);
                            Integer num = (Integer) obj3;
                            num.getClass();
                            Object obj4 = objArr[1];
                            MagicFactory.get(4928254794956539274L, strArr);
                            Integer num2 = (Integer) obj4;
                            num2.getClass();
                            Object obj5 = objArr[2];
                            String str = obj5 instanceof String ? (String) obj5 : null;
                            Object obj6 = objArr[3];
                            MagicFactory.get(4928255001114969482L, strArr);
                            int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objArr[3]).m2024Ujhhgtgfeyxiexzf();
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928254107761771914L, strArr);
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
                            Object objM1649Ujhhgtgfeyxiexzf = ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(new Object[0]);
                            if (objM1649Ujhhgtgfeyxiexzf != null) {
                                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1649Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928254197956085130L, strArr);
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1306Ujhhgtgfeyxiexzf();
                                Object objM1649Ujhhgtgfeyxiexzf2 = ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(new Object[0]);
                                if (objM1649Ujhhgtgfeyxiexzf2 != null) {
                                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1649Ujhhgtgfeyxiexzf2).m2021Ujhhgtgfeyxiexzf();
                                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928254288150398346L, strArr);
                                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
                                    Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                                    if (objM4938Ujhhgtgfeyxiexzf != null) {
                                        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
                                        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928254279560463754L, strArr);
                                        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1306Ujhhgtgfeyxiexzf();
                                        byte[] bArr = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                                        if (bArr != null) {
                                            c0451Ujhhgtgfeyxiexzf.m1776Ujhhgtgfeyxiexzf(num, num2, str, bArr);
                                        }
                                    }
                                }
                            }
                            c0919feyxiexzfUjhhgtg = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                            break;
                        } catch (Throwable th) {
                            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                        }
                        return new C0918feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg);
                    default:
                        return null;
                }
        }
    }
}
