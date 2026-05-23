package p000;

import android.util.Log;
import com.umeng.analytics.pro.bc;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1455 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ByteBuffer f5175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1454 f5176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final byte[] f5174 = new byte[256];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5177 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m3148() {
        return this.f5176.f5164 != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1454 m3149() {
        byte[] bArr;
        if (this.f5175 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m3148()) {
            return this.f5176;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m3150());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f5176.f5168 = this.f5175.getShort();
            this.f5176.f5169 = this.f5175.getShort();
            int iM3150 = m3150();
            C1454 c1454 = this.f5176;
            c1454.f5170 = (iM3150 & 128) != 0;
            c1454.f5171 = (int) Math.pow(2.0d, (iM3150 & 7) + 1);
            this.f5176.f5172 = m3150();
            C1454 c1455 = this.f5176;
            m3150();
            
            if (this.f5176.f5170 && !m3148()) {
                C1454 c1456 = this.f5176;
                c1456.f5163 = m3152(c1456.f5171);
                C1454 c1457 = this.f5176;
                c1457.f5173 = c1457.f5163[c1457.f5172];
            }
        } else {
            this.f5176.f5164 = 1;
        }
        if (!m3148()) {
            boolean z = false;
            while (!z && !m3148() && true) {
                int iM3151 = m3150();
                if (iM3151 == 33) {
                    int iM3152 = m3150();
                    if (iM3152 == 1) {
                        m3153();
                    } else if (iM3152 == 249) {
                        this.f5176.f5166 = new C1449();
                        m3150();
                        int iM3153 = m3150();
                        C1449 c1449 = this.f5176.f5166;
                        int i2 = (iM3153 & 28) >> 2;
                        c1449.f5133 = i2;
                        if (i2 == 0) {
                            c1449.f5133 = 1;
                        }
                        c1449.f5132 = (iM3153 & 1) != 0;
                        short s = this.f5175.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C1449 c14410 = this.f5176.f5166;
                        c14410.f5135 = s * 10;
                        c14410.f5134 = m3150();
                        m3150();
                    } else if (iM3152 == 254) {
                        m3153();
                    } else if (iM3152 != 255) {
                        m3153();
                    } else {
                        m3151();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f5174;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m3151();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    
                                }
                                if (this.f5177 <= 0) {
                                    break;
                                }
                            } while (!m3148());
                        } else {
                            m3153();
                        }
                    }
                } else if (iM3151 == 44) {
                    C1454 c1458 = this.f5176;
                    if (c1458.f5166 == null) {
                        c1458.f5166 = new C1449();
                    }
                    c1458.f5166.f5127 = this.f5175.getShort();
                    this.f5176.f5166.f5128 = this.f5175.getShort();
                    this.f5176.f5166.f5129 = this.f5175.getShort();
                    this.f5176.f5166.f5130 = this.f5175.getShort();
                    int iM3154 = m3150();
                    boolean z2 = (iM3154 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM3154 & 7) + 1);
                    C1449 c14411 = this.f5176.f5166;
                    c14411.f5131 = (iM3154 & 64) != 0;
                    if (z2) {
                        c14411.f5137 = m3152(iPow);
                    } else {
                        c14411.f5137 = null;
                    }
                    this.f5176.f5166.f5136 = this.f5175.position();
                    m3150();
                    m3153();
                    if (!m3148()) {
                        C1454 c1459 = this.f5176;
                        c1459.f5165++;
                        c1459.f5167.add(c1459.f5166);
                    }
                } else if (iM3151 != 59) {
                    this.f5176.f5164 = 1;
                } else {
                    z = true;
                }
            }
            C1454 c14510 = this.f5176;
            if (c14510.f5165 < 0) {
                c14510.f5164 = 1;
            }
        }
        return this.f5176;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3150() {
        try {
            return this.f5175.get() & 255;
        } catch (Exception unused) {
            this.f5176.f5164 = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3151() {
        int iM3150 = m3150();
        this.f5177 = iM3150;
        if (iM3150 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f5177;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f5175.get(this.f5174, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f5177, e);
                }
                this.f5176.f5164 = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int[] m3152(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f5175.get(bArr);
            iArr = new int[256];
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
            this.f5176.f5164 = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3153() {
        int iM3150;
        do {
            iM3150 = m3150();
            this.f5175.position(Math.min(this.f5175.position() + iM3150, this.f5175.limit()));
        } while (iM3150 > 0);
    }
}
