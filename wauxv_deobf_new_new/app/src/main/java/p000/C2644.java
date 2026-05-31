package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲈᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2644 implements ListIterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ListIterator f8347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2645 f8348;

    public C2644(C2645 c2645, int i) {
        this.f8348 = c2645;
        this.f8347 = c2645.f8349.listIterator(AbstractC0739.m2288(c2645, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f8347;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8347.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8347.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f8347.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC0740.m2310(this.f8348) - this.f8347.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f8347.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC0740.m2310(this.f8348) - this.f8347.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f8347.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f8347.set(obj);
    }
}
