package p000;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲇᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1420 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1774 f5114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int[] f5115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int[] f5116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int[] f5117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int[] f5118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public short f5119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public short f5120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f5121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int[] f5122;

    public C1420(C1774 c1774) {
        this.f5114 = c1774;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m3229(C2930 c2930, String str, int i) {
        char cCharAt = str.charAt(i);
        int iM4935 = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return c2930.m4935(str.substring(i + 1, str.length() - 1)) | 33554432;
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
                                iM4935 = c2930.m4935(str.substring(i2 + 1, str.length() - 1)) | 33554432;
                            } else if (cCharAt2 == 'S') {
                                iM4935 = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iM4935 = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iM4935 = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iM4935 = 16777226;
                                        break;
                                    case 'C':
                                        iM4935 = 16777227;
                                        break;
                                    case 'D':
                                        iM4935 = 16777219;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iM4935 = 16777220;
                            }
                        }
                        return ((i2 - i) << 28) | iM4935;
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m3230(C2930 c2930, int i, int[] iArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        String strReplace;
        int i7;
        int iMin;
        int iM4935;
        int i8;
        int i9;
        long j;
        int i10;
        C2929 c2929M4936;
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
                                iM4935 = c2930.m4935(ASMUtils.TYPE_OBJECT);
                                i4 = iMin | iM4935;
                            }
                        } else if ((i13 & 251658240) == 33554432) {
                            int i14 = (i12 & (-268435456)) | 33554432;
                            i8 = i12 & 1048575;
                            i9 = 1048575 & i13;
                            j = ((long) i8) | (((long) i9) << 32);
                            i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                            c2929M4936 = c2930.m4936(i10);
                            while (true) {
                                if (c2929M4936 == null) {
                                    C2929[] c2929Arr = c2930.f9377;
                                    str = c2929Arr[i8].f9365;
                                    str2 = c2929Arr[i9].f9365;
                                    ClassLoader classLoader = C0706.class.getClassLoader();
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
                                            int iM4936 = c2930.m4935(strReplace);
                                            C2929 c2929 = new C2929(c2930.f9376, Opcodes.IXOR, j, i10);
                                            c2930.m4937(c2929);
                                            c2929.f9367 = iM4936;
                                            i11 = iM4936;
                                            break;
                                        } catch (Exception e) {
                                            throw new TypeNotPresentException(str2, e);
                                        }
                                    } catch (Exception e2) {
                                        throw new TypeNotPresentException(str, e2);
                                    }
                                }
                                if (c2929M4936.f9362 != 130 && c2929M4936.f9368 == i10 && c2929M4936.f9366 == j) {
                                    i11 = c2929M4936.f9367;
                                    break;
                                }
                                c2929M4936 = c2929M4936.f9369;
                            }
                            i4 = i14 | i11;
                        } else {
                            iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                            iM4935 = c2930.m4935(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM4935;
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
                            iM4935 = c2930.m4935(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM4935;
                        } else if ((i13 & 251658240) == 33554432) {
                            int i15 = (i12 & (-268435456)) | 33554432;
                            i8 = i12 & 1048575;
                            i9 = 1048575 & i13;
                            j = ((long) i8) | (((long) i9) << 32);
                            i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                            c2929M4936 = c2930.m4936(i10);
                            while (true) {
                                if (c2929M4936 == null) {
                                    C2929[] c2929Arr2 = c2930.f9377;
                                    str = c2929Arr2[i8].f9365;
                                    str2 = c2929Arr2[i9].f9365;
                                    ClassLoader classLoader2 = C0706.class.getClassLoader();
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
                                    int iM4937 = c2930.m4935(strReplace);
                                    C2929 c29210 = new C2929(c2930.f9376, Opcodes.IXOR, j, i10);
                                    c2930.m4937(c29210);
                                    c29210.f9367 = iM4937;
                                    i11 = iM4937;
                                    break;
                                }
                                if (c2929M4936.f9362 != 130) {
                                }
                                c2929M4936 = c2929M4936.f9369;
                            }
                            i4 = i15 | i11;
                        } else {
                            iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                            iM4935 = c2930.m4935(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM4935;
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
                        iM4935 = c2930.m4935(ASMUtils.TYPE_OBJECT);
                        i4 = iMin | iM4935;
                    } else if ((i13 & 251658240) == 33554432) {
                        int i16 = (i12 & (-268435456)) | 33554432;
                        i8 = i12 & 1048575;
                        i9 = 1048575 & i13;
                        j = ((long) i8) | (((long) i9) << 32);
                        i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                        c2929M4936 = c2930.m4936(i10);
                        while (true) {
                            if (c2929M4936 == null) {
                                C2929[] c2929Arr3 = c2930.f9377;
                                str = c2929Arr3[i8].f9365;
                                str2 = c2929Arr3[i9].f9365;
                                ClassLoader classLoader3 = C0706.class.getClassLoader();
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
                                int iM4938 = c2930.m4935(strReplace);
                                C2929 c29211 = new C2929(c2930.f9376, Opcodes.IXOR, j, i10);
                                c2930.m4937(c29211);
                                c29211.f9367 = iM4938;
                                i11 = iM4938;
                                break;
                            }
                            if (c2929M4936.f9362 != 130) {
                            }
                            c2929M4936 = c2929M4936.f9369;
                        }
                        i4 = i16 | i11;
                    } else {
                        iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                        iM4935 = c2930.m4935(ASMUtils.TYPE_OBJECT);
                        i4 = iMin | iM4935;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3231(C2014 c2014) {
        int[] iArr = this.f5115;
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
        int[] iArr2 = this.f5116;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 16777220 || i9 == 16777219) ? 2 : 1;
            i8++;
        }
        c2014.m4032(this.f5114.f5914, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 16777220 || i13 == 16777219) ? 2 : 1;
            c2014.f6695[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c2014.m4031();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 16777220 || i15 == 16777219) ? 2 : 1;
            c2014.f6695[i10] = i15;
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3232(int i, int i2, C2929 c2929, C2930 c2930) {
        int iM4934;
        switch (i) {
            case 0:
                return;
            case 1:
                m3238(16777221);
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
                m3238(16777217);
                return;
            case 9:
            case 10:
                m3238(16777220);
                m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case 11:
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                m3238(16777218);
                return;
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                m3238(16777219);
                m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case Opcodes.LDC /* 18 */:
                int i3 = c2929.f9362;
                switch (i3) {
                    case 3:
                        m3238(16777217);
                        return;
                    case 4:
                        m3238(16777218);
                        return;
                    case 5:
                        m3238(16777220);
                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 6:
                        m3238(16777219);
                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 7:
                        m3238(c2930.m4935("java/lang/Class") | 33554432);
                        return;
                    case 8:
                        m3238(c2930.m4935("java/lang/String") | 33554432);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m3238(c2930.m4935("java/lang/invoke/MethodHandle") | 33554432);
                                return;
                            case 16:
                                m3238(c2930.m4935("java/lang/invoke/MethodType") | 33554432);
                                return;
                            case Opcodes.SIPUSH /* 17 */:
                                m3239(c2930, c2929.f9365);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case Opcodes.ILOAD /* 21 */:
                        m3238(16777217);
                        return;
                    case Opcodes.LLOAD /* 22 */:
                        m3238(16777220);
                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case Opcodes.FLOAD /* 23 */:
                        m3238(16777218);
                        return;
                    case Opcodes.DLOAD /* 24 */:
                        m3238(16777219);
                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case Opcodes.ALOAD /* 25 */:
                        m3238(m3234(i2));
                        return;
                    default:
                        switch (i) {
                            case Opcodes.IALOAD /* 46 */:
                            case Opcodes.BALOAD /* 51 */:
                            case 52:
                            case Opcodes.SALOAD /* 53 */:
                                m3236(2);
                                m3238(16777217);
                                return;
                            case 47:
                                m3236(2);
                                m3238(16777220);
                                m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case 48:
                                m3236(2);
                                m3238(16777218);
                                return;
                            case 49:
                                m3236(2);
                                m3238(16777219);
                                m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case Opcodes.AALOAD /* 50 */:
                                m3236(1);
                                int iM3235 = m3235();
                                if (iM3235 != 16777221) {
                                    iM3235 -= 268435456;
                                }
                                m3238(iM3235);
                                return;
                            case Opcodes.ISTORE /* 54 */:
                            case Opcodes.FSTORE /* 56 */:
                            case Opcodes.ASTORE /* 58 */:
                                m3240(i2, m3235());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM3234 = m3234(i4);
                                    if (iM3234 == 16777220 || iM3234 == 16777219) {
                                        m3240(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i5 = iM3234 & 251658240;
                                    if (i5 == 67108864 || i5 == 83886080) {
                                        m3240(i4, iM3234 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case Opcodes.LSTORE /* 55 */:
                            case Opcodes.DSTORE /* 57 */:
                                m3236(1);
                                m3240(i2, m3235());
                                m3240(i2 + 1, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM3236 = m3234(i6);
                                    if (iM3236 == 16777220 || iM3236 == 16777219) {
                                        m3240(i6, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i7 = iM3236 & 251658240;
                                    if (i7 == 67108864 || i7 == 83886080) {
                                        m3240(i6, iM3236 | 1048576);
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
                                        m3236(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m3236(4);
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
                                        m3236(2);
                                        return;
                                    case Opcodes.DUP /* 89 */:
                                        int iM3237 = m3235();
                                        m3238(iM3237);
                                        m3238(iM3237);
                                        return;
                                    case 90:
                                        int iM3238 = m3235();
                                        int iM3239 = m3235();
                                        m3238(iM3238);
                                        m3238(iM3239);
                                        m3238(iM3238);
                                        return;
                                    case 91:
                                        int iM32310 = m3235();
                                        int iM32311 = m3235();
                                        int iM32312 = m3235();
                                        m3238(iM32310);
                                        m3238(iM32312);
                                        m3238(iM32311);
                                        m3238(iM32310);
                                        return;
                                    case Opcodes.DUP2 /* 92 */:
                                        int iM32313 = m3235();
                                        int iM32314 = m3235();
                                        m3238(iM32314);
                                        m3238(iM32313);
                                        m3238(iM32314);
                                        m3238(iM32313);
                                        return;
                                    case 93:
                                        int iM32315 = m3235();
                                        int iM32316 = m3235();
                                        int iM32317 = m3235();
                                        m3238(iM32316);
                                        m3238(iM32315);
                                        m3238(iM32317);
                                        m3238(iM32316);
                                        m3238(iM32315);
                                        return;
                                    case 94:
                                        int iM32318 = m3235();
                                        int iM32319 = m3235();
                                        int iM32320 = m3235();
                                        int iM32321 = m3235();
                                        m3238(iM32319);
                                        m3238(iM32318);
                                        m3238(iM32321);
                                        m3238(iM32320);
                                        m3238(iM32319);
                                        m3238(iM32318);
                                        return;
                                    case Opcodes.SWAP /* 95 */:
                                        int iM32322 = m3235();
                                        int iM32323 = m3235();
                                        m3238(iM32322);
                                        m3238(iM32323);
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
                                        m3236(2);
                                        m3238(16777217);
                                        return;
                                    case Opcodes.LADD /* 97 */:
                                    case 101:
                                    case 105:
                                    case Opcodes.LDIV /* 109 */:
                                    case 113:
                                    case 127:
                                    case Opcodes.LOR /* 129 */:
                                    case Opcodes.LXOR /* 131 */:
                                        m3236(4);
                                        m3238(16777220);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                    case 137:
                                    case 144:
                                        m3236(2);
                                        m3238(16777218);
                                        return;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m3236(4);
                                        m3238(16777219);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
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
                                        m3236(3);
                                        m3238(16777220);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.IINC /* 132 */:
                                        m3240(i2, 16777217);
                                        return;
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.F2L /* 140 */:
                                        m3236(1);
                                        m3238(16777220);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.I2F /* 134 */:
                                        m3236(1);
                                        m3238(16777218);
                                        return;
                                    case Opcodes.I2D /* 135 */:
                                    case 141:
                                        m3236(1);
                                        m3238(16777219);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 138:
                                        m3236(2);
                                        m3238(16777219);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.F2I /* 139 */:
                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        m3236(1);
                                        m3238(16777217);
                                        return;
                                    case Opcodes.D2L /* 143 */:
                                        m3236(2);
                                        m3238(16777220);
                                        m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        m3236(4);
                                        m3238(16777217);
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                    case Opcodes.RET /* 169 */:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case Opcodes.GETSTATIC /* 178 */:
                                        m3239(c2930, c2929.f9365);
                                        return;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        m3237(c2929.f9365);
                                        return;
                                    case Opcodes.GETFIELD /* 180 */:
                                        m3236(1);
                                        m3239(c2930, c2929.f9365);
                                        return;
                                    case Opcodes.PUTFIELD /* 181 */:
                                        m3237(c2929.f9365);
                                        m3235();
                                        return;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        m3237(c2929.f9365);
                                        if (i != 184) {
                                            int iM32324 = m3235();
                                            if (i == 183 && c2929.f9364.charAt(0) == '<') {
                                                if (this.f5122 == null) {
                                                    this.f5122 = new int[2];
                                                }
                                                int length = this.f5122.length;
                                                int i8 = this.f5121;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f5122, 0, iArr, 0, length);
                                                    this.f5122 = iArr;
                                                }
                                                int[] iArr2 = this.f5122;
                                                int i9 = this.f5121;
                                                this.f5121 = i9 + 1;
                                                iArr2[i9] = iM32324;
                                            }
                                        }
                                        m3239(c2930, c2929.f9365);
                                        return;
                                    case 186:
                                        m3237(c2929.f9365);
                                        m3239(c2930, c2929.f9365);
                                        return;
                                    case Opcodes.NEW /* 187 */:
                                        String str = c2929.f9365;
                                        c2930.getClass();
                                        int iHashCode = (str.hashCode() + Opcodes.LOR + i2) & Integer.MAX_VALUE;
                                        for (C2929 c2929M4936 = c2930.m4936(iHashCode); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
                                            if (c2929M4936.f9362 == 129 && c2929M4936.f9368 == iHashCode && c2929M4936.f9366 == i2 && c2929M4936.f9365.equals(str)) {
                                                iM4934 = c2929M4936.f9361;
                                                m3238(iM4934 | 50331648);
                                                return;
                                            }
                                        }
                                        iM4934 = c2930.m4934(new C2929(c2930.f9376, iHashCode, i2, str));
                                        m3238(iM4934 | 50331648);
                                        return;
                                    case Opcodes.NEWARRAY /* 188 */:
                                        m3235();
                                        switch (i2) {
                                            case 4:
                                                m3238(285212681);
                                                return;
                                            case 5:
                                                m3238(285212683);
                                                return;
                                            case 6:
                                                m3238(285212674);
                                                return;
                                            case 7:
                                                m3238(285212675);
                                                return;
                                            case 8:
                                                m3238(285212682);
                                                return;
                                            case 9:
                                                m3238(285212684);
                                                return;
                                            case 10:
                                                m3238(285212673);
                                                return;
                                            case 11:
                                                m3238(285212676);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case Opcodes.ANEWARRAY /* 189 */:
                                        String str2 = c2929.f9365;
                                        m3235();
                                        if (str2.charAt(0) == '[') {
                                            m3239(c2930, "[".concat(str2));
                                            return;
                                        } else {
                                            m3238(c2930.m4935(str2) | 301989888);
                                            return;
                                        }
                                    case Opcodes.CHECKCAST /* 192 */:
                                        String str3 = c2929.f9365;
                                        m3235();
                                        if (str3.charAt(0) == '[') {
                                            m3239(c2930, str3);
                                            return;
                                        } else {
                                            m3238(c2930.m4935(str3) | 33554432);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m3236(i2);
                                                m3239(c2930, c2929.f9365);
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m3236(1);
                                return;
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m3233(C2930 c2930, int i) {
        int i2;
        int iM4935;
        if (i == 16777222 || ((-16777216) & i) == 50331648) {
            for (int i3 = 0; i3 < this.f5121; i3++) {
                int i4 = this.f5122[i3];
                int i5 = (-268435456) & i4;
                int i6 = 251658240 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 67108864) {
                    i2 = this.f5115[i7];
                } else {
                    if (i6 == 83886080) {
                        int[] iArr = this.f5116;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == 16777222) {
                            iM4935 = c2930.m4935(c2930.f9371);
                        } else {
                            iM4935 = c2930.m4935(c2930.f9377[i & 1048575].f9365);
                        }
                        return iM4935 | 33554432;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == 16777222) {
                        iM4935 = c2930.m4935(c2930.f9371);
                    } else {
                        iM4935 = c2930.m4935(c2930.f9377[i & 1048575].f9365);
                    }
                    return iM4935 | 33554432;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3234(int i) {
        int[] iArr = this.f5117;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m3235() {
        short s = this.f5120;
        if (s <= 0) {
            short s2 = (short) (this.f5119 - 1);
            this.f5119 = s2;
            return (-s2) | 83886080;
        }
        int[] iArr = this.f5118;
        short s3 = (short) (s - 1);
        this.f5120 = s3;
        return iArr[s3];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3236(int i) {
        short s = this.f5120;
        if (s >= i) {
            this.f5120 = (short) (s - i);
        } else {
            this.f5119 = (short) (this.f5119 - (i - s));
            this.f5120 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3237(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m3236((C3506.m5037(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m3236(2);
        } else {
            m3236(1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3238(int i) {
        if (this.f5118 == null) {
            this.f5118 = new int[10];
        }
        int length = this.f5118.length;
        short s = this.f5120;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f5118, 0, iArr, 0, length);
            this.f5118 = iArr;
        }
        int[] iArr2 = this.f5118;
        short s2 = this.f5120;
        short s3 = (short) (s2 + 1);
        this.f5120 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f5119 + s3);
        C1774 c1774 = this.f5114;
        if (s4 > c1774.f5918) {
            c1774.f5918 = s4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3239(C2930 c2930, String str) {
        int iM3229 = m3229(c2930, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (iM3229 != 0) {
            m3238(iM3229);
            if (iM3229 == 16777220 || iM3229 == 16777219) {
                m3238(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3240(int i, int i2) {
        if (this.f5117 == null) {
            this.f5117 = new int[10];
        }
        int length = this.f5117.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f5117, 0, iArr, 0, length);
            this.f5117 = iArr;
        }
        this.f5117[i] = i2;
    }
}
