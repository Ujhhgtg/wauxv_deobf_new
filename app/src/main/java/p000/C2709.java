package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2709 implements InterfaceC0775 {

    public final /* synthetic */ C2712 f8753;

    public C2709(C2712 c2712) {
        this.f8753 = c2712;
    }

    @Override // p000.InterfaceC0775
    public final void mo2265(boolean z) {
        ArrayList arrayList;
        AbstractC3522.m5104();
        synchronized (this.f8753) {
            arrayList = new ArrayList((HashSet) this.f8753.f8761);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0775) it.next()).mo2265(z);
        }
    }
}
