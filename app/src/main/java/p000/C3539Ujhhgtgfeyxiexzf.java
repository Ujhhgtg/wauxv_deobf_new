package p000;

import java.io.IOException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱ能不能ᛳᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3539Ujhhgtgfeyxiexzf implements CacheRequest {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final DiskLruCache.Editor f11054Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1026feyxiexzfUjhhgtg f11055Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3538Ujhhgtgfeyxiexzf f11056Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f11057Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3521Ujhhgtgfeyxiexzf f11058Ujhhgtgfeyxiexzf;

    public C3539Ujhhgtgfeyxiexzf(C3521Ujhhgtgfeyxiexzf c3521Ujhhgtgfeyxiexzf, DiskLruCache.Editor editor) {
        this.f11058Ujhhgtgfeyxiexzf = c3521Ujhhgtgfeyxiexzf;
        this.f11054Ujhhgtgfeyxiexzf = editor;
        InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtgNewSink = editor.newSink(1);
        this.f11055Ujhhgtgfeyxiexzf = interfaceC1026feyxiexzfUjhhgtgNewSink;
        this.f11056Ujhhgtgfeyxiexzf = new C3538Ujhhgtgfeyxiexzf(c3521Ujhhgtgfeyxiexzf, this, interfaceC1026feyxiexzfUjhhgtgNewSink);
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final void abort() {
        synchronized (this.f11058Ujhhgtgfeyxiexzf) {
            if (this.f11057Ujhhgtgfeyxiexzf) {
                return;
            }
            this.f11057Ujhhgtgfeyxiexzf = true;
            Util.closeQuietly(this.f11055Ujhhgtgfeyxiexzf);
            try {
                this.f11054Ujhhgtgfeyxiexzf.abort();
            } catch (IOException unused) {
            }
        }
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final InterfaceC1026feyxiexzfUjhhgtg body() {
        return this.f11056Ujhhgtgfeyxiexzf;
    }
}
