package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᤝᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1925 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6362;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Context f6363;

    public C1925(Context context, int i) {
        this.f6362 = i;
        switch (i) {
            case 1:
                this.f6363 = context.getApplicationContext();
                break;
            case 2:
                this.f6363 = context.getApplicationContext();
                break;
            default:
                this.f6363 = context;
                break;
        }
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1394(Object obj) {
        switch (this.f6362) {
            case 0:
                return AbstractC0968.m2477((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC0968.m2477(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC0968.m2477(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        Long l;
        switch (this.f6362) {
            case 0:
                Uri uri = (Uri) obj;
                return new C1995(new C2244(uri), new C1924(this.f6363, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C2244 c2244 = new C2244(uri2);
                Context context = this.f6363;
                return new C1995(c2244, C0964.m2453(context, uri2, new C2924(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c2303.m4165(C3553.f11151)) == null || l.longValue() != -1) {
                    return null;
                }
                C2244 c2245 = new C2244(uri3);
                Context context2 = this.f6363;
                return new C1995(c2245, C0964.m2453(context2, uri3, new C2924(context2.getContentResolver(), 1)));
        }
    }
}
