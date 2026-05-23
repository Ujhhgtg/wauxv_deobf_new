package androidx.lifecycle;

import android.os.Bundle;
import p000.C2624;
import p000.EnumC1769;
import p000.InterfaceC1774;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1774 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2624 f296;

    public SavedStateHandleAttacher(C2624 c2624) {
        this.f296 = c2624;
    }

    @Override // p000.InterfaceC1774
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        if (enumC1769 != EnumC1769.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1769).toString());
        }
        interfaceC1777.mo750().m102(this);
        C2624 c2624 = this.f296;
        if (c2624.f8514) {
            return;
        }
        Bundle bundleM1241 = c2624.f8513.m1241("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c2624.f8515;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM1241 != null) {
            bundle.putAll(bundleM1241);
        }
        c2624.f8515 = bundle;
        c2624.f8514 = true;
    }
}
