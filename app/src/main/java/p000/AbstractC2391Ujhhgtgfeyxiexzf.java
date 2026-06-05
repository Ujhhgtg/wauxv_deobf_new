package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2391Ujhhgtgfeyxiexzf extends AbstractC1245feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static boolean m3641Ujhhgtgfeyxiexzf(Object obj, Object[] objArr) {
        int i;
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (obj.equals(objArr[i2])) {
                    i = i2;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m3642Ujhhgtgfeyxiexzf(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m3643Ujhhgtgfeyxiexzf(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m3644Ujhhgtgfeyxiexzf(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3645feyxiexzfUjhhgtg(int i, int i2, int[] iArr, int[] iArr2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, 0, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m3646feyxiexzfUjhhgtg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m3647feyxiexzfUjhhgtg(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static byte[] m3648feyxiexzfUjhhgtg(int i, int i2, byte[] bArr) {
        AbstractC1245feyxiexzfUjhhgtg.m2748Ujhhgtgfeyxiexzf(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Object m3649feyxiexzfUjhhgtg(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final void m3650feyxiexzfUjhhgtg(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC3590Ujhhgtgfeyxiexzf.m5118Ujhhgtgfeyxiexzf(sb, obj, interfaceC3549feyxiexzfUjhhgtg);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static String m3651feyxiexzfUjhhgtg(Object[] objArr, String str, String str2, String str3, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC3549feyxiexzfUjhhgtg = null;
        }
        StringBuilder sb = new StringBuilder();
        m3650feyxiexzfUjhhgtg(objArr, sb, str4, str5, str6, interfaceC3549feyxiexzfUjhhgtg);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static byte[] m3652feyxiexzfUjhhgtg(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static List m3653feyxiexzfUjhhgtg(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Arrays.asList(Arrays.copyOf(objArr, objArr.length)) : Collections.singletonList(objArr[0]);
        }
        return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static Set m3654feyxiexzfUjhhgtg(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C3310feyxiexzfUjhhgtg.f10347Ujhhgtgfeyxiexzf;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
