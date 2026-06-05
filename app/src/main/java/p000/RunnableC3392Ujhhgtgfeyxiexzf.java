package p000;

import android.content.SharedPreferences;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3392Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10600Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10601Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10602Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10603Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3392Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3, int i) {
        this.f10600Ujhhgtgfeyxiexzf = i;
        this.f10601Ujhhgtgfeyxiexzf = obj;
        this.f10602Ujhhgtgfeyxiexzf = obj2;
        this.f10603Ujhhgtgfeyxiexzf = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10600Ujhhgtgfeyxiexzf) {
            case 0:
                C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg = (C3167feyxiexzfUjhhgtg) this.f10601Ujhhgtgfeyxiexzf;
                AbstractC1264feyxiexzfUjhhgtg abstractC1264feyxiexzfUjhhgtg = (AbstractC1264feyxiexzfUjhhgtg) this.f10602Ujhhgtgfeyxiexzf;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f10603Ujhhgtgfeyxiexzf;
                try {
                    C3626Ujhhgtgfeyxiexzf c3626UjhhgtgfeyxiexzfM2734Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2734Ujhhgtgfeyxiexzf(c3167feyxiexzfUjhhgtg.f9800Ujhhgtgfeyxiexzf);
                    if (c3626UjhhgtgfeyxiexzfM2734Ujhhgtgfeyxiexzf == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C3625Ujhhgtgfeyxiexzf c3625Ujhhgtgfeyxiexzf = (C3625Ujhhgtgfeyxiexzf) ((InterfaceC3390feyxiexzfUjhhgtg) c3626UjhhgtgfeyxiexzfM2734Ujhhgtgfeyxiexzf.f10587Ujhhgtgfeyxiexzf);
                    synchronized (c3625Ujhhgtgfeyxiexzf.f11330Ujhhgtgfeyxiexzf) {
                        c3625Ujhhgtgfeyxiexzf.f11332Ujhhgtgfeyxiexzf = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC3390feyxiexzfUjhhgtg) c3626UjhhgtgfeyxiexzfM2734Ujhhgtgfeyxiexzf.f10587Ujhhgtgfeyxiexzf).mo4675Ujhhgtgfeyxiexzf(new C3393feyxiexzfUjhhgtg(abstractC1264feyxiexzfUjhhgtg, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC1264feyxiexzfUjhhgtg.mo2816Ujhhgtgfeyxiexzf(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf = (SharedPreferencesC3515Ujhhgtgfeyxiexzf) this.f10601Ujhhgtgfeyxiexzf;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f10602Ujhhgtgfeyxiexzf;
                String str = (String) this.f10603Ujhhgtgfeyxiexzf;
                sharedPreferencesC3515Ujhhgtgfeyxiexzf.getClass();
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC3515Ujhhgtgfeyxiexzf, str);
                return;
        }
    }
}
