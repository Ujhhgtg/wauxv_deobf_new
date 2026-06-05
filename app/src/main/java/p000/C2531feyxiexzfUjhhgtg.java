package p000;

import android.text.SpannableStringBuilder;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2531feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final String f8244Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final String f8245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C2531feyxiexzfUjhhgtg f8246Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2531feyxiexzfUjhhgtg f8247Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean f8248Ujhhgtgfeyxiexzf;

    static {
        C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtg = AbstractC1968Ujhhgtgfeyxiexzf.f6451Ujhhgtgfeyxiexzf;
        f8244Ujhhgtgfeyxiexzf = Character.toString((char) 8206);
        f8245Ujhhgtgfeyxiexzf = Character.toString((char) 8207);
        f8246Ujhhgtgfeyxiexzf = new C2531feyxiexzfUjhhgtg(false);
        f8247Ujhhgtgfeyxiexzf = new C2531feyxiexzfUjhhgtg(true);
    }

    public C2531feyxiexzfUjhhgtg(boolean z) {
        C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtg = AbstractC1968Ujhhgtgfeyxiexzf.f6449Ujhhgtgfeyxiexzf;
        this.f8248Ujhhgtgfeyxiexzf = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static int m3796Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        byte directionality;
        C2530feyxiexzfUjhhgtg c2530feyxiexzfUjhhgtg = new C2530feyxiexzfUjhhgtg(charSequence);
        c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf;
            if (i4 < c2530feyxiexzfUjhhgtg.f8241Ujhhgtgfeyxiexzf && i == 0) {
                CharSequence charSequence2 = c2530feyxiexzfUjhhgtg.f8240Ujhhgtgfeyxiexzf;
                char cCharAt = charSequence2.charAt(i4);
                c2530feyxiexzfUjhhgtg.f8243Ujhhgtgfeyxiexzf = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf);
                    c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf = Character.charCount(iCodePointAt) + c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf++;
                    char c = c2530feyxiexzfUjhhgtg.f8243Ujhhgtgfeyxiexzf;
                    directionality = c < 1792 ? C2530feyxiexzfUjhhgtg.f8239Ujhhgtgfeyxiexzf[c] : Character.getDirectionality(c);
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
                while (c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf > 0) {
                    switch (c2530feyxiexzfUjhhgtg.m3795Ujhhgtgfeyxiexzf()) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m3797Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        C2530feyxiexzfUjhhgtg c2530feyxiexzfUjhhgtg = new C2530feyxiexzfUjhhgtg(charSequence);
        c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf = c2530feyxiexzfUjhhgtg.f8241Ujhhgtgfeyxiexzf;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c2530feyxiexzfUjhhgtg.f8242Ujhhgtgfeyxiexzf > 0) {
                byte bM3795Ujhhgtgfeyxiexzf = c2530feyxiexzfUjhhgtg.m3795Ujhhgtgfeyxiexzf();
                if (bM3795Ujhhgtgfeyxiexzf == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM3795Ujhhgtgfeyxiexzf == 1 || bM3795Ujhhgtgfeyxiexzf == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM3795Ujhhgtgfeyxiexzf != 9) {
                    switch (bM3795Ujhhgtgfeyxiexzf) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final SpannableStringBuilder m3798Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        String str;
        C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtg = AbstractC1968Ujhhgtgfeyxiexzf.f6451Ujhhgtgfeyxiexzf;
        if (charSequence == null) {
            return null;
        }
        boolean zM4011Ujhhgtgfeyxiexzf = c2667feyxiexzfUjhhgtg.m4011Ujhhgtgfeyxiexzf(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM4011Ujhhgtgfeyxiexzf2 = (zM4011Ujhhgtgfeyxiexzf ? AbstractC1968Ujhhgtgfeyxiexzf.f6450Ujhhgtgfeyxiexzf : AbstractC1968Ujhhgtgfeyxiexzf.f6449Ujhhgtgfeyxiexzf).m4011Ujhhgtgfeyxiexzf(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f8245Ujhhgtgfeyxiexzf;
        String str4 = f8244Ujhhgtgfeyxiexzf;
        boolean z = this.f8248Ujhhgtgfeyxiexzf;
        if (z || !(zM4011Ujhhgtgfeyxiexzf2 || m3796Ujhhgtgfeyxiexzf(charSequence) == 1)) {
            str = (!z || (zM4011Ujhhgtgfeyxiexzf2 && m3796Ujhhgtgfeyxiexzf(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM4011Ujhhgtgfeyxiexzf != z) {
            spannableStringBuilder.append(zM4011Ujhhgtgfeyxiexzf ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM4011Ujhhgtgfeyxiexzf3 = (zM4011Ujhhgtgfeyxiexzf ? AbstractC1968Ujhhgtgfeyxiexzf.f6450Ujhhgtgfeyxiexzf : AbstractC1968Ujhhgtgfeyxiexzf.f6449Ujhhgtgfeyxiexzf).m4011Ujhhgtgfeyxiexzf(charSequence.length(), charSequence);
        if (!z && (zM4011Ujhhgtgfeyxiexzf3 || m3797Ujhhgtgfeyxiexzf(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zM4011Ujhhgtgfeyxiexzf3 || m3797Ujhhgtgfeyxiexzf(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
