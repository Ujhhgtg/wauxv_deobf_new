package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲇᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1199 extends AbstractC1196 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float f4333;

    public C1199(float f) {
        this.f4333 = f;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        c1353.m3181(1);
        float f = this.f4333;
        if (f != 0.0d) {
            c1353.m3179(4, 0);
            ByteBuffer byteBuffer = c1353.f4834;
            int i = c1353.f4835 - 4;
            c1353.f4835 = i;
            byteBuffer.putFloat(i, f);
            c1353.m3180(0);
        }
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
