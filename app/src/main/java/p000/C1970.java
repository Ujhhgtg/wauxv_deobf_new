package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᤝᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1970 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final SparseArray f6539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3465 f6540;

    public C1970(int i) {
        this.f6539 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3798(C3465 c3465, int i, int i2) {
        int iM5060 = c3465.m5060(i);
        SparseArray sparseArray = this.f6539;
        C1970 c1970 = sparseArray == null ? null : (C1970) sparseArray.get(iM5060);
        if (c1970 == null) {
            c1970 = new C1970(1);
            sparseArray.put(c3465.m5060(i), c1970);
        }
        if (i2 > i) {
            c1970.m3798(c3465, i + 1, i2);
        } else {
            c1970.f6540 = c3465;
        }
    }
}
