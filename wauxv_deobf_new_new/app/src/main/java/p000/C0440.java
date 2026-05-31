package p000;

import android.app.Activity;
import android.view.MotionEvent;
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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᤝᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0440 extends AbstractC2927 implements InterfaceC1602 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0440 f2024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f2025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2026;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2027;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean f2028;

    static {
        String[] strArr = AbstractC1471.f5234;
        f2024 = new C0440("BottomTabLiquidHook");
        f2025 = "美化";
        f2026 = "底栏 Liquid";
        f2027 = "替换主页底部标签栏为 Liquid 样式";
        f2028 = true;
    }

    @Override // p000.InterfaceC1602
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void mo1799(Activity activity, ViewGroup viewGroup, Object obj) {
        int i;
        int i2;
        String[] strArr = AbstractC1471.f5234;
        if (mo3445()) {
            final C1830 c1830 = new C1830(activity);
            int i3 = -1;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) AbstractC2234.m4163(56, c1830.getContext()));
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) AbstractC2234.m4163(10, c1830.getContext());
            c1830.setLayoutParams(layoutParams);
            List listM2311 = AbstractC0740.m2311(Integer.valueOf(R.drawable.ic_tab_liquid_chats_filled_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_contacts_filled_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_discover_filled_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_me_filled_24dp));
            List listM2312 = AbstractC0740.m2311(Integer.valueOf(R.drawable.ic_tab_liquid_chats_outline_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_contacts_outline_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_discover_outline_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_me_outline_24dp));
            List listM2313 = AbstractC0740.m2311("微信", "通讯", "发现", "我的");
            c1830.f6088 = 4;
            ArrayList arrayList = c1830.f6089;
            arrayList.clear();
            LinearLayout linearLayout = c1830.f6101;
            linearLayout.removeAllViews();
            int i4 = 0;
            if (listM2311.isEmpty()) {
                int i5 = c1830.f6088;
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(Integer.valueOf(android.R.drawable.ic_menu_help));
                }
                listM2311 = arrayList2;
            }
            if (listM2312.isEmpty()) {
                listM2312 = listM2311;
            }
            int i7 = c1830.f6088;
            final int i8 = 0;
            while (true) {
                i = 1;
                if (i8 >= i7) {
                    break;
                }
                String str = (String) ((i8 < 0 || i8 >= listM2313.size()) ? "Tab " + (i8 + 1) : listM2313.get(i8));
                int iIntValue = ((Number) ((i8 < 0 || i8 >= listM2311.size()) ? Integer.valueOf(((Number) AbstractC0739.m2296(listM2311)).intValue()) : listM2311.get(i8))).intValue();
                int iIntValue2 = ((Number) ((i8 < 0 || i8 >= listM2312.size()) ? Integer.valueOf(((Number) AbstractC0739.m2296(listM2312)).intValue()) : listM2312.get(i8))).intValue();
                LinearLayout linearLayout2 = new LinearLayout(c1830.getContext());
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(i4, i3, 1.0f));
                ImageView imageView = new ImageView(c1830.getContext());
                imageView.setLayoutParams(new LinearLayout.LayoutParams(c1830.m3726(24.0f), c1830.m3726(24.0f)));
                imageView.setImageResource(iIntValue2);
                TextView textView = new TextView(c1830.getContext());
                textView.setText(str);
                textView.setGravity(17);
                textView.setTextSize(2, 12.0f);
                linearLayout2.addView(imageView);
                linearLayout2.addView(textView);
                final C1827 c1827 = new C1827(linearLayout2, imageView, textView, iIntValue, iIntValue2);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC1824(c1830, i8, 0));
                linearLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᛸᲁᤝ
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
                    
                        if (r8 != 3) goto L12;
                     */
                    @Override // android.view.View.OnTouchListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int iM5328;
                        LinearLayout linearLayout3 = c1827.f6079;
                        C1830 c1831 = c1830;
                        LinearLayout linearLayout4 = c1831.f6101;
                        if (c1831.f6088 != 0) {
                            float fM5327 = AbstractC3744.m5327(motionEvent.getX() + linearLayout3.getLeft(), 0.0f, linearLayout4.getWidth());
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                ViewParent parent = c1831.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                c1831.f6094 = i8;
                                c1831.f6093 = fM5327;
                                c1831.m3724(1.0f);
                                c1831.m3725();
                                return false;
                            }
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    c1831.f6093 = fM5327;
                                    if (c1831.f6088 <= 0 || linearLayout4.getWidth() <= 0) {
                                        iM5328 = c1831.f6087;
                                    } else {
                                        float width = linearLayout4.getWidth();
                                        int i9 = c1831.f6088;
                                        iM5328 = AbstractC3744.m5328((int) (fM5327 / (width / i9)), i9 - 1);
                                    }
                                    c1831.f6094 = iM5328;
                                    c1831.m3725();
                                    return false;
                                }
                            }
                            c1831.f6094 = -1;
                            c1831.f6093 = fM5327;
                            c1831.m3724(0.0f);
                            return false;
                        }
                        return false;
                    }
                });
                arrayList.add(c1827);
                linearLayout.addView(linearLayout2);
                i8++;
                i3 = -1;
                i4 = 0;
            }
            int i9 = c1830.f6087;
            int i10 = c1830.f6088;
            c1830.setSelectedTabIndex(i10 <= 0 ? 0 : AbstractC3744.m5328(i9, i10 - 1));
            c1830.m3732();
            c1830.m3725();
            if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
                i2 = 0;
                linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1828(c1830, 0));
            } else {
                i2 = 0;
                c1830.m3729(false);
            }
            c1830.setOnTabSelected(new C0439(obj, i2));
            ViewParent parent = viewGroup.getParent();
            "null cannot be cast to non-null type android.view.ViewGroup";
            ((ViewGroup) parent).addView(c1830);
            int i11 = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
            c2004M3560.f6475 = "onPageSelected";
            C3752 c3752M4303 = m4303((C2013) AbstractC0739.m2290(c2004M3560.m3993()), 1);
            f2024.m3443(c3752M4303, new C0062(c1830, i));
            c3752M4303.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2027;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2026;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2025;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f2028;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
