package p000;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1393 extends ResponseBody {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final DiskLruCache.Snapshot f5014;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5015;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5016;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2531 f5017;

    public C1393(DiskLruCache.Snapshot snapshot, String str, String str2) {
        this.f5014 = snapshot;
        this.f5015 = str;
        this.f5016 = str2;
        this.f5017 = new C2531(new C1392(snapshot.getSource(1), this));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        String str = this.f5016;
        if (str != null) {
            return Util.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f5015;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC0485 source() {
        return this.f5017;
    }
}
