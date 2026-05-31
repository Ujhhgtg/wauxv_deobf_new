package p000;

import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᤞᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0654 extends AbstractC2927 implements InterfaceC1604 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0654 f2534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f2535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2537;

    static {
        String[] strArr = AbstractC1471.f5234;
        f2534 = new C0654("ChatUrlFormatShowHook");
        f2535 = "聊天";
        f2536 = "链接格式显示";
        f2537 = "将其他应用分享的口令进行格式化显示";
    }

    @Override // p000.InterfaceC1604
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo2152(Object obj) throws IllegalAccessException {
        String str;
        List listM3883;
        if (mo3445()) {
            int i = AbstractC1768.f5906;
            C1681 c1681M4713 = AbstractC2727.m4713(obj);
            C1300 c1300M3558 = c1681M4713.m3558();
            String[] strArr = AbstractC1471.f5234;
            c1300M3558.f6475 = "field_isSend";
            Integer num = (Integer) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127();
            if (num != null && num.intValue() == 1) {
                return;
            }
            C1300 c1300M3559 = c1681M4713.m3558();
            c1300M3559.f6475 = "field_type";
            if (((Number) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127()).intValue() == EnumC3733.f11618.f11641) {
                C1300 c1300M35510 = c1681M4713.m3558();
                c1300M35510.f6475 = "field_content";
                String str2 = (String) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
                String strM4879 = AbstractC2901.m4879(str2, ":");
                f2534.getClass();
                if (AbstractC2901.m4861(str2, "点击链接直接打开 或者 淘宝搜索直接打开", false)) {
                    String str3 = "【淘宝】";
                    C1931 c1931M3093 = AbstractC1272.m3093(Pattern.compile("https?://[\\w./?=&%-]+").matcher(str2), 0, str2);
                    String strGroup = c1931M3093 != null ? c1931M3093.f6357.group() : "https://github.com/HdShare/WAuxiliary_Public";
                    C1931 c1931M3094 = AbstractC1272.m3093(Pattern.compile("「([^」]+)」").matcher(str2), 0, str2);
                    if (c1931M3094 == null || (listM3883 = c1931M3094.m3883()) == null || (str = (String) ((C1930) listM3883).get(1)) == null) {
                        str = "解析异常";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append('\n');
                    sb.append("<a href=\"" + strGroup + "\">" + str + "</a>");
                    String string = sb.toString();
                    C1300 c1300M35511 = c1681M4713.m3558();
                    c1300M35511.f6475 = "field_content";
                    C1316 c1316 = (C1316) AbstractC2844.m4775(c1300M35511);
                    StringBuilder sbM4787 = AbstractC2844.m4787(strM4879);
                    sbM4787.append(":\n");
                    sbM4787.append(string);
                    c1316.m3128(sbM4787.toString());
                }
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2537;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2536;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2535;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
