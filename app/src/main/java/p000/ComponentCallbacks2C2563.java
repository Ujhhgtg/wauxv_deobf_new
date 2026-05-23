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
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲇᛸᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2563 implements ComponentCallbacks2, InterfaceC1775 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2565 f8132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ComponentCallbacks2C0020 f8133;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Context f8134;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC1771 f8135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2712 f8136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0373 f8137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2897 f8138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final RunnableC0141 f8139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final InterfaceC0776 f8140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f8141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C2565 f8142;

    static {
        C2565 c2565 = (C2565) new C2565().m1528(Bitmap.class);
        c2565.f1777 = true;
        f8132 = c2565;
        ((C2565) new C2565().m1528(C1446.class)).f1777 = true;
    }

    public ComponentCallbacks2C2563(ComponentCallbacks2C0020 componentCallbacks2C0020, InterfaceC1771 interfaceC1771, C0373 c0373, Context context) {
        int iCheckPermission;
        C2565 c2565;
        C2712 c2712 = new C2712();
        C0373 c0374 = componentCallbacks2C0020.f542;
        this.f8138 = new C2897();
        RunnableC0141 runnableC0141 = new RunnableC0141(13, this);
        this.f8139 = runnableC0141;
        this.f8133 = componentCallbacks2C0020;
        this.f8135 = interfaceC1771;
        this.f8137 = c0373;
        this.f8136 = c2712;
        this.f8134 = context;
        Context applicationContext = context.getApplicationContext();
        C2562 c2562 = new C2562(this, c2712);
        c0374.getClass();
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) {
            iCheckPermission = applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
        } else {
            iCheckPermission = new C2239(applicationContext).f7258.areNotificationsEnabled() ? 0 : -1;
        }
        boolean z = iCheckPermission == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC0776 c0980 = z ? new C0980(applicationContext, c2562) : new C2240();
        this.f8140 = c0980;
        synchronized (componentCallbacks2C0020.f543) {
            if (componentCallbacks2C0020.f543.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0020.f543.add(this);
        }
        char[] cArr = AbstractC3522.f11032;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC1771.mo613(this);
        } else {
            AbstractC3522.m5109().post(runnableC0141);
        }
        interfaceC1771.mo613(c0980);
        this.f8141 = new CopyOnWriteArrayList(componentCallbacks2C0020.f539.f5209);
        C1461 c1461 = componentCallbacks2C0020.f539;
        synchronized (c1461) {
            try {
                if (c1461.f5214 == null) {
                    c1461.f5208.getClass();
                    C2565 c2566 = new C2565();
                    c2566.f1777 = true;
                    c1461.f5214 = c2566;
                }
                c2565 = c1461.f5214;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            C2565 c2567 = (C2565) c2565.clone();
            if (c2567.f1777 && !c2567.f1778) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c2567.f1778 = true;
            c2567.f1777 = true;
            this.f8142 = c2567;
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f8136 + ", treeNode=" + this.f8137 + "}";
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final synchronized void mo1620() {
        this.f8138.mo1620();
        m4576();
        C2712 c2712 = this.f8136;
        Iterator it = AbstractC3522.m5108((Set) c2712.f8760).iterator();
        while (it.hasNext()) {
            c2712.m4719((InterfaceC2554) it.next());
        }
        ((HashSet) c2712.f8761).clear();
        this.f8135.mo612(this);
        this.f8135.mo612(this.f8140);
        AbstractC3522.m5109().removeCallbacks(this.f8139);
        ComponentCallbacks2C0020 componentCallbacks2C0020 = this.f8133;
        synchronized (componentCallbacks2C0020.f543) {
            if (!componentCallbacks2C0020.f543.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C0020.f543.remove(this);
        }
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final synchronized void mo1622() {
        this.f8138.mo1622();
        m4577();
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final synchronized void mo1626() {
        m4578();
        this.f8138.mo1626();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4575(InterfaceC2894 interfaceC2894) {
        if (interfaceC2894 == null) {
            return;
        }
        boolean zM4579 = m4579(interfaceC2894);
        InterfaceC2554 interfaceC2554Mo1624 = interfaceC2894.mo1624();
        if (zM4579) {
            return;
        }
        ComponentCallbacks2C0020 componentCallbacks2C0020 = this.f8133;
        synchronized (componentCallbacks2C0020.f543) {
            try {
                Iterator it = componentCallbacks2C0020.f543.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C2563) it.next()).m4579(interfaceC2894)) {
                        return;
                    }
                }
                if (interfaceC2554Mo1624 != null) {
                    interfaceC2894.mo1618(null);
                    interfaceC2554Mo1624.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized void m4576() {
        try {
            Iterator it = AbstractC3522.m5108(this.f8138.f9314).iterator();
            while (it.hasNext()) {
                m4575((InterfaceC2894) it.next());
            }
            this.f8138.f9314.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final synchronized void m4577() {
        C2712 c2712 = this.f8136;
        c2712.f8759 = true;
        for (InterfaceC2554 interfaceC2554 : AbstractC3522.m5108((Set) c2712.f8760)) {
            if (interfaceC2554.isRunning()) {
                interfaceC2554.mo2852();
                ((HashSet) c2712.f8761).add(interfaceC2554);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final synchronized void m4578() {
        C2712 c2712 = this.f8136;
        c2712.f8759 = false;
        for (InterfaceC2554 interfaceC2554 : AbstractC3522.m5108((Set) c2712.f8760)) {
            if (!interfaceC2554.mo2858() && !interfaceC2554.isRunning()) {
                interfaceC2554.mo2857();
            }
        }
        ((HashSet) c2712.f8761).clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final synchronized boolean m4579(InterfaceC2894 interfaceC2894) {
        InterfaceC2554 interfaceC2554Mo1624 = interfaceC2894.mo1624();
        if (interfaceC2554Mo1624 == null) {
            return true;
        }
        if (!this.f8136.m4719(interfaceC2554Mo1624)) {
            return false;
        }
        this.f8138.f9314.remove(interfaceC2894);
        interfaceC2894.mo1618(null);
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
