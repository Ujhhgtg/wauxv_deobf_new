package p000;

import android.app.AndroidAppHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛴᛱUjhhgtgᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1477feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C1478feyxiexzfUjhhgtg f5128Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C2285feyxiexzfUjhhgtg m2994Ujhhgtgfeyxiexzf(C1477feyxiexzfUjhhgtg c1477feyxiexzfUjhhgtg, List list) {
        c1477feyxiexzfUjhhgtg.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Member member = (Member) it.next();
            if (!(member instanceof Constructor) && !(member instanceof Method)) {
                throw new IllegalStateException(("This type [" + member + "] not support to hook, supported are Constructors and Methods").toString());
            }
        }
        Throwable th = new Throwable("There is no hook class instance");
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(25);
        c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf = th;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg = new C2285feyxiexzfUjhhgtg(new C2073feyxiexzfUjhhgtg(c1477feyxiexzfUjhhgtg, c2965Ujhhgtgfeyxiexzf), 1, 2);
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = c2285feyxiexzfUjhhgtg.f7496Ujhhgtgfeyxiexzf;
            linkedHashSet.clear();
            linkedHashSet.addAll(list);
        }
        return c2285feyxiexzfUjhhgtg;
    }

    public final String toString() {
        return "PackageParam(" + super.toString() + ") by " + this.f5128Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final String m2995Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        String str;
        C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg = this.f5128Ujhhgtgfeyxiexzf;
        if (c1478feyxiexzfUjhhgtg != null) {
            return c1478feyxiexzfUjhhgtg.f5131Ujhhgtgfeyxiexzf;
        }
        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
        try {
            c0919feyxiexzfUjhhgtg = AndroidAppHelper.currentProcessName();
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        String str2 = null;
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = null;
        }
        String str3 = (String) c0919feyxiexzfUjhhgtg;
        if (str3 != null) {
            return str3;
        }
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.f7729Ujhhgtgfeyxiexzf;
        InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.f7726Ujhhgtgfeyxiexzf[0];
        C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(c2366Ujhhgtgfeyxiexzf.m3605Ujhhgtgfeyxiexzf());
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
        ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
        c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "currentPackageName";
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
        if (c0393Ujhhgtgfeyxiexzf != null && (str = (String) c0393Ujhhgtgfeyxiexzf.m1650Ujhhgtgfeyxiexzf(new Object[0])) != null && !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
            str2 = str;
        }
        return str2 == null ? "android" : str2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2285feyxiexzfUjhhgtg m2996Ujhhgtgfeyxiexzf(AbstractC0375Ujhhgtgfeyxiexzf abstractC0375Ujhhgtgfeyxiexzf, int i) {
        if (!(abstractC0375Ujhhgtgfeyxiexzf instanceof C3660Ujhhgtgfeyxiexzf) && !(abstractC0375Ujhhgtgfeyxiexzf instanceof C0393Ujhhgtgfeyxiexzf)) {
            throw new IllegalStateException(("This type [" + abstractC0375Ujhhgtgfeyxiexzf + "] not support to hook, supported are Constructors and Methods").toString());
        }
        List listSingletonList = Collections.singletonList(abstractC0375Ujhhgtgfeyxiexzf.mo1621Ujhhgtgfeyxiexzf());
        Throwable th = new Throwable("There is no hook class instance");
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(25);
        c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf = th;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg = new C2285feyxiexzfUjhhgtg(new C2073feyxiexzfUjhhgtg(this, c2965Ujhhgtgfeyxiexzf), i, 3);
        if (!listSingletonList.isEmpty()) {
            LinkedHashSet linkedHashSet = c2285feyxiexzfUjhhgtg.f7496Ujhhgtgfeyxiexzf;
            linkedHashSet.clear();
            linkedHashSet.addAll(listSingletonList);
        }
        return c2285feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2997feyxiexzfUjhhgtg(AbstractC2292feyxiexzfUjhhgtg abstractC2292feyxiexzfUjhhgtg) {
        C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg = abstractC2292feyxiexzfUjhhgtg.f5128Ujhhgtgfeyxiexzf;
        if (c1478feyxiexzfUjhhgtg == null) {
            abstractC2292feyxiexzfUjhhgtg.m3502feyxiexzfUjhhgtg(this);
            return;
        }
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(c1478feyxiexzfUjhhgtg.f5130Ujhhgtgfeyxiexzf) || c1478feyxiexzfUjhhgtg.f5129Ujhhgtgfeyxiexzf == 1) {
            abstractC2292feyxiexzfUjhhgtg.m3502feyxiexzfUjhhgtg(this);
            return;
        }
        String str = c1478feyxiexzfUjhhgtg.f5130Ujhhgtgfeyxiexzf;
        C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg2 = this.f5128Ujhhgtgfeyxiexzf;
        if (str.equals(c1478feyxiexzfUjhhgtg2 != null ? c1478feyxiexzfUjhhgtg2.f5130Ujhhgtgfeyxiexzf : null)) {
            abstractC2292feyxiexzfUjhhgtg.m3502feyxiexzfUjhhgtg(this);
            return;
        }
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        String name = abstractC2292feyxiexzfUjhhgtg.getClass().getName();
        C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg3 = this.f5128Ujhhgtgfeyxiexzf;
        C2290feyxiexzfUjhhgtg.m3498Ujhhgtgfeyxiexzf("This Hooker \"" + name + "\" is singleton or reused, but the current process has multiple package name \"" + (c1478feyxiexzfUjhhgtg3 != null ? c1478feyxiexzfUjhhgtg3.f5130Ujhhgtgfeyxiexzf : null) + "\", the original is \"" + c1478feyxiexzfUjhhgtg.f5130Ujhhgtgfeyxiexzf + "\"\nMake sure your Hooker supports multiple instances for this situation\nThe process with package name \"" + (c1478feyxiexzfUjhhgtg3 != null ? c1478feyxiexzfUjhhgtg3.f5130Ujhhgtgfeyxiexzf : null) + "\" will be ignored");
    }
}
