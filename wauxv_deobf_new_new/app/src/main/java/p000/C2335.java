package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2335 extends AbstractC0070 implements RandomAccess {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0516[] f7539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int[] f7540;

    public C2335(C0516[] c0516Arr, int[] iArr) {
        this.f7539 = c0516Arr;
        this.f7540 = iArr;
    }

    @Override // p000.AbstractC0070, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0516) {
            return super.contains((C0516) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f7539[i];
    }

    @Override // p000.AbstractC0070, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0516) {
            return super.indexOf((C0516) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0070, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0516) {
            return super.lastIndexOf((C0516) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0070
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1087() {
        return this.f7539.length;
    }
}
