package p000;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2532 implements InterfaceC2689 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet f8067 = new LinkedHashSet();

    public C2532(C0224 c0224) {
        Object obj;
        C2681 c2681 = (C2681) c0224.f1401;
        C2678 c2678Mo3104 = c2681.mo3104("androidx.savedstate.Restarter");
        if (c2678Mo3104 != null) {
            obj = c2678Mo3104.f8662;
        } else {
            C2678 c2678 = new C2678("androidx.savedstate.Restarter", this);
            c2681.f8671++;
            C2678 c2679 = c2681.f8669;
            if (c2679 == null) {
                c2681.f8668 = c2678;
                c2681.f8669 = c2678;
            } else {
                c2679.f8663 = c2678;
                c2678.f8664 = c2679;
                c2681.f8669 = c2678;
            }
            obj = null;
        }
        if (((InterfaceC2689) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
