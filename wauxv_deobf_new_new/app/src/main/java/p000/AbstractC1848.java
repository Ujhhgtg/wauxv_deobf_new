package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲇᛸᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1848 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final Method f6134;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Method f6135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f6136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ListAdapter f6137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C1983 f6138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f6142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f6143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f6144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1845 f6146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public View f6147;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public AbstractC1978 f6148;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final Handler f6153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Rect f6155;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f6156;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final C0233 f6157;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6139 = -2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f6145 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final RunnableC1844 f6149 = new RunnableC1844(this, 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ViewOnTouchListenerC1847 f6150 = new ViewOnTouchListenerC1847(this, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C1846 f6151 = new C1846(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final RunnableC1844 f6152 = new RunnableC1844(this, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final Rect f6154 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f6134 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6135 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1848(Context context, int i) {
        int resourceId;
        this.f6136 = context;
        this.f6153 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2523.f8037, i, 0);
        this.f6140 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6141 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6142 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0233 c0233 = new C0233(context, null, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC2523.f8041, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0233.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0233.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : C1787.m3667(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f6157 = c0233;
        c0233.setInputMethodMode(1);
    }

    @Override // p000.InterfaceC2763
    public final void dismiss() {
        C0233 c0233 = this.f6157;
        c0233.dismiss();
        c0233.setContentView(null);
        this.f6138 = null;
        this.f6153.removeCallbacks(this.f6149);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3754(ListAdapter listAdapter) {
        C1845 c1845 = this.f6146;
        if (c1845 == null) {
            this.f6146 = new C1845(this);
        } else {
            ListAdapter listAdapter2 = this.f6137;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1845);
            }
        }
        this.f6137 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6146);
        }
        C1983 c1983 = this.f6138;
        if (c1983 != null) {
            c1983.setAdapter(this.f6137);
        }
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo2064() {
        return this.f6157.isShowing();
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2065() {
        int i;
        int iMakeMeasureSpec;
        C1983 c1983;
        C1983 c1984 = this.f6138;
        Context context = this.f6136;
        C0233 c0233 = this.f6157;
        if (c1984 == null) {
            C1983 c1985 = new C1983(context, !this.f6156);
            c1985.setHoverListener((C1984) this);
            this.f6138 = c1985;
            c1985.setAdapter(this.f6137);
            this.f6138.setOnItemClickListener(this.f6148);
            this.f6138.setFocusable(true);
            this.f6138.setFocusableInTouchMode(true);
            this.f6138.setOnItemSelectedListener(new C1841(this));
            this.f6138.setOnScrollListener(this.f6151);
            c0233.setContentView(this.f6138);
        }
        Drawable background = c0233.getBackground();
        Rect rect = this.f6154;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f6142) {
                this.f6141 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM3751 = AbstractC1842.m3751(c0233, this.f6147, this.f6141, c0233.getInputMethodMode() == 2);
        int i3 = this.f6139;
        if (i3 != -2) {
            iMakeMeasureSpec = i3 != -1 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iM2833 = this.f6138.m2833(iMakeMeasureSpec, iM3751);
        int paddingBottom = iM2833 + (iM2833 > 0 ? this.f6138.getPaddingBottom() + this.f6138.getPaddingTop() + i : 0);
        c0233.getInputMethodMode();
        c0233.setWindowLayoutType(1002);
        if (c0233.isShowing()) {
            if (this.f6147.isAttachedToWindow()) {
                int width = this.f6139;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f6147.getWidth();
                }
                c0233.setOutsideTouchable(true);
                c0233.update(this.f6147, this.f6140, this.f6141, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f6139;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f6147.getWidth();
        }
        c0233.setWidth(width2);
        c0233.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f6134;
            if (method != null) {
                try {
                    method.invoke(c0233, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1843.m3753(c0233, true);
        }
        c0233.setOutsideTouchable(true);
        c0233.setTouchInterceptor(this.f6150);
        if (this.f6144) {
            c0233.setOverlapAnchor(this.f6143);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f6135;
            if (method2 != null) {
                try {
                    method2.invoke(c0233, this.f6155);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC1843.m3752(c0233, this.f6155);
        }
        c0233.showAsDropDown(this.f6147, this.f6140, this.f6141, this.f6145);
        this.f6138.setSelection(-1);
        if ((!this.f6156 || this.f6138.isInTouchMode()) && (c1983 = this.f6138) != null) {
            c1983.setListSelectionHidden(true);
            c1983.requestLayout();
        }
        if (this.f6156) {
            return;
        }
        this.f6153.post(this.f6152);
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final ListView mo2066() {
        return this.f6138;
    }
}
