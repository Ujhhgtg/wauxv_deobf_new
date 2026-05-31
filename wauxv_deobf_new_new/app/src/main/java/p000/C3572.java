package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲀᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3572 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Set f11171 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f11172;

    public C3572(C3571 c3571) {
        this.f11172 = c3571;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1540(Object obj) {
        return f11171.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        InterfaceC0958 c0282;
        Uri uri = (Uri) obj;
        C2275 c2275 = new C2275(uri);
        C3571 c3571 = (C3571) this.f11172;
        switch (c3571.f11168) {
            case 0:
                c0282 = new C0282(c3571.f11169, uri, c3571.f11170, 0);
                break;
            case 1:
                c0282 = new C0282(c3571.f11169, uri, c3571.f11170, 1);
                break;
            default:
                c0282 = new C2887(c3571.f11169, uri, c3571.f11170);
                break;
        }
        return new C2026(c2275, c0282);
    }
}
