package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲈᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2618 implements InterfaceC0773 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2773 f8283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C2619 f8284;

    public C2618(ComponentCallbacks2C2619 componentCallbacks2C2619, C2773 c2773) {
        this.f8284 = componentCallbacks2C2619;
        this.f8283 = c2773;
    }

    @Override // p000.InterfaceC0773
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2367(boolean z) {
        if (z) {
            synchronized (this.f8284) {
                C2773 c2773 = this.f8283;
                for (InterfaceC2610 interfaceC2610 : AbstractC3580.m5120((Set) c2773.f8923)) {
                    if (!interfaceC2610.mo2984() && !interfaceC2610.mo2982()) {
                        interfaceC2610.clear();
                        if (c2773.f8922) {
                            ((HashSet) c2773.f8924).add(interfaceC2610);
                        } else {
                            interfaceC2610.mo2983();
                        }
                    }
                }
            }
        }
    }
}
