package p000;

import bsh.Primitive;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0355 extends AbstractC2707 {
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        for (int i = 0; i < m4710().length; i++) {
            this.f8721[i].mo306(c0550, runnableC1668);
        }
        return Primitive.VOID;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList m1465() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m4710().length; i++) {
            try {
                ((C0331) this.f8721[i]).m1442();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        return arrayList;
    }
}
