package p000;

import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2763feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0608Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2763feyxiexzfUjhhgtg f8748Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f8749Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f8750Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f8751Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f8748Ujhhgtgfeyxiexzf = new C2763feyxiexzfUjhhgtg("ChatUrlFormatShowHook");
        f8749Ujhhgtgfeyxiexzf = "聊天";
        f8750Ujhhgtgfeyxiexzf = "链接格式显示";
        f8751Ujhhgtgfeyxiexzf = "将其他应用分享的口令进行格式化显示";
    }

    @Override // p000.InterfaceC0608Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo1537Ujhhgtgfeyxiexzf(Object obj) throws IllegalAccessException {
        String str;
        List listM1285Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg()) {
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj);
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_isSend";
            Integer num = (Integer) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf();
            if (num != null && num.intValue() == 1) {
                return;
            }
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_type";
            if (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf()).intValue() == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "field_content";
                String str2 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf();
                String strM2641Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(str2, ":");
                f8748Ujhhgtgfeyxiexzf.getClass();
                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, "点击链接直接打开 或者 淘宝搜索直接打开", false)) {
                    String str3 = "【淘宝】";
                    C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(Pattern.compile("https?://[\\w./?=&%-]+").matcher(str2), 0, str2);
                    String strGroup = c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf != null ? c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.f1465Ujhhgtgfeyxiexzf.group() : "https://github.com/HdShare/WAuxiliary_Public";
                    C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf2 = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(Pattern.compile("「([^」]+)」").matcher(str2), 0, str2);
                    if (c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf2 == null || (listM1285Ujhhgtgfeyxiexzf = c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf2.m1285Ujhhgtgfeyxiexzf()) == null || (str = (String) ((C0208Ujhhgtgfeyxiexzf) listM1285Ujhhgtgfeyxiexzf).get(1)) == null) {
                        str = "解析异常";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append('\n');
                    sb.append("<a href=\"" + strGroup + "\">" + str + "</a>");
                    String string = sb.toString();
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "field_content";
                    C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg = (C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM2641Ujhhgtgfeyxiexzf);
                    sbM2707Ujhhgtgfeyxiexzf.append(":\n");
                    sbM2707Ujhhgtgfeyxiexzf.append(string);
                    c3438feyxiexzfUjhhgtg.m4940Ujhhgtgfeyxiexzf(sbM2707Ujhhgtgfeyxiexzf.toString());
                }
            }
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f8751Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f8750Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f8749Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
