package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲈᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1200 extends AbstractC1196 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f4334;

    public C1200(int i) {
        this.f4334 = i;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        c1353.m3181(1);
        int i = this.f4334;
        if (i != 0) {
            c1353.m3179(4, 0);
            ByteBuffer byteBuffer = c1353.f4834;
            int i2 = c1353.f4835 - 4;
            c1353.f4835 = i2;
            byteBuffer.putInt(i2, i);
            c1353.m3180(0);
        }
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
