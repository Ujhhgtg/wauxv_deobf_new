package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᤝᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1956 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Context f6468;

    public C1956(Context context, int i) {
        this.f6467 = i;
        switch (i) {
            case 1:
                this.f6468 = context.getApplicationContext();
                break;
            case 2:
                this.f6468 = context.getApplicationContext();
                break;
            default:
                this.f6468 = context;
                break;
        }
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1540(Object obj) {
        switch (this.f6467) {
            case 0:
                return AbstractC2236.m4235((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC2236.m4235(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC2236.m4235(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        Long l;
        switch (this.f6467) {
            case 0:
                Uri uri = (Uri) obj;
                return new C2026(new C2275(uri), new C1955(this.f6468, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C2275 c2275 = new C2275(uri2);
                Context context = this.f6468;
                return new C2026(c2275, C0968.m2572(context, uri2, new C2983(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c2336.m4294(C3612.f11300)) == null || l.longValue() != -1) {
                    return null;
                }
                C2275 c2276 = new C2275(uri3);
                Context context2 = this.f6468;
                return new C2026(c2276, C0968.m2572(context2, uri3, new C2983(context2.getContentResolver(), 1)));
        }
    }
}
