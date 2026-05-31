package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲁᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2324 extends C2488 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final long f7504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f7505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f7506;

    public C2324(C2480 c2480, C2491 c2491, long j, InterfaceC2715 interfaceC2715) {
        super(c2480, c2491, interfaceC2715);
        this.f7504 = j;
    }

    @Override // p000.C2488, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0764 mo2636(InterfaceC2715 interfaceC2715) {
        if (interfaceC2715.equals(this.f7882)) {
            return this;
        }
        C2322 c2322 = new C2322(this.f7880, this.f7881, interfaceC2715);
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
            return c2322;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC2715.mo1488() + " should have @ProtoNumber annotation").toString());
    }

    @Override // p000.C2488, p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2331(InterfaceC2715 interfaceC2715) {
        if (!this.f7505) {
            this.f7505 = true;
            return 0;
        }
        if (this.f7506) {
            return -1;
        }
        this.f7506 = true;
        return 1;
    }

    @Override // p000.C2488
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public final String mo4288(long j) {
        Object next;
        String strMo1488;
        if (j != 19501) {
            return super.mo4288(j);
        }
        int i = (int) (this.f7504 & 2147483647L);
        InterfaceC2715 interfaceC2715 = this.f7882;
        Iterator it = AbstractC2240.m4249(interfaceC2715).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((int) (AbstractC2240.m4246((InterfaceC2715) next, 0) & 2147483647L)) != i);
        InterfaceC2715 interfaceC2716 = (InterfaceC2715) next;
        if (interfaceC2716 != null && (strMo1488 = interfaceC2716.mo1488()) != null) {
            return strMo1488;
        }
        throw new C1667("Cannot find a subclass of " + interfaceC2715.mo1488() + " annotated with @ProtoNumber(" + i + ").");
    }

    @Override // p000.C2488
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ */
    public final long mo3868(InterfaceC2715 interfaceC2715, int i) {
        if (i == 0) {
            return 19501L;
        }
        return AbstractC2240.m4246(interfaceC2715, 0);
    }
}
