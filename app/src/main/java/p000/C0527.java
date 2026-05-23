package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0527 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1098 f2218;

    public /* synthetic */ C0527(C1098 c1098, int i) {
        this.f2217 = i;
        this.f2218 = c1098;
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1209(Object obj, C2303 c2303) {
        switch (this.f2217) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2568 mo1210(Object obj, int i, int i2, C2303 c2303) {
        switch (this.f2217) {
            case 0:
                C1098 c1098 = this.f2218;
                return c1098.m2669(new C0243((ByteBuffer) obj, c1098.f4124, c1098.f4123, 14), i, i2, c2303, C1098.f4119);
            default:
                C1098 c1099 = this.f2218;
                return c1099.m2669(new C0243((ParcelFileDescriptor) obj, c1099.f4124, c1099.f4123), i, i2, c2303, C1098.f4119);
        }
    }
}
