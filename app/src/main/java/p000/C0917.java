package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0917 extends AbstractC3458 {

    public final String f3378;

    public final C0516 f3379;

    static {
        new C0917("");
    }

    public C0917(C0516 c0516) {
        char c;
        this.f3379 = c0516;
        int i = c0516.f2191;
        char[] cArr = new char[i];
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int iM1815 = c0516.m1815(i3);
            switch (iM1815 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i--;
                    if (iM1815 == 0) {
                        m2429(0, i3);
                        throw null;
                    }
                    c = (char) iM1815;
                    i3++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m2429(iM1815, i3);
                    throw null;
                case 12 /* 12 */:
                case 13:
                    i -= 2;
                    if (i < 0) {
                        m2429(iM1815, i3);
                        throw null;
                    }
                    int i4 = i3 + 1;
                    int iM1816 = c0516.m1815(i4);
                    if ((iM1816 & 192) != 128) {
                        m2429(iM1816, i4);
                        throw null;
                    }
                    int i5 = ((iM1815 & 31) << 6) | (iM1816 & 63);
                    if (i5 != 0 && i5 < 128) {
                        m2429(iM1816, i4);
                        throw null;
                    }
                    c = (char) i5;
                    i3 += 2;
                    break;
                    break;
                case 14 /* 14 */:
                    i -= 3;
                    if (i < 0) {
                        m2429(iM1815, i3);
                        throw null;
                    }
                    int i6 = i3 + 1;
                    int iM1817 = c0516.m1815(i6);
                    int i7 = iM1817 & 192;
                    if (i7 != 128) {
                        m2429(iM1817, i6);
                        throw null;
                    }
                    int i8 = i3 + 2;
                    int iM1818 = c0516.m1815(i8);
                    if (false) {
                        m2429(iM1818, i8);
                        throw null;
                    }
                    int i9 = ((iM1815 & 15) << 12) | ((iM1817 & 63) << 6) | (iM1818 & 63);
                    if (i9 < 2048) {
                        m2429(iM1818, i8);
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
        this.f3378 = new String(cArr, 0, i2).intern();
    }

    public static void m2429(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + AbstractC1460.m3222(i) + " at offset " + AbstractC1460.m3224(i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0917)) {
            return false;
        }
        return this.f3378.equals(((C0917) obj).f3378);
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10884;
    }

    public final int hashCode() {
        return this.f3378.hashCode();
    }

    public final String toString() {
        return "string{\"" + mo1214() + "\"}";
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        String str = this.f3378;
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

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        return this.f3378.compareTo(((C0917) abstractC0777).f3378);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "utf8";
    }

    public final String m2430() {
        return "\"" + mo1214() + '\"';
    }

    public C0917(String str) {
        if (str != null) {
            this.f3378 = str.intern();
            int length = str.length();
            byte[] bArr = new byte[length * 3];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != 0 && cCharAt < 128) {
                    bArr[i] = (byte) cCharAt;
                    i++;
                } else if (cCharAt < 2048) {
                    bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
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
            this.f3379 = new C0516(bArr2);
            return;
        }
        throw new NullPointerException("string == null");
    }
}
