package p000;

import de.robv.android.xposed.XposedBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛲ要点脸ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2376Ujhhgtgfeyxiexzf extends AbstractC0699Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f7731Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7732Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376Ujhhgtgfeyxiexzf(int i, int i2) {
        super(i);
        this.f7732Ujhhgtgfeyxiexzf = i2;
        this.f7731Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1985Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf) {
        ((C0581Ujhhgtgfeyxiexzf) c0210Ujhhgtgfeyxiexzf.f1473Ujhhgtgfeyxiexzf).mo1179Ujhhgtgfeyxiexzf(m3620Ujhhgtgfeyxiexzf(c0210Ujhhgtgfeyxiexzf), Boolean.TRUE);
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1993Ujhhgtgfeyxiexzf() {
        return this.f7731Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Object m3620Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf) {
        Object c0919feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        Object c0919feyxiexzfUjhhgtg2;
        switch (this.f7732Ujhhgtgfeyxiexzf) {
            case 0:
                int i = 0;
                int i2 = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf[0];
                if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c0919feyxiexzfUjhhgtg = Boolean.TRUE;
                    } catch (Throwable th) {
                        c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                    }
                    if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                    Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    break;
                } else {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    i2 = 2;
                }
                int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2);
                if (iM2713feyxiexzfUjhhgtg != 0) {
                    if (iM2713feyxiexzfUjhhgtg != 1) {
                        throw new C2870Ujhhgtgfeyxiexzf();
                    }
                    i = -1;
                }
                return Integer.valueOf(i);
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.TRUE;
            case 3:
                return AbstractC1265feyxiexzfUjhhgtg.m2828Ujhhgtgfeyxiexzf();
            case 4:
                return Integer.valueOf(AbstractC1265feyxiexzfUjhhgtg.m2823Ujhhgtgfeyxiexzf());
            default:
                boolean zBooleanValue2 = false;
                int i3 = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf[0];
                if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i3)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c0919feyxiexzfUjhhgtg2 = Boolean.TRUE;
                    } catch (Throwable th2) {
                        c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                    }
                    if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                    Boolean bool2 = (Boolean) c0919feyxiexzfUjhhgtg2;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    break;
                }
                if (!zBooleanValue2) {
                    i3 = 2;
                }
                int iM2713feyxiexzfUjhhgtg2 = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i3);
                if (iM2713feyxiexzfUjhhgtg2 == 0) {
                    return "unsupported";
                }
                if (iM2713feyxiexzfUjhhgtg2 == 1) {
                    return "unknown";
                }
                throw new C2870Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1984Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf) {
    }
}
