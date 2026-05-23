package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0596 implements Iterator, InterfaceC1737 {

    public final int f2406;

    public final int f2407;

    public boolean f2408;

    public int f2409;

    public C0596(char c, int i) {
        this.f2406 = i;
        this.f2407 = c;
        boolean z = false;
        if (i <= 0 ? AbstractC2207.m4089(1, c) >= 0 : AbstractC2207.m4089(1, c) <= 0) {
            z = true;
        }
        this.f2408 = z;
        this.f2409 = z ? (char) 1 : c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2408;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2409;
        if (i != this.f2407) {
            this.f2409 = this.f2406 + i;
        } else {
            if (!this.f2408) {
                throw new NoSuchElementException();
            }
            this.f2408 = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
