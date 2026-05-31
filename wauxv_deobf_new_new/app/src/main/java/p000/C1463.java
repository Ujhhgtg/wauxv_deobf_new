package p000;

import android.util.Log;
import com.umeng.analytics.pro.bc;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1463 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ByteBuffer f5204;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1462 f5205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final byte[] f5203 = new byte[bc.e];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5206 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m3255() {
        return this.f5205.f5193 != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1462 m3256() {
        byte[] bArr;
        if (this.f5204 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m3255()) {
            return this.f5205;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m3257());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f5205.f5197 = this.f5204.getShort();
            this.f5205.f5198 = this.f5204.getShort();
            int iM3257 = m3257();
            C1462 c1462 = this.f5205;
            c1462.f5199 = (iM3257 & 128) != 0;
            c1462.f5200 = (int) Math.pow(2.0d, (iM3257 & 7) + 1);
            this.f5205.f5201 = m3257();
            C1462 c1463 = this.f5205;
            m3257();
            c1463.getClass();
            if (this.f5205.f5199 && !m3255()) {
                C1462 c1464 = this.f5205;
                c1464.f5192 = m3259(c1464.f5200);
                C1462 c1465 = this.f5205;
                c1465.f5202 = c1465.f5192[c1465.f5201];
            }
        } else {
            this.f5205.f5193 = 1;
        }
        if (!m3255()) {
            boolean z = false;
            while (!z && !m3255() && this.f5205.f5194 <= Integer.MAX_VALUE) {
                int iM3258 = m3257();
                if (iM3258 == 33) {
                    int iM3259 = m3257();
                    if (iM3259 == 1) {
                        m3260();
                    } else if (iM3259 == 249) {
                        this.f5205.f5195 = new C1457();
                        m3257();
                        int iM32510 = m3257();
                        C1457 c1457 = this.f5205.f5195;
                        int i2 = (iM32510 & 28) >> 2;
                        c1457.f5162 = i2;
                        if (i2 == 0) {
                            c1457.f5162 = 1;
                        }
                        c1457.f5161 = (iM32510 & 1) != 0;
                        short s = this.f5204.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C1457 c1458 = this.f5205.f5195;
                        c1458.f5164 = s * 10;
                        c1458.f5163 = m3257();
                        m3257();
                    } else if (iM3259 == 254) {
                        m3260();
                    } else if (iM3259 != 255) {
                        m3260();
                    } else {
                        m3258();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f5203;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m3258();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f5205.getClass();
                                }
                                if (this.f5206 <= 0) {
                                    break;
                                }
                            } while (!m3255());
                        } else {
                            m3260();
                        }
                    }
                } else if (iM3258 == 44) {
                    C1462 c1466 = this.f5205;
                    if (c1466.f5195 == null) {
                        c1466.f5195 = new C1457();
                    }
                    c1466.f5195.f5156 = this.f5204.getShort();
                    this.f5205.f5195.f5157 = this.f5204.getShort();
                    this.f5205.f5195.f5158 = this.f5204.getShort();
                    this.f5205.f5195.f5159 = this.f5204.getShort();
                    int iM32511 = m3257();
                    boolean z2 = (iM32511 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM32511 & 7) + 1);
                    C1457 c1459 = this.f5205.f5195;
                    c1459.f5160 = (iM32511 & 64) != 0;
                    if (z2) {
                        c1459.f5166 = m3259(iPow);
                    } else {
                        c1459.f5166 = null;
                    }
                    this.f5205.f5195.f5165 = this.f5204.position();
                    m3257();
                    m3260();
                    if (!m3255()) {
                        C1462 c1467 = this.f5205;
                        c1467.f5194++;
                        c1467.f5196.add(c1467.f5195);
                    }
                } else if (iM3258 != 59) {
                    this.f5205.f5193 = 1;
                } else {
                    z = true;
                }
            }
            C1462 c1468 = this.f5205;
            if (c1468.f5194 < 0) {
                c1468.f5193 = 1;
            }
        }
        return this.f5205;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3257() {
        try {
            return this.f5204.get() & 255;
        } catch (Exception unused) {
            this.f5205.f5193 = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3258() {
        int iM3257 = m3257();
        this.f5206 = iM3257;
        if (iM3257 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f5206;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f5204.get(this.f5203, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f5206, e);
                }
                this.f5205.f5193 = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int[] m3259(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f5204.get(bArr);
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
            this.f5205.f5193 = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3260() {
        int iM3257;
        do {
            iM3257 = m3257();
            this.f5204.position(Math.min(this.f5204.position() + iM3257, this.f5204.limit()));
        } while (iM3257 > 0);
    }
}
