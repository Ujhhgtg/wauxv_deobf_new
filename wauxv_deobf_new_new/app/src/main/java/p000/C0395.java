package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0395 implements InterfaceC2634, InterfaceC2028 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1938;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Resources f1939;

    public /* synthetic */ C0395(Resources resources, int i) {
        this.f1938 = i;
        this.f1939 = resources;
    }

    @Override // p000.InterfaceC2634
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2624 mo1460(InterfaceC2624 interfaceC2624, C2336 c2336) {
        if (interfaceC2624 == null) {
            return null;
        }
        return new C0400(this.f1939, interfaceC2624);
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC2027 mo1261(C2136 c2136) {
        switch (this.f1938) {
            case 1:
                return new C0284(this.f1939, c2136.m4095(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C0284(this.f1939, c2136.m4095(Uri.class, InputStream.class));
            default:
                return new C0284(this.f1939, C3555.f11150);
        }
    }
}
