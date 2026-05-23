package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1662 implements Iterator, InterfaceC1737 {

    public final int f5615;

    public final int f5616;

    public boolean f5617;

    public int f5618;

    public C1662(int i, int i2, int i3) {
        this.f5615 = i3;
        this.f5616 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f5617 = z;
        this.f5618 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5617;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f5618;
        if (i != this.f5616) {
            this.f5618 = this.f5615 + i;
            return i;
        }
        if (!this.f5617) {
            throw new NoSuchElementException();
        }
        this.f5617 = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
