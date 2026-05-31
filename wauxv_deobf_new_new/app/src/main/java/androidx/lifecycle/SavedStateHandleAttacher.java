package androidx.lifecycle;

import android.os.Bundle;
import p000.C2685;
import p000.EnumC1792;
import p000.InterfaceC1797;
import p000.InterfaceC1800;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1797 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2685 f296;

    public SavedStateHandleAttacher(C2685 c2685) {
        this.f296 = c2685;
    }

    @Override // p000.InterfaceC1797
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
        if (enumC1792 != EnumC1792.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1792).toString());
        }
        interfaceC1800.mo894().m102(this);
        C2685 c2685 = this.f296;
        if (c2685.f8679) {
            return;
        }
        Bundle bundleM1387 = c2685.f8678.m1387("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c2685.f8680;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM1387 != null) {
            bundle.putAll(bundleM1387);
        }
        c2685.f8680 = bundle;
        c2685.f8679 = true;
    }
}
