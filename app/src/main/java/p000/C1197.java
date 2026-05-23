package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲈᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1197 extends AbstractC1195 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final double f4335;

    public C1197(double d) {
        super(4);
        this.f4335 = d;
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        c1353.m3078(1);
        double d = this.f4335;
        if (d != 0.0d) {
            c1353.m3076(8, 0);
            ByteBuffer byteBuffer = c1353.f4837;
            int i = c1353.f4838 - 8;
            c1353.f4838 = i;
            byteBuffer.putDouble(i, d);
            c1353.m3077(0);
        }
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
