package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲈᲀᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2956 implements InterfaceC1798 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Set f9481 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo1726() {
        Iterator it = AbstractC3580.m5120(this.f9481).iterator();
        while (it.hasNext()) {
            ((InterfaceC2953) it.next()).mo1726();
        }
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo1728() {
        Iterator it = AbstractC3580.m5120(this.f9481).iterator();
        while (it.hasNext()) {
            ((InterfaceC2953) it.next()).mo1728();
        }
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1732() {
        Iterator it = AbstractC3580.m5120(this.f9481).iterator();
        while (it.hasNext()) {
            ((InterfaceC2953) it.next()).mo1732();
        }
    }
}
