package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0160 extends C1224 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2933 f1227 = new C2933(new C0112(4));

    @Override // p000.C1224
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final List mo1340(Class cls) {
        List listMo1340 = super.mo1340(cls);
        if (!AbstractC0164.m1348(28)) {
            return listMo1340;
        }
        List listM3440 = AbstractC1546.m3440(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3440) {
            if (obj instanceof Constructor) {
                arrayList.add(obj);
            }
        }
        return AbstractC0739.m2305(arrayList);
    }

    @Override // p000.C1224
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final List mo1341(Class cls) {
        List listMo1341 = super.mo1341(cls);
        if (!AbstractC0164.m1348(28)) {
            return listMo1341;
        }
        List listM3440 = AbstractC1546.m3440(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3440) {
            if (obj instanceof Method) {
                arrayList.add(obj);
            }
        }
        return AbstractC0739.m2305(arrayList);
    }
}
