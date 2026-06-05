package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ要点脸ᛳᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0987feyxiexzfUjhhgtg extends Fragment {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ int f3885Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0709Ujhhgtgfeyxiexzf f3886Ujhhgtgfeyxiexzf;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_DESTROY);
        this.f3886Ujhhgtgfeyxiexzf = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3886Ujhhgtgfeyxiexzf;
        if (c0709Ujhhgtgfeyxiexzf != null) {
            ((C0843feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf).m2247Ujhhgtgfeyxiexzf();
        }
        m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3886Ujhhgtgfeyxiexzf;
        if (c0709Ujhhgtgfeyxiexzf != null) {
            C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg = (C0843feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
            int i = c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf + 1;
            c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf = i;
            if (i == 1 && c0843feyxiexzfUjhhgtg.f3322Ujhhgtgfeyxiexzf) {
                c0843feyxiexzfUjhhgtg.f3324Ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_START);
                c0843feyxiexzfUjhhgtg.f3322Ujhhgtgfeyxiexzf = false;
            }
        }
        m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf.ON_STOP);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2480Ujhhgtgfeyxiexzf(p000.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(getActivity(), ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ要点脸ᛳᛴ能不能ᛱUjhhgtgᛱ$上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
    /* JADX INFO: compiled from: obf */
    public static final class Ujhhgtgfeyxiexzf implements Application.ActivityLifecycleCallbacks {
        public static final C0984feyxiexzfUjhhgtg Companion = new C0984feyxiexzfUjhhgtg();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new Ujhhgtgfeyxiexzf());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(activity, p000.Ujhhgtgfeyxiexzf.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(activity, p000.Ujhhgtgfeyxiexzf.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(activity, p000.Ujhhgtgfeyxiexzf.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(activity, p000.Ujhhgtgfeyxiexzf.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(activity, p000.Ujhhgtgfeyxiexzf.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = FragmentC0987feyxiexzfUjhhgtg.f3885Ujhhgtgfeyxiexzf;
            AbstractC0985feyxiexzfUjhhgtg.m2476Ujhhgtgfeyxiexzf(activity, p000.Ujhhgtgfeyxiexzf.ON_STOP);
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
