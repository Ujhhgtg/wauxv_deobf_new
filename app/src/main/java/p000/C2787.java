package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᛸᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2787 implements InterfaceC0957, InterfaceC0956 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0970 f8897;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final RunnableC0972 f8898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public volatile int f8899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public volatile C0952 f8900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public volatile Object f8901;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public volatile C1995 f8902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public volatile C0953 f8903;

    public C2787(C0970 c0970, RunnableC0972 runnableC0972) {
        this.f8897 = c0970;
        this.f8898 = runnableC0972;
    }

    @Override // p000.InterfaceC0957
    public final void cancel() {
        C1995 c1995 = this.f8902;
        if (c1995 != null) {
            c1995.f6657.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // p000.InterfaceC0957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo2447() {
        boolean z;
        if (this.f8901 == null) {
            if (this.f8900 != null) {
            }
            this.f8900 = null;
            this.f8902 = null;
            z = false;
            while (true) {
                ArrayList arrayListM2491 = this.f8897.m2491();
                int i = this.f8899;
                this.f8899 = i + 1;
                this.f8902 = (C1995) arrayListM2491.get(i);
                if (this.f8902 == null) {
                }
            }
            return z;
        }
        Object obj = this.f8901;
        this.f8901 = null;
        try {
            if (m4767(obj)) {
                if (this.f8900 != null || !this.f8900.mo2447()) {
                    this.f8900 = null;
                    this.f8902 = null;
                    z = false;
                    while (!z && this.f8899 < this.f8897.m2491().size()) {
                        ArrayList arrayListM2492 = this.f8897.m2491();
                        int i2 = this.f8899;
                        this.f8899 = i2 + 1;
                        this.f8902 = (C1995) arrayListM2492.get(i2);
                        if (this.f8902 == null && (this.f8897.f3536.m2616(this.f8902.f6657.mo1857()) || this.f8897.m2492(this.f8902.f6657.mo1391()) != null)) {
                            this.f8902.f6657.mo1856(this.f8897.f3535, new C0542(this, this.f8902, 28, false));
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

    @Override // p000.InterfaceC0956
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2448(InterfaceC1749 interfaceC1749, Object obj, InterfaceC0955 interfaceC0955, int i, InterfaceC1749 interfaceC17410) {
        this.f8898.mo2448(interfaceC1749, obj, interfaceC0955, this.f8902.f6657.mo1857(), interfaceC1749);
    }

    @Override // p000.InterfaceC0956
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2449(InterfaceC1749 interfaceC1749, Exception exc, InterfaceC0955 interfaceC0955, int i) {
        this.f8898.mo2449(interfaceC1749, exc, interfaceC0955, this.f8902.f6657.mo1857());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4767(Object obj) throws Throwable {
        Throwable th;
        int i = 0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC0962 interfaceC0962M4560 = this.f8897.f3523.m3229().m4560(obj);
            Object objMo611 = interfaceC0962M4560.mo611();
            InterfaceC1207 interfaceC1207M2493 = this.f8897.m2493(objMo611);
            C0243 c0243 = new C0243(interfaceC1207M2493, objMo611, this.f8897.f3529, 5);
            InterfaceC1749 interfaceC1749 = this.f8902.f6655;
            C0970 c0970 = this.f8897;
            C0953 c0953 = new C0953(interfaceC1749, c0970.f3534);
            InterfaceC1062 interfaceC1062M2831 = c0970.f3528.m2831();
            interfaceC1062M2831.mo1514(c0953, c0243);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0953 + ", data: " + obj + ", encoder: " + interfaceC1207M2493 + ", duration: " + AbstractC1853.m3620(jElapsedRealtimeNanos));
            }
            if (interfaceC1062M2831.mo1511(c0953) != null) {
                this.f8903 = c0953;
                this.f8900 = new C0952(Collections.singletonList(this.f8902.f6655), this.f8897, this);
                this.f8902.f6657.mo1855();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f8903 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f8898.mo2448(this.f8902.f6655, interfaceC0962M4560.mo611(), this.f8902.f6657, this.f8902.f6657.mo1857(), this.f8902.f6655);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (true) {
                    throw th;
                }
                this.f8902.f6657.mo1855();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
