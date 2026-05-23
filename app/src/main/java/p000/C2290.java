package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤞᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2290 extends C2438 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1744 f7381;

    public C2290(C2427 c2427, C1744 c1744, InterfaceC2654 interfaceC2654) {
        super(c2427, c1744, interfaceC2654);
        this.f7381 = c1744;
        if (interfaceC2654.mo3472() instanceof AbstractC2375) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + interfaceC2654.mo1342() + " should be using generic polymorphic serializer, but got " + interfaceC2654.mo3472() + '.').toString());
    }

    @Override // p000.C2438, p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0767 mo2796(InterfaceC2654 interfaceC2654) {
        if (interfaceC2654.equals(this.f7747)) {
            return this;
        }
        C2288 c2288 = new C2288(this.f7745, this.f7381, interfaceC2654);
        if (interfaceC2654.mo3473() != 1) {
            throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC2654.mo1342() + " should contain only 1 element, but get " + interfaceC2654.mo3473()).toString());
        }
        List listMo3475 = interfaceC2654.mo3475(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo3475) {
            if (obj instanceof InterfaceC2430) {
                arrayList.add(obj);
            }
        }
        if (((InterfaceC2430) AbstractC0744.m2200(arrayList)) != null) {
            return c2288;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC2654.mo1342() + " should have @ProtoNumber annotation").toString());
    }

    @Override // p000.C2438, p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC1206 mo2803(InterfaceC2654 interfaceC2654) {
        int i = this.f2399;
        if (i < 0) {
            throw new C1653("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f2400;
        this.f2399 = i - 1;
        m2024((jArr[i] & 1152921500311879680L) | ((long) ((int) (AbstractC1459.m3181(interfaceC2654, 0) & 2147483647L))));
        return this;
    }

    @Override // p000.C2438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final void mo4158(long j, String str) {
        if (j != 19501) {
            super.mo4158(j, str);
        }
    }

    @Override // p000.C2438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public final long mo3691(InterfaceC2654 interfaceC2654, int i) {
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return AbstractC1459.m3181(interfaceC2654, i);
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(i, "Unsupported index: ", " in a oneOf type ");
        sbM2787.append(interfaceC2654.mo1342());
        sbM2787.append(", which should be using generic polymorphic serializer");
        throw new C1653(sbM2787.toString());
    }
}
