package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲇᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0453 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f2059;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final List f2060;

    public C0453(List list, List list2) {
        this.f2059 = list;
        this.f2060 = list2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        List list = this.f2060;
        int iIntValue = i == list.size() ? ((Integer) list.get(i - 1)).intValue() + 1 : ((Integer) list.get(i)).intValue();
        this.f2059.add(iIntValue, obj);
        for (int i2 = i; i2 < list.size(); i2++) {
            list.set(i2, Integer.valueOf(((Integer) list.get(i2)).intValue() + 1));
        }
        list.add(i, Integer.valueOf(iIntValue));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f2060.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f2059.get(((Integer) this.f2060.get(i)).intValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0452(this, new ArrayList(this.f2060).listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f2060;
        int iIntValue = ((Integer) list.get(i)).intValue();
        for (int i2 = i + 1; i2 < list.size(); i2++) {
            list.set(i2, Integer.valueOf(((Integer) list.get(i2)).intValue() - 1));
        }
        list.remove(i);
        return this.f2059.remove(iIntValue);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f2059.set(((Integer) this.f2060.get(i)).intValue(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2060.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return new C0453(this.f2059, this.f2060.subList(i, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            add(i2 + i, it.next());
            i2++;
        }
        return i2 > 0;
    }
}
