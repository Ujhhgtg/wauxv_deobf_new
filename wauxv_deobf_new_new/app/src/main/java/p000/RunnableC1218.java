package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲀᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1218 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4391;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2769 f4392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1221 f4393;

    public /* synthetic */ RunnableC1218(C1221 c1221, C2769 c2769, int i) {
        this.f4391 = i;
        this.f4393 = c1221;
        this.f4392 = c2769;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4391) {
            case 0:
                C2769 c2769 = this.f4392;
                c2769.f8890.m4824();
                synchronized (c2769.f8891) {
                    synchronized (this.f4393) {
                        try {
                            if (this.f4393.f4398.f4396.contains(new C1219(this.f4392, AbstractC2240.f7302))) {
                                C1221 c1221 = this.f4393;
                                C2769 c27610 = this.f4392;
                                c1221.getClass();
                                try {
                                    c27610.m4748(c1221.f4414, 5);
                                } catch (Throwable th) {
                                    throw new C0530(th);
                                }
                            }
                            this.f4393.m2963();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                C2769 c27611 = this.f4392;
                c27611.f8890.m4824();
                synchronized (c27611.f8891) {
                    synchronized (this.f4393) {
                        try {
                            if (this.f4393.f4398.f4396.contains(new C1219(this.f4392, AbstractC2240.f7302))) {
                                this.f4393.f4416.m2972();
                                C1221 c1222 = this.f4393;
                                C2769 c27612 = this.f4392;
                                c1222.getClass();
                                try {
                                    c27612.m4749(c1222.f4416, c1222.f4412, c1222.f4419);
                                    this.f4393.m2967(this.f4392);
                                } catch (Throwable th3) {
                                    throw new C0530(th3);
                                }
                            }
                            this.f4393.m2963();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
