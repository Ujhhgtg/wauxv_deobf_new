package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2291 extends C2436 {

    public final long f7382;

    public boolean f7383;

    public boolean f7384;

    public C2291(C2427 c2427, C2439 c2439, long j, InterfaceC2654 interfaceC2654) {
        super(c2427, c2439, interfaceC2654);
        this.f7382 = j;
    }

    @Override // p000.C2436, p000.InterfaceC0974
    public final InterfaceC0766 mo2512(InterfaceC2654 interfaceC2654) {
        if (interfaceC2654.equals(this.f7738)) {
            return this;
        }
        C2289 c2289 = new C2289(this.f7736, this.f7737, interfaceC2654);
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
            return c2289;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + interfaceC2654.mo1342() + " should have @ProtoNumber annotation").toString());
    }

    @Override // p000.C2436, p000.InterfaceC0766
    public final int mo2230(InterfaceC2654 interfaceC2654) {
        if (!this.f7383) {
            this.f7383 = true;
            return 0;
        }
        if (this.f7384) {
            return -1;
        }
        this.f7384 = true;
        return 1;
    }

    @Override // p000.C2436
    public final String mo4159(long j) {
        Object next;
        String strMo1342;
        if (j != 19501) {
            return super.mo4159(j);
        }
        int i = (int) (this.f7382 & 2147483647L);
        InterfaceC2654 interfaceC2654 = this.f7738;
        Iterator it = AbstractC1459.m3184(interfaceC2654).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((int) (AbstractC1459.m3181((InterfaceC2654) next, 0) & 2147483647L)) != i);
        InterfaceC2654 interfaceC2655 = (InterfaceC2654) next;
        if (interfaceC2655 != null && (strMo1342 = interfaceC2655.mo1342()) != null) {
            return strMo1342;
        }
        throw new C1653("Cannot find a subclass of " + interfaceC2654.mo1342() + " annotated with @ProtoNumber(" + i + ").");
    }

    @Override // p000.C2436
    public final long mo3689(InterfaceC2654 interfaceC2654, int i) {
        if (i == 0) {
            return 19501L;
        }
        return AbstractC1459.m3181(interfaceC2654, 0);
    }
}
