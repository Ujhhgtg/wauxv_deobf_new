package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0577 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f2372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f2373;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2374;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2375;

    public C0577(char c, int i) {
        this.f2372 = i;
        this.f2373 = c;
        boolean z = false;
        if (i <= 0 ? AbstractC1469.m3327(1, c) >= 0 : AbstractC1469.m3327(1, c) <= 0) {
            z = true;
        }
        this.f2374 = z;
        this.f2375 = z ? (char) 1 : c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2374;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2375;
        if (i != this.f2373) {
            this.f2375 = this.f2372 + i;
        } else {
            if (!this.f2374) {
                throw new NoSuchElementException();
            }
            this.f2374 = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
