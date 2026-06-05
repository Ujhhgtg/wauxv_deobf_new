package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛴᛳᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2049feyxiexzfUjhhgtg implements InterfaceC3575feyxiexzfUjhhgtg {
    private static final InterfaceC1121feyxiexzfUjhhgtg descriptor;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2049feyxiexzfUjhhgtg f6746Ujhhgtgfeyxiexzf;

    static {
        C2049feyxiexzfUjhhgtg c2049feyxiexzfUjhhgtg = new C2049feyxiexzfUjhhgtg();
        f6746Ujhhgtgfeyxiexzf = c2049feyxiexzfUjhhgtg;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        C1412feyxiexzfUjhhgtg c1412feyxiexzfUjhhgtg = new C1412feyxiexzfUjhhgtg("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.SizeProto", c2049feyxiexzfUjhhgtg, 3);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "width", false, 1);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "height", false, 2);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "totalSize", false, 3);
        descriptor = c1412feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return descriptor;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1180Ujhhgtgfeyxiexzf(InterfaceC3091Ujhhgtgfeyxiexzf interfaceC3091Ujhhgtgfeyxiexzf) {
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = descriptor;
        InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf = interfaceC3091Ujhhgtgfeyxiexzf.mo2267Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.getClass();
        Float f = null;
        boolean z = true;
        int i = 0;
        Float f2 = null;
        Float f3 = null;
        while (z) {
            int iMo1185Ujhhgtgfeyxiexzf = interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo1185Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
            if (iMo1185Ujhhgtgfeyxiexzf == -1) {
                z = false;
            } else if (iMo1185Ujhhgtgfeyxiexzf == 0) {
                f = (Float) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 0, C3616Ujhhgtgfeyxiexzf.f11251Ujhhgtgfeyxiexzf, f);
                i |= 1;
            } else if (iMo1185Ujhhgtgfeyxiexzf == 1) {
                f2 = (Float) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 1, C3616Ujhhgtgfeyxiexzf.f11251Ujhhgtgfeyxiexzf, f2);
                i |= 2;
            } else {
                if (iMo1185Ujhhgtgfeyxiexzf != 2) {
                    throw new C1940Ujhhgtgfeyxiexzf(iMo1185Ujhhgtgfeyxiexzf);
                }
                f3 = (Float) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 2, C3616Ujhhgtgfeyxiexzf.f11251Ujhhgtgfeyxiexzf, f3);
                i |= 4;
            }
        }
        interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2266Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        return new C2178Ujhhgtgfeyxiexzf(i, f, f2, f3);
    }

    @Override // p000.InterfaceC3575feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final InterfaceC0146Ujhhgtgfeyxiexzf[] mo1531Ujhhgtgfeyxiexzf() {
        C3616Ujhhgtgfeyxiexzf c3616Ujhhgtgfeyxiexzf = C3616Ujhhgtgfeyxiexzf.f11251Ujhhgtgfeyxiexzf;
        return new InterfaceC0146Ujhhgtgfeyxiexzf[]{AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c3616Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c3616Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c3616Ujhhgtgfeyxiexzf)};
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        C2178Ujhhgtgfeyxiexzf c2178Ujhhgtgfeyxiexzf = (C2178Ujhhgtgfeyxiexzf) obj;
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = descriptor;
        InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf = interfaceC3329Ujhhgtgfeyxiexzf.mo2323Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        C3616Ujhhgtgfeyxiexzf c3616Ujhhgtgfeyxiexzf = C3616Ujhhgtgfeyxiexzf.f11251Ujhhgtgfeyxiexzf;
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 0, c3616Ujhhgtgfeyxiexzf, c2178Ujhhgtgfeyxiexzf.f7060Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 1, c3616Ujhhgtgfeyxiexzf, c2178Ujhhgtgfeyxiexzf.f7061Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 2, c3616Ujhhgtgfeyxiexzf, c2178Ujhhgtgfeyxiexzf.f7062Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2322Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
    }
}
