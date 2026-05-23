package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲀᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1663 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f5619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f5620;

    public C1663(int i) {
        super(4);
        this.f5619 = i;
        this.f5620 = i;
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int i = this.f5619;
        int i2 = this.f5620;
        c1353.m3078(2);
        if (i2 != 0) {
            c1353.m3076(4, 0);
            ByteBuffer byteBuffer = c1353.f4837;
            int i3 = c1353.f4838 - 4;
            c1353.f4838 = i3;
            byteBuffer.putInt(i3, i2);
            c1353.m3077(1);
        }
        if (i != 0) {
            c1353.m3076(4, 0);
            ByteBuffer byteBuffer2 = c1353.f4837;
            int i4 = c1353.f4838 - 4;
            c1353.f4838 = i4;
            byteBuffer2.putInt(i4, i);
            c1353.m3077(0);
        }
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
