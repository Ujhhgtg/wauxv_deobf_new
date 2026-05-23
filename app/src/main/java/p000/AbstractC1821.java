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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1821 implements InterfaceC2701 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Method f6059;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final Method f6060;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f6061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ListAdapter f6062;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C1952 f6063;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6065;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6066;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f6067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f6068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f6069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1818 f6071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public View f6072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public AbstractC1947 f6073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final Handler f6078;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public Rect f6080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f6081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C0223 f6082;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6064 = -2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f6070 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final RunnableC1817 f6074 = new RunnableC1817(this, 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final ViewOnTouchListenerC1820 f6075 = new ViewOnTouchListenerC1820(0, this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final C1819 f6076 = new C1819(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final RunnableC1817 f6077 = new RunnableC1817(this, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final Rect f6079 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f6059 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6060 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1821(Context context, int i) {
        int resourceId;
        this.f6061 = context;
        this.f6078 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2470.f7888, i, 0);
        this.f6065 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6066 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6067 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0223 c0223 = new C0223(context, null, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC2470.f7892, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0223.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0223.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC3471.m5076(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f6082 = c0223;
        c0223.setInputMethodMode(1);
    }

    @Override // p000.InterfaceC2701
    public final void dismiss() {
        C0223 c0223 = this.f6082;
        c0223.dismiss();
        c0223.setContentView(null);
        this.f6063 = null;
        this.f6078.removeCallbacks(this.f6074);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3576(ListAdapter listAdapter) {
        C1818 c1818 = this.f6071;
        if (c1818 == null) {
            this.f6071 = new C1818(this);
        } else {
            ListAdapter listAdapter2 = this.f6062;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1818);
            }
        }
        this.f6062 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6071);
        }
        C1952 c1952 = this.f6063;
        if (c1952 != null) {
            c1952.setAdapter(this.f6062);
        }
    }

    @Override // p000.InterfaceC2701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo1967() {
        return this.f6082.isShowing();
    }

    @Override // p000.InterfaceC2701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo1968() {
        int i;
        int iMakeMeasureSpec;
        C1952 c1952;
        C1952 c1953 = this.f6063;
        Context context = this.f6061;
        C0223 c0223 = this.f6082;
        if (c1953 == null) {
            C1952 c1954 = new C1952(context, !this.f6081);
            c1954.setHoverListener((C1953) this);
            this.f6063 = c1954;
            c1954.setAdapter(this.f6062);
            this.f6063.setOnItemClickListener(this.f6073);
            this.f6063.setFocusable(true);
            this.f6063.setFocusableInTouchMode(true);
            this.f6063.setOnItemSelectedListener(new C1814(this));
            this.f6063.setOnScrollListener(this.f6076);
            c0223.setContentView(this.f6063);
        }
        Drawable background = c0223.getBackground();
        Rect rect = this.f6079;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f6067) {
                this.f6066 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM3573 = AbstractC1815.m3573(c0223, this.f6072, this.f6066, c0223.getInputMethodMode() == 2);
        int i3 = this.f6064;
        if (i3 != -2) {
            iMakeMeasureSpec = i3 != -1 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), -2147483648);
        }
        int iM2684 = this.f6063.m2684(iMakeMeasureSpec, iM3573);
        int paddingBottom = iM2684 + (iM2684 > 0 ? this.f6063.getPaddingBottom() + this.f6063.getPaddingTop() + i : 0);
        c0223.getInputMethodMode();
        c0223.setWindowLayoutType(1002);
        if (c0223.isShowing()) {
            if (this.f6072.isAttachedToWindow()) {
                int width = this.f6064;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f6072.getWidth();
                }
                c0223.setOutsideTouchable(true);
                c0223.update(this.f6072, this.f6065, this.f6066, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f6064;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f6072.getWidth();
        }
        c0223.setWidth(width2);
        c0223.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f6059;
            if (method != null) {
                try {
                    method.invoke(c0223, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1816.m3575(c0223, true);
        }
        c0223.setOutsideTouchable(true);
        c0223.setTouchInterceptor(this.f6075);
        if (this.f6069) {
            c0223.setOverlapAnchor(this.f6068);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f6060;
            if (method2 != null) {
                try {
                    method2.invoke(c0223, this.f6080);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC1816.m3574(c0223, this.f6080);
        }
        c0223.showAsDropDown(this.f6072, this.f6065, this.f6066, this.f6070);
        this.f6063.setSelection(-1);
        if ((!this.f6081 || this.f6063.isInTouchMode()) && (c1952 = this.f6063) != null) {
            c1952.setListSelectionHidden(true);
            c1952.requestLayout();
        }
        if (this.f6081) {
            return;
        }
        this.f6078.post(this.f6077);
    }

    @Override // p000.InterfaceC2701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final ListView mo1969() {
        return this.f6063;
    }
}
