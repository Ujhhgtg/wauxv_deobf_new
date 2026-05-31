package p000;

import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᲀᤝᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2085 extends AbstractC1850 implements InterfaceC1604 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2085 f6963 = new C2085();

    @Override // p000.InterfaceC1604
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2152(Object obj) throws IllegalAccessException {
        List listM3883;
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
        if (((Number) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127()).intValue() == EnumC3733.f11628.f11641) {
            C1300 c1300M35510 = c1681M4713.m3558();
            c1300M35510.f6475 = "field_content";
            String str = (String) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
            C1931 c1931M3093 = AbstractC1272.m3093(Pattern.compile("\\Q<content>|WA|\\E(.*?)\\Q</content>\\E").matcher(str), 0, str);
            String str2 = (c1931M3093 == null || (listM3883 = c1931M3093.m3883()) == null) ? null : (String) AbstractC0739.m2292(1, listM3883);
            if (str2 != null) {
                C1300 c1300M35511 = c1681M4713.m3558();
                c1300M35511.f6475 = "field_type";
                ((C1316) AbstractC2844.m4775(c1300M35511)).m3128(Integer.valueOf(EnumC3733.f11618.f11641));
                MsgInfoBean msgInfoBean = new MsgInfoBean(obj);
                if (!msgInfoBean.isGroupChat()) {
                    C1300 c1300M35512 = c1681M4713.m3558();
                    c1300M35512.f6475 = "field_content";
                    ((C1316) AbstractC2844.m4775(c1300M35512)).m3128(str2);
                    return;
                }
                C1300 c1300M35513 = c1681M4713.m3558();
                c1300M35513.f6475 = "field_content";
                ((C1316) AbstractC2844.m4775(c1300M35513)).m3128(msgInfoBean.getSendTalker() + ':' + str2);
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
