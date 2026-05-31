package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0069 extends AbstractC0070 implements RandomAccess {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC0070 f1061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f1062;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1063;

    public C0069(AbstractC0070 abstractC0070, int i, int i2) {
        this.f1061 = abstractC0070;
        this.f1062 = i;
        AbstractC1468.m3301(i, i2, abstractC0070.mo1087());
        this.f1063 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f1063;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", i2));
        }
        return this.f1061.get(this.f1062 + i);
    }

    @Override // p000.AbstractC0070, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1468.m3301(i, i2, this.f1063);
        int i3 = this.f1062;
        return new C0069(this.f1061, i + i3, i3 + i2);
    }

    @Override // p000.AbstractC0070
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo1087() {
        return this.f1063;
    }
}
