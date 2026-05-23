package p000;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1385 extends ResponseBody {

    public final DiskLruCache.Snapshot f4985;

    public final String f4986;

    public final String f4987;

    public final C2477 f4988;

    public C1385(DiskLruCache.Snapshot snapshot, String str, String str2) {
        this.f4985 = snapshot;
        this.f4986 = str;
        this.f4987 = str2;
        this.f4988 = new C2477(new C1384(snapshot.getSource(1), this));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        String str = this.f4987;
        if (str != null) {
            return Util.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f4986;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC0508 source() {
        return this.f4988;
    }
}
