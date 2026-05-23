package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᤝᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3465 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final ThreadLocal f10948 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f10949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2103 f10950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile int f10951 = 0;

    public C3465(C2103 c2103, int i) {
        this.f10950 = c2103;
        this.f10949 = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1968 c1968M5061 = m5061();
        int iM3671 = c1968M5061.m3671(4);
        sb.append(Integer.toHexString(iM3671 != 0 ? ((ByteBuffer) c1968M5061.f6241).getInt(iM3671 + c1968M5061.f6238) : 0));
        sb.append(", codepoints:");
        C1968 c1968M5062 = m5061();
        int iM3672 = c1968M5062.m3671(16);
        if (iM3672 != 0) {
            int i2 = iM3672 + c1968M5062.f6238;
            i = ((ByteBuffer) c1968M5062.f6241).getInt(((ByteBuffer) c1968M5062.f6241).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m5060(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m5060(int i) {
        C1968 c1968M5061 = m5061();
        int iM3671 = c1968M5061.m3671(16);
        if (iM3671 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c1968M5061.f6241;
        int i2 = iM3671 + c1968M5061.f6238;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1968 m5061() {
        ThreadLocal threadLocal = f10948;
        C1968 c1968 = (C1968) threadLocal.get();
        if (c1968 == null) {
            c1968 = new C1968();
            threadLocal.set(c1968);
        }
        C1969 c1969 = (C1969) this.f10950.f6935;
        int iM3671 = c1969.m3671(6);
        if (iM3671 != 0) {
            int i = iM3671 + c1969.f6238;
            int i2 = (this.f10949 * 4) + ((ByteBuffer) c1969.f6241).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c1969.f6241).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c1969.f6241;
            c1968.f6241 = byteBuffer;
            if (byteBuffer != null) {
                c1968.f6238 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c1968.f6239 = i4;
                c1968.f6240 = ((ByteBuffer) c1968.f6241).getShort(i4);
                return c1968;
            }
            c1968.f6238 = 0;
            c1968.f6239 = 0;
            c1968.f6240 = 0;
        }
        return c1968;
    }
}
