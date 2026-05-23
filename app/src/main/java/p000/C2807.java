package p000;

import android.graphics.Bitmap;
import android.util.Log;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2807 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int[] f8959;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0542 f8961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ByteBuffer f8962;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public byte[] f8963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public short[] f8964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public byte[] f8965;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte[] f8966;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte[] f8967;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int[] f8968;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f8969;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C1454 f8970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Bitmap f8971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean f8972;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f8973;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f8974;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int f8975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int f8976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public Boolean f8977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int[] f8960 = new int[256];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public Bitmap.Config f8978 = Bitmap.Config.ARGB_8888;

    public C2807(C0542 c0542, C1454 c1454, ByteBuffer byteBuffer, int i) {
        this.f8961 = c0542;
        this.f8970 = new C1454();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f8973 = 0;
                this.f8970 = c1454;
                this.f8969 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f8962 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f8962.order(ByteOrder.LITTLE_ENDIAN);
                this.f8972 = false;
                Iterator it = c1454.f5167.iterator();
                while (it.hasNext()) {
                    if (((C1449) it.next()).f5133 == 3) {
                        this.f8972 = true;
                        break;
                    }
                }
                this.f8974 = iHighestOneBit;
                int i2 = c1454.f5168;
                this.f8976 = i2 / iHighestOneBit;
                int i3 = c1454.f5169;
                this.f8975 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C1867 c1867 = (C1867) this.f8961.f2253;
                this.f8967 = c1867 == null ? new byte[i4] : (byte[]) c1867.m3640(i4, byte[].class);
                C0542 c0543 = this.f8961;
                int i5 = this.f8976 * this.f8975;
                C1867 c1868 = (C1867) c0543.f2253;
                this.f8968 = c1868 == null ? new int[i5] : (int[]) c1868.m3640(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Bitmap m4782() {
        Boolean bool = this.f8977;
        Bitmap bitmapMo1503 = ((InterfaceC0424) this.f8961.f2252).mo1503(this.f8976, this.f8975, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f8978);
        bitmapMo1503.setHasAlpha(true);
        return bitmapMo1503;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final synchronized Bitmap m4783() {
        try {
            if (this.f8970.f5165 <= 0 || this.f8969 < 0) {
                if (Log.isLoggable("ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ", 3)) {
                    Log.d("ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ", "Unable to decode frame, frameCount=" + this.f8970.f5165 + ", framePointer=" + this.f8969);
                }
                this.f8973 = 1;
            }
            int i = this.f8973;
            if (i != 1 && i != 2) {
                this.f8973 = 0;
                if (this.f8963 == null) {
                    C1867 c1867 = (C1867) this.f8961.f2253;
                    this.f8963 = c1867 == null ? new byte[255] : (byte[]) c1867.m3640(255, byte[].class);
                }
                C1449 c1449 = (C1449) this.f8970.f5167.get(this.f8969);
                int i2 = this.f8969 - 1;
                C1449 c14410 = i2 >= 0 ? (C1449) this.f8970.f5167.get(i2) : null;
                int[] iArr = c1449.f5137;
                if (iArr == null) {
                    iArr = this.f8970.f5163;
                }
                this.f8959 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ", 3)) {
                        Log.d("ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ", "No valid color table found for frame #" + this.f8969);
                    }
                    this.f8973 = 1;
                    return null;
                }
                if (c1449.f5132) {
                    System.arraycopy(iArr, 0, this.f8960, 0, iArr.length);
                    int[] iArr2 = this.f8960;
                    this.f8959 = iArr2;
                    iArr2[c1449.f5134] = 0;
                    if (c1449.f5133 == 2 && this.f8969 == 0) {
                        this.f8977 = Boolean.TRUE;
                    }
                }
                return m4785(c1449, c14410);
            }
            if (Log.isLoggable("ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ", 3)) {
                Log.d("ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᛸᤝ", "Unable to decode frame, status=" + this.f8973);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4784(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == Bitmap.Config.ARGB_8888 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f8978 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc A[PHI: r5
      0x01dc: PHI (r5v24 int) = (r5v18 int), (r5v26 int), (r5v26 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Bitmap m4785(C1449 c1449, C1449 c14410) {
        byte b;
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        short s;
        int i6;
        Bitmap bitmap;
        int i7;
        C0542 c0542 = this.f8961;
        byte b2 = 0;
        int[] iArr2 = this.f8968;
        if (c14410 == null) {
            Bitmap bitmap2 = this.f8971;
            if (bitmap2 != null) {
                ((InterfaceC0424) c0542.f2252).mo1504(bitmap2);
            }
            this.f8971 = null;
            Arrays.fill(iArr2, 0);
        }
        if (c14410 != null && c14410.f5133 == 3 && this.f8971 == null) {
            Arrays.fill(iArr2, 0);
        }
        if (c14410 != null && (i6 = c14410.f5133) > 0) {
            if (i6 == 2) {
                if (c1449.f5132) {
                    i7 = 0;
                } else {
                    C1454 c1454 = this.f8970;
                    i7 = c1454.f5173;
                    if (c1449.f5137 != null && c1454.f5172 == c1449.f5134) {
                        i7 = 0;
                    }
                }
                int i8 = c14410.f5130;
                int i9 = this.f8974;
                int i10 = i8 / i9;
                int i11 = c14410.f5128 / i9;
                int i12 = c14410.f5129 / i9;
                int i13 = c14410.f5127 / i9;
                int i14 = this.f8976;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr2[i18] = i7;
                    }
                    i15 += this.f8976;
                }
            } else if (i6 == 3 && (bitmap = this.f8971) != null) {
                int i19 = this.f8975;
                int i20 = this.f8976;
                bitmap.getPixels(iArr2, 0, i20, 0, 0, i20, i19);
            }
        }
        this.f8962.position(c1449.f5136);
        int i21 = c1449.f5129 * c1449.f5130;
        byte[] bArr = this.f8967;
        if (bArr == null || bArr.length < i21) {
            C1867 c1867 = (C1867) c0542.f2253;
            this.f8967 = c1867 == null ? new byte[i21] : (byte[]) c1867.m3640(i21, byte[].class);
        }
        byte[] bArr2 = this.f8967;
        if (this.f8964 == null) {
            this.f8964 = new short[4096];
        }
        short[] sArr = this.f8964;
        if (this.f8965 == null) {
            this.f8965 = new byte[4096];
        }
        byte[] bArr3 = this.f8965;
        if (this.f8966 == null) {
            this.f8966 = new byte[4097];
        }
        byte[] bArr4 = this.f8966;
        int i22 = this.f8962.get() & 255;
        int i23 = 1;
        int i24 = 1 << i22;
        int i25 = i24 + 1;
        int i26 = i24 + 2;
        int i27 = i22 + 1;
        int i28 = (1 << i27) - 1;
        int i29 = 0;
        while (i29 < i24) {
            sArr[i29] = 0;
            bArr3[i29] = (byte) i29;
            i29++;
            i23 = 1;
        }
        int i30 = 1;
        byte[] bArr5 = this.f8963;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = i27;
        int i40 = i26;
        int i41 = i28;
        int i42 = -1;
        while (true) {
            if (i31 >= i21) {
                iArr2 = iArr2;
                b = 0;
                break;
            }
            if (i32 == 0) {
                i5 = -1;
                int i43 = this.f8962.get() & 255;
                if (i43 > 0) {
                    ByteBuffer byteBuffer = this.f8962;
                    byteBuffer.get(this.f8963, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    this.f8973 = 3;
                    b = 0;
                    break;
                }
                i32 = i43;
                i33 = 0;
            } else {
                sArr = sArr;
                iArr2 = iArr2;
                i5 = -1;
            }
            i35 += (bArr5[i33] & 255) << i34;
            i33++;
            i32--;
            i34 += 8;
            i40 = i40;
            int i44 = i39;
            i42 = i42;
            i37 = i37;
            while (true) {
                i34 = i34;
                if (i34 < i44) {
                    i39 = i44;
                    b2 = 0;
                    break;
                }
                int i45 = i35 & i41;
                i35 >>= i44;
                i34 -= i44;
                if (i45 == i24) {
                    i44 = i27;
                    i40 = i26;
                    i41 = i28;
                    i34 = i34;
                    i42 = -1;
                } else {
                    if (i45 == i25) {
                        i39 = i44;
                        b2 = 0;
                        break;
                    }
                    int i46 = i44;
                    if (i42 == -1) {
                        bArr2[i36] = bArr3[i45];
                        i36++;
                        i31++;
                        i42 = i45;
                        i37 = i42;
                        i44 = i46;
                    } else {
                        if (i45 >= i40) {
                            bArr4[i38] = (byte) i37;
                            0++;
                            s = i42;
                        } else {
                            s = i45;
                        }
                        while (s >= i24) {
                            bArr4[i38] = bArr3[s];
                            i38++;
                            s = sArr[s];
                        }
                        i37 = bArr3[s] & 255;
                        byte b3 = (byte) i37;
                        bArr2[i36] = b3;
                        while (true) {
                            i36++;
                            i31++;
                            if (i38 <= 0) {
                                break;
                            }
                            i38--;
                            bArr2[i36] = bArr4[i38];
                        }
                        if (i40 < 4096) {
                            sArr[i40] = (short) i42;
                            bArr3[i40] = b3;
                            i40++;
                            if ((i40 & i41) != 0 || i40 >= 4096) {
                                i44 = i46;
                            } else {
                                i44 = i46 + 1;
                                i41 += i40;
                            }
                        } else {
                            i44 = i46;
                        }
                        i42 = i45;
                    }
                    i5 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i36, i21, 0);
        if (c1449.f5131 || this.f8974 != 1) {
            int i47 = c1449.f5130;
            int i48 = this.f8974;
            int i49 = i47 / i48;
            int i50 = c1449.f5128 / i48;
            int i51 = c1449.f5129 / i48;
            int i52 = c1449.f5127 / i48;
            boolean z = this.f8969 == 0;
            byte[] bArr6 = this.f8967;
            int[] iArr3 = this.f8959;
            Boolean bool = this.f8977;
            int i53 = 8;
            int i54 = 0;
            int i55 = 1;
            int i56 = 0;
            while (i56 < i49) {
                if (c1449.f5131) {
                    if (i54 >= i49) {
                        i55++;
                        if (i55 == 2) {
                            i54 = 4;
                        } else if (i55 == 3) {
                            i53 = 4;
                            i54 = 2;
                        } else if (i55 == 4) {
                            i54 = 1;
                            i53 = 2;
                        }
                    }
                    i = i54 + i53;
                } else {
                    i = i54;
                    i54 = i56;
                }
                int i57 = i54 + i50;
                int i58 = i49;
                boolean z2 = i48 == 1;
                if (i57 < this.f8975) {
                    int i59 = this.f8976;
                    int i60 = i57 * i59;
                    int i61 = i60 + i52;
                    int i62 = i61 + i51;
                    int i63 = i60 + i59;
                    if (i63 < i62) {
                        i62 = i63;
                    }
                    int i64 = i56 * i48 * c1449.f5129;
                    int[] iArr4 = this.f8968;
                    if (z2) {
                        while (i61 < i62) {
                            int i65 = i61;
                            int i66 = iArr3[bArr6[i64] & 255];
                            if (i66 != 0) {
                                iArr4[i65] = i66;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i64 += i48;
                            i61 = i65 + 1;
                        }
                    } else {
                        int iM4756 = AbstractC2784.m4756(i62, i61, i48, i64);
                        while (i61 < i62) {
                            int i67 = i61;
                            int i68 = c1449.f5129;
                            int i69 = i48;
                            int i70 = i64;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            while (true) {
                                if (i70 >= this.f8974 + i64) {
                                    i3 = i62;
                                    break;
                                }
                                byte[] bArr7 = this.f8967;
                                i3 = i62;
                                if (i70 >= bArr7.length || i70 >= iM4756) {
                                    break;
                                }
                                int i76 = this.f8959[bArr7[i70] & 255];
                                if (i76 != 0) {
                                    i71 += (i76 >> 24) & 255;
                                    i72 += (i76 >> 16) & 255;
                                    i73 += (i76 >> 8) & 255;
                                    i74 += i76 & 255;
                                    i75++;
                                }
                                i70++;
                                i62 = i3;
                            }
                            int i77 = i64 + i68;
                            int i78 = i77;
                            while (i78 < this.f8974 + i77) {
                                byte[] bArr8 = this.f8967;
                                int i79 = i77;
                                if (i78 >= bArr8.length || i78 >= iM4756) {
                                    break;
                                }
                                int i80 = this.f8959[bArr8[i78] & 255];
                                if (i80 != 0) {
                                    i71 += (i80 >> 24) & 255;
                                    i72 += (i80 >> 16) & 255;
                                    i73 += (i80 >> 8) & 255;
                                    i74 += i80 & 255;
                                    i75++;
                                }
                                i78++;
                                i77 = i79;
                            }
                            int i81 = i75 == 0 ? 0 : ((i71 / i75) << 24) | ((i72 / i75) << 16) | ((i73 / i75) << 8) | (i74 / i75);
                            if (i81 != 0) {
                                iArr4[i67] = i81;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i64 += i69;
                            i61 = i67 + 1;
                            i48 = i69;
                            i62 = i3;
                        }
                    }
                    i2 = i48;
                } else {
                    i2 = i48;
                }
                i56++;
                i54 = i;
                i49 = i58;
                i51 = i51;
                i50 = i50;
                i48 = i2;
            }
            if (this.f8977 == null) {
                this.f8977 = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i82 = c1449.f5130;
            int i83 = c1449.f5128;
            int i84 = c1449.f5129;
            int i85 = c1449.f5127;
            byte b4 = this.f8969 == 0 ? (byte) 1 : 0;
            byte[] bArr9 = this.f8967;
            int[] iArr5 = this.f8959;
            byte b5 = -1;
            for (int i86 = 0; i86 < i82; i86++) {
                int i87 = this.f8976;
                int i88 = (i86 + i83) * i87;
                int i89 = i88 + i85;
                int i90 = i89 + i84;
                int i91 = i88 + i87;
                if (i91 < i90) {
                    i90 = i91;
                }
                int i92 = c1449.f5129 * i86;
                while (i89 < i90) {
                    byte b6 = bArr9[i92];
                    int i93 = b6 & 255;
                    if (i93 != b5) {
                        int i94 = iArr5[i93];
                        if (i94 != 0) {
                            this.f8968[i89] = i94;
                        } else {
                            b5 = b6;
                        }
                    }
                    i92++;
                    i89++;
                }
            }
            Boolean bool2 = this.f8977;
            this.f8977 = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f8977 != null || b4 == 0 || b5 == -1));
        }
        if (this.f8972 && ((i4 = c1449.f5133) == 0 || i4 == 1)) {
            if (this.f8971 == null) {
                this.f8971 = m4782();
            }
            Bitmap bitmap3 = this.f8971;
            int i95 = this.f8975;
            int i96 = this.f8976;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i96, 0, 0, i96, i95);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapM4782 = m4782();
        int i97 = this.f8975;
        int i98 = this.f8976;
        bitmapM4782.setPixels(iArr, 0, i98, 0, 0, i98, i97);
        return bitmapM4782;
    }
}
