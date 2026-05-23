package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0152 extends C1227 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2873 f1159 = new C2873(new C0104(4));

    @Override // p000.C1227
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final List mo1194(Class cls) {
        List listMo1194 = super.mo1194(cls);
        if (!AbstractC0156.m1202(28)) {
            return listMo1194;
        }
        List listM3259 = AbstractC1534.m3259(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3259) {
            if (obj instanceof Constructor) {
                arrayList.add(obj);
            }
        }
        return AbstractC0744.m2206(arrayList);
    }

    @Override // p000.C1227
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final List mo1195(Class cls) {
        List listMo1195 = super.mo1195(cls);
        if (!AbstractC0156.m1202(28)) {
            return listMo1195;
        }
        List listM3259 = AbstractC1534.m3259(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3259) {
            if (obj instanceof Method) {
                arrayList.add(obj);
            }
        }
        return AbstractC0744.m2206(arrayList);
    }
}
