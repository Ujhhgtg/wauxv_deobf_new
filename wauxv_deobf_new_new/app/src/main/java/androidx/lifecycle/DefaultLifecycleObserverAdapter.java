package androidx.lifecycle;

import p000.AbstractC1003;
import p000.EnumC1792;
import p000.InterfaceC1002;
import p000.InterfaceC1797;
import p000.InterfaceC1800;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1797 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1002 f292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1797 f293;

    public DefaultLifecycleObserverAdapter(InterfaceC1002 interfaceC1002, InterfaceC1797 interfaceC1797) {
        this.f292 = interfaceC1002;
        this.f293 = interfaceC1797;
    }

    @Override // p000.InterfaceC1797
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
        int i = AbstractC1003.f3670[enumC1792.ordinal()];
        if (i == 3) {
            this.f292.mo94();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1797 interfaceC1797 = this.f293;
        if (interfaceC1797 != null) {
            interfaceC1797.mo0(interfaceC1800, enumC1792);
        }
    }
}
