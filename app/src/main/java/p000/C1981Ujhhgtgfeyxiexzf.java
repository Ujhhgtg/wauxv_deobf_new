package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;
import me.hd.wauxv.ui.setting.view.ModuleTabItem;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1981Ujhhgtgfeyxiexzf extends HorizontalScrollView {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static final C1440feyxiexzfUjhhgtg f6504feyxiexzfUjhhgtg = new C1440feyxiexzfUjhhgtg(16);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f6505Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f6506Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2080Ujhhgtgfeyxiexzf f6507Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2079feyxiexzfUjhhgtg f6508Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f6509Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f6510Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f6511Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f6512Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f6513Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f6514Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int f6515Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public ColorStateList f6516Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorStateList f6517Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f6518Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public Drawable f6519Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f6520Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final PorterDuff.Mode f6521Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final float f6522Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final float f6523Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f6524Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f6525Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f6526Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f6527feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f6528feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f6529feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f6530feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f6531feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f6532feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f6533feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f6534feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean f6535feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f6536feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f6537feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f6538feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public C0420Ujhhgtgfeyxiexzf f6539feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final TimeInterpolator f6540feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public InterfaceC2076Ujhhgtgfeyxiexzf f6541feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final ArrayList f6542feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public ValueAnimator f6543feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final C1441feyxiexzfUjhhgtg f6544feyxiexzfUjhhgtg;

    public C1981Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.f6505Ujhhgtgfeyxiexzf = -1;
        this.f6506Ujhhgtgfeyxiexzf = new ArrayList();
        this.f6515Ujhhgtgfeyxiexzf = -1;
        this.f6520Ujhhgtgfeyxiexzf = 0;
        this.f6525Ujhhgtgfeyxiexzf = Integer.MAX_VALUE;
        this.f6536feyxiexzfUjhhgtg = -1;
        this.f6542feyxiexzfUjhhgtg = new ArrayList();
        this.f6544feyxiexzfUjhhgtg = new C1441feyxiexzfUjhhgtg(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = new C2079feyxiexzfUjhhgtg(this, context2);
        this.f6508Ujhhgtgfeyxiexzf = c2079feyxiexzfUjhhgtg;
        super.addView(c2079feyxiexzfUjhhgtg, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(context2, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3149feyxiexzfUjhhgtg, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListM5157Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5157Ujhhgtgfeyxiexzf(getBackground());
        if (colorStateListM5157Ujhhgtgfeyxiexzf != null) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf();
            c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateListM5157Ujhhgtgfeyxiexzf);
            c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(context2);
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(getElevation());
            setBackground(c0226Ujhhgtgfeyxiexzf);
        }
        setSelectedTabIndicator(AbstractC3085Ujhhgtgfeyxiexzf.m4562Ujhhgtgfeyxiexzf(context2, typedArrayM2740Ujhhgtgfeyxiexzf, 5));
        setSelectedTabIndicatorColor(typedArrayM2740Ujhhgtgfeyxiexzf.getColor(8, 0));
        c2079feyxiexzfUjhhgtg.m3381Ujhhgtgfeyxiexzf(typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM2740Ujhhgtgfeyxiexzf.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM2740Ujhhgtgfeyxiexzf.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(16, 0);
        this.f6512Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f6511Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f6510Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f6509Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f6509Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(19, dimensionPixelSize);
        this.f6510Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(20, dimensionPixelSize);
        this.f6511Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(18, dimensionPixelSize);
        this.f6512Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(17, dimensionPixelSize);
        if (C3052Ujhhgtgfeyxiexzf.m4525Ujhhgtgfeyxiexzf(context2, R.attr.isMaterial3Theme, false)) {
            this.f6513Ujhhgtgfeyxiexzf = R.attr.textAppearanceTitleSmall;
        } else {
            this.f6513Ujhhgtgfeyxiexzf = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f6514Ujhhgtgfeyxiexzf = resourceId;
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3176Ujhhgtgfeyxiexzf;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f6522Ujhhgtgfeyxiexzf = dimensionPixelSize2;
            this.f6516Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(22)) {
                this.f6515Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(22, resourceId);
            }
            int i2 = this.f6515Ujhhgtgfeyxiexzf;
            if (i2 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListM4561Ujhhgtgfeyxiexzf != null) {
                        this.f6516Ujhhgtgfeyxiexzf = m3318Ujhhgtgfeyxiexzf(this.f6516Ujhhgtgfeyxiexzf.getDefaultColor(), colorStateListM4561Ujhhgtgfeyxiexzf.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM4561Ujhhgtgfeyxiexzf.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(25)) {
                this.f6516Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayM2740Ujhhgtgfeyxiexzf, 25);
            }
            if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(23)) {
                this.f6516Ujhhgtgfeyxiexzf = m3318Ujhhgtgfeyxiexzf(this.f6516Ujhhgtgfeyxiexzf.getDefaultColor(), typedArrayM2740Ujhhgtgfeyxiexzf.getColor(23, 0));
            }
            this.f6517Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayM2740Ujhhgtgfeyxiexzf, 3);
            this.f6521Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArrayM2740Ujhhgtgfeyxiexzf.getInt(4, -1), null);
            this.f6518Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayM2740Ujhhgtgfeyxiexzf, 21);
            this.f6531feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(6, 300);
            this.f6540feyxiexzfUjhhgtg = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf);
            this.f6526Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(14, -1);
            this.f6527feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(13, -1);
            this.f6524Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(0, 0);
            this.f6529feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(1, 0);
            this.f6533feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(15, 1);
            this.f6530feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(2, 0);
            this.f6534feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(12, false);
            this.f6538feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(26, false);
            typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
            Resources resources = getResources();
            this.f6523Ujhhgtgfeyxiexzf = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f6528feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m3322Ujhhgtgfeyxiexzf();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f6506Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = (C2080Ujhhgtgfeyxiexzf) arrayList.get(i);
            if (c2080Ujhhgtgfeyxiexzf != null && c2080Ujhhgtgfeyxiexzf.f6826Ujhhgtgfeyxiexzf != null && !TextUtils.isEmpty(c2080Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf)) {
                return !this.f6534feyxiexzfUjhhgtg ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f6526Ujhhgtgfeyxiexzf;
        if (i != -1) {
            return i;
        }
        int i2 = this.f6533feyxiexzfUjhhgtg;
        if (i2 == 0 || i2 == 2) {
            return this.f6528feyxiexzfUjhhgtg;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f6508Ujhhgtgfeyxiexzf.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
        int childCount = c2079feyxiexzfUjhhgtg.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c2079feyxiexzfUjhhgtg.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof C1980Ujhhgtgfeyxiexzf) {
                        ((C1980Ujhhgtgfeyxiexzf) childAt).m3316Ujhhgtgfeyxiexzf();
                    }
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static ColorStateList m3318Ujhhgtgfeyxiexzf(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m3320Ujhhgtgfeyxiexzf(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = this.f6507Ujhhgtgfeyxiexzf;
        if (c2080Ujhhgtgfeyxiexzf != null) {
            return c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f6506Ujhhgtgfeyxiexzf.size();
    }

    public int getTabGravity() {
        return this.f6530feyxiexzfUjhhgtg;
    }

    public ColorStateList getTabIconTint() {
        return this.f6517Ujhhgtgfeyxiexzf;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f6537feyxiexzfUjhhgtg;
    }

    public int getTabIndicatorGravity() {
        return this.f6532feyxiexzfUjhhgtg;
    }

    public int getTabMaxWidth() {
        return this.f6525Ujhhgtgfeyxiexzf;
    }

    public int getTabMode() {
        return this.f6533feyxiexzfUjhhgtg;
    }

    public ColorStateList getTabRippleColor() {
        return this.f6518Ujhhgtgfeyxiexzf;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f6519Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getTabTextColors() {
        return this.f6516Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0226Ujhhgtgfeyxiexzf) {
            AbstractC3516feyxiexzfUjhhgtg.m5072feyxiexzfUjhhgtg(this, (C0226Ujhhgtgfeyxiexzf) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf;
        Drawable drawable;
        int i = 0;
        while (true) {
            C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
            if (i >= c2079feyxiexzfUjhhgtg.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c2079feyxiexzfUjhhgtg.getChildAt(i);
            if ((childAt instanceof C1980Ujhhgtgfeyxiexzf) && (drawable = (c1980Ujhhgtgfeyxiexzf = (C1980Ujhhgtgfeyxiexzf) childAt).f6501Ujhhgtgfeyxiexzf) != null) {
                drawable.setBounds(c1980Ujhhgtgfeyxiexzf.getLeft(), c1980Ujhhgtgfeyxiexzf.getTop(), c1980Ujhhgtgfeyxiexzf.getRight(), c1980Ujhhgtgfeyxiexzf.getBottom());
                c1980Ujhhgtgfeyxiexzf.f6501Ujhhgtgfeyxiexzf.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2962feyxiexzfUjhhgtg.m4428Ujhhgtgfeyxiexzf(1, getTabCount(), 1).f9271Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM3278Ujhhgtgfeyxiexzf = this.f6527feyxiexzfUjhhgtg;
            if (iM3278Ujhhgtgfeyxiexzf <= 0) {
                iM3278Ujhhgtgfeyxiexzf = (int) (size - AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), 56));
            }
            this.f6525Ujhhgtgfeyxiexzf = iM3278Ujhhgtgfeyxiexzf;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f6533feyxiexzfUjhhgtg;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0226Ujhhgtgfeyxiexzf) {
            ((C0226Ujhhgtgfeyxiexzf) background).m1368Ujhhgtgfeyxiexzf(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.f6534feyxiexzfUjhhgtg == z) {
            return;
        }
        this.f6534feyxiexzfUjhhgtg = z;
        int i = 0;
        while (true) {
            C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
            if (i >= c2079feyxiexzfUjhhgtg.getChildCount()) {
                m3322Ujhhgtgfeyxiexzf();
                return;
            }
            View childAt = c2079feyxiexzfUjhhgtg.getChildAt(i);
            if (childAt instanceof C1980Ujhhgtgfeyxiexzf) {
                C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = (C1980Ujhhgtgfeyxiexzf) childAt;
                c1980Ujhhgtgfeyxiexzf.setOrientation(!c1980Ujhhgtgfeyxiexzf.f6503Ujhhgtgfeyxiexzf.f6534feyxiexzfUjhhgtg ? 1 : 0);
                TextView textView = c1980Ujhhgtgfeyxiexzf.f6499Ujhhgtgfeyxiexzf;
                if (textView == null && c1980Ujhhgtgfeyxiexzf.f6500Ujhhgtgfeyxiexzf == null) {
                    c1980Ujhhgtgfeyxiexzf.m3317Ujhhgtgfeyxiexzf(c1980Ujhhgtgfeyxiexzf.f6494Ujhhgtgfeyxiexzf, c1980Ujhhgtgfeyxiexzf.f6495Ujhhgtgfeyxiexzf, true);
                } else {
                    c1980Ujhhgtgfeyxiexzf.m3317Ujhhgtgfeyxiexzf(textView, c1980Ujhhgtgfeyxiexzf.f6500Ujhhgtgfeyxiexzf, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2077Ujhhgtgfeyxiexzf interfaceC2077Ujhhgtgfeyxiexzf) {
        setOnTabSelectedListener((InterfaceC2076Ujhhgtgfeyxiexzf) interfaceC2077Ujhhgtgfeyxiexzf);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m3324Ujhhgtgfeyxiexzf();
        this.f6543feyxiexzfUjhhgtg.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f6519Ujhhgtgfeyxiexzf = drawableMutate;
        int i = this.f6520Ujhhgtgfeyxiexzf;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f6536feyxiexzfUjhhgtg;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f6519Ujhhgtgfeyxiexzf.getIntrinsicHeight();
        }
        this.f6508Ujhhgtgfeyxiexzf.m3381Ujhhgtgfeyxiexzf(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f6520Ujhhgtgfeyxiexzf = i;
        Drawable drawable = this.f6519Ujhhgtgfeyxiexzf;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        m3329Ujhhgtgfeyxiexzf(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f6532feyxiexzfUjhhgtg != i) {
            this.f6532feyxiexzfUjhhgtg = i;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            this.f6508Ujhhgtgfeyxiexzf.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f6536feyxiexzfUjhhgtg = i;
        this.f6508Ujhhgtgfeyxiexzf.m3381Ujhhgtgfeyxiexzf(i);
    }

    public void setTabGravity(int i) {
        if (this.f6530feyxiexzfUjhhgtg != i) {
            this.f6530feyxiexzfUjhhgtg = i;
            m3322Ujhhgtgfeyxiexzf();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f6517Ujhhgtgfeyxiexzf != colorStateList) {
            this.f6517Ujhhgtgfeyxiexzf = colorStateList;
            ArrayList arrayList = this.f6506Ujhhgtgfeyxiexzf;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = ((C2080Ujhhgtgfeyxiexzf) arrayList.get(i)).f6832Ujhhgtgfeyxiexzf;
                if (c1980Ujhhgtgfeyxiexzf != null) {
                    c1980Ujhhgtgfeyxiexzf.m3314Ujhhgtgfeyxiexzf();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f6537feyxiexzfUjhhgtg = i;
        if (i == 0) {
            this.f6539feyxiexzfUjhhgtg = new C0420Ujhhgtgfeyxiexzf(20);
            return;
        }
        if (i == 1) {
            this.f6539feyxiexzfUjhhgtg = new C3383feyxiexzfUjhhgtg(0);
        } else {
            if (i == 2) {
                this.f6539feyxiexzfUjhhgtg = new C3383feyxiexzfUjhhgtg(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f6535feyxiexzfUjhhgtg = z;
        int i = C2079feyxiexzfUjhhgtg.f6823Ujhhgtgfeyxiexzf;
        C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
        c2079feyxiexzfUjhhgtg.m3380Ujhhgtgfeyxiexzf(c2079feyxiexzfUjhhgtg.f6825Ujhhgtgfeyxiexzf.getSelectedTabPosition());
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        c2079feyxiexzfUjhhgtg.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f6533feyxiexzfUjhhgtg) {
            this.f6533feyxiexzfUjhhgtg = i;
            m3322Ujhhgtgfeyxiexzf();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f6518Ujhhgtgfeyxiexzf == colorStateList) {
            return;
        }
        this.f6518Ujhhgtgfeyxiexzf = colorStateList;
        int i = 0;
        while (true) {
            C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
            if (i >= c2079feyxiexzfUjhhgtg.getChildCount()) {
                return;
            }
            View childAt = c2079feyxiexzfUjhhgtg.getChildAt(i);
            if (childAt instanceof C1980Ujhhgtgfeyxiexzf) {
                Context context = getContext();
                int i2 = C1980Ujhhgtgfeyxiexzf.f6492Ujhhgtgfeyxiexzf;
                ((C1980Ujhhgtgfeyxiexzf) childAt).m3315Ujhhgtgfeyxiexzf(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f6516Ujhhgtgfeyxiexzf != colorStateList) {
            this.f6516Ujhhgtgfeyxiexzf = colorStateList;
            ArrayList arrayList = this.f6506Ujhhgtgfeyxiexzf;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = ((C2080Ujhhgtgfeyxiexzf) arrayList.get(i)).f6832Ujhhgtgfeyxiexzf;
                if (c1980Ujhhgtgfeyxiexzf != null) {
                    c1980Ujhhgtgfeyxiexzf.m3314Ujhhgtgfeyxiexzf();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1380feyxiexzfUjhhgtg abstractC1380feyxiexzfUjhhgtg) {
        m3326Ujhhgtgfeyxiexzf();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f6538feyxiexzfUjhhgtg == z) {
            return;
        }
        this.f6538feyxiexzfUjhhgtg = z;
        int i = 0;
        while (true) {
            C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
            if (i >= c2079feyxiexzfUjhhgtg.getChildCount()) {
                return;
            }
            View childAt = c2079feyxiexzfUjhhgtg.getChildAt(i);
            if (childAt instanceof C1980Ujhhgtgfeyxiexzf) {
                Context context = getContext();
                int i2 = C1980Ujhhgtgfeyxiexzf.f6492Ujhhgtgfeyxiexzf;
                ((C1980Ujhhgtgfeyxiexzf) childAt).m3315Ujhhgtgfeyxiexzf(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(AbstractC2300feyxiexzfUjhhgtg abstractC2300feyxiexzfUjhhgtg) {
        m3326Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3319Ujhhgtgfeyxiexzf(C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf, boolean z) {
        ArrayList arrayList = this.f6506Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        if (c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf = size;
        arrayList.add(size, c2080Ujhhgtgfeyxiexzf);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((C2080Ujhhgtgfeyxiexzf) arrayList.get(i2)).f6829Ujhhgtgfeyxiexzf == this.f6505Ujhhgtgfeyxiexzf) {
                i = i2;
            }
            ((C2080Ujhhgtgfeyxiexzf) arrayList.get(i2)).f6829Ujhhgtgfeyxiexzf = i2;
        }
        this.f6505Ujhhgtgfeyxiexzf = i;
        C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf;
        c1980Ujhhgtgfeyxiexzf.setSelected(false);
        c1980Ujhhgtgfeyxiexzf.setActivated(false);
        int i3 = c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f6533feyxiexzfUjhhgtg == 1 && this.f6530feyxiexzfUjhhgtg == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f6508Ujhhgtgfeyxiexzf.addView(c1980Ujhhgtgfeyxiexzf, i3, layoutParams);
        if (z) {
            C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf;
            if (c1981Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            c1981Ujhhgtgfeyxiexzf.m3327Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3320Ujhhgtgfeyxiexzf(View view) {
        if (!(view instanceof ModuleTabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        ModuleTabItem moduleTabItem = (ModuleTabItem) view;
        C2080Ujhhgtgfeyxiexzf c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf = m3325Ujhhgtgfeyxiexzf();
        CharSequence charSequence = moduleTabItem.f1051Ujhhgtgfeyxiexzf;
        if (charSequence != null) {
            if (TextUtils.isEmpty(c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf) && !TextUtils.isEmpty(charSequence)) {
                c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf.setContentDescription(charSequence);
            }
            c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf = charSequence;
            C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf;
            if (c1980Ujhhgtgfeyxiexzf != null) {
                c1980Ujhhgtgfeyxiexzf.m3314Ujhhgtgfeyxiexzf();
            }
        }
        Drawable drawable = moduleTabItem.f1052Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6826Ujhhgtgfeyxiexzf = drawable;
            C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf;
            if (c1981Ujhhgtgfeyxiexzf.f6530feyxiexzfUjhhgtg == 1 || c1981Ujhhgtgfeyxiexzf.f6533feyxiexzfUjhhgtg == 2) {
                c1981Ujhhgtgfeyxiexzf.m3329Ujhhgtgfeyxiexzf(true);
            }
            C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf2 = c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf;
            if (c1980Ujhhgtgfeyxiexzf2 != null) {
                c1980Ujhhgtgfeyxiexzf2.m3314Ujhhgtgfeyxiexzf();
            }
        }
        int i = moduleTabItem.f1053Ujhhgtgfeyxiexzf;
        if (i != 0) {
            c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6830Ujhhgtgfeyxiexzf = LayoutInflater.from(c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf.getContext()).inflate(i, (ViewGroup) c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf, false);
            C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf3 = c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf;
            if (c1980Ujhhgtgfeyxiexzf3 != null) {
                c1980Ujhhgtgfeyxiexzf3.m3314Ujhhgtgfeyxiexzf();
            }
        }
        if (!TextUtils.isEmpty(moduleTabItem.getContentDescription())) {
            c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf = moduleTabItem.getContentDescription();
            C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf4 = c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf;
            if (c1980Ujhhgtgfeyxiexzf4 != null) {
                c1980Ujhhgtgfeyxiexzf4.m3314Ujhhgtgfeyxiexzf();
            }
        }
        m3319Ujhhgtgfeyxiexzf(c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf, this.f6506Ujhhgtgfeyxiexzf.isEmpty());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3321Ujhhgtgfeyxiexzf(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (isLaidOut()) {
                C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
                int childCount = c2079feyxiexzfUjhhgtg.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c2079feyxiexzfUjhhgtg.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iM3323Ujhhgtgfeyxiexzf = m3323Ujhhgtgfeyxiexzf(i);
                if (scrollX != iM3323Ujhhgtgfeyxiexzf) {
                    m3324Ujhhgtgfeyxiexzf();
                    this.f6543feyxiexzfUjhhgtg.setIntValues(scrollX, iM3323Ujhhgtgfeyxiexzf);
                    this.f6543feyxiexzfUjhhgtg.start();
                }
                ValueAnimator valueAnimator = c2079feyxiexzfUjhhgtg.f6824Ujhhgtgfeyxiexzf;
                if (valueAnimator != null && valueAnimator.isRunning() && c2079feyxiexzfUjhhgtg.f6825Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf != i) {
                    c2079feyxiexzfUjhhgtg.f6824Ujhhgtgfeyxiexzf.cancel();
                }
                c2079feyxiexzfUjhhgtg.m3383Ujhhgtgfeyxiexzf(i, this.f6531feyxiexzfUjhhgtg, true);
                return;
            }
        }
        m3328Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3322Ujhhgtgfeyxiexzf() {
        int i = this.f6533feyxiexzfUjhhgtg;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f6529feyxiexzfUjhhgtg - this.f6509Ujhhgtgfeyxiexzf) : 0;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
        c2079feyxiexzfUjhhgtg.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f6533feyxiexzfUjhhgtg;
        if (i2 == 0) {
            int i3 = this.f6530feyxiexzfUjhhgtg;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                c2079feyxiexzfUjhhgtg.setGravity(1);
            } else if (i3 == 2) {
            }
            c2079feyxiexzfUjhhgtg.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f6530feyxiexzfUjhhgtg == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c2079feyxiexzfUjhhgtg.setGravity(1);
        }
        m3329Ujhhgtgfeyxiexzf(true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m3323Ujhhgtgfeyxiexzf(int i) {
        C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg;
        View childAt;
        int i2 = this.f6533feyxiexzfUjhhgtg;
        if ((i2 != 0 && i2 != 2) || (childAt = (c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < c2079feyxiexzfUjhhgtg.getChildCount() ? c2079feyxiexzfUjhhgtg.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * 0.0f);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3324Ujhhgtgfeyxiexzf() {
        if (this.f6543feyxiexzfUjhhgtg == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f6543feyxiexzfUjhhgtg = valueAnimator;
            valueAnimator.setInterpolator(this.f6540feyxiexzfUjhhgtg);
            this.f6543feyxiexzfUjhhgtg.setDuration(this.f6531feyxiexzfUjhhgtg);
            this.f6543feyxiexzfUjhhgtg.addUpdateListener(new C2478feyxiexzfUjhhgtg(4, this));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2080Ujhhgtgfeyxiexzf m3325Ujhhgtgfeyxiexzf() {
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = (C2080Ujhhgtgfeyxiexzf) f6504feyxiexzfUjhhgtg.mo2933Ujhhgtgfeyxiexzf();
        if (c2080Ujhhgtgfeyxiexzf == null) {
            c2080Ujhhgtgfeyxiexzf = new C2080Ujhhgtgfeyxiexzf();
            c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf = -1;
        }
        c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf = this;
        C1441feyxiexzfUjhhgtg c1441feyxiexzfUjhhgtg = this.f6544feyxiexzfUjhhgtg;
        C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = c1441feyxiexzfUjhhgtg != null ? (C1980Ujhhgtgfeyxiexzf) c1441feyxiexzfUjhhgtg.mo2933Ujhhgtgfeyxiexzf() : null;
        if (c1980Ujhhgtgfeyxiexzf == null) {
            c1980Ujhhgtgfeyxiexzf = new C1980Ujhhgtgfeyxiexzf(this, getContext());
        }
        c1980Ujhhgtgfeyxiexzf.setTab(c2080Ujhhgtgfeyxiexzf);
        c1980Ujhhgtgfeyxiexzf.setFocusable(true);
        c1980Ujhhgtgfeyxiexzf.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c2080Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf)) {
            c1980Ujhhgtgfeyxiexzf.setContentDescription(c2080Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf);
        } else {
            c1980Ujhhgtgfeyxiexzf.setContentDescription(c2080Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf);
        }
        c2080Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf = c1980Ujhhgtgfeyxiexzf;
        return c2080Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3326Ujhhgtgfeyxiexzf() {
        C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
        int childCount = c2079feyxiexzfUjhhgtg.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = (C1980Ujhhgtgfeyxiexzf) c2079feyxiexzfUjhhgtg.getChildAt(childCount);
            c2079feyxiexzfUjhhgtg.removeViewAt(childCount);
            if (c1980Ujhhgtgfeyxiexzf != null) {
                c1980Ujhhgtgfeyxiexzf.setTab(null);
                c1980Ujhhgtgfeyxiexzf.setSelected(false);
                this.f6544feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c1980Ujhhgtgfeyxiexzf);
            }
            requestLayout();
        }
        Iterator it = this.f6506Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = (C2080Ujhhgtgfeyxiexzf) it.next();
            it.remove();
            c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf = null;
            c2080Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf = null;
            c2080Ujhhgtgfeyxiexzf.f6826Ujhhgtgfeyxiexzf = null;
            c2080Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf = null;
            c2080Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf = null;
            c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf = -1;
            c2080Ujhhgtgfeyxiexzf.f6830Ujhhgtgfeyxiexzf = null;
            f6504feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
        }
        this.f6507Ujhhgtgfeyxiexzf = null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3327Ujhhgtgfeyxiexzf(C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf) {
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf2 = this.f6507Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f6542feyxiexzfUjhhgtg;
        if (c2080Ujhhgtgfeyxiexzf2 == c2080Ujhhgtgfeyxiexzf) {
            if (c2080Ujhhgtgfeyxiexzf2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC2076Ujhhgtgfeyxiexzf) arrayList.get(size)).mo3378Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
                }
                m3321Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf);
                return;
            }
            return;
        }
        int i = c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf;
        if ((c2080Ujhhgtgfeyxiexzf2 == null || c2080Ujhhgtgfeyxiexzf2.f6829Ujhhgtgfeyxiexzf == -1) && i != -1) {
            m3328Ujhhgtgfeyxiexzf(i);
        } else {
            m3321Ujhhgtgfeyxiexzf(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        this.f6507Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf;
        if (c2080Ujhhgtgfeyxiexzf2 != null && c2080Ujhhgtgfeyxiexzf2.f6831Ujhhgtgfeyxiexzf != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC2076Ujhhgtgfeyxiexzf) arrayList.get(size2)).getClass();
            }
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            ((InterfaceC2076Ujhhgtgfeyxiexzf) arrayList.get(size3)).mo3379Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3328Ujhhgtgfeyxiexzf(int i) {
        float f = i + 0.0f;
        int iRound = Math.round(f);
        if (iRound >= 0) {
            C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
            if (iRound >= c2079feyxiexzfUjhhgtg.getChildCount()) {
                return;
            }
            c2079feyxiexzfUjhhgtg.f6825Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf = Math.round(f);
            ValueAnimator valueAnimator = c2079feyxiexzfUjhhgtg.f6824Ujhhgtgfeyxiexzf;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c2079feyxiexzfUjhhgtg.f6824Ujhhgtgfeyxiexzf.cancel();
            }
            c2079feyxiexzfUjhhgtg.m3382Ujhhgtgfeyxiexzf(c2079feyxiexzfUjhhgtg.getChildAt(i), c2079feyxiexzfUjhhgtg.getChildAt(i + 1), 0.0f);
            ValueAnimator valueAnimator2 = this.f6543feyxiexzfUjhhgtg;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f6543feyxiexzfUjhhgtg.cancel();
            }
            int iM3323Ujhhgtgfeyxiexzf = m3323Ujhhgtgfeyxiexzf(i);
            int scrollX = getScrollX();
            if ((i >= getSelectedTabPosition() || iM3323Ujhhgtgfeyxiexzf < scrollX) && (i <= getSelectedTabPosition() || iM3323Ujhhgtgfeyxiexzf > scrollX)) {
                getSelectedTabPosition();
            }
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (getLayoutDirection() == 1 && ((i >= getSelectedTabPosition() || iM3323Ujhhgtgfeyxiexzf > scrollX) && (i <= getSelectedTabPosition() || iM3323Ujhhgtgfeyxiexzf < scrollX))) {
                getSelectedTabPosition();
            }
            if (i < 0) {
                iM3323Ujhhgtgfeyxiexzf = 0;
            }
            scrollTo(iM3323Ujhhgtgfeyxiexzf, 0);
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3329Ujhhgtgfeyxiexzf(boolean z) {
        int i = 0;
        while (true) {
            C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg = this.f6508Ujhhgtgfeyxiexzf;
            if (i >= c2079feyxiexzfUjhhgtg.getChildCount()) {
                return;
            }
            View childAt = c2079feyxiexzfUjhhgtg.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f6533feyxiexzfUjhhgtg == 1 && this.f6530feyxiexzfUjhhgtg == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        m3320Ujhhgtgfeyxiexzf(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2076Ujhhgtgfeyxiexzf interfaceC2076Ujhhgtgfeyxiexzf) {
        InterfaceC2076Ujhhgtgfeyxiexzf interfaceC2076Ujhhgtgfeyxiexzf2 = this.f6541feyxiexzfUjhhgtg;
        ArrayList arrayList = this.f6542feyxiexzfUjhhgtg;
        if (interfaceC2076Ujhhgtgfeyxiexzf2 != null) {
            arrayList.remove(interfaceC2076Ujhhgtgfeyxiexzf2);
        }
        this.f6541feyxiexzfUjhhgtg = interfaceC2076Ujhhgtgfeyxiexzf;
        if (interfaceC2076Ujhhgtgfeyxiexzf == null || arrayList.contains(interfaceC2076Ujhhgtgfeyxiexzf)) {
            return;
        }
        arrayList.add(interfaceC2076Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3320Ujhhgtgfeyxiexzf(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3320Ujhhgtgfeyxiexzf(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
