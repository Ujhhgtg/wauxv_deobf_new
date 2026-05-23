package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2562 implements InterfaceC0775 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2712 f8130;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C2563 f8131;

    public C2562(ComponentCallbacks2C2563 componentCallbacks2C2563, C2712 c2712) {
        this.f8131 = componentCallbacks2C2563;
        this.f8130 = c2712;
    }

    @Override // p000.InterfaceC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2265(boolean z) {
        if (z) {
            synchronized (this.f8131) {
                C2712 c2712 = this.f8130;
                for (InterfaceC2554 interfaceC2554 : AbstractC3522.m5108((Set) c2712.f8760)) {
                    if (!interfaceC2554.mo2858() && !interfaceC2554.mo2856()) {
                        interfaceC2554.clear();
                        if (c2712.f8759) {
                            ((HashSet) c2712.f8761).add(interfaceC2554);
                        } else {
                            interfaceC2554.mo2857();
                        }
                    }
                }
            }
        }
    }
}
