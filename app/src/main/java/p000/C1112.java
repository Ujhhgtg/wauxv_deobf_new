package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1112 implements Iterator, InterfaceC1737 {

    public final /* synthetic */ int f4156 = 1;

    public final Iterator f4157;

    public int f4158;

    public C1112(Iterator it) {
        this.f4157 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (1) {
            case 0:
                break;
            default:
                return this.f4157.hasNext();
        }
        while (true) {
            int i = this.f4158;
            it = this.f4157;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f4158--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (1) {
            case 0:
                break;
            default:
                int i = this.f4158;
                this.f4158 = i + 1;
                if (i >= 0) {
                    return new C1629(i, this.f4157.next());
                }
                AbstractC0745.m2213();
                throw null;
        }
        while (true) {
            int i2 = this.f4158;
            it = this.f4157;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f4158--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (1) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1112(C1113 c1113) {
        this.f4157 = c1113.f4159.iterator();
        this.f4158 = c1113.f4160;
    }
}
