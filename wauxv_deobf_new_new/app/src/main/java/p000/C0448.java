package p000;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲀᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0448 extends AbstractC2927 implements InterfaceC1602 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0448 f2036;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f2037;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2933 f2038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2933 f2039;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2933 f2040;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2933 f2041;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2933 f2042;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f2043;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final String f2044;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final String f2045;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final C0316 f2046;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final boolean f2047;

    static {
        AbstractC1471.m3394(-502008662456963L);
        AbstractC1471.m3394(-502051612129923L);
        AbstractC1471.m3394(-502094561802883L);
        AbstractC1471.m3394(-502137511475843L);
        AbstractC1471.m3394(-502180461148803L);
        AbstractC1471.m3394(-502223410821763L);
        String[] strArr = AbstractC1471.f5234;
        f2036 = new C0448("BottomTabMaterialHook");
        C2933 c2933 = AbstractC2381.f7642;
        f2037 = AbstractC2381.m4344("Resource", "BottomTab");
        f2038 = new C2933(new C0112(12));
        f2039 = new C2933(new C0112(13));
        f2040 = new C2933(new C0112(14));
        f2041 = new C2933(new C0112(15));
        f2042 = new C2933(new C0112(16));
        f2043 = "美化";
        f2044 = "底栏 Material You";
        f2045 = "替换主页底部标签栏为 Material You 样式";
        f2046 = new C0316(20);
        f2047 = true;
    }

    @Override // p000.InterfaceC1602
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1799(Activity activity, ViewGroup viewGroup, Object obj) {
        if (mo3445()) {
            C0425 c0425 = new C0425(AbstractC1134.m2849(AbstractC2902.m4884(activity)));
            C0253 c0253M4264 = AbstractC2240.m4264(c0425.getContext(), null, AbstractC2521.f7986, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
            TypedArray typedArray = (TypedArray) c0253M4264.f1478;
            int i = 2;
            c0425.setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
            if (typedArray.hasValue(0)) {
                c0425.setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
            }
            typedArray.getBoolean(1, true);
            c0253M4264.m1475();
            AbstractC1471.m3382(c0425, new C0348(5));
            c0425.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) AbstractC2234.m4163(56, c0425.getContext())));
            c0425.setLabelVisibilityMode(2);
            if (AbstractC2234.m4176(c0425.getContext())) {
                c0425.setBackgroundColor(Color.parseColor(C0442.f2030.m2666()));
                c0425.setItemActiveIndicatorColor(AbstractC0738.m2266(Color.parseColor(C0446.f2034.m2666())));
                c0425.setItemIconTintList(AbstractC0738.m2266(Color.parseColor(C0444.f2032.m2666())));
            } else {
                c0425.setBackgroundColor(Color.parseColor(C0443.f2031.m2666()));
                c0425.setItemActiveIndicatorColor(AbstractC0738.m2266(Color.parseColor(C0447.f2035.m2666())));
                c0425.setItemIconTintList(AbstractC0738.m2266(Color.parseColor(C0445.f2033.m2666())));
            }
            Menu menu = c0425.getMenu();
            String[] strArr = AbstractC1471.f5234;
            MenuItem menuItemAdd = menu.add(0, 0, 0, "");
            C0448 c0448 = f2036;
            c0448.getClass();
            menuItemAdd.setIcon(new BitmapDrawable(c0425.getResources(), (Bitmap) f2039.getValue()));
            menu.add(0, 1, 1, "").setIcon(new BitmapDrawable(c0425.getResources(), (Bitmap) f2040.getValue()));
            menu.add(0, 2, 2, "").setIcon(new BitmapDrawable(c0425.getResources(), (Bitmap) f2041.getValue()));
            menu.add(0, 3, 3, "").setIcon(new BitmapDrawable(c0425.getResources(), (Bitmap) f2042.getValue()));
            c0425.setOnItemSelectedListener(new C0441(obj));
            ViewParent parent = viewGroup.getParent();
            "null cannot be cast to non-null type android.view.ViewGroup";
            View childAt = ((ViewGroup) parent).getChildAt(1);
            "null cannot be cast to non-null type android.view.ViewGroup";
            ((ViewGroup) childAt).addView(c0425);
            int i2 = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
            c2004M3560.f6475 = "onPageSelected";
            C3752 c3752M4303 = m4303((C2013) AbstractC0739.m2290(c2004M3560.m3993()), 1);
            c0448.m3443(c3752M4303, new C0062(c0425, i));
            c3752M4303.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2045;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2044;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2043;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f2046;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f2047;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
