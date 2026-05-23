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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0121 extends AbstractC2867 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0121 f1070;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2873 f1071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2873 f1072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2873 f1073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f1074;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f1075;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f1076;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final String f1077;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final C0105 f1078;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final boolean f1079;

    static {
        AbstractC1574.m3300(-474396317711028L);
        AbstractC1574.m3300(-474439267383988L);
        String[] strArr = AbstractC1574.f5469;
        f1070 = new C0121("AccountInfoCenterHook");
        f1071 = new C2873(new C0104(0));
        f1072 = new C2873(new C0104(1));
        f1073 = new C2873(new C0104(2));
        C2873 c2873 = AbstractC2342.f7529;
        f1074 = AbstractC2342.m4330("Resource", "Font");
        f1075 = "美化";
        f1076 = "资料卡居中";
        f1077 = "居中我界面资料卡，与隐藏微信号冲突";
        f1078 = new C0105(0);
        f1079 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static TextView m1125(C0121 c0121, Context context, int i, int i2, int i3, float f, String str, boolean z, File file, int i4) {
        boolean z2 = (i4 & 128) != 0;
        int i5 = (i4 & bc.e) != 0 ? Integer.MAX_VALUE : 1;
        int i6 = (i4 & 512) != 0 ? 0 : 1;
        if ((i4 & 1024) != 0) {
            file = null;
        }
        c0121.getClass();
        String[] strArr = AbstractC1574.f5469;
        TextView textView = new TextView(context);
        textView.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, i2);
        layoutParams.topMargin = (int) AbstractC3681.m5322(Integer.valueOf(i3), context);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(f);
        textView.setText(str);
        textView.setVisibility(z ? 0 : 8);
        if (z2) {
            textView.setTextColor(Color.parseColor(MagicFactory.get(AbstractC3681.m5331(context) ? -474198749215412L : -474241698888372L, strArr)));
        }
        textView.setMaxLines(i5);
        textView.setTypeface(textView.getTypeface(), i6);
        if (file != null && file.exists()) {
            textView.setTypeface(Typeface.createFromFile(file));
        }
        return textView;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1126() {
        int i = AbstractC1745.f5844;
        C1982 c1982 = (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(View.class)}, 1, AbstractC0968.m2483(AbstractC2201.m3988("com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference")).m3492());
        C0121 c0121 = f1070;
        C3689 c3689M4174 = c0121.m4174(c1982, 1);
        c0121.m3262(c3689M4174, new C0105(1));
        c3689M4174.m5352();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final String mo1127() {
        return f1077;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final String mo1128() {
        return f1076;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final String mo1129() {
        return f1075;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final InterfaceC1425 mo1130() {
        return f1078;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final boolean mo1131() {
        return f1079;
    }
}
