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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0473 extends AbstractC2867 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0473 f2064;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2065;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2873 f2066;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2873 f2067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2873 f2068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2873 f2069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C2873 f2070;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final String f2071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final String f2072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final String f2073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final C0316 f2074;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final boolean f2075;

    static {
        AbstractC1574.m3300(-480383502121652L);
        AbstractC1574.m3300(-480426451794612L);
        AbstractC1574.m3300(-480469401467572L);
        AbstractC1574.m3300(-480512351140532L);
        AbstractC1574.m3300(-480555300813492L);
        AbstractC1574.m3300(-480598250486452L);
        String[] strArr = AbstractC1574.f5469;
        f2064 = new C0473("BottomTabMaterialHook");
        C2873 c2873 = AbstractC2342.f7529;
        f2065 = AbstractC2342.m4330("Resource", "BottomTab");
        f2066 = new C2873(new C0104(12));
        f2067 = new C2873(new C0104(13));
        f2068 = new C2873(new C0104(14));
        f2069 = new C2873(new C0104(15));
        f2070 = new C2873(new C0104(16));
        f2071 = "美化";
        f2072 = "底栏 Material You";
        f2073 = "替换主页底部标签栏为 Material You 样式";
        f2074 = new C0316(15);
        f2075 = true;
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1691(Activity activity, ViewGroup viewGroup, Object obj) {
        if (mo3264()) {
            C0450 c0450 = new C0450(AbstractC1128.m2700(AbstractC2207.m4086(activity)));
            C0243 c0243M5083 = AbstractC3471.m5083(c0450.getContext(), null, AbstractC2467.f7840, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
            TypedArray typedArray = (TypedArray) c0243M5083.f1404;
            int i = 2;
            c0450.setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
            if (typedArray.hasValue(0)) {
                c0450.setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
            }
            typedArray.getBoolean(1, true);
            c0243M5083.m1329();
            AbstractC1459.m3179(c0450, new C0373(5));
            c0450.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) AbstractC3681.m5322(56, c0450.getContext())));
            c0450.setLabelVisibilityMode(2);
            if (AbstractC3681.m5331(c0450.getContext())) {
                c0450.setBackgroundColor(Color.parseColor(C0467.f2058.m2542()));
                c0450.setItemActiveIndicatorColor(AbstractC1460.m3212(Color.parseColor(C0471.f2062.m2542())));
                c0450.setItemIconTintList(AbstractC1460.m3212(Color.parseColor(C0469.f2060.m2542())));
            } else {
                c0450.setBackgroundColor(Color.parseColor(C0468.f2059.m2542()));
                c0450.setItemActiveIndicatorColor(AbstractC1460.m3212(Color.parseColor(C0472.f2063.m2542())));
                c0450.setItemIconTintList(AbstractC1460.m3212(Color.parseColor(C0470.f2061.m2542())));
            }
            Menu menu = c0450.getMenu();
            String[] strArr = AbstractC1574.f5469;
            MenuItem menuItemAdd = menu.add(0, 0, 0, "");
            C0473 c0473 = f2064;
            
            menuItemAdd.setIcon(new BitmapDrawable(c0450.getResources(), (Bitmap) f2067.getValue()));
            menu.add(0, 1, 1, "").setIcon(new BitmapDrawable(c0450.getResources(), (Bitmap) f2068.getValue()));
            menu.add(0, 2, 2, "").setIcon(new BitmapDrawable(c0450.getResources(), (Bitmap) f2069.getValue()));
            menu.add(0, 3, 3, "").setIcon(new BitmapDrawable(c0450.getResources(), (Bitmap) f2070.getValue()));
            c0450.setOnItemSelectedListener(new C0466(obj));
            ViewParent parent = viewGroup.getParent();
            View childAt = ((ViewGroup) parent).getChildAt(1);
            ((ViewGroup) childAt).addView(c0450);
            int i2 = 0;
            MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(obj).m3492();
            c1973M3492.f6370 = "onPageSelected";
            C3689 c3689M4174 = m4174((C1982) AbstractC0744.firstInList(c1973M3492.m3799()), 1);
            c0473.m3262(c3689M4174, new C0055(2, c0450));
            c3689M4174.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2073;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2072;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2071;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f2074;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo1131() {
        return f2075;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
