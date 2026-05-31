package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤝᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2896 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2027 f9264;

    public /* synthetic */ C2896(InterfaceC2027 interfaceC2027, int i) {
        this.f9263 = i;
        this.f9264 = interfaceC2027;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1540(Object obj) {
        switch (this.f9263) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        Uri uriFromFile;
        switch (this.f9263) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC2027 interfaceC2027 = this.f9264;
                if (interfaceC2027.mo1540(uriFromFile)) {
                    return interfaceC2027.mo1541(uriFromFile, i, i2, c2336);
                }
                return null;
            default:
                return this.f9264.mo1541(new C1479((URL) obj), i, i2, c2336);
        }
    }
}
