package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲇᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f7913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2027 f7914;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC2027 f7915;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Class f7916;

    public C2495(Context context, InterfaceC2027 interfaceC2027, InterfaceC2027 interfaceC2028, Class cls) {
        this.f7913 = context.getApplicationContext();
        this.f7914 = interfaceC2027;
        this.f7915 = interfaceC2028;
        this.f7916 = cls;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1540(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC2236.m4235((Uri) obj);
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        Uri uri = (Uri) obj;
        return new C2026(new C2275(uri), new C2494(this.f7913, this.f7914, this.f7915, uri, i, i2, c2336, this.f7916));
    }
}
