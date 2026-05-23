package p000;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1216 implements InterfaceC1221, InterfaceC1223 {

    public static final boolean f4386 = Log.isLoggable("Engine", 2);

    public final C0963 f4387;

    public final C0373 f4388;

    public final C1871 f4389;

    public final C1214 f4390;

    public final C0452 f4391;

    public final C0221 f4392;

    public final C0243 f4393;

    public C1216(C1871 c1871, C0094 c0094, ExecutorServiceC1465 executorServiceC1465, ExecutorServiceC1465 executorServiceC1466, ExecutorServiceC1465 executorServiceC1467, ExecutorServiceC1465 executorServiceC1468) {
        this.f4389 = c1871;
        C1215 c1215 = new C1215(c0094);
        C0243 c0243 = new C0243();
        this.f4393 = c0243;
        synchronized (this) {
            synchronized (c0243) {
                c0243.f1406 = this;
            }
        }
        this.f4388 = new C0373(29);
        this.f4387 = new C0963(2);
        C1214 c1214 = new C1214();
        c1214.f4383 = AbstractC3471.m5090(150, new C0094(22, c1214));
        c1214.f4377 = executorServiceC1465;
        c1214.f4378 = executorServiceC1466;
        c1214.f4379 = executorServiceC1467;
        c1214.f4380 = executorServiceC1468;
        c1214.f4381 = this;
        c1214.f4382 = this;
        this.f4390 = c1214;
        C0221 c0221 = new C0221();
        c0221.f1353 = AbstractC3471.m5090(150, new C0094(21, c0221));
        c0221.f1352 = c1215;
        this.f4392 = c0221;
        this.f4391 = new C0452();
        c1871.f6218 = this;
    }

    public static void m2832(String str, long j, C1222 c1222) {
        StringBuilder sbM2788 = AbstractC1194.m2788(str, " in ");
        sbM2788.append(AbstractC1853.m3620(j));
        sbM2788.append("ms, key: ");
        sbM2788.append(c1222);
        Log.v("Engine", sbM2788.toString());
    }

    public static void m2833(InterfaceC2568 interfaceC2568) {
        if (!(interfaceC2568 instanceof C1224)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C1224) interfaceC2568).m2847();
    }

    public final C0243 m2834(C1461 c1461, Object obj, InterfaceC1749 interfaceC1749, int i, int i2, Class cls, Class cls2, EnumC2401 enumC2401, C1063 c1063, C0545 c0545, boolean z, boolean z2, C2303 c2303, boolean z3, boolean z4, C2708 c2708, ExecutorC1244 executorC1244) {
        long jElapsedRealtimeNanos;
        if (f4386) {
            int i3 = 0;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        
        C1222 c1222 = new C1222(obj, interfaceC1749, i, i2, c0545, cls, cls2, c2303);
        synchronized (this) {
            try {
                C1224 c1224M2835 = m2835(c1222, z3, jElapsedRealtimeNanos);
                if (c1224M2835 == null) {
                    return m2838(c1461, obj, interfaceC1749, i, i2, cls, cls2, enumC2401, c1063, c0545, z, z2, c2303, z3, z4, c2708, executorC1244, c1222, jElapsedRealtimeNanos);
                }
                c2708.m4715(c1224M2835, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008e */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1224 m2835(C1222 c1222, boolean z, long j) throws Throwable {
        Throwable th;
        C1224 c1224;
        Object obj;
        C1216 c1216;
        C1222 c1223;
        C1224 c1225;
        if (z) {
            C0243 c0243 = this.f4393;
            synchronized (c0243) {
                try {
                    C0143 c0143 = (C0143) ((HashMap) c0243.f1404).get(c1222);
                    if (c0143 == null) {
                        c1224 = null;
                    } else {
                        c1224 = (C1224) c0143.get();
                        if (c1224 == null) {
                            try {
                                c0243.m1315(c0143);
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
                    if (c1224 != null) {
                        c1224.m2846();
                    }
                    if (c1224 != null) {
                        if (f4386) {
                            m2832("Loaded resource from active resources", j, c1222);
                        }
                        return c1224;
                    }
                    C1871 c1871 = this.f4389;
                    synchronized (c1871) {
                        try {
                            C1869 c1869 = (C1869) c1871.f6215.remove(c1222);
                            if (c1869 == null) {
                                obj = null;
                            } else {
                                c1871.f6217 -= (long) c1869.f6214;
                                obj = c1869.f6213;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    InterfaceC2568 interfaceC2568 = (InterfaceC2568) obj;
                    if (interfaceC2568 == null) {
                        c1216 = this;
                        c1223 = c1222;
                        c1225 = null;
                    } else if (interfaceC2568 instanceof C1224) {
                        c1225 = (C1224) interfaceC2568;
                        c1216 = this;
                        c1223 = c1222;
                    } else {
                        c1216 = this;
                        c1223 = c1222;
                        c1225 = new C1224(interfaceC2568, true, true, c1223, c1216);
                    }
                    if (c1225 != null) {
                        c1225.m2846();
                        c1216.f4393.m1313(c1223, c1225);
                    }
                    if (c1225 != null) {
                        if (f4386) {
                            m2832("Loaded resource from cache", j, c1223);
                        }
                        return c1225;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        return null;
    }

    public final synchronized void m2836(C1220 c1220, InterfaceC1749 interfaceC1749, C1224 c1224) {
        if (c1224 != null) {
            try {
                if (c1224.f4432) {
                    this.f4393.m1313(interfaceC1749, c1224);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0963 c0963 = this.f4387;
        
        
        HashMap map = c0963.f3488;
        if (c1220.equals(map.get(interfaceC1749))) {
            map.remove(interfaceC1749);
        }
    }

    public final void m2837(InterfaceC1749 interfaceC1749, C1224 c1224) {
        C0243 c0243 = this.f4393;
        synchronized (c0243) {
            C0143 c0143 = (C0143) ((HashMap) c0243.f1404).remove(interfaceC1749);
            if (c0143 != null) {
                c0143.f1140 = null;
                c0143.clear();
            }
        }
        if (c1224.f4432) {
        } else {
            this.f4391.m1680(c1224, false);
        }
    }

    public final C0243 m2838(C1461 c1461, Object obj, InterfaceC1749 interfaceC1749, int i, int i2, Class cls, Class cls2, EnumC2401 enumC2401, C1063 c1063, Map map, boolean z, boolean z2, C2303 c2303, boolean z3, boolean z4, C2708 c2708, Executor executor, C1222 c1222, long j) {
        ExecutorServiceC1465 executorServiceC1465;
        C1220 c1220 = (C1220) this.f4387.f3488.get(c1222);
        if (c1220 != null) {
            c1220.m2839(c2708, executor);
            if (f4386) {
                m2832("Added to existing load", j, c1222);
            }
            return new C0243(this, c2708, c1220);
        }
        C1220 c1221 = (C1220) ((C0243) this.f4390.f4383).mo1312();
        synchronized (c1221) {
            c1221.f4411 = c1222;
            c1221.f4412 = z3;
            c1221.f4413 = z4;
        }
        C0221 c0221 = this.f4392;
        RunnableC0972 runnableC0972 = (RunnableC0972) ((C0243) c0221.f1353).mo1312();
        int i3 = c0221.f1351;
        c0221.f1351 = i3 + 1;
        C0970 c0970 = runnableC0972.f3543;
        C1215 c1215 = runnableC0972.f3546;
        c0970.f3523 = c1461;
        c0970.f3524 = obj;
        c0970.f3534 = interfaceC1749;
        c0970.f3525 = i;
        c0970.f3526 = i2;
        c0970.f3536 = c1063;
        c0970.f3527 = cls;
        c0970.f3528 = c1215;
        c0970.f3531 = cls2;
        c0970.f3535 = enumC2401;
        c0970.f3529 = c2303;
        c0970.f3530 = map;
        c0970.f3537 = z;
        c0970.f3538 = z2;
        runnableC0972.f3550 = c1461;
        runnableC0972.f3551 = interfaceC1749;
        runnableC0972.f3552 = enumC2401;
        runnableC0972.f3553 = c1222;
        runnableC0972.f3554 = i;
        runnableC0972.f3555 = i2;
        runnableC0972.f3556 = c1063;
        runnableC0972.f3557 = c2303;
        runnableC0972.f3558 = c1221;
        runnableC0972.f3559 = i3;
        runnableC0972.f3574 = 1;
        runnableC0972.f3561 = obj;
        runnableC0972.f3562 = c1461.f5212;
        runnableC0972.f3563 = (Supplier) c2303.m4165(RunnableC0972.f3542);
        C0963 c0963 = this.f4387;
        
        c0963.f3488.put(c1222, c1221);
        c1221.m2839(c2708, executor);
        synchronized (c1221) {
            c1221.f4420 = runnableC0972;
            int iM2501 = runnableC0972.m2501(1);
            if (iM2501 == 2 || iM2501 == 3) {
                executorServiceC1465 = c1221.f4407;
            } else {
                executorServiceC1465 = c1221.f4413 ? c1221.f4409 : c1221.f4408;
            }
            executorServiceC1465.execute(runnableC0972);
        }
        if (f4386) {
            m2832("Started new load", j, c1222);
        }
        return new C0243(this, c2708, c1221);
    }
}
