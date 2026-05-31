package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᤞᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1332 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Iterator f4783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f4784 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f4785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1333 f4786;

    public C1332(C1333 c1333) {
        this.f4786 = c1333;
        this.f4783 = c1333.f4787.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4784 == -1) {
            m3152();
        }
        return this.f4784 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4784 == -1) {
            m3152();
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3152() {
        Object next;
        C1333 c1333;
        do {
            Iterator it = this.f4783;
            if (!it.hasNext()) {
                this.f4784 = 0;
                return;
            } else {
                next = it.next();
                c1333 = this.f4786;
            }
        } while (((Boolean) c1333.f4789.invoke(next)).booleanValue() != c1333.f4788);
        this.f4785 = next;
        this.f4784 = 1;
    }
}
