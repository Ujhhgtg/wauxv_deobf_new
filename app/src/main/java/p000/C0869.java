package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲀᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0869 implements InterfaceC1902 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0870 f3296;

    public C0869(C0870 c0870) {
        this.f3296 = c0870;
    }

    @Override // p000.InterfaceC1902
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2385(C2103 c2103, AbstractC2224 abstractC2224) {
        String str = ((C2901) abstractC2224).f9324;
        ((C2792) c2103.f6937).f8914.append(str);
        ArrayList arrayList = (ArrayList) this.f3296.f3298;
        if (arrayList.isEmpty()) {
            return;
        }
        c2103.m3918();
        
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
    }
}
