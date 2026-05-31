package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᛸᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2001 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final SparseArray f6644;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3521 f6645;

    public C2001(int i) {
        this.f6644 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3992(C3521 c3521, int i, int i2) {
        int iM5085 = c3521.m5085(i);
        SparseArray sparseArray = this.f6644;
        C2001 c2001 = sparseArray == null ? null : (C2001) sparseArray.get(iM5085);
        if (c2001 == null) {
            c2001 = new C2001(1);
            sparseArray.put(c3521.m5085(i), c2001);
        }
        if (i2 > i) {
            c2001.m3992(c3521, i + 1, i2);
        } else {
            c2001.f6645 = c3521;
        }
    }
}
