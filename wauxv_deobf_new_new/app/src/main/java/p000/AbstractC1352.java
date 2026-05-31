package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1352 extends AbstractC2139 implements InterfaceC3466 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object[] f4833;

    public AbstractC1352(int i) {
        super(i != 0);
        try {
            this.f4833 = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4833, ((AbstractC1352) obj).f4833);
    }

    public C3505 getType(int i) {
        return (C3505) m3165(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4833);
    }

    public final int size() {
        return this.f4833.length;
    }

    public final String toString() {
        String name = getClass().getName();
        return m3167(name.substring(name.lastIndexOf(46) + 1) + '{', "}", false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public String mo1360() {
        String name = getClass().getName();
        return m3167(name.substring(name.lastIndexOf(46) + 1) + '{', "}", true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Object m3165(int i) {
        try {
            Object obj = this.f4833[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3166(int i, Object obj) {
        m4109();
        try {
            this.f4833[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i >= 0) {
                throw new IndexOutOfBoundsException("n >= size()");
            }
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final String m3167(String str, String str2, boolean z) {
        int length = this.f4833.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC3466) this.f4833[i]).mo1360());
            } else {
                sb.append(this.f4833[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }
}
