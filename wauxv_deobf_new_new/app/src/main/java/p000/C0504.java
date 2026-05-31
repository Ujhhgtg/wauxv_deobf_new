package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0504 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1104 f2174;

    public /* synthetic */ C0504(C1104 c1104, int i) {
        this.f2173 = i;
        this.f2174 = c1104;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1355(Object obj, C2336 c2336) {
        switch (this.f2173) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2624 mo1356(Object obj, int i, int i2, C2336 c2336) {
        switch (this.f2173) {
            case 0:
                C1104 c1104 = this.f2174;
                return c1104.m2818(new C0253((ByteBuffer) obj, c1104.f4135, c1104.f4134, 14), i, i2, c2336, C1104.f4130);
            default:
                C1104 c1105 = this.f2174;
                return c1105.m2818(new C0253((ParcelFileDescriptor) obj, c1105.f4135, c1105.f4134), i, i2, c2336, C1104.f4130);
        }
    }
}
