package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᲈᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3506 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C3506 f11071 = new C3506(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3506 f11072 = new C3506(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C3506 f11073 = new C3506(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C3506 f11074 = new C3506(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C3506 f11075 = new C3506(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C3506 f11076 = new C3506(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C3506 f11077 = new C3506(6, "VZCBSIFJD", 6, 7);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C3506 f11078 = new C3506(7, "VZCBSIFJD", 7, 8);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C3506 f11079 = new C3506(8, "VZCBSIFJD", 8, 9);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f11080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f11081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f11082;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f11083;

    public C3506(int i, String str, int i2, int i3) {
        this.f11080 = i;
        this.f11081 = str;
        this.f11082 = i2;
        this.f11083 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m5037(String str) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C3506 m5038(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C3506(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f11077;
        }
        if (cCharAt == 'L') {
            return new C3506(10, str, i + 1, i2 - 1);
        }
        if (cCharAt == 'S') {
            return f11075;
        }
        if (cCharAt == 'V') {
            return f11071;
        }
        if (cCharAt == 'I') {
            return f11076;
        }
        if (cCharAt == 'J') {
            return f11078;
        }
        if (cCharAt == 'Z') {
            return f11072;
        }
        if (cCharAt == '[') {
            return new C3506(9, str, i, i2);
        }
        switch (cCharAt) {
            case 'B':
                return f11074;
            case 'C':
                return f11073;
            case 'D':
                return f11079;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3506)) {
            return false;
        }
        C3506 c3506 = (C3506) obj;
        int i = this.f11080;
        if (i == 12) {
            i = 10;
        }
        int i2 = c3506.f11080;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c3506.f11082;
        int i4 = c3506.f11083;
        int i5 = this.f11083;
        int i6 = this.f11082;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f11081.charAt(i6) != c3506.f11081.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f11080;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f11082; i2 < this.f11083; i2++) {
                iCharAt = (this.f11081.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m5039();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m5039() {
        int i = this.f11083;
        int i2 = this.f11082;
        String str = this.f11081;
        int i3 = this.f11080;
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
