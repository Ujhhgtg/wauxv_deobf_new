package p000;

import android.text.SpannableStringBuilder;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲀᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0418 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f1958;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String f1959;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0418 f1960;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0418 f1961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f1962;

    static {
        C0452 c0452 = AbstractC2905.f9347;
        f1958 = Character.toString((char) 8206);
        f1959 = Character.toString((char) 8207);
        f1960 = new C0418(false);
        f1961 = new C0418(true);
    }

    public C0418(boolean z) {
        C0452 c0452 = AbstractC2905.f9345;
        this.f1962 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m1611(CharSequence charSequence) {
        byte directionality;
        C0417 c0417 = new C0417(charSequence);
        c0417.f1956 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0417.f1956;
            if (i4 < c0417.f1955 && i == 0) {
                CharSequence charSequence2 = c0417.f1954;
                char cCharAt = charSequence2.charAt(i4);
                c0417.f1957 = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0417.f1956);
                    c0417.f1956 = Character.charCount(iCodePointAt) + c0417.f1956;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0417.f1956++;
                    char c = c0417.f1957;
                    directionality = c < 1792 ? C0417.f1953[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14 /* 14 */:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17 /* 17 */:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18 /* 18 */:
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
                while (c0417.f1956 > 0) {
                    switch (c0417.m1610()) {
                        case 14 /* 14 */:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17 /* 17 */:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18 /* 18 */:
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
    public static int m1612(CharSequence charSequence) {
        C0417 c0417 = new C0417(charSequence);
        c0417.f1956 = c0417.f1955;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (c0417.f1956 > 0) {
                byte bM1610 = c0417.m1610();
                if (bM1610 == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (true) {
                    }
                } else if (bM1610 == 1 || bM1610 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (true) {
                    }
                } else if (bM1610 != 9) {
                    switch (bM1610) {
                        case 14 /* 14 */:
                        case 15:
                            if (0 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17 /* 17 */:
                            if (0 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18 /* 18 */:
                            i++;
                            break;
                        default:
                            if (false) {
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
    public final SpannableStringBuilder m1613(CharSequence charSequence) {
        String str;
        C0452 c0452 = AbstractC2905.f9347;
        if (charSequence == null) {
            return null;
        }
        boolean zM1671 = c0452.m1671(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM1672 = (zM1671 ? AbstractC2905.f9346 : AbstractC2905.f9345).m1671(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f1959;
        String str4 = f1958;
        boolean z = this.f1962;
        if (z || !(zM1672 || m1611(charSequence) == 1)) {
            str = (!z || (zM1672 && m1611(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM1671 != z) {
            spannableStringBuilder.append(zM1671 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM1673 = (zM1671 ? AbstractC2905.f9346 : AbstractC2905.f9345).m1671(charSequence.length(), charSequence);
        if (!z && (zM1673 || m1612(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zM1673 || m1612(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
