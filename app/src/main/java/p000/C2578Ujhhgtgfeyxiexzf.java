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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱ要点脸ᛳᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2578Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0611Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2578Ujhhgtgfeyxiexzf f8341Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f8342Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f8343Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f8344Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final boolean f8345Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f8341Ujhhgtgfeyxiexzf = new C2578Ujhhgtgfeyxiexzf("BottomTabLiquidHook");
        f8342Ujhhgtgfeyxiexzf = "美化";
        f8343Ujhhgtgfeyxiexzf = "底栏 Liquid";
        f8344Ujhhgtgfeyxiexzf = "替换主页底部标签栏为 Liquid 样式";
        f8345Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.InterfaceC0611Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo1873Ujhhgtgfeyxiexzf(Activity activity, ViewGroup viewGroup, Object obj) {
        int i;
        int i2;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg()) {
            final C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf = new C0113Ujhhgtgfeyxiexzf(activity);
            int i3 = -1;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(56, c0113Ujhhgtgfeyxiexzf.getContext()));
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(10, c0113Ujhhgtgfeyxiexzf.getContext());
            c0113Ujhhgtgfeyxiexzf.setLayoutParams(layoutParams);
            List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(Integer.valueOf(R.drawable.ic_tab_liquid_chats_filled_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_contacts_filled_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_discover_filled_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_me_filled_24dp));
            List listM4192Ujhhgtgfeyxiexzf2 = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(Integer.valueOf(R.drawable.ic_tab_liquid_chats_outline_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_contacts_outline_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_discover_outline_24dp), Integer.valueOf(R.drawable.ic_tab_liquid_me_outline_24dp));
            List listM4192Ujhhgtgfeyxiexzf3 = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf("微信", "通讯", "发现", "我的");
            c0113Ujhhgtgfeyxiexzf.f1248Ujhhgtgfeyxiexzf = 4;
            ArrayList arrayList = c0113Ujhhgtgfeyxiexzf.f1249Ujhhgtgfeyxiexzf;
            arrayList.clear();
            LinearLayout linearLayout = c0113Ujhhgtgfeyxiexzf.f1261Ujhhgtgfeyxiexzf;
            linearLayout.removeAllViews();
            int i4 = 0;
            if (listM4192Ujhhgtgfeyxiexzf.isEmpty()) {
                int i5 = c0113Ujhhgtgfeyxiexzf.f1248Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(Integer.valueOf(android.R.drawable.ic_menu_help));
                }
                listM4192Ujhhgtgfeyxiexzf = arrayList2;
            }
            if (listM4192Ujhhgtgfeyxiexzf2.isEmpty()) {
                listM4192Ujhhgtgfeyxiexzf2 = listM4192Ujhhgtgfeyxiexzf;
            }
            int i7 = c0113Ujhhgtgfeyxiexzf.f1248Ujhhgtgfeyxiexzf;
            final int i8 = 0;
            while (true) {
                i = 1;
                if (i8 >= i7) {
                    break;
                }
                String str = (String) ((i8 < 0 || i8 >= listM4192Ujhhgtgfeyxiexzf3.size()) ? "Tab " + (i8 + 1) : listM4192Ujhhgtgfeyxiexzf3.get(i8));
                int iIntValue = ((Number) ((i8 < 0 || i8 >= listM4192Ujhhgtgfeyxiexzf.size()) ? Integer.valueOf(((Number) AbstractC2856feyxiexzfUjhhgtg.m4244feyxiexzfUjhhgtg(listM4192Ujhhgtgfeyxiexzf)).intValue()) : listM4192Ujhhgtgfeyxiexzf.get(i8))).intValue();
                int iIntValue2 = ((Number) ((i8 < 0 || i8 >= listM4192Ujhhgtgfeyxiexzf2.size()) ? Integer.valueOf(((Number) AbstractC2856feyxiexzfUjhhgtg.m4244feyxiexzfUjhhgtg(listM4192Ujhhgtgfeyxiexzf2)).intValue()) : listM4192Ujhhgtgfeyxiexzf2.get(i8))).intValue();
                LinearLayout linearLayout2 = new LinearLayout(c0113Ujhhgtgfeyxiexzf.getContext());
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(i4, i3, 1.0f));
                ImageView imageView = new ImageView(c0113Ujhhgtgfeyxiexzf.getContext());
                imageView.setLayoutParams(new LinearLayout.LayoutParams(c0113Ujhhgtgfeyxiexzf.m1172Ujhhgtgfeyxiexzf(24.0f), c0113Ujhhgtgfeyxiexzf.m1172Ujhhgtgfeyxiexzf(24.0f)));
                imageView.setImageResource(iIntValue2);
                TextView textView = new TextView(c0113Ujhhgtgfeyxiexzf.getContext());
                textView.setText(str);
                textView.setGravity(17);
                textView.setTextSize(2, 12.0f);
                linearLayout2.addView(imageView);
                linearLayout2.addView(textView);
                final C0103Ujhhgtgfeyxiexzf c0103Ujhhgtgfeyxiexzf = new C0103Ujhhgtgfeyxiexzf(linearLayout2, imageView, textView, iIntValue, iIntValue2);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC0107Ujhhgtgfeyxiexzf(c0113Ujhhgtgfeyxiexzf, i8, 0));
                linearLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能要点脸ᛳᛲ
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
                    
                        if (r8 != 3) goto L12;
                     */
                    @Override // android.view.View.OnTouchListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int iM2794Ujhhgtgfeyxiexzf;
                        LinearLayout linearLayout3 = c0103Ujhhgtgfeyxiexzf.f1213Ujhhgtgfeyxiexzf;
                        C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf2 = c0113Ujhhgtgfeyxiexzf;
                        LinearLayout linearLayout4 = c0113Ujhhgtgfeyxiexzf2.f1261Ujhhgtgfeyxiexzf;
                        if (c0113Ujhhgtgfeyxiexzf2.f1248Ujhhgtgfeyxiexzf != 0) {
                            float fM2793Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2793Ujhhgtgfeyxiexzf(motionEvent.getX() + linearLayout3.getLeft(), 0.0f, linearLayout4.getWidth());
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                ViewParent parent = c0113Ujhhgtgfeyxiexzf2.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                c0113Ujhhgtgfeyxiexzf2.f1254Ujhhgtgfeyxiexzf = i8;
                                c0113Ujhhgtgfeyxiexzf2.f1253Ujhhgtgfeyxiexzf = fM2793Ujhhgtgfeyxiexzf;
                                c0113Ujhhgtgfeyxiexzf2.m1170Ujhhgtgfeyxiexzf(1.0f);
                                c0113Ujhhgtgfeyxiexzf2.m1171Ujhhgtgfeyxiexzf();
                                return false;
                            }
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    c0113Ujhhgtgfeyxiexzf2.f1253Ujhhgtgfeyxiexzf = fM2793Ujhhgtgfeyxiexzf;
                                    if (c0113Ujhhgtgfeyxiexzf2.f1248Ujhhgtgfeyxiexzf <= 0 || linearLayout4.getWidth() <= 0) {
                                        iM2794Ujhhgtgfeyxiexzf = c0113Ujhhgtgfeyxiexzf2.f1247Ujhhgtgfeyxiexzf;
                                    } else {
                                        float width = linearLayout4.getWidth();
                                        int i9 = c0113Ujhhgtgfeyxiexzf2.f1248Ujhhgtgfeyxiexzf;
                                        iM2794Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2794Ujhhgtgfeyxiexzf((int) (fM2793Ujhhgtgfeyxiexzf / (width / i9)), i9 - 1);
                                    }
                                    c0113Ujhhgtgfeyxiexzf2.f1254Ujhhgtgfeyxiexzf = iM2794Ujhhgtgfeyxiexzf;
                                    c0113Ujhhgtgfeyxiexzf2.m1171Ujhhgtgfeyxiexzf();
                                    return false;
                                }
                            }
                            c0113Ujhhgtgfeyxiexzf2.f1254Ujhhgtgfeyxiexzf = -1;
                            c0113Ujhhgtgfeyxiexzf2.f1253Ujhhgtgfeyxiexzf = fM2793Ujhhgtgfeyxiexzf;
                            c0113Ujhhgtgfeyxiexzf2.m1170Ujhhgtgfeyxiexzf(0.0f);
                            return false;
                        }
                        return false;
                    }
                });
                arrayList.add(c0103Ujhhgtgfeyxiexzf);
                linearLayout.addView(linearLayout2);
                i8++;
                i3 = -1;
                i4 = 0;
            }
            int i9 = c0113Ujhhgtgfeyxiexzf.f1247Ujhhgtgfeyxiexzf;
            int i10 = c0113Ujhhgtgfeyxiexzf.f1248Ujhhgtgfeyxiexzf;
            c0113Ujhhgtgfeyxiexzf.setSelectedTabIndex(i10 <= 0 ? 0 : AbstractC1264feyxiexzfUjhhgtg.m2794Ujhhgtgfeyxiexzf(i9, i10 - 1));
            c0113Ujhhgtgfeyxiexzf.m1178Ujhhgtgfeyxiexzf();
            c0113Ujhhgtgfeyxiexzf.m1171Ujhhgtgfeyxiexzf();
            if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
                i2 = 0;
                linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0106Ujhhgtgfeyxiexzf(c0113Ujhhgtgfeyxiexzf, 0));
            } else {
                i2 = 0;
                c0113Ujhhgtgfeyxiexzf.m1175Ujhhgtgfeyxiexzf(false);
            }
            c0113Ujhhgtgfeyxiexzf.setOnTabSelected(new C2577Ujhhgtgfeyxiexzf(i2, obj));
            C3052Ujhhgtgfeyxiexzf.m4522Ujhhgtgfeyxiexzf(viewGroup).addView(c0113Ujhhgtgfeyxiexzf);
            int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "onPageSelected";
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf = m2996Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf()), 1);
            f8341Ujhhgtgfeyxiexzf.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf, new C2925Ujhhgtgfeyxiexzf(i, c0113Ujhhgtgfeyxiexzf));
            c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f8344Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f8343Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f8342Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public final boolean mo1482feyxiexzfUjhhgtg() {
        return f8345Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
