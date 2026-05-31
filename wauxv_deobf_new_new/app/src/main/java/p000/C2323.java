package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲁᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2323 extends C2490 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1681 f7503;

    public C2323(C2480 c2480, C1681 c1681, InterfaceC2715 interfaceC2715) {
        super(c2480, c1681, interfaceC2715);
        this.f7503 = c1681;
        if (interfaceC2715.mo3640() instanceof AbstractC2428) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + interfaceC2715.mo1488() + " should be using generic polymorphic serializer, but got " + interfaceC2715.mo3640() + '.').toString());
    }

    @Override // p000.C2490, p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0765 mo2918(InterfaceC2715 interfaceC2715) {
        if (interfaceC2715.equals(this.f7891)) {
            return this;
        }
        C2321 c2321 = new C2321(this.f7889, this.f7503, interfaceC2715);
        if (interfaceC2715.mo3641() != 1) {
            throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC2715.mo1488() + " should contain only 1 element, but get " + interfaceC2715.mo3641()).toString());
        }
        List listMo3643 = interfaceC2715.mo3643(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo3643) {
            if (obj instanceof InterfaceC2483) {
                arrayList.add(obj);
            }
        }
        if (((InterfaceC2483) AbstractC0739.m2299(arrayList)) != null) {
            return c2321;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC2715.mo1488() + " should have @ProtoNumber annotation").toString());
    }

    @Override // p000.C2490, p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC1207 mo2925(InterfaceC2715 interfaceC2715) {
        int i = this.f2365;
        if (i < 0) {
            throw new C1667("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f2366;
        this.f2365 = i - 1;
        m2121((jArr[i] & 1152921500311879680L) | ((long) ((int) (AbstractC2240.m4246(interfaceC2715, 0) & 2147483647L))));
        return this;
    }

    @Override // p000.C2490
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final void mo4287(long j, String str) {
        if (j != 19501) {
            super.mo4287(j, str);
        }
    }

    @Override // p000.C2490
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public final long mo3870(InterfaceC2715 interfaceC2715, int i) {
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return AbstractC2240.m4246(interfaceC2715, i);
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(i, "Unsupported index: ", " in a oneOf type ");
        sbM2802.append(interfaceC2715.mo1488());
        sbM2802.append(", which should be using generic polymorphic serializer");
        throw new C1667(sbM2802.toString());
    }
}
