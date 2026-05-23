package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1331 implements InterfaceC2650 {

    public final InterfaceC2650 f4787;

    public final boolean f4788;

    public final InterfaceC1425 f4789;

    public C1331(InterfaceC2650 interfaceC2650, boolean z, InterfaceC1425 interfaceC1425) {
        this.f4787 = interfaceC2650;
        this.f4788 = z;
        this.f4789 = interfaceC1425;
    }

    @Override // p000.InterfaceC2650
    public final Iterator iterator() {
        return new C1330(this);
    }
}
