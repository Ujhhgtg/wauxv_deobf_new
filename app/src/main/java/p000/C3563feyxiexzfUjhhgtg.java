package p000;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3563feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C0154Ujhhgtgfeyxiexzf f11070Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int[] f11071Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int[] f11072Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int[] f11073Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int[] f11074Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public short f11075Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public short f11076Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f11077Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int[] f11078Ujhhgtgfeyxiexzf;

    public C3563feyxiexzfUjhhgtg(C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf) {
        this.f11070Ujhhgtgfeyxiexzf = c0154Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m5090Ujhhgtgfeyxiexzf(C2062Ujhhgtgfeyxiexzf c2062Ujhhgtgfeyxiexzf, String str, int i) {
        char cCharAt = str.charAt(i);
        int iM3362Ujhhgtgfeyxiexzf = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(str.substring(i + 1, str.length() - 1)) | 33554432;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 16777220;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(str.substring(i2 + 1, str.length() - 1)) | 33554432;
                            } else if (cCharAt2 == 'S') {
                                iM3362Ujhhgtgfeyxiexzf = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iM3362Ujhhgtgfeyxiexzf = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iM3362Ujhhgtgfeyxiexzf = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iM3362Ujhhgtgfeyxiexzf = 16777226;
                                        break;
                                    case 'C':
                                        iM3362Ujhhgtgfeyxiexzf = 16777227;
                                        break;
                                    case 'D':
                                        iM3362Ujhhgtgfeyxiexzf = 16777219;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iM3362Ujhhgtgfeyxiexzf = 16777220;
                            }
                        }
                        return ((i2 - i) << 28) | iM3362Ujhhgtgfeyxiexzf;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 16777219;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 16777217;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:27:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x004c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m5091Ujhhgtgfeyxiexzf(C2062Ujhhgtgfeyxiexzf c2062Ujhhgtgfeyxiexzf, int i, int[] iArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        String strReplace;
        int i7;
        int iMin;
        int iM3362Ujhhgtgfeyxiexzf;
        int i8;
        int i9;
        long j;
        int i10;
        C2061Ujhhgtgfeyxiexzf c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf;
        String str;
        String str2;
        Class<?> cls;
        Class<?> cls2;
        int i11;
        int i12 = i;
        int i13 = iArr[i2];
        if (i13 != i12) {
            if ((268435455 & i12) != 16777221) {
                if (i13 == 0) {
                    iArr[i2] = i12;
                    return true;
                }
                i3 = i13 & (-268435456);
                i4 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                if (i3 == 0 || (i13 & 251658240) == 33554432) {
                    if (i12 != 16777221) {
                        i5 = i12 & (-16777216);
                        i6 = (-16777216) & i13;
                        strReplace = ASMUtils.TYPE_OBJECT;
                        if (i5 != i6) {
                            i7 = i12 & (-268435456);
                            if (i7 == 0 || (i12 & 251658240) == 33554432) {
                                if (i7 != 0 && (i12 & 251658240) != 33554432) {
                                    i7 -= 268435456;
                                }
                                if (i3 != 0 && (i13 & 251658240) != 33554432) {
                                    i3 -= 268435456;
                                }
                                iMin = Math.min(i7, i3) | 33554432;
                                iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(ASMUtils.TYPE_OBJECT);
                                i4 = iMin | iM3362Ujhhgtgfeyxiexzf;
                            }
                        } else if ((i13 & 251658240) == 33554432) {
                            int i14 = (i12 & (-268435456)) | 33554432;
                            i8 = i12 & 1048575;
                            i9 = 1048575 & i13;
                            j = ((long) i8) | (((long) i9) << 32);
                            i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                            c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3363Ujhhgtgfeyxiexzf(i10);
                            while (true) {
                                if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf == null) {
                                    C2061Ujhhgtgfeyxiexzf[] c2061UjhhgtgfeyxiexzfArr = c2062Ujhhgtgfeyxiexzf.f6789Ujhhgtgfeyxiexzf;
                                    str = c2061UjhhgtgfeyxiexzfArr[i8].f6777Ujhhgtgfeyxiexzf;
                                    str2 = c2061UjhhgtgfeyxiexzfArr[i9].f6777Ujhhgtgfeyxiexzf;
                                    ClassLoader classLoader = C2843feyxiexzfUjhhgtg.class.getClassLoader();
                                    try {
                                        cls = Class.forName(str.replace('/', '.'), false, classLoader);
                                        try {
                                            cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                                            if (cls.isAssignableFrom(cls2)) {
                                                strReplace = str;
                                            } else if (cls2.isAssignableFrom(cls)) {
                                                strReplace = str2;
                                            } else if (!cls.isInterface() && !cls2.isInterface()) {
                                                do {
                                                    cls = cls.getSuperclass();
                                                } while (!cls.isAssignableFrom(cls2));
                                                strReplace = cls.getName().replace('.', '/');
                                            }
                                            int iM3362Ujhhgtgfeyxiexzf2 = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(strReplace);
                                            C2061Ujhhgtgfeyxiexzf c2061Ujhhgtgfeyxiexzf = new C2061Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6788Ujhhgtgfeyxiexzf, Opcodes.IXOR, j, i10);
                                            c2062Ujhhgtgfeyxiexzf.m3364Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf);
                                            c2061Ujhhgtgfeyxiexzf.f6779Ujhhgtgfeyxiexzf = iM3362Ujhhgtgfeyxiexzf2;
                                            i11 = iM3362Ujhhgtgfeyxiexzf2;
                                            break;
                                        } catch (Exception e) {
                                            throw new TypeNotPresentException(str2, e);
                                        }
                                    } catch (Exception e2) {
                                        throw new TypeNotPresentException(str, e2);
                                    }
                                }
                                if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6774Ujhhgtgfeyxiexzf != 130 && c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6780Ujhhgtgfeyxiexzf == i10 && c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6778Ujhhgtgfeyxiexzf == j) {
                                    i11 = c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6779Ujhhgtgfeyxiexzf;
                                    break;
                                }
                                c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6781Ujhhgtgfeyxiexzf;
                            }
                            i4 = i14 | i11;
                        } else {
                            iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                            iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM3362Ujhhgtgfeyxiexzf;
                        }
                    }
                } else if (i13 == 16777221) {
                    if ((i12 & (-268435456)) == 0 && (i12 & 251658240) != 33554432) {
                        i12 = 16777216;
                    }
                    i4 = i12;
                }
                if (i4 != i13) {
                    iArr[i2] = i4;
                    return true;
                }
            } else if (i13 != 16777221) {
                i12 = 16777221;
                if (i13 == 0) {
                    iArr[i2] = i12;
                    return true;
                }
                i3 = i13 & (-268435456);
                i4 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                if (i3 == 0) {
                    if (i12 != 16777221) {
                        i5 = i12 & (-16777216);
                        i6 = (-16777216) & i13;
                        strReplace = ASMUtils.TYPE_OBJECT;
                        if (i5 != i6) {
                            i7 = i12 & (-268435456);
                            if (i7 == 0) {
                            }
                            if (i7 != 0) {
                                i7 -= 268435456;
                            }
                            if (i3 != 0) {
                                i3 -= 268435456;
                            }
                            iMin = Math.min(i7, i3) | 33554432;
                            iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM3362Ujhhgtgfeyxiexzf;
                        } else if ((i13 & 251658240) == 33554432) {
                            int i15 = (i12 & (-268435456)) | 33554432;
                            i8 = i12 & 1048575;
                            i9 = 1048575 & i13;
                            j = ((long) i8) | (((long) i9) << 32);
                            i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                            c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3363Ujhhgtgfeyxiexzf(i10);
                            while (true) {
                                if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf == null) {
                                    C2061Ujhhgtgfeyxiexzf[] c2061UjhhgtgfeyxiexzfArr2 = c2062Ujhhgtgfeyxiexzf.f6789Ujhhgtgfeyxiexzf;
                                    str = c2061UjhhgtgfeyxiexzfArr2[i8].f6777Ujhhgtgfeyxiexzf;
                                    str2 = c2061UjhhgtgfeyxiexzfArr2[i9].f6777Ujhhgtgfeyxiexzf;
                                    ClassLoader classLoader2 = C2843feyxiexzfUjhhgtg.class.getClassLoader();
                                    cls = Class.forName(str.replace('/', '.'), false, classLoader2);
                                    cls2 = Class.forName(str2.replace('/', '.'), false, classLoader2);
                                    if (cls.isAssignableFrom(cls2)) {
                                        strReplace = str;
                                    } else if (cls2.isAssignableFrom(cls)) {
                                        strReplace = str2;
                                    } else if (!cls.isInterface()) {
                                        do {
                                            cls = cls.getSuperclass();
                                        } while (!cls.isAssignableFrom(cls2));
                                        strReplace = cls.getName().replace('.', '/');
                                    }
                                    int iM3362Ujhhgtgfeyxiexzf3 = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(strReplace);
                                    C2061Ujhhgtgfeyxiexzf c2061Ujhhgtgfeyxiexzf2 = new C2061Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6788Ujhhgtgfeyxiexzf, Opcodes.IXOR, j, i10);
                                    c2062Ujhhgtgfeyxiexzf.m3364Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf2);
                                    c2061Ujhhgtgfeyxiexzf2.f6779Ujhhgtgfeyxiexzf = iM3362Ujhhgtgfeyxiexzf3;
                                    i11 = iM3362Ujhhgtgfeyxiexzf3;
                                    break;
                                }
                                if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6774Ujhhgtgfeyxiexzf != 130) {
                                }
                                c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6781Ujhhgtgfeyxiexzf;
                            }
                            i4 = i15 | i11;
                        } else {
                            iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                            iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM3362Ujhhgtgfeyxiexzf;
                        }
                        if (i4 != i13) {
                            iArr[i2] = i4;
                            return true;
                        }
                    }
                } else if (i12 != 16777221) {
                    i5 = i12 & (-16777216);
                    i6 = (-16777216) & i13;
                    strReplace = ASMUtils.TYPE_OBJECT;
                    if (i5 != i6) {
                        i7 = i12 & (-268435456);
                        if (i7 == 0) {
                        }
                        if (i7 != 0) {
                            i7 -= 268435456;
                        }
                        if (i3 != 0) {
                            i3 -= 268435456;
                        }
                        iMin = Math.min(i7, i3) | 33554432;
                        iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(ASMUtils.TYPE_OBJECT);
                        i4 = iMin | iM3362Ujhhgtgfeyxiexzf;
                    } else if ((i13 & 251658240) == 33554432) {
                        int i16 = (i12 & (-268435456)) | 33554432;
                        i8 = i12 & 1048575;
                        i9 = 1048575 & i13;
                        j = ((long) i8) | (((long) i9) << 32);
                        i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                        c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3363Ujhhgtgfeyxiexzf(i10);
                        while (true) {
                            if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf == null) {
                                C2061Ujhhgtgfeyxiexzf[] c2061UjhhgtgfeyxiexzfArr3 = c2062Ujhhgtgfeyxiexzf.f6789Ujhhgtgfeyxiexzf;
                                str = c2061UjhhgtgfeyxiexzfArr3[i8].f6777Ujhhgtgfeyxiexzf;
                                str2 = c2061UjhhgtgfeyxiexzfArr3[i9].f6777Ujhhgtgfeyxiexzf;
                                ClassLoader classLoader3 = C2843feyxiexzfUjhhgtg.class.getClassLoader();
                                cls = Class.forName(str.replace('/', '.'), false, classLoader3);
                                cls2 = Class.forName(str2.replace('/', '.'), false, classLoader3);
                                if (cls.isAssignableFrom(cls2)) {
                                    strReplace = str;
                                } else if (cls2.isAssignableFrom(cls)) {
                                    strReplace = str2;
                                } else if (!cls.isInterface()) {
                                    do {
                                        cls = cls.getSuperclass();
                                    } while (!cls.isAssignableFrom(cls2));
                                    strReplace = cls.getName().replace('.', '/');
                                }
                                int iM3362Ujhhgtgfeyxiexzf4 = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(strReplace);
                                C2061Ujhhgtgfeyxiexzf c2061Ujhhgtgfeyxiexzf3 = new C2061Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6788Ujhhgtgfeyxiexzf, Opcodes.IXOR, j, i10);
                                c2062Ujhhgtgfeyxiexzf.m3364Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf3);
                                c2061Ujhhgtgfeyxiexzf3.f6779Ujhhgtgfeyxiexzf = iM3362Ujhhgtgfeyxiexzf4;
                                i11 = iM3362Ujhhgtgfeyxiexzf4;
                                break;
                            }
                            if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6774Ujhhgtgfeyxiexzf != 130) {
                            }
                            c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6781Ujhhgtgfeyxiexzf;
                        }
                        i4 = i16 | i11;
                    } else {
                        iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                        iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(ASMUtils.TYPE_OBJECT);
                        i4 = iMin | iM3362Ujhhgtgfeyxiexzf;
                    }
                    if (i4 != i13) {
                        iArr[i2] = i4;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5092Ujhhgtgfeyxiexzf(C0299Ujhhgtgfeyxiexzf c0299Ujhhgtgfeyxiexzf) {
        int[] iArr = this.f11071Ujhhgtgfeyxiexzf;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 16777220 && i6 != 16777219) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 16777216) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.f11072Ujhhgtgfeyxiexzf;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 16777220 || i9 == 16777219) ? 2 : 1;
            i8++;
        }
        c0299Ujhhgtgfeyxiexzf.m1517Ujhhgtgfeyxiexzf(this.f11070Ujhhgtgfeyxiexzf.f1319Ujhhgtgfeyxiexzf, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 16777220 || i13 == 16777219) ? 2 : 1;
            c0299Ujhhgtgfeyxiexzf.f1781Ujhhgtgfeyxiexzf[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c0299Ujhhgtgfeyxiexzf.m1516Ujhhgtgfeyxiexzf();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 16777220 || i15 == 16777219) ? 2 : 1;
            c0299Ujhhgtgfeyxiexzf.f1781Ujhhgtgfeyxiexzf[i10] = i15;
            i10++;
            i8 = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02df  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:193:0x0365  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0370  */
    /* JADX WARN: Code duplicated, block: B:199:0x0377  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5093Ujhhgtgfeyxiexzf(int i, int i2, C2061Ujhhgtgfeyxiexzf c2061Ujhhgtgfeyxiexzf, C2062Ujhhgtgfeyxiexzf c2062Ujhhgtgfeyxiexzf) {
        int iM3361Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                return;
            case 1:
                m5099Ujhhgtgfeyxiexzf(16777221);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
                m5099Ujhhgtgfeyxiexzf(16777217);
                return;
            case 9:
            case 10:
                m5099Ujhhgtgfeyxiexzf(16777220);
                m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case 11:
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                m5099Ujhhgtgfeyxiexzf(16777218);
                return;
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                m5099Ujhhgtgfeyxiexzf(16777219);
                m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case Opcodes.LDC /* 18 */:
                int i3 = c2061Ujhhgtgfeyxiexzf.f6774Ujhhgtgfeyxiexzf;
                switch (i3) {
                    case 3:
                        m5099Ujhhgtgfeyxiexzf(16777217);
                        return;
                    case 4:
                        m5099Ujhhgtgfeyxiexzf(16777218);
                        return;
                    case 5:
                        m5099Ujhhgtgfeyxiexzf(16777220);
                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 6:
                        m5099Ujhhgtgfeyxiexzf(16777219);
                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 7:
                        m5099Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf("java/lang/Class") | 33554432);
                        return;
                    case 8:
                        m5099Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf("java/lang/String") | 33554432);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m5099Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf("java/lang/invoke/MethodHandle") | 33554432);
                                return;
                            case 16:
                                m5099Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf("java/lang/invoke/MethodType") | 33554432);
                                return;
                            case Opcodes.SIPUSH /* 17 */:
                                m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case Opcodes.ILOAD /* 21 */:
                        m5099Ujhhgtgfeyxiexzf(16777217);
                        return;
                    case Opcodes.LLOAD /* 22 */:
                        m5099Ujhhgtgfeyxiexzf(16777220);
                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case Opcodes.FLOAD /* 23 */:
                        m5099Ujhhgtgfeyxiexzf(16777218);
                        return;
                    case Opcodes.DLOAD /* 24 */:
                        m5099Ujhhgtgfeyxiexzf(16777219);
                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case Opcodes.ALOAD /* 25 */:
                        m5099Ujhhgtgfeyxiexzf(m5095Ujhhgtgfeyxiexzf(i2));
                        return;
                    default:
                        switch (i) {
                            case Opcodes.IALOAD /* 46 */:
                            case Opcodes.BALOAD /* 51 */:
                            case 52:
                            case Opcodes.SALOAD /* 53 */:
                                m5097Ujhhgtgfeyxiexzf(2);
                                m5099Ujhhgtgfeyxiexzf(16777217);
                                return;
                            case 47:
                                m5097Ujhhgtgfeyxiexzf(2);
                                m5099Ujhhgtgfeyxiexzf(16777220);
                                m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case 48:
                                m5097Ujhhgtgfeyxiexzf(2);
                                m5099Ujhhgtgfeyxiexzf(16777218);
                                return;
                            case 49:
                                m5097Ujhhgtgfeyxiexzf(2);
                                m5099Ujhhgtgfeyxiexzf(16777219);
                                m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case Opcodes.AALOAD /* 50 */:
                                m5097Ujhhgtgfeyxiexzf(1);
                                int iM5096Ujhhgtgfeyxiexzf = m5096Ujhhgtgfeyxiexzf();
                                if (iM5096Ujhhgtgfeyxiexzf != 16777221) {
                                    iM5096Ujhhgtgfeyxiexzf -= 268435456;
                                }
                                m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf);
                                return;
                            case Opcodes.ISTORE /* 54 */:
                            case Opcodes.FSTORE /* 56 */:
                            case Opcodes.ASTORE /* 58 */:
                                m5101Ujhhgtgfeyxiexzf(i2, m5096Ujhhgtgfeyxiexzf());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM5095Ujhhgtgfeyxiexzf = m5095Ujhhgtgfeyxiexzf(i4);
                                    if (iM5095Ujhhgtgfeyxiexzf == 16777220 || iM5095Ujhhgtgfeyxiexzf == 16777219) {
                                        m5101Ujhhgtgfeyxiexzf(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i5 = iM5095Ujhhgtgfeyxiexzf & 251658240;
                                    if (i5 == 67108864 || i5 == 83886080) {
                                        m5101Ujhhgtgfeyxiexzf(i4, iM5095Ujhhgtgfeyxiexzf | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case Opcodes.LSTORE /* 55 */:
                            case Opcodes.DSTORE /* 57 */:
                                m5097Ujhhgtgfeyxiexzf(1);
                                m5101Ujhhgtgfeyxiexzf(i2, m5096Ujhhgtgfeyxiexzf());
                                m5101Ujhhgtgfeyxiexzf(i2 + 1, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM5095Ujhhgtgfeyxiexzf2 = m5095Ujhhgtgfeyxiexzf(i6);
                                    if (iM5095Ujhhgtgfeyxiexzf2 == 16777220 || iM5095Ujhhgtgfeyxiexzf2 == 16777219) {
                                        m5101Ujhhgtgfeyxiexzf(i6, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i7 = iM5095Ujhhgtgfeyxiexzf2 & 251658240;
                                    if (i7 == 67108864 || i7 == 83886080) {
                                        m5101Ujhhgtgfeyxiexzf(i6, iM5095Ujhhgtgfeyxiexzf2 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case Opcodes.IASTORE /* 79 */:
                                    case 81:
                                    case Opcodes.AASTORE /* 83 */:
                                    case Opcodes.BASTORE /* 84 */:
                                    case Opcodes.CASTORE /* 85 */:
                                    case 86:
                                        m5097Ujhhgtgfeyxiexzf(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m5097Ujhhgtgfeyxiexzf(4);
                                        return;
                                    case Opcodes.POP /* 87 */:
                                    case Opcodes.IFEQ /* 153 */:
                                    case Opcodes.IFNE /* 154 */:
                                    case Opcodes.IFLT /* 155 */:
                                    case Opcodes.IFGE /* 156 */:
                                    case Opcodes.IFGT /* 157 */:
                                    case Opcodes.IFLE /* 158 */:
                                    case Opcodes.TABLESWITCH /* 170 */:
                                    case Opcodes.LOOKUPSWITCH /* 171 */:
                                    case Opcodes.IRETURN /* 172 */:
                                    case Opcodes.FRETURN /* 174 */:
                                    case Opcodes.ARETURN /* 176 */:
                                    case Opcodes.ATHROW /* 191 */:
                                    case Opcodes.MONITORENTER /* 194 */:
                                    case Opcodes.MONITOREXIT /* 195 */:
                                        break;
                                    case Opcodes.POP2 /* 88 */:
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case Opcodes.IF_ICMPNE /* 160 */:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                    case Opcodes.LRETURN /* 173 */:
                                    case Opcodes.DRETURN /* 175 */:
                                        m5097Ujhhgtgfeyxiexzf(2);
                                        return;
                                    case Opcodes.DUP /* 89 */:
                                        int iM5096Ujhhgtgfeyxiexzf2 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf2);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf2);
                                        return;
                                    case 90:
                                        int iM5096Ujhhgtgfeyxiexzf3 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf4 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf3);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf4);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf3);
                                        return;
                                    case 91:
                                        int iM5096Ujhhgtgfeyxiexzf5 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf6 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf7 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf5);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf7);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf6);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf5);
                                        return;
                                    case Opcodes.DUP2 /* 92 */:
                                        int iM5096Ujhhgtgfeyxiexzf8 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf9 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf9);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf8);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf9);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf8);
                                        return;
                                    case 93:
                                        int iM5096Ujhhgtgfeyxiexzf10 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf11 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf12 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf11);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf10);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf12);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf11);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf10);
                                        return;
                                    case 94:
                                        int iM5096Ujhhgtgfeyxiexzf13 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf14 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf15 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf16 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf14);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf13);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf16);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf15);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf14);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf13);
                                        return;
                                    case Opcodes.SWAP /* 95 */:
                                        int iM5096Ujhhgtgfeyxiexzf17 = m5096Ujhhgtgfeyxiexzf();
                                        int iM5096Ujhhgtgfeyxiexzf18 = m5096Ujhhgtgfeyxiexzf();
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf17);
                                        m5099Ujhhgtgfeyxiexzf(iM5096Ujhhgtgfeyxiexzf18);
                                        return;
                                    case Opcodes.IADD /* 96 */:
                                    case 100:
                                    case 104:
                                    case Opcodes.IDIV /* 108 */:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case Opcodes.IUSHR /* 124 */:
                                    case 126:
                                    case 128:
                                    case Opcodes.IXOR /* 130 */:
                                    case Opcodes.L2I /* 136 */:
                                    case Opcodes.D2I /* 142 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case Opcodes.FCMPG /* 150 */:
                                        m5097Ujhhgtgfeyxiexzf(2);
                                        m5099Ujhhgtgfeyxiexzf(16777217);
                                        return;
                                    case Opcodes.LADD /* 97 */:
                                    case 101:
                                    case 105:
                                    case Opcodes.LDIV /* 109 */:
                                    case 113:
                                    case 127:
                                    case Opcodes.LOR /* 129 */:
                                    case Opcodes.LXOR /* 131 */:
                                        m5097Ujhhgtgfeyxiexzf(4);
                                        m5099Ujhhgtgfeyxiexzf(16777220);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                    case 137:
                                    case 144:
                                        m5097Ujhhgtgfeyxiexzf(2);
                                        m5099Ujhhgtgfeyxiexzf(16777218);
                                        return;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m5097Ujhhgtgfeyxiexzf(4);
                                        m5099Ujhhgtgfeyxiexzf(16777219);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.INEG /* 116 */:
                                    case Opcodes.LNEG /* 117 */:
                                    case Opcodes.FNEG /* 118 */:
                                    case Opcodes.DNEG /* 119 */:
                                    case Opcodes.I2B /* 145 */:
                                    case Opcodes.I2C /* 146 */:
                                    case Opcodes.I2S /* 147 */:
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RETURN /* 177 */:
                                        return;
                                    case 121:
                                    case Opcodes.LSHR /* 123 */:
                                    case Opcodes.LUSHR /* 125 */:
                                        m5097Ujhhgtgfeyxiexzf(3);
                                        m5099Ujhhgtgfeyxiexzf(16777220);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.IINC /* 132 */:
                                        m5101Ujhhgtgfeyxiexzf(i2, 16777217);
                                        return;
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.F2L /* 140 */:
                                        m5097Ujhhgtgfeyxiexzf(1);
                                        m5099Ujhhgtgfeyxiexzf(16777220);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.I2F /* 134 */:
                                        m5097Ujhhgtgfeyxiexzf(1);
                                        m5099Ujhhgtgfeyxiexzf(16777218);
                                        return;
                                    case Opcodes.I2D /* 135 */:
                                    case 141:
                                        m5097Ujhhgtgfeyxiexzf(1);
                                        m5099Ujhhgtgfeyxiexzf(16777219);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 138:
                                        m5097Ujhhgtgfeyxiexzf(2);
                                        m5099Ujhhgtgfeyxiexzf(16777219);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.F2I /* 139 */:
                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        m5097Ujhhgtgfeyxiexzf(1);
                                        m5099Ujhhgtgfeyxiexzf(16777217);
                                        return;
                                    case Opcodes.D2L /* 143 */:
                                        m5097Ujhhgtgfeyxiexzf(2);
                                        m5099Ujhhgtgfeyxiexzf(16777220);
                                        m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        m5097Ujhhgtgfeyxiexzf(4);
                                        m5099Ujhhgtgfeyxiexzf(16777217);
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                    case Opcodes.RET /* 169 */:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case Opcodes.GETSTATIC /* 178 */:
                                        m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        return;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        m5098Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        return;
                                    case Opcodes.GETFIELD /* 180 */:
                                        m5097Ujhhgtgfeyxiexzf(1);
                                        m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        return;
                                    case Opcodes.PUTFIELD /* 181 */:
                                        m5098Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        m5096Ujhhgtgfeyxiexzf();
                                        return;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        m5098Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        if (i != 184) {
                                            int iM5096Ujhhgtgfeyxiexzf19 = m5096Ujhhgtgfeyxiexzf();
                                            if (i == 183 && c2061Ujhhgtgfeyxiexzf.f6776Ujhhgtgfeyxiexzf.charAt(0) == '<') {
                                                if (this.f11078Ujhhgtgfeyxiexzf == null) {
                                                    this.f11078Ujhhgtgfeyxiexzf = new int[2];
                                                }
                                                int length = this.f11078Ujhhgtgfeyxiexzf.length;
                                                int i8 = this.f11077Ujhhgtgfeyxiexzf;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f11078Ujhhgtgfeyxiexzf, 0, iArr, 0, length);
                                                    this.f11078Ujhhgtgfeyxiexzf = iArr;
                                                }
                                                int[] iArr2 = this.f11078Ujhhgtgfeyxiexzf;
                                                int i9 = this.f11077Ujhhgtgfeyxiexzf;
                                                this.f11077Ujhhgtgfeyxiexzf = i9 + 1;
                                                iArr2[i9] = iM5096Ujhhgtgfeyxiexzf19;
                                            }
                                        }
                                        m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        return;
                                    case 186:
                                        m5098Ujhhgtgfeyxiexzf(c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                        return;
                                    case Opcodes.NEW /* 187 */:
                                        String str = c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf;
                                        c2062Ujhhgtgfeyxiexzf.getClass();
                                        int iHashCode = (str.hashCode() + Opcodes.LOR + i2) & Integer.MAX_VALUE;
                                        for (C2061Ujhhgtgfeyxiexzf c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3363Ujhhgtgfeyxiexzf(iHashCode); c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf != null; c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf = c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6781Ujhhgtgfeyxiexzf) {
                                            if (c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6774Ujhhgtgfeyxiexzf == 129 && c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6780Ujhhgtgfeyxiexzf == iHashCode && c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6778Ujhhgtgfeyxiexzf == i2 && c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf.equals(str)) {
                                                iM3361Ujhhgtgfeyxiexzf = c2061UjhhgtgfeyxiexzfM3363Ujhhgtgfeyxiexzf.f6773Ujhhgtgfeyxiexzf;
                                                m5099Ujhhgtgfeyxiexzf(iM3361Ujhhgtgfeyxiexzf | 50331648);
                                                return;
                                            }
                                        }
                                        iM3361Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3361Ujhhgtgfeyxiexzf(new C2061Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6788Ujhhgtgfeyxiexzf, iHashCode, i2, str));
                                        m5099Ujhhgtgfeyxiexzf(iM3361Ujhhgtgfeyxiexzf | 50331648);
                                        return;
                                    case Opcodes.NEWARRAY /* 188 */:
                                        m5096Ujhhgtgfeyxiexzf();
                                        switch (i2) {
                                            case 4:
                                                m5099Ujhhgtgfeyxiexzf(285212681);
                                                return;
                                            case 5:
                                                m5099Ujhhgtgfeyxiexzf(285212683);
                                                return;
                                            case 6:
                                                m5099Ujhhgtgfeyxiexzf(285212674);
                                                return;
                                            case 7:
                                                m5099Ujhhgtgfeyxiexzf(285212675);
                                                return;
                                            case 8:
                                                m5099Ujhhgtgfeyxiexzf(285212682);
                                                return;
                                            case 9:
                                                m5099Ujhhgtgfeyxiexzf(285212684);
                                                return;
                                            case 10:
                                                m5099Ujhhgtgfeyxiexzf(285212673);
                                                return;
                                            case 11:
                                                m5099Ujhhgtgfeyxiexzf(285212676);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case Opcodes.ANEWARRAY /* 189 */:
                                        String str2 = c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf;
                                        m5096Ujhhgtgfeyxiexzf();
                                        if (str2.charAt(0) == '[') {
                                            m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, "[".concat(str2));
                                            return;
                                        } else {
                                            m5099Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(str2) | 301989888);
                                            return;
                                        }
                                    case Opcodes.CHECKCAST /* 192 */:
                                        String str3 = c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf;
                                        m5096Ujhhgtgfeyxiexzf();
                                        if (str3.charAt(0) == '[') {
                                            m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, str3);
                                            return;
                                        } else {
                                            m5099Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(str3) | 33554432);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m5097Ujhhgtgfeyxiexzf(i2);
                                                m5100Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, c2061Ujhhgtgfeyxiexzf.f6777Ujhhgtgfeyxiexzf);
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m5097Ujhhgtgfeyxiexzf(1);
                                return;
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int m5094Ujhhgtgfeyxiexzf(C2062Ujhhgtgfeyxiexzf c2062Ujhhgtgfeyxiexzf, int i) {
        int i2;
        int iM3362Ujhhgtgfeyxiexzf;
        if (i == 16777222 || ((-16777216) & i) == 50331648) {
            for (int i3 = 0; i3 < this.f11077Ujhhgtgfeyxiexzf; i3++) {
                int i4 = this.f11078Ujhhgtgfeyxiexzf[i3];
                int i5 = (-268435456) & i4;
                int i6 = 251658240 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 67108864) {
                    i2 = this.f11071Ujhhgtgfeyxiexzf[i7];
                } else {
                    if (i6 == 83886080) {
                        int[] iArr = this.f11072Ujhhgtgfeyxiexzf;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == 16777222) {
                            iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6783Ujhhgtgfeyxiexzf);
                        } else {
                            iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6789Ujhhgtgfeyxiexzf[i & 1048575].f6777Ujhhgtgfeyxiexzf);
                        }
                        return iM3362Ujhhgtgfeyxiexzf | 33554432;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == 16777222) {
                        iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6783Ujhhgtgfeyxiexzf);
                    } else {
                        iM3362Ujhhgtgfeyxiexzf = c2062Ujhhgtgfeyxiexzf.m3362Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf.f6789Ujhhgtgfeyxiexzf[i & 1048575].f6777Ujhhgtgfeyxiexzf);
                    }
                    return iM3362Ujhhgtgfeyxiexzf | 33554432;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m5095Ujhhgtgfeyxiexzf(int i) {
        int[] iArr = this.f11073Ujhhgtgfeyxiexzf;
        if (iArr == null || i >= iArr.length) {
            return i | 67108864;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 67108864 | i;
        iArr[i] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int m5096Ujhhgtgfeyxiexzf() {
        short s = this.f11076Ujhhgtgfeyxiexzf;
        if (s <= 0) {
            short s2 = (short) (this.f11075Ujhhgtgfeyxiexzf - 1);
            this.f11075Ujhhgtgfeyxiexzf = s2;
            return (-s2) | 83886080;
        }
        int[] iArr = this.f11074Ujhhgtgfeyxiexzf;
        short s3 = (short) (s - 1);
        this.f11076Ujhhgtgfeyxiexzf = s3;
        return iArr[s3];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m5097Ujhhgtgfeyxiexzf(int i) {
        short s = this.f11076Ujhhgtgfeyxiexzf;
        if (s >= i) {
            this.f11076Ujhhgtgfeyxiexzf = (short) (s - i);
        } else {
            this.f11075Ujhhgtgfeyxiexzf = (short) (this.f11075Ujhhgtgfeyxiexzf - (i - s));
            this.f11076Ujhhgtgfeyxiexzf = (short) 0;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m5098Ujhhgtgfeyxiexzf(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m5097Ujhhgtgfeyxiexzf((C1792Ujhhgtgfeyxiexzf.m3170Ujhhgtgfeyxiexzf(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m5097Ujhhgtgfeyxiexzf(2);
        } else {
            m5097Ujhhgtgfeyxiexzf(1);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5099Ujhhgtgfeyxiexzf(int i) {
        if (this.f11074Ujhhgtgfeyxiexzf == null) {
            this.f11074Ujhhgtgfeyxiexzf = new int[10];
        }
        int length = this.f11074Ujhhgtgfeyxiexzf.length;
        short s = this.f11076Ujhhgtgfeyxiexzf;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f11074Ujhhgtgfeyxiexzf, 0, iArr, 0, length);
            this.f11074Ujhhgtgfeyxiexzf = iArr;
        }
        int[] iArr2 = this.f11074Ujhhgtgfeyxiexzf;
        short s2 = this.f11076Ujhhgtgfeyxiexzf;
        short s3 = (short) (s2 + 1);
        this.f11076Ujhhgtgfeyxiexzf = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f11075Ujhhgtgfeyxiexzf + s3);
        C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf = this.f11070Ujhhgtgfeyxiexzf;
        if (s4 > c0154Ujhhgtgfeyxiexzf.f1323Ujhhgtgfeyxiexzf) {
            c0154Ujhhgtgfeyxiexzf.f1323Ujhhgtgfeyxiexzf = s4;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m5100Ujhhgtgfeyxiexzf(C2062Ujhhgtgfeyxiexzf c2062Ujhhgtgfeyxiexzf, String str) {
        int iM5090Ujhhgtgfeyxiexzf = m5090Ujhhgtgfeyxiexzf(c2062Ujhhgtgfeyxiexzf, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (iM5090Ujhhgtgfeyxiexzf != 0) {
            m5099Ujhhgtgfeyxiexzf(iM5090Ujhhgtgfeyxiexzf);
            if (iM5090Ujhhgtgfeyxiexzf == 16777220 || iM5090Ujhhgtgfeyxiexzf == 16777219) {
                m5099Ujhhgtgfeyxiexzf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5101Ujhhgtgfeyxiexzf(int i, int i2) {
        if (this.f11073Ujhhgtgfeyxiexzf == null) {
            this.f11073Ujhhgtgfeyxiexzf = new int[10];
        }
        int length = this.f11073Ujhhgtgfeyxiexzf.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f11073Ujhhgtgfeyxiexzf, 0, iArr, 0, length);
            this.f11073Ujhhgtgfeyxiexzf = iArr;
        }
        this.f11073Ujhhgtgfeyxiexzf[i] = i2;
    }
}
