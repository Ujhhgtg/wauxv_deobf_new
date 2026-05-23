package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2405 extends AbstractC1186 {
    final /* synthetic */ C2407 this$0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᛸᲁᲈ$ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: obf */
    public static final class C2406 extends AbstractC1186 {
        final /* synthetic */ C2407 this$0;

        public C2406(C2407 c2407) {
            this.this$0 = c2407;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.m4375();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C2407 c2407 = this.this$0;
            int i = c2407.f7684 + 1;
            c2407.f7684 = i;
            if (i == 1 && c2407.f7687) {
                c2407.f7689.m100(EnumC1769.ON_START);
                c2407.f7687 = false;
            }
        }
    }

    public C2405(C2407 c2407) {
        this.this$0 = c2407;
    }

    @Override // p000.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = 0;
            ((FragmentC2551) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f8108 = this.this$0.f7691;
        }
    }

    @Override // p000.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C2407 c2407 = this.this$0;
        int i = c2407.f7685 - 1;
        c2407.f7685 = i;
        if (i == 0) {
            c2407.f7688.postDelayed(c2407.f7690, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2404.m4374(activity, new C2406(this.this$0));
    }

    @Override // p000.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C2407 c2407 = this.this$0;
        int i = c2407.f7684 - 1;
        c2407.f7684 = i;
        if (i == 0 && c2407.f7686) {
            c2407.f7689.m100(EnumC1769.ON_STOP);
            c2407.f7687 = true;
        }
    }
}
