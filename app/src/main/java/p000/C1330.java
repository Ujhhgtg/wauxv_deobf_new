package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1330 implements Iterator, InterfaceC1737 {

    public final Iterator f4783;

    public int f4784 = -1;

    public Object f4785;

    public final /* synthetic */ C1331 f4786;

    public C1330(C1331 c1331) {
        this.f4786 = c1331;
        this.f4783 = c1331.f4787.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4784 == -1) {
            m3049();
        }
        return this.f4784 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4784 == -1) {
            m3049();
        }
        if (this.f4784 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f4785;
        this.f4785 = null;
        this.f4784 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void m3049() {
        Object next;
        C1331 c1331;
        do {
            Iterator it = this.f4783;
            if (!it.hasNext()) {
                this.f4784 = 0;
                return;
            } else {
                next = it.next();
                c1331 = this.f4786;
            }
        } while (((Boolean) c1331.f4789.invoke(next)).booleanValue() != c1331.f4788);
        this.f4785 = next;
        this.f4784 = 1;
    }
}
