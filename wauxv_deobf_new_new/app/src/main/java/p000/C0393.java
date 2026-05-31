package p000;

import android.text.SpannableStringBuilder;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0393 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f1930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String f1931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0393 f1932;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0393 f1933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f1934;

    static {
        C0427 c0427 = AbstractC2964.f9514;
        f1930 = Character.toString((char) 8206);
        f1931 = Character.toString((char) 8207);
        f1932 = new C0393(false);
        f1933 = new C0393(true);
    }

    public C0393(boolean z) {
        C0427 c0427 = AbstractC2964.f9512;
        this.f1934 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m1717(CharSequence charSequence) {
        byte directionality;
        C0392 c0392 = new C0392(charSequence);
        c0392.f1928 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0392.f1928;
            if (i4 < c0392.f1927 && i == 0) {
                CharSequence charSequence2 = c0392.f1926;
                char cCharAt = charSequence2.charAt(i4);
                c0392.f1929 = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0392.f1928);
                    c0392.f1928 = Character.charCount(iCodePointAt) + c0392.f1928;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0392.f1928++;
                    char c = c0392.f1929;
                    directionality = c < 1792 ? C0392.f1925[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case Opcodes.DCONST_0 /* 14 */:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case Opcodes.SIPUSH /* 17 */:
                                i3++;
                                i2 = 1;
                                continue;
                            case Opcodes.LDC /* 18 */:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (c0392.f1928 > 0) {
                    switch (c0392.m1716()) {
                        case Opcodes.DCONST_0 /* 14 */:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case Opcodes.SIPUSH /* 17 */:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case Opcodes.LDC /* 18 */:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m1718(CharSequence charSequence) {
        C0392 c0392 = new C0392(charSequence);
        c0392.f1928 = c0392.f1927;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c0392.f1928 > 0) {
                byte bM1716 = c0392.m1716();
                if (bM1716 == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM1716 == 1 || bM1716 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM1716 != 9) {
                    switch (bM1716) {
                        case Opcodes.DCONST_0 /* 14 */:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case Opcodes.SIPUSH /* 17 */:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case Opcodes.LDC /* 18 */:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final SpannableStringBuilder m1719(CharSequence charSequence) {
        String str;
        C0427 c0427 = AbstractC2964.f9514;
        if (charSequence == null) {
            return null;
        }
        boolean zM1778 = c0427.m1778(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM1779 = (zM1778 ? AbstractC2964.f9513 : AbstractC2964.f9512).m1778(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f1931;
        String str4 = f1930;
        boolean z = this.f1934;
        if (z || !(zM1779 || m1717(charSequence) == 1)) {
            str = (!z || (zM1779 && m1717(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM1778 != z) {
            spannableStringBuilder.append(zM1778 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM17710 = (zM1778 ? AbstractC2964.f9513 : AbstractC2964.f9512).m1778(charSequence.length(), charSequence);
        if (!z && (zM17710 || m1718(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zM17710 || m1718(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
