package p000;

import android.view.View;
import android.widget.TextView;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲀᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1409 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1409 f5086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f5087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C1322 f5090;

    static {
        AbstractC1471.m3394(-552719341320835L);
        String[] strArr = AbstractC1471.f5234;
        f5086 = new C1409("FormatMsgTimeHook");
        f5087 = "净化";
        f5088 = "格式消息时间";
        f5089 = "自定义聊天项顶部时间是否显示与格式";
        f5090 = new C1322(28);
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3445()) {
            int i = AbstractC1768.f5906;
            C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
            c1300M3558.f6475 = "timeTV";
            TextView textView = (TextView) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127();
            int iM2662 = C1407.f5084.m2662();
            if (iM2662 == EnumC1406.f5079.f5083) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (iM2662 == EnumC1406.f5081.f5083 && textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(AbstractC2234.m4188(msgInfoBean.getCreateTime(), C1408.f5085.m2666(), null, 2));
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f5089;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f5088;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f5087;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f5090;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
