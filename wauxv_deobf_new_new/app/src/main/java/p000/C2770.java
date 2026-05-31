package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2770 implements InterfaceC0773 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2773 f8916;

    public C2770(C2773 c2773) {
        this.f8916 = c2773;
    }

    @Override // p000.InterfaceC0773
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2367(boolean z) {
        ArrayList arrayList;
        AbstractC3580.m5116();
        synchronized (this.f8916) {
            arrayList = new ArrayList((HashSet) this.f8916.f8924);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0773) it.next()).mo2367(z);
        }
    }
}
