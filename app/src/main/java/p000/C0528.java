package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0528 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2219;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0422 f2220;

    public C0528(int i) {
        this.f2219 = i;
        switch (i) {
            case 1:
                this.f2220 = new C0422();
                break;
            default:
                this.f2220 = new C0422();
                break;
        }
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1209(Object obj, C2303 c2303) {
        switch (this.f2219) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2568 mo1210(Object obj, int i, int i2, C2303 c2303) {
        switch (this.f2219) {
            case 0:
                return this.f2220.m1615(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c2303);
            default:
                return this.f2220.m1615(ImageDecoder.createSource(AbstractC0534.m1864((InputStream) obj)), i, i2, c2303);
        }
    }
}
