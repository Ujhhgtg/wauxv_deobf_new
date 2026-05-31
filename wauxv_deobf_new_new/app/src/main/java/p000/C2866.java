package p000;

import android.graphics.Bitmap;
import android.util.Log;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2866 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int[] f9120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0519 f9122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ByteBuffer f9123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public byte[] f9124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public short[] f9125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public byte[] f9126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte[] f9127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte[] f9128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int[] f9129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f9130;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C1462 f9131;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Bitmap f9132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean f9133;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f9134;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f9135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int f9136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int f9137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public Boolean f9138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int[] f9121 = new int[bc.e];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public Bitmap.Config f9139 = Bitmap.Config.ARGB_8888;

    public C2866(C0519 c0519, C1462 c1462, ByteBuffer byteBuffer, int i) {
        this.f9122 = c0519;
        this.f9131 = new C1462();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f9134 = 0;
                this.f9131 = c1462;
                this.f9130 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f9123 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f9123.order(ByteOrder.LITTLE_ENDIAN);
                this.f9133 = false;
                Iterator it = c1462.f5196.iterator();
                while (it.hasNext()) {
                    if (((C1457) it.next()).f5162 == 3) {
                        this.f9133 = true;
                        break;
                    }
                }
                this.f9135 = iHighestOneBit;
                int i2 = c1462.f5197;
                this.f9137 = i2 / iHighestOneBit;
                int i3 = c1462.f5198;
                this.f9136 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C1893 c1893 = (C1893) this.f9122.f2209;
                this.f9128 = c1893 == null ? new byte[i4] : (byte[]) c1893.m3818(i4, byte[].class);
                C0519 c05110 = this.f9122;
                int i5 = this.f9137 * this.f9136;
                C1893 c1894 = (C1893) c05110.f2209;
                this.f9129 = c1894 == null ? new int[i5] : (int[]) c1894.m3818(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Bitmap m4815() {
        Boolean bool = this.f9138;
        Bitmap bitmapMo1608 = ((InterfaceC0399) this.f9122.f2208).mo1608(this.f9137, this.f9136, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f9139);
        bitmapMo1608.setHasAlpha(true);
        return bitmapMo1608;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final synchronized Bitmap m4816() {
        try {
            if (this.f9131.f5194 <= 0 || this.f9130 < 0) {
                if (Log.isLoggable("ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ", 3)) {
                    Log.d("ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ", "Unable to decode frame, frameCount=" + this.f9131.f5194 + ", framePointer=" + this.f9130);
                }
                this.f9134 = 1;
            }
            int i = this.f9134;
            if (i != 1 && i != 2) {
                this.f9134 = 0;
                if (this.f9124 == null) {
                    C1893 c1893 = (C1893) this.f9122.f2209;
                    this.f9124 = c1893 == null ? new byte[255] : (byte[]) c1893.m3818(255, byte[].class);
                }
                C1457 c1457 = (C1457) this.f9131.f5196.get(this.f9130);
                int i2 = this.f9130 - 1;
                C1457 c1458 = i2 >= 0 ? (C1457) this.f9131.f5196.get(i2) : null;
                int[] iArr = c1457.f5166;
                if (iArr == null) {
                    iArr = this.f9131.f5192;
                }
                this.f9120 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ", 3)) {
                        Log.d("ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ", "No valid color table found for frame #" + this.f9130);
                    }
                    this.f9134 = 1;
                    return null;
                }
                if (c1457.f5161) {
                    System.arraycopy(iArr, 0, this.f9121, 0, iArr.length);
                    int[] iArr2 = this.f9121;
                    this.f9120 = iArr2;
                    iArr2[c1457.f5163] = 0;
                    if (c1457.f5162 == 2 && this.f9130 == 0) {
                        this.f9138 = Boolean.TRUE;
                    }
                }
                return m4818(c1457, c1458);
            }
            if (Log.isLoggable("ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ", 3)) {
                Log.d("ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᤝᲇ", "Unable to decode frame, status=" + this.f9134);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4817(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f9139 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
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
    public final Bitmap m4818(C1457 c1457, C1457 c1458) {
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
        C0519 c0519 = this.f9122;
        byte b2 = 0;
        int[] iArr2 = this.f9129;
        if (c1458 == null) {
            Bitmap bitmap2 = this.f9132;
            if (bitmap2 != null) {
                ((InterfaceC0399) c0519.f2208).mo1609(bitmap2);
            }
            this.f9132 = null;
            Arrays.fill(iArr2, 0);
        }
        if (c1458 != null && c1458.f5162 == 3 && this.f9132 == null) {
            Arrays.fill(iArr2, 0);
        }
        if (c1458 != null && (i6 = c1458.f5162) > 0) {
            if (i6 == 2) {
                if (c1457.f5161) {
                    i7 = 0;
                } else {
                    C1462 c1462 = this.f9131;
                    i7 = c1462.f5202;
                    if (c1457.f5166 != null && c1462.f5201 == c1457.f5163) {
                        i7 = 0;
                    }
                }
                int i8 = c1458.f5159;
                int i9 = this.f9135;
                int i10 = i8 / i9;
                int i11 = c1458.f5157 / i9;
                int i12 = c1458.f5158 / i9;
                int i13 = c1458.f5156 / i9;
                int i14 = this.f9137;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr2[i18] = i7;
                    }
                    i15 += this.f9137;
                }
            } else if (i6 == 3 && (bitmap = this.f9132) != null) {
                int i19 = this.f9136;
                int i20 = this.f9137;
                bitmap.getPixels(iArr2, 0, i20, 0, 0, i20, i19);
            }
        }
        this.f9123.position(c1457.f5165);
        int i21 = c1457.f5158 * c1457.f5159;
        byte[] bArr = this.f9128;
        if (bArr == null || bArr.length < i21) {
            C1893 c1893 = (C1893) c0519.f2209;
            this.f9128 = c1893 == null ? new byte[i21] : (byte[]) c1893.m3818(i21, byte[].class);
        }
        byte[] bArr2 = this.f9128;
        if (this.f9125 == null) {
            this.f9125 = new short[4096];
        }
        short[] sArr = this.f9125;
        if (this.f9126 == null) {
            this.f9126 = new byte[4096];
        }
        byte[] bArr3 = this.f9126;
        if (this.f9127 == null) {
            this.f9127 = new byte[r.a.a];
        }
        byte[] bArr4 = this.f9127;
        int i22 = this.f9123.get() & 255;
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
            i23 = i23;
        }
        int i30 = i23;
        byte[] bArr5 = this.f9124;
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
                b = b2;
                break;
            }
            if (i32 == 0) {
                i5 = -1;
                int i43 = this.f9123.get() & 255;
                if (i43 > 0) {
                    ByteBuffer byteBuffer = this.f9123;
                    byteBuffer.get(this.f9124, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    this.f9134 = 3;
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
                    i42 = i5;
                } else {
                    if (i45 == i25) {
                        i39 = i44;
                        b2 = 0;
                        break;
                    }
                    int i46 = i44;
                    if (i42 == i5) {
                        bArr2[i36] = bArr3[i45];
                        i36++;
                        i31++;
                        i42 = i45;
                        i37 = i42;
                        i44 = i46;
                    } else {
                        if (i45 >= i40) {
                            bArr4[i38] = (byte) i37;
                            i38++;
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
        Arrays.fill(bArr2, i36, i21, b);
        if (c1457.f5160 || this.f9135 != i30) {
            int i47 = c1457.f5159;
            int i48 = this.f9135;
            int i49 = i47 / i48;
            int i50 = c1457.f5157 / i48;
            int i51 = c1457.f5158 / i48;
            int i52 = c1457.f5156 / i48;
            boolean z = this.f9130 == 0;
            byte[] bArr6 = this.f9128;
            int[] iArr3 = this.f9120;
            Boolean bool = this.f9138;
            int i53 = 8;
            int i54 = 0;
            int i55 = 1;
            int i56 = 0;
            while (i56 < i49) {
                if (c1457.f5160) {
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
                if (i57 < this.f9136) {
                    int i59 = this.f9137;
                    int i60 = i57 * i59;
                    int i61 = i60 + i52;
                    int i62 = i61 + i51;
                    int i63 = i60 + i59;
                    if (i63 < i62) {
                        i62 = i63;
                    }
                    int i64 = i56 * i48 * c1457.f5158;
                    int[] iArr4 = this.f9129;
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
                        int iM4789 = AbstractC2844.m4789(i62, i61, i48, i64);
                        while (i61 < i62) {
                            int i67 = i61;
                            int i68 = c1457.f5158;
                            int i69 = i48;
                            int i70 = i64;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            while (true) {
                                if (i70 >= this.f9135 + i64) {
                                    i3 = i62;
                                    break;
                                }
                                byte[] bArr7 = this.f9128;
                                i3 = i62;
                                if (i70 >= bArr7.length || i70 >= iM4789) {
                                    break;
                                }
                                int i76 = this.f9120[bArr7[i70] & 255];
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
                            while (i78 < this.f9135 + i77) {
                                byte[] bArr8 = this.f9128;
                                int i79 = i77;
                                if (i78 >= bArr8.length || i78 >= iM4789) {
                                    break;
                                }
                                int i80 = this.f9120[bArr8[i78] & 255];
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
            if (this.f9138 == null) {
                this.f9138 = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i82 = c1457.f5159;
            int i83 = c1457.f5157;
            int i84 = c1457.f5158;
            int i85 = c1457.f5156;
            byte b4 = this.f9130 == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.f9128;
            int[] iArr5 = this.f9120;
            byte b5 = -1;
            for (int i86 = b; i86 < i82; i86++) {
                int i87 = this.f9137;
                int i88 = (i86 + i83) * i87;
                int i89 = i88 + i85;
                int i90 = i89 + i84;
                int i91 = i88 + i87;
                if (i91 < i90) {
                    i90 = i91;
                }
                int i92 = c1457.f5158 * i86;
                while (i89 < i90) {
                    byte b6 = bArr9[i92];
                    int i93 = b6 & 255;
                    if (i93 != b5) {
                        int i94 = iArr5[i93];
                        if (i94 != 0) {
                            this.f9129[i89] = i94;
                        } else {
                            b5 = b6;
                        }
                    }
                    i92++;
                    i89++;
                }
            }
            Boolean bool2 = this.f9138;
            this.f9138 = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f9138 != null || b4 == 0 || b5 == -1));
        }
        if (this.f9133 && ((i4 = c1457.f5162) == 0 || i4 == 1)) {
            if (this.f9132 == null) {
                this.f9132 = m4815();
            }
            Bitmap bitmap3 = this.f9132;
            int i95 = this.f9136;
            int i96 = this.f9137;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i96, 0, 0, i96, i95);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapM4815 = m4815();
        int i97 = this.f9136;
        int i98 = this.f9137;
        bitmapM4815.setPixels(iArr, 0, i98, 0, 0, i98, i97);
        return bitmapM4815;
    }
}
