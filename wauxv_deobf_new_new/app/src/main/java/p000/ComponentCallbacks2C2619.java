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
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲈᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2619 implements ComponentCallbacks2, InterfaceC1798 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2621 f8285;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ComponentCallbacks2C0027 f8286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f8287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC1794 f8288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2773 f8289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0348 f8290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2956 f8291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final RunnableC0149 f8292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final InterfaceC0774 f8293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f8294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C2621 f8295;

    static {
        C2621 c2621 = (C2621) new C2621().m1634(Bitmap.class);
        c2621.f1748 = true;
        f8285 = c2621;
        ((C2621) new C2621().m1634(C1454.class)).f1748 = true;
    }

    public ComponentCallbacks2C2619(ComponentCallbacks2C0027 componentCallbacks2C0027, InterfaceC1794 interfaceC1794, C0348 c0348, Context context) {
        int iCheckPermission;
        C2621 c2621;
        C2773 c2773 = new C2773();
        C0348 c0349 = componentCallbacks2C0027.f594;
        this.f8291 = new C2956();
        RunnableC0149 runnableC0149 = new RunnableC0149(this, 13);
        this.f8292 = runnableC0149;
        this.f8286 = componentCallbacks2C0027;
        this.f8288 = interfaceC1794;
        this.f8290 = c0348;
        this.f8289 = c2773;
        this.f8287 = context;
        Context applicationContext = context.getApplicationContext();
        C2618 c2618 = new C2618(this, c2773);
        c0349.getClass();
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) {
            iCheckPermission = applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
        } else {
            iCheckPermission = new C2270(applicationContext).f7378.areNotificationsEnabled() ? 0 : -1;
        }
        boolean z = iCheckPermission == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC0774 c0984 = z ? new C0984(applicationContext, c2618) : new C2271();
        this.f8293 = c0984;
        synchronized (componentCallbacks2C0027.f595) {
            if (componentCallbacks2C0027.f595.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0027.f595.add(this);
        }
        char[] cArr = AbstractC3580.f11185;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC1794.mo756(this);
        } else {
            AbstractC3580.m5121().post(runnableC0149);
        }
        interfaceC1794.mo756(c0984);
        this.f8294 = new CopyOnWriteArrayList(componentCallbacks2C0027.f591.f5241);
        C1472 c1472 = componentCallbacks2C0027.f591;
        synchronized (c1472) {
            try {
                if (c1472.f5246 == null) {
                    c1472.f5240.getClass();
                    C2621 c2622 = new C2621();
                    c2622.f1748 = true;
                    c1472.f5246 = c2622;
                }
                c2621 = c1472.f5246;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            C2621 c2623 = (C2621) c2621.clone();
            if (c2623.f1748 && !c2623.f1749) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c2623.f1749 = true;
            c2623.f1748 = true;
            this.f8295 = c2623;
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f8289 + ", treeNode=" + this.f8290 + "}";
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final synchronized void mo1726() {
        this.f8291.mo1726();
        m4598();
        C2773 c2773 = this.f8289;
        Iterator it = AbstractC3580.m5120((Set) c2773.f8923).iterator();
        while (it.hasNext()) {
            c2773.m4753((InterfaceC2610) it.next());
        }
        ((HashSet) c2773.f8924).clear();
        this.f8288.mo755(this);
        this.f8288.mo755(this.f8293);
        AbstractC3580.m5121().removeCallbacks(this.f8292);
        ComponentCallbacks2C0027 componentCallbacks2C0027 = this.f8286;
        synchronized (componentCallbacks2C0027.f595) {
            if (!componentCallbacks2C0027.f595.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C0027.f595.remove(this);
        }
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final synchronized void mo1728() {
        this.f8291.mo1728();
        m4599();
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final synchronized void mo1732() {
        m4600();
        this.f8291.mo1732();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4597(InterfaceC2953 interfaceC2953) {
        if (interfaceC2953 == null) {
            return;
        }
        boolean zM4601 = m4601(interfaceC2953);
        InterfaceC2610 interfaceC2610Mo1730 = interfaceC2953.mo1730();
        if (zM4601) {
            return;
        }
        ComponentCallbacks2C0027 componentCallbacks2C0027 = this.f8286;
        synchronized (componentCallbacks2C0027.f595) {
            try {
                Iterator it = componentCallbacks2C0027.f595.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C2619) it.next()).m4601(interfaceC2953)) {
                        return;
                    }
                }
                if (interfaceC2610Mo1730 != null) {
                    interfaceC2953.mo1724(null);
                    interfaceC2610Mo1730.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized void m4598() {
        try {
            Iterator it = AbstractC3580.m5120(this.f8291.f9481).iterator();
            while (it.hasNext()) {
                m4597((InterfaceC2953) it.next());
            }
            this.f8291.f9481.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final synchronized void m4599() {
        C2773 c2773 = this.f8289;
        c2773.f8922 = true;
        for (InterfaceC2610 interfaceC2610 : AbstractC3580.m5120((Set) c2773.f8923)) {
            if (interfaceC2610.isRunning()) {
                interfaceC2610.mo2978();
                ((HashSet) c2773.f8924).add(interfaceC2610);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final synchronized void m4600() {
        C2773 c2773 = this.f8289;
        c2773.f8922 = false;
        for (InterfaceC2610 interfaceC2610 : AbstractC3580.m5120((Set) c2773.f8923)) {
            if (!interfaceC2610.mo2984() && !interfaceC2610.isRunning()) {
                interfaceC2610.mo2983();
            }
        }
        ((HashSet) c2773.f8924).clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final synchronized boolean m4601(InterfaceC2953 interfaceC2953) {
        InterfaceC2610 interfaceC2610Mo1730 = interfaceC2953.mo1730();
        if (interfaceC2610Mo1730 == null) {
            return true;
        }
        if (!this.f8289.m4753(interfaceC2610Mo1730)) {
            return false;
        }
        this.f8291.f9481.remove(interfaceC2953);
        interfaceC2953.mo1724(null);
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
