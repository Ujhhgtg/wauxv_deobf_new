package p000;

import android.graphics.Color;
import android.view.View;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲀᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2129 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2129 f7031;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7032;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7033;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7034;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2117 f7035;

    static {
        AbstractC1471.m3394(-518462682167939L);
        AbstractC1471.m3394(-518505631840899L);
        String[] strArr = AbstractC1471.f5234;
        f7031 = new C2129("MsgTvColorHook");
        f7032 = "美化";
        f7033 = "消息文本颜色";
        f7034 = "当前仅支持配置微信部分消息文本颜色";
        f7035 = new C2117(3);
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        int color;
        if (mo3445()) {
            int type = msgInfoBean.getType();
            if (type == EnumC3733.f11618.f11641 || type == EnumC3733.f11628.f11641 || type == EnumC3733.f11636.f11641 || type == EnumC3733.f11637.f11641) {
                C2123.f7022.getClass();
                View viewFindViewById = view.findViewById(C2123.m4068());
                if (viewFindViewById != null) {
                    int i = AbstractC1768.f5906;
                    C2004 c2004M3560 = AbstractC2727.m4713(viewFindViewById).m3560();
                    c2004M3560.f6475 = "setTextColor";
                    C2013 c2013 = (C2013) AbstractC2844.m4776(c2004M3560);
                    if (AbstractC2234.m4176(viewFindViewById.getContext())) {
                        color = Color.parseColor((!msgInfoBean.isSend() ? C2125.f7027 : C2127.f7029).m2666());
                    } else {
                        color = Color.parseColor((!msgInfoBean.isSend() ? C2126.f7028 : C2128.f7030).m2666());
                    }
                    c2013.m4025(Integer.valueOf(color));
                }
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7034;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7033;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7032;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f7035;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
