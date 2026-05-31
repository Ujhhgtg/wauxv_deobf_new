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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲁᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0863 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC0860 f3284;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3285;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f3287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f3289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f3290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f3292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f3293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public View f3294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public View f3295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f3296;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f3297;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Rect f3298;

    public C0863() {
        super(-2, -2);
        this.f3285 = false;
        this.f3286 = 0;
        this.f3287 = 0;
        this.f3288 = -1;
        this.f3289 = -1;
        this.f3290 = 0;
        this.f3291 = 0;
        this.f3298 = new Rect();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m2501(int i) {
        if (i == 0) {
            return this.f3296;
        }
        if (i != 1) {
            return false;
        }
        return this.f3297;
    }

    public C0863(Context context, AttributeSet attributeSet) {
        AbstractC0860 abstractC0860;
        super(context, attributeSet);
        this.f3285 = false;
        this.f3286 = 0;
        this.f3287 = 0;
        this.f3288 = -1;
        this.f3289 = -1;
        this.f3290 = 0;
        this.f3291 = 0;
        this.f3298 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2516.f7965);
        this.f3286 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f3289 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f3287 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f3288 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f3290 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f3291 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f3285 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f214;
            if (TextUtils.isEmpty(string)) {
                abstractC0860 = null;
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
                    abstractC0860 = (AbstractC0860) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC2844.m4790("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f3284 = abstractC0860;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0860 abstractC0861 = this.f3284;
        if (abstractC0861 != null) {
            abstractC0861.mo781(this);
        }
    }

    public C0863(C0863 c0863) {
        super((ViewGroup.MarginLayoutParams) c0863);
        this.f3285 = false;
        this.f3286 = 0;
        this.f3287 = 0;
        this.f3288 = -1;
        this.f3289 = -1;
        this.f3290 = 0;
        this.f3291 = 0;
        this.f3298 = new Rect();
    }

    public C0863(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3285 = false;
        this.f3286 = 0;
        this.f3287 = 0;
        this.f3288 = -1;
        this.f3289 = -1;
        this.f3290 = 0;
        this.f3291 = 0;
        this.f3298 = new Rect();
    }

    public C0863(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3285 = false;
        this.f3286 = 0;
        this.f3287 = 0;
        this.f3288 = -1;
        this.f3289 = -1;
        this.f3290 = 0;
        this.f3291 = 0;
        this.f3298 = new Rect();
    }
}
