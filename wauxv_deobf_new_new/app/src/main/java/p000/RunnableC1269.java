package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲁᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1269 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ SharedPreferencesC1271 f4599;

    public /* synthetic */ RunnableC1269(SharedPreferencesC1271 sharedPreferencesC1271, int i) {
        this.f4598 = i;
        this.f4599 = sharedPreferencesC1271;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4598) {
            case 0:
                SharedPreferencesC1271 sharedPreferencesC1271 = this.f4599;
                sharedPreferencesC1271.getClass();
                AbstractC1469.m3356(sharedPreferencesC1271);
                return;
            default:
                SharedPreferencesC1271 sharedPreferencesC1272 = this.f4599;
                synchronized (sharedPreferencesC1272) {
                    try {
                        synchronized (sharedPreferencesC1272.f4613) {
                            sharedPreferencesC1272.f4614 = true;
                            sharedPreferencesC1272.f4613.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC1469.m3338(sharedPreferencesC1272) && sharedPreferencesC1272.f4630 == 0) {
                            AbstractC1469.m3337(sharedPreferencesC1272);
                        }
                        if (sharedPreferencesC1272.f4615 == null) {
                            sharedPreferencesC1272.f4615 = new C0231(SharedPreferencesC1271.f4606);
                        }
                        if (sharedPreferencesC1272.f4611 == 0) {
                            sharedPreferencesC1272.f4611 = 12;
                        }
                        if (sharedPreferencesC1272.f4619) {
                            AbstractC1469.m3348(sharedPreferencesC1272);
                            AbstractC1272.m3100(sharedPreferencesC1272, "rewrite data");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
