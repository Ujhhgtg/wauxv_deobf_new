package p000;

import java.util.Collections;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴᛲ能不能要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1059feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1059feyxiexzfUjhhgtg f4112Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String[] f4113Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4114Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4115Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f4116Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final C1003feyxiexzfUjhhgtg f4117Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928873704038860170L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928873824297944458L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4112Ujhhgtgfeyxiexzf = new C1059feyxiexzfUjhhgtg("SnsInfoHook");
        f4113Ujhhgtgfeyxiexzf = new String[]{"${originalText}", "${time}", "${type}", "${snsId}", "${userName}"};
        f4114Ujhhgtgfeyxiexzf = "朋友圈";
        f4115Ujhhgtgfeyxiexzf = "朋友圈底部详情";
        f4116Ujhhgtgfeyxiexzf = "为朋友圈列表项的底部添加自定义文本";
        f4117Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(24);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static String m2548feyxiexzfUjhhgtg(Object obj) {
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_snsId";
        long jLongValue = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_userName";
        String str = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "field_createTime";
        int iIntValue = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "field_type";
        int iIntValue2 = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf()).intValue();
        String strM2681feyxiexzfUjhhgtg = AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(C1050feyxiexzfUjhhgtg.f4101Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), "${time}", AbstractC3612feyxiexzfUjhhgtg.m5246Ujhhgtgfeyxiexzf(((long) iIntValue) * 1000, C1051feyxiexzfUjhhgtg.f4102Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), null, 2));
        String str2 = "${type}";
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(16);
        String string = Integer.toString(iIntValue2, 16);
        "toString(...)";
        String upperCase = string.toUpperCase(Locale.ROOT);
        "toUpperCase(...)";
        sb.append(upperCase);
        return AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM2681feyxiexzfUjhhgtg, str2, sb.toString()), "${snsId}", String.valueOf(jLongValue)), "${userName}", str);
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        if (!AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7373Ujhhgtgfeyxiexzf) && !AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7351Ujhhgtgfeyxiexzf)) {
            AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1055feyxiexzfUjhhgtg.f4106Ujhhgtgfeyxiexzf, dexKitBridge, new C1003feyxiexzfUjhhgtg(27));
        } else {
            AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1052feyxiexzfUjhhgtg.f4103Ujhhgtgfeyxiexzf, dexKitBridge, new C1003feyxiexzfUjhhgtg(25));
            AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1053feyxiexzfUjhhgtg.f4104Ujhhgtgfeyxiexzf, dexKitBridge, new C1003feyxiexzfUjhhgtg(26));
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        boolean zM2830Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7373Ujhhgtgfeyxiexzf);
        C1059feyxiexzfUjhhgtg c1059feyxiexzfUjhhgtg = f4112Ujhhgtgfeyxiexzf;
        if (zM2830Ujhhgtgfeyxiexzf || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7351Ujhhgtgfeyxiexzf)) {
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c1059feyxiexzfUjhhgtg, Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1052feyxiexzfUjhhgtg.f4103Ujhhgtgfeyxiexzf)));
            c1059feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C1003feyxiexzfUjhhgtg(28));
            c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
        } else {
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf2 = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c1059feyxiexzfUjhhgtg, Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1055feyxiexzfUjhhgtg.f4106Ujhhgtgfeyxiexzf)));
            c1059feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf2, new C1003feyxiexzfUjhhgtg(20));
            c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf2.m3485Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4116Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4115Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4114Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f4117Ujhhgtgfeyxiexzf;
    }
}
