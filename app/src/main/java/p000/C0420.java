package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0420 implements InterfaceC2578, InterfaceC1997 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1966;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Resources f1967;

    public /* synthetic */ C0420(Resources resources, int i) {
        this.f1966 = i;
        this.f1967 = resources;
    }

    @Override // p000.InterfaceC2578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2568 mo1314(InterfaceC2568 interfaceC2568, C2303 c2303) {
        if (interfaceC2568 == null) {
            return null;
        }
        return new C0425(this.f1967, interfaceC2568);
    }

    @Override // p000.InterfaceC1997
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC1996 mo1115(C2103 c2103) {
        switch (this.f1966) {
            case 1:
                return new C0274(this.f1967, c2103.m3911(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C0274(this.f1967, c2103.m3911(Uri.class, InputStream.class));
            default:
                return new C0274(this.f1967, C3498.f10998);
        }
    }
}
