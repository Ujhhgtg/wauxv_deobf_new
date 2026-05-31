package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᤝᤞᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3521 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final ThreadLocal f11104 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f11105;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2136 f11106;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile int f11107 = 0;

    public C3521(C2136 c2136, int i) {
        this.f11106 = c2136;
        this.f11105 = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1999 c1999M5086 = m5086();
        int iM3849 = c1999M5086.m3849(4);
        sb.append(Integer.toHexString(iM3849 != 0 ? ((ByteBuffer) c1999M5086.f6315).getInt(iM3849 + c1999M5086.f6312) : 0));
        sb.append(", codepoints:");
        C1999 c1999M5087 = m5086();
        int iM38410 = c1999M5087.m3849(16);
        if (iM38410 != 0) {
            int i2 = iM38410 + c1999M5087.f6312;
            i = ((ByteBuffer) c1999M5087.f6315).getInt(((ByteBuffer) c1999M5087.f6315).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m5085(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m5085(int i) {
        C1999 c1999M5086 = m5086();
        int iM3849 = c1999M5086.m3849(16);
        if (iM3849 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c1999M5086.f6315;
        int i2 = iM3849 + c1999M5086.f6312;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1999 m5086() {
        ThreadLocal threadLocal = f11104;
        C1999 c1999 = (C1999) threadLocal.get();
        if (c1999 == null) {
            c1999 = new C1999();
            threadLocal.set(c1999);
        }
        C2000 c2000 = (C2000) this.f11106.f7059;
        int iM3849 = c2000.m3849(6);
        if (iM3849 != 0) {
            int i = iM3849 + c2000.f6312;
            int i2 = (this.f11105 * 4) + ((ByteBuffer) c2000.f6315).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c2000.f6315).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c2000.f6315;
            c1999.f6315 = byteBuffer;
            if (byteBuffer != null) {
                c1999.f6312 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c1999.f6313 = i4;
                c1999.f6314 = ((ByteBuffer) c1999.f6315).getShort(i4);
                return c1999;
            }
            c1999.f6312 = 0;
            c1999.f6313 = 0;
            c1999.f6314 = 0;
        }
        return c1999;
    }
}
