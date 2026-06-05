package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3625Ujhhgtgfeyxiexzf implements InterfaceC3390feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Context f11327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3624feyxiexzfUjhhgtg f11328Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3339feyxiexzfUjhhgtg f11329Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object f11330Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Handler f11331Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public ThreadPoolExecutor f11332Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ThreadPoolExecutor f11333Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AbstractC1264feyxiexzfUjhhgtg f11334Ujhhgtgfeyxiexzf;

    public C3625Ujhhgtgfeyxiexzf(Context context, C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg) {
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(context, "Context cannot be null");
        this.f11327Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f11328Ujhhgtgfeyxiexzf = c3624feyxiexzfUjhhgtg;
        this.f11329Ujhhgtgfeyxiexzf = C3626Ujhhgtgfeyxiexzf.f11335Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3390feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo4675Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg abstractC1264feyxiexzfUjhhgtg) {
        synchronized (this.f11330Ujhhgtgfeyxiexzf) {
            this.f11334Ujhhgtgfeyxiexzf = abstractC1264feyxiexzfUjhhgtg;
        }
        synchronized (this.f11330Ujhhgtgfeyxiexzf) {
            try {
                if (this.f11334Ujhhgtgfeyxiexzf == null) {
                    return;
                }
                if (this.f11332Ujhhgtgfeyxiexzf == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2877feyxiexzfUjhhgtg("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f11333Ujhhgtgfeyxiexzf = threadPoolExecutor;
                    this.f11332Ujhhgtgfeyxiexzf = threadPoolExecutor;
                }
                this.f11332Ujhhgtgfeyxiexzf.execute(new RunnableC2779feyxiexzfUjhhgtg(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5267Ujhhgtgfeyxiexzf() {
        synchronized (this.f11330Ujhhgtgfeyxiexzf) {
            try {
                this.f11334Ujhhgtgfeyxiexzf = null;
                Handler handler = this.f11331Ujhhgtgfeyxiexzf;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f11331Ujhhgtgfeyxiexzf = null;
                ThreadPoolExecutor threadPoolExecutor = this.f11333Ujhhgtgfeyxiexzf;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f11332Ujhhgtgfeyxiexzf = null;
                this.f11333Ujhhgtgfeyxiexzf = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3635Ujhhgtgfeyxiexzf m5268Ujhhgtgfeyxiexzf() {
        try {
            C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg = this.f11329Ujhhgtgfeyxiexzf;
            Context context = this.f11327Ujhhgtgfeyxiexzf;
            C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg = this.f11328Ujhhgtgfeyxiexzf;
            c3339feyxiexzfUjhhgtg.getClass();
            Object[] objArr = {c3624feyxiexzfUjhhgtg};
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(objArr[0]);
            C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtgM5264Ujhhgtgfeyxiexzf = AbstractC3623feyxiexzfUjhhgtg.m5264Ujhhgtgfeyxiexzf(context, Collections.unmodifiableList(arrayList));
            int i = c2501feyxiexzfUjhhgtgM5264Ujhhgtgfeyxiexzf.f8170Ujhhgtgfeyxiexzf;
            if (i != 0) {
                throw new RuntimeException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "fetchFonts failed (", ")"));
            }
            C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr = (C3635Ujhhgtgfeyxiexzf[]) ((List) c2501feyxiexzfUjhhgtgM5264Ujhhgtgfeyxiexzf.f8171Ujhhgtgfeyxiexzf).get(0);
            if (c3635UjhhgtgfeyxiexzfArr == null || c3635UjhhgtgfeyxiexzfArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c3635UjhhgtgfeyxiexzfArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
