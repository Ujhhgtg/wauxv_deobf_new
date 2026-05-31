package p000;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲇᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1916 implements Map, Serializable, InterfaceC1763 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1916 f6316;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object[] f6317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object[] f6318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int[] f6319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int[] f6320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6323;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f6324;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C1917 f6326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1918 f6327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1917 f6328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f6329;

    static {
        C1916 c1916 = new C1916(0);
        c1916.f6329 = true;
        f6316 = c1916;
    }

    public C1916(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f6317 = objArr;
        this.f6318 = null;
        this.f6319 = iArr;
        this.f6320 = new int[iHighestOneBit];
        this.f6321 = 2;
        this.f6322 = 0;
        this.f6323 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.f6329) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        C2721 c2721 = new C2721();
        c2721.f8740 = this;
        return c2721;
    }

    @Override // java.util.Map
    public final void clear() {
        m3861();
        int i = this.f6322 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f6319;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f6320[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC0738.m2279(this.f6317, 0, this.f6322);
        Object[] objArr = this.f6318;
        if (objArr != null) {
            AbstractC0738.m2279(objArr, 0, this.f6322);
        }
        this.f6325 = 0;
        this.f6322 = 0;
        this.f6324++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m3864(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f6322;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f6319[i2] >= 0 && AbstractC1469.m3322(this.f6318[i2], obj)) {
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
        C1917 c1917 = this.f6328;
        if (c1917 != null) {
            return c1917;
        }
        C1917 c1918 = new C1917(this, 0);
        this.f6328 = c1918;
        return c1918;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        Map.Entry entry;
        int iM3864;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f6325 == map.size()) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next == null) {
                                break;
                            }
                            try {
                                entry = (Map.Entry) next;
                                iM3864 = m3864(entry.getKey());
                            } catch (ClassCastException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    } while (iM3864 < 0 ? false : AbstractC1469.m3322(this.f6318[iM3864], entry.getValue()));
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
        int iM3864 = m3864(obj);
        if (iM3864 < 0) {
            return null;
        }
        return this.f6318[iM3864];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1913 c1913 = new C1913(this, 0);
        int i = 0;
        while (c1913.hasNext()) {
            int i2 = c1913.f6312;
            C1916 c1916 = (C1916) c1913.f6315;
            if (i2 >= c1916.f6322) {
                throw new NoSuchElementException();
            }
            c1913.f6312 = i2 + 1;
            c1913.f6313 = i2;
            Object obj = c1916.f6317[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c1916.f6318[c1913.f6313];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1913.m3855();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6325 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1917 c1917 = this.f6326;
        if (c1917 != null) {
            return c1917;
        }
        C1917 c1918 = new C1917(this, 1);
        this.f6326 = c1918;
        return c1918;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3861();
        int iM3859 = m3859(obj);
        Object[] objArr = this.f6318;
        if (objArr == null) {
            int length = this.f6317.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f6318 = objArr;
        }
        if (iM3859 >= 0) {
            objArr[iM3859] = obj2;
            return null;
        }
        int i = (-iM3859) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m3861();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m3863(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM3859 = m3859(entry.getKey());
            Object[] objArr = this.f6318;
            if (objArr == null) {
                int length = this.f6317.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f6318 = objArr;
            }
            if (iM3859 >= 0) {
                objArr[iM3859] = entry.getValue();
            } else {
                int i = (-iM3859) - 1;
                if (!AbstractC1469.m3322(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m3861();
        int iM3864 = m3864(obj);
        if (iM3864 < 0) {
            return null;
        }
        Object obj2 = this.f6318[iM3864];
        m3867(iM3864);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6325;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f6325 * 3) + 2);
        sb.append("{");
        int i = 0;
        C1913 c1913 = new C1913(this, 0);
        while (c1913.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c1913.f6312;
            C1916 c1916 = (C1916) c1913.f6315;
            if (i2 >= c1916.f6322) {
                throw new NoSuchElementException();
            }
            c1913.f6312 = i2 + 1;
            c1913.f6313 = i2;
            Object obj = c1916.f6317[i2];
            if (obj == c1916) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c1916.f6318[c1913.f6313];
            if (obj2 == c1916) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1913.m3855();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C1918 c1918 = this.f6327;
        if (c1918 != null) {
            return c1918;
        }
        C1918 c1919 = new C1918(this);
        this.f6327 = c1919;
        return c1919;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m3859(Object obj) {
        m3861();
        while (true) {
            int iM3865 = m3865(obj);
            int i = this.f6321 * 2;
            int length = this.f6320.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f6320;
                int i3 = iArr[iM3865];
                if (i3 == 0) {
                    int i4 = this.f6322;
                    Object[] objArr = this.f6317;
                    if (i4 >= objArr.length) {
                        m3863(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f6322 = i5;
                    objArr[i4] = obj;
                    this.f6319[i4] = iM3865;
                    iArr[iM3865] = i5;
                    this.f6325++;
                    this.f6324++;
                    if (i2 > this.f6321) {
                        this.f6321 = i2;
                    }
                    return i4;
                }
                if (AbstractC1469.m3322(this.f6317[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m3866(this.f6320.length * 2);
                    break;
                }
                iM3865 = iM3865 == 0 ? this.f6320.length - 1 : iM3865 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1916 m3860() {
        m3861();
        this.f6329 = true;
        return this.f6325 > 0 ? this : f6316;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3861() {
        if (this.f6329) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3862(boolean z) {
        int i;
        Object[] objArr = this.f6318;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f6322;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f6319;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f6317;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f6320[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC0738.m2279(this.f6317, i3, i);
        if (objArr != null) {
            AbstractC0738.m2279(objArr, i3, this.f6322);
        }
        this.f6322 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3863(int i) {
        Object[] objArr = this.f6317;
        int length = objArr.length;
        int i2 = this.f6322;
        int i3 = length - i2;
        int i4 = i2 - this.f6325;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m3862(true);
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
            this.f6317 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f6318;
            this.f6318 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f6319 = Arrays.copyOf(this.f6319, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f6320.length) {
                m3866(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m3864(Object obj) {
        int iM3865 = m3865(obj);
        int i = this.f6321;
        while (true) {
            int i2 = this.f6320[iM3865];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (AbstractC1469.m3322(this.f6317[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM3865 = iM3865 == 0 ? this.f6320.length - 1 : iM3865 - 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m3865(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f6323;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3866(int i) {
        int[] iArr;
        this.f6324++;
        int i2 = 0;
        if (this.f6322 > this.f6325) {
            m3862(false);
        }
        this.f6320 = new int[i];
        this.f6323 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f6322) {
            int i3 = i2 + 1;
            int iM3865 = m3865(this.f6317[i2]);
            int i4 = this.f6321;
            while (true) {
                iArr = this.f6320;
                if (iArr[iM3865] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM3865 = iM3865 == 0 ? iArr.length - 1 : iM3865 - 1;
            }
            iArr[iM3865] = i3;
            this.f6319[i2] = iM3865;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3867(int i) {
        int i2;
        int i3;
        int iM3865;
        int[] iArr;
        this.f6317[i] = null;
        Object[] objArr = this.f6318;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f6319[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f6320.length - 1 : length - 1;
                int[] iArr2 = this.f6320;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f6321) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM3865 = m3865(this.f6317[i3]) - length;
                    iArr = this.f6320;
                }
            } while ((iM3865 & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f6319[i3] = i4;
        }
        this.f6319[i] = -1;
        this.f6325--;
        this.f6324++;
    }
}
