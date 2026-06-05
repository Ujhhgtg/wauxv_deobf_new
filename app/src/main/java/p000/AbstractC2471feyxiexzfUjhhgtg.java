package p000;

import android.content.Context;
import com.drake.net.exception.URLParseException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛳ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2471feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public HttpUrl.Builder f8002Ujhhgtgfeyxiexzf = new HttpUrl.Builder();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0428Ujhhgtgfeyxiexzf f8003Ujhhgtgfeyxiexzf = AbstractC0427Ujhhgtgfeyxiexzf.f2281Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f8004Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Request.Builder f8005Ujhhgtgfeyxiexzf = new Request.Builder();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public OkHttpClient f8006Ujhhgtgfeyxiexzf = AbstractC0427Ujhhgtgfeyxiexzf.f2276Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Request mo3709Ujhhgtgfeyxiexzf() {
        Request.Builder builderUrl = this.f8005Ujhhgtgfeyxiexzf.method(AbstractC3317feyxiexzfUjhhgtg.m4810Ujhhgtgfeyxiexzf(this.f8004Ujhhgtgfeyxiexzf), null).url(this.f8002Ujhhgtgfeyxiexzf.build());
        builderUrl.tag(C0428Ujhhgtgfeyxiexzf.class, this.f8003Ujhhgtgfeyxiexzf);
        return builderUrl.build();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3710Ujhhgtgfeyxiexzf(String str) {
        this.f8005Ujhhgtgfeyxiexzf.tag(C1247feyxiexzfUjhhgtg.class, new C1247feyxiexzfUjhhgtg(str));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3711Ujhhgtgfeyxiexzf(InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf) {
        if (interfaceC3737Ujhhgtgfeyxiexzf == null) {
            interfaceC3737Ujhhgtgfeyxiexzf = null;
        }
        this.f8005Ujhhgtgfeyxiexzf.tag(C1253feyxiexzfUjhhgtg.class, interfaceC3737Ujhhgtgfeyxiexzf != null ? new C1253feyxiexzfUjhhgtg(interfaceC3737Ujhhgtgfeyxiexzf) : null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3712Ujhhgtgfeyxiexzf(String str) throws URLParseException {
        HttpUrl httpUrl = str != null ? HttpUrl.Companion.parse(str) : null;
        if (httpUrl != null) {
            this.f8002Ujhhgtgfeyxiexzf = httpUrl.newBuilder();
            return;
        }
        try {
            HttpUrl.Companion companion = HttpUrl.Companion;
            StringBuilder sb = new StringBuilder("");
            Context context = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            sb.append(str);
            this.f8002Ujhhgtgfeyxiexzf = companion.get(sb.toString()).newBuilder();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("");
            Context context2 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
            sb2.append(str);
            throw new URLParseException(sb2.toString(), th);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3713Ujhhgtgfeyxiexzf() {
        this.f8005Ujhhgtgfeyxiexzf.tag(null);
    }
}
