package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲀᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0279 implements Collection, Set, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int[] f1544;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object[] f1545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f1546;

    public C0279(int i) {
        this.f1544 = AbstractC1469.f5220;
        this.f1545 = AbstractC1469.f5221;
        if (i > 0) {
            this.f1544 = new int[i];
            this.f1545 = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM4895;
        int i2 = this.f1546;
        if (obj == null) {
            iM4895 = AbstractC2902.m4895(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM4895 = AbstractC2902.m4895(this, obj, iHashCode);
        }
        if (iM4895 >= 0) {
            return false;
        }
        int i3 = ~iM4895;
        int[] iArr = this.f1544;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1545;
            int[] iArr2 = new int[i4];
            this.f1544 = iArr2;
            this.f1545 = new Object[i4];
            if (i2 != this.f1546) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0280.m1527(iArr.length, 6, iArr, iArr2);
                AbstractC0280.m1529(objArr, this.f1545, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f1544;
            int i5 = i3 + 1;
            AbstractC0280.m1525(iArr3, i5, i3, i2, iArr3);
            Object[] objArr2 = this.f1545;
            AbstractC0280.m1526(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f1546;
        if (i2 == i6) {
            int[] iArr4 = this.f1544;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f1545[i3] = obj;
                this.f1546 = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f1546;
        int i = this.f1546;
        int[] iArr = this.f1544;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1545;
            int[] iArr2 = new int[size];
            this.f1544 = iArr2;
            this.f1545 = new Object[size];
            if (i > 0) {
                AbstractC0280.m1527(i, 6, iArr, iArr2);
                AbstractC0280.m1529(objArr, this.f1545, 0, this.f1546, 6);
            }
        }
        if (this.f1546 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1546 != 0) {
            this.f1544 = AbstractC1469.f5220;
            this.f1545 = AbstractC1469.f5221;
            this.f1546 = 0;
        }
        if (this.f1546 != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2902.m4895(this, null, 0) : AbstractC2902.m4895(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f1546 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f1546;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f1545[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1544;
        int i = this.f1546;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1546 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0270(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM4895 = obj == null ? AbstractC2902.m4895(this, null, 0) : AbstractC2902.m4895(this, obj, obj.hashCode());
        if (iM4895 < 0) {
            return false;
        }
        m1522(iM4895);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f1546 - 1; -1 < i; i--) {
            if (!AbstractC0739.m2289(collection, this.f1545[i])) {
                m1522(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1546;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f1545;
        int i = this.f1546;
        AbstractC3528.m5092(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1546 * 14);
        sb.append('{');
        int i = this.f1546;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1545[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m1522(int i) {
        int i2 = this.f1546;
        Object[] objArr = this.f1545;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f1544;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0280.m1525(iArr, i, i4, i2, iArr);
                Object[] objArr2 = this.f1545;
                AbstractC0280.m1526(objArr2, objArr2, i, i4, i2);
            }
            this.f1545[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f1544 = iArr2;
            this.f1545 = new Object[i5];
            if (i > 0) {
                AbstractC0280.m1527(i, 6, iArr, iArr2);
                AbstractC0280.m1529(objArr, this.f1545, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0280.m1525(iArr, i, i6, i2, this.f1544);
                AbstractC0280.m1526(objArr, this.f1545, i, i6, i2);
            }
        }
        if (i2 != this.f1546) {
            throw new ConcurrentModificationException();
        }
        this.f1546 = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f1546;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0280.m1526(this.f1545, objArr, 0, 0, this.f1546);
        return objArr;
    }
}
