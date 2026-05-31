package p000;

import android.util.Log;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1249 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f4518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f4519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f4520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final byte[] f4521;

    public C1249(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1249 m3023(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1253.f4545[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C1249(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1249 m3024(C1251 c1251, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1253.f4545[5]]);
        byteBufferWrap.order(byteOrder);
        C1251 c1252 = new C1251[]{c1251}[0];
        byteBufferWrap.putInt((int) c1252.f4526);
        byteBufferWrap.putInt((int) c1252.f4527);
        return new C1249(5, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1249 m3025(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1253.f4545[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C1249(3, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C1253.f4544[this.f4518]);
        sb.append(", data length:");
        return AbstractC2844.m4785(sb, this.f4521.length, ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final double m3026(ByteOrder byteOrder) throws Throwable {
        Object objM3029 = m3029(byteOrder);
        if (objM3029 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM3029 instanceof String) {
            return Double.parseDouble((String) objM3029);
        }
        if (objM3029 instanceof long[]) {
            long[] jArr = (long[]) objM3029;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM3029 instanceof int[]) {
            int[] iArr = (int[]) objM3029;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM3029 instanceof double[]) {
            double[] dArr = (double[]) objM3029;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM3029 instanceof C1251[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C1251[] c1251Arr = (C1251[]) objM3029;
        if (c1251Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C1251 c1251 = c1251Arr[0];
        return c1251.f4526 / c1251.f4527;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3027(ByteOrder byteOrder) throws Throwable {
        Object objM3029 = m3029(byteOrder);
        if (objM3029 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM3029 instanceof String) {
            return Integer.parseInt((String) objM3029);
        }
        if (objM3029 instanceof long[]) {
            long[] jArr = (long[]) objM3029;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM3029 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM3029;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String m3028(ByteOrder byteOrder) throws Throwable {
        Object objM3029 = m3029(byteOrder);
        if (objM3029 == null) {
            return null;
        }
        if (objM3029 instanceof String) {
            return (String) objM3029;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM3029 instanceof long[]) {
            long[] jArr = (long[]) objM3029;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM3029 instanceof int[]) {
            int[] iArr = (int[]) objM3029;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM3029 instanceof double[]) {
            double[] dArr = (double[]) objM3029;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM3029 instanceof C1251[])) {
            return null;
        }
        C1251[] c1251Arr = (C1251[]) objM3029;
        while (i < c1251Arr.length) {
            sb.append(c1251Arr[i].f4526);
            sb.append('/');
            sb.append(c1251Arr[i].f4527);
            i++;
            if (i != c1251Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᤞᲀᛸ[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᤞᲀᛸ[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Serializable m3029(ByteOrder byteOrder) throws Throwable {
        C1248 c1248;
        InputStream inputStream;
        ?? str;
        byte b;
        byte[] bArr = this.f4521;
        InputStream inputStream2 = null;
        try {
            try {
                c1248 = new C1248(bArr);
                try {
                    c1248.f4515 = byteOrder;
                    int i = this.f4518;
                    int length = 0;
                    int i2 = this.f4519;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + JSONB.Constants.BC_INT32_BYTE_MIN)});
                                try {
                                    c1248.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C1253.f4554);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i2 >= C1253.f4546.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C1253.f4546;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                } else {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                break;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c1248.readUnsignedShort();
                                length++;
                            }
                            break;
                        case 4:
                            str = new long[i2];
                            while (length < i2) {
                                str[length] = ((long) c1248.readInt()) & 4294967295L;
                                length++;
                            }
                            break;
                        case 5:
                            str = new C1251[i2];
                            while (length < i2) {
                                str[length] = new C1251(((long) c1248.readInt()) & 4294967295L, ((long) c1248.readInt()) & 4294967295L);
                                length++;
                            }
                            break;
                        case 8:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c1248.readShort();
                                length++;
                            }
                            break;
                        case 9:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c1248.readInt();
                                length++;
                            }
                            break;
                        case 10:
                            str = new C1251[i2];
                            while (length < i2) {
                                str[length] = new C1251(c1248.readInt(), c1248.readInt());
                                length++;
                            }
                            break;
                        case 11:
                            str = new double[i2];
                            while (length < i2) {
                                str[length] = c1248.readFloat();
                                length++;
                            }
                            break;
                        case Opcodes.FCONST_1 /* 12 */:
                            str = new double[i2];
                            while (length < i2) {
                                str[length] = c1248.readDouble();
                                length++;
                            }
                            break;
                        default:
                            try {
                                c1248.close();
                                return null;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return null;
                            }
                    }
                    try {
                        c1248.close();
                        return str;
                    } catch (IOException e3) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        return str;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c1248 != null) {
                        try {
                            c1248.close();
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e6) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            c1248 = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public C1249(long j, byte[] bArr, int i, int i2) {
        this.f4518 = i;
        this.f4519 = i2;
        this.f4520 = j;
        this.f4521 = bArr;
    }
}
