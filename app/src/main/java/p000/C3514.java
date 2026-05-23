package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᤝᤞᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3514 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Set f11018 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f11019;

    public C3514(C3513 c3513) {
        this.f11019 = c3513;
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1394(Object obj) {
        return f11018.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        InterfaceC0955 c0272;
        Uri uri = (Uri) obj;
        C2244 c2244 = new C2244(uri);
        C3513 c3513 = (C3513) this.f11019;
        switch (c3513.f11015) {
            case 0:
                c0272 = new C0272(c3513.f11016, uri, c3513.f11017, 0);
                break;
            case 1:
                c0272 = new C0272(c3513.f11016, uri, c3513.f11017, 1);
                break;
            default:
                c0272 = new C2827(c3513.f11016, uri, c3513.f11017);
                break;
        }
        return new C1995(c2244, c0272);
    }
}
