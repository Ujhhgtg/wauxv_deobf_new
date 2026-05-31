package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲈᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0916 extends AbstractC3514 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f3385;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0493 f3386;

    static {
        new C0916("");
    }

    public C0916(C0493 c0493) {
        char c;
        this.f3386 = c0493;
        int i = c0493.f2147;
        char[] cArr = new char[i];
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int iM1909 = c0493.m1909(i3);
            switch (iM1909 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i--;
                    if (iM1909 == 0) {
                        m2546(iM1909, i3);
                        throw null;
                    }
                    c = (char) iM1909;
                    i3++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m2546(iM1909, i3);
                    throw null;
                case Opcodes.FCONST_1 /* 12 */:
                case 13:
                    i -= 2;
                    if (i < 0) {
                        m2546(iM1909, i3);
                        throw null;
                    }
                    int i4 = i3 + 1;
                    int iM19010 = c0493.m1909(i4);
                    if ((iM19010 & Opcodes.CHECKCAST) != 128) {
                        m2546(iM19010, i4);
                        throw null;
                    }
                    int i5 = ((iM1909 & 31) << 6) | (iM19010 & 63);
                    if (i5 != 0 && i5 < 128) {
                        m2546(iM19010, i4);
                        throw null;
                    }
                    c = (char) i5;
                    i3 += 2;
                    break;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    i -= 3;
                    if (i < 0) {
                        m2546(iM1909, i3);
                        throw null;
                    }
                    int i6 = i3 + 1;
                    int iM19011 = c0493.m1909(i6);
                    int i7 = iM19011 & Opcodes.CHECKCAST;
                    if (i7 != 128) {
                        m2546(iM19011, i6);
                        throw null;
                    }
                    int i8 = i3 + 2;
                    int iM19012 = c0493.m1909(i8);
                    if (i7 != 128) {
                        m2546(iM19012, i8);
                        throw null;
                    }
                    int i9 = ((iM1909 & 15) << 12) | ((iM19011 & 63) << 6) | (iM19012 & 63);
                    if (i9 < 2048) {
                        m2546(iM19012, i8);
                        throw null;
                    }
                    c = (char) i9;
                    i3 += 3;
                    break;
                    break;
            }
            cArr[i2] = c;
            i2++;
        }
        this.f3385 = new String(cArr, 0, i2).intern();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static void m2546(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + AbstractC2902.m4905(i) + " at offset " + AbstractC2902.m4907(i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0916)) {
            return false;
        }
        return this.f3385.equals(((C0916) obj).f3385);
    }

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11044;
    }

    public final int hashCode() {
        return this.f3385.hashCode();
    }

    public final String toString() {
        return "string{\"" + mo1360() + "\"}";
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        String str = this.f3385;
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt != '\r') {
                char cCharAt2 = i < length + (-1) ? str.charAt(i + 1) : (char) 0;
                boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb.append('\\');
                for (int i2 = 6; i2 >= 0; i2 -= 3) {
                    char c = (char) (((cCharAt >> i2) & 7) + 48);
                    if (c != '0' || z) {
                        sb.append(c);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            } else {
                sb.append("\\r");
            }
            i++;
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        return this.f3385.compareTo(((C0916) abstractC0775).f3385);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2370() {
        return false;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "utf8";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String m2547() {
        return "\"" + mo1360() + '\"';
    }

    public C0916(String str) {
        if (str != null) {
            this.f3385 = str.intern();
            int length = str.length();
            byte[] bArr = new byte[length * 3];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != 0 && cCharAt < 128) {
                    bArr[i] = (byte) cCharAt;
                    i++;
                } else if (cCharAt < 2048) {
                    bArr[i] = (byte) (((cCharAt >> 6) & 31) | Opcodes.CHECKCAST);
                    bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                    i += 2;
                } else {
                    bArr[i] = (byte) (((cCharAt >> '\f') & 15) | 224);
                    bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                    bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                    i += 3;
                }
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            this.f3386 = new C0493(bArr2);
            return;
        }
        throw new NullPointerException("string == null");
    }
}
