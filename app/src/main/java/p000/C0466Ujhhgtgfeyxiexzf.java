package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛳ能不能ᛲ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0466Ujhhgtgfeyxiexzf extends RequestBody {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final RequestBody f2371Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f2372Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1467feyxiexzfUjhhgtg f2373Ujhhgtgfeyxiexzf = new C1467feyxiexzfUjhhgtg(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f2374Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0464Ujhhgtgfeyxiexzf(0, this));

    public C0466Ujhhgtgfeyxiexzf(RequestBody requestBody, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f2371Ujhhgtgfeyxiexzf = requestBody;
        this.f2372Ujhhgtgfeyxiexzf = concurrentLinkedQueue;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return ((Number) this.f2374Ujhhgtgfeyxiexzf.getValue()).longValue();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f2371Ujhhgtgfeyxiexzf.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        boolean z = interfaceC2596feyxiexzfUjhhgtg instanceof C2598feyxiexzfUjhhgtg;
        RequestBody requestBody = this.f2371Ujhhgtgfeyxiexzf;
        if (z || AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(interfaceC2596feyxiexzfUjhhgtg.toString(), "com.android.tools.profiler.support.network.HttpTracker$OutputStreamTracker", false)) {
            requestBody.writeTo(interfaceC2596feyxiexzfUjhhgtg);
            return;
        }
        C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg = new C0806feyxiexzfUjhhgtg(new C0463Ujhhgtgfeyxiexzf(interfaceC2596feyxiexzfUjhhgtg, this));
        requestBody.writeTo(c0806feyxiexzfUjhhgtg);
        Util.closeQuietly(c0806feyxiexzfUjhhgtg);
        if (((Number) this.f2374Ujhhgtgfeyxiexzf.getValue()).longValue() != -1 || (concurrentLinkedQueue = this.f2372Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        Iterator it = concurrentLinkedQueue.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f2373Ujhhgtgfeyxiexzf.f5102Ujhhgtgfeyxiexzf = true;
            throw null;
        }
    }
}
