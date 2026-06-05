package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ要点脸ᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0112Ujhhgtgfeyxiexzf implements ListIterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1242Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f1244Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final AbstractC2935Ujhhgtgfeyxiexzf f1245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1241Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1243Ujhhgtgfeyxiexzf = -1;

    public C0112Ujhhgtgfeyxiexzf(C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf, int i) {
        this.f1245Ujhhgtgfeyxiexzf = c0094Ujhhgtgfeyxiexzf;
        this.f1242Ujhhgtgfeyxiexzf = i;
        this.f1244Ujhhgtgfeyxiexzf = ((AbstractList) c0094Ujhhgtgfeyxiexzf).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                m1166Ujhhgtgfeyxiexzf();
                C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = (C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                int i = this.f1242Ujhhgtgfeyxiexzf;
                this.f1242Ujhhgtgfeyxiexzf = i + 1;
                c0111Ujhhgtgfeyxiexzf.add(i, obj);
                this.f1243Ujhhgtgfeyxiexzf = -1;
                this.f1244Ujhhgtgfeyxiexzf = ((AbstractList) c0111Ujhhgtgfeyxiexzf).modCount;
                break;
            default:
                m1167Ujhhgtgfeyxiexzf();
                C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = (C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                int i2 = this.f1242Ujhhgtgfeyxiexzf;
                this.f1242Ujhhgtgfeyxiexzf = i2 + 1;
                c0094Ujhhgtgfeyxiexzf.add(i2, obj);
                this.f1243Ujhhgtgfeyxiexzf = -1;
                this.f1244Ujhhgtgfeyxiexzf = ((AbstractList) c0094Ujhhgtgfeyxiexzf).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f1242Ujhhgtgfeyxiexzf < ((C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf).f1238Ujhhgtgfeyxiexzf;
            default:
                return this.f1242Ujhhgtgfeyxiexzf < ((C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf).f1202Ujhhgtgfeyxiexzf;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f1242Ujhhgtgfeyxiexzf > 0;
            default:
                return this.f1242Ujhhgtgfeyxiexzf > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                m1166Ujhhgtgfeyxiexzf();
                int i = this.f1242Ujhhgtgfeyxiexzf;
                C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = (C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                if (i >= c0111Ujhhgtgfeyxiexzf.f1238Ujhhgtgfeyxiexzf) {
                    throw new NoSuchElementException();
                }
                this.f1242Ujhhgtgfeyxiexzf = i + 1;
                this.f1243Ujhhgtgfeyxiexzf = i;
                return c0111Ujhhgtgfeyxiexzf.f1236Ujhhgtgfeyxiexzf[c0111Ujhhgtgfeyxiexzf.f1237Ujhhgtgfeyxiexzf + i];
            default:
                m1167Ujhhgtgfeyxiexzf();
                int i2 = this.f1242Ujhhgtgfeyxiexzf;
                C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = (C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                if (i2 >= c0094Ujhhgtgfeyxiexzf.f1202Ujhhgtgfeyxiexzf) {
                    throw new NoSuchElementException();
                }
                this.f1242Ujhhgtgfeyxiexzf = i2 + 1;
                this.f1243Ujhhgtgfeyxiexzf = i2;
                return c0094Ujhhgtgfeyxiexzf.f1201Ujhhgtgfeyxiexzf[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                break;
        }
        return this.f1242Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                m1166Ujhhgtgfeyxiexzf();
                int i = this.f1242Ujhhgtgfeyxiexzf;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f1242Ujhhgtgfeyxiexzf = i2;
                this.f1243Ujhhgtgfeyxiexzf = i2;
                C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = (C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                return c0111Ujhhgtgfeyxiexzf.f1236Ujhhgtgfeyxiexzf[c0111Ujhhgtgfeyxiexzf.f1237Ujhhgtgfeyxiexzf + i2];
            default:
                m1167Ujhhgtgfeyxiexzf();
                int i3 = this.f1242Ujhhgtgfeyxiexzf;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f1242Ujhhgtgfeyxiexzf = i4;
                this.f1243Ujhhgtgfeyxiexzf = i4;
                return ((C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf).f1201Ujhhgtgfeyxiexzf[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                i = this.f1242Ujhhgtgfeyxiexzf;
                break;
            default:
                i = this.f1242Ujhhgtgfeyxiexzf;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf = (C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                m1166Ujhhgtgfeyxiexzf();
                int i = this.f1243Ujhhgtgfeyxiexzf;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0111Ujhhgtgfeyxiexzf.mo1143Ujhhgtgfeyxiexzf(i);
                this.f1242Ujhhgtgfeyxiexzf = this.f1243Ujhhgtgfeyxiexzf;
                this.f1243Ujhhgtgfeyxiexzf = -1;
                this.f1244Ujhhgtgfeyxiexzf = ((AbstractList) c0111Ujhhgtgfeyxiexzf).modCount;
                return;
            default:
                C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = (C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf;
                m1167Ujhhgtgfeyxiexzf();
                int i2 = this.f1243Ujhhgtgfeyxiexzf;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0094Ujhhgtgfeyxiexzf.mo1143Ujhhgtgfeyxiexzf(i2);
                this.f1242Ujhhgtgfeyxiexzf = this.f1243Ujhhgtgfeyxiexzf;
                this.f1243Ujhhgtgfeyxiexzf = -1;
                this.f1244Ujhhgtgfeyxiexzf = ((AbstractList) c0094Ujhhgtgfeyxiexzf).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1241Ujhhgtgfeyxiexzf) {
            case 0:
                m1166Ujhhgtgfeyxiexzf();
                int i = this.f1243Ujhhgtgfeyxiexzf;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf).set(i, obj);
                return;
            default:
                m1167Ujhhgtgfeyxiexzf();
                int i2 = this.f1243Ujhhgtgfeyxiexzf;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf).set(i2, obj);
                return;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m1166Ujhhgtgfeyxiexzf() {
        if (((AbstractList) ((C0111Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf).f1240Ujhhgtgfeyxiexzf).modCount != this.f1244Ujhhgtgfeyxiexzf) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m1167Ujhhgtgfeyxiexzf() {
        if (((AbstractList) ((C0094Ujhhgtgfeyxiexzf) this.f1245Ujhhgtgfeyxiexzf)).modCount != this.f1244Ujhhgtgfeyxiexzf) {
            throw new ConcurrentModificationException();
        }
    }

    public C0112Ujhhgtgfeyxiexzf(C0111Ujhhgtgfeyxiexzf c0111Ujhhgtgfeyxiexzf, int i) {
        this.f1245Ujhhgtgfeyxiexzf = c0111Ujhhgtgfeyxiexzf;
        this.f1242Ujhhgtgfeyxiexzf = i;
        this.f1244Ujhhgtgfeyxiexzf = ((AbstractList) c0111Ujhhgtgfeyxiexzf).modCount;
    }
}
