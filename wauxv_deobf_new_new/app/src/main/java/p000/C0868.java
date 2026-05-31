package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲈᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0868 implements InterfaceC1929 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0869 f3303;

    public C0868(C0869 c0869) {
        this.f3303 = c0869;
    }

    @Override // p000.InterfaceC1929
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2502(C2136 c2136, AbstractC2254 abstractC2254) {
        String str = ((C2960) abstractC2254).f9491;
        ((C2852) c2136.f7061).f9076.append(str);
        ArrayList arrayList = (ArrayList) this.f3303.f3305;
        if (arrayList.isEmpty()) {
            return;
        }
        c2136.m4102();
        str.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
    }
}
