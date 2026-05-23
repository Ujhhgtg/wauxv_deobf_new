package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cj implements Application.ActivityLifecycleCallbacks {
    private static final String a = "ForegroundBackgroundListener";
    private static final long b = 500;
    private List<a> c = new ArrayList();
    private boolean d = false;
    private int e = 0;
    private Handler f = new Handler(Looper.getMainLooper());
    private Runnable g = new Runnable() { // from class: com.umeng.analytics.pro.cj.1
        @Override // java.lang.Runnable
        public void run() {
            if (cj.this.e == 0) {
                if (cj.this.d) {
                    cj.this.d = false;
                    cj.this.c();
                    return;
                }
                return;
            }
            if (cj.this.d) {
                return;
            }
            cj.this.d = true;
            cj.this.b();
        }
    };

    /* JADX INFO: compiled from: obf */
    public interface a {
        void a();

        void b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.e++;
        this.f.removeCallbacks(this.g);
        this.f.postDelayed(this.g, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.e--;
        this.f.removeCallbacks(this.g);
        this.f.postDelayed(this.g, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            try {
                it.next().b();
            } catch (Throwable th) {
                UMRTLog.e("MobclickRT", "[ncc]: Error in onSwitchBackground callback: " + th.getMessage());
            }
        }
    }

    public void b(a aVar) {
        if (aVar != null) {
            this.c.remove(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable th) {
                UMRTLog.e("MobclickRT", "[ncc]: Error in onSwitchForeground callback: " + th.getMessage());
            }
        }
    }

    public void a(a aVar) {
        if (aVar == null || this.c.contains(aVar)) {
            return;
        }
        this.c.add(aVar);
    }

    public boolean a() {
        return this.d;
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
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
