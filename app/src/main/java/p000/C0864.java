package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᤞᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0864 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC0861 f3277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f3280;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3281;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f3282;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f3283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3284;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f3285;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f3286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public View f3287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public View f3288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f3289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f3290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Rect f3291;

    public C0864() {
        super(-2, -2);
        this.f3278 = false;
        this.f3279 = 0;
        this.f3280 = 0;
        this.f3281 = -1;
        this.f3282 = -1;
        this.f3283 = 0;
        this.f3284 = 0;
        this.f3291 = new Rect();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m2384(int i) {
        if (i == 0) {
            return this.f3289;
        }
        if (i != 1) {
            return false;
        }
        return this.f3290;
    }

    public C0864(Context context, AttributeSet attributeSet) {
        AbstractC0861 abstractC0861;
        super(context, attributeSet);
        this.f3278 = false;
        this.f3279 = 0;
        this.f3280 = 0;
        this.f3281 = -1;
        this.f3282 = -1;
        this.f3283 = 0;
        this.f3284 = 0;
        this.f3291 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2462.f7819);
        this.f3279 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f3282 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f3280 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f3281 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f3283 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f3284 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f3278 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f214;
            if (TextUtils.isEmpty(string)) {
                abstractC0861 = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f214;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f216;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f215);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0861 = (AbstractC0861) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC2784.m4757("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f3277 = abstractC0861;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0861 abstractC0862 = this.f3277;
        if (abstractC0862 != null) {
            abstractC0862.mo638(this);
        }
    }

    public C0864(C0864 c0864) {
        super((ViewGroup.MarginLayoutParams) c0864);
        this.f3278 = false;
        this.f3279 = 0;
        this.f3280 = 0;
        this.f3281 = -1;
        this.f3282 = -1;
        this.f3283 = 0;
        this.f3284 = 0;
        this.f3291 = new Rect();
    }

    public C0864(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3278 = false;
        this.f3279 = 0;
        this.f3280 = 0;
        this.f3281 = -1;
        this.f3282 = -1;
        this.f3283 = 0;
        this.f3284 = 0;
        this.f3291 = new Rect();
    }

    public C0864(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3278 = false;
        this.f3279 = 0;
        this.f3280 = 0;
        this.f3281 = -1;
        this.f3282 = -1;
        this.f3283 = 0;
        this.f3284 = 0;
        this.f3291 = new Rect();
    }
}
