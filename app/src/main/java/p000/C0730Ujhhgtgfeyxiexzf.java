package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴᛳᛲ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0730Ujhhgtgfeyxiexzf extends AbstractC0120Ujhhgtgfeyxiexzf implements List<AbstractC0120Ujhhgtgfeyxiexzf>, InterfaceC0140Ujhhgtgfeyxiexzf {
    public static final C0727Ujhhgtgfeyxiexzf Companion = new C0727Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f3003Ujhhgtgfeyxiexzf;

    public C0730Ujhhgtgfeyxiexzf(List list) {
        this.f3003Ujhhgtgfeyxiexzf = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC0120Ujhhgtgfeyxiexzf> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC0120Ujhhgtgfeyxiexzf)) {
            return false;
        }
        return this.f3003Ujhhgtgfeyxiexzf.contains((AbstractC0120Ujhhgtgfeyxiexzf) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f3003Ujhhgtgfeyxiexzf.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f3003Ujhhgtgfeyxiexzf, obj);
    }

    @Override // java.util.List
    public final AbstractC0120Ujhhgtgfeyxiexzf get(int i) {
        return (AbstractC0120Ujhhgtgfeyxiexzf) this.f3003Ujhhgtgfeyxiexzf.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f3003Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC0120Ujhhgtgfeyxiexzf)) {
            return -1;
        }
        return this.f3003Ujhhgtgfeyxiexzf.indexOf((AbstractC0120Ujhhgtgfeyxiexzf) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3003Ujhhgtgfeyxiexzf.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f3003Ujhhgtgfeyxiexzf.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC0120Ujhhgtgfeyxiexzf)) {
            return -1;
        }
        return this.f3003Ujhhgtgfeyxiexzf.lastIndexOf((AbstractC0120Ujhhgtgfeyxiexzf) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC0120Ujhhgtgfeyxiexzf> listIterator() {
        return this.f3003Ujhhgtgfeyxiexzf.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC0120Ujhhgtgfeyxiexzf> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC0120Ujhhgtgfeyxiexzf set(int i, AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3003Ujhhgtgfeyxiexzf.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC0120Ujhhgtgfeyxiexzf> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC0120Ujhhgtgfeyxiexzf> subList(int i, int i2) {
        return this.f3003Ujhhgtgfeyxiexzf.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3612feyxiexzfUjhhgtg.m5244Ujhhgtgfeyxiexzf(this);
    }

    public final String toString() {
        return AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(this.f3003Ujhhgtgfeyxiexzf, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<AbstractC0120Ujhhgtgfeyxiexzf> listIterator(int i) {
        return this.f3003Ujhhgtgfeyxiexzf.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3612feyxiexzfUjhhgtg.m5245Ujhhgtgfeyxiexzf(this, objArr);
    }
}
