package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲀᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1384 implements InterfaceC0798 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4988;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4989;

    public /* synthetic */ C1384(Object obj, int i) {
        this.f4988 = i;
        this.f4989 = obj;
    }

    @Override // p000.InterfaceC0798
    public final void accept(Object obj) {
        switch (this.f4988) {
            case 0:
                C1385 c1385 = (C1385) obj;
                if (c1385 == null) {
                    c1385 = new C1385(-3);
                }
                ((C0519) this.f4989).m1994(c1385);
                return;
            default:
                C1385 c1386 = (C1385) obj;
                synchronized (AbstractC1386.f4994) {
                    try {
                        C2767 c2767 = AbstractC1386.f4995;
                        ArrayList arrayList = (ArrayList) c2767.get((String) this.f4989);
                        if (arrayList == null) {
                            return;
                        }
                        c2767.remove((String) this.f4989);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0798) arrayList.get(i)).accept(c1386);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
