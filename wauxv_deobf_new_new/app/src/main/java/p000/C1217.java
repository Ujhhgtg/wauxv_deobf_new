package p000;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᤞᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1217 implements InterfaceC1222, InterfaceC1225 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final boolean f4383 = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0967 f4384;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1224 f4385;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1897 f4386;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1215 f4387;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0427 f4388;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0231 f4389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0253 f4390;

    public C1217(C1897 c1897, C1681 c1681, ExecutorServiceC1476 executorServiceC1476, ExecutorServiceC1476 executorServiceC1477, ExecutorServiceC1476 executorServiceC1478, ExecutorServiceC1476 executorServiceC1479) {
        this.f4386 = c1897;
        C1216 c1216 = new C1216(c1681);
        C0253 c0253 = new C0253();
        this.f4390 = c0253;
        synchronized (this) {
            synchronized (c0253) {
                c0253.f1480 = this;
            }
        }
        this.f4385 = new C1224(0);
        this.f4384 = new C0967(2);
        C1215 c1215 = new C1215();
        c1215.f4380 = AbstractC2902.m4902(Opcodes.FCMPG, new C0102(c1215, 23));
        c1215.f4374 = executorServiceC1476;
        c1215.f4375 = executorServiceC1477;
        c1215.f4376 = executorServiceC1478;
        c1215.f4377 = executorServiceC1479;
        c1215.f4378 = this;
        c1215.f4379 = this;
        this.f4387 = c1215;
        C0231 c0231 = new C0231();
        c0231.f1427 = AbstractC2902.m4902(Opcodes.FCMPG, new C0102(c0231, 22));
        c0231.f1426 = c1216;
        this.f4389 = c0231;
        this.f4388 = new C0427();
        c1897.f6292 = this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m2954(String str, long j, C1223 c1223) {
        StringBuilder sbM2803 = AbstractC1095.m2803(str, " in ");
        sbM2803.append(AbstractC1879.m3798(j));
        sbM2803.append("ms, key: ");
        sbM2803.append(c1223);
        Log.v("Engine", sbM2803.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m2955(InterfaceC2624 interfaceC2624) {
        if (!(interfaceC2624 instanceof C1226)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C1226) interfaceC2624).m2973();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0253 m2956(C1472 c1472, Object obj, InterfaceC1772 interfaceC1772, int i, int i2, Class cls, Class cls2, EnumC2454 enumC2454, C1068 c1068, C0522 c0522, boolean z, boolean z2, C2336 c2336, boolean z3, boolean z4, C2769 c2769, ExecutorC1246 executorC1246) {
        long jElapsedRealtimeNanos;
        if (f4383) {
            int i3 = AbstractC1879.f6242;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f4385.getClass();
        C1223 c1223 = new C1223(obj, interfaceC1772, i, i2, c0522, cls, cls2, c2336);
        synchronized (this) {
            try {
                C1226 c1226M2957 = m2957(c1223, z3, jElapsedRealtimeNanos);
                if (c1226M2957 == null) {
                    return m2960(c1472, obj, interfaceC1772, i, i2, cls, cls2, enumC2454, c1068, c0522, z, z2, c2336, z3, z4, c2769, executorC1246, c1223, jElapsedRealtimeNanos);
                }
                c2769.m4749(c1226M2957, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1226 m2957(C1223 c1223, boolean z, long j) throws Throwable {
        Throwable th;
        C1226 c1226;
        Object obj;
        C1217 c1217;
        C1223 c1224;
        C1226 c1227;
        if (z) {
            C0253 c0253 = this.f4390;
            synchronized (c0253) {
                try {
                    C0151 c0151 = (C0151) ((HashMap) c0253.f1478).get(c1223);
                    if (c0151 == null) {
                        c1226 = null;
                    } else {
                        c1226 = (C1226) c0151.get();
                        if (c1226 == null) {
                            try {
                                c0253.m1461(c0151);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (c1226 != null) {
                        c1226.m2972();
                    }
                    if (c1226 != null) {
                        if (f4383) {
                            m2954("Loaded resource from active resources", j, c1223);
                        }
                        return c1226;
                    }
                    C1897 c1897 = this.f4386;
                    synchronized (c1897) {
                        try {
                            C1895 c1895 = (C1895) c1897.f6289.remove(c1223);
                            if (c1895 == null) {
                                obj = null;
                            } else {
                                c1897.f6291 -= (long) c1895.f6288;
                                obj = c1895.f6287;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    InterfaceC2624 interfaceC2624 = (InterfaceC2624) obj;
                    if (interfaceC2624 == null) {
                        c1217 = this;
                        c1224 = c1223;
                        c1227 = null;
                    } else if (interfaceC2624 instanceof C1226) {
                        c1227 = (C1226) interfaceC2624;
                        c1217 = this;
                        c1224 = c1223;
                    } else {
                        c1217 = this;
                        c1224 = c1223;
                        c1227 = new C1226(interfaceC2624, true, true, c1224, c1217);
                    }
                    if (c1227 != null) {
                        c1227.m2972();
                        c1217.f4390.m1459(c1224, c1227);
                    }
                    if (c1227 != null) {
                        if (f4383) {
                            m2954("Loaded resource from cache", j, c1224);
                        }
                        return c1227;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized void m2958(C1221 c1221, InterfaceC1772 interfaceC1772, C1226 c1226) {
        if (c1226 != null) {
            try {
                if (c1226.f4431) {
                    this.f4390.m1459(interfaceC1772, c1226);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0967 c0967 = this.f4384;
        c0967.getClass();
        c1221.getClass();
        HashMap map = c0967.f3505;
        if (c1221.equals(map.get(interfaceC1772))) {
            map.remove(interfaceC1772);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2959(InterfaceC1772 interfaceC1772, C1226 c1226) {
        C0253 c0253 = this.f4390;
        synchronized (c0253) {
            C0151 c0151 = (C0151) ((HashMap) c0253.f1478).remove(interfaceC1772);
            if (c0151 != null) {
                c0151.f1208 = null;
                c0151.clear();
            }
        }
        if (c1226.f4431) {
        } else {
            this.f4388.m1788(c1226, false);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0253 m2960(C1472 c1472, Object obj, InterfaceC1772 interfaceC1772, int i, int i2, Class cls, Class cls2, EnumC2454 enumC2454, C1068 c1068, Map map, boolean z, boolean z2, C2336 c2336, boolean z3, boolean z4, C2769 c2769, Executor executor, C1223 c1223, long j) {
        ExecutorServiceC1476 executorServiceC1476;
        C1221 c1221 = (C1221) this.f4384.f3505.get(c1223);
        if (c1221 != null) {
            c1221.m2961(c2769, executor);
            if (f4383) {
                m2954("Added to existing load", j, c1223);
            }
            return new C0253(this, c2769, c1221);
        }
        C1221 c1222 = (C1221) ((C0253) this.f4387.f4380).mo1458();
        synchronized (c1222) {
            c1222.f4408 = c1223;
            c1222.f4409 = z3;
            c1222.f4410 = z4;
        }
        C0231 c0231 = this.f4389;
        RunnableC0976 runnableC0976 = (RunnableC0976) ((C0253) c0231.f1427).mo1458();
        int i3 = c0231.f1425;
        c0231.f1425 = i3 + 1;
        C0974 c0974 = runnableC0976.f3559;
        C1216 c1216 = runnableC0976.f3562;
        c0974.f3539 = c1472;
        c0974.f3540 = obj;
        c0974.f3550 = interfaceC1772;
        c0974.f3541 = i;
        c0974.f3542 = i2;
        c0974.f3552 = c1068;
        c0974.f3543 = cls;
        c0974.f3544 = c1216;
        c0974.f3547 = cls2;
        c0974.f3551 = enumC2454;
        c0974.f3545 = c2336;
        c0974.f3546 = map;
        c0974.f3553 = z;
        c0974.f3554 = z2;
        runnableC0976.f3566 = c1472;
        runnableC0976.f3567 = interfaceC1772;
        runnableC0976.f3568 = enumC2454;
        runnableC0976.f3569 = c1223;
        runnableC0976.f3570 = i;
        runnableC0976.f3571 = i2;
        runnableC0976.f3572 = c1068;
        runnableC0976.f3573 = c2336;
        runnableC0976.f3574 = c1222;
        runnableC0976.f3575 = i3;
        runnableC0976.f3590 = 1;
        runnableC0976.f3577 = obj;
        runnableC0976.f3578 = c1472.f5244;
        runnableC0976.f3579 = (Supplier) c2336.m4294(RunnableC0976.f3558);
        C0967 c0967 = this.f4384;
        c0967.getClass();
        c0967.f3505.put(c1223, c1222);
        c1222.m2961(c2769, executor);
        synchronized (c1222) {
            c1222.f4417 = runnableC0976;
            int iM2625 = runnableC0976.m2625(1);
            if (iM2625 == 2 || iM2625 == 3) {
                executorServiceC1476 = c1222.f4404;
            } else {
                executorServiceC1476 = c1222.f4410 ? c1222.f4406 : c1222.f4405;
            }
            executorServiceC1476.execute(runnableC0976);
        }
        if (f4383) {
            m2954("Started new load", j, c1223);
        }
        return new C0253(this, c2769, c1222);
    }
}
