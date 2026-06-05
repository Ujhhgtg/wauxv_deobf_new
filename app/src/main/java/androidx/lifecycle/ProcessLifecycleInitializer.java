package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0054Ujhhgtgfeyxiexzf;
import p000.C0051Ujhhgtgfeyxiexzf;
import p000.C0840feyxiexzfUjhhgtg;
import p000.C0843feyxiexzfUjhhgtg;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C3312feyxiexzfUjhhgtg;
import p000.InterfaceC0651Ujhhgtgfeyxiexzf;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0651Ujhhgtgfeyxiexzf {
    @Override // p000.InterfaceC0651Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final List mo92Ujhhgtgfeyxiexzf() {
        return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0651Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo93Ujhhgtgfeyxiexzf(Context context) {
        if (!((HashSet) C2366Ujhhgtgfeyxiexzf.m3591Ujhhgtgfeyxiexzf(context).f7715Ujhhgtgfeyxiexzf).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0054Ujhhgtgfeyxiexzf.f1063Ujhhgtgfeyxiexzf.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0051Ujhhgtgfeyxiexzf());
        }
        C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg = C0843feyxiexzfUjhhgtg.f3318Ujhhgtgfeyxiexzf;
        c0843feyxiexzfUjhhgtg.getClass();
        c0843feyxiexzfUjhhgtg.f3323Ujhhgtgfeyxiexzf = new Handler();
        c0843feyxiexzfUjhhgtg.f3324Ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0840feyxiexzfUjhhgtg(c0843feyxiexzfUjhhgtg));
        return c0843feyxiexzfUjhhgtg;
    }
}
