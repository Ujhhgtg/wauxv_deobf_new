package p000;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲇᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1412 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1752 f5085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int[] f5086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int[] f5087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int[] f5088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int[] f5089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public short f5090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public short f5091;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f5092;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int[] f5093;

    public C1412(C1752 c1752) {
        this.f5085 = c1752;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m3121(C2870 c2870, String str, int i) {
        char cCharAt = str.charAt(i);
        int iM4874 = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return c2870.m4874(str.substring(i + 1, str.length() - 1)) | 33554432;
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
                                iM4874 = c2870.m4874(str.substring(i2 + 1, str.length() - 1)) | 33554432;
                            } else if (cCharAt2 == 'S') {
                                iM4874 = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iM4874 = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iM4874 = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iM4874 = 16777226;
                                        break;
                                    case 'C':
                                        iM4874 = 16777227;
                                        break;
                                    case 'D':
                                        iM4874 = 16777219;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iM4874 = 16777220;
                            }
                        }
                        return ((i2 - i) << 28) | iM4874;
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
    public static boolean m3122(C2870 c2870, int i, int[] iArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        String strReplace;
        int i7;
        int iMin;
        int iM4874;
        int i8;
        int i9;
        long j;
        int i10;
        C2869 c2869M4875;
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
                                iM4874 = c2870.m4874(ASMUtils.TYPE_OBJECT);
                                i4 = iMin | iM4874;
                            }
                        } else if ((i13 & 251658240) == 33554432) {
                            int i14 = (i12 & (-268435456)) | 33554432;
                            i8 = i12 & 1048575;
                            i9 = 1048575 & i13;
                            j = ((long) i8) | (((long) i9) << 32);
                            i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                            c2869M4875 = c2870.m4875(i10);
                            while (true) {
                                if (c2869M4875 == null) {
                                    C2869[] c2869Arr = c2870.f9207;
                                    str = c2869Arr[i8].f9195;
                                    str2 = c2869Arr[i9].f9195;
                                    ClassLoader classLoader = C0711.class.getClassLoader();
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
                                            int iM4875 = c2870.m4874(strReplace);
                                            C2869 c2869 = new C2869(c2870.f9206, Opcodes.IXOR, j, i10);
                                            c2870.m4876(c2869);
                                            c2869.f9197 = iM4875;
                                            i11 = iM4875;
                                            break;
                                        } catch (Exception e) {
                                            throw new TypeNotPresentException(str2, e);
                                        }
                                    } catch (Exception e2) {
                                        throw new TypeNotPresentException(str, e2);
                                    }
                                }
                                if (c2869M4875.f9192 != 130 && c2869M4875.f9198 == i10 && c2869M4875.f9196 == j) {
                                    i11 = c2869M4875.f9197;
                                    break;
                                }
                                c2869M4875 = c2869M4875.f9199;
                            }
                            i4 = i14 | i11;
                        } else {
                            iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                            iM4874 = c2870.m4874(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM4874;
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
                            iM4874 = c2870.m4874(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM4874;
                        } else if ((i13 & 251658240) == 33554432) {
                            int i15 = (i12 & (-268435456)) | 33554432;
                            i8 = i12 & 1048575;
                            i9 = 1048575 & i13;
                            j = ((long) i8) | (((long) i9) << 32);
                            i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                            c2869M4875 = c2870.m4875(i10);
                            while (true) {
                                if (c2869M4875 == null) {
                                    C2869[] c2869Arr2 = c2870.f9207;
                                    str = c2869Arr2[i8].f9195;
                                    str2 = c2869Arr2[i9].f9195;
                                    ClassLoader classLoader2 = C0711.class.getClassLoader();
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
                                    int iM4876 = c2870.m4874(strReplace);
                                    C2869 c28610 = new C2869(c2870.f9206, Opcodes.IXOR, j, i10);
                                    c2870.m4876(c28610);
                                    c28610.f9197 = iM4876;
                                    i11 = iM4876;
                                    break;
                                }
                                if (c2869M4875.f9192 != 130) {
                                }
                                c2869M4875 = c2869M4875.f9199;
                            }
                            i4 = i15 | i11;
                        } else {
                            iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                            iM4874 = c2870.m4874(ASMUtils.TYPE_OBJECT);
                            i4 = iMin | iM4874;
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
                        iM4874 = c2870.m4874(ASMUtils.TYPE_OBJECT);
                        i4 = iMin | iM4874;
                    } else if ((i13 & 251658240) == 33554432) {
                        int i16 = (i12 & (-268435456)) | 33554432;
                        i8 = i12 & 1048575;
                        i9 = 1048575 & i13;
                        j = ((long) i8) | (((long) i9) << 32);
                        i10 = (i8 + i9 + Opcodes.IXOR) & Integer.MAX_VALUE;
                        c2869M4875 = c2870.m4875(i10);
                        while (true) {
                            if (c2869M4875 == null) {
                                C2869[] c2869Arr3 = c2870.f9207;
                                str = c2869Arr3[i8].f9195;
                                str2 = c2869Arr3[i9].f9195;
                                ClassLoader classLoader3 = C0711.class.getClassLoader();
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
                                int iM4877 = c2870.m4874(strReplace);
                                C2869 c28611 = new C2869(c2870.f9206, Opcodes.IXOR, j, i10);
                                c2870.m4876(c28611);
                                c28611.f9197 = iM4877;
                                i11 = iM4877;
                                break;
                            }
                            if (c2869M4875.f9192 != 130) {
                            }
                            c2869M4875 = c2869M4875.f9199;
                        }
                        i4 = i16 | i11;
                    } else {
                        iMin = ((i12 & (-268435456)) - 268435456) | 33554432;
                        iM4874 = c2870.m4874(ASMUtils.TYPE_OBJECT);
                        i4 = iMin | iM4874;
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
    public final void m3123(C1983 c1983) {
        int[] iArr = this.f5086;
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
        int[] iArr2 = this.f5087;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 16777220 || i9 == 16777219) ? 2 : 1;
            i8++;
        }
        c1983.m3838(this.f5085.f5861, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 16777220 || i13 == 16777219) ? 2 : 1;
            c1983.f6590[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c1983.m3837();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 16777220 || i15 == 16777219) ? 2 : 1;
            c1983.f6590[i10] = i15;
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
    public final void m3124(int i, int i2, C2869 c2869, C2870 c2870) {
        int iM4873;
        switch (i) {
            case 0:
                return;
            case 1:
                m3130(16777221);
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
                m3130(16777217);
                return;
            case 9:
            case 10:
                m3130(16777220);
                m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case 11:
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                m3130(16777218);
                return;
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
                m3130(16777219);
                m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case Opcodes.LDC /* 18 */:
                int i3 = c2869.f9192;
                switch (i3) {
                    case 3:
                        m3130(16777217);
                        return;
                    case 4:
                        m3130(16777218);
                        return;
                    case 5:
                        m3130(16777220);
                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 6:
                        m3130(16777219);
                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 7:
                        m3130(c2870.m4874("java/lang/Class") | 33554432);
                        return;
                    case 8:
                        m3130(c2870.m4874("java/lang/String") | 33554432);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m3130(c2870.m4874("java/lang/invoke/MethodHandle") | 33554432);
                                return;
                            case 16:
                                m3130(c2870.m4874("java/lang/invoke/MethodType") | 33554432);
                                return;
                            case Opcodes.SIPUSH /* 17 */:
                                m3131(c2870, c2869.f9195);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case Opcodes.ILOAD /* 21 */:
                        m3130(16777217);
                        return;
                    case Opcodes.LLOAD /* 22 */:
                        m3130(16777220);
                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case Opcodes.FLOAD /* 23 */:
                        m3130(16777218);
                        return;
                    case Opcodes.DLOAD /* 24 */:
                        m3130(16777219);
                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case Opcodes.ALOAD /* 25 */:
                        m3130(m3126(i2));
                        return;
                    default:
                        switch (i) {
                            case Opcodes.IALOAD /* 46 */:
                            case Opcodes.BALOAD /* 51 */:
                            case 52:
                            case Opcodes.SALOAD /* 53 */:
                                m3128(2);
                                m3130(16777217);
                                return;
                            case 47:
                                m3128(2);
                                m3130(16777220);
                                m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case 48:
                                m3128(2);
                                m3130(16777218);
                                return;
                            case 49:
                                m3128(2);
                                m3130(16777219);
                                m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case Opcodes.AALOAD /* 50 */:
                                m3128(1);
                                int iM3127 = m3127();
                                if (iM3127 != 16777221) {
                                    iM3127 -= 268435456;
                                }
                                m3130(iM3127);
                                return;
                            case Opcodes.ISTORE /* 54 */:
                            case Opcodes.FSTORE /* 56 */:
                            case Opcodes.ASTORE /* 58 */:
                                m3132(i2, m3127());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM3126 = m3126(i4);
                                    if (iM3126 == 16777220 || iM3126 == 16777219) {
                                        m3132(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i5 = iM3126 & 251658240;
                                    if (i5 == 67108864 || i5 == 83886080) {
                                        m3132(i4, iM3126 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case Opcodes.LSTORE /* 55 */:
                            case Opcodes.DSTORE /* 57 */:
                                m3128(1);
                                m3132(i2, m3127());
                                m3132(i2 + 1, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM3128 = m3126(i6);
                                    if (iM3128 == 16777220 || iM3128 == 16777219) {
                                        m3132(i6, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i7 = iM3128 & 251658240;
                                    if (i7 == 67108864 || i7 == 83886080) {
                                        m3132(i6, iM3128 | 1048576);
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
                                        m3128(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m3128(4);
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
                                        m3128(2);
                                        return;
                                    case Opcodes.DUP /* 89 */:
                                        int iM3129 = m3127();
                                        m3130(iM3129);
                                        m3130(iM3129);
                                        return;
                                    case 90:
                                        int iM31210 = m3127();
                                        int iM31211 = m3127();
                                        m3130(iM31210);
                                        m3130(iM31211);
                                        m3130(iM31210);
                                        return;
                                    case 91:
                                        int iM31212 = m3127();
                                        int iM31213 = m3127();
                                        int iM31214 = m3127();
                                        m3130(iM31212);
                                        m3130(iM31214);
                                        m3130(iM31213);
                                        m3130(iM31212);
                                        return;
                                    case Opcodes.DUP2 /* 92 */:
                                        int iM31215 = m3127();
                                        int iM31216 = m3127();
                                        m3130(iM31216);
                                        m3130(iM31215);
                                        m3130(iM31216);
                                        m3130(iM31215);
                                        return;
                                    case 93:
                                        int iM31217 = m3127();
                                        int iM31218 = m3127();
                                        int iM31219 = m3127();
                                        m3130(iM31218);
                                        m3130(iM31217);
                                        m3130(iM31219);
                                        m3130(iM31218);
                                        m3130(iM31217);
                                        return;
                                    case 94:
                                        int iM31220 = m3127();
                                        int iM31221 = m3127();
                                        int iM31222 = m3127();
                                        int iM31223 = m3127();
                                        m3130(iM31221);
                                        m3130(iM31220);
                                        m3130(iM31223);
                                        m3130(iM31222);
                                        m3130(iM31221);
                                        m3130(iM31220);
                                        return;
                                    case Opcodes.SWAP /* 95 */:
                                        int iM31224 = m3127();
                                        int iM31225 = m3127();
                                        m3130(iM31224);
                                        m3130(iM31225);
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
                                        m3128(2);
                                        m3130(16777217);
                                        return;
                                    case Opcodes.LADD /* 97 */:
                                    case 101:
                                    case 105:
                                    case Opcodes.LDIV /* 109 */:
                                    case 113:
                                    case 127:
                                    case Opcodes.LOR /* 129 */:
                                    case Opcodes.LXOR /* 131 */:
                                        m3128(4);
                                        m3130(16777220);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                    case 137:
                                    case 144:
                                        m3128(2);
                                        m3130(16777218);
                                        return;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m3128(4);
                                        m3130(16777219);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
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
                                        m3128(3);
                                        m3130(16777220);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.IINC /* 132 */:
                                        m3132(i2, 16777217);
                                        return;
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.F2L /* 140 */:
                                        m3128(1);
                                        m3130(16777220);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.I2F /* 134 */:
                                        m3128(1);
                                        m3130(16777218);
                                        return;
                                    case Opcodes.I2D /* 135 */:
                                    case 141:
                                        m3128(1);
                                        m3130(16777219);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 138:
                                        m3128(2);
                                        m3130(16777219);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.F2I /* 139 */:
                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        m3128(1);
                                        m3130(16777217);
                                        return;
                                    case Opcodes.D2L /* 143 */:
                                        m3128(2);
                                        m3130(16777220);
                                        m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        m3128(4);
                                        m3130(16777217);
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                    case Opcodes.RET /* 169 */:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case Opcodes.GETSTATIC /* 178 */:
                                        m3131(c2870, c2869.f9195);
                                        return;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        m3129(c2869.f9195);
                                        return;
                                    case Opcodes.GETFIELD /* 180 */:
                                        m3128(1);
                                        m3131(c2870, c2869.f9195);
                                        return;
                                    case Opcodes.PUTFIELD /* 181 */:
                                        m3129(c2869.f9195);
                                        m3127();
                                        return;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        m3129(c2869.f9195);
                                        if (i != 184) {
                                            int iM31226 = m3127();
                                            if (i == 183 && c2869.f9194.charAt(0) == '<') {
                                                if (this.f5093 == null) {
                                                    this.f5093 = new int[2];
                                                }
                                                int length = this.f5093.length;
                                                int i8 = this.f5092;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f5093, 0, iArr, 0, length);
                                                    this.f5093 = iArr;
                                                }
                                                int[] iArr2 = this.f5093;
                                                int i9 = this.f5092;
                                                this.f5092 = i9 + 1;
                                                iArr2[i9] = iM31226;
                                            }
                                        }
                                        m3131(c2870, c2869.f9195);
                                        return;
                                    case 186:
                                        m3129(c2869.f9195);
                                        m3131(c2870, c2869.f9195);
                                        return;
                                    case Opcodes.NEW /* 187 */:
                                        String str = c2869.f9195;
                                        c2870.getClass();
                                        int iHashCode = (str.hashCode() + Opcodes.LOR + i2) & Integer.MAX_VALUE;
                                        for (C2869 c2869M4875 = c2870.m4875(iHashCode); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
                                            if (c2869M4875.f9192 == 129 && c2869M4875.f9198 == iHashCode && c2869M4875.f9196 == i2 && c2869M4875.f9195.equals(str)) {
                                                iM4873 = c2869M4875.f9191;
                                                m3130(iM4873 | 50331648);
                                                return;
                                            }
                                        }
                                        iM4873 = c2870.m4873(new C2869(c2870.f9206, iHashCode, i2, str));
                                        m3130(iM4873 | 50331648);
                                        return;
                                    case Opcodes.NEWARRAY /* 188 */:
                                        m3127();
                                        switch (i2) {
                                            case 4:
                                                m3130(285212681);
                                                return;
                                            case 5:
                                                m3130(285212683);
                                                return;
                                            case 6:
                                                m3130(285212674);
                                                return;
                                            case 7:
                                                m3130(285212675);
                                                return;
                                            case 8:
                                                m3130(285212682);
                                                return;
                                            case 9:
                                                m3130(285212684);
                                                return;
                                            case 10:
                                                m3130(285212673);
                                                return;
                                            case 11:
                                                m3130(285212676);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case Opcodes.ANEWARRAY /* 189 */:
                                        String str2 = c2869.f9195;
                                        m3127();
                                        if (str2.charAt(0) == '[') {
                                            m3131(c2870, "[".concat(str2));
                                            return;
                                        } else {
                                            m3130(c2870.m4874(str2) | 301989888);
                                            return;
                                        }
                                    case Opcodes.CHECKCAST /* 192 */:
                                        String str3 = c2869.f9195;
                                        m3127();
                                        if (str3.charAt(0) == '[') {
                                            m3131(c2870, str3);
                                            return;
                                        } else {
                                            m3130(c2870.m4874(str3) | 33554432);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m3128(i2);
                                                m3131(c2870, c2869.f9195);
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m3128(1);
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
    public final int m3125(C2870 c2870, int i) {
        int i2;
        int iM4874;
        if (i == 16777222 || ((-16777216) & i) == 50331648) {
            for (int i3 = 0; i3 < this.f5092; i3++) {
                int i4 = this.f5093[i3];
                int i5 = (-268435456) & i4;
                int i6 = 251658240 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 67108864) {
                    i2 = this.f5086[i7];
                } else {
                    if (i6 == 83886080) {
                        int[] iArr = this.f5087;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == 16777222) {
                            iM4874 = c2870.m4874(c2870.f9201);
                        } else {
                            iM4874 = c2870.m4874(c2870.f9207[i & 1048575].f9195);
                        }
                        return iM4874 | 33554432;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == 16777222) {
                        iM4874 = c2870.m4874(c2870.f9201);
                    } else {
                        iM4874 = c2870.m4874(c2870.f9207[i & 1048575].f9195);
                    }
                    return iM4874 | 33554432;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3126(int i) {
        int[] iArr = this.f5088;
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
    public final int m3127() {
        short s = this.f5091;
        if (s <= 0) {
            short s2 = (short) (this.f5090 - 1);
            this.f5090 = s2;
            return (-s2) | 83886080;
        }
        int[] iArr = this.f5089;
        short s3 = (short) (s - 1);
        this.f5091 = s3;
        return iArr[s3];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3128(int i) {
        short s = this.f5091;
        if (s >= i) {
            this.f5091 = (short) (s - i);
        } else {
            this.f5090 = (short) (this.f5090 - (i - s));
            this.f5091 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3129(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m3128((C3449.m4976(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m3128(2);
        } else {
            m3128(1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3130(int i) {
        if (this.f5089 == null) {
            this.f5089 = new int[10];
        }
        int length = this.f5089.length;
        short s = this.f5091;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f5089, 0, iArr, 0, length);
            this.f5089 = iArr;
        }
        int[] iArr2 = this.f5089;
        short s2 = this.f5091;
        short s3 = (short) (s2 + 1);
        this.f5091 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f5090 + s3);
        C1752 c1752 = this.f5085;
        if (s4 > c1752.f5865) {
            c1752.f5865 = s4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3131(C2870 c2870, String str) {
        int iM3121 = m3121(c2870, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (iM3121 != 0) {
            m3130(iM3121);
            if (iM3121 == 16777220 || iM3121 == 16777219) {
                m3130(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3132(int i, int i2) {
        if (this.f5088 == null) {
            this.f5088 = new int[10];
        }
        int length = this.f5088.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f5088, 0, iArr, 0, length);
            this.f5088 = iArr;
        }
        this.f5088[i] = i2;
    }
}
