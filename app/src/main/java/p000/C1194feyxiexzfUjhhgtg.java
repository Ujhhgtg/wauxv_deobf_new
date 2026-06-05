package p000;

import java.util.ArrayList;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ能不能ᛱUjhhgtgᛱᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1194feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf, InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1194feyxiexzfUjhhgtg f4487Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4488Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4489Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4490Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4487Ujhhgtgfeyxiexzf = new C1194feyxiexzfUjhhgtg("SnsLabelFilterHook");
        f4488Ujhhgtgfeyxiexzf = "朋友圈";
        f4489Ujhhgtgfeyxiexzf = "朋友圈标签过滤";
        f4490Ujhhgtgfeyxiexzf = "可通过顶栏菜单过滤指定标签的朋友圈";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static String m2682feyxiexzfUjhhgtg(String str) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (str.equals("SELECT rowid, * FROM SnsInfo WHERE (SnsInfo.sourceType & 2) <> 0 ORDER BY SnsInfo.createTime DESC LIMIT 10 OFFSET 0")) {
            Set<String> setM4622Ujhhgtgfeyxiexzf = C1195feyxiexzfUjhhgtg.f4491Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf();
            if (setM4622Ujhhgtgfeyxiexzf.isEmpty()) {
                setM4622Ujhhgtgfeyxiexzf = null;
            }
            if (setM4622Ujhhgtgfeyxiexzf != null && !setM4622Ujhhgtgfeyxiexzf.contains("default")) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : setM4622Ujhhgtgfeyxiexzf) {
                    C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf.getClass();
                    AbstractC2862feyxiexzfUjhhgtg.m4266feyxiexzfUjhhgtg(arrayList, C3673feyxiexzfUjhhgtg.m5362feyxiexzfUjhhgtg(str2));
                }
                return "SELECT rowid, * FROM SnsInfo WHERE ((SnsInfo.sourceType & 2) <> 0) AND (SnsInfo.userName IN " + AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(AbstractC2856feyxiexzfUjhhgtg.m4255Ujhhgtgfeyxiexzf(arrayList), null, "(", ")", new C1058feyxiexzfUjhhgtg(7), 25) + ") ORDER BY SnsInfo.createTime DESC LIMIT 1000";
            }
        }
        return str;
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1199feyxiexzfUjhhgtg.f4496Ujhhgtgfeyxiexzf, dexKitBridge, new C1058feyxiexzfUjhhgtg(8));
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo2083Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String strM2682feyxiexzfUjhhgtg = m2682feyxiexzfUjhhgtg(str);
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strM2682feyxiexzfUjhhgtg, str)) {
                return;
            }
            c0578Ujhhgtgfeyxiexzf.getClass();
            new C2501feyxiexzfUjhhgtg(1, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf(strM2682feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo2084Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String strM2682feyxiexzfUjhhgtg = m2682feyxiexzfUjhhgtg(str);
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strM2682feyxiexzfUjhhgtg, str)) {
                return;
            }
            c0578Ujhhgtgfeyxiexzf.getClass();
            new C2501feyxiexzfUjhhgtg(0, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf(strM2682feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI")).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "onCreate";
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
        C1194feyxiexzfUjhhgtg c1194feyxiexzfUjhhgtg = f4487Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf = c1194feyxiexzfUjhhgtg.m2996Ujhhgtgfeyxiexzf(c0393Ujhhgtgfeyxiexzf, 1);
        c1194feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf, new C1058feyxiexzfUjhhgtg(9));
        c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4490Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4489Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4488Ujhhgtgfeyxiexzf;
    }
}
