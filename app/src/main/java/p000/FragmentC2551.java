package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᤝᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC2551 extends Fragment {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f8107 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C1744 f8108;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4564(EnumC1769.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m4564(EnumC1769.ON_DESTROY);
        this.f8108 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m4564(EnumC1769.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1744 c1744 = this.f8108;
        if (c1744 != null) {
            ((C2407) c1744.f5843).m4375();
        }
        m4564(EnumC1769.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1744 c1744 = this.f8108;
        if (c1744 != null) {
            C2407 c2407 = (C2407) c1744.f5843;
            int i = c2407.f7684 + 1;
            c2407.f7684 = i;
            if (i == 1 && c2407.f7687) {
                c2407.f7689.m100(EnumC1769.ON_START);
                c2407.f7687 = false;
            }
        }
        m4564(EnumC1769.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m4564(EnumC1769.ON_STOP);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4564(EnumC1769 enumC1769) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC2549.m4563(getActivity(), enumC1769);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᤝᛸᲇᲁ$ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: obf */
    public static final class C2552 implements Application.ActivityLifecycleCallbacks {
        public static final C2550 Companion = new C2550();

        public static final void registerIn(Activity activity) {
            
            activity.registerActivityLifecycleCallbacks(new C2552());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = 0;
            AbstractC2549.m4563(activity, EnumC1769.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = 0;
            AbstractC2549.m4563(activity, EnumC1769.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = 0;
            AbstractC2549.m4563(activity, EnumC1769.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = 0;
            AbstractC2549.m4563(activity, EnumC1769.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = 0;
            AbstractC2549.m4563(activity, EnumC1769.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = 0;
            AbstractC2549.m4563(activity, EnumC1769.ON_STOP);
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
