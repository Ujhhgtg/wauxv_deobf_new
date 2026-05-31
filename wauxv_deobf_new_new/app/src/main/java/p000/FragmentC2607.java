package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᤞᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC2607 extends Fragment {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f8260 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1681 f8261;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4586(EnumC1792.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m4586(EnumC1792.ON_DESTROY);
        this.f8261 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m4586(EnumC1792.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1681 c1681 = this.f8261;
        if (c1681 != null) {
            ((C2460) c1681.f5660).m4396();
        }
        m4586(EnumC1792.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1681 c1681 = this.f8261;
        if (c1681 != null) {
            C2460 c2460 = (C2460) c1681.f5660;
            int i = c2460.f7828 + 1;
            c2460.f7828 = i;
            if (i == 1 && c2460.f7831) {
                c2460.f7833.m100(EnumC1792.ON_START);
                c2460.f7831 = false;
            }
        }
        m4586(EnumC1792.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m4586(EnumC1792.ON_STOP);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4586(EnumC1792 enumC1792) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC2605.m4585(getActivity(), enumC1792);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᤞᲇᛸᲈ$ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: obf */
    public static final class C2608 implements Application.ActivityLifecycleCallbacks {
        public static final C2606 Companion = new C2606();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C2608());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = FragmentC2607.f8260;
            AbstractC2605.m4585(activity, EnumC1792.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = FragmentC2607.f8260;
            AbstractC2605.m4585(activity, EnumC1792.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = FragmentC2607.f8260;
            AbstractC2605.m4585(activity, EnumC1792.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = FragmentC2607.f8260;
            AbstractC2605.m4585(activity, EnumC1792.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = FragmentC2607.f8260;
            AbstractC2605.m4585(activity, EnumC1792.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = FragmentC2607.f8260;
            AbstractC2605.m4585(activity, EnumC1792.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
