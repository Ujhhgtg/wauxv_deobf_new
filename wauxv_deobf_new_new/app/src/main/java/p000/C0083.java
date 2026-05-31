package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0083 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1084;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f1085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1086;

    public /* synthetic */ C0083(byte b, int i) {
        this.f1084 = i;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int mo1106(C1353 c1353) {
        switch (this.f1084) {
            case 0:
                int i = this.f1085;
                if (i == 0) {
                    throw new IllegalArgumentException("modifiers must not be 0");
                }
                byte bM2790 = AbstractC1095.m2790(this.f1086);
                c1353.m3181(2);
                if (i != 0) {
                    c1353.m3179(4, 0);
                    ByteBuffer byteBuffer = c1353.f4834;
                    int i2 = c1353.f4835 - 4;
                    c1353.f4835 = i2;
                    byteBuffer.putInt(i2, i);
                    c1353.m3180(0);
                }
                c1353.m3169(bM2790, 1);
                int iM3175 = c1353.m3175();
                c1353.m3177(iM3175);
                return iM3175;
            default:
                int i3 = this.f1085;
                int i4 = this.f1086;
                c1353.m3181(2);
                if (i4 != 0) {
                    c1353.m3179(4, 0);
                    ByteBuffer byteBuffer2 = c1353.f4834;
                    int i5 = c1353.f4835 - 4;
                    c1353.f4835 = i5;
                    byteBuffer2.putInt(i5, i4);
                    c1353.m3180(1);
                }
                if (i3 != 0) {
                    c1353.m3179(4, 0);
                    ByteBuffer byteBuffer3 = c1353.f4834;
                    int i6 = c1353.f4835 - 4;
                    c1353.f4835 = i6;
                    byteBuffer3.putInt(i6, i3);
                    c1353.m3180(0);
                }
                int iM3176 = c1353.m3175();
                c1353.m3177(iM3176);
                return iM3176;
        }
    }

    public C0083(int i) {
        this.f1084 = 1;
        this.f1085 = i;
        this.f1086 = i;
    }
}
