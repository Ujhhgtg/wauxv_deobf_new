package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᛸᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1199 extends AbstractC1195 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f4337;

    public C1199(int i) {
        super(4);
        this.f4337 = i;
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        c1353.m3078(1);
        int i = this.f4337;
        if (i != 0) {
            c1353.m3076(4, 0);
            ByteBuffer byteBuffer = c1353.f4837;
            int i2 = c1353.f4838 - 4;
            c1353.f4838 = i2;
            byteBuffer.putInt(i2, i);
            c1353.m3077(0);
        }
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
