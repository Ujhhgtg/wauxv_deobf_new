package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲈᲁᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int[] f8885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object[] f8886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f8887;

    public C2767(int i) {
        this.f8885 = i == 0 ? AbstractC1469.f5220 : new int[i];
        this.f8886 = i == 0 ? AbstractC1469.f5221 : new Object[i << 1];
    }

    public void clear() {
        if (this.f8887 > 0) {
            this.f8885 = AbstractC1469.f5220;
            this.f8886 = AbstractC1469.f5221;
            this.f8887 = 0;
        }
        if (this.f8887 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m4741(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m4738(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2767) {
                int i = this.f8887;
                if (i != ((C2767) obj).f8887) {
                    return false;
                }
                C2767 c2767 = (C2767) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM4743 = m4743(i2);
                    Object objM4744 = m4744(i2);
                    Object obj2 = c2767.get(objM4743);
                    if (objM4744 == null) {
                        if (obj2 != null || !c2767.containsKey(objM4743)) {
                            return false;
                        }
                    } else if (!objM4744.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8887 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f8887;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM4745 = m4743(i4);
                Object objM4746 = m4744(i4);
                Object obj3 = ((Map) obj).get(objM4745);
                if (objM4746 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM4745)) {
                        return false;
                    }
                } else if (!objM4746.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM4741 = m4741(obj);
        if (iM4741 >= 0) {
            return this.f8886[(iM4741 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM4741 = m4741(obj);
        return iM4741 >= 0 ? this.f8886[(iM4741 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f8885;
        Object[] objArr = this.f8886;
        int i = this.f8887;
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
        return this.f8887 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f8887;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM4740 = obj != null ? m4740(iHashCode, obj) : m4742();
        if (iM4740 >= 0) {
            int i2 = (iM4740 << 1) + 1;
            Object[] objArr = this.f8886;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM4740;
        int[] iArr = this.f8885;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f8885 = Arrays.copyOf(iArr, i4);
            this.f8886 = Arrays.copyOf(this.f8886, i4 << 1);
            if (i != this.f8887) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f8885;
            int i5 = i3 + 1;
            AbstractC0280.m1525(iArr2, i5, i3, i, iArr2);
            Object[] objArr2 = this.f8886;
            AbstractC0280.m1526(objArr2, objArr2, i5 << 1, i3 << 1, this.f8887 << 1);
        }
        int i6 = this.f8887;
        if (i == i6) {
            int[] iArr3 = this.f8885;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f8886;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f8887 = i6 + 1;
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
        int iM4741 = m4741(obj);
        if (iM4741 >= 0) {
            return mo2013(iM4741);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM4741 = m4741(obj);
        if (iM4741 >= 0) {
            return mo2014(iM4741, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f8887;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8887 * 28);
        sb.append('{');
        int i = this.f8887;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM4743 = m4743(i2);
            if (objM4743 != sb) {
                sb.append(objM4743);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM4744 = m4744(i2);
            if (objM4744 != sb) {
                sb.append(objM4744);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4738(Object obj) {
        int i = this.f8887 * 2;
        Object[] objArr = this.f8886;
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
    public final void m4739(int i) {
        int i2 = this.f8887;
        int[] iArr = this.f8885;
        if (iArr.length < i) {
            this.f8885 = Arrays.copyOf(iArr, i);
            this.f8886 = Arrays.copyOf(this.f8886, i * 2);
        }
        if (this.f8887 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m4740(int i, Object obj) {
        int i2 = this.f8887;
        if (i2 == 0) {
            return -1;
        }
        int iM3323 = AbstractC1469.m3323(i2, i, this.f8885);
        if (iM3323 < 0 || AbstractC1469.m3322(obj, this.f8886[iM3323 << 1])) {
            return iM3323;
        }
        int i3 = iM3323 + 1;
        while (i3 < i2 && this.f8885[i3] == i) {
            if (AbstractC1469.m3322(obj, this.f8886[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM3323 - 1; i4 >= 0 && this.f8885[i4] == i; i4--) {
            if (AbstractC1469.m3322(obj, this.f8886[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m4741(Object obj) {
        return obj == null ? m4742() : m4740(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m4742() {
        int i = this.f8887;
        if (i == 0) {
            return -1;
        }
        int iM3323 = AbstractC1469.m3323(i, 0, this.f8885);
        if (iM3323 < 0 || this.f8886[iM3323 << 1] == null) {
            return iM3323;
        }
        int i2 = iM3323 + 1;
        while (i2 < i && this.f8885[i2] == 0) {
            if (this.f8886[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM3323 - 1; i3 >= 0 && this.f8885[i3] == 0; i3--) {
            if (this.f8886[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object m4743(int i) {
        if (i < 0 || i >= this.f8887) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8886[i << 1];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo2012(C0274 c0274) {
        int i = c0274.f8887;
        m4739(this.f8887 + i);
        if (this.f8887 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0274.m4743(i2), c0274.m4744(i2));
            }
        } else if (i > 0) {
            AbstractC0280.m1525(c0274.f8885, 0, 0, i, this.f8885);
            AbstractC0280.m1526(c0274.f8886, this.f8886, 0, 0, i << 1);
            this.f8887 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo2013(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f8887)) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f8886;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f8885;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0280.m1525(iArr, i, i5, i2, iArr);
                Object[] objArr2 = this.f8886;
                AbstractC0280.m1526(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f8886;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f8885 = Arrays.copyOf(iArr, i7);
            this.f8886 = Arrays.copyOf(this.f8886, i7 << 1);
            if (i2 != this.f8887) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0280.m1525(iArr, 0, 0, i, this.f8885);
                AbstractC0280.m1526(objArr, this.f8886, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0280.m1525(iArr, i, i8, i2, this.f8885);
                AbstractC0280.m1526(objArr, this.f8886, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f8887) {
            throw new ConcurrentModificationException();
        }
        this.f8887 = i4;
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public Object mo2014(int i, Object obj) {
        if (i < 0 || i >= this.f8887) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f8886;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Object m4744(int i) {
        if (i < 0 || i >= this.f8887) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8886[(i << 1) + 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM4741 = m4741(obj);
        if (iM4741 < 0 || !AbstractC1469.m3322(obj2, m4744(iM4741))) {
            return false;
        }
        mo2013(iM4741);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM4741 = m4741(obj);
        if (iM4741 < 0 || !AbstractC1469.m3322(obj2, m4744(iM4741))) {
            return false;
        }
        mo2014(iM4741, obj3);
        return true;
    }
}
