package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1352 extends AbstractC2106 implements InterfaceC3407 {

    public final Object[] f4836;

    public AbstractC1352(int i) {
        super(i != 0);
        try {
            this.f4836 = new Object[i];
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
        return Arrays.equals(this.f4836, ((AbstractC1352) obj).f4836);
    }

    public C3448 getType(int i) {
        return (C3448) m3062(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4836);
    }

    public final int size() {
        return this.f4836.length;
    }

    public final String toString() {
        String name = getClass().getName();
        return m3064(name.substring(name.lastIndexOf(46) + 1) + '{', "}", false);
    }

    public String mo1214() {
        String name = getClass().getName();
        return m3064(name.substring(name.lastIndexOf(46) + 1) + '{', "}", true);
    }

    public final Object m3062(int i) {
        try {
            Object obj = this.f4836[i];
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

    public final void m3063(int i, Object obj) {
        m3925();
        try {
            this.f4836[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i >= 0) {
                throw new IndexOutOfBoundsException("n >= size()");
            }
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public final String m3064(String str, String str2, boolean z) {
        int length = this.f4836.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC3407) this.f4836[i]).mo1214());
            } else {
                sb.append(this.f4836[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }
}
