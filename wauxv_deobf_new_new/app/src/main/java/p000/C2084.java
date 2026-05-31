package p000;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᲀᤝᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2084 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2084 f6958;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f6959;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f6960;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f6961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2059 f6962;

    static {
        AbstractC1471.m3394(-516998098320003L);
        AbstractC1471.m3394(-517041047992963L);
        AbstractC1471.m3394(-517083997665923L);
        AbstractC1471.m3394(-517126947338883L);
        AbstractC1471.m3394(-517169897011843L);
        String[] strArr = AbstractC1471.f5234;
        f6958 = new C2084("MsgBgColorHook");
        f6959 = "美化";
        f6960 = "消息背景颜色";
        f6961 = "仅支持配置部分消息, 与背景气泡冲突";
        f6962 = new C2059(10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static void m4064(View view, boolean z) {
        int color;
        int color2;
        view.setPadding(32, 20, 32, 20);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = 16;
        marginLayoutParams.rightMargin = 16;
        view.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int iM4163 = (int) AbstractC2234.m4163(Float.valueOf(1.0f), view.getContext());
        if (AbstractC2234.m4176(view.getContext())) {
            color = Color.parseColor((!z ? C2077.f6951 : C2081.f6955).m2666());
        } else {
            color = Color.parseColor((!z ? C2079.f6953 : C2083.f6957).m2666());
        }
        gradientDrawable.setStroke(iM4163, color);
        gradientDrawable.setCornerRadius(AbstractC2234.m4163(Float.valueOf(8.0f), view.getContext()));
        if (AbstractC2234.m4176(view.getContext())) {
            color2 = Color.parseColor((!z ? C2076.f6950 : C2080.f6954).m2666());
        } else {
            color2 = Color.parseColor((!z ? C2078.f6952 : C2082.f6956).m2666());
        }
        gradientDrawable.setColor(color2);
        view.setBackground(gradientDrawable);
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3445()) {
            int type = msgInfoBean.getType();
            if (type == EnumC3733.f11618.f11641 || type == EnumC3733.f11628.f11641 || type == EnumC3733.f11636.f11641 || type == EnumC3733.f11637.f11641) {
                C2123.f7022.getClass();
                View viewFindViewById = view.findViewById(C2123.m4068());
                if (viewFindViewById != null) {
                    m4064(viewFindViewById, msgInfoBean.isSend());
                    return;
                }
                return;
            }
            if (type != EnumC3733.f11620.f11641) {
                if (type == EnumC3733.f11626.f11641) {
                    C2123.f7022.getClass();
                    C1576.f5470.getClass();
                    View viewFindViewById2 = view.findViewById(C1576.m3460() ? C2122.f7021.m2662() : AbstractC1468.m3308(C2123.m4073()));
                    if (viewFindViewById2 != null) {
                        m4064(viewFindViewById2, msgInfoBean.isSend());
                        return;
                    }
                    return;
                }
                return;
            }
            C2123.f7022.getClass();
            C1576 c1576 = C1576.f5470;
            c1576.getClass();
            View viewFindViewById3 = view.findViewById(C1576.m3460() ? C2119.f7018.m2662() : AbstractC1468.m3308(C2123.m4070()));
            if (viewFindViewById3 != null) {
                m4064(viewFindViewById3, msgInfoBean.isSend());
            }
            c1576.getClass();
            View viewFindViewById4 = view.findViewById(C1576.m3460() ? C2120.f7019.m2662() : AbstractC1468.m3308(C2123.m4071()));
            if (viewFindViewById4 != null) {
                m4064(viewFindViewById4, msgInfoBean.isSend());
            }
            c1576.getClass();
            View viewFindViewById5 = view.findViewById(C1576.m3460() ? C2121.f7020.m2662() : AbstractC1468.m3308(C2123.m4073()));
            if (viewFindViewById5 != null) {
                m4064(viewFindViewById5, msgInfoBean.isSend());
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f6961;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f6960;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f6959;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f6962;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
