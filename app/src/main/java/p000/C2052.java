package p000;

import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲀᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2052 extends AbstractC1823 implements InterfaceC1592 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2052 f6839 = new C2052();

    @Override // p000.InterfaceC1592
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2062(Object obj) throws IllegalAccessException {
        List listM3699;
        int i = 0;
        C1744 c1744M2484 = AbstractC0968.startFieldResolution(obj);
        C1299 c1299M3490 = c1744M2484.m3490();
        String[] strArr = AbstractC1574.f5469;
        c1299M3490.f6370 = "field_isSend";
        Integer num = (Integer) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024();
        if (num != null && num.intValue() == 1) {
            return;
        }
        C1299 c1299M3491 = c1744M2484.m3490();
        c1299M3491.f6370 = "field_type";
        if (((Number) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024()).intValue() == EnumC3673.f11479.f11492) {
            C1299 c1299M3492 = c1744M2484.m3490();
            c1299M3492.f6370 = "field_content";
            String str = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
            C1904 c1904M4123 = AbstractC2209.m4123(Pattern.compile("\\Q<content>|WA|\\E(.*?)\\Q</content>\\E").matcher(str), 0, str);
            String str2 = (c1904M4123 == null || (listM3699 = c1904M4123.m3699()) == null) ? null : (String) AbstractC0744.m2193(1, listM3699);
            if (str2 != null) {
                C1299 c1299M3493 = c1744M2484.m3490();
                c1299M3493.f6370 = "field_type";
                ((C1315) AbstractC2784.m4741(c1299M3493)).set(Integer.valueOf(EnumC3673.f11469.f11492));
                MsgInfoBean msgInfoBean = new MsgInfoBean(obj);
                if (!msgInfoBean.isGroupChat()) {
                    C1299 c1299M3494 = c1744M2484.m3490();
                    c1299M3494.f6370 = "field_content";
                    ((C1315) AbstractC2784.m4741(c1299M3494)).set(str2);
                    return;
                }
                C1299 c1299M3495 = c1744M2484.m3490();
                c1299M3495.f6370 = "field_content";
                ((C1315) AbstractC2784.m4741(c1299M3495)).set(msgInfoBean.getSendTalker() + ':' + str2);
            }
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
