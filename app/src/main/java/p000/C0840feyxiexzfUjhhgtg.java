package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0840feyxiexzfUjhhgtg extends AbstractC3304feyxiexzfUjhhgtg {
    final /* synthetic */ C0843feyxiexzfUjhhgtg this$0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳᛲᛴ要点脸$上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
    /* JADX INFO: compiled from: obf */
    public static final class Ujhhgtgfeyxiexzf extends AbstractC3304feyxiexzfUjhhgtg {
        final /* synthetic */ C0843feyxiexzfUjhhgtg this$0;

        public Ujhhgtgfeyxiexzf(C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg) {
            this.this$0 = c0843feyxiexzfUjhhgtg;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.m2247Ujhhgtgfeyxiexzf();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg = this.this$0;
            int i = c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf + 1;
            c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf = i;
            if (i == 1 && c0843feyxiexzfUjhhgtg.f3322Ujhhgtgfeyxiexzf) {
                c0843feyxiexzfUjhhgtg.f3324Ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_START);
                c0843feyxiexzfUjhhgtg.f3322Ujhhgtgfeyxiexzf = false;
            }
        }
    }

    public C0840feyxiexzfUjhhgtg(C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg) {
        this.this$0 = c0843feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC3304feyxiexzfUjhhgtg, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            ((FragmentC0987feyxiexzfUjhhgtg) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f3886Ujhhgtgfeyxiexzf = this.this$0.f3326Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC3304feyxiexzfUjhhgtg, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg = this.this$0;
        int i = c0843feyxiexzfUjhhgtg.f3320Ujhhgtgfeyxiexzf - 1;
        c0843feyxiexzfUjhhgtg.f3320Ujhhgtgfeyxiexzf = i;
        if (i == 0) {
            c0843feyxiexzfUjhhgtg.f3323Ujhhgtgfeyxiexzf.postDelayed(c0843feyxiexzfUjhhgtg.f3325Ujhhgtgfeyxiexzf, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0841feyxiexzfUjhhgtg.m2246Ujhhgtgfeyxiexzf(activity, new Ujhhgtgfeyxiexzf(this.this$0));
    }

    @Override // p000.AbstractC3304feyxiexzfUjhhgtg, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg = this.this$0;
        int i = c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf - 1;
        c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf = i;
        if (i == 0 && c0843feyxiexzfUjhhgtg.f3321Ujhhgtgfeyxiexzf) {
            c0843feyxiexzfUjhhgtg.f3324Ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_STOP);
            c0843feyxiexzfUjhhgtg.f3322Ujhhgtgfeyxiexzf = true;
        }
    }
}
