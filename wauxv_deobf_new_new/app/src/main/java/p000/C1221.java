package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲀᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1221 implements InterfaceC1264 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final C0348 f4397 = new C0348(29);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC1225 f4400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC2431 f4401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1222 f4403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ExecutorServiceC1476 f4404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ExecutorServiceC1476 f4405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ExecutorServiceC1476 f4406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1223 f4408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f4409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f4410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC2624 f4411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f4412;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f4413;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C1474 f4414;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f4415;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C1226 f4416;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public RunnableC0976 f4417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public volatile boolean f4418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f4419;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1220 f4398 = new C1220(new ArrayList(2));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2872 f4399 = new C2872();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final AtomicInteger f4407 = new AtomicInteger();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0348 f4402 = f4397;

    public C1221(ExecutorServiceC1476 executorServiceC1476, ExecutorServiceC1476 executorServiceC1477, ExecutorServiceC1476 executorServiceC1478, ExecutorServiceC1476 executorServiceC1479, C1217 c1217, C1217 c1218, C0253 c0253) {
        this.f4404 = executorServiceC1476;
        this.f4405 = executorServiceC1477;
        this.f4406 = executorServiceC1479;
        this.f4403 = c1217;
        this.f4400 = c1218;
        this.f4401 = c0253;
    }

    @Override // p000.InterfaceC1264
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C2872 mo2620() {
        return this.f4399;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final synchronized void m2961(C2769 c2769, Executor executor) {
        try {
            this.f4399.m4824();
            this.f4398.f4396.add(new C1219(c2769, executor));
            if (this.f4413) {
                m2964(1);
                executor.execute(new RunnableC1218(this, c2769, 1));
            } else if (this.f4415) {
                m2964(1);
                executor.execute(new RunnableC1218(this, c2769, 0));
            } else {
                AbstractC2727.m4691("Cannot add callbacks to a cancelled EngineJob", !this.f4418);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2962() {
        if (m2965()) {
            return;
        }
        this.f4418 = true;
        RunnableC0976 runnableC0976 = this.f4417;
        runnableC0976.f3587 = true;
        InterfaceC0960 interfaceC0960 = runnableC0976.f3585;
        if (interfaceC0960 != null) {
            interfaceC0960.cancel();
        }
        InterfaceC1222 interfaceC1222 = this.f4403;
        C1223 c1223 = this.f4408;
        C1217 c1217 = (C1217) interfaceC1222;
        synchronized (c1217) {
            C0967 c0967 = c1217.f4384;
            c0967.getClass();
            HashMap map = c0967.f3505;
            if (equals(map.get(c1223))) {
                map.remove(c1223);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2963() {
        C1226 c1226;
        synchronized (this) {
            try {
                this.f4399.m4824();
                AbstractC2727.m4691("Not yet complete!", m2965());
                int iDecrementAndGet = this.f4407.decrementAndGet();
                AbstractC2727.m4691("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c1226 = this.f4416;
                    m2966();
                } else {
                    c1226 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1226 != null) {
            c1226.m2973();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m2964(int i) {
        C1226 c1226;
        AbstractC2727.m4691("Not yet complete!", m2965());
        if (this.f4407.getAndAdd(i) == 0 && (c1226 = this.f4416) != null) {
            c1226.m2972();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m2965() {
        return this.f4415 || this.f4413 || this.f4418;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final synchronized void m2966() {
        boolean zM2619;
        if (this.f4408 == null) {
            throw new IllegalArgumentException();
        }
        this.f4398.f4396.clear();
        this.f4408 = null;
        this.f4416 = null;
        this.f4411 = null;
        this.f4415 = false;
        this.f4418 = false;
        this.f4413 = false;
        this.f4419 = false;
        RunnableC0976 runnableC0976 = this.f4417;
        C0975 c0975 = runnableC0976.f3565;
        synchronized (c0975) {
            c0975.f3555 = true;
            zM2619 = c0975.m2619();
        }
        if (zM2619) {
            runnableC0976.m2628();
        }
        this.f4417 = null;
        this.f4414 = null;
        this.f4412 = 0;
        this.f4401.mo1457(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final synchronized void m2967(C2769 c2769) {
        try {
            this.f4399.m4824();
            this.f4398.f4396.remove(new C1219(c2769, AbstractC2240.f7302));
            if (this.f4398.f4396.isEmpty()) {
                m2962();
                if (this.f4413 || this.f4415) {
                    if (this.f4407.get() == 0) {
                        m2966();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
