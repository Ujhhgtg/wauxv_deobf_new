package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲀᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3574 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Set f11173 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2027 f11174;

    public C3574(InterfaceC2027 interfaceC2027) {
        this.f11174 = interfaceC2027;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1540(Object obj) {
        return f11173.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        return this.f11174.mo1541(new C1479(((Uri) obj).toString()), i, i2, c2336);
    }
}
