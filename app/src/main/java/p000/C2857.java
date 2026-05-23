package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2857 extends C1705 {

    public final boolean f9128;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    public C2857() {
        super(true);
        boolean z = true;
        m3456(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1705.f5797;
        InterfaceC0687 interfaceC0687 = (InterfaceC0687) atomicReferenceFieldUpdater.get(this);
        C0688 c0688 = interfaceC0687 instanceof C0688 ? (C0688) interfaceC0687 : null;
        if (c0688 == null) {
            z = false;
            break;
        }
        C1705 c1705 = c0688.f5786;
        c1705 = c1705 == null ? null : c1705;
        if (c1705 == null) {
            z = false;
            break;
        }
        while (!c1705.mo3454()) {
            InterfaceC0687 interfaceC0688 = (InterfaceC0687) atomicReferenceFieldUpdater.get(c1705);
            C0688 c0689 = interfaceC0688 instanceof C0688 ? (C0688) interfaceC0688 : null;
            if (c0689 != null) {
                c1705 = c0689.f5786;
                if (c1705 == null) {
                    c1705 = null;
                }
                if (c1705 == null) {
                }
            }
            z = false;
        }
        this.f9128 = z;
    }

    @Override // p000.C1705
    public final boolean mo3450(Throwable th) {
        return false;
    }

    @Override // p000.C1705
    public final boolean mo3454() {
        return this.f9128;
    }
}
