package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2100 implements InterfaceC0955, InterfaceC0954 {

    public final ArrayList f6920;

    public final InterfaceC2378 f6921;

    public int f6922;

    public EnumC2401 f6923;

    public InterfaceC0954 f6924;

    public List f6925;

    public boolean f6926;

    public C2100(ArrayList arrayList, InterfaceC2378 interfaceC2378) {
        this.f6921 = interfaceC2378;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f6920 = arrayList;
        this.f6922 = 0;
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
        this.f6926 = true;
        Iterator it = this.f6920.iterator();
        while (it.hasNext()) {
            ((InterfaceC0955) it.next()).cancel();
        }
    }

    @Override // p000.InterfaceC0955
    public final Class mo1391() {
        return ((InterfaceC0955) this.f6920.get(0)).mo1391();
    }

    @Override // p000.InterfaceC0955
    public final void mo1855() {
        List list = this.f6925;
        if (list != null) {
            this.f6921.mo1311(list);
        }
        this.f6925 = null;
        Iterator it = this.f6920.iterator();
        while (it.hasNext()) {
            ((InterfaceC0955) it.next()).mo1855();
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        this.f6923 = enumC2401;
        this.f6924 = interfaceC0954;
        this.f6925 = (List) this.f6921.mo1312();
        ((InterfaceC0955) this.f6920.get(this.f6922)).mo1856(enumC2401, this);
        if (this.f6926) {
            cancel();
        }
    }

    @Override // p000.InterfaceC0954
    public final void mo1882(Exception exc) {
        List list = this.f6925;
        AbstractC1460.m3210(list, "Argument must not be null");
        list.add(exc);
        m3892();
    }

    @Override // p000.InterfaceC0955
    public final int mo1857() {
        return ((InterfaceC0955) this.f6920.get(0)).mo1857();
    }

    public final void m3892() {
        if (this.f6926) {
            return;
        }
        if (this.f6922 < this.f6920.size() - 1) {
            this.f6922++;
            mo1856(this.f6923, this.f6924);
        } else {
            AbstractC1460.m3209(this.f6925);
            this.f6924.mo1882(new C1463("Fetch failed", new ArrayList(this.f6925)));
        }
    }

    @Override // p000.InterfaceC0954
    public final void mo1883(Object obj) {
        if (obj != null) {
            this.f6924.mo1883(obj);
        } else {
            m3892();
        }
    }
}
