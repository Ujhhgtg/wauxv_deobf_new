package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲁᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 implements Iterator, InterfaceC0841, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f8718;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f8719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Iterator f8720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InterfaceC0841 f8721;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f8718;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m4686();
                }
                if (this.f8720.hasNext()) {
                    this.f8718 = 2;
                    return true;
                }
                this.f8720 = null;
            }
            this.f8718 = 5;
            InterfaceC0841 interfaceC0841 = this.f8721;
            this.f8721 = null;
            interfaceC0841.mo1077(C3554.UNIT);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8718;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f8718 = 1;
            return this.f8720.next();
        }
        if (i != 3) {
            throw m4686();
        }
        this.f8718 = 0;
        Object obj = this.f8719;
        this.f8719 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final RuntimeException m4686() {
        int i = this.f8718;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8718);
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1077(Object obj) throws Throwable {
        AbstractC1470.m3372(obj);
        this.f8718 = 4;
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0876 mo1078() {
        return C1189.f4324;
    }
}
