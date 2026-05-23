package p000;

import android.util.Log;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1247 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f4519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f4520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f4521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final byte[] f4522;

    public C1247(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1247 m2904(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1251.f4546[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C1247(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1247 m2905(C1249 c1249, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1251.f4546[5]]);
        byteBufferWrap.order(byteOrder);
        C1249 c12410 = new C1249[]{c1249}[0];
        byteBufferWrap.putInt((int) c12410.f4527);
        byteBufferWrap.putInt((int) c12410.f4528);
        return new C1247(5, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1247 m2906(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1251.f4546[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C1247(3, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C1251.f4545[this.f4519]);
        sb.append(", data length:");
        return AbstractC2784.m4751(sb, this.f4522.length, ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final double m2907(ByteOrder byteOrder) throws Throwable {
        Object objM2910 = m2910(byteOrder);
        if (objM2910 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM2910 instanceof String) {
            return Double.parseDouble((String) objM2910);
        }
        if (objM2910 instanceof long[]) {
            long[] jArr = (long[]) objM2910;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM2910 instanceof int[]) {
            int[] iArr = (int[]) objM2910;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM2910 instanceof double[]) {
            double[] dArr = (double[]) objM2910;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM2910 instanceof C1249[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C1249[] c1249Arr = (C1249[]) objM2910;
        if (c1249Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C1249 c1249 = c1249Arr[0];
        return c1249.f4527 / c1249.f4528;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m2908(ByteOrder byteOrder) {
        Object objM2910 = m2910(byteOrder);
        if (objM2910 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM2910 instanceof String) {
            return Integer.parseInt((String) objM2910);
        }
        if (objM2910 instanceof long[]) {
            long[] jArr = (long[]) objM2910;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM2910 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM2910;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String m2909(ByteOrder byteOrder) throws Throwable {
        Object objM2910 = m2910(byteOrder);
        if (objM2910 == null) {
            return null;
        }
        if (objM2910 instanceof String) {
            return (String) objM2910;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM2910 instanceof long[]) {
            long[] jArr = (long[]) objM2910;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM2910 instanceof int[]) {
            int[] iArr = (int[]) objM2910;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM2910 instanceof double[]) {
            double[] dArr = (double[]) objM2910;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM2910 instanceof C1249[])) {
            return null;
        }
        C1249[] c1249Arr = (C1249[]) objM2910;
        while (i < c1249Arr.length) {
            sb.append(c1249Arr[i].f4527);
            sb.append('/');
            sb.append(c1249Arr[i].f4528);
            i++;
            if (i != c1249Arr.length) {
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
    /* JADX WARN: Type inference failed for: r14v25, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲁᲀᲈ[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲁᲀᲈ[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Serializable m2910(ByteOrder byteOrder) throws Throwable {
        C1246 c1246;
        InputStream inputStream;
        ?? str;
        byte b;
        byte[] bArr = this.f4522;
        InputStream inputStream2 = null;
        try {
            try {
                c1246 = new C1246(bArr);
                try {
                    c1246.f4516 = byteOrder;
                    int i = this.f4519;
                    int length = 0;
                    int i2 = this.f4520;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    c1246.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C1251.f4555);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i2 >= C1251.f4547.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C1251.f4547;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (0 < i2) {
                                byte b2 = bArr[0];
                                if (b2 == 0) {
                                    str = sb.toString();
                                } else {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    0++;
                                }
                                break;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c1246.readUnsignedShort();
                                length++;
                            }
                            break;
                        case 4:
                            str = new long[i2];
                            while (length < i2) {
                                str[length] = ((long) c1246.readInt()) & 4294967295L;
                                length++;
                            }
                            break;
                        case 5:
                            str = new C1249[i2];
                            while (length < i2) {
                                str[length] = new C1249(((long) c1246.readInt()) & 4294967295L, ((long) c1246.readInt()) & 4294967295L);
                                length++;
                            }
                            break;
                        case 8:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c1246.readShort();
                                length++;
                            }
                            break;
                        case 9:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c1246.readInt();
                                length++;
                            }
                            break;
                        case 10:
                            str = new C1249[i2];
                            while (length < i2) {
                                str[length] = new C1249(c1246.readInt(), c1246.readInt());
                                length++;
                            }
                            break;
                        case 11:
                            str = new double[i2];
                            while (length < i2) {
                                str[length] = c1246.readFloat();
                                length++;
                            }
                            break;
                        case 12 /* 12 */:
                            str = new double[i2];
                            while (length < i2) {
                                str[length] = c1246.readDouble();
                                length++;
                            }
                            break;
                        default:
                            try {
                                c1246.close();
                                return null;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return null;
                            }
                    }
                    try {
                        c1246.close();
                        return str;
                    } catch (IOException e3) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        return str;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (true) {
                        try {
                            c1246.close();
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
            c1246 = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public C1247(long j, byte[] bArr, int i, int i2) {
        this.f4519 = i;
        this.f4520 = i2;
        this.f4521 = j;
        this.f4522 = bArr;
    }
}
