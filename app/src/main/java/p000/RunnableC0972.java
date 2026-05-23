package p000;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲁᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0972 implements InterfaceC0956, Runnable, Comparable, InterfaceC1262 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static final C2301 f3542 = new C2301("glide_thread_priority_override", null, C2301.f7412);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1215 f3546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2378 f3547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1461 f3550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public InterfaceC1749 f3551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public EnumC2401 f3552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1222 f3553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f3554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f3555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C1063 f3556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C2303 f3557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C1220 f3558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f3559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public long f3560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Object f3561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public C1466 f3562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public Supplier f3563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public Thread f3564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC1749 f3565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC1749 f3566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public Object f3567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC0955 f3568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public volatile InterfaceC0957 f3569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public volatile boolean f3570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public volatile boolean f3571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f3572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f3573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f3574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f3575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0970 f3543 = new C0970();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f3544 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2812 f3545 = new C2812();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0243 f3548 = new C0243(6);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0971 f3549 = new C0971();

    public RunnableC0972(C1215 c1215, C0243 c0243) {
        this.f3546 = c1215;
        this.f3547 = c0243;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0972 runnableC0972 = (RunnableC0972) obj;
        int iOrdinal = this.f3552.ordinal() - runnableC0972.f3552.ordinal();
        return iOrdinal == 0 ? this.f3559 - runnableC0972.f3559 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0955 interfaceC0955 = this.f3568;
        try {
            try {
                if (this.f3571) {
                    m2503();
                    if (interfaceC0955 != null) {
                        interfaceC0955.mo1855();
                        return;
                    }
                    return;
                }
                m2508();
                if (interfaceC0955 != null) {
                    interfaceC0955.mo1855();
                }
            } catch (Throwable th) {
                if (interfaceC0955 != null) {
                    interfaceC0955.mo1855();
                }
                throw th;
            }
        } catch (C0553 e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f3571 + ", stage: " + AbstractC2784.m4761(this.f3573), th2);
            }
            if (this.f3573 != 5) {
                this.f3544.add(th2);
                m2503();
            }
            if (!this.f3571) {
                throw th2;
            }
            throw th2;
        }
    }

    @Override // p000.InterfaceC1262
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2812 mo2496() {
        return this.f3545;
    }

    @Override // p000.InterfaceC0956
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2448(InterfaceC1749 interfaceC1749, Object obj, InterfaceC0955 interfaceC0955, int i, InterfaceC1749 interfaceC17410) {
        this.f3565 = interfaceC1749;
        this.f3567 = obj;
        this.f3568 = interfaceC0955;
        this.f3575 = i;
        this.f3566 = interfaceC17410;
        this.f3572 = interfaceC1749 != this.f3543.m2490().get(0);
        if (Thread.currentThread() != this.f3564) {
            m2505(3);
        } else {
            m2499();
        }
    }

    @Override // p000.InterfaceC0956
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2449(InterfaceC1749 interfaceC1749, Exception exc, InterfaceC0955 interfaceC0955, int i) {
        interfaceC0955.mo1855();
        C1463 c1463 = new C1463("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1391 = interfaceC0955.mo1391();
        c1463.f5219 = interfaceC1749;
        c1463.f5220 = i;
        c1463.f5221 = clsMo1391;
        this.f3544.add(c1463);
        if (Thread.currentThread() != this.f3564) {
            m2505(2);
        } else {
            m2507();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2568 m2497(InterfaceC0955 interfaceC0955, Object obj, int i) {
        if (obj == null) {
            interfaceC0955.mo1855();
            return null;
        }
        try {
            int i2 = 0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC2568 interfaceC2568M2498 = m2498(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2502("Decoded result " + interfaceC2568M2498, jElapsedRealtimeNanos, null);
            }
            return interfaceC2568M2498;
        } finally {
            interfaceC0955.mo1855();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2568 m2498(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0970 c0970 = this.f3543;
        C1824 c1824M2492 = c0970.m2492(cls);
        C2303 c2303 = this.f3557;
        boolean z = i == 4 || c0970.f3538;
        C2301 c2301 = C1098.f4118;
        Boolean bool = (Boolean) c2303.m4165(c2301);
        if (bool == null || (bool.booleanValue() && !z)) {
            c2303 = new C2303();
            C0545 c0545 = this.f3557.f7419;
            C0545 c0546 = c2303.f7419;
            c0546.mo1917(c0545);
            c0546.put(c2301, Boolean.valueOf(z));
        }
        C2303 c2304 = c2303;
        InterfaceC0962 interfaceC0962M4560 = this.f3550.m3229().m4560(obj);
        try {
            return c1824M2492.m3582(this.f3554, this.f3555, new C0408(i, 4, this), interfaceC0962M4560, c2304);
        } finally {
            interfaceC0962M4560.mo610();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2499() {
        InterfaceC2568 interfaceC2568M2497;
        boolean zM2495;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m2502("Retrieved data", this.f3560, "data: " + this.f3567 + ", cache key: " + this.f3565 + ", fetcher: " + this.f3568);
        }
        C1852 c1852 = null;
        if (this.f3562.f5231.containsKey(AbstractC1460.class) && (supplier = this.f3563) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f3563.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f3563 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC2568M2497 = m2497(this.f3568, this.f3567, this.f3575);
        } catch (C1463 e2) {
            InterfaceC1749 interfaceC1749 = this.f3566;
            int i = this.f3575;
            e2.f5219 = interfaceC1749;
            e2.f5220 = i;
            e2.f5221 = null;
            this.f3544.add(e2);
            interfaceC2568M2497 = null;
        }
        if (interfaceC2568M2497 == null) {
            m2507();
            return;
        }
        int i2 = this.f3575;
        boolean z = this.f3572;
        if (interfaceC2568M2497 instanceof InterfaceC1635) {
            ((InterfaceC1635) interfaceC2568M2497).mo1629();
        }
        if (((C1852) this.f3548.f1406) != null) {
            c1852 = (C1852) C1852.f6162.mo1312();
            c1852.f6166 = false;
            c1852.f6165 = true;
            c1852.f6164 = interfaceC2568M2497;
            interfaceC2568M2497 = c1852;
        }
        if (this.f3562.f5231.containsKey(AbstractC1460.class)) {
            m2506();
        }
        m2509();
        C1220 c1220 = this.f3558;
        synchronized (c1220) {
            c1220.f4414 = interfaceC2568M2497;
            c1220.f4415 = i2;
            c1220.f4422 = z;
        }
        synchronized (c1220) {
            try {
                c1220.f4402.m4791();
                if (c1220.f4421) {
                    c1220.f4414.mo1206();
                    c1220.m2844();
                } else {
                    if (c1220.f4401.f4399.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c1220.f4416) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C0373 c0373 = c1220.f4405;
                    InterfaceC2568 interfaceC2568 = c1220.f4414;
                    boolean z2 = c1220.f4412;
                    C1222 c1222 = c1220.f4411;
                    InterfaceC1223 interfaceC1223 = c1220.f4403;
                    
                    c1220.f4419 = new C1224(interfaceC2568, z2, true, c1222, interfaceC1223);
                    c1220.f4416 = true;
                    C1219 c1219 = c1220.f4401;
                    
                    ArrayList<C1218> arrayList = new ArrayList(c1219.f4399);
                    c1220.m2842(arrayList.size() + 1);
                    ((C1216) c1220.f4406).m2836(c1220, c1220.f4411, c1220.f4419);
                    for (C1218 c1218 : arrayList) {
                        c1218.f4398.execute(new RunnableC1217(c1220, c1218.f4397, 1));
                    }
                    c1220.m2841();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3573 = 5;
        try {
            C0243 c0243 = this.f3548;
            if (((C1852) c0243.f1406) != null) {
                C1215 c1215 = this.f3546;
                C2303 c2303 = this.f3557;
                
                try {
                    c1215.m2831().mo1514((InterfaceC1749) c0243.f1404, new C0243((InterfaceC2574) c0243.f1405, (C1852) c0243.f1406, c2303, 5));
                    ((C1852) c0243.f1406).m3619();
                } catch (Throwable th2) {
                    ((C1852) c0243.f1406).m3619();
                    throw th2;
                }
            }
            if (c1852 != null) {
                c1852.m3619();
            }
            C0971 c0971 = this.f3549;
            synchronized (c0971) {
                c0971.f3540 = true;
                zM2495 = c0971.m2495();
            }
            if (zM2495) {
                m2504();
            }
        } catch (Throwable th3) {
            if (c1852 != null) {
                c1852.m3619();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0957 m2500() {
        int iM4759 = AbstractC2784.m4759(this.f3573);
        C0970 c0970 = this.f3543;
        if (iM4759 == 1) {
            return new C2569(c0970, this);
        }
        if (iM4759 == 2) {
            return new C0952(c0970.m2490(), c0970, this);
        }
        if (iM4759 == 3) {
            return new C2787(c0970, this);
        }
        if (iM4759 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC2784.m4761(this.f3573)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m2501(int i) {
        boolean z;
        boolean z2;
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 == 0) {
            switch (this.f3556.f3851) {
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
            return m2501(2);
        }
        if (iM4759 != 1) {
            if (iM4759 == 2) {
                return 4;
            }
            if (iM4759 == 3 || iM4759 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC2784.m4761(i)));
        }
        switch (this.f3556.f3851) {
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
        return m2501(3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2502(String str, long j, String str2) {
        StringBuilder sbM2788 = AbstractC1194.m2788(str, " in ");
        sbM2788.append(AbstractC1853.m3620(j));
        sbM2788.append(", load key: ");
        sbM2788.append(this.f3553);
        sbM2788.append(str2 != null ? ", ".concat(str2) : "");
        sbM2788.append(", thread: ");
        sbM2788.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM2788.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2503() {
        boolean zM2495;
        if (this.f3562.f5231.containsKey(AbstractC1460.class)) {
            m2506();
        }
        m2509();
        C1463 c1463 = new C1463("Failed to load resource", new ArrayList(this.f3544));
        C1220 c1220 = this.f3558;
        synchronized (c1220) {
            c1220.f4417 = c1463;
        }
        synchronized (c1220) {
            try {
                c1220.f4402.m4791();
                if (c1220.f4421) {
                    c1220.m2844();
                } else {
                    if (c1220.f4401.f4399.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c1220.f4418) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c1220.f4418 = true;
                    C1222 c1222 = c1220.f4411;
                    C1219 c1219 = c1220.f4401;
                    
                    ArrayList<C1218> arrayList = new ArrayList(c1219.f4399);
                    c1220.m2842(arrayList.size() + 1);
                    ((C1216) c1220.f4406).m2836(c1220, c1222, null);
                    for (C1218 c1218 : arrayList) {
                        c1218.f4398.execute(new RunnableC1217(c1220, c1218.f4397, 0));
                    }
                    c1220.m2841();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0971 c0971 = this.f3549;
        synchronized (c0971) {
            c0971.f3541 = true;
            zM2495 = c0971.m2495();
        }
        if (zM2495) {
            m2504();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2504() {
        C0971 c0971 = this.f3549;
        synchronized (c0971) {
            c0971.f3540 = false;
            c0971.f3539 = false;
            c0971.f3541 = false;
        }
        C0243 c0243 = this.f3548;
        c0243.f1404 = null;
        c0243.f1405 = null;
        c0243.f1406 = null;
        C0970 c0970 = this.f3543;
        c0970.f3523 = null;
        c0970.f3524 = null;
        c0970.f3534 = null;
        c0970.f3527 = null;
        c0970.f3531 = null;
        c0970.f3529 = null;
        c0970.f3535 = null;
        c0970.f3530 = null;
        c0970.f3536 = null;
        c0970.f3521.clear();
        c0970.f3532 = false;
        c0970.f3522.clear();
        c0970.f3533 = false;
        this.f3570 = false;
        this.f3550 = null;
        this.f3551 = null;
        this.f3557 = null;
        this.f3552 = null;
        this.f3553 = null;
        this.f3558 = null;
        this.f3573 = 0;
        this.f3569 = null;
        this.f3564 = null;
        this.f3565 = null;
        this.f3567 = null;
        this.f3575 = 0;
        this.f3568 = null;
        this.f3560 = 0L;
        this.f3571 = false;
        this.f3561 = null;
        this.f3544.clear();
        this.f3547.mo1311(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2505(int i) {
        this.f3574 = i;
        C1220 c1220 = this.f3558;
        (c1220.f4413 ? c1220.f4409 : c1220.f4408).execute(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2506() {
        if (!this.f3562.f5231.containsKey(AbstractC1460.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f3563;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f3563 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m2507() {
        this.f3564 = Thread.currentThread();
        int i = 0;
        this.f3560 = SystemClock.elapsedRealtimeNanos();
        boolean zMo2447 = false;
        while (!this.f3571 && this.f3569 != null && !(zMo2447 = this.f3569.mo2447())) {
            this.f3573 = m2501(this.f3573);
            this.f3569 = m2500();
            if (this.f3573 == 4) {
                m2505(2);
                return;
            }
        }
        if ((this.f3573 == 6 || this.f3571) && !zMo2447) {
            m2503();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2508() {
        String str;
        int iM4759 = AbstractC2784.m4759(this.f3574);
        if (iM4759 == 0) {
            this.f3573 = m2501(1);
            this.f3569 = m2500();
            m2507();
        } else {
            if (iM4759 == 1) {
                m2507();
                return;
            }
            if (iM4759 == 2) {
                m2499();
                return;
            }
            int i = this.f3574;
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
    public final void m2509() {
        Throwable th;
        this.f3545.m4791();
        if (!this.f3570) {
            this.f3570 = true;
            return;
        }
        if (this.f3544.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f3544;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}
