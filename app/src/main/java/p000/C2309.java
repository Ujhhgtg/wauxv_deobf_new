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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤞᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2309 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2310 f7437 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final C3689 createHook(C2309 c2309, List list) {
        
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Member member = (Member) it.next();
            if (!(member instanceof Constructor) && !(member instanceof Method)) {
                throw new IllegalStateException(("This type [" + member + "] not support to hook, supported are Constructors and Methods").toString());
            }
        }
        Throwable th = new Throwable("There is no hook class instance");
        C0094 c0094 = new C0094(24);
        c0094.f1049 = th;
        C3689 c3689 = new C3689(new C2825(c2309, c0094), 1, 2);
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = c3689.f11595;
            linkedHashSet.clear();
            linkedHashSet.addAll(list);
        }
        return c3689;
    }

    public final String toString() {
        return "PackageParam(" + super.toString() + ") by " + this.f7437;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final String m4173() {
        Object c2585;
        String str;
        C2310 c2310 = this.f7437;
        if (c2310 != null) {
            return c2310.f7440;
        }
        
        try {
            c2585 = AndroidAppHelper.currentProcessName();
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        String str2 = null;
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        String str3 = (String) c2585;
        if (str3 != null) {
            return str3;
        }
        int i = 0;
        C0243 c0243 = C0251.f1419;
        InterfaceC1742 interfaceC1742 = C0251.f1416[0];
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(c0243.m1323());
        C2873 c2873 = C0152.f1159;
        ((C1927) c1744M2483.f5843).f6366 = AbstractC2205.m4054();
        c1744M2483.m3493(true);
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.name = "currentPackageName";
        C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.resolve());
        if (c1982 != null && (str = (String) c1982.invoke(new Object[0])) != null && !AbstractC2841.m4836(str)) {
            str2 = str;
        }
        return str2 == null ? "android" : str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final C3689 m4174(AbstractC1938 abstractC1938, int i) {
        if (!(abstractC1938 instanceof C0798) && !(abstractC1938 instanceof C1982)) {
            throw new IllegalStateException(("This type [" + abstractC1938 + "] not support to hook, supported are Constructors and Methods").toString());
        }
        List listSingletonList = Collections.singletonList(abstractC1938.mo2350());
        Throwable th = new Throwable("There is no hook class instance");
        C0094 c0094 = new C0094(24);
        c0094.f1049 = th;
        C3689 c3689 = new C3689(new C2825(this, c0094), i, 3);
        if (true) {
            LinkedHashSet linkedHashSet = c3689.f11595;
            linkedHashSet.clear();
            linkedHashSet.addAll(listSingletonList);
        }
        return c3689;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m4175(AbstractC3680 abstractC3680) {
        C2310 c2310 = abstractC3680.f7437;
        if (c2310 == null) {
            abstractC3680.m5313(this);
            return;
        }
        if (AbstractC2841.m4836(c2310.f7439) || c2310.f7438 == 1) {
            abstractC3680.m5313(this);
            return;
        }
        String str = c2310.f7439;
        C2310 c2311 = this.f7437;
        if (str.equals(c2311 != null ? c2311.f7439 : null)) {
            abstractC3680.m5313(this);
            return;
        }
        ArrayList arrayList = C3678.f11549;
        String name = abstractC3680.getClass().getName();
        C2310 c2312 = this.f7437;
        C3678.m5309("This Hooker \"" + name + "\" is singleton or reused, but the current process has multiple package name \"" + (c2312 != null ? c2312.f7439 : null) + "\", the original is \"" + c2310.f7439 + "\"\nMake sure your Hooker supports multiple instances for this situation\nThe process with package name \"" + (c2312 != null ? c2312.f7439 : null) + "\" will be ignored");
    }
}
