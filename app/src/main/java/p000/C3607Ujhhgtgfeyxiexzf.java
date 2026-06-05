package p000;

import android.util.Log;
import com.umeng.analytics.pro.bc;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3607Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public ByteBuffer f11221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C3579feyxiexzfUjhhgtg f11222Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final byte[] f11220Ujhhgtgfeyxiexzf = new byte[bc.e];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f11223Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m5203Ujhhgtgfeyxiexzf() {
        return this.f11222Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf != 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3579feyxiexzfUjhhgtg m5204Ujhhgtgfeyxiexzf() {
        byte[] bArr;
        if (this.f11221Ujhhgtgfeyxiexzf == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m5203Ujhhgtgfeyxiexzf()) {
            return this.f11222Ujhhgtgfeyxiexzf;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m5205Ujhhgtgfeyxiexzf());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f11222Ujhhgtgfeyxiexzf.f11119Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.getShort();
            this.f11222Ujhhgtgfeyxiexzf.f11120Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.getShort();
            int iM5205Ujhhgtgfeyxiexzf = m5205Ujhhgtgfeyxiexzf();
            C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg = this.f11222Ujhhgtgfeyxiexzf;
            c3579feyxiexzfUjhhgtg.f11121Ujhhgtgfeyxiexzf = (iM5205Ujhhgtgfeyxiexzf & 128) != 0;
            c3579feyxiexzfUjhhgtg.f11122Ujhhgtgfeyxiexzf = (int) Math.pow(2.0d, (iM5205Ujhhgtgfeyxiexzf & 7) + 1);
            this.f11222Ujhhgtgfeyxiexzf.f11123Ujhhgtgfeyxiexzf = m5205Ujhhgtgfeyxiexzf();
            C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg2 = this.f11222Ujhhgtgfeyxiexzf;
            m5205Ujhhgtgfeyxiexzf();
            c3579feyxiexzfUjhhgtg2.getClass();
            if (this.f11222Ujhhgtgfeyxiexzf.f11121Ujhhgtgfeyxiexzf && !m5203Ujhhgtgfeyxiexzf()) {
                C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg3 = this.f11222Ujhhgtgfeyxiexzf;
                c3579feyxiexzfUjhhgtg3.f11114Ujhhgtgfeyxiexzf = m5207Ujhhgtgfeyxiexzf(c3579feyxiexzfUjhhgtg3.f11122Ujhhgtgfeyxiexzf);
                C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg4 = this.f11222Ujhhgtgfeyxiexzf;
                c3579feyxiexzfUjhhgtg4.f11124Ujhhgtgfeyxiexzf = c3579feyxiexzfUjhhgtg4.f11114Ujhhgtgfeyxiexzf[c3579feyxiexzfUjhhgtg4.f11123Ujhhgtgfeyxiexzf];
            }
        } else {
            this.f11222Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf = 1;
        }
        if (!m5203Ujhhgtgfeyxiexzf()) {
            boolean z = false;
            while (!z && !m5203Ujhhgtgfeyxiexzf() && this.f11222Ujhhgtgfeyxiexzf.f11116Ujhhgtgfeyxiexzf <= Integer.MAX_VALUE) {
                int iM5205Ujhhgtgfeyxiexzf2 = m5205Ujhhgtgfeyxiexzf();
                if (iM5205Ujhhgtgfeyxiexzf2 == 33) {
                    int iM5205Ujhhgtgfeyxiexzf3 = m5205Ujhhgtgfeyxiexzf();
                    if (iM5205Ujhhgtgfeyxiexzf3 == 1) {
                        m5208Ujhhgtgfeyxiexzf();
                    } else if (iM5205Ujhhgtgfeyxiexzf3 == 249) {
                        this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf = new C3581Ujhhgtgfeyxiexzf();
                        m5205Ujhhgtgfeyxiexzf();
                        int iM5205Ujhhgtgfeyxiexzf4 = m5205Ujhhgtgfeyxiexzf();
                        C3581Ujhhgtgfeyxiexzf c3581Ujhhgtgfeyxiexzf = this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf;
                        int i2 = (iM5205Ujhhgtgfeyxiexzf4 & 28) >> 2;
                        c3581Ujhhgtgfeyxiexzf.f11147Ujhhgtgfeyxiexzf = i2;
                        if (i2 == 0) {
                            c3581Ujhhgtgfeyxiexzf.f11147Ujhhgtgfeyxiexzf = 1;
                        }
                        c3581Ujhhgtgfeyxiexzf.f11146Ujhhgtgfeyxiexzf = (iM5205Ujhhgtgfeyxiexzf4 & 1) != 0;
                        short s = this.f11221Ujhhgtgfeyxiexzf.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C3581Ujhhgtgfeyxiexzf c3581Ujhhgtgfeyxiexzf2 = this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf;
                        c3581Ujhhgtgfeyxiexzf2.f11149Ujhhgtgfeyxiexzf = s * 10;
                        c3581Ujhhgtgfeyxiexzf2.f11148Ujhhgtgfeyxiexzf = m5205Ujhhgtgfeyxiexzf();
                        m5205Ujhhgtgfeyxiexzf();
                    } else if (iM5205Ujhhgtgfeyxiexzf3 == 254) {
                        m5208Ujhhgtgfeyxiexzf();
                    } else if (iM5205Ujhhgtgfeyxiexzf3 != 255) {
                        m5208Ujhhgtgfeyxiexzf();
                    } else {
                        m5206Ujhhgtgfeyxiexzf();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f11220Ujhhgtgfeyxiexzf;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m5206Ujhhgtgfeyxiexzf();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f11222Ujhhgtgfeyxiexzf.getClass();
                                }
                                if (this.f11223Ujhhgtgfeyxiexzf <= 0) {
                                    break;
                                }
                            } while (!m5203Ujhhgtgfeyxiexzf());
                        } else {
                            m5208Ujhhgtgfeyxiexzf();
                        }
                    }
                } else if (iM5205Ujhhgtgfeyxiexzf2 == 44) {
                    C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg5 = this.f11222Ujhhgtgfeyxiexzf;
                    if (c3579feyxiexzfUjhhgtg5.f11117Ujhhgtgfeyxiexzf == null) {
                        c3579feyxiexzfUjhhgtg5.f11117Ujhhgtgfeyxiexzf = new C3581Ujhhgtgfeyxiexzf();
                    }
                    c3579feyxiexzfUjhhgtg5.f11117Ujhhgtgfeyxiexzf.f11141Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.getShort();
                    this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf.f11142Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.getShort();
                    this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf.f11143Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.getShort();
                    this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf.f11144Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.getShort();
                    int iM5205Ujhhgtgfeyxiexzf5 = m5205Ujhhgtgfeyxiexzf();
                    boolean z2 = (iM5205Ujhhgtgfeyxiexzf5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM5205Ujhhgtgfeyxiexzf5 & 7) + 1);
                    C3581Ujhhgtgfeyxiexzf c3581Ujhhgtgfeyxiexzf3 = this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf;
                    c3581Ujhhgtgfeyxiexzf3.f11145Ujhhgtgfeyxiexzf = (iM5205Ujhhgtgfeyxiexzf5 & 64) != 0;
                    if (z2) {
                        c3581Ujhhgtgfeyxiexzf3.f11151Ujhhgtgfeyxiexzf = m5207Ujhhgtgfeyxiexzf(iPow);
                    } else {
                        c3581Ujhhgtgfeyxiexzf3.f11151Ujhhgtgfeyxiexzf = null;
                    }
                    this.f11222Ujhhgtgfeyxiexzf.f11117Ujhhgtgfeyxiexzf.f11150Ujhhgtgfeyxiexzf = this.f11221Ujhhgtgfeyxiexzf.position();
                    m5205Ujhhgtgfeyxiexzf();
                    m5208Ujhhgtgfeyxiexzf();
                    if (!m5203Ujhhgtgfeyxiexzf()) {
                        C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg6 = this.f11222Ujhhgtgfeyxiexzf;
                        c3579feyxiexzfUjhhgtg6.f11116Ujhhgtgfeyxiexzf++;
                        c3579feyxiexzfUjhhgtg6.f11118Ujhhgtgfeyxiexzf.add(c3579feyxiexzfUjhhgtg6.f11117Ujhhgtgfeyxiexzf);
                    }
                } else if (iM5205Ujhhgtgfeyxiexzf2 != 59) {
                    this.f11222Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf = 1;
                } else {
                    z = true;
                }
            }
            C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg7 = this.f11222Ujhhgtgfeyxiexzf;
            if (c3579feyxiexzfUjhhgtg7.f11116Ujhhgtgfeyxiexzf < 0) {
                c3579feyxiexzfUjhhgtg7.f11115Ujhhgtgfeyxiexzf = 1;
            }
        }
        return this.f11222Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m5205Ujhhgtgfeyxiexzf() {
        try {
            return this.f11221Ujhhgtgfeyxiexzf.get() & 255;
        } catch (Exception unused) {
            this.f11222Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m5206Ujhhgtgfeyxiexzf() {
        int iM5205Ujhhgtgfeyxiexzf = m5205Ujhhgtgfeyxiexzf();
        this.f11223Ujhhgtgfeyxiexzf = iM5205Ujhhgtgfeyxiexzf;
        if (iM5205Ujhhgtgfeyxiexzf <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f11223Ujhhgtgfeyxiexzf;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f11221Ujhhgtgfeyxiexzf.get(this.f11220Ujhhgtgfeyxiexzf, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f11223Ujhhgtgfeyxiexzf, e);
                }
                this.f11222Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int[] m5207Ujhhgtgfeyxiexzf(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f11221Ujhhgtgfeyxiexzf.get(bArr);
            iArr = new int[bc.e];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f11222Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m5208Ujhhgtgfeyxiexzf() {
        int iM5205Ujhhgtgfeyxiexzf;
        do {
            iM5205Ujhhgtgfeyxiexzf = m5205Ujhhgtgfeyxiexzf();
            this.f11221Ujhhgtgfeyxiexzf.position(Math.min(this.f11221Ujhhgtgfeyxiexzf.position() + iM5205Ujhhgtgfeyxiexzf, this.f11221Ujhhgtgfeyxiexzf.limit()));
        } while (iM5205Ujhhgtgfeyxiexzf > 0);
    }
}
