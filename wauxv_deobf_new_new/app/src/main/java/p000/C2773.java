package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0000;
import androidx.savedstate.Recreator;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2773 implements InterfaceC1478 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static volatile C2773 f8920;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8921;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f8923;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f8924;

    public C2773() {
        this.f8921 = 2;
        this.f8923 = Collections.newSetFromMap(new WeakHashMap());
        this.f8924 = new HashSet();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2773 m4752(Context context) {
        if (f8920 == null) {
            synchronized (C2773.class) {
                try {
                    if (f8920 == null) {
                        f8920 = new C2773(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8920;
    }

    @Override // p000.InterfaceC1478
    public Object get() {
        if (this.f8922) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        AbstractC1468.m3299("Glide registry");
        this.f8922 = true;
        try {
            return AbstractC1467.m3269((ComponentCallbacks2C0027) this.f8923, (ArrayList) this.f8924);
        } finally {
            this.f8922 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f8921) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f8923).size() + ", isPaused=" + this.f8922 + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean m4753(InterfaceC2610 interfaceC2610) {
        boolean z = true;
        if (interfaceC2610 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f8923).remove(interfaceC2610);
        if (!((HashSet) this.f8924).remove(interfaceC2610) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC2610.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m4754() {
        if (this.f8922 || ((HashSet) this.f8924).isEmpty()) {
            return;
        }
        C1072 c1072 = (C1072) this.f8923;
        C1216 c1216 = (C1216) c1072.f3868;
        boolean z = false;
        c1072.f3866 = ((ConnectivityManager) c1216.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c1216.get()).registerDefaultNetworkCallback((C2772) c1072.f3869);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f8922 = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᲈᛸᤝᲇ, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᲇᛸᤝᤞ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m4755() {
        ?? r0 = this.f8923;
        C0000 c0000Mo894 = r0.mo894();
        if (c0000Mo894.f300 != EnumC1793.f5948) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0000Mo894.m97(new Recreator(r0));
        final C0224 c0224 = (C0224) this.f8924;
        if (c0224.f1398) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0000Mo894.m97(new InterfaceC1797() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤞᤝᲇᛸ
            @Override // p000.InterfaceC1797
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
            public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
                EnumC1792 enumC1793 = EnumC1792.ON_START;
                C0224 c0225 = c0224;
                if (enumC1792 == enumC1793) {
                    c0225.f1400 = true;
                } else if (enumC1792 == EnumC1792.ON_STOP) {
                    c0225.f1400 = false;
                }
            }
        });
        c0224.f1398 = true;
        this.f8922 = true;
    }

    public C2773(InterfaceC2690 interfaceC2690) {
        this.f8921 = 3;
        this.f8923 = interfaceC2690;
        this.f8924 = new C0224();
    }

    public C2773(Context context) {
        this.f8921 = 0;
        this.f8924 = new HashSet();
        this.f8923 = new C1072(new C1216(new C1047(context, 10)), new C2770(this));
    }

    public C2773(ComponentCallbacks2C0027 componentCallbacks2C0027, ArrayList arrayList, AbstractC2240 abstractC2240) {
        this.f8921 = 1;
        this.f8923 = componentCallbacks2C0027;
        this.f8924 = arrayList;
    }
}
