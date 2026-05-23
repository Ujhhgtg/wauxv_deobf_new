package p000;

import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲇᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0327 extends AbstractC2707 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object[] m1434(C0550 c0550, RunnableC1668 runnableC1668) {
        int length = m4710().length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objMo306 = this.f8721[i].mo306(c0550, runnableC1668);
            objArr[i] = objMo306;
            if (objMo306 == Primitive.VOID) {
                throw new C1230("Undefined argument: " + this.f8721[i].getText(), this, c0550);
            }
        }
        return objArr;
    }
}
