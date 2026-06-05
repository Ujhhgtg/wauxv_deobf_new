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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0174Ujhhgtgfeyxiexzf implements Map, Serializable, InterfaceC0142Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C0174Ujhhgtgfeyxiexzf f1364Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object[] f1365Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object[] f1366Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int[] f1367Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int[] f1368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f1369Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f1370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f1371Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1372Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f1373Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0173Ujhhgtgfeyxiexzf f1374Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C0169Ujhhgtgfeyxiexzf f1375Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public C0173Ujhhgtgfeyxiexzf f1376Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f1377Ujhhgtgfeyxiexzf;

    static {
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = new C0174Ujhhgtgfeyxiexzf(0);
        c0174Ujhhgtgfeyxiexzf.f1377Ujhhgtgfeyxiexzf = true;
        f1364Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf;
    }

    public C0174Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f1365Ujhhgtgfeyxiexzf = objArr;
        this.f1366Ujhhgtgfeyxiexzf = null;
        this.f1367Ujhhgtgfeyxiexzf = iArr;
        this.f1368Ujhhgtgfeyxiexzf = new int[iHighestOneBit];
        this.f1369Ujhhgtgfeyxiexzf = 2;
        this.f1370Ujhhgtgfeyxiexzf = 0;
        this.f1371Ujhhgtgfeyxiexzf = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.f1377Ujhhgtgfeyxiexzf) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        C1100feyxiexzfUjhhgtg c1100feyxiexzfUjhhgtg = new C1100feyxiexzfUjhhgtg();
        c1100feyxiexzfUjhhgtg.f4182Ujhhgtgfeyxiexzf = this;
        return c1100feyxiexzfUjhhgtg;
    }

    @Override // java.util.Map
    public final void clear() {
        m1237Ujhhgtgfeyxiexzf();
        int i = this.f1370Ujhhgtgfeyxiexzf - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1367Ujhhgtgfeyxiexzf;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f1368Ujhhgtgfeyxiexzf[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC1243feyxiexzfUjhhgtg.m2742Ujhhgtgfeyxiexzf(this.f1365Ujhhgtgfeyxiexzf, 0, this.f1370Ujhhgtgfeyxiexzf);
        Object[] objArr = this.f1366Ujhhgtgfeyxiexzf;
        if (objArr != null) {
            AbstractC1243feyxiexzfUjhhgtg.m2742Ujhhgtgfeyxiexzf(objArr, 0, this.f1370Ujhhgtgfeyxiexzf);
        }
        this.f1373Ujhhgtgfeyxiexzf = 0;
        this.f1370Ujhhgtgfeyxiexzf = 0;
        this.f1372Ujhhgtgfeyxiexzf++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m1240Ujhhgtgfeyxiexzf(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f1370Ujhhgtgfeyxiexzf;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f1367Ujhhgtgfeyxiexzf[i2] >= 0 && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1366Ujhhgtgfeyxiexzf[i2], obj)) {
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
        C0173Ujhhgtgfeyxiexzf c0173Ujhhgtgfeyxiexzf = this.f1376Ujhhgtgfeyxiexzf;
        if (c0173Ujhhgtgfeyxiexzf != null) {
            return c0173Ujhhgtgfeyxiexzf;
        }
        C0173Ujhhgtgfeyxiexzf c0173Ujhhgtgfeyxiexzf2 = new C0173Ujhhgtgfeyxiexzf(this, 0);
        this.f1376Ujhhgtgfeyxiexzf = c0173Ujhhgtgfeyxiexzf2;
        return c0173Ujhhgtgfeyxiexzf2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        Map.Entry entry;
        int iM1240Ujhhgtgfeyxiexzf;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f1373Ujhhgtgfeyxiexzf == map.size()) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next == null) {
                                break;
                            }
                            try {
                                entry = (Map.Entry) next;
                                iM1240Ujhhgtgfeyxiexzf = m1240Ujhhgtgfeyxiexzf(entry.getKey());
                            } catch (ClassCastException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    } while (iM1240Ujhhgtgfeyxiexzf < 0 ? false : C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1366Ujhhgtgfeyxiexzf[iM1240Ujhhgtgfeyxiexzf], entry.getValue()));
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
        int iM1240Ujhhgtgfeyxiexzf = m1240Ujhhgtgfeyxiexzf(obj);
        if (iM1240Ujhhgtgfeyxiexzf < 0) {
            return null;
        }
        return this.f1366Ujhhgtgfeyxiexzf[iM1240Ujhhgtgfeyxiexzf];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0164Ujhhgtgfeyxiexzf c0164Ujhhgtgfeyxiexzf = new C0164Ujhhgtgfeyxiexzf(this, 0);
        int i = 0;
        while (c0164Ujhhgtgfeyxiexzf.hasNext()) {
            int i2 = c0164Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf;
            C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = (C0174Ujhhgtgfeyxiexzf) c0164Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf;
            if (i2 >= c0174Ujhhgtgfeyxiexzf.f1370Ujhhgtgfeyxiexzf) {
                throw new NoSuchElementException();
            }
            c0164Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf = i2 + 1;
            c0164Ujhhgtgfeyxiexzf.f1356Ujhhgtgfeyxiexzf = i2;
            Object obj = c0174Ujhhgtgfeyxiexzf.f1365Ujhhgtgfeyxiexzf[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[c0164Ujhhgtgfeyxiexzf.f1356Ujhhgtgfeyxiexzf];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0164Ujhhgtgfeyxiexzf.m1229Ujhhgtgfeyxiexzf();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1373Ujhhgtgfeyxiexzf == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0173Ujhhgtgfeyxiexzf c0173Ujhhgtgfeyxiexzf = this.f1374Ujhhgtgfeyxiexzf;
        if (c0173Ujhhgtgfeyxiexzf != null) {
            return c0173Ujhhgtgfeyxiexzf;
        }
        C0173Ujhhgtgfeyxiexzf c0173Ujhhgtgfeyxiexzf2 = new C0173Ujhhgtgfeyxiexzf(this, 1);
        this.f1374Ujhhgtgfeyxiexzf = c0173Ujhhgtgfeyxiexzf2;
        return c0173Ujhhgtgfeyxiexzf2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m1237Ujhhgtgfeyxiexzf();
        int iM1235Ujhhgtgfeyxiexzf = m1235Ujhhgtgfeyxiexzf(obj);
        Object[] objArr = this.f1366Ujhhgtgfeyxiexzf;
        if (objArr == null) {
            int length = this.f1365Ujhhgtgfeyxiexzf.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f1366Ujhhgtgfeyxiexzf = objArr;
        }
        if (iM1235Ujhhgtgfeyxiexzf >= 0) {
            objArr[iM1235Ujhhgtgfeyxiexzf] = obj2;
            return null;
        }
        int i = (-iM1235Ujhhgtgfeyxiexzf) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m1237Ujhhgtgfeyxiexzf();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m1239Ujhhgtgfeyxiexzf(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM1235Ujhhgtgfeyxiexzf = m1235Ujhhgtgfeyxiexzf(entry.getKey());
            Object[] objArr = this.f1366Ujhhgtgfeyxiexzf;
            if (objArr == null) {
                int length = this.f1365Ujhhgtgfeyxiexzf.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f1366Ujhhgtgfeyxiexzf = objArr;
            }
            if (iM1235Ujhhgtgfeyxiexzf >= 0) {
                objArr[iM1235Ujhhgtgfeyxiexzf] = entry.getValue();
            } else {
                int i = (-iM1235Ujhhgtgfeyxiexzf) - 1;
                if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m1237Ujhhgtgfeyxiexzf();
        int iM1240Ujhhgtgfeyxiexzf = m1240Ujhhgtgfeyxiexzf(obj);
        if (iM1240Ujhhgtgfeyxiexzf < 0) {
            return null;
        }
        Object obj2 = this.f1366Ujhhgtgfeyxiexzf[iM1240Ujhhgtgfeyxiexzf];
        m1243Ujhhgtgfeyxiexzf(iM1240Ujhhgtgfeyxiexzf);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1373Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f1373Ujhhgtgfeyxiexzf * 3) + 2);
        sb.append("{");
        int i = 0;
        C0164Ujhhgtgfeyxiexzf c0164Ujhhgtgfeyxiexzf = new C0164Ujhhgtgfeyxiexzf(this, 0);
        while (c0164Ujhhgtgfeyxiexzf.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c0164Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf;
            C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = (C0174Ujhhgtgfeyxiexzf) c0164Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf;
            if (i2 >= c0174Ujhhgtgfeyxiexzf.f1370Ujhhgtgfeyxiexzf) {
                throw new NoSuchElementException();
            }
            c0164Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf = i2 + 1;
            c0164Ujhhgtgfeyxiexzf.f1356Ujhhgtgfeyxiexzf = i2;
            Object obj = c0174Ujhhgtgfeyxiexzf.f1365Ujhhgtgfeyxiexzf[i2];
            if (obj == c0174Ujhhgtgfeyxiexzf) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[c0164Ujhhgtgfeyxiexzf.f1356Ujhhgtgfeyxiexzf];
            if (obj2 == c0174Ujhhgtgfeyxiexzf) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0164Ujhhgtgfeyxiexzf.m1229Ujhhgtgfeyxiexzf();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C0169Ujhhgtgfeyxiexzf c0169Ujhhgtgfeyxiexzf = this.f1375Ujhhgtgfeyxiexzf;
        if (c0169Ujhhgtgfeyxiexzf != null) {
            return c0169Ujhhgtgfeyxiexzf;
        }
        C0169Ujhhgtgfeyxiexzf c0169Ujhhgtgfeyxiexzf2 = new C0169Ujhhgtgfeyxiexzf(this);
        this.f1375Ujhhgtgfeyxiexzf = c0169Ujhhgtgfeyxiexzf2;
        return c0169Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m1235Ujhhgtgfeyxiexzf(Object obj) {
        m1237Ujhhgtgfeyxiexzf();
        while (true) {
            int iM1241Ujhhgtgfeyxiexzf = m1241Ujhhgtgfeyxiexzf(obj);
            int i = this.f1369Ujhhgtgfeyxiexzf * 2;
            int length = this.f1368Ujhhgtgfeyxiexzf.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1368Ujhhgtgfeyxiexzf;
                int i3 = iArr[iM1241Ujhhgtgfeyxiexzf];
                if (i3 == 0) {
                    int i4 = this.f1370Ujhhgtgfeyxiexzf;
                    Object[] objArr = this.f1365Ujhhgtgfeyxiexzf;
                    if (i4 >= objArr.length) {
                        m1239Ujhhgtgfeyxiexzf(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f1370Ujhhgtgfeyxiexzf = i5;
                    objArr[i4] = obj;
                    this.f1367Ujhhgtgfeyxiexzf[i4] = iM1241Ujhhgtgfeyxiexzf;
                    iArr[iM1241Ujhhgtgfeyxiexzf] = i5;
                    this.f1373Ujhhgtgfeyxiexzf++;
                    this.f1372Ujhhgtgfeyxiexzf++;
                    if (i2 > this.f1369Ujhhgtgfeyxiexzf) {
                        this.f1369Ujhhgtgfeyxiexzf = i2;
                    }
                    return i4;
                }
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1365Ujhhgtgfeyxiexzf[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m1242Ujhhgtgfeyxiexzf(this.f1368Ujhhgtgfeyxiexzf.length * 2);
                    break;
                }
                iM1241Ujhhgtgfeyxiexzf = iM1241Ujhhgtgfeyxiexzf == 0 ? this.f1368Ujhhgtgfeyxiexzf.length - 1 : iM1241Ujhhgtgfeyxiexzf - 1;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0174Ujhhgtgfeyxiexzf m1236Ujhhgtgfeyxiexzf() {
        m1237Ujhhgtgfeyxiexzf();
        this.f1377Ujhhgtgfeyxiexzf = true;
        return this.f1373Ujhhgtgfeyxiexzf > 0 ? this : f1364Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1237Ujhhgtgfeyxiexzf() {
        if (this.f1377Ujhhgtgfeyxiexzf) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1238Ujhhgtgfeyxiexzf(boolean z) {
        int i;
        Object[] objArr = this.f1366Ujhhgtgfeyxiexzf;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f1370Ujhhgtgfeyxiexzf;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f1367Ujhhgtgfeyxiexzf;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f1365Ujhhgtgfeyxiexzf;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f1368Ujhhgtgfeyxiexzf[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC1243feyxiexzfUjhhgtg.m2742Ujhhgtgfeyxiexzf(this.f1365Ujhhgtgfeyxiexzf, i3, i);
        if (objArr != null) {
            AbstractC1243feyxiexzfUjhhgtg.m2742Ujhhgtgfeyxiexzf(objArr, i3, this.f1370Ujhhgtgfeyxiexzf);
        }
        this.f1370Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1239Ujhhgtgfeyxiexzf(int i) {
        Object[] objArr = this.f1365Ujhhgtgfeyxiexzf;
        int length = objArr.length;
        int i2 = this.f1370Ujhhgtgfeyxiexzf;
        int i3 = length - i2;
        int i4 = i2 - this.f1373Ujhhgtgfeyxiexzf;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m1238Ujhhgtgfeyxiexzf(true);
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
            this.f1365Ujhhgtgfeyxiexzf = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f1366Ujhhgtgfeyxiexzf;
            this.f1366Ujhhgtgfeyxiexzf = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f1367Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f1367Ujhhgtgfeyxiexzf, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f1368Ujhhgtgfeyxiexzf.length) {
                m1242Ujhhgtgfeyxiexzf(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m1240Ujhhgtgfeyxiexzf(Object obj) {
        int iM1241Ujhhgtgfeyxiexzf = m1241Ujhhgtgfeyxiexzf(obj);
        int i = this.f1369Ujhhgtgfeyxiexzf;
        while (true) {
            int i2 = this.f1368Ujhhgtgfeyxiexzf[iM1241Ujhhgtgfeyxiexzf];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1365Ujhhgtgfeyxiexzf[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM1241Ujhhgtgfeyxiexzf = iM1241Ujhhgtgfeyxiexzf == 0 ? this.f1368Ujhhgtgfeyxiexzf.length - 1 : iM1241Ujhhgtgfeyxiexzf - 1;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int m1241Ujhhgtgfeyxiexzf(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f1371Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m1242Ujhhgtgfeyxiexzf(int i) {
        int[] iArr;
        this.f1372Ujhhgtgfeyxiexzf++;
        int i2 = 0;
        if (this.f1370Ujhhgtgfeyxiexzf > this.f1373Ujhhgtgfeyxiexzf) {
            m1238Ujhhgtgfeyxiexzf(false);
        }
        this.f1368Ujhhgtgfeyxiexzf = new int[i];
        this.f1371Ujhhgtgfeyxiexzf = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f1370Ujhhgtgfeyxiexzf) {
            int i3 = i2 + 1;
            int iM1241Ujhhgtgfeyxiexzf = m1241Ujhhgtgfeyxiexzf(this.f1365Ujhhgtgfeyxiexzf[i2]);
            int i4 = this.f1369Ujhhgtgfeyxiexzf;
            while (true) {
                iArr = this.f1368Ujhhgtgfeyxiexzf;
                if (iArr[iM1241Ujhhgtgfeyxiexzf] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM1241Ujhhgtgfeyxiexzf = iM1241Ujhhgtgfeyxiexzf == 0 ? iArr.length - 1 : iM1241Ujhhgtgfeyxiexzf - 1;
            }
            iArr[iM1241Ujhhgtgfeyxiexzf] = i3;
            this.f1367Ujhhgtgfeyxiexzf[i2] = iM1241Ujhhgtgfeyxiexzf;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1243Ujhhgtgfeyxiexzf(int i) {
        int i2;
        int i3;
        int iM1241Ujhhgtgfeyxiexzf;
        int[] iArr;
        this.f1365Ujhhgtgfeyxiexzf[i] = null;
        Object[] objArr = this.f1366Ujhhgtgfeyxiexzf;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f1367Ujhhgtgfeyxiexzf[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f1368Ujhhgtgfeyxiexzf.length - 1 : length - 1;
                int[] iArr2 = this.f1368Ujhhgtgfeyxiexzf;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f1369Ujhhgtgfeyxiexzf) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM1241Ujhhgtgfeyxiexzf = m1241Ujhhgtgfeyxiexzf(this.f1365Ujhhgtgfeyxiexzf[i3]) - length;
                    iArr = this.f1368Ujhhgtgfeyxiexzf;
                }
            } while ((iM1241Ujhhgtgfeyxiexzf & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f1367Ujhhgtgfeyxiexzf[i3] = i4;
        }
        this.f1367Ujhhgtgfeyxiexzf[i] = -1;
        this.f1373Ujhhgtgfeyxiexzf--;
        this.f1372Ujhhgtgfeyxiexzf++;
    }
}
