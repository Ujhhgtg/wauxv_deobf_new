package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2651 implements Iterator, InterfaceC0842, InterfaceC1737 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f8554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Iterator f8555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC0842 f8556;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f8553;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m4652();
                }
                if (this.f8555.hasNext()) {
                    this.f8553 = 2;
                    return true;
                }
                this.f8555 = null;
            }
            this.f8553 = 5;
            InterfaceC0842 interfaceC0842 = this.f8556;
            this.f8556 = null;
            interfaceC0842.mo933(C3497.f10997);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8553;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f8553 = 1;
            return this.f8555.next();
        }
        if (i != 3) {
            throw m4652();
        }
        this.f8553 = 0;
        Object obj = this.f8554;
        this.f8554 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final RuntimeException m4652() {
        int i = this.f8553;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8553);
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo933(Object obj) throws Throwable {
        AbstractC0743.m2188(obj);
        this.f8553 = 4;
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0877 mo934() {
        return C1187.f4327;
    }
}
