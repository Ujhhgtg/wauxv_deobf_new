package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛳᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2013Ujhhgtgfeyxiexzf implements InterfaceC3575feyxiexzfUjhhgtg {
    private static final InterfaceC1121feyxiexzfUjhhgtg descriptor;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2013Ujhhgtgfeyxiexzf f6606Ujhhgtgfeyxiexzf;

    static {
        C2013Ujhhgtgfeyxiexzf c2013Ujhhgtgfeyxiexzf = new C2013Ujhhgtgfeyxiexzf();
        f6606Ujhhgtgfeyxiexzf = c2013Ujhhgtgfeyxiexzf;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        C1412feyxiexzfUjhhgtg c1412feyxiexzfUjhhgtg = new C1412feyxiexzfUjhhgtg("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ContentObjProto", c2013Ujhhgtgfeyxiexzf, 21);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "description", false, 1);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "contentStyle", false, 2);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "title", false, 3);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "contentUrl", false, 4);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "mediaList", false, 5);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "contentSubStyle", false, 6);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "noteLinkXml", false, 7);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "readershare", false, 8);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "finderFeed", false, 9);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "shareFinderTopic", false, 10);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "brandmpvideo", false, 11);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "finderColumn", false, 12);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "springFinderLive", false, 13);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "finderMegaVideo", false, 14);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "finderType", false, 15);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "finderTopic", false, 16);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "shareMusic", false, 17);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "sharePoi", false, 18);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "linkEnabled", false, 19);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "shareMusicTopic", false, 20);
        AbstractC0924feyxiexzfUjhhgtg.m2420Ujhhgtgfeyxiexzf(c1412feyxiexzfUjhhgtg, "rabbit2023", false, 21);
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
        int i;
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = descriptor;
        InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf = interfaceC3091Ujhhgtgfeyxiexzf.mo2267Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        InterfaceC0058Ujhhgtgfeyxiexzf[] interfaceC0058UjhhgtgfeyxiexzfArr = C2020feyxiexzfUjhhgtg.f6611Ujhhgtgfeyxiexzf;
        interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.getClass();
        C2022Ujhhgtgfeyxiexzf c2022Ujhhgtgfeyxiexzf = null;
        C1683feyxiexzfUjhhgtg c1683feyxiexzfUjhhgtg = null;
        C2181Ujhhgtgfeyxiexzf c2181Ujhhgtgfeyxiexzf = null;
        C1608feyxiexzfUjhhgtg c1608feyxiexzfUjhhgtg = null;
        C2092Ujhhgtgfeyxiexzf c2092Ujhhgtgfeyxiexzf = null;
        C1563Ujhhgtgfeyxiexzf c1563Ujhhgtgfeyxiexzf = null;
        Integer num = null;
        C2092Ujhhgtgfeyxiexzf c2092Ujhhgtgfeyxiexzf2 = null;
        C1802feyxiexzfUjhhgtg c1802feyxiexzfUjhhgtg = null;
        C2199feyxiexzfUjhhgtg c2199feyxiexzfUjhhgtg = null;
        C1523Ujhhgtgfeyxiexzf c1523Ujhhgtgfeyxiexzf = null;
        C2092Ujhhgtgfeyxiexzf c2092Ujhhgtgfeyxiexzf3 = null;
        C1503Ujhhgtgfeyxiexzf c1503Ujhhgtgfeyxiexzf = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Integer num3 = null;
        String str4 = null;
        C2050Ujhhgtgfeyxiexzf c2050Ujhhgtgfeyxiexzf = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            C2022Ujhhgtgfeyxiexzf c2022Ujhhgtgfeyxiexzf2 = c2022Ujhhgtgfeyxiexzf;
            int iMo1185Ujhhgtgfeyxiexzf = interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo1185Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
            switch (iMo1185Ujhhgtgfeyxiexzf) {
                case -1:
                    z = false;
                    c2181Ujhhgtgfeyxiexzf = c2181Ujhhgtgfeyxiexzf;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 0, C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf, str);
                    i2 |= 1;
                    c2181Ujhhgtgfeyxiexzf = c2181Ujhhgtgfeyxiexzf;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    str2 = str2;
                    break;
                case 1:
                    num2 = (Integer) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 1, C0681Ujhhgtgfeyxiexzf.f2808Ujhhgtgfeyxiexzf, num2);
                    i2 |= 2;
                    str2 = str2;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 2:
                    str2 = (String) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 2, C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf, str2);
                    i2 |= 4;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 3:
                    str3 = (String) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 3, C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf, str3);
                    i2 |= 8;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 4:
                    list = (List) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 4, (InterfaceC0146Ujhhgtgfeyxiexzf) interfaceC0058UjhhgtgfeyxiexzfArr[4].getValue(), list);
                    i2 |= 16;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 5:
                    num3 = (Integer) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 5, C0681Ujhhgtgfeyxiexzf.f2808Ujhhgtgfeyxiexzf, num3);
                    i2 |= 32;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 6:
                    str4 = (String) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 6, C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf, str4);
                    i2 |= 64;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 7:
                    c2050Ujhhgtgfeyxiexzf = (C2050Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 7, C2043feyxiexzfUjhhgtg.f6727Ujhhgtgfeyxiexzf, c2050Ujhhgtgfeyxiexzf);
                    i2 |= 128;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 8:
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c2022Ujhhgtgfeyxiexzf = (C2022Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 8, C2027feyxiexzfUjhhgtg.f6665Ujhhgtgfeyxiexzf, c2022Ujhhgtgfeyxiexzf2);
                    i2 |= bc.e;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 9:
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    c2092Ujhhgtgfeyxiexzf = (C2092Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 9, C2085Ujhhgtgfeyxiexzf.f6845Ujhhgtgfeyxiexzf, c2092Ujhhgtgfeyxiexzf);
                    i2 |= 512;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c1683feyxiexzfUjhhgtg = c1683feyxiexzfUjhhgtg;
                    break;
                case 10:
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1563Ujhhgtgfeyxiexzf = (C1563Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 10, C1561Ujhhgtgfeyxiexzf.f5366Ujhhgtgfeyxiexzf, c1563Ujhhgtgfeyxiexzf);
                    i2 |= 1024;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case 11:
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1608feyxiexzfUjhhgtg = (C1608feyxiexzfUjhhgtg) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 11, C1613feyxiexzfUjhhgtg.f5540Ujhhgtgfeyxiexzf, c1608feyxiexzfUjhhgtg);
                    i2 |= 2048;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c2181Ujhhgtgfeyxiexzf = (C2181Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 12, C2179Ujhhgtgfeyxiexzf.f7063Ujhhgtgfeyxiexzf, c2181Ujhhgtgfeyxiexzf);
                    i2 |= 4096;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case 13:
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    c1683feyxiexzfUjhhgtg = (C1683feyxiexzfUjhhgtg) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 13, C1681feyxiexzfUjhhgtg.f5648Ujhhgtgfeyxiexzf, c1683feyxiexzfUjhhgtg);
                    i2 |= 8192;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    num = (Integer) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 14, C0681Ujhhgtgfeyxiexzf.f2808Ujhhgtgfeyxiexzf, num);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case 15:
                    c2092Ujhhgtgfeyxiexzf2 = (C2092Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 15, C2085Ujhhgtgfeyxiexzf.f6845Ujhhgtgfeyxiexzf, c2092Ujhhgtgfeyxiexzf2);
                    i = 32768;
                    i2 |= i;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case 16:
                    c1802feyxiexzfUjhhgtg = (C1802feyxiexzfUjhhgtg) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 16, C1800feyxiexzfUjhhgtg.f6071Ujhhgtgfeyxiexzf, c1802feyxiexzfUjhhgtg);
                    i = 65536;
                    i2 |= i;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c2199feyxiexzfUjhhgtg = (C2199feyxiexzfUjhhgtg) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 17, C2197Ujhhgtgfeyxiexzf.f7156Ujhhgtgfeyxiexzf, c2199feyxiexzfUjhhgtg);
                    i = 131072;
                    i2 |= i;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case Opcodes.LDC /* 18 */:
                    c1523Ujhhgtgfeyxiexzf = (C1523Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 18, C1489Ujhhgtgfeyxiexzf.f5165Ujhhgtgfeyxiexzf, c1523Ujhhgtgfeyxiexzf);
                    i = 262144;
                    i2 |= i;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case 19:
                    c2092Ujhhgtgfeyxiexzf3 = (C2092Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 19, C2085Ujhhgtgfeyxiexzf.f6845Ujhhgtgfeyxiexzf, c2092Ujhhgtgfeyxiexzf3);
                    i = 524288;
                    i2 |= i;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                case 20:
                    c1503Ujhhgtgfeyxiexzf = (C1503Ujhhgtgfeyxiexzf) interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2283feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 20, C1501Ujhhgtgfeyxiexzf.f5266Ujhhgtgfeyxiexzf, c1503Ujhhgtgfeyxiexzf);
                    i = 1048576;
                    i2 |= i;
                    c2022Ujhhgtgfeyxiexzf = c2022Ujhhgtgfeyxiexzf2;
                    c2092Ujhhgtgfeyxiexzf = c2092Ujhhgtgfeyxiexzf;
                    break;
                default:
                    throw new C1940Ujhhgtgfeyxiexzf(iMo1185Ujhhgtgfeyxiexzf);
            }
        }
        C1683feyxiexzfUjhhgtg c1683feyxiexzfUjhhgtg2 = c1683feyxiexzfUjhhgtg;
        C2092Ujhhgtgfeyxiexzf c2092Ujhhgtgfeyxiexzf4 = c2092Ujhhgtgfeyxiexzf;
        String str5 = str;
        Integer num4 = num2;
        String str6 = str2;
        interfaceC2876feyxiexzfUjhhgtgMo2267Ujhhgtgfeyxiexzf.mo2266Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        C1563Ujhhgtgfeyxiexzf c1563Ujhhgtgfeyxiexzf2 = c1563Ujhhgtgfeyxiexzf;
        return new C2020feyxiexzfUjhhgtg(i2, str5, num4, str6, str3, list, num3, str4, c2050Ujhhgtgfeyxiexzf, c2022Ujhhgtgfeyxiexzf, c2092Ujhhgtgfeyxiexzf4, c1563Ujhhgtgfeyxiexzf2, c1608feyxiexzfUjhhgtg, c2181Ujhhgtgfeyxiexzf, c1683feyxiexzfUjhhgtg2, num, c2092Ujhhgtgfeyxiexzf2, c1802feyxiexzfUjhhgtg, c2199feyxiexzfUjhhgtg, c1523Ujhhgtgfeyxiexzf, c2092Ujhhgtgfeyxiexzf3, c1503Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3575feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final InterfaceC0146Ujhhgtgfeyxiexzf[] mo1531Ujhhgtgfeyxiexzf() {
        InterfaceC0058Ujhhgtgfeyxiexzf[] interfaceC0058UjhhgtgfeyxiexzfArr = C2020feyxiexzfUjhhgtg.f6611Ujhhgtgfeyxiexzf;
        C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c1157feyxiexzfUjhhgtg);
        C0681Ujhhgtgfeyxiexzf c0681Ujhhgtgfeyxiexzf = C0681Ujhhgtgfeyxiexzf.f2808Ujhhgtgfeyxiexzf;
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c0681Ujhhgtgfeyxiexzf);
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c1157feyxiexzfUjhhgtg);
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c1157feyxiexzfUjhhgtg);
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf((InterfaceC0146Ujhhgtgfeyxiexzf) interfaceC0058UjhhgtgfeyxiexzfArr[4].getValue());
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c0681Ujhhgtgfeyxiexzf);
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf7 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c1157feyxiexzfUjhhgtg);
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf8 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C2043feyxiexzfUjhhgtg.f6727Ujhhgtgfeyxiexzf);
        InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf9 = AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C2027feyxiexzfUjhhgtg.f6665Ujhhgtgfeyxiexzf);
        C2085Ujhhgtgfeyxiexzf c2085Ujhhgtgfeyxiexzf = C2085Ujhhgtgfeyxiexzf.f6845Ujhhgtgfeyxiexzf;
        return new InterfaceC0146Ujhhgtgfeyxiexzf[]{interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf2, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf3, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf4, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf5, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf6, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf7, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf8, interfaceC0146UjhhgtgfeyxiexzfM5160Ujhhgtgfeyxiexzf9, AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c2085Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C1561Ujhhgtgfeyxiexzf.f5366Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C1613feyxiexzfUjhhgtg.f5540Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C2179Ujhhgtgfeyxiexzf.f7063Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C1681feyxiexzfUjhhgtg.f5648Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c0681Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c2085Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C1800feyxiexzfUjhhgtg.f6071Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C2197Ujhhgtgfeyxiexzf.f7156Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C1489Ujhhgtgfeyxiexzf.f5165Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(c2085Ujhhgtgfeyxiexzf), AbstractC3593Ujhhgtgfeyxiexzf.m5160Ujhhgtgfeyxiexzf(C1501Ujhhgtgfeyxiexzf.f5266Ujhhgtgfeyxiexzf)};
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        C2020feyxiexzfUjhhgtg c2020feyxiexzfUjhhgtg = (C2020feyxiexzfUjhhgtg) obj;
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = descriptor;
        InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf = interfaceC3329Ujhhgtgfeyxiexzf.mo2323Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        InterfaceC0058Ujhhgtgfeyxiexzf[] interfaceC0058UjhhgtgfeyxiexzfArr = C2020feyxiexzfUjhhgtg.f6611Ujhhgtgfeyxiexzf;
        C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 0, c1157feyxiexzfUjhhgtg, c2020feyxiexzfUjhhgtg.f6612Ujhhgtgfeyxiexzf);
        C0681Ujhhgtgfeyxiexzf c0681Ujhhgtgfeyxiexzf = C0681Ujhhgtgfeyxiexzf.f2808Ujhhgtgfeyxiexzf;
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 1, c0681Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6613Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 2, c1157feyxiexzfUjhhgtg, c2020feyxiexzfUjhhgtg.f6614Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 3, c1157feyxiexzfUjhhgtg, c2020feyxiexzfUjhhgtg.f6615Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 4, (InterfaceC0146Ujhhgtgfeyxiexzf) interfaceC0058UjhhgtgfeyxiexzfArr[4].getValue(), c2020feyxiexzfUjhhgtg.f6616Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 5, c0681Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6617Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 6, c1157feyxiexzfUjhhgtg, c2020feyxiexzfUjhhgtg.f6618Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 7, C2043feyxiexzfUjhhgtg.f6727Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6619Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 8, C2027feyxiexzfUjhhgtg.f6665Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6620Ujhhgtgfeyxiexzf);
        C2085Ujhhgtgfeyxiexzf c2085Ujhhgtgfeyxiexzf = C2085Ujhhgtgfeyxiexzf.f6845Ujhhgtgfeyxiexzf;
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 9, c2085Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6621Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 10, C1561Ujhhgtgfeyxiexzf.f5366Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6622Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 11, C1613feyxiexzfUjhhgtg.f5540Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6623Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 12, C2179Ujhhgtgfeyxiexzf.f7063Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6624Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 13, C1681feyxiexzfUjhhgtg.f5648Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6625Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 14, c0681Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6626Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 15, c2085Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6627Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 16, C1800feyxiexzfUjhhgtg.f6071Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6628Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 17, C2197Ujhhgtgfeyxiexzf.f7156Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6629Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 18, C1489Ujhhgtgfeyxiexzf.f5165Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6630Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 19, c2085Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6631Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2344feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 20, C1501Ujhhgtgfeyxiexzf.f5266Ujhhgtgfeyxiexzf, c2020feyxiexzfUjhhgtg.f6632Ujhhgtgfeyxiexzf);
        interfaceC2875feyxiexzfUjhhgtgMo2323Ujhhgtgfeyxiexzf.mo2322Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
    }
}
