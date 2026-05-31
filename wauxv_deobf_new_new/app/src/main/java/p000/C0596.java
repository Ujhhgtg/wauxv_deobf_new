package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0596 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2427;

    public /* synthetic */ C0596(ArrayList arrayList, C0590 c0590, C1496 c1496) {
        this.f2424 = 1;
        this.f2425 = arrayList;
        this.f2427 = c0590;
        this.f2426 = c1496;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        Object next;
        switch (this.f2424) {
            case 0:
                C1496 c1496 = (C1496) this.f2426;
                C0590 c0590 = (C0590) this.f2427;
                Iterator it = this.f2425.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        C1496 c1497 = (C1496) next;
                        if (!AbstractC1469.m3322(c1497.f5292, c1496.f5292) || c1497.f5293 != c1496.f5293 || !AbstractC1469.m3322(c1497.f5294, c1496.f5294)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C1496 c1498 = (C1496) next;
                if (c1498 != null) {
                    c1496 = c1498;
                }
                C0114 c0114 = new C0114(c0590, 7);
                if (AbstractC2909.m4916(c1496.f5292, EnumC1497.f5303.f5306)) {
                    C1787.m3673(C1515.f5343, new C1526(c1496, 3, c0114));
                }
                break;
            case 1:
                C0590 c0591 = (C0590) this.f2427;
                C0062 c0062 = new C0062((C1496) this.f2426, 3);
                ArrayList arrayList = this.f2425;
                if (AbstractC0745.m2318(arrayList, c0062)) {
                    C0615.f2456.getClass();
                    if (C0615.m2138(arrayList)) {
                        c0591.invoke();
                    }
                }
                break;
            default:
                C1359 c1359 = (C1359) this.f2426;
                C0062 c0063 = new C0062((C1363) this.f2427, 6);
                ArrayList arrayList2 = this.f2425;
                if (AbstractC0745.m2318(arrayList2, c0063)) {
                    C1369.f4885.getClass();
                    C1369.m3185(arrayList2, c1359);
                }
                break;
        }
        return C3554.UNIT;
    }

    public /* synthetic */ C0596(ArrayList arrayList, Object obj, Object obj2, int i) {
        this.f2424 = i;
        this.f2425 = arrayList;
        this.f2426 = obj;
        this.f2427 = obj2;
    }
}
