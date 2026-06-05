package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3056Ujhhgtgfeyxiexzf extends AbstractC1774Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f9450Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2610Ujhhgtgfeyxiexzf f9451Ujhhgtgfeyxiexzf;

    static {
        new C3056Ujhhgtgfeyxiexzf("");
    }

    public C3056Ujhhgtgfeyxiexzf(C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf) {
        char c;
        this.f9451Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf;
        int i = c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf;
        char[] cArr = new char[i];
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int iM3904Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i3);
            switch (iM3904Ujhhgtgfeyxiexzf >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i--;
                    if (iM3904Ujhhgtgfeyxiexzf == 0) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i3);
                        throw null;
                    }
                    c = (char) iM3904Ujhhgtgfeyxiexzf;
                    i3++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i3);
                    throw null;
                case Opcodes.FCONST_1 /* 12 */:
                case 13:
                    i -= 2;
                    if (i < 0) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i3);
                        throw null;
                    }
                    int i4 = i3 + 1;
                    int iM3904Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i4);
                    if ((iM3904Ujhhgtgfeyxiexzf2 & Opcodes.CHECKCAST) != 128) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf2, i4);
                        throw null;
                    }
                    int i5 = ((iM3904Ujhhgtgfeyxiexzf & 31) << 6) | (iM3904Ujhhgtgfeyxiexzf2 & 63);
                    if (i5 != 0 && i5 < 128) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf2, i4);
                        throw null;
                    }
                    c = (char) i5;
                    i3 += 2;
                    break;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    i -= 3;
                    if (i < 0) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i3);
                        throw null;
                    }
                    int i6 = i3 + 1;
                    int iM3904Ujhhgtgfeyxiexzf3 = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i6);
                    int i7 = iM3904Ujhhgtgfeyxiexzf3 & Opcodes.CHECKCAST;
                    if (i7 != 128) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf3, i6);
                        throw null;
                    }
                    int i8 = i3 + 2;
                    int iM3904Ujhhgtgfeyxiexzf4 = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i8);
                    if (i7 != 128) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf4, i8);
                        throw null;
                    }
                    int i9 = ((iM3904Ujhhgtgfeyxiexzf & 15) << 12) | ((iM3904Ujhhgtgfeyxiexzf3 & 63) << 6) | (iM3904Ujhhgtgfeyxiexzf4 & 63);
                    if (i9 < 2048) {
                        m4534Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf4, i8);
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
        this.f9450Ujhhgtgfeyxiexzf = new String(cArr, 0, i2).intern();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m4534Ujhhgtgfeyxiexzf(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(i) + " at offset " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3056Ujhhgtgfeyxiexzf)) {
            return false;
        }
        return this.f9450Ujhhgtgfeyxiexzf.equals(((C3056Ujhhgtgfeyxiexzf) obj).f9450Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    public final C1784feyxiexzfUjhhgtg getType() {
        return C1784feyxiexzfUjhhgtg.f5997feyxiexzfUjhhgtg;
    }

    public final int hashCode() {
        return this.f9450Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "string{\"" + mo1392Ujhhgtgfeyxiexzf() + "\"}";
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        String str = this.f9450Ujhhgtgfeyxiexzf;
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

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int mo4535Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        return this.f9450Ujhhgtgfeyxiexzf.compareTo(((C3056Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9450Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean mo4536Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final String mo4533Ujhhgtgfeyxiexzf() {
        return "utf8";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final String m4537Ujhhgtgfeyxiexzf() {
        return "\"" + mo1392Ujhhgtgfeyxiexzf() + '\"';
    }

    public C3056Ujhhgtgfeyxiexzf(String str) {
        if (str != null) {
            this.f9450Ujhhgtgfeyxiexzf = str.intern();
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
            this.f9451Ujhhgtgfeyxiexzf = new C2610Ujhhgtgfeyxiexzf(bArr2);
            return;
        }
        throw new NullPointerException("string == null");
    }
}
