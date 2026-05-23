package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1070 implements InterfaceC1062 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final File f3881;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1069 f3884;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0542 f3883 = new C0542(8);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final long f3882 = 262144000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0542 f3880 = new C0542(27);

    public C1070(File file) {
        this.f3881 = file;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized C1069 m2634() {
        try {
            if (this.f3884 == null) {
                this.f3884 = C1069.m2624(this.f3881, this.f3882);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3884;
    }

    @Override // p000.InterfaceC1062
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final File mo1511(InterfaceC1749 interfaceC1749) {
        String strM1894 = this.f3880.m1894(interfaceC1749);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM1894 + " for for Key: " + interfaceC1749);
        }
        try {
            C0094 c0094M2627 = m2634().m2627(strM1894);
            if (c0094M2627 != null) {
                return ((File[]) c0094M2627.f1049)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // p000.InterfaceC1062
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1514(InterfaceC1749 interfaceC1749, C0243 c0243) {
        C1064 c1064;
        String strM1894 = this.f3880.m1894(interfaceC1749);
        C0542 c0542 = this.f3883;
        synchronized (c0542) {
            c1064 = (C1064) ((HashMap) c0542.f2252).get(strM1894);
            if (c1064 == null) {
                C0530 c0530 = (C0530) c0542.f2253;
                synchronized (c0530.f2223) {
                    c1064 = (C1064) c0530.f2223.poll();
                }
                if (c1064 == null) {
                    c1064 = new C1064();
                }
                ((HashMap) c0542.f2252).put(strM1894, c1064);
            }
            c1064.f3853++;
        }
        c1064.f3852.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM1894 + " for for Key: " + interfaceC1749);
            }
            try {
                C1069 c1069M2634 = m2634();
                if (c1069M2634.m2627(strM1894) == null) {
                    C1067 c1067M2626 = c1069M2634.m2626(strM1894);
                    if (c1067M2626 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM1894));
                    }
                    try {
                        if (((InterfaceC1207) c0243.f1404).mo1510(c0243.f1405, c1067M2626.m2618(), (C2303) c0243.f1406)) {
                            C1069.m2620((C1069) c1067M2626.f3858, c1067M2626, true);
                            c1067M2626.f3855 = true;
                        }
                        if (!c1067M2626.f3855) {
                            try {
                                c1067M2626.m2617();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!c1067M2626.f3855) {
                            try {
                                c1067M2626.m2617();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.f3883.m1913(strM1894);
        } catch (Throwable th2) {
            this.f3883.m1913(strM1894);
            throw th2;
        }
    }
}
