package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.Ujhhgtgfeyxiexzf;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC2885Ujhhgtgfeyxiexzf;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C3167feyxiexzfUjhhgtg;
import p000.C3391Ujhhgtgfeyxiexzf;
import p000.C3626Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.InterfaceC0651Ujhhgtgfeyxiexzf;
import p000.InterfaceC3115Ujhhgtgfeyxiexzf;
import p000.RunnableC3394feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0651Ujhhgtgfeyxiexzf {
    @Override // p000.InterfaceC0651Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List mo92Ujhhgtgfeyxiexzf() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC0651Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object mo93Ujhhgtgfeyxiexzf(Context context) {
        Object objM3600Ujhhgtgfeyxiexzf;
        C3626Ujhhgtgfeyxiexzf c3626Ujhhgtgfeyxiexzf = new C3626Ujhhgtgfeyxiexzf(new C3167feyxiexzfUjhhgtg(context));
        c3626Ujhhgtgfeyxiexzf.f10586Ujhhgtgfeyxiexzf = 1;
        if (C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf == null) {
            synchronized (C3391Ujhhgtgfeyxiexzf.f10589Ujhhgtgfeyxiexzf) {
                try {
                    if (C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf == null) {
                        C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf = new C3391Ujhhgtgfeyxiexzf(c3626Ujhhgtgfeyxiexzf);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3591Ujhhgtgfeyxiexzf(context);
        c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf.getClass();
        synchronized (C2366Ujhhgtgfeyxiexzf.f7712Ujhhgtgfeyxiexzf) {
            try {
                objM3600Ujhhgtgfeyxiexzf = ((HashMap) c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).get(ProcessLifecycleInitializer.class);
                if (objM3600Ujhhgtgfeyxiexzf == null) {
                    objM3600Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3591Ujhhgtgfeyxiexzf.m3600Ujhhgtgfeyxiexzf(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf = ((InterfaceC0083Ujhhgtgfeyxiexzf) objM3600Ujhhgtgfeyxiexzf).mo895Ujhhgtgfeyxiexzf();
        ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf.m97Ujhhgtgfeyxiexzf(new InterfaceC3115Ujhhgtgfeyxiexzf(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.InterfaceC3115Ujhhgtgfeyxiexzf
            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
            public final void mo94Ujhhgtgfeyxiexzf() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC2885Ujhhgtgfeyxiexzf.m4274Ujhhgtgfeyxiexzf(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC3394feyxiexzfUjhhgtg(), 500L);
                ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf.m102Ujhhgtgfeyxiexzf(this);
            }
        });
        return Boolean.TRUE;
    }
}
