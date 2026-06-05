package p000;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3535Ujhhgtgfeyxiexzf extends ResponseBody {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final DiskLruCache.Snapshot f11036Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f11037Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f11038Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0789feyxiexzfUjhhgtg f11039Ujhhgtgfeyxiexzf;

    public C3535Ujhhgtgfeyxiexzf(DiskLruCache.Snapshot snapshot, String str, String str2) {
        this.f11036Ujhhgtgfeyxiexzf = snapshot;
        this.f11037Ujhhgtgfeyxiexzf = str;
        this.f11038Ujhhgtgfeyxiexzf = str2;
        this.f11039Ujhhgtgfeyxiexzf = new C0789feyxiexzfUjhhgtg(new C3636feyxiexzfUjhhgtg(snapshot.getSource(1), this));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        String str = this.f11038Ujhhgtgfeyxiexzf;
        if (str != null) {
            return Util.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f11037Ujhhgtgfeyxiexzf;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC2595feyxiexzfUjhhgtg source() {
        return this.f11039Ujhhgtgfeyxiexzf;
    }
}
