package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲇᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0452 implements ListIterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2056 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f2057;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0453 f2058;

    public C0452(C0453 c0453, ListIterator listIterator) {
        this.f2058 = c0453;
        this.f2057 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f2056;
        C0453 c0453 = this.f2058;
        c0453.add(i, obj);
        this.f2057.add((Integer) c0453.f2060.get(this.f2056));
        this.f2056 = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2057.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2057.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f2057;
        listIterator.next();
        int iPreviousIndex = listIterator.previousIndex();
        this.f2056 = iPreviousIndex;
        return this.f2058.get(iPreviousIndex);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2057.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f2057;
        listIterator.previous();
        int iNextIndex = listIterator.nextIndex();
        this.f2056 = iNextIndex;
        return this.f2058.get(iNextIndex);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2057.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f2058.remove(this.f2056);
        this.f2057.remove();
        this.f2056 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f2058.set(this.f2056, obj);
    }
}
