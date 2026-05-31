package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᤞᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2847 implements InterfaceC0960, InterfaceC0959 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0974 f9059;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final RunnableC0976 f9060;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public volatile int f9061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public volatile C0955 f9062;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public volatile Object f9063;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public volatile C2026 f9064;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public volatile C0956 f9065;

    public C2847(C0974 c0974, RunnableC0976 runnableC0976) {
        this.f9059 = c0974;
        this.f9060 = runnableC0976;
    }

    @Override // p000.InterfaceC0960
    public final void cancel() {
        C2026 c2026 = this.f9064;
        if (c2026 != null) {
            c2026.f6762.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // p000.InterfaceC0960
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo2566() {
        boolean z;
        if (this.f9063 == null) {
            if (this.f9062 != null) {
            }
            this.f9062 = null;
            this.f9064 = null;
            z = false;
            while (!z) {
                ArrayList arrayListM2615 = this.f9059.m2615();
                int i = this.f9061;
                this.f9061 = i + 1;
                this.f9064 = (C2026) arrayListM2615.get(i);
                if (this.f9064 == null) {
                }
            }
            return z;
        }
        Object obj = this.f9063;
        this.f9063 = null;
        try {
            if (m4800(obj)) {
                if (this.f9062 != null || !this.f9062.mo2566()) {
                    this.f9062 = null;
                    this.f9064 = null;
                    z = false;
                    while (!z && this.f9061 < this.f9059.m2615().size()) {
                        ArrayList arrayListM2616 = this.f9059.m2615();
                        int i2 = this.f9061;
                        this.f9061 = i2 + 1;
                        this.f9064 = (C2026) arrayListM2616.get(i2);
                        if (this.f9064 == null && (this.f9059.f3552.m2742(this.f9064.f6762.mo1951()) || this.f9059.m2616(this.f9064.f6762.mo1537()) != null)) {
                            this.f9064.f6762.mo1950(this.f9059.f3551, new C0519(this, this.f9064, 28, false));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0959
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2567(InterfaceC1772 interfaceC1772, Object obj, InterfaceC0958 interfaceC0958, int i, InterfaceC1772 interfaceC1773) {
        this.f9060.mo2567(interfaceC1772, obj, interfaceC0958, this.f9064.f6762.mo1951(), interfaceC1772);
    }

    @Override // p000.InterfaceC0959
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2568(InterfaceC1772 interfaceC1772, Exception exc, InterfaceC0958 interfaceC0958, int i) {
        this.f9060.mo2568(interfaceC1772, exc, interfaceC0958, this.f9064.f6762.mo1951());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4800(Object obj) throws Throwable {
        Throwable th;
        int i = AbstractC1879.f6242;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC0966 interfaceC0966M4582 = this.f9059.f3539.m3406().m4582(obj);
            Object objMo754 = interfaceC0966M4582.mo754();
            InterfaceC1208 interfaceC1208M2617 = this.f9059.m2617(objMo754);
            C0253 c0253 = new C0253(interfaceC1208M2617, objMo754, this.f9059.f3545, 5);
            InterfaceC1772 interfaceC1772 = this.f9064.f6760;
            C0974 c0974 = this.f9059;
            C0956 c0956 = new C0956(interfaceC1772, c0974.f3550);
            InterfaceC1067 interfaceC1067M2953 = c0974.f3544.m2953();
            interfaceC1067M2953.mo1619(c0956, c0253);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0956 + ", data: " + obj + ", encoder: " + interfaceC1208M2617 + ", duration: " + AbstractC1879.m3798(jElapsedRealtimeNanos));
            }
            if (interfaceC1067M2953.mo1616(c0956) != null) {
                this.f9065 = c0956;
                this.f9062 = new C0955(Collections.singletonList(this.f9064.f6760), this.f9059, this);
                this.f9064.f6762.mo1949();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f9065 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f9060.mo2567(this.f9064.f6760, interfaceC0966M4582.mo754(), this.f9064.f6762, this.f9064.f6762.mo1951(), this.f9064.f6760);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f9064.f6762.mo1949();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
