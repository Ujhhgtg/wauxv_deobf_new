package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1267 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ SharedPreferencesC1269 f4600;

    public /* synthetic */ RunnableC1267(SharedPreferencesC1269 sharedPreferencesC1269, int i) {
        this.f4599 = i;
        this.f4600 = sharedPreferencesC1269;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4599) {
            case 0:
                SharedPreferencesC1269 sharedPreferencesC1269 = this.f4600;
                sharedPreferencesC1269.getClass();
                AbstractC2207.m4122(sharedPreferencesC1269);
                return;
            default:
                SharedPreferencesC1269 sharedPreferencesC12610 = this.f4600;
                synchronized (sharedPreferencesC12610) {
                    try {
                        synchronized (sharedPreferencesC12610.f4614) {
                            sharedPreferencesC12610.f4615 = true;
                            sharedPreferencesC12610.f4614.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC2207.m4102(sharedPreferencesC12610) && sharedPreferencesC12610.f4631 == 0) {
                            AbstractC2207.m4101(sharedPreferencesC12610);
                        }
                        if (sharedPreferencesC12610.f4616 == null) {
                            sharedPreferencesC12610.f4616 = new C0221(SharedPreferencesC1269.f4607);
                        }
                        if (sharedPreferencesC12610.f4612 == 0) {
                            sharedPreferencesC12610.f4612 = 12;
                        }
                        if (sharedPreferencesC12610.f4620) {
                            AbstractC2207.m4113(sharedPreferencesC12610);
                            AbstractC2202.m4009(sharedPreferencesC12610, "rewrite data");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
