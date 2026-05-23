package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1890 implements Map, Serializable, InterfaceC1739 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1890 f6242;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object[] f6243;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object[] f6244;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int[] f6245;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int[] f6246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6247;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f6249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f6251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1891 f6252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1892 f6253;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C1891 f6254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f6255;

    static {
        C1890 c1890 = new C1890(0);
        c1890.f6255 = true;
        f6242 = c1890;
    }

    public C1890(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f6243 = objArr;
        this.f6244 = null;
        this.f6245 = iArr;
        this.f6246 = new int[iHighestOneBit];
        this.f6247 = 2;
        this.f6248 = 0;
        this.f6249 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    @Override // java.util.Map
    public final void clear() {
        m3682();
        int i = this.f6248 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f6245;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f6246[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC1574.m3307(this.f6243, 0, this.f6248);
        Object[] objArr = this.f6244;
        if (objArr != null) {
            AbstractC1574.m3307(objArr, 0, this.f6248);
        }
        this.f6251 = 0;
        this.f6248 = 0;
        this.f6250++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m3685(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f6248;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f6245[i2] >= 0 && AbstractC2207.m4087(this.f6244[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1891 c1891 = this.f6254;
        if (c1891 != null) {
            return c1891;
        }
        C1891 c1892 = new C1891(this, 0);
        this.f6254 = c1892;
        return c1892;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        Map.Entry entry;
        int iM3685;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f6251 == map.size()) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next == null) {
                                break;
                            }
                            try {
                                entry = (Map.Entry) next;
                                iM3685 = m3685(entry.getKey());
                            } catch (ClassCastException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    } while (iM3685 < 0 ? false : AbstractC2207.m4087(this.f6244[iM3685], entry.getValue()));
                    z = false;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM3685 = m3685(obj);
        if (iM3685 < 0) {
            return null;
        }
        return this.f6244[iM3685];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1887 c1887 = new C1887(this, 0);
        int i = 0;
        while (c1887.hasNext()) {
            int i2 = c1887.f6238;
            C1890 c1890 = (C1890) c1887.f6241;
            if (i2 >= c1890.f6248) {
                throw new NoSuchElementException();
            }
            c1887.f6238 = i2 + 1;
            c1887.f6239 = i2;
            Object obj = c1890.f6243[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c1890.f6244[c1887.f6239];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1887.m3677();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6251 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1891 c1891 = this.f6252;
        if (c1891 != null) {
            return c1891;
        }
        C1891 c1892 = new C1891(this, 1);
        this.f6252 = c1892;
        return c1892;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3682();
        int iM3681 = m3681(obj);
        Object[] objArr = this.f6244;
        if (objArr == null) {
            int length = this.f6243.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f6244 = objArr;
        }
        if (iM3681 >= 0) {
            objArr[iM3681] = obj2;
            return null;
        }
        int i = (-iM3681) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m3682();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m3684(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM3681 = m3681(entry.getKey());
            Object[] objArr = this.f6244;
            if (objArr == null) {
                int length = this.f6243.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f6244 = objArr;
            }
            if (iM3681 >= 0) {
                objArr[iM3681] = entry.getValue();
            } else {
                int i = (-iM3681) - 1;
                if (!AbstractC2207.m4087(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m3682();
        int iM3685 = m3685(obj);
        if (iM3685 < 0) {
            return null;
        }
        Object obj2 = this.f6244[iM3685];
        m3688(iM3685);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6251;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f6251 * 3) + 2);
        sb.append("{");
        int i = 0;
        C1887 c1887 = new C1887(this, 0);
        while (c1887.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c1887.f6238;
            C1890 c1890 = (C1890) c1887.f6241;
            if (i2 >= c1890.f6248) {
                throw new NoSuchElementException();
            }
            c1887.f6238 = i2 + 1;
            c1887.f6239 = i2;
            Object obj = c1890.f6243[i2];
            if (obj == c1890) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c1890.f6244[c1887.f6239];
            if (obj2 == c1890) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1887.m3677();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C1892 c1892 = this.f6253;
        if (c1892 != null) {
            return c1892;
        }
        C1892 c1893 = new C1892(this);
        this.f6253 = c1893;
        return c1893;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m3681(Object obj) {
        m3682();
        while (true) {
            int iM3686 = m3686(obj);
            int i = this.f6247 * 2;
            int length = this.f6246.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f6246;
                int i3 = iArr[iM3686];
                if (i3 == 0) {
                    int i4 = this.f6248;
                    Object[] objArr = this.f6243;
                    if (i4 >= objArr.length) {
                        m3684(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f6248 = i5;
                    objArr[i4] = obj;
                    this.f6245[i4] = iM3686;
                    iArr[iM3686] = i5;
                    this.f6251++;
                    this.f6250++;
                    if (i2 > this.f6247) {
                        this.f6247 = i2;
                    }
                    return i4;
                }
                if (AbstractC2207.m4087(this.f6243[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m3687(this.f6246.length * 2);
                    break;
                }
                iM3686 = iM3686 == 0 ? this.f6246.length - 1 : iM3686 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3682() {
        if (this.f6255) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3683(boolean z) {
        int i;
        Object[] objArr = this.f6244;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f6248;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f6245;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f6243;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f6246[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC1574.m3307(this.f6243, i3, i);
        if (objArr != null) {
            AbstractC1574.m3307(objArr, i3, this.f6248);
        }
        this.f6248 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3684(int i) {
        Object[] objArr = this.f6243;
        int length = objArr.length;
        int i2 = this.f6248;
        int i3 = length - i2;
        int i4 = i2 - this.f6251;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m3683(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f6243 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f6244;
            this.f6244 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f6245 = Arrays.copyOf(this.f6245, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f6246.length) {
                m3687(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3685(Object obj) {
        int iM3686 = m3686(obj);
        int i = this.f6247;
        while (true) {
            int i2 = this.f6246[iM3686];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (AbstractC2207.m4087(this.f6243[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM3686 = iM3686 == 0 ? this.f6246.length - 1 : iM3686 - 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m3686(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f6249;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3687(int i) {
        int[] iArr;
        this.f6250++;
        int i2 = 0;
        if (this.f6248 > this.f6251) {
            m3683(false);
        }
        this.f6246 = new int[i];
        this.f6249 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f6248) {
            int i3 = i2 + 1;
            int iM3686 = m3686(this.f6243[i2]);
            int i4 = this.f6247;
            while (true) {
                iArr = this.f6246;
                if (iArr[iM3686] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM3686 = iM3686 == 0 ? iArr.length - 1 : iM3686 - 1;
            }
            iArr[iM3686] = i3;
            this.f6245[i2] = iM3686;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3688(int i) {
        int i2;
        int i3;
        int iM3686;
        int[] iArr;
        this.f6243[i] = null;
        Object[] objArr = this.f6244;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f6245[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f6246.length - 1 : length - 1;
                int[] iArr2 = this.f6246;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f6247) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM3686 = m3686(this.f6243[i3]) - length;
                    iArr = this.f6246;
                }
            } while ((iM3686 & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f6245[i3] = i4;
        }
        this.f6245[i] = -1;
        this.f6251--;
        this.f6250++;
    }
}
