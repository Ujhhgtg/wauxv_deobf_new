package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0000;
import androidx.savedstate.Recreator;
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 implements InterfaceC1467 {

    public static volatile C2712 f8757;

    public final /* synthetic */ int f8758;

    public boolean f8759;

    public final Object f8760;

    public final Object f8761;

    public C2712() {
        this.f8758 = 2;
        this.f8760 = Collections.newSetFromMap(new WeakHashMap());
        this.f8761 = new HashSet();
    }

    public static C2712 m4718(Context context) {
        if (f8757 == null) {
            synchronized (C2712.class) {
                try {
                    if (f8757 == null) {
                        f8757 = new C2712(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8757;
    }

    @Override // p000.InterfaceC1467
    public Object get() {
        if (this.f8759) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        AbstractC0743.m2172("Glide registry");
        this.f8759 = true;
        try {
            return AbstractC3453.m4990((ComponentCallbacks2C0020) this.f8760, (ArrayList) this.f8761);
        } finally {
            this.f8759 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f8758) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f8760).size() + ", isPaused=" + this.f8759 + "}";
            default:
                return super.toString();
        }
    }

    public boolean m4719(InterfaceC2554 interfaceC2554) {
        boolean z = true;
        if (interfaceC2554 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f8760).remove(interfaceC2554);
        if (!((HashSet) this.f8761).remove(interfaceC2554) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC2554.clear();
        }
        return z;
    }

    public void m4720() {
        if (this.f8759 || ((HashSet) this.f8761).isEmpty()) {
            return;
        }
        C1067 c1067 = (C1067) this.f8760;
        C1215 c1215 = (C1215) c1067.f3857;
        boolean z = false;
        c1067.f3855 = ((ConnectivityManager) c1215.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c1215.get()).registerDefaultNetworkCallback((C2711) c1067.f3858);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f8759 = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᲇᤝᲈ, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᛸᤝᲈ] */
    public void m4721() {
        ?? r0 = this.f8760;
        C0000 c0000Mo750 = r0.mo750();
        if (c0000Mo750.f300 != EnumC1770.f5892) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0000Mo750.m97(new Recreator(r0));
        final C0214 c0214 = (C0214) this.f8761;
        if (c0214.f1324) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0000Mo750.m97(new InterfaceC1774() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᤝᲇᲈᛸ
            @Override // p000.InterfaceC1774
            public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
                EnumC1769 enumC17610 = EnumC1769.ON_START;
                C0214 c0215 = c0214;
                if (enumC1769 == enumC17610) {
                    c0215.f1326 = true;
                } else if (enumC1769 == EnumC1769.ON_STOP) {
                    c0215.f1326 = false;
                }
            }
        });
        c0214.f1324 = true;
        this.f8759 = true;
    }

    public C2712(InterfaceC2629 interfaceC2629) {
        this.f8758 = 3;
        this.f8760 = interfaceC2629;
        this.f8761 = new C0214();
    }

    public C2712(Context context) {
        this.f8758 = 0;
        this.f8761 = new HashSet();
        this.f8760 = new C1067(new C1215(new C1044(context, 10)), new C2709(this));
    }

    public C2712(ComponentCallbacks2C0020 componentCallbacks2C0020, ArrayList arrayList, AbstractC3681 abstractC3681) {
        this.f8758 = 1;
        this.f8760 = componentCallbacks2C0020;
        this.f8761 = arrayList;
    }
}
