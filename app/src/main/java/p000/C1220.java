package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1220 implements InterfaceC1262 {

    public static final C0373 f4400 = new C0373(28);

    public final InterfaceC1223 f4403;

    public final InterfaceC2378 f4404;

    public final InterfaceC1221 f4406;

    public final ExecutorServiceC1465 f4407;

    public final ExecutorServiceC1465 f4408;

    public final ExecutorServiceC1465 f4409;

    public C1222 f4411;

    public boolean f4412;

    public boolean f4413;

    public InterfaceC2568 f4414;

    public int f4415;

    public boolean f4416;

    public C1463 f4417;

    public boolean f4418;

    public C1224 f4419;

    public RunnableC0972 f4420;

    public volatile boolean f4421;

    public boolean f4422;

    public final C1219 f4401 = new C1219(new ArrayList(2));

    public final C2812 f4402 = new C2812();

    public final AtomicInteger f4410 = new AtomicInteger();

    public final C0373 f4405 = f4400;

    public C1220(ExecutorServiceC1465 executorServiceC1465, ExecutorServiceC1465 executorServiceC1466, ExecutorServiceC1465 executorServiceC1467, ExecutorServiceC1465 executorServiceC1468, C1216 c1216, C1216 c1217, C0243 c0243) {
        this.f4407 = executorServiceC1465;
        this.f4408 = executorServiceC1466;
        this.f4409 = executorServiceC1468;
        this.f4406 = c1216;
        this.f4403 = c1217;
        this.f4404 = c0243;
    }

    @Override // p000.InterfaceC1262
    public final C2812 mo2496() {
        return this.f4402;
    }

    public final synchronized void m2839(C2708 c2708, Executor executor) {
        try {
            this.f4402.m4791();
            this.f4401.f4399.add(new C1218(c2708, executor));
            if (this.f4416) {
                m2842(1);
                executor.execute(new RunnableC1217(this, c2708, 1));
            } else if (this.f4418) {
                m2842(1);
                executor.execute(new RunnableC1217(this, c2708, 0));
            } else {
                AbstractC1460.m3208("Cannot add callbacks to a cancelled EngineJob", !this.f4421);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m2840() {
        if (m2843()) {
            return;
        }
        this.f4421 = true;
        RunnableC0972 runnableC0972 = this.f4420;
        runnableC0972.f3571 = true;
        InterfaceC0957 interfaceC0957 = runnableC0972.f3569;
        if (interfaceC0957 != null) {
            interfaceC0957.cancel();
        }
        InterfaceC1221 interfaceC1221 = this.f4406;
        C1222 c1222 = this.f4411;
        C1216 c1216 = (C1216) interfaceC1221;
        synchronized (c1216) {
            C0963 c0963 = c1216.f4387;
            
            HashMap map = c0963.f3488;
            if (equals(map.get(c1222))) {
                map.remove(c1222);
            }
        }
    }

    public final void m2841() {
        C1224 c1224;
        synchronized (this) {
            try {
                this.f4402.m4791();
                AbstractC1460.m3208("Not yet complete!", m2843());
                int iDecrementAndGet = this.f4410.decrementAndGet();
                AbstractC1460.m3208("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c1224 = this.f4419;
                    m2844();
                } else {
                    c1224 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1224 != null) {
            c1224.m2847();
        }
    }

    public final synchronized void m2842(int i) {
        C1224 c1224;
        AbstractC1460.m3208("Not yet complete!", m2843());
        if (this.f4410.getAndAdd(i) == 0 && (c1224 = this.f4419) != null) {
            c1224.m2846();
        }
    }

    public final boolean m2843() {
        return this.f4418 || this.f4416 || this.f4421;
    }

    public final synchronized void m2844() {
        boolean zM2495;
        if (this.f4411 == null) {
            throw new IllegalArgumentException();
        }
        this.f4401.f4399.clear();
        this.f4411 = null;
        this.f4419 = null;
        this.f4414 = null;
        this.f4418 = false;
        this.f4421 = false;
        this.f4416 = false;
        this.f4422 = false;
        RunnableC0972 runnableC0972 = this.f4420;
        C0971 c0971 = runnableC0972.f3549;
        synchronized (c0971) {
            c0971.f3539 = true;
            zM2495 = c0971.m2495();
        }
        if (zM2495) {
            runnableC0972.m2504();
        }
        this.f4420 = null;
        this.f4417 = null;
        this.f4415 = 0;
        this.f4404.mo1311(this);
    }

    public final synchronized void m2845(C2708 c2708) {
        try {
            this.f4402.m4791();
            this.f4401.f4399.remove(new C1218(c2708, AbstractC3453.f10925));
            if (this.f4401.f4399.isEmpty()) {
                m2840();
                if (this.f4416 || this.f4418) {
                    if (this.f4410.get() == 0) {
                        m2844();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
