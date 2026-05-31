package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2458 extends AbstractC1188 {
    final /* synthetic */ C2460 this$0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᤝᲈᲁᲇ$ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: obf */
    public static final class C2459 extends AbstractC1188 {
        final /* synthetic */ C2460 this$0;

        public C2459(C2460 c2460) {
            this.this$0 = c2460;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.m4396();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C2460 c2460 = this.this$0;
            int i = c2460.f7828 + 1;
            c2460.f7828 = i;
            if (i == 1 && c2460.f7831) {
                c2460.f7833.m100(EnumC1792.ON_START);
                c2460.f7831 = false;
            }
        }
    }

    public C2458(C2460 c2460) {
        this.this$0 = c2460;
    }

    @Override // p000.AbstractC1188, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC2607.f8260;
            ((FragmentC2607) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f8261 = this.this$0.f7835;
        }
    }

    @Override // p000.AbstractC1188, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C2460 c2460 = this.this$0;
        int i = c2460.f7829 - 1;
        c2460.f7829 = i;
        if (i == 0) {
            c2460.f7832.postDelayed(c2460.f7834, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2457.m4395(activity, new C2459(this.this$0));
    }

    @Override // p000.AbstractC1188, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C2460 c2460 = this.this$0;
        int i = c2460.f7828 - 1;
        c2460.f7828 = i;
        if (i == 0 && c2460.f7830) {
            c2460.f7833.m100(EnumC1792.ON_STOP);
            c2460.f7831 = true;
        }
    }
}
