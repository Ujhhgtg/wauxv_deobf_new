package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤞᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0590 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2571 f2401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2045 f2403;

    public /* synthetic */ C0590(C2045 c2045, C2571 c2571, ArrayList arrayList) {
        this.f2400 = 1;
        this.f2401 = c2571;
        this.f2402 = arrayList;
        this.f2403 = c2045;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        C0601 c0601;
        C0601 c0602;
        C0601 c0603;
        switch (this.f2400) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                C0615 c0615 = C0615.f2456;
                C2571 c2571 = this.f2401;
                Object obj = c2571.f8191;
                C0601 c0604 = null;
                if (obj == null) {
                    "adapter";
                    c0601 = null;
                } else {
                    c0601 = (C0601) obj;
                }
                c0615.getClass();
                ArrayList arrayList = this.f2402;
                arrayList.clear();
                C1498.f5308.getClass();
                List listM3423 = C1498.m3423();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM3423) {
                    if (((C1496) obj2).f5295) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList.addAll(AbstractC0739.m2300(arrayList2, new C0179(3)));
                c0601.m2127(arrayList);
                Object obj3 = c2571.f8191;
                if (obj3 == null) {
                    "adapter";
                } else {
                    c0604 = (C0601) obj3;
                }
                C0615.m2137(this.f2403, arrayList, c0604);
                break;
            case 1:
                String[] strArr2 = AbstractC1471.f5234;
                C2571 c2572 = this.f2401;
                Object obj4 = c2572.f8191;
                C0601 c0605 = null;
                if (obj4 == null) {
                    "adapter";
                    c0602 = null;
                } else {
                    c0602 = (C0601) obj4;
                }
                ArrayList arrayList3 = this.f2402;
                c0602.m2127(arrayList3);
                C0615 c0616 = C0615.f2456;
                Object obj5 = c2572.f8191;
                if (obj5 == null) {
                    "adapter";
                } else {
                    c0605 = (C0601) obj5;
                }
                c0616.getClass();
                C0615.m2137(this.f2403, arrayList3, c0605);
                break;
            default:
                String[] strArr3 = AbstractC1471.f5234;
                ArrayList arrayList4 = this.f2402;
                arrayList4.clear();
                C2571 c2573 = this.f2401;
                Object obj6 = c2573.f8191;
                C0601 c0606 = null;
                if (obj6 == null) {
                    "adapter";
                    c0603 = null;
                } else {
                    c0603 = (C0601) obj6;
                }
                arrayList4.addAll(c0603.f2438);
                C0615 c0617 = C0615.f2456;
                Object obj7 = c2573.f8191;
                if (obj7 == null) {
                    "adapter";
                } else {
                    c0606 = (C0601) obj7;
                }
                c0617.getClass();
                C0615.m2137(this.f2403, arrayList4, c0606);
                break;
        }
        return C3554.UNIT;
    }

    public /* synthetic */ C0590(ArrayList arrayList, C2571 c2571, C2045 c2045, int i) {
        this.f2400 = i;
        this.f2402 = arrayList;
        this.f2401 = c2571;
        this.f2403 = c2045;
    }
}
