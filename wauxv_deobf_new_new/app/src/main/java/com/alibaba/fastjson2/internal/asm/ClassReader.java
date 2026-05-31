package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.ek;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ClassReader {
    public final byte[] b;
    public final int header;
    private final int[] items;
    private final int maxStringLength;
    private final String[] strings;

    public ClassReader(InputStream inputStream) throws IOException {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            i = 0;
            if (i2 == -1) {
                break;
            } else if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        }
        inputStream.close();
        this.b = byteArrayOutputStream.toByteArray();
        int[] iArr = new int[readUnsignedShort(8)];
        this.items = iArr;
        int length = iArr.length;
        this.strings = new String[length];
        int i3 = 10;
        int i4 = 1;
        while (i4 < length) {
            int i5 = i3 + 1;
            this.items[i4] = i5;
            byte b = this.b[i3];
            int unsignedShort = 3;
            if (b == 1) {
                unsignedShort = 3 + readUnsignedShort(i5);
                if (unsignedShort > i) {
                    i = unsignedShort;
                }
            } else if (b != 15) {
                unsignedShort = 5;
                if (b != 18 && b != 3 && b != 4) {
                    if (b != 5 && b != 6) {
                        switch (b) {
                            case 9:
                            case 10:
                            case 11:
                            case Opcodes.FCONST_1 /* 12 */:
                                break;
                            default:
                                continue;
                        }
                    } else {
                        i4++;
                        unsignedShort = 9;
                    }
                }
            } else {
                unsignedShort = 4;
            }
            i3 += unsignedShort;
            i4++;
        }
        this.maxStringLength = i;
        this.header = i3;
    }

    private int readInt(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private int readMethod(TypeCollector typeCollector, char[] cArr, int i) {
        int unsignedShort = readUnsignedShort(i);
        String utf8 = readUTF8(i + 2, cArr);
        String utf9 = readUTF8(i + 4, cArr);
        int i2 = i + 8;
        int i3 = 0;
        int i4 = 0;
        for (int unsignedShort2 = readUnsignedShort(i + 6); unsignedShort2 > 0; unsignedShort2--) {
            String utf10 = readUTF8(i2, cArr);
            int i5 = readInt(i2 + 2);
            int i6 = i2 + 6;
            if ("Code".equals(utf10)) {
                i4 = i6;
            }
            i2 = i6 + i5;
        }
        MethodCollector methodCollectorVisitMethod = typeCollector.visitMethod(unsignedShort, utf8, utf9);
        if (methodCollectorVisitMethod != null && i4 != 0) {
            int i7 = i4 + 8 + readInt(i4 + 4);
            int i8 = i7 + 2;
            for (int unsignedShort3 = readUnsignedShort(i7); unsignedShort3 > 0; unsignedShort3--) {
                i8 += 8;
            }
            int i9 = i8 + 2;
            int i10 = 0;
            for (int unsignedShort4 = readUnsignedShort(i8); unsignedShort4 > 0; unsignedShort4--) {
                String utf11 = readUTF8(i9, cArr);
                if ("LocalVariableTable".equals(utf11)) {
                    i3 = i9 + 6;
                } else if ("LocalVariableTypeTable".equals(utf11)) {
                    i10 = i9 + 6;
                }
                i9 += readInt(i9 + 2) + 6;
            }
            if (i3 != 0) {
                if (i10 != 0) {
                    for (int unsignedShort5 = readUnsignedShort(i10) * 3; unsignedShort5 > 0; unsignedShort5 -= 3) {
                    }
                }
                int i11 = i3 + 2;
                for (int unsignedShort6 = readUnsignedShort(i3); unsignedShort6 > 0; unsignedShort6--) {
                    methodCollectorVisitMethod.visitLocalVariable(readUTF8(i11 + 4, cArr), readUnsignedShort(i11 + 8));
                    i11 += 10;
                }
            }
        }
        return i2;
    }

    private String readUTF(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.b;
        int i5 = 0;
        char c = 0;
        char c2 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if (c == 0) {
                int i7 = b & 255;
                if (i7 < 128) {
                    cArr[i5] = (char) i7;
                    i5++;
                } else if (i7 >= 224 || i7 <= 191) {
                    c2 = (char) (b & ek.m);
                    c = 2;
                } else {
                    i3 = b & 31;
                    c2 = (char) i3;
                    c = 1;
                }
            } else if (c == 1) {
                cArr[i5] = (char) ((b & JSONB.Constants.BC_INT32_BYTE_MAX) | (c2 << 6));
                i5++;
                c = 0;
            } else if (c == 2) {
                i3 = (b & JSONB.Constants.BC_INT32_BYTE_MAX) | (c2 << 6);
                c2 = (char) i3;
                c = 1;
            }
            i = i6;
        }
        return new String(cArr, 0, i5);
    }

    private String readUTF8(int i, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        String[] strArr = this.strings;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i2 = this.items[unsignedShort];
        String utf = readUTF(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[unsignedShort] = utf;
        return utf;
    }

    private int readUnsignedShort(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public void accept(TypeCollector typeCollector) {
        char[] cArr = new char[this.maxStringLength];
        int i = this.header;
        int unsignedShort = readUnsignedShort(i + 6);
        int i2 = i + 8;
        for (int i3 = 0; i3 < unsignedShort; i3++) {
            i2 += 2;
        }
        int i4 = i2 + 2;
        int i5 = i4;
        for (int unsignedShort2 = readUnsignedShort(i2); unsignedShort2 > 0; unsignedShort2--) {
            i5 += 8;
            for (int unsignedShort3 = readUnsignedShort(i5 + 6); unsignedShort3 > 0; unsignedShort3--) {
                i5 += readInt(i5 + 2) + 6;
            }
        }
        int i6 = i5 + 2;
        for (int unsignedShort4 = readUnsignedShort(i5); unsignedShort4 > 0; unsignedShort4--) {
            i6 += 8;
            for (int unsignedShort5 = readUnsignedShort(i6 + 6); unsignedShort5 > 0; unsignedShort5--) {
                i6 += readInt(i6 + 2) + 6;
            }
        }
        int i7 = i6 + 2;
        for (int unsignedShort6 = readUnsignedShort(i6); unsignedShort6 > 0; unsignedShort6--) {
            i7 += readInt(i7 + 2) + 6;
        }
        for (int unsignedShort7 = readUnsignedShort(i2); unsignedShort7 > 0; unsignedShort7--) {
            i4 += 8;
            for (int unsignedShort8 = readUnsignedShort(i4 + 6); unsignedShort8 > 0; unsignedShort8--) {
                i4 += readInt(i4 + 2) + 6;
            }
        }
        int method = i4 + 2;
        for (int unsignedShort9 = readUnsignedShort(i4); unsignedShort9 > 0; unsignedShort9--) {
            method = readMethod(typeCollector, cArr, method);
        }
    }
}
