package p000;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0976 implements InterfaceC0959, Runnable, Comparable, InterfaceC1264 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final C2334 f3558 = new C2334("glide_thread_priority_override", null, C2334.f7534);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1216 f3562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2431 f3563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1472 f3566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public InterfaceC1772 f3567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public EnumC2454 f3568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1223 f3569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f3570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f3571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C1068 f3572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C2336 f3573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C1221 f3574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f3575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public long f3576;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Object f3577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public C1477 f3578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public Supplier f3579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public Thread f3580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public InterfaceC1772 f3581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC1772 f3582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public Object f3583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC0958 f3584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public volatile InterfaceC0960 f3585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public volatile boolean f3586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public volatile boolean f3587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public boolean f3588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f3589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f3590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f3591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0974 f3559 = new C0974();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f3560 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2872 f3561 = new C2872();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0253 f3564 = new C0253(6);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0975 f3565 = new C0975();

    public RunnableC0976(C1216 c1216, C0253 c0253) {
        this.f3562 = c1216;
        this.f3563 = c0253;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0976 runnableC0976 = (RunnableC0976) obj;
        int iOrdinal = this.f3568.ordinal() - runnableC0976.f3568.ordinal();
        return iOrdinal == 0 ? this.f3575 - runnableC0976.f3575 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0958 interfaceC0958 = this.f3584;
        try {
            try {
                if (this.f3587) {
                    m2627();
                    if (interfaceC0958 != null) {
                        interfaceC0958.mo1949();
                        return;
                    }
                    return;
                }
                m2632();
                if (interfaceC0958 != null) {
                    interfaceC0958.mo1949();
                }
            } catch (Throwable th) {
                if (interfaceC0958 != null) {
                    interfaceC0958.mo1949();
                }
                throw th;
            }
        } catch (C0530 e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f3587 + ", stage: " + AbstractC2844.m4794(this.f3589), th2);
            }
            if (this.f3589 != 5) {
                this.f3560.add(th2);
                m2627();
            }
            if (!this.f3587) {
                throw th2;
            }
            throw th2;
        }
    }

    @Override // p000.InterfaceC1264
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2872 mo2620() {
        return this.f3561;
    }

    @Override // p000.InterfaceC0959
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2567(InterfaceC1772 interfaceC1772, Object obj, InterfaceC0958 interfaceC0958, int i, InterfaceC1772 interfaceC1773) {
        this.f3581 = interfaceC1772;
        this.f3583 = obj;
        this.f3584 = interfaceC0958;
        this.f3591 = i;
        this.f3582 = interfaceC1773;
        this.f3588 = interfaceC1772 != this.f3559.m2614().get(0);
        if (Thread.currentThread() != this.f3580) {
            m2629(3);
        } else {
            m2623();
        }
    }

    @Override // p000.InterfaceC0959
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2568(InterfaceC1772 interfaceC1772, Exception exc, InterfaceC0958 interfaceC0958, int i) {
        interfaceC0958.mo1949();
        C1474 c1474 = new C1474("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1537 = interfaceC0958.mo1537();
        c1474.f5251 = interfaceC1772;
        c1474.f5252 = i;
        c1474.f5253 = clsMo1537;
        this.f3560.add(c1474);
        if (Thread.currentThread() != this.f3580) {
            m2629(2);
        } else {
            m2631();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2624 m2621(InterfaceC0958 interfaceC0958, Object obj, int i) {
        if (obj == null) {
            interfaceC0958.mo1949();
            return null;
        }
        try {
            int i2 = AbstractC1879.f6242;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC2624 interfaceC2624M2622 = m2622(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2626("Decoded result " + interfaceC2624M2622, jElapsedRealtimeNanos, null);
            }
            return interfaceC2624M2622;
        } finally {
            interfaceC0958.mo1949();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2624 m2622(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0974 c0974 = this.f3559;
        C1851 c1851M2616 = c0974.m2616(cls);
        C2336 c2336 = this.f3573;
        boolean z = i == 4 || c0974.f3554;
        C2334 c2334 = C1104.f4129;
        Boolean bool = (Boolean) c2336.m4294(c2334);
        if (bool == null || (bool.booleanValue() && !z)) {
            c2336 = new C2336();
            C0522 c0522 = this.f3573.f7541;
            C0522 c0523 = c2336.f7541;
            c0523.mo2012(c0522);
            c0523.put(c2334, Boolean.valueOf(z));
        }
        C2336 c2337 = c2336;
        InterfaceC0966 interfaceC0966M4582 = this.f3566.m3406().m4582(obj);
        try {
            return c1851M2616.m3760(this.f3570, this.f3571, new C0383(i, 4, this), interfaceC0966M4582, c2337);
        } finally {
            interfaceC0966M4582.mo753();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2623() {
        InterfaceC2624 interfaceC2624M2621;
        boolean zM2619;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m2626("Retrieved data", this.f3576, "data: " + this.f3583 + ", cache key: " + this.f3581 + ", fetcher: " + this.f3584);
        }
        C1878 c1878 = null;
        if (this.f3578.f5263.containsKey(AbstractC1470.class) && (supplier = this.f3579) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f3579.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f3579 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC2624M2621 = m2621(this.f3584, this.f3583, this.f3591);
        } catch (C1474 e2) {
            InterfaceC1772 interfaceC1772 = this.f3582;
            int i = this.f3591;
            e2.f5251 = interfaceC1772;
            e2.f5252 = i;
            e2.f5253 = null;
            this.f3560.add(e2);
            interfaceC2624M2621 = null;
        }
        if (interfaceC2624M2621 == null) {
            m2631();
            return;
        }
        int i2 = this.f3591;
        boolean z = this.f3588;
        if (interfaceC2624M2621 instanceof InterfaceC1648) {
            ((InterfaceC1648) interfaceC2624M2621).mo1735();
        }
        if (((C1878) this.f3564.f1480) != null) {
            c1878 = (C1878) C1878.f6236.mo1458();
            c1878.f6240 = false;
            c1878.f6239 = true;
            c1878.f6238 = interfaceC2624M2621;
            interfaceC2624M2621 = c1878;
        }
        if (this.f3578.f5263.containsKey(AbstractC1470.class)) {
            m2630();
        }
        m2633();
        C1221 c1221 = this.f3574;
        synchronized (c1221) {
            c1221.f4411 = interfaceC2624M2621;
            c1221.f4412 = i2;
            c1221.f4419 = z;
        }
        synchronized (c1221) {
            try {
                c1221.f4399.m4824();
                if (c1221.f4418) {
                    c1221.f4411.mo1352();
                    c1221.m2966();
                } else {
                    if (c1221.f4398.f4396.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c1221.f4413) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C0348 c0348 = c1221.f4402;
                    InterfaceC2624 interfaceC2624 = c1221.f4411;
                    boolean z2 = c1221.f4409;
                    C1223 c1223 = c1221.f4408;
                    InterfaceC1225 interfaceC1225 = c1221.f4400;
                    c0348.getClass();
                    c1221.f4416 = new C1226(interfaceC2624, z2, true, c1223, interfaceC1225);
                    c1221.f4413 = true;
                    C1220 c1220 = c1221.f4398;
                    c1220.getClass();
                    ArrayList<C1219> arrayList = new ArrayList(c1220.f4396);
                    c1221.m2964(arrayList.size() + 1);
                    ((C1217) c1221.f4403).m2958(c1221, c1221.f4408, c1221.f4416);
                    for (C1219 c1219 : arrayList) {
                        c1219.f4395.execute(new RunnableC1218(c1221, c1219.f4394, 1));
                    }
                    c1221.m2963();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3589 = 5;
        try {
            C0253 c0253 = this.f3564;
            if (((C1878) c0253.f1480) != null) {
                C1216 c1216 = this.f3562;
                C2336 c2336 = this.f3573;
                c0253.getClass();
                try {
                    c1216.m2953().mo1619((InterfaceC1772) c0253.f1478, new C0253((InterfaceC2630) c0253.f1479, (C1878) c0253.f1480, c2336, 5));
                    ((C1878) c0253.f1480).m3797();
                } catch (Throwable th2) {
                    ((C1878) c0253.f1480).m3797();
                    throw th2;
                }
            }
            if (c1878 != null) {
                c1878.m3797();
            }
            C0975 c0975 = this.f3565;
            synchronized (c0975) {
                c0975.f3556 = true;
                zM2619 = c0975.m2619();
            }
            if (zM2619) {
                m2628();
            }
        } catch (Throwable th3) {
            if (c1878 != null) {
                c1878.m3797();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0960 m2624() {
        int iM4792 = AbstractC2844.m4792(this.f3589);
        C0974 c0974 = this.f3559;
        if (iM4792 == 1) {
            return new C2625(c0974, this);
        }
        if (iM4792 == 2) {
            return new C0955(c0974.m2614(), c0974, this);
        }
        if (iM4792 == 3) {
            return new C2847(c0974, this);
        }
        if (iM4792 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC2844.m4794(this.f3589)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m2625(int i) {
        boolean z;
        boolean z2;
        int iM4792 = AbstractC2844.m4792(i);
        if (iM4792 == 0) {
            switch (this.f3572.f3862) {
                case 0:
                case 1:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return m2625(2);
        }
        if (iM4792 != 1) {
            if (iM4792 == 2) {
                return 4;
            }
            if (iM4792 == 3 || iM4792 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC2844.m4794(i)));
        }
        switch (this.f3572.f3862) {
            case 0:
                z2 = false;
                break;
            case 1:
            default:
                z2 = true;
                break;
        }
        if (z2) {
            return 3;
        }
        return m2625(3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2626(String str, long j, String str2) {
        StringBuilder sbM2803 = AbstractC1095.m2803(str, " in ");
        sbM2803.append(AbstractC1879.m3798(j));
        sbM2803.append(", load key: ");
        sbM2803.append(this.f3569);
        sbM2803.append(str2 != null ? ", ".concat(str2) : "");
        sbM2803.append(", thread: ");
        sbM2803.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM2803.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2627() {
        boolean zM2619;
        if (this.f3578.f5263.containsKey(AbstractC1470.class)) {
            m2630();
        }
        m2633();
        C1474 c1474 = new C1474("Failed to load resource", new ArrayList(this.f3560));
        C1221 c1221 = this.f3574;
        synchronized (c1221) {
            c1221.f4414 = c1474;
        }
        synchronized (c1221) {
            try {
                c1221.f4399.m4824();
                if (c1221.f4418) {
                    c1221.m2966();
                } else {
                    if (c1221.f4398.f4396.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c1221.f4415) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c1221.f4415 = true;
                    C1223 c1223 = c1221.f4408;
                    C1220 c1220 = c1221.f4398;
                    c1220.getClass();
                    ArrayList<C1219> arrayList = new ArrayList(c1220.f4396);
                    c1221.m2964(arrayList.size() + 1);
                    ((C1217) c1221.f4403).m2958(c1221, c1223, null);
                    for (C1219 c1219 : arrayList) {
                        c1219.f4395.execute(new RunnableC1218(c1221, c1219.f4394, 0));
                    }
                    c1221.m2963();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0975 c0975 = this.f3565;
        synchronized (c0975) {
            c0975.f3557 = true;
            zM2619 = c0975.m2619();
        }
        if (zM2619) {
            m2628();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2628() {
        C0975 c0975 = this.f3565;
        synchronized (c0975) {
            c0975.f3556 = false;
            c0975.f3555 = false;
            c0975.f3557 = false;
        }
        C0253 c0253 = this.f3564;
        c0253.f1478 = null;
        c0253.f1479 = null;
        c0253.f1480 = null;
        C0974 c0974 = this.f3559;
        c0974.f3539 = null;
        c0974.f3540 = null;
        c0974.f3550 = null;
        c0974.f3543 = null;
        c0974.f3547 = null;
        c0974.f3545 = null;
        c0974.f3551 = null;
        c0974.f3546 = null;
        c0974.f3552 = null;
        c0974.f3537.clear();
        c0974.f3548 = false;
        c0974.f3538.clear();
        c0974.f3549 = false;
        this.f3586 = false;
        this.f3566 = null;
        this.f3567 = null;
        this.f3573 = null;
        this.f3568 = null;
        this.f3569 = null;
        this.f3574 = null;
        this.f3589 = 0;
        this.f3585 = null;
        this.f3580 = null;
        this.f3581 = null;
        this.f3583 = null;
        this.f3591 = 0;
        this.f3584 = null;
        this.f3576 = 0L;
        this.f3587 = false;
        this.f3577 = null;
        this.f3560.clear();
        this.f3563.mo1457(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2629(int i) {
        this.f3590 = i;
        C1221 c1221 = this.f3574;
        (c1221.f4410 ? c1221.f4406 : c1221.f4405).execute(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2630() {
        if (!this.f3578.f5263.containsKey(AbstractC1470.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f3579;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f3579 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m2631() {
        this.f3580 = Thread.currentThread();
        int i = AbstractC1879.f6242;
        this.f3576 = SystemClock.elapsedRealtimeNanos();
        boolean zMo2566 = false;
        while (!this.f3587 && this.f3585 != null && !(zMo2566 = this.f3585.mo2566())) {
            this.f3589 = m2625(this.f3589);
            this.f3585 = m2624();
            if (this.f3589 == 4) {
                m2629(2);
                return;
            }
        }
        if ((this.f3589 == 6 || this.f3587) && !zMo2566) {
            m2627();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2632() {
        String str;
        int iM4792 = AbstractC2844.m4792(this.f3590);
        if (iM4792 == 0) {
            this.f3589 = m2625(1);
            this.f3585 = m2624();
            m2631();
        } else {
            if (iM4792 == 1) {
                m2631();
                return;
            }
            if (iM4792 == 2) {
                m2623();
                return;
            }
            int i = this.f3590;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m2633() {
        Throwable th;
        this.f3561.m4824();
        if (!this.f3586) {
            this.f3586 = true;
            return;
        }
        if (this.f3560.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f3560;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}
