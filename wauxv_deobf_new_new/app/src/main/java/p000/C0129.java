package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.analytics.pro.bc;
import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0129 extends AbstractC2927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0129 f1138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2933 f1139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2933 f1140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2933 f1141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f1142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f1143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f1144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f1145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C0113 f1146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final boolean f1147;

    static {
        AbstractC1471.m3394(-496279176084099L);
        AbstractC1471.m3394(-496322125757059L);
        String[] strArr = AbstractC1471.f5234;
        f1138 = new C0129("AccountInfoCenterHook");
        f1139 = new C2933(new C0112(0));
        f1140 = new C2933(new C0112(1));
        f1141 = new C2933(new C0112(2));
        C2933 c2933 = AbstractC2381.f7642;
        f1142 = AbstractC2381.m4344("Resource", "Font");
        f1143 = "美化";
        f1144 = "资料卡居中";
        f1145 = "居中我界面资料卡，与隐藏微信号冲突";
        f1146 = new C0113(0);
        f1147 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static TextView m1271(C0129 c0129, Context context, int i, int i2, int i3, float f, String str, boolean z, File file, int i4) {
        boolean z2 = (i4 & 128) != 0;
        int i5 = (i4 & bc.e) != 0 ? Integer.MAX_VALUE : 1;
        int i6 = (i4 & 512) != 0 ? 0 : 1;
        if ((i4 & 1024) != 0) {
            file = null;
        }
        c0129.getClass();
        String[] strArr = AbstractC1471.f5234;
        TextView textView = new TextView(context);
        textView.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, i2);
        layoutParams.topMargin = (int) AbstractC2234.m4163(Integer.valueOf(i3), context);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(f);
        textView.setText(str);
        textView.setVisibility(z ? 0 : 8);
        if (z2) {
            textView.setTextColor(Color.parseColor(MagicFactory.get(AbstractC2234.m4176(context) ? -496081607588483L : -496124557261443L, strArr)));
        }
        textView.setMaxLines(i5);
        textView.setTypeface(textView.getTypeface(), i6);
        if (file != null && file.exists()) {
            textView.setTypeface(Typeface.createFromFile(file));
        }
        return textView;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        C2013 c2013 = (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(View.class)}, 1, AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference")).m3560());
        C0129 c0129 = f1138;
        C3752 c3752M4303 = c0129.m4303(c2013, 1);
        c0129.m3443(c3752M4303, new C0113(1));
        c3752M4303.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final String mo1273() {
        return f1145;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final String mo1274() {
        return f1144;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final String mo1275() {
        return f1143;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final InterfaceC1433 mo1276() {
        return f1146;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final boolean mo1277() {
        return f1147;
    }
}
