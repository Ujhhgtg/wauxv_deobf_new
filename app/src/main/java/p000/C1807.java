package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᤝᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1807 implements ListIterator, InterfaceC1737 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6034;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6036;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0064 f6037;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6033 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6035 = -1;

    public C1807(C1809 c1809, int i) {
        this.f6037 = c1809;
        this.f6034 = i;
        this.f6036 = ((AbstractList) c1809).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (0) {
            case 0:
                m3555();
                C1808 c1808 = (C1808) this.f6037;
                int i = this.f6034;
                this.f6034 = i + 1;
                c1808.add(i, obj);
                this.f6035 = -1;
                this.f6036 = ((AbstractList) c1808).modCount;
                break;
            default:
                m3556();
                C1809 c1809 = (C1809) this.f6037;
                int i2 = this.f6034;
                this.f6034 = i2 + 1;
                c1809.add(i2, obj);
                this.f6035 = -1;
                this.f6036 = ((AbstractList) c1809).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (0) {
            case 0:
                return this.f6034 < ((C1808) this.f6037).f6040;
            default:
                return this.f6034 < ((C1809) this.f6037).f6045;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (0) {
            case 0:
                return this.f6034 > 0;
            default:
                return this.f6034 > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (0) {
            case 0:
                m3555();
                int i = this.f6034;
                C1808 c1808 = (C1808) this.f6037;
                if (i >= c1808.f6040) {
                    throw new NoSuchElementException();
                }
                this.f6034 = i + 1;
                this.f6035 = i;
                return c1808.f6038[c1808.f6039 + i];
            default:
                m3556();
                int i2 = this.f6034;
                C1809 c1809 = (C1809) this.f6037;
                if (i2 >= c1809.f6045) {
                    throw new NoSuchElementException();
                }
                this.f6034 = i2 + 1;
                this.f6035 = i2;
                return c1809.f6044[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (0) {
            case 0:
                break;
        }
        return this.f6034;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (0) {
            case 0:
                m3555();
                int i = this.f6034;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f6034 = i2;
                this.f6035 = i2;
                C1808 c1808 = (C1808) this.f6037;
                return c1808.f6038[c1808.f6039 + i2];
            default:
                m3556();
                int i3 = this.f6034;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f6034 = i4;
                this.f6035 = i4;
                return ((C1809) this.f6037).f6044[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (0) {
            case 0:
                i = this.f6034;
                break;
            default:
                i = this.f6034;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (0) {
            case 0:
                C1808 c1808 = (C1808) this.f6037;
                m3555();
                int i = this.f6035;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1808.mo945(i);
                this.f6034 = this.f6035;
                this.f6035 = -1;
                this.f6036 = ((AbstractList) c1808).modCount;
                return;
            default:
                C1809 c1809 = (C1809) this.f6037;
                m3556();
                int i2 = this.f6035;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1809.mo945(i2);
                this.f6034 = this.f6035;
                this.f6035 = -1;
                this.f6036 = ((AbstractList) c1809).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (0) {
            case 0:
                m3555();
                int i = this.f6035;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1808) this.f6037).set(i, obj);
                return;
            default:
                m3556();
                int i2 = this.f6035;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1809) this.f6037).set(i2, obj);
                return;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3555() {
        if (((AbstractList) ((C1808) this.f6037).f6042).modCount != this.f6036) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m3556() {
        if (((AbstractList) ((C1809) this.f6037)).modCount != this.f6036) {
            throw new ConcurrentModificationException();
        }
    }

    public C1807(C1808 c1808, int i) {
        this.f6037 = c1808;
        this.f6034 = i;
        this.f6036 = ((AbstractList) c1808).modCount;
    }
}
