package p000;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛳ要点脸能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0474Ujhhgtgfeyxiexzf extends ResponseBody {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ResponseBody f2382Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f2383Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0467Ujhhgtgfeyxiexzf f2384Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f2385Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f2386Ujhhgtgfeyxiexzf;

    public C0474Ujhhgtgfeyxiexzf(ResponseBody responseBody, ConcurrentLinkedQueue concurrentLinkedQueue, C0467Ujhhgtgfeyxiexzf c0467Ujhhgtgfeyxiexzf) {
        this.f2382Ujhhgtgfeyxiexzf = responseBody;
        this.f2383Ujhhgtgfeyxiexzf = concurrentLinkedQueue;
        this.f2384Ujhhgtgfeyxiexzf = c0467Ujhhgtgfeyxiexzf;
        SystemClock.elapsedRealtime();
        this.f2385Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0465Ujhhgtgfeyxiexzf(this, 0));
        this.f2386Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0465Ujhhgtgfeyxiexzf(this, 1));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return ((Number) this.f2386Ujhhgtgfeyxiexzf.getValue()).longValue();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f2382Ujhhgtgfeyxiexzf.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC2595feyxiexzfUjhhgtg source() {
        return (InterfaceC2595feyxiexzfUjhhgtg) this.f2385Ujhhgtgfeyxiexzf.getValue();
    }
}
