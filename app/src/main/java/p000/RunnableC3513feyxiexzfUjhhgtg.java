package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3513feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10927Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ SharedPreferencesC3515Ujhhgtgfeyxiexzf f10928Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3513feyxiexzfUjhhgtg(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, int i) {
        this.f10927Ujhhgtgfeyxiexzf = i;
        this.f10928Ujhhgtgfeyxiexzf = sharedPreferencesC3515Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10927Ujhhgtgfeyxiexzf) {
            case 0:
                SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf = this.f10928Ujhhgtgfeyxiexzf;
                sharedPreferencesC3515Ujhhgtgfeyxiexzf.getClass();
                AbstractC2855feyxiexzfUjhhgtg.m4233Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf);
                return;
            default:
                SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf2 = this.f10928Ujhhgtgfeyxiexzf;
                synchronized (sharedPreferencesC3515Ujhhgtgfeyxiexzf2) {
                    try {
                        synchronized (sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10942Ujhhgtgfeyxiexzf) {
                            sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10943Ujhhgtgfeyxiexzf = true;
                            sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10942Ujhhgtgfeyxiexzf.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC2855feyxiexzfUjhhgtg.m4218feyxiexzfUjhhgtg(sharedPreferencesC3515Ujhhgtgfeyxiexzf2) && sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10959Ujhhgtgfeyxiexzf == 0) {
                            AbstractC2855feyxiexzfUjhhgtg.m4217feyxiexzfUjhhgtg(sharedPreferencesC3515Ujhhgtgfeyxiexzf2);
                        }
                        if (sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10944Ujhhgtgfeyxiexzf == null) {
                            sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10944Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf.f10935feyxiexzfUjhhgtg);
                        }
                        if (sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10940Ujhhgtgfeyxiexzf == 0) {
                            sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10940Ujhhgtgfeyxiexzf = 12;
                        }
                        if (sharedPreferencesC3515Ujhhgtgfeyxiexzf2.f10948Ujhhgtgfeyxiexzf) {
                            AbstractC2855feyxiexzfUjhhgtg.m4227feyxiexzfUjhhgtg(sharedPreferencesC3515Ujhhgtgfeyxiexzf2);
                            AbstractC1252feyxiexzfUjhhgtg.m2786Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf2, "rewrite data");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
