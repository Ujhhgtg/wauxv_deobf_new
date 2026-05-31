package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲇᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1198 extends AbstractC1196 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final double f4332;

    public C1198(double d) {
        this.f4332 = d;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        c1353.m3181(1);
        double d = this.f4332;
        if (d != 0.0d) {
            c1353.m3179(8, 0);
            ByteBuffer byteBuffer = c1353.f4834;
            int i = c1353.f4835 - 8;
            c1353.f4835 = i;
            byteBuffer.putDouble(i, d);
            c1353.m3180(0);
        }
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
