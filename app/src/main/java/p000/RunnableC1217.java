package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1217 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2708 f4395;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1220 f4396;

    public /* synthetic */ RunnableC1217(C1220 c1220, C2708 c2708, int i) {
        this.f4394 = i;
        this.f4396 = c1220;
        this.f4395 = c2708;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4394) {
            case 0:
                C2708 c2708 = this.f4395;
                c2708.f8727.m4791();
                synchronized (c2708.f8728) {
                    synchronized (this.f4396) {
                        try {
                            if (this.f4396.f4401.f4399.contains(new C1218(this.f4395, AbstractC3453.f10925))) {
                                C1220 c1220 = this.f4396;
                                C2708 c2709 = this.f4395;
                                
                                try {
                                    c2709.m4714(c1220.f4417, 5);
                                } catch (Throwable th) {
                                    throw new C0553(th);
                                }
                            }
                            this.f4396.m2841();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                C2708 c27010 = this.f4395;
                c27010.f8727.m4791();
                synchronized (c27010.f8728) {
                    synchronized (this.f4396) {
                        try {
                            if (this.f4396.f4401.f4399.contains(new C1218(this.f4395, AbstractC3453.f10925))) {
                                this.f4396.f4419.m2846();
                                C1220 c1221 = this.f4396;
                                C2708 c27011 = this.f4395;
                                
                                try {
                                    c27011.m4715(c1221.f4419, c1221.f4415, c1221.f4422);
                                    this.f4396.m2845(this.f4395);
                                } catch (Throwable th3) {
                                    throw new C0553(th3);
                                }
                            }
                            this.f4396.m2841();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
