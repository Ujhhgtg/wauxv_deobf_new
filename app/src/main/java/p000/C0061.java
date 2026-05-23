package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0061 extends C0060 implements ListIterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0063 f995;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061(AbstractC0063 abstractC0063, int i) {
        super(0, abstractC0063);
        this.f995 = abstractC0063;
        int iMo943 = abstractC0063.mo943();
        if (i < 0 || i > iMo943) {
            throw new IndexOutOfBoundsException(AbstractC2784.m4745(i, "index: ", ", size: ", iMo943));
        }
        this.f993 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f993 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f993;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f993 - 1;
        this.f993 = i;
        return this.f995.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f993 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
