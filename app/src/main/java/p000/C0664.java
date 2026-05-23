package p000;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲁᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0664 extends AbstractC2867 implements InterfaceC1592 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0664 f2541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2543;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2544;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2541 = new C0664("ChatUrlFormatShowHook");
        f2542 = "聊天";
        f2543 = "链接格式显示";
        f2544 = "将其他应用分享的口令进行格式化显示";
    }

    @Override // p000.InterfaceC1592
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo2062(Object obj) throws IllegalAccessException {
        String str;
        List listM3699;
        if (mo3264()) {
            int i = 0;
            C1744 c1744M2484 = AbstractC0968.startMethodResolution_(obj);
            C1299 c1299M3490 = c1744M2484.m3490();
            String[] strArr = AbstractC1574.f5469;
            c1299M3490.name = "field_isSend";
            Integer num = (Integer) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024();
            if (num != null && num.intValue() == 1) {
                return;
            }
            C1299 c1299M3491 = c1744M2484.m3490();
            c1299M3491.name = "field_type";
            if (((Number) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024()).intValue() == EnumC3673.f11469.f11492) {
                C1299 c1299M3492 = c1744M2484.m3490();
                c1299M3492.name = "field_content";
                String str2 = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                String strM4845 = AbstractC2841.m4845(str2, ":");
                
                if (AbstractC2841.m4828(str2, "点击链接直接打开 或者 淘宝搜索直接打开", false)) {
                    String str3 = "【淘宝】";
                    C1904 c1904M4123 = AbstractC2209.m4123(Pattern.compile("https?://[\\w./?=&%-]+").matcher(str2), 0, str2);
                    String strGroup = c1904M4123 != null ? c1904M4123.f6278.group() : "https://github.com/HdShare/WAuxiliary_Public";
                    C1904 c1904M4124 = AbstractC2209.m4123(Pattern.compile("「([^」]+)」").matcher(str2), 0, str2);
                    if (c1904M4124 == null || (listM3699 = c1904M4124.m3699()) == null || (str = (String) ((C1903) listM3699).get(1)) == null) {
                        str = "解析异常";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("【淘宝】");
                    sb.append('\n');
                    sb.append("<a href=\"" + strGroup + "\">" + str + "</a>");
                    String string = sb.toString();
                    C1299 c1299M3493 = c1744M2484.m3490();
                    c1299M3493.name = "field_content";
                    C1315 c1315 = (C1315) AbstractC2784.m4741(c1299M3493);
                    StringBuilder sbM4753 = AbstractC2784.m4753(strM4845);
                    sbM4753.append(":\n");
                    sbM4753.append(string);
                    c1315.set(sbM4753.toString());
                }
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2544;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2543;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2542;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
