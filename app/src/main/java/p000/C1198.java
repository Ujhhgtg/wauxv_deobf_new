package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲈᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1198 extends AbstractC1195 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float f4336;

    public C1198(float f) {
        super(4);
        this.f4336 = f;
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        c1353.m3078(1);
        float f = this.f4336;
        if (f != 0.0d) {
            c1353.m3076(4, 0);
            ByteBuffer byteBuffer = c1353.f4837;
            int i = c1353.f4838 - 4;
            c1353.f4838 = i;
            byteBuffer.putFloat(i, f);
            c1353.m3077(0);
        }
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
