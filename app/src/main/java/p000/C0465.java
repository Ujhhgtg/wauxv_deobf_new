package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0465 extends AbstractC2867 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0465 f2052;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2053;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2054;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2055;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final boolean f2056;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2052 = new C0465("BottomTabLiquidHook");
        f2053 = "美化";
        f2054 = "底栏 Liquid";
        f2055 = "替换主页底部标签栏为 Liquid 样式";
        f2056 = true;
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void mo1691(Activity activity, ViewGroup viewGroup, Object obj) {
        int i;
        int i2;
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            C1803 c1803 = new C1803(activity);
            int i3 = -1;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) AbstractC3681.m5322(56, c1803.getContext()));
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) AbstractC3681.m5322(10, c1803.getContext());
            c1803.setLayoutParams(layoutParams);
            List listM2212 = AbstractC0745.m2212(Integer.valueOf(R.drawable.ic_tab_liquid_chats_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_contacts_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_discover_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_me_24dp));
            List listM2213 = AbstractC0745.m2212("微信", "通讯", "发现", "我的");
            c1803.f6020 = 4;
            ArrayList arrayList = c1803.f6021;
            arrayList.clear();
            LinearLayout linearLayout = c1803.f6026;
            linearLayout.removeAllViews();
            int i4 = 0;
            if (listM2212.isEmpty()) {
                int i5 = c1803.f6020;
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(Integer.valueOf(17301568));
                }
                listM2212 = arrayList2;
            }
            int i7 = c1803.f6020;
            int i8 = 0;
            while (true) {
                i = 1;
                if (i8 >= i7) {
                    break;
                }
                String str = (String) ((i8 < 0 || i8 >= listM2213.size()) ? "Tab " + (i8 + 1) : listM2213.get(i8));
                int iIntValue = ((Number) ((i8 < 0 || i8 >= listM2212.size()) ? Integer.valueOf(((Number) AbstractC0744.m2197(listM2212)).intValue()) : listM2212.get(i8))).intValue();
                LinearLayout linearLayout2 = new LinearLayout(c1803.getContext());
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                ImageView imageView = new ImageView(c1803.getContext());
                imageView.setLayoutParams(new LinearLayout.LayoutParams(c1803.m3551(24.0f), c1803.m3551(24.0f)));
                imageView.setImageResource(iIntValue);
                TextView textView = new TextView(c1803.getContext());
                textView.setText(str);
                textView.setGravity(17);
                textView.setTextSize(2, 12.0f);
                linearLayout2.addView(imageView);
                linearLayout2.addView(textView);
                C1801 c1801 = new C1801(linearLayout2, imageView, textView);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC1800(c1803, i8, 0));
                arrayList.add(c1801);
                linearLayout.addView(linearLayout2);
                i8++;
                i3 = -1;
                i4 = 0;
            }
            int i9 = c1803.f6019;
            int i10 = c1803.f6020;
            c1803.setSelectedTabIndex(i10 <= 0 ? 0 : AbstractC2203.m4027(i9, i10 - 1));
            c1803.m3554();
            if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
                i2 = 0;
                linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1802(c1803, 0));
            } else {
                i2 = 0;
                c1803.m3553(false);
            }
            c1803.setOnTabSelected(new C0464(0, obj));
            ViewParent parent = viewGroup.getParent();
            View childAt = ((ViewGroup) parent).getChildAt(1);
            ((ViewGroup) childAt).addView(c1803);
            int i11 = 0;
            MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(obj).m3492();
            c1973M3492.f6370 = "onPageSelected";
            C3689 c3689M4174 = m4174((C1982) AbstractC0744.firstInList(c1973M3492.m3799()), 1);
            f2052.m3262(c3689M4174, new C0055(1, c1803));
            c3689M4174.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2055;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2054;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2053;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo1131() {
        return f2056;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
