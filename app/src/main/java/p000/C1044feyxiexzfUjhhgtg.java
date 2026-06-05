package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ要点脸ᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1044feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int[] f4067Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object[] f4068Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f4069Ujhhgtgfeyxiexzf;

    public C1044feyxiexzfUjhhgtg(int i) {
        this.f4067Ujhhgtgfeyxiexzf = i == 0 ? AbstractC3593Ujhhgtgfeyxiexzf.f11180Ujhhgtgfeyxiexzf : new int[i];
        this.f4068Ujhhgtgfeyxiexzf = i == 0 ? AbstractC3593Ujhhgtgfeyxiexzf.f11181Ujhhgtgfeyxiexzf : new Object[i << 1];
    }

    public void clear() {
        if (this.f4069Ujhhgtgfeyxiexzf > 0) {
            this.f4067Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11180Ujhhgtgfeyxiexzf;
            this.f4068Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11181Ujhhgtgfeyxiexzf;
            this.f4069Ujhhgtgfeyxiexzf = 0;
        }
        if (this.f4069Ujhhgtgfeyxiexzf > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m2534Ujhhgtgfeyxiexzf(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m2531Ujhhgtgfeyxiexzf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1044feyxiexzfUjhhgtg) {
                int i = this.f4069Ujhhgtgfeyxiexzf;
                if (i != ((C1044feyxiexzfUjhhgtg) obj).f4069Ujhhgtgfeyxiexzf) {
                    return false;
                }
                C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM2536Ujhhgtgfeyxiexzf = m2536Ujhhgtgfeyxiexzf(i2);
                    Object objM2540Ujhhgtgfeyxiexzf = m2540Ujhhgtgfeyxiexzf(i2);
                    Object obj2 = c1044feyxiexzfUjhhgtg.get(objM2536Ujhhgtgfeyxiexzf);
                    if (objM2540Ujhhgtgfeyxiexzf == null) {
                        if (obj2 != null || !c1044feyxiexzfUjhhgtg.containsKey(objM2536Ujhhgtgfeyxiexzf)) {
                            return false;
                        }
                    } else if (!objM2540Ujhhgtgfeyxiexzf.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4069Ujhhgtgfeyxiexzf != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f4069Ujhhgtgfeyxiexzf;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM2536Ujhhgtgfeyxiexzf2 = m2536Ujhhgtgfeyxiexzf(i4);
                Object objM2540Ujhhgtgfeyxiexzf2 = m2540Ujhhgtgfeyxiexzf(i4);
                Object obj3 = ((Map) obj).get(objM2536Ujhhgtgfeyxiexzf2);
                if (objM2540Ujhhgtgfeyxiexzf2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM2536Ujhhgtgfeyxiexzf2)) {
                        return false;
                    }
                } else if (!objM2540Ujhhgtgfeyxiexzf2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM2534Ujhhgtgfeyxiexzf = m2534Ujhhgtgfeyxiexzf(obj);
        if (iM2534Ujhhgtgfeyxiexzf >= 0) {
            return this.f4068Ujhhgtgfeyxiexzf[(iM2534Ujhhgtgfeyxiexzf << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2534Ujhhgtgfeyxiexzf = m2534Ujhhgtgfeyxiexzf(obj);
        return iM2534Ujhhgtgfeyxiexzf >= 0 ? this.f4068Ujhhgtgfeyxiexzf[(iM2534Ujhhgtgfeyxiexzf << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f4067Ujhhgtgfeyxiexzf;
        Object[] objArr = this.f4068Ujhhgtgfeyxiexzf;
        int i = this.f4069Ujhhgtgfeyxiexzf;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f4069Ujhhgtgfeyxiexzf <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f4069Ujhhgtgfeyxiexzf;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2533Ujhhgtgfeyxiexzf = obj != null ? m2533Ujhhgtgfeyxiexzf(iHashCode, obj) : m2535Ujhhgtgfeyxiexzf();
        if (iM2533Ujhhgtgfeyxiexzf >= 0) {
            int i2 = (iM2533Ujhhgtgfeyxiexzf << 1) + 1;
            Object[] objArr = this.f4068Ujhhgtgfeyxiexzf;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM2533Ujhhgtgfeyxiexzf;
        int[] iArr = this.f4067Ujhhgtgfeyxiexzf;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f4067Ujhhgtgfeyxiexzf = Arrays.copyOf(iArr, i4);
            this.f4068Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4068Ujhhgtgfeyxiexzf, i4 << 1);
            if (i != this.f4069Ujhhgtgfeyxiexzf) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f4067Ujhhgtgfeyxiexzf;
            int i5 = i3 + 1;
            AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr2, i5, i3, i, iArr2);
            Object[] objArr2 = this.f4068Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i5 << 1, i3 << 1, this.f4069Ujhhgtgfeyxiexzf << 1);
        }
        int i6 = this.f4069Ujhhgtgfeyxiexzf;
        if (i == i6) {
            int[] iArr3 = this.f4067Ujhhgtgfeyxiexzf;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f4068Ujhhgtgfeyxiexzf;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f4069Ujhhgtgfeyxiexzf = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM2534Ujhhgtgfeyxiexzf = m2534Ujhhgtgfeyxiexzf(obj);
        if (iM2534Ujhhgtgfeyxiexzf >= 0) {
            return mo2538Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2534Ujhhgtgfeyxiexzf = m2534Ujhhgtgfeyxiexzf(obj);
        if (iM2534Ujhhgtgfeyxiexzf >= 0) {
            return mo2539Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4069Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4069Ujhhgtgfeyxiexzf * 28);
        sb.append('{');
        int i = this.f4069Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM2536Ujhhgtgfeyxiexzf = m2536Ujhhgtgfeyxiexzf(i2);
            if (objM2536Ujhhgtgfeyxiexzf != sb) {
                sb.append(objM2536Ujhhgtgfeyxiexzf);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2540Ujhhgtgfeyxiexzf = m2540Ujhhgtgfeyxiexzf(i2);
            if (objM2540Ujhhgtgfeyxiexzf != sb) {
                sb.append(objM2540Ujhhgtgfeyxiexzf);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m2531Ujhhgtgfeyxiexzf(Object obj) {
        int i = this.f4069Ujhhgtgfeyxiexzf * 2;
        Object[] objArr = this.f4068Ujhhgtgfeyxiexzf;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2532Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f4069Ujhhgtgfeyxiexzf;
        int[] iArr = this.f4067Ujhhgtgfeyxiexzf;
        if (iArr.length < i) {
            this.f4067Ujhhgtgfeyxiexzf = Arrays.copyOf(iArr, i);
            this.f4068Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4068Ujhhgtgfeyxiexzf, i * 2);
        }
        if (this.f4069Ujhhgtgfeyxiexzf != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m2533Ujhhgtgfeyxiexzf(int i, Object obj) {
        int i2 = this.f4069Ujhhgtgfeyxiexzf;
        if (i2 == 0) {
            return -1;
        }
        int iM5147Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5147Ujhhgtgfeyxiexzf(i2, i, this.f4067Ujhhgtgfeyxiexzf);
        if (iM5147Ujhhgtgfeyxiexzf < 0 || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f4068Ujhhgtgfeyxiexzf[iM5147Ujhhgtgfeyxiexzf << 1])) {
            return iM5147Ujhhgtgfeyxiexzf;
        }
        int i3 = iM5147Ujhhgtgfeyxiexzf + 1;
        while (i3 < i2 && this.f4067Ujhhgtgfeyxiexzf[i3] == i) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f4068Ujhhgtgfeyxiexzf[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM5147Ujhhgtgfeyxiexzf - 1; i4 >= 0 && this.f4067Ujhhgtgfeyxiexzf[i4] == i; i4--) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, this.f4068Ujhhgtgfeyxiexzf[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int m2534Ujhhgtgfeyxiexzf(Object obj) {
        return obj == null ? m2535Ujhhgtgfeyxiexzf() : m2533Ujhhgtgfeyxiexzf(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m2535Ujhhgtgfeyxiexzf() {
        int i = this.f4069Ujhhgtgfeyxiexzf;
        if (i == 0) {
            return -1;
        }
        int iM5147Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5147Ujhhgtgfeyxiexzf(i, 0, this.f4067Ujhhgtgfeyxiexzf);
        if (iM5147Ujhhgtgfeyxiexzf < 0 || this.f4068Ujhhgtgfeyxiexzf[iM5147Ujhhgtgfeyxiexzf << 1] == null) {
            return iM5147Ujhhgtgfeyxiexzf;
        }
        int i2 = iM5147Ujhhgtgfeyxiexzf + 1;
        while (i2 < i && this.f4067Ujhhgtgfeyxiexzf[i2] == 0) {
            if (this.f4068Ujhhgtgfeyxiexzf[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM5147Ujhhgtgfeyxiexzf - 1; i3 >= 0 && this.f4067Ujhhgtgfeyxiexzf[i3] == 0; i3--) {
            if (this.f4068Ujhhgtgfeyxiexzf[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object m2536Ujhhgtgfeyxiexzf(int i) {
        if (i < 0 || i >= this.f4069Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f4068Ujhhgtgfeyxiexzf[i << 1];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo2537Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        int i = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
        m2532Ujhhgtgfeyxiexzf(this.f4069Ujhhgtgfeyxiexzf + i);
        if (this.f4069Ujhhgtgfeyxiexzf != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i2), c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i2));
            }
        } else if (i > 0) {
            AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(c2412Ujhhgtgfeyxiexzf.f4067Ujhhgtgfeyxiexzf, 0, 0, i, this.f4067Ujhhgtgfeyxiexzf);
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(c2412Ujhhgtgfeyxiexzf.f4068Ujhhgtgfeyxiexzf, this.f4068Ujhhgtgfeyxiexzf, 0, 0, i << 1);
            this.f4069Ujhhgtgfeyxiexzf = i;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Object mo2538Ujhhgtgfeyxiexzf(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f4069Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f4068Ujhhgtgfeyxiexzf;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f4067Ujhhgtgfeyxiexzf;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr, i, i5, i2, iArr);
                Object[] objArr2 = this.f4068Ujhhgtgfeyxiexzf;
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f4068Ujhhgtgfeyxiexzf;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f4067Ujhhgtgfeyxiexzf = Arrays.copyOf(iArr, i7);
            this.f4068Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4068Ujhhgtgfeyxiexzf, i7 << 1);
            if (i2 != this.f4069Ujhhgtgfeyxiexzf) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr, 0, 0, i, this.f4067Ujhhgtgfeyxiexzf);
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, this.f4068Ujhhgtgfeyxiexzf, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr, i, i8, i2, this.f4067Ujhhgtgfeyxiexzf);
                AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr, this.f4068Ujhhgtgfeyxiexzf, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f4069Ujhhgtgfeyxiexzf) {
            throw new ConcurrentModificationException();
        }
        this.f4069Ujhhgtgfeyxiexzf = i4;
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Object mo2539Ujhhgtgfeyxiexzf(int i, Object obj) {
        if (i < 0 || i >= this.f4069Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f4068Ujhhgtgfeyxiexzf;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Object m2540Ujhhgtgfeyxiexzf(int i) {
        if (i < 0 || i >= this.f4069Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f4068Ujhhgtgfeyxiexzf[(i << 1) + 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2534Ujhhgtgfeyxiexzf = m2534Ujhhgtgfeyxiexzf(obj);
        if (iM2534Ujhhgtgfeyxiexzf < 0 || !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj2, m2540Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf))) {
            return false;
        }
        mo2538Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2534Ujhhgtgfeyxiexzf = m2534Ujhhgtgfeyxiexzf(obj);
        if (iM2534Ujhhgtgfeyxiexzf < 0 || !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj2, m2540Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf))) {
            return false;
        }
        mo2539Ujhhgtgfeyxiexzf(iM2534Ujhhgtgfeyxiexzf, obj3);
        return true;
    }
}
