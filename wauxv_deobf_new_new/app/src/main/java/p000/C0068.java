package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0068 extends C0067 implements ListIterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0070 f1060;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068(AbstractC0070 abstractC0070, int i) {
        super(abstractC0070, 0);
        this.f1060 = abstractC0070;
        int iMo1087 = abstractC0070.mo1087();
        if (i < 0 || i > iMo1087) {
            throw new IndexOutOfBoundsException(AbstractC2844.m4779(i, "index: ", ", size: ", iMo1087));
        }
        this.f1058 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1058 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1058;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f1058 - 1;
        this.f1058 = i;
        return this.f1060.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1058 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
