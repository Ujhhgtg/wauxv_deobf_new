package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲈᲁᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2302 extends AbstractC0063 implements RandomAccess {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0539[] f7417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int[] f7418;

    public C2302(C0539[] c0539Arr, int[] iArr) {
        this.f7417 = c0539Arr;
        this.f7418 = iArr;
    }

    @Override // p000.AbstractC0063, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0539) {
            return super.contains((C0539) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f7417[i];
    }

    @Override // p000.AbstractC0063, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0539) {
            return super.indexOf((C0539) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0063, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0539) {
            return super.lastIndexOf((C0539) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo943() {
        return this.f7417.length;
    }
}
