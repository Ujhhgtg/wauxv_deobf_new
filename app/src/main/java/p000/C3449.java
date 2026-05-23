package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3449 {

    public static final C3449 f10911 = new C3449(0, "VZCBSIFJD", 0, 1);

    public static final C3449 f10912 = new C3449(1, "VZCBSIFJD", 1, 2);

    public static final C3449 f10913 = new C3449(2, "VZCBSIFJD", 2, 3);

    public static final C3449 f10914 = new C3449(3, "VZCBSIFJD", 3, 4);

    public static final C3449 f10915 = new C3449(4, "VZCBSIFJD", 4, 5);

    public static final C3449 f10916 = new C3449(5, "VZCBSIFJD", 5, 6);

    public static final C3449 f10917 = new C3449(6, "VZCBSIFJD", 6, 7);

    public static final C3449 f10918 = new C3449(7, "VZCBSIFJD", 7, 8);

    public static final C3449 f10919 = new C3449(8, "VZCBSIFJD", 8, 9);

    public final int f10920;

    public final String f10921;

    public final int f10922;

    public final int f10923;

    public C3449(int i, String str, int i2, int i3) {
        this.f10920 = i;
        this.f10921 = str;
        this.f10922 = i2;
        this.f10923 = i3;
    }

    public static void m4975(StringBuilder sb, Class cls) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb.append(cCharAt);
            }
            sb.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c = 'J';
        }
        sb.append(c);
    }

    public static int m4976(String str) {
        int i;
        char cCharAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    while (true) {
                        i = i4 + 1;
                        if (str.charAt(i4) == ';') {
                            break;
                        }
                        i4 = i;
                    }
                    i4 = i;
                }
                i3++;
                i2 = i4;
            }
            cCharAt = str.charAt(i2);
        }
        char cCharAt2 = str.charAt(i2 + 1);
        if (cCharAt2 == 'V') {
            return i3 << 2;
        }
        return (i3 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    public static String m4977(Class cls) {
        StringBuilder sb = new StringBuilder();
        m4975(sb, cls);
        return sb.toString();
    }

    public static String m4978(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static C3449 m4979(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C3449(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f10917;
        }
        if (cCharAt == 'L') {
            return new C3449(10, str, i + 1, i2 - 1);
        }
        if (cCharAt == 'S') {
            return f10915;
        }
        if (cCharAt == 'V') {
            return f10911;
        }
        if (cCharAt == 'I') {
            return f10916;
        }
        if (cCharAt == 'J') {
            return f10918;
        }
        if (cCharAt == 'Z') {
            return f10912;
        }
        if (cCharAt == '[') {
            return new C3449(9, str, i, i2);
        }
        switch (cCharAt) {
            case 'B':
                return f10914;
            case 'C':
                return f10913;
            case 'D':
                return f10919;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static C3449 m4980(Class cls) {
        if (!cls.isPrimitive()) {
            String strM4977 = m4977(cls);
            return m4979(0, strM4977.length(), strM4977);
        }
        if (cls == Integer.TYPE) {
            return f10916;
        }
        if (cls == Void.TYPE) {
            return f10911;
        }
        if (cls == Boolean.TYPE) {
            return f10912;
        }
        if (cls == Byte.TYPE) {
            return f10914;
        }
        if (cls == Character.TYPE) {
            return f10913;
        }
        if (cls == Short.TYPE) {
            return f10915;
        }
        if (cls == Double.TYPE) {
            return f10919;
        }
        if (cls == Float.TYPE) {
            return f10917;
        }
        if (cls == Long.TYPE) {
            return f10918;
        }
        throw new AssertionError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3449)) {
            return false;
        }
        C3449 c3449 = (C3449) obj;
        int i = this.f10920;
        if (i == 12) {
            i = 10;
        }
        int i2 = c3449.f10920;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c3449.f10922;
        int i4 = c3449.f10923;
        int i5 = this.f10923;
        int i6 = this.f10922;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f10921.charAt(i6) != c3449.f10921.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f10920;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f10922; i2 < this.f10923; i2++) {
                iCharAt = (this.f10921.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m4982();
    }

    public final void m4981(StringBuilder sb) {
        int i = this.f10923;
        int i2 = this.f10922;
        String str = this.f10921;
        int i3 = this.f10920;
        if (i3 == 10) {
            sb.append((CharSequence) str, i2 - 1, i + 1);
        } else {
            if (i3 != 12) {
                sb.append((CharSequence) str, i2, i);
                return;
            }
            sb.append('L');
            sb.append((CharSequence) str, i2, i);
            sb.append(';');
        }
    }

    public final String m4982() {
        int i = this.f10923;
        int i2 = this.f10922;
        String str = this.f10921;
        int i3 = this.f10920;
        if (i3 == 10) {
            return str.substring(i2 - 1, i + 1);
        }
        if (i3 != 12) {
            return str.substring(i2, i);
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append((CharSequence) str, i2, i);
        sb.append(';');
        return sb.toString();
    }
}
