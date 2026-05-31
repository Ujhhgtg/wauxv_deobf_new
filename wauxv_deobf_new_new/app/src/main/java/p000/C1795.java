package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import p000.FragmentC2607;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᲇᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1795 extends AbstractC1188 {
    @Override // p000.AbstractC1188, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = FragmentC2607.f8260;
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC2607.C2608.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC2607.C2608());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC2607(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
