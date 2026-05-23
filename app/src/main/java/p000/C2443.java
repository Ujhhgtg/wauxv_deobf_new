package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲇᛸᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2443 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f7769;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1996 f7770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1996 f7771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Class f7772;

    public C2443(Context context, InterfaceC1996 interfaceC1996, InterfaceC1996 interfaceC1997, Class cls) {
        this.f7769 = context.getApplicationContext();
        this.f7770 = interfaceC1996;
        this.f7771 = interfaceC1997;
        this.f7772 = cls;
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1394(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC0968.m2477((Uri) obj);
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        Uri uri = (Uri) obj;
        return new C1995(new C2244(uri), new C2442(this.f7769, this.f7770, this.f7771, uri, i, i2, c2303, this.f7772));
    }
}
