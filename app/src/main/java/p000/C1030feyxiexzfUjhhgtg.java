package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import androidx.savedstate.Recreator;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ要点脸ᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1030feyxiexzfUjhhgtg implements InterfaceC3595feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static volatile C1030feyxiexzfUjhhgtg f4028Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4029Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f4030Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f4031Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object f4032Ujhhgtgfeyxiexzf;

    public C1030feyxiexzfUjhhgtg() {
        this.f4029Ujhhgtgfeyxiexzf = 2;
        this.f4031Ujhhgtgfeyxiexzf = Collections.newSetFromMap(new WeakHashMap());
        this.f4032Ujhhgtgfeyxiexzf = new HashSet();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C1030feyxiexzfUjhhgtg m2522Ujhhgtgfeyxiexzf(Context context) {
        if (f4028Ujhhgtgfeyxiexzf == null) {
            synchronized (C1030feyxiexzfUjhhgtg.class) {
                try {
                    if (f4028Ujhhgtgfeyxiexzf == null) {
                        f4028Ujhhgtgfeyxiexzf = new C1030feyxiexzfUjhhgtg(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4028Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3595feyxiexzfUjhhgtg
    public Object get() {
        if (this.f4030Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("Glide registry");
        this.f4030Ujhhgtgfeyxiexzf = true;
        try {
            return AbstractC1245feyxiexzfUjhhgtg.m2749Ujhhgtgfeyxiexzf((Ujhhgtgfeyxiexzf) this.f4031Ujhhgtgfeyxiexzf, (ArrayList) this.f4032Ujhhgtgfeyxiexzf);
        } finally {
            this.f4030Ujhhgtgfeyxiexzf = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f4029Ujhhgtgfeyxiexzf) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f4031Ujhhgtgfeyxiexzf).size() + ", isPaused=" + this.f4030Ujhhgtgfeyxiexzf + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean m2523Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        boolean z = true;
        if (interfaceC0994feyxiexzfUjhhgtg == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f4031Ujhhgtgfeyxiexzf).remove(interfaceC0994feyxiexzfUjhhgtg);
        if (!((HashSet) this.f4032Ujhhgtgfeyxiexzf).remove(interfaceC0994feyxiexzfUjhhgtg) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC0994feyxiexzfUjhhgtg.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m2524Ujhhgtgfeyxiexzf() {
        if (this.f4030Ujhhgtgfeyxiexzf || ((HashSet) this.f4032Ujhhgtgfeyxiexzf).isEmpty()) {
            return;
        }
        C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg = (C3187feyxiexzfUjhhgtg) this.f4031Ujhhgtgfeyxiexzf;
        C3331feyxiexzfUjhhgtg c3331feyxiexzfUjhhgtg = (C3331feyxiexzfUjhhgtg) c3187feyxiexzfUjhhgtg.f9845Ujhhgtgfeyxiexzf;
        boolean z = false;
        c3187feyxiexzfUjhhgtg.f9843Ujhhgtgfeyxiexzf = ((ConnectivityManager) c3331feyxiexzfUjhhgtg.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c3331feyxiexzfUjhhgtg.get()).registerDefaultNetworkCallback((C1031feyxiexzfUjhhgtg) c3187feyxiexzfUjhhgtg.f9846Ujhhgtgfeyxiexzf);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f4030Ujhhgtgfeyxiexzf = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能要点脸ᛲᛴ, 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能要点脸ᛴᛱUjhhgtgᛱᛲ] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m2525Ujhhgtgfeyxiexzf() {
        ?? r0 = this.f4031Ujhhgtgfeyxiexzf;
        androidx.lifecycle.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf = r0.mo895Ujhhgtgfeyxiexzf();
        if (ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf.f301Ujhhgtgfeyxiexzf != EnumC0044Ujhhgtgfeyxiexzf.f1057Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf.m97Ujhhgtgfeyxiexzf(new Recreator(r0));
        final C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = (C2362Ujhhgtgfeyxiexzf) this.f4032Ujhhgtgfeyxiexzf;
        if (c2362Ujhhgtgfeyxiexzf.f7695Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ujhhgtgfeyxiexzfMo895Ujhhgtgfeyxiexzf.m97Ujhhgtgfeyxiexzf(new InterfaceC0053Ujhhgtgfeyxiexzf() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能要点脸ᛱUjhhgtgᛱᛴᛲ
            @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
            public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 = Ujhhgtgfeyxiexzf.ON_START;
                C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf2 = c2362Ujhhgtgfeyxiexzf;
                if (ujhhgtgfeyxiexzf == ujhhgtgfeyxiexzf2) {
                    c2362Ujhhgtgfeyxiexzf2.f7697Ujhhgtgfeyxiexzf = true;
                } else if (ujhhgtgfeyxiexzf == Ujhhgtgfeyxiexzf.ON_STOP) {
                    c2362Ujhhgtgfeyxiexzf2.f7697Ujhhgtgfeyxiexzf = false;
                }
            }
        });
        c2362Ujhhgtgfeyxiexzf.f7695Ujhhgtgfeyxiexzf = true;
        this.f4030Ujhhgtgfeyxiexzf = true;
    }

    public C1030feyxiexzfUjhhgtg(InterfaceC1096feyxiexzfUjhhgtg interfaceC1096feyxiexzfUjhhgtg) {
        this.f4029Ujhhgtgfeyxiexzf = 3;
        this.f4031Ujhhgtgfeyxiexzf = interfaceC1096feyxiexzfUjhhgtg;
        this.f4032Ujhhgtgfeyxiexzf = new C2362Ujhhgtgfeyxiexzf();
    }

    public C1030feyxiexzfUjhhgtg(Context context) {
        this.f4029Ujhhgtgfeyxiexzf = 0;
        this.f4032Ujhhgtgfeyxiexzf = new HashSet();
        this.f4031Ujhhgtgfeyxiexzf = new C3187feyxiexzfUjhhgtg(new C3331feyxiexzfUjhhgtg(new C3167feyxiexzfUjhhgtg(context, 10)), new C1029feyxiexzfUjhhgtg(this));
    }

    public C1030feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, ArrayList arrayList, AbstractC1246feyxiexzfUjhhgtg abstractC1246feyxiexzfUjhhgtg) {
        this.f4029Ujhhgtgfeyxiexzf = 1;
        this.f4031Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf;
        this.f4032Ujhhgtgfeyxiexzf = arrayList;
    }
}
