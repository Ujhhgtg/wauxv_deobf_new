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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲁᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2342 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2343 f7559 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final C3752 m4301(C2342 c2342, List list) {
        c2342.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Member member = (Member) it.next();
            if (!(member instanceof Constructor) && !(member instanceof Method)) {
                throw new IllegalStateException(("This type [" + member + "] not support to hook, supported are Constructors and Methods").toString());
            }
        }
        Throwable th = new Throwable("There is no hook class instance");
        C0102 c0102 = new C0102(25);
        c0102.f1117 = th;
        C3752 c3752 = new C3752(new C2885(c2342, c0102), 1, 2);
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = c3752.f11752;
            linkedHashSet.clear();
            linkedHashSet.addAll(list);
        }
        return c3752;
    }

    public final String toString() {
        return "PackageParam(" + super.toString() + ") by " + this.f7559;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final String m4302() {
        Object c2641;
        String str;
        C2343 c2343 = this.f7559;
        if (c2343 != null) {
            return c2343.f7562;
        }
        C0261.f1489.getClass();
        try {
            c2641 = AndroidAppHelper.currentProcessName();
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        String str2 = null;
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        String str3 = (String) c2641;
        if (str3 != null) {
            return str3;
        }
        int i = AbstractC1768.f5906;
        C0253 c0253 = C0261.f1493;
        InterfaceC1766 interfaceC1766 = C0261.f1490[0];
        C1681 c1681M4712 = AbstractC2727.m4712(c0253.m1469());
        C2933 c2933 = C0160.f1227;
        ((C1958) c1681M4712.f5660).f6471 = AbstractC2234.m4168();
        c1681M4712.m3561(true);
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "currentPackageName";
        C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
        if (c2013 != null && (str = (String) c2013.m4026(new Object[0])) != null && !AbstractC2901.m4869(str)) {
            str2 = str;
        }
        return str2 == null ? "android" : str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final C3752 m4303(AbstractC1969 abstractC1969, int i) {
        if (!(abstractC1969 instanceof C0797) && !(abstractC1969 instanceof C2013)) {
            throw new IllegalStateException(("This type [" + abstractC1969 + "] not support to hook, supported are Constructors and Methods").toString());
        }
        List listSingletonList = Collections.singletonList(abstractC1969.mo2465());
        Throwable th = new Throwable("There is no hook class instance");
        C0102 c0102 = new C0102(25);
        c0102.f1117 = th;
        C3752 c3752 = new C3752(new C2885(this, c0102), i, 3);
        if (!listSingletonList.isEmpty()) {
            LinkedHashSet linkedHashSet = c3752.f11752;
            linkedHashSet.clear();
            linkedHashSet.addAll(listSingletonList);
        }
        return c3752;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m4304(AbstractC3743 abstractC3743) {
        C2343 c2343 = abstractC3743.f7559;
        if (c2343 == null) {
            abstractC3743.m5322(this);
            return;
        }
        if (AbstractC2901.m4869(c2343.f7561) || c2343.f7560 == 1) {
            abstractC3743.m5322(this);
            return;
        }
        String str = c2343.f7561;
        C2343 c2344 = this.f7559;
        if (str.equals(c2344 != null ? c2344.f7561 : null)) {
            abstractC3743.m5322(this);
            return;
        }
        ArrayList arrayList = C3741.f11709;
        String name = abstractC3743.getClass().getName();
        C2343 c2345 = this.f7559;
        C3741.m5318("This Hooker \"" + name + "\" is singleton or reused, but the current process has multiple package name \"" + (c2345 != null ? c2345.f7561 : null) + "\", the original is \"" + c2343.f7561 + "\"\nMake sure your Hooker supports multiple instances for this situation\nThe process with package name \"" + (c2345 != null ? c2345.f7561 : null) + "\" will be ignored");
    }
}
