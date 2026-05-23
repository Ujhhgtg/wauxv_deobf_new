package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᛸᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2837 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f9103;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f9104;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean f9105;

    public C2837(String str, int i, boolean z) {
        super(4);
        this.f9103 = str;
        this.f9104 = i;
        this.f9105 = z;
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        String str = this.f9103;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified");
        }
        if (str.length() == 0 && this.f9104 != 5) {
            this.f9104 = 5;
        }
        int iM3070 = c1353.m3070(str);
        int i = this.f9104;
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
        c1353.m3078(3);
        c1353.m3068(0, iM3070);
        boolean z = this.f9105;
        if (z) {
            c1353.m3076(1, 0);
            ByteBuffer byteBuffer = c1353.f4837;
            int i2 = c1353.f4838 - 1;
            c1353.f4838 = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            c1353.m3077(2);
        } else {
            c1353.getClass();
        }
        c1353.m3066(b, 1);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
