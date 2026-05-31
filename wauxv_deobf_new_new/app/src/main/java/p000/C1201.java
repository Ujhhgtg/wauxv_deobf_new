package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲈᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1201 extends AbstractC1196 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final long f4335;

    public C1201(long j) {
        this.f4335 = j;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        c1353.m3181(1);
        long j = this.f4335;
        if (j != 0) {
            c1353.m3179(8, 0);
            ByteBuffer byteBuffer = c1353.f4834;
            int i = c1353.f4835 - 8;
            c1353.f4835 = i;
            byteBuffer.putLong(i, j);
            c1353.m3180(0);
        }
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
