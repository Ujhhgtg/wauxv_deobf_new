package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲁᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2705 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int[] f8714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object[] f8715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f8716;

    public C2705(int i) {
        this.f8714 = i == 0 ? AbstractC1460.f5196 : new int[i];
        this.f8715 = i == 0 ? AbstractC1460.f5197 : new Object[i << 1];
    }

    public void clear() {
        if (this.f8716 > 0) {
            this.f8714 = AbstractC1460.f5196;
            this.f8715 = AbstractC1460.f5197;
            this.f8716 = 0;
        }
        if (false) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m4704(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m4701(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2705) {
                int i = this.f8716;
                if (i != ((C2705) obj).f8716) {
                    return false;
                }
                C2705 c2705 = (C2705) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM4706 = m4706(i2);
                    Object objM4707 = m4707(i2);
                    Object obj2 = c2705.get(objM4706);
                    if (objM4707 == null) {
                        if (obj2 != null || !c2705.containsKey(objM4706)) {
                            return false;
                        }
                    } else if (!objM4707.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8716 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f8716;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM4708 = m4706(i4);
                Object objM4709 = m4707(i4);
                Object obj3 = ((Map) obj).get(objM4708);
                if (objM4709 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM4708)) {
                        return false;
                    }
                } else if (!objM4709.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM4704 = m4704(obj);
        if (iM4704 >= 0) {
            return this.f8715[(iM4704 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM4704 = m4704(obj);
        return iM4704 >= 0 ? this.f8715[(iM4704 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f8714;
        Object[] objArr = this.f8715;
        int i = this.f8716;
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
        return this.f8716 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f8716;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM4703 = obj != null ? m4703(iHashCode, obj) : m4705();
        if (iM4703 >= 0) {
            int i2 = (iM4703 << 1) + 1;
            Object[] objArr = this.f8715;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM4703;
        int[] iArr = this.f8714;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f8714 = Arrays.copyOf(iArr, i4);
            this.f8715 = Arrays.copyOf(this.f8715, i4 << 1);
            if (i != this.f8716) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f8714;
            int i5 = i3 + 1;
            AbstractC0270.m1379(iArr2, i5, i3, i, iArr2);
            Object[] objArr2 = this.f8715;
            AbstractC0270.m1380(objArr2, objArr2, i5 << 1, i3 << 1, this.f8716 << 1);
        }
        int i6 = this.f8716;
        if (i == i6) {
            int[] iArr3 = this.f8714;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f8715;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f8716 = i6 + 1;
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
        int iM4704 = m4704(obj);
        if (iM4704 >= 0) {
            return mo1918(iM4704);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM4704 = m4704(obj);
        if (iM4704 >= 0) {
            return mo1919(iM4704, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f8716;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8716 * 28);
        sb.append('{');
        int i = this.f8716;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM4706 = m4706(i2);
            if (objM4706 != sb) {
                sb.append(objM4706);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM4707 = m4707(i2);
            if (objM4707 != sb) {
                sb.append(objM4707);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4701(Object obj) {
        int i = this.f8716 * 2;
        Object[] objArr = this.f8715;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4702(int i) {
        int i2 = this.f8716;
        int[] iArr = this.f8714;
        if (iArr.length < i) {
            this.f8714 = Arrays.copyOf(iArr, i);
            this.f8715 = Arrays.copyOf(this.f8715, i * 2);
        }
        if (this.f8716 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m4703(int i, Object obj) {
        int i2 = this.f8716;
        if (i2 == 0) {
            return -1;
        }
        int iM3205 = AbstractC1460.m3205(i2, i, this.f8714);
        if (iM3205 < 0 || AbstractC2207.m4087(obj, this.f8715[iM3205 << 1])) {
            return iM3205;
        }
        int i3 = iM3205 + 1;
        while (i3 < i2 && this.f8714[i3] == i) {
            if (AbstractC2207.m4087(obj, this.f8715[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM3205 - 1; i4 >= 0 && this.f8714[i4] == i; i4--) {
            if (AbstractC2207.m4087(obj, this.f8715[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m4704(Object obj) {
        return obj == null ? m4705() : m4703(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m4705() {
        int i = this.f8716;
        if (i == 0) {
            return -1;
        }
        int iM3205 = AbstractC1460.m3205(i, 0, this.f8714);
        if (iM3205 < 0 || this.f8715[iM3205 << 1] == null) {
            return iM3205;
        }
        int i2 = iM3205 + 1;
        while (i2 < i && this.f8714[i2] == 0) {
            if (this.f8715[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM3205 - 1; i3 >= 0 && this.f8714[i3] == 0; i3--) {
            if (this.f8715[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object m4706(int i) {
        if (i < 0 || i >= this.f8716) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8715[i << 1];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1917(C0264 c0264) {
        int i = c0264.f8716;
        m4702(this.f8716 + i);
        if (this.f8716 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0264.m4706(i2), c0264.m4707(i2));
            }
        } else if (i > 0) {
            AbstractC0270.m1379(c0264.f8714, 0, 0, i, this.f8714);
            AbstractC0270.m1380(c0264.f8715, this.f8715, 0, 0, i << 1);
            this.f8716 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo1918(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f8716)) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f8715;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f8714;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0270.m1379(iArr, i, i5, i2, iArr);
                Object[] objArr2 = this.f8715;
                AbstractC0270.m1380(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f8715;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f8714 = Arrays.copyOf(iArr, i7);
            this.f8715 = Arrays.copyOf(this.f8715, i7 << 1);
            if (i2 != this.f8716) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0270.m1379(iArr, 0, 0, i, this.f8714);
                AbstractC0270.m1380(objArr, this.f8715, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0270.m1379(iArr, i, i8, i2, this.f8714);
                AbstractC0270.m1380(objArr, this.f8715, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f8716) {
            throw new ConcurrentModificationException();
        }
        this.f8716 = i4;
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public Object mo1919(int i, Object obj) {
        if (i < 0 || i >= this.f8716) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f8715;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Object m4707(int i) {
        if (i < 0 || i >= this.f8716) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8715[(i << 1) + 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM4704 = m4704(obj);
        if (iM4704 < 0 || !AbstractC2207.m4087(obj2, m4707(iM4704))) {
            return false;
        }
        mo1918(iM4704);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM4704 = m4704(obj);
        if (iM4704 < 0 || !AbstractC2207.m4087(obj2, m4707(iM4704))) {
            return false;
        }
        mo1919(iM4704, obj3);
        return true;
    }
}
