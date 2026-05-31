package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1075 implements InterfaceC1067 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final File f3892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1074 f3895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0519 f3894 = new C0519(9);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final long f3893 = 262144000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0519 f3891 = new C0519(27);

    public C1075(File file) {
        this.f3892 = file;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized C1074 m2760() {
        try {
            if (this.f3895 == null) {
                this.f3895 = C1074.m2750(this.f3892, this.f3893);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3895;
    }

    @Override // p000.InterfaceC1067
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final File mo1616(InterfaceC1772 interfaceC1772) {
        String strM1988 = this.f3891.m1988(interfaceC1772);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM1988 + " for for Key: " + interfaceC1772);
        }
        try {
            C0102 c0102M2753 = m2760().m2753(strM1988);
            if (c0102M2753 != null) {
                return ((File[]) c0102M2753.f1117)[0];
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

    @Override // p000.InterfaceC1067
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1619(InterfaceC1772 interfaceC1772, C0253 c0253) {
        C1069 c1069;
        String strM1988 = this.f3891.m1988(interfaceC1772);
        C0519 c0519 = this.f3894;
        synchronized (c0519) {
            c1069 = (C1069) ((HashMap) c0519.f2208).get(strM1988);
            if (c1069 == null) {
                C0507 c0507 = (C0507) c0519.f2209;
                synchronized (c0507.f2179) {
                    c1069 = (C1069) c0507.f2179.poll();
                }
                if (c1069 == null) {
                    c1069 = new C1069();
                }
                ((HashMap) c0519.f2208).put(strM1988, c1069);
            }
            c1069.f3864++;
        }
        c1069.f3863.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM1988 + " for for Key: " + interfaceC1772);
            }
            try {
                C1074 c1074M2760 = m2760();
                if (c1074M2760.m2753(strM1988) == null) {
                    C1072 c1072M2752 = c1074M2760.m2752(strM1988);
                    if (c1072M2752 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM1988));
                    }
                    try {
                        if (((InterfaceC1208) c0253.f1478).mo1615(c0253.f1479, c1072M2752.m2744(), (C2336) c0253.f1480)) {
                            C1074.m2746((C1074) c1072M2752.f3869, c1072M2752, true);
                            c1072M2752.f3866 = true;
                        }
                        if (!c1072M2752.f3866) {
                            try {
                                c1072M2752.m2743();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!c1072M2752.f3866) {
                            try {
                                c1072M2752.m2743();
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
            this.f3894.m2007(strM1988);
        } catch (Throwable th2) {
            this.f3894.m2007(strM1988);
            throw th2;
        }
    }
}
