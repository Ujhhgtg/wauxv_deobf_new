package androidx.lifecycle;

import p000.AbstractC0999;
import p000.EnumC1769;
import p000.InterfaceC0998;
import p000.InterfaceC1774;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1774 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0998 f292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC1774 f293;

    public DefaultLifecycleObserverAdapter(InterfaceC0998 interfaceC0998, InterfaceC1774 interfaceC1774) {
        this.f292 = interfaceC0998;
        this.f293 = interfaceC1774;
    }

    @Override // p000.InterfaceC1774
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        int i = AbstractC0999.f3654[enumC1769.ordinal()];
        if (i == 3) {
            this.f292.mo94();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1774 interfaceC1774 = this.f293;
        if (interfaceC1774 != null) {
            interfaceC1774.mo0(interfaceC1777, enumC1769);
        }
    }
}
