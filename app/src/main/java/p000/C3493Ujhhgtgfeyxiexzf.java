package p000;

import android.util.Log;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3493Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f10847Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f10848Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f10849Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final byte[] f10850Ujhhgtgfeyxiexzf;

    public C3493Ujhhgtgfeyxiexzf(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C3493Ujhhgtgfeyxiexzf m4981Ujhhgtgfeyxiexzf(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3497Ujhhgtgfeyxiexzf.f10874feyxiexzfUjhhgtg[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C3493Ujhhgtgfeyxiexzf(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C3493Ujhhgtgfeyxiexzf m4982Ujhhgtgfeyxiexzf(C3495Ujhhgtgfeyxiexzf c3495Ujhhgtgfeyxiexzf, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3497Ujhhgtgfeyxiexzf.f10874feyxiexzfUjhhgtg[5]]);
        byteBufferWrap.order(byteOrder);
        C3495Ujhhgtgfeyxiexzf c3495Ujhhgtgfeyxiexzf2 = new C3495Ujhhgtgfeyxiexzf[]{c3495Ujhhgtgfeyxiexzf}[0];
        byteBufferWrap.putInt((int) c3495Ujhhgtgfeyxiexzf2.f10855Ujhhgtgfeyxiexzf);
        byteBufferWrap.putInt((int) c3495Ujhhgtgfeyxiexzf2.f10856Ujhhgtgfeyxiexzf);
        return new C3493Ujhhgtgfeyxiexzf(5, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C3493Ujhhgtgfeyxiexzf m4983Ujhhgtgfeyxiexzf(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3497Ujhhgtgfeyxiexzf.f10874feyxiexzfUjhhgtg[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C3493Ujhhgtgfeyxiexzf(3, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C3497Ujhhgtgfeyxiexzf.f10873feyxiexzfUjhhgtg[this.f10847Ujhhgtgfeyxiexzf]);
        sb.append(", data length:");
        return AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.f10850Ujhhgtgfeyxiexzf.length, ")");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final double m4984Ujhhgtgfeyxiexzf(ByteOrder byteOrder) throws Throwable {
        Object objM4987Ujhhgtgfeyxiexzf = m4987Ujhhgtgfeyxiexzf(byteOrder);
        if (objM4987Ujhhgtgfeyxiexzf == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof String) {
            return Double.parseDouble((String) objM4987Ujhhgtgfeyxiexzf);
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof long[]) {
            long[] jArr = (long[]) objM4987Ujhhgtgfeyxiexzf;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof int[]) {
            int[] iArr = (int[]) objM4987Ujhhgtgfeyxiexzf;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof double[]) {
            double[] dArr = (double[]) objM4987Ujhhgtgfeyxiexzf;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM4987Ujhhgtgfeyxiexzf instanceof C3495Ujhhgtgfeyxiexzf[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C3495Ujhhgtgfeyxiexzf[] c3495UjhhgtgfeyxiexzfArr = (C3495Ujhhgtgfeyxiexzf[]) objM4987Ujhhgtgfeyxiexzf;
        if (c3495UjhhgtgfeyxiexzfArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C3495Ujhhgtgfeyxiexzf c3495Ujhhgtgfeyxiexzf = c3495UjhhgtgfeyxiexzfArr[0];
        return c3495Ujhhgtgfeyxiexzf.f10855Ujhhgtgfeyxiexzf / c3495Ujhhgtgfeyxiexzf.f10856Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m4985Ujhhgtgfeyxiexzf(ByteOrder byteOrder) throws Throwable {
        Object objM4987Ujhhgtgfeyxiexzf = m4987Ujhhgtgfeyxiexzf(byteOrder);
        if (objM4987Ujhhgtgfeyxiexzf == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof String) {
            return Integer.parseInt((String) objM4987Ujhhgtgfeyxiexzf);
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof long[]) {
            long[] jArr = (long[]) objM4987Ujhhgtgfeyxiexzf;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM4987Ujhhgtgfeyxiexzf instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM4987Ujhhgtgfeyxiexzf;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String m4986Ujhhgtgfeyxiexzf(ByteOrder byteOrder) throws Throwable {
        Object objM4987Ujhhgtgfeyxiexzf = m4987Ujhhgtgfeyxiexzf(byteOrder);
        if (objM4987Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof String) {
            return (String) objM4987Ujhhgtgfeyxiexzf;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM4987Ujhhgtgfeyxiexzf instanceof long[]) {
            long[] jArr = (long[]) objM4987Ujhhgtgfeyxiexzf;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof int[]) {
            int[] iArr = (int[]) objM4987Ujhhgtgfeyxiexzf;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM4987Ujhhgtgfeyxiexzf instanceof double[]) {
            double[] dArr = (double[]) objM4987Ujhhgtgfeyxiexzf;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM4987Ujhhgtgfeyxiexzf instanceof C3495Ujhhgtgfeyxiexzf[])) {
            return null;
        }
        C3495Ujhhgtgfeyxiexzf[] c3495UjhhgtgfeyxiexzfArr = (C3495Ujhhgtgfeyxiexzf[]) objM4987Ujhhgtgfeyxiexzf;
        while (i < c3495UjhhgtgfeyxiexzfArr.length) {
            sb.append(c3495UjhhgtgfeyxiexzfArr[i].f10855Ujhhgtgfeyxiexzf);
            sb.append('/');
            sb.append(c3495UjhhgtgfeyxiexzfArr[i].f10856Ujhhgtgfeyxiexzf);
            i++;
            if (i != c3495UjhhgtgfeyxiexzfArr.length) {
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
    /* JADX WARN: Type inference failed for: r14v25, types: [上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Serializable m4987Ujhhgtgfeyxiexzf(ByteOrder byteOrder) throws Throwable {
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg;
        InputStream inputStream;
        ?? str;
        byte b;
        byte[] bArr = this.f10850Ujhhgtgfeyxiexzf;
        InputStream inputStream2 = null;
        try {
            try {
                c3363feyxiexzfUjhhgtg = new C3363feyxiexzfUjhhgtg(bArr);
                try {
                    c3363feyxiexzfUjhhgtg.f10516Ujhhgtgfeyxiexzf = byteOrder;
                    int i = this.f10847Ujhhgtgfeyxiexzf;
                    int length = 0;
                    int i2 = this.f10848Ujhhgtgfeyxiexzf;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + JSONB.Constants.BC_INT32_BYTE_MIN)});
                                try {
                                    c3363feyxiexzfUjhhgtg.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C3497Ujhhgtgfeyxiexzf.f10883feyxiexzfUjhhgtg);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i2 >= C3497Ujhhgtgfeyxiexzf.f10875feyxiexzfUjhhgtg.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C3497Ujhhgtgfeyxiexzf.f10875feyxiexzfUjhhgtg;
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
                                str[length] = c3363feyxiexzfUjhhgtg.readUnsignedShort();
                                length++;
                            }
                            break;
                        case 4:
                            str = new long[i2];
                            while (length < i2) {
                                str[length] = ((long) c3363feyxiexzfUjhhgtg.readInt()) & 4294967295L;
                                length++;
                            }
                            break;
                        case 5:
                            str = new C3495Ujhhgtgfeyxiexzf[i2];
                            while (length < i2) {
                                str[length] = new C3495Ujhhgtgfeyxiexzf(((long) c3363feyxiexzfUjhhgtg.readInt()) & 4294967295L, ((long) c3363feyxiexzfUjhhgtg.readInt()) & 4294967295L);
                                length++;
                            }
                            break;
                        case 8:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c3363feyxiexzfUjhhgtg.readShort();
                                length++;
                            }
                            break;
                        case 9:
                            str = new int[i2];
                            while (length < i2) {
                                str[length] = c3363feyxiexzfUjhhgtg.readInt();
                                length++;
                            }
                            break;
                        case 10:
                            str = new C3495Ujhhgtgfeyxiexzf[i2];
                            while (length < i2) {
                                str[length] = new C3495Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg.readInt(), c3363feyxiexzfUjhhgtg.readInt());
                                length++;
                            }
                            break;
                        case 11:
                            str = new double[i2];
                            while (length < i2) {
                                str[length] = c3363feyxiexzfUjhhgtg.readFloat();
                                length++;
                            }
                            break;
                        case Opcodes.FCONST_1 /* 12 */:
                            str = new double[i2];
                            while (length < i2) {
                                str[length] = c3363feyxiexzfUjhhgtg.readDouble();
                                length++;
                            }
                            break;
                        default:
                            try {
                                c3363feyxiexzfUjhhgtg.close();
                                return null;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return null;
                            }
                    }
                    try {
                        c3363feyxiexzfUjhhgtg.close();
                        return str;
                    } catch (IOException e3) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        return str;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c3363feyxiexzfUjhhgtg != null) {
                        try {
                            c3363feyxiexzfUjhhgtg.close();
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
            c3363feyxiexzfUjhhgtg = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public C3493Ujhhgtgfeyxiexzf(long j, byte[] bArr, int i, int i2) {
        this.f10847Ujhhgtgfeyxiexzf = i;
        this.f10848Ujhhgtgfeyxiexzf = i2;
        this.f10849Ujhhgtgfeyxiexzf = j;
        this.f10850Ujhhgtgfeyxiexzf = bArr;
    }
}
