package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲈᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 implements ListIterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f2084 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f2085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0478 f2086;

    public C0477(C0478 c0478, ListIterator listIterator) {
        this.f2086 = c0478;
        this.f2085 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f2084;
        C0478 c0478 = this.f2086;
        c0478.add(i, obj);
        this.f2085.add((Integer) c0478.f2088.get(this.f2084));
        this.f2084 = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2085.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2085.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f2085;
        listIterator.next();
        int iPreviousIndex = listIterator.previousIndex();
        this.f2084 = iPreviousIndex;
        return this.f2086.get(iPreviousIndex);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2085.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f2085;
        listIterator.previous();
        int iNextIndex = listIterator.nextIndex();
        this.f2084 = iNextIndex;
        return this.f2086.get(iNextIndex);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2085.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f2086.remove(this.f2084);
        this.f2085.remove();
        this.f2084 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f2086.set(this.f2084, obj);
    }
}
