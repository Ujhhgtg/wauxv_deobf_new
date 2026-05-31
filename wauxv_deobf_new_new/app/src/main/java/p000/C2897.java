package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤝᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2897 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9265;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f9266;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean f9267;

    public C2897(String str, int i, boolean z) {
        this.f9265 = str;
        this.f9266 = i;
        this.f9267 = z;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        String str = this.f9265;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified");
        }
        if (str.length() == 0 && this.f9266 != 5) {
            this.f9266 = 5;
        }
        int iM3173 = c1353.m3173(str);
        int i = this.f9266;
        byte b = 1;
        if (i != 1) {
            byte b2 = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    b2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw null;
                        }
                        b = b2;
                    }
                } else {
                    b = b2;
                }
            }
        } else {
            b = 0;
        }
        c1353.m3181(3);
        c1353.m3171(0, iM3173);
        boolean z = this.f9267;
        if (z) {
            c1353.m3179(1, 0);
            ByteBuffer byteBuffer = c1353.f4834;
            int i2 = c1353.f4835 - 1;
            c1353.f4835 = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            c1353.m3180(2);
        } else {
            c1353.getClass();
        }
        c1353.m3169(b, 1);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
