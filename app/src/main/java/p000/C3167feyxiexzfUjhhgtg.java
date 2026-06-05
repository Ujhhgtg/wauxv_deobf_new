package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3167feyxiexzfUjhhgtg implements InterfaceC0288Ujhhgtgfeyxiexzf, InterfaceC3390feyxiexzfUjhhgtg, InterfaceC3595feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9799Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Context f9800Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3167feyxiexzfUjhhgtg(Context context, int i) {
        this.f9799Ujhhgtgfeyxiexzf = i;
        this.f9800Ujhhgtgfeyxiexzf = context;
    }

    @Override // p000.InterfaceC3595feyxiexzfUjhhgtg
    public Object get() {
        return (ConnectivityManager) this.f9800Ujhhgtgfeyxiexzf.getSystemService("connectivity");
    }

    @Override // p000.InterfaceC3390feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void mo4675Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg abstractC1264feyxiexzfUjhhgtg) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2877feyxiexzfUjhhgtg("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC3392Ujhhgtgfeyxiexzf(this, abstractC1264feyxiexzfUjhhgtg, threadPoolExecutor, 0));
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        switch (this.f9799Ujhhgtgfeyxiexzf) {
            case 0:
                return new C2395Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, this);
            case 1:
                return new C2395Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, this);
            case 2:
                return new C2395Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, this);
            case 3:
            case 4:
            default:
                return new C2395Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Integer.class, InputStream.class));
            case 5:
                return new C0214Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, 0);
            case 6:
                return new C0214Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, 1);
            case 7:
                return new C0214Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, 2);
            case 8:
                return new C2395Ujhhgtgfeyxiexzf(this.f9800Ujhhgtgfeyxiexzf, c0416Ujhhgtgfeyxiexzf.m1713Ujhhgtgfeyxiexzf(Integer.class, AssetFileDescriptor.class));
        }
    }

    public C3167feyxiexzfUjhhgtg(Context context) {
        this.f9799Ujhhgtgfeyxiexzf = 3;
        this.f9800Ujhhgtgfeyxiexzf = context.getApplicationContext();
    }
}
