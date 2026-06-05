package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ能不能ᛳᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0894feyxiexzfUjhhgtg implements ComponentCallbacks2, InterfaceC0049Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C0896feyxiexzfUjhhgtg f3441Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Ujhhgtgfeyxiexzf f3442Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Context f3443Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC0052Ujhhgtgfeyxiexzf f3444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C1030feyxiexzfUjhhgtg f3445Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f3446Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C1967Ujhhgtgfeyxiexzf f3447Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final RunnableC3012feyxiexzfUjhhgtg f3448Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final InterfaceC3637Ujhhgtgfeyxiexzf f3449Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f3450Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0896feyxiexzfUjhhgtg f3451Ujhhgtgfeyxiexzf;

    static {
        C0896feyxiexzfUjhhgtg c0896feyxiexzfUjhhgtg = (C0896feyxiexzfUjhhgtg) new C0896feyxiexzfUjhhgtg().m3715Ujhhgtgfeyxiexzf(Bitmap.class);
        c0896feyxiexzfUjhhgtg.f8018Ujhhgtgfeyxiexzf = true;
        f3441Ujhhgtgfeyxiexzf = c0896feyxiexzfUjhhgtg;
        ((C0896feyxiexzfUjhhgtg) new C0896feyxiexzfUjhhgtg().m3715Ujhhgtgfeyxiexzf(C3571feyxiexzfUjhhgtg.class)).f8018Ujhhgtgfeyxiexzf = true;
    }

    public ComponentCallbacks2C0894feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, InterfaceC0052Ujhhgtgfeyxiexzf interfaceC0052Ujhhgtgfeyxiexzf, C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg, Context context) {
        int iCheckPermission;
        C0896feyxiexzfUjhhgtg c0896feyxiexzfUjhhgtg;
        C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg = new C1030feyxiexzfUjhhgtg();
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg2 = ujhhgtgfeyxiexzf.f608Ujhhgtgfeyxiexzf;
        this.f3447Ujhhgtgfeyxiexzf = new C1967Ujhhgtgfeyxiexzf();
        RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = new RunnableC3012feyxiexzfUjhhgtg(13, this);
        this.f3448Ujhhgtgfeyxiexzf = runnableC3012feyxiexzfUjhhgtg;
        this.f3442Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf;
        this.f3444Ujhhgtgfeyxiexzf = interfaceC0052Ujhhgtgfeyxiexzf;
        this.f3446Ujhhgtgfeyxiexzf = c2466feyxiexzfUjhhgtg;
        this.f3445Ujhhgtgfeyxiexzf = c1030feyxiexzfUjhhgtg;
        this.f3443Ujhhgtgfeyxiexzf = context;
        Context applicationContext = context.getApplicationContext();
        C0895feyxiexzfUjhhgtg c0895feyxiexzfUjhhgtg = new C0895feyxiexzfUjhhgtg(this, c1030feyxiexzfUjhhgtg);
        c2466feyxiexzfUjhhgtg2.getClass();
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) {
            iCheckPermission = applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
        } else {
            iCheckPermission = new C1282feyxiexzfUjhhgtg(applicationContext).f4678Ujhhgtgfeyxiexzf.areNotificationsEnabled() ? 0 : -1;
        }
        boolean z = iCheckPermission == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC3637Ujhhgtgfeyxiexzf c3097Ujhhgtgfeyxiexzf = z ? new C3097Ujhhgtgfeyxiexzf(applicationContext, c0895feyxiexzfUjhhgtg) : new C1279feyxiexzfUjhhgtg();
        this.f3449Ujhhgtgfeyxiexzf = c3097Ujhhgtgfeyxiexzf;
        synchronized (ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf) {
            if (ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf.add(this);
        }
        char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC0052Ujhhgtgfeyxiexzf.mo755Ujhhgtgfeyxiexzf(this);
        } else {
            AbstractC1860Ujhhgtgfeyxiexzf.m3197Ujhhgtgfeyxiexzf().post(runnableC3012feyxiexzfUjhhgtg);
        }
        interfaceC0052Ujhhgtgfeyxiexzf.mo755Ujhhgtgfeyxiexzf(c3097Ujhhgtgfeyxiexzf);
        this.f3450Ujhhgtgfeyxiexzf = new CopyOnWriteArrayList(ujhhgtgfeyxiexzf.f605Ujhhgtgfeyxiexzf.f11164Ujhhgtgfeyxiexzf);
        C3589Ujhhgtgfeyxiexzf c3589Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf.f605Ujhhgtgfeyxiexzf;
        synchronized (c3589Ujhhgtgfeyxiexzf) {
            try {
                if (c3589Ujhhgtgfeyxiexzf.f11169Ujhhgtgfeyxiexzf == null) {
                    c3589Ujhhgtgfeyxiexzf.f11163Ujhhgtgfeyxiexzf.getClass();
                    C0896feyxiexzfUjhhgtg c0896feyxiexzfUjhhgtg2 = new C0896feyxiexzfUjhhgtg();
                    c0896feyxiexzfUjhhgtg2.f8018Ujhhgtgfeyxiexzf = true;
                    c3589Ujhhgtgfeyxiexzf.f11169Ujhhgtgfeyxiexzf = c0896feyxiexzfUjhhgtg2;
                }
                c0896feyxiexzfUjhhgtg = c3589Ujhhgtgfeyxiexzf.f11169Ujhhgtgfeyxiexzf;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            C0896feyxiexzfUjhhgtg c0896feyxiexzfUjhhgtg3 = (C0896feyxiexzfUjhhgtg) c0896feyxiexzfUjhhgtg.clone();
            if (c0896feyxiexzfUjhhgtg3.f8018Ujhhgtgfeyxiexzf && !c0896feyxiexzfUjhhgtg3.f8019Ujhhgtgfeyxiexzf) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c0896feyxiexzfUjhhgtg3.f8019Ujhhgtgfeyxiexzf = true;
            c0896feyxiexzfUjhhgtg3.f8018Ujhhgtgfeyxiexzf = true;
            this.f3451Ujhhgtgfeyxiexzf = c0896feyxiexzfUjhhgtg3;
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3445Ujhhgtgfeyxiexzf + ", treeNode=" + this.f3446Ujhhgtgfeyxiexzf + "}";
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final synchronized void mo1052Ujhhgtgfeyxiexzf() {
        this.f3447Ujhhgtgfeyxiexzf.mo1052Ujhhgtgfeyxiexzf();
        m2371Ujhhgtgfeyxiexzf();
        C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg = this.f3445Ujhhgtgfeyxiexzf;
        Iterator it = AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf((Set) c1030feyxiexzfUjhhgtg.f4031Ujhhgtgfeyxiexzf).iterator();
        while (it.hasNext()) {
            c1030feyxiexzfUjhhgtg.m2523Ujhhgtgfeyxiexzf((InterfaceC0994feyxiexzfUjhhgtg) it.next());
        }
        ((HashSet) c1030feyxiexzfUjhhgtg.f4032Ujhhgtgfeyxiexzf).clear();
        this.f3444Ujhhgtgfeyxiexzf.mo754Ujhhgtgfeyxiexzf(this);
        this.f3444Ujhhgtgfeyxiexzf.mo754Ujhhgtgfeyxiexzf(this.f3449Ujhhgtgfeyxiexzf);
        AbstractC1860Ujhhgtgfeyxiexzf.m3197Ujhhgtgfeyxiexzf().removeCallbacks(this.f3448Ujhhgtgfeyxiexzf);
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = this.f3442Ujhhgtgfeyxiexzf;
        synchronized (ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf) {
            if (!ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf.remove(this);
        }
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final synchronized void mo1053Ujhhgtgfeyxiexzf() {
        this.f3447Ujhhgtgfeyxiexzf.mo1053Ujhhgtgfeyxiexzf();
        m2372Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final synchronized void mo1054Ujhhgtgfeyxiexzf() {
        m2373Ujhhgtgfeyxiexzf();
        this.f3447Ujhhgtgfeyxiexzf.mo1054Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2370Ujhhgtgfeyxiexzf(InterfaceC1984Ujhhgtgfeyxiexzf interfaceC1984Ujhhgtgfeyxiexzf) {
        if (interfaceC1984Ujhhgtgfeyxiexzf == null) {
            return;
        }
        boolean zM2374Ujhhgtgfeyxiexzf = m2374Ujhhgtgfeyxiexzf(interfaceC1984Ujhhgtgfeyxiexzf);
        InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf = interfaceC1984Ujhhgtgfeyxiexzf.mo3337Ujhhgtgfeyxiexzf();
        if (zM2374Ujhhgtgfeyxiexzf) {
            return;
        }
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = this.f3442Ujhhgtgfeyxiexzf;
        synchronized (ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf) {
            try {
                Iterator it = ujhhgtgfeyxiexzf.f609Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C0894feyxiexzfUjhhgtg) it.next()).m2374Ujhhgtgfeyxiexzf(interfaceC1984Ujhhgtgfeyxiexzf)) {
                        return;
                    }
                }
                if (interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf != null) {
                    interfaceC1984Ujhhgtgfeyxiexzf.mo3333Ujhhgtgfeyxiexzf(null);
                    interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final synchronized void m2371Ujhhgtgfeyxiexzf() {
        try {
            Iterator it = AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf(this.f3447Ujhhgtgfeyxiexzf.f6448Ujhhgtgfeyxiexzf).iterator();
            while (it.hasNext()) {
                m2370Ujhhgtgfeyxiexzf((InterfaceC1984Ujhhgtgfeyxiexzf) it.next());
            }
            this.f3447Ujhhgtgfeyxiexzf.f6448Ujhhgtgfeyxiexzf.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final synchronized void m2372Ujhhgtgfeyxiexzf() {
        C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg = this.f3445Ujhhgtgfeyxiexzf;
        c1030feyxiexzfUjhhgtg.f4030Ujhhgtgfeyxiexzf = true;
        for (InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg : AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf((Set) c1030feyxiexzfUjhhgtg.f4031Ujhhgtgfeyxiexzf)) {
            if (interfaceC0994feyxiexzfUjhhgtg.isRunning()) {
                interfaceC0994feyxiexzfUjhhgtg.mo2497Ujhhgtgfeyxiexzf();
                ((HashSet) c1030feyxiexzfUjhhgtg.f4032Ujhhgtgfeyxiexzf).add(interfaceC0994feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final synchronized void m2373Ujhhgtgfeyxiexzf() {
        C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg = this.f3445Ujhhgtgfeyxiexzf;
        c1030feyxiexzfUjhhgtg.f4030Ujhhgtgfeyxiexzf = false;
        for (InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg : AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf((Set) c1030feyxiexzfUjhhgtg.f4031Ujhhgtgfeyxiexzf)) {
            if (!interfaceC0994feyxiexzfUjhhgtg.mo2500Ujhhgtgfeyxiexzf() && !interfaceC0994feyxiexzfUjhhgtg.isRunning()) {
                interfaceC0994feyxiexzfUjhhgtg.mo2499Ujhhgtgfeyxiexzf();
            }
        }
        ((HashSet) c1030feyxiexzfUjhhgtg.f4032Ujhhgtgfeyxiexzf).clear();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final synchronized boolean m2374Ujhhgtgfeyxiexzf(InterfaceC1984Ujhhgtgfeyxiexzf interfaceC1984Ujhhgtgfeyxiexzf) {
        InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf = interfaceC1984Ujhhgtgfeyxiexzf.mo3337Ujhhgtgfeyxiexzf();
        if (interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf == null) {
            return true;
        }
        if (!this.f3445Ujhhgtgfeyxiexzf.m2523Ujhhgtgfeyxiexzf(interfaceC0994feyxiexzfUjhhgtgMo3337Ujhhgtgfeyxiexzf)) {
            return false;
        }
        this.f3447Ujhhgtgfeyxiexzf.f6448Ujhhgtgfeyxiexzf.remove(interfaceC1984Ujhhgtgfeyxiexzf);
        interfaceC1984Ujhhgtgfeyxiexzf.mo3333Ujhhgtgfeyxiexzf(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
