package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1834 implements ListIterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6109;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final AbstractC0072 f6112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6108 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6110 = -1;

    public C1834(C1836 c1836, int i) {
        this.f6112 = c1836;
        this.f6109 = i;
        this.f6111 = ((AbstractList) c1836).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f6108) {
            case 0:
                m3733();
                C1835 c1835 = (C1835) this.f6112;
                int i = this.f6109;
                this.f6109 = i + 1;
                c1835.add(i, obj);
                this.f6110 = -1;
                this.f6111 = ((AbstractList) c1835).modCount;
                break;
            default:
                m3734();
                C1836 c1836 = (C1836) this.f6112;
                int i2 = this.f6109;
                this.f6109 = i2 + 1;
                c1836.add(i2, obj);
                this.f6110 = -1;
                this.f6111 = ((AbstractList) c1836).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6108) {
            case 0:
                return this.f6109 < ((C1835) this.f6112).f6115;
            default:
                return this.f6109 < ((C1836) this.f6112).f6120;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f6108) {
            case 0:
                return this.f6109 > 0;
            default:
                return this.f6109 > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f6108) {
            case 0:
                m3733();
                int i = this.f6109;
                C1835 c1835 = (C1835) this.f6112;
                if (i >= c1835.f6115) {
                    throw new NoSuchElementException();
                }
                this.f6109 = i + 1;
                this.f6110 = i;
                return c1835.f6113[c1835.f6114 + i];
            default:
                m3734();
                int i2 = this.f6109;
                C1836 c1836 = (C1836) this.f6112;
                if (i2 >= c1836.f6120) {
                    throw new NoSuchElementException();
                }
                this.f6109 = i2 + 1;
                this.f6110 = i2;
                return c1836.f6119[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f6108) {
            case 0:
                break;
        }
        return this.f6109;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f6108) {
            case 0:
                m3733();
                int i = this.f6109;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f6109 = i2;
                this.f6110 = i2;
                C1835 c1835 = (C1835) this.f6112;
                return c1835.f6113[c1835.f6114 + i2];
            default:
                m3734();
                int i3 = this.f6109;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f6109 = i4;
                this.f6110 = i4;
                return ((C1836) this.f6112).f6119[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f6108) {
            case 0:
                i = this.f6109;
                break;
            default:
                i = this.f6109;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f6108) {
            case 0:
                C1835 c1835 = (C1835) this.f6112;
                m3733();
                int i = this.f6110;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1835.mo1092(i);
                this.f6109 = this.f6110;
                this.f6110 = -1;
                this.f6111 = ((AbstractList) c1835).modCount;
                return;
            default:
                C1836 c1836 = (C1836) this.f6112;
                m3734();
                int i2 = this.f6110;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1836.mo1092(i2);
                this.f6109 = this.f6110;
                this.f6110 = -1;
                this.f6111 = ((AbstractList) c1836).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f6108) {
            case 0:
                m3733();
                int i = this.f6110;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1835) this.f6112).set(i, obj);
                return;
            default:
                m3734();
                int i2 = this.f6110;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1836) this.f6112).set(i2, obj);
                return;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m3733() {
        if (((AbstractList) ((C1835) this.f6112).f6117).modCount != this.f6111) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3734() {
        if (((AbstractList) ((C1836) this.f6112)).modCount != this.f6111) {
            throw new ConcurrentModificationException();
        }
    }

    public C1834(C1835 c1835, int i) {
        this.f6112 = c1835;
        this.f6109 = i;
        this.f6111 = ((AbstractList) c1835).modCount;
    }
}
