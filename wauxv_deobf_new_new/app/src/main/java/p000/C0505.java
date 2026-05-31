package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0505 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0397 f2176;

    public C0505(int i) {
        this.f2175 = i;
        switch (i) {
            case 1:
                this.f2176 = new C0397();
                break;
            default:
                this.f2176 = new C0397();
                break;
        }
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1355(Object obj, C2336 c2336) {
        switch (this.f2175) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2624 mo1356(Object obj, int i, int i2, C2336 c2336) {
        switch (this.f2175) {
            case 0:
                return this.f2176.m1721(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c2336);
            default:
                return this.f2176.m1721(ImageDecoder.createSource(AbstractC0511.m1958((InputStream) obj)), i, i2, c2336);
        }
    }
}
