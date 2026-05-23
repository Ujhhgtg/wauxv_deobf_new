package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1376 implements InterfaceC0799 {

    public final /* synthetic */ int f4959;

    public final /* synthetic */ Object f4960;

    public /* synthetic */ C1376(int i, Object obj) {
        this.f4959 = i;
        this.f4960 = obj;
    }

    @Override // p000.InterfaceC0799
    public final void accept(Object obj) {
        switch (this.f4959) {
            case 0:
                C1377 c1377 = (C1377) obj;
                if (c1377 == null) {
                    c1377 = new C1377(-3);
                }
                ((C0542) this.f4960).m1900(c1377);
                return;
            default:
                C1377 c1378 = (C1377) obj;
                synchronized (AbstractC1378.f4965) {
                    try {
                        C2705 c2705 = AbstractC1378.f4966;
                        ArrayList arrayList = (ArrayList) c2705.get((String) this.f4960);
                        if (arrayList == null) {
                            return;
                        }
                        c2705.remove((String) this.f4960);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0799) arrayList.get(i)).accept(c1378);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
