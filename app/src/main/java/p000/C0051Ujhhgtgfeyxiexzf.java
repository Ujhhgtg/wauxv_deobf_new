package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import p000.FragmentC0987feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0051Ujhhgtgfeyxiexzf extends AbstractC3304feyxiexzfUjhhgtg {
    @Override // p000.AbstractC3304feyxiexzfUjhhgtg, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0987feyxiexzfUjhhgtg.Ujhhgtgfeyxiexzf.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0987feyxiexzfUjhhgtg.Ujhhgtgfeyxiexzf());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0987feyxiexzfUjhhgtg(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
