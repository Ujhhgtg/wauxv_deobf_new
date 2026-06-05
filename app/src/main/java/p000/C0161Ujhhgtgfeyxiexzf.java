package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸能不能ᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0161Ujhhgtgfeyxiexzf extends AbstractC0923feyxiexzfUjhhgtg implements InterfaceC3556feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1336Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public /* synthetic */ C3101Ujhhgtgfeyxiexzf f1337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2501feyxiexzfUjhhgtg f1338Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161Ujhhgtgfeyxiexzf(C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        super(3, interfaceC3704Ujhhgtgfeyxiexzf);
        this.f1338Ujhhgtgfeyxiexzf = c2501feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC3556feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object mo1207Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3) {
        C0161Ujhhgtgfeyxiexzf c0161Ujhhgtgfeyxiexzf = new C0161Ujhhgtgfeyxiexzf(this.f1338Ujhhgtgfeyxiexzf, (InterfaceC3704Ujhhgtgfeyxiexzf) obj3);
        c0161Ujhhgtgfeyxiexzf.f1337Ujhhgtgfeyxiexzf = (C3101Ujhhgtgfeyxiexzf) obj;
        return c0161Ujhhgtgfeyxiexzf.mo1208Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Object mo1208Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = this.f1338Ujhhgtgfeyxiexzf;
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
        C3101Ujhhgtgfeyxiexzf c3101Ujhhgtgfeyxiexzf = this.f1337Ujhhgtgfeyxiexzf;
        int i = this.f1336Ujhhgtgfeyxiexzf;
        if (i == 0) {
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
            byte bM4490feyxiexzfUjhhgtg = c3017Ujhhgtgfeyxiexzf.m4490feyxiexzfUjhhgtg();
            if (bM4490feyxiexzfUjhhgtg == 1) {
                return c2501feyxiexzfUjhhgtg.m3784Ujhhgtgfeyxiexzf(true);
            }
            if (bM4490feyxiexzfUjhhgtg == 0) {
                return c2501feyxiexzfUjhhgtg.m3784Ujhhgtgfeyxiexzf(false);
            }
            if (bM4490feyxiexzfUjhhgtg != 6) {
                if (bM4490feyxiexzfUjhhgtg == 8) {
                    return c2501feyxiexzfUjhhgtg.m3783Ujhhgtgfeyxiexzf();
                }
                C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f1337Ujhhgtgfeyxiexzf = null;
            this.f1336Ujhhgtgfeyxiexzf = 1;
            obj = C2501feyxiexzfUjhhgtg.m3779Ujhhgtgfeyxiexzf(c2501feyxiexzfUjhhgtg, c3101Ujhhgtgfeyxiexzf, this);
            EnumC3746Ujhhgtgfeyxiexzf enumC3746Ujhhgtgfeyxiexzf = EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
            if (obj == enumC3746Ujhhgtgfeyxiexzf) {
                return enumC3746Ujhhgtgfeyxiexzf;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
        }
        return (AbstractC0120Ujhhgtgfeyxiexzf) obj;
    }
}
