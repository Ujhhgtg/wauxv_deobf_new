package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(Opcodes.DCONST_0)
public class p implements Application.ActivityLifecycleCallbacks {
    private static p a = new p();
    private final int b = 3000;
    private boolean c = false;
    private boolean d = true;
    private Handler e = new Handler(Looper.getMainLooper());
    private ArrayList<q> f = new ArrayList<>();
    private a g = new a();

    /* JADX INFO: compiled from: obf */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!p.this.c || !p.this.d) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
                return;
            }
            p.this.c = false;
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> went background.");
            for (int i = 0; i < p.this.f.size(); i++) {
                ((q) p.this.f.get(i)).n();
            }
        }
    }

    private p() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.d = true;
        a aVar = this.g;
        if (aVar != null) {
            this.e.removeCallbacks(aVar);
            this.e.postDelayed(this.g, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.d = false;
        this.c = true;
        a aVar = this.g;
        if (aVar != null) {
            this.e.removeCallbacks(aVar);
        }
    }

    public synchronized void b(q qVar) {
        if (qVar != null) {
            for (int i = 0; i < this.f.size(); i++) {
                try {
                    if (this.f.get(i) == qVar) {
                        this.f.remove(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(a);
        }
    }

    public static p a() {
        return a;
    }

    public synchronized void a(q qVar) {
        if (qVar != null) {
            this.f.add(qVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
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
