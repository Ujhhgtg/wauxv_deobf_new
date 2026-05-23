package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤞᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2897 implements InterfaceC1775 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Set f9314 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo1620() {
        Iterator it = AbstractC3522.m5108(this.f9314).iterator();
        while (it.hasNext()) {
            ((InterfaceC2894) it.next()).mo1620();
        }
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo1622() {
        Iterator it = AbstractC3522.m5108(this.f9314).iterator();
        while (it.hasNext()) {
            ((InterfaceC2894) it.next()).mo1622();
        }
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1626() {
        Iterator it = AbstractC3522.m5108(this.f9314).iterator();
        while (it.hasNext()) {
            ((InterfaceC2894) it.next()).mo1626();
        }
    }
}
