package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0491 extends HashMap {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2107;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.f2107) {
            case 1:
                return (AbstractC0488) super.get(obj);
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        switch (this.f2107) {
            case 1:
                return (AbstractC0488) super.put((String) obj, (AbstractC0488) obj2);
            default:
                return super.put(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1724(String str) {
        String strM1727 = C0492.m1727(str);
        String str2 = (strM1727.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM1727} : C0492.f2111.split(strM1727))[1];
        if (containsKey(str2)) {
            ((C0487) get(str2)).f2104.add(str);
            return;
        }
        C0487 c0487 = new C0487();
        ArrayList arrayList = new ArrayList();
        c0487.f2104 = arrayList;
        arrayList.add(str);
        put(str2, c0487);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC0488 m1725(String str) {
        return (AbstractC0488) super.get(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1726(String str, AbstractC0488 abstractC0488) {
    }
}
