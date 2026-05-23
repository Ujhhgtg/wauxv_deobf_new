package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0062 extends AbstractC0063 implements RandomAccess {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC0063 f996;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f998;

    public C0062(AbstractC0063 abstractC0063, int i, int i2) {
        this.f996 = abstractC0063;
        this.f997 = i;
        AbstractC2665.m4662(i, i2, abstractC0063.mo943());
        this.f998 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f998;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", i2));
        }
        return this.f996.get(this.f997 + i);
    }

    @Override // p000.AbstractC0063, java.util.List
    public final List subList(int i, int i2) {
        AbstractC2665.m4662(i, i2, this.f998);
        int i3 = this.f997;
        return new C0062(this.f996, i + i3, i3 + i2);
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo943() {
        return this.f998;
    }
}
