package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0780;
import p000.AbstractC0781;
import p000.AbstractC0794;
import p000.AbstractC1471;
import p000.AbstractC1544;
import p000.AbstractC2515;
import p000.AbstractC3700;
import p000.C0253;
import p000.C0342;
import p000.C0519;
import p000.C0563;
import p000.C0782;
import p000.C0783;
import p000.C0784;
import p000.C0785;
import p000.C0791;
import p000.C0792;
import p000.C0793;
import p000.C1016;
import p000.C1374;
import p000.C1517;
import p000.C1518;
import p000.C1519;
import p000.C1575;
import p000.C1814;
import p000.C3607;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final SparseArray f197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0793 f199;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f202;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f204;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0791 f206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0519 f207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public HashMap f209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final SparseArray f210;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C0783 f211;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f212;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f213;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197 = new SparseArray();
        this.f198 = new ArrayList(4);
        this.f199 = new C0793();
        this.f200 = 0;
        this.f201 = 0;
        this.f202 = Integer.MAX_VALUE;
        this.f203 = Integer.MAX_VALUE;
        this.f204 = true;
        this.f205 = 257;
        this.f206 = null;
        this.f207 = null;
        this.f208 = -1;
        this.f209 = new HashMap();
        this.f210 = new SparseArray();
        this.f211 = new C0783(this, this);
        this.f212 = 0;
        this.f213 = 0;
        m55(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0782 m53() {
        C0782 c0782 = new C0782(-2, -2);
        c0782.f2906 = -1;
        c0782.f2907 = -1;
        c0782.f2908 = -1.0f;
        c0782.f2909 = -1;
        c0782.f2910 = -1;
        c0782.f2911 = -1;
        c0782.f2912 = -1;
        c0782.f2913 = -1;
        c0782.f2914 = -1;
        c0782.f2915 = -1;
        c0782.f2916 = -1;
        c0782.f2917 = -1;
        c0782.f2918 = -1;
        c0782.f2919 = 0;
        c0782.f2920 = 0.0f;
        c0782.f2921 = -1;
        c0782.f2922 = -1;
        c0782.f2923 = -1;
        c0782.f2924 = -1;
        c0782.f2925 = -1;
        c0782.f2926 = -1;
        c0782.f2927 = -1;
        c0782.f2928 = -1;
        c0782.f2929 = -1;
        c0782.f2930 = -1;
        c0782.f2931 = 0.5f;
        c0782.f2932 = 0.5f;
        c0782.f2933 = null;
        c0782.f2934 = 1;
        c0782.f2935 = -1.0f;
        c0782.f2936 = -1.0f;
        c0782.f2937 = 0;
        c0782.f2938 = 0;
        c0782.f2939 = 0;
        c0782.f2940 = 0;
        c0782.f2941 = 0;
        c0782.f2942 = 0;
        c0782.f2943 = 0;
        c0782.f2944 = 0;
        c0782.f2945 = 1.0f;
        c0782.f2946 = 1.0f;
        c0782.f2947 = -1;
        c0782.f2948 = -1;
        c0782.f2949 = -1;
        c0782.f2950 = false;
        c0782.f2951 = false;
        c0782.f2952 = null;
        c0782.f2953 = true;
        c0782.f2954 = true;
        c0782.f2955 = false;
        c0782.f2956 = false;
        c0782.f2957 = false;
        c0782.f2958 = -1;
        c0782.f2959 = -1;
        c0782.f2960 = -1;
        c0782.f2961 = -1;
        c0782.f2962 = -1;
        c0782.f2963 = -1;
        c0782.f2964 = 0.5f;
        c0782.f2968 = new C0792();
        return c0782;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0782;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f198;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0780) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f204 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m53();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        C0782 c0782 = new C0782(context, attributeSet);
        c0782.f2906 = -1;
        c0782.f2907 = -1;
        c0782.f2908 = -1.0f;
        c0782.f2909 = -1;
        c0782.f2910 = -1;
        c0782.f2911 = -1;
        c0782.f2912 = -1;
        c0782.f2913 = -1;
        c0782.f2914 = -1;
        c0782.f2915 = -1;
        c0782.f2916 = -1;
        c0782.f2917 = -1;
        c0782.f2918 = -1;
        c0782.f2919 = 0;
        c0782.f2920 = 0.0f;
        c0782.f2921 = -1;
        c0782.f2922 = -1;
        c0782.f2923 = -1;
        c0782.f2924 = -1;
        c0782.f2925 = -1;
        c0782.f2926 = -1;
        c0782.f2927 = -1;
        c0782.f2928 = -1;
        c0782.f2929 = -1;
        c0782.f2930 = -1;
        c0782.f2931 = 0.5f;
        c0782.f2932 = 0.5f;
        c0782.f2933 = null;
        c0782.f2934 = 1;
        c0782.f2935 = -1.0f;
        c0782.f2936 = -1.0f;
        c0782.f2937 = 0;
        c0782.f2938 = 0;
        c0782.f2939 = 0;
        c0782.f2940 = 0;
        c0782.f2941 = 0;
        c0782.f2942 = 0;
        c0782.f2943 = 0;
        c0782.f2944 = 0;
        c0782.f2945 = 1.0f;
        c0782.f2946 = 1.0f;
        c0782.f2947 = -1;
        c0782.f2948 = -1;
        c0782.f2949 = -1;
        c0782.f2950 = false;
        c0782.f2951 = false;
        c0782.f2952 = null;
        c0782.f2953 = true;
        c0782.f2954 = true;
        c0782.f2955 = false;
        c0782.f2956 = false;
        c0782.f2957 = false;
        c0782.f2958 = -1;
        c0782.f2959 = -1;
        c0782.f2960 = -1;
        c0782.f2961 = -1;
        c0782.f2962 = -1;
        c0782.f2963 = -1;
        c0782.f2964 = 0.5f;
        c0782.f2968 = new C0792();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2515.f7956);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC0781.f2905.get(index);
            switch (i3) {
                case 1:
                    c0782.f2949 = typedArrayObtainStyledAttributes.getInt(index, c0782.f2949);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2918);
                    c0782.f2918 = resourceId;
                    if (resourceId == -1) {
                        c0782.f2918 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0782.f2919 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2919);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0782.f2920) % 360.0f;
                    c0782.f2920 = f;
                    if (f < 0.0f) {
                        c0782.f2920 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0782.f2906 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0782.f2906);
                    break;
                case 6:
                    c0782.f2907 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0782.f2907);
                    break;
                case 7:
                    c0782.f2908 = typedArrayObtainStyledAttributes.getFloat(index, c0782.f2908);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2909);
                    c0782.f2909 = resourceId2;
                    if (resourceId2 == -1) {
                        c0782.f2909 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2910);
                    c0782.f2910 = resourceId3;
                    if (resourceId3 == -1) {
                        c0782.f2910 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2911);
                    c0782.f2911 = resourceId4;
                    if (resourceId4 == -1) {
                        c0782.f2911 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2912);
                    c0782.f2912 = resourceId5;
                    if (resourceId5 == -1) {
                        c0782.f2912 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2913);
                    c0782.f2913 = resourceId6;
                    if (resourceId6 == -1) {
                        c0782.f2913 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2914);
                    c0782.f2914 = resourceId7;
                    if (resourceId7 == -1) {
                        c0782.f2914 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2915);
                    c0782.f2915 = resourceId8;
                    if (resourceId8 == -1) {
                        c0782.f2915 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2916);
                    c0782.f2916 = resourceId9;
                    if (resourceId9 == -1) {
                        c0782.f2916 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2917);
                    c0782.f2917 = resourceId10;
                    if (resourceId10 == -1) {
                        c0782.f2917 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2921);
                    c0782.f2921 = resourceId11;
                    if (resourceId11 == -1) {
                        c0782.f2921 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2922);
                    c0782.f2922 = resourceId12;
                    if (resourceId12 == -1) {
                        c0782.f2922 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2923);
                    c0782.f2923 = resourceId13;
                    if (resourceId13 == -1) {
                        c0782.f2923 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0782.f2924);
                    c0782.f2924 = resourceId14;
                    if (resourceId14 == -1) {
                        c0782.f2924 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.ILOAD /* 21 */:
                    c0782.f2925 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2925);
                    break;
                case Opcodes.LLOAD /* 22 */:
                    c0782.f2926 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2926);
                    break;
                case Opcodes.FLOAD /* 23 */:
                    c0782.f2927 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2927);
                    break;
                case Opcodes.DLOAD /* 24 */:
                    c0782.f2928 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2928);
                    break;
                case Opcodes.ALOAD /* 25 */:
                    c0782.f2929 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2929);
                    break;
                case 26:
                    c0782.f2930 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2930);
                    break;
                case 27:
                    c0782.f2950 = typedArrayObtainStyledAttributes.getBoolean(index, c0782.f2950);
                    break;
                case 28:
                    c0782.f2951 = typedArrayObtainStyledAttributes.getBoolean(index, c0782.f2951);
                    break;
                case 29:
                    c0782.f2931 = typedArrayObtainStyledAttributes.getFloat(index, c0782.f2931);
                    break;
                case 30:
                    c0782.f2932 = typedArrayObtainStyledAttributes.getFloat(index, c0782.f2932);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0782.f2939 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0782.f2940 = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c0782.f2941 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2941);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0782.f2941) == -2) {
                            c0782.f2941 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c0782.f2943 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2943);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0782.f2943) == -2) {
                            c0782.f2943 = -2;
                        }
                    }
                    break;
                case 35:
                    c0782.f2945 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0782.f2945));
                    c0782.f2939 = 2;
                    break;
                case 36:
                    try {
                        c0782.f2942 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2942);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0782.f2942) == -2) {
                            c0782.f2942 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0782.f2944 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0782.f2944);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0782.f2944) == -2) {
                            c0782.f2944 = -2;
                        }
                    }
                    break;
                case 38:
                    c0782.f2946 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0782.f2946));
                    c0782.f2940 = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0782.f2933 = string;
                            c0782.f2934 = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c0782.f2933.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c0782.f2933.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c0782.f2934 = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c0782.f2934 = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c0782.f2933.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c0782.f2933.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = c0782.f2933.substring(i, iIndexOf2);
                                    String strSubstring4 = c0782.f2933.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring3);
                                            float f3 = Float.parseFloat(strSubstring4);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (c0782.f2934 == 1) {
                                                    Math.abs(f3 / f2);
                                                } else {
                                                    Math.abs(f2 / f3);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            c0782.f2935 = typedArrayObtainStyledAttributes.getFloat(index, c0782.f2935);
                            break;
                        case Opcodes.IALOAD /* 46 */:
                            c0782.f2936 = typedArrayObtainStyledAttributes.getFloat(index, c0782.f2936);
                            break;
                        case 47:
                            c0782.f2937 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0782.f2938 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0782.f2947 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0782.f2947);
                            break;
                        case Opcodes.AALOAD /* 50 */:
                            c0782.f2948 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0782.f2948);
                            break;
                        case Opcodes.BALOAD /* 51 */:
                            c0782.f2952 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0782.m2406();
        return c0782;
    }

    public int getMaxHeight() {
        return this.f203;
    }

    public int getMaxWidth() {
        return this.f202;
    }

    public int getMinHeight() {
        return this.f201;
    }

    public int getMinWidth() {
        return this.f200;
    }

    public int getOptimizationLevel() {
        return this.f199.f3154;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0782 c0782 = (C0782) childAt.getLayoutParams();
            C0792 c0792 = c0782.f2968;
            if (childAt.getVisibility() != 8 || c0782.f2956 || c0782.f2957 || zIsInEditMode) {
                int iM2432 = c0792.m2432();
                int iM2433 = c0792.m2433();
                childAt.layout(iM2432, iM2433, c0792.m2431() + iM2432, c0792.m2428() + iM2433);
            }
        }
        ArrayList arrayList = this.f198;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0780) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0225  */
    /* JADX WARN: Code duplicated, block: B:144:0x0281  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:208:0x040c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0414  */
    /* JADX WARN: Code duplicated, block: B:213:0x041d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0426  */
    /* JADX WARN: Code duplicated, block: B:222:0x0441  */
    /* JADX WARN: Code duplicated, block: B:224:0x0451 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x048e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0496  */
    /* JADX WARN: Code duplicated, block: B:306:0x05b8  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        C0782 c0782;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C0792 c0792;
        int i7;
        int i8;
        C0792 c0793;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C0792 c0794;
        int i14;
        int i15;
        C0792 c0795;
        int i16;
        float f2;
        float f3;
        View view;
        C0792 c0796;
        C0792 c0797;
        C0792 c0798;
        int i17;
        C0792 c0799;
        int i18;
        int i19;
        int i20;
        float fAbs;
        int i21;
        float f4;
        byte b;
        boolean z3;
        ArrayList arrayList;
        String str;
        int iM2403;
        boolean z4;
        C0792 c07910;
        boolean z5 = true;
        int i22 = 0;
        if (!this.f204) {
            int childCount = getChildCount();
            for (int i23 = 0; i23 < childCount; i23++) {
                if (getChildAt(i23).isLayoutRequested()) {
                    this.f204 = true;
                    break;
                }
            }
        }
        boolean z6 = this.f204;
        C0793 c07911 = this.f199;
        if (!z6) {
            int i24 = this.f212;
            if (i24 == i && this.f213 == i2) {
                m57(i, i2, c07911.m2431(), c07911.m2428(), c07911.f3155, c07911.f3156);
                return;
            }
            if (i24 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f213) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= c07911.m2428()) {
                this.f212 = i;
                this.f213 = i2;
                m57(i, i2, c07911.m2431(), c07911.m2428(), c07911.f3155, c07911.f3156);
                return;
            }
        }
        this.f212 = i;
        this.f213 = i2;
        c07911.f3146 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        if (this.f204) {
            this.f204 = false;
            int childCount2 = getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i25).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i25++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i26 = 0; i26 < childCount3; i26++) {
                    C0792 c0792M54 = m54(getChildAt(i26));
                    if (c0792M54 != null) {
                        c0792M54.mo2440();
                    }
                }
                SparseArray sparseArray = this.f197;
                if (zIsInEditMode) {
                    int i27 = 0;
                    while (i27 < childCount3) {
                        View childAt = getChildAt(i27);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                z4 = z5;
                                try {
                                    if (this.f209 == null) {
                                        this.f209 = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    this.f209.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                z4 = z5;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                c07910 = viewFindViewById == this ? c07911 : viewFindViewById == null ? null : ((C0782) viewFindViewById.getLayoutParams()).f2968;
                            }
                            c07910.f3133 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            z4 = z5;
                        }
                        i27++;
                        z5 = z4;
                    }
                }
                boolean z7 = z5;
                if (this.f208 != -1) {
                    for (int i28 = 0; i28 < childCount3; i28++) {
                        getChildAt(i28).getId();
                    }
                }
                C0791 c0791 = this.f206;
                if (c0791 != null) {
                    c0791.m2417(this);
                }
                c07911.f3142.clear();
                ArrayList arrayList2 = this.f198;
                int size = arrayList2.size();
                if (size > 0) {
                    int i29 = 0;
                    while (i29 < size) {
                        AbstractC0780 abstractC0780 = (AbstractC0780) arrayList2.get(i29);
                        HashMap map = abstractC0780.f2904;
                        if (abstractC0780.isInEditMode()) {
                            abstractC0780.setIds(abstractC0780.f2902);
                        }
                        AbstractC1544 abstractC1544 = abstractC0780.f2901;
                        if (abstractC1544 == null) {
                            z3 = z;
                            arrayList = arrayList2;
                        } else {
                            abstractC1544.f5399 = i22;
                            Arrays.fill(abstractC1544.f5398, (Object) null);
                            int i30 = i22;
                            while (i30 < abstractC0780.f2899) {
                                int i31 = abstractC0780.f2898[i30];
                                View view2 = (View) sparseArray.get(i31);
                                if (view2 == null && (iM2403 = abstractC0780.m2403(this, (str = (String) map.get(Integer.valueOf(i31))))) != 0) {
                                    abstractC0780.f2898[i30] = iM2403;
                                    map.put(Integer.valueOf(iM2403), str);
                                    view2 = (View) sparseArray.get(iM2403);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    AbstractC1544 abstractC1545 = abstractC0780.f2901;
                                    C0792 c0792M55 = m54(view3);
                                    abstractC1545.getClass();
                                    if (c0792M55 != abstractC1545 && c0792M55 != null) {
                                        int i32 = abstractC1545.f5399 + 1;
                                        C0792[] c0792Arr = abstractC1545.f5398;
                                        if (i32 > c0792Arr.length) {
                                            abstractC1545.f5398 = (C0792[]) Arrays.copyOf(c0792Arr, c0792Arr.length * 2);
                                        }
                                        C0792[] c0792Arr2 = abstractC1545.f5398;
                                        int i33 = abstractC1545.f5399;
                                        c0792Arr2[i33] = c0792M55;
                                        abstractC1545.f5399 = i33 + 1;
                                    }
                                }
                                i30++;
                                z = z;
                                arrayList2 = arrayList2;
                            }
                            z3 = z;
                            arrayList = arrayList2;
                            abstractC0780.f2901.mo3194();
                        }
                        i29++;
                        z = z3;
                        arrayList2 = arrayList;
                        i22 = 0;
                    }
                }
                z2 = z;
                int i34 = 2;
                for (int i35 = 0; i35 < childCount3; i35++) {
                    getChildAt(i35);
                }
                SparseArray sparseArray2 = this.f210;
                sparseArray2.clear();
                sparseArray2.put(0, c07911);
                sparseArray2.put(getId(), c07911);
                for (int i36 = 0; i36 < childCount3; i36++) {
                    View childAt2 = getChildAt(i36);
                    sparseArray2.put(childAt2.getId(), m54(childAt2));
                }
                int i37 = 0;
                while (i37 < childCount3) {
                    View childAt3 = getChildAt(i37);
                    C0792 c0792M56 = m54(childAt3);
                    if (c0792M56 != null) {
                        C0782 c0783 = (C0782) childAt3.getLayoutParams();
                        c07911.f3142.add(c0792M56);
                        C0792 c07912 = c0792M56.f3119;
                        if (c07912 != null) {
                            ((C0793) c07912).f3142.remove(c0792M56);
                            c0792M56.mo2440();
                        }
                        c0792M56.f3119 = c07911;
                        c0783.m2406();
                        c0792M56.f3132 = childAt3.getVisibility();
                        c0792M56.f3131 = childAt3;
                        if (childAt3 instanceof AbstractC0780) {
                            ((AbstractC0780) childAt3).mo51(c0792M56, c07911.f3146);
                        }
                        if (c0783.f2956) {
                            C1518 c1518 = (C1518) c0792M56;
                            int i38 = c0783.f2965;
                            int i39 = c0783.f2966;
                            float f5 = c0783.f2967;
                            if (f5 == -1.0f) {
                                b = -1;
                                if (i38 != -1) {
                                    if (i38 > -1) {
                                        c1518.f5348 = -1.0f;
                                        c1518.f5349 = i38;
                                        c1518.f5350 = -1;
                                    }
                                } else if (i39 != -1 && i39 > -1) {
                                    c1518.f5348 = -1.0f;
                                    c1518.f5349 = -1;
                                    c1518.f5350 = i39;
                                }
                            } else if (f5 > -1.0f) {
                                c1518.f5348 = f5;
                                b = -1;
                                c1518.f5349 = -1;
                                c1518.f5350 = -1;
                            }
                        } else {
                            int i40 = c0783.f2958;
                            int i41 = c0783.f2959;
                            int i42 = c0783.f2960;
                            int i43 = c0783.f2961;
                            int i44 = c0783.f2962;
                            int i45 = c0783.f2963;
                            float f6 = c0783.f2964;
                            i37 = i37;
                            int i46 = c0783.f2918;
                            if (i46 != -1) {
                                C0792 c07913 = (C0792) sparseArray2.get(i46);
                                if (c07913 != null) {
                                    float f7 = c0783.f2920;
                                    f4 = 0.0f;
                                    c0792M56.m2435(7, 7, c0783.f2919, 0, c07913);
                                    c0792M56.f3103 = f7;
                                } else {
                                    f4 = 0.0f;
                                }
                                c0782 = c0783;
                                zIsInEditMode = zIsInEditMode;
                                childCount3 = childCount3;
                                i13 = 5;
                                i12 = 3;
                                f2 = f4;
                            } else {
                                c0782 = c0783;
                                if (i40 != -1) {
                                    C0792 c07914 = (C0792) sparseArray2.get(i40);
                                    if (c07914 != null) {
                                        i4 = i42;
                                        zIsInEditMode = zIsInEditMode;
                                        i6 = i43;
                                        i3 = -1;
                                        i5 = 2;
                                        childCount3 = childCount3;
                                        f = f6;
                                        c0792M56.m2435(2, 2, ((ViewGroup.MarginLayoutParams) c0782).leftMargin, i44, c07914);
                                    } else {
                                        zIsInEditMode = zIsInEditMode;
                                        i3 = -1;
                                        i4 = i42;
                                        i6 = i43;
                                        i5 = 2;
                                        childCount3 = childCount3;
                                        f = f6;
                                    }
                                } else {
                                    i3 = -1;
                                    i4 = i42;
                                    i5 = 2;
                                    zIsInEditMode = zIsInEditMode;
                                    childCount3 = childCount3;
                                    i6 = i43;
                                    f = f6;
                                    if (i41 != -1 && (c0792 = (C0792) sparseArray2.get(i41)) != null) {
                                        c0792M56.m2435(2, 4, ((ViewGroup.MarginLayoutParams) c0782).leftMargin, i44, c0792);
                                        i7 = 2;
                                        i8 = 4;
                                    }
                                    if (i4 != i3) {
                                        c0799 = (C0792) sparseArray2.get(i4);
                                        if (c0799 != null) {
                                            c0792M56.m2435(i8, i7, ((ViewGroup.MarginLayoutParams) c0782).rightMargin, i45, c0799);
                                        }
                                    } else if (i6 != i3 && (c0793 = (C0792) sparseArray2.get(i6)) != null) {
                                        c0792M56.m2435(i8, i8, ((ViewGroup.MarginLayoutParams) c0782).rightMargin, i45, c0793);
                                    }
                                    i9 = c0782.f2913;
                                    if (i9 != i3) {
                                        c0798 = (C0792) sparseArray2.get(i9);
                                        if (c0798 != null) {
                                            i17 = 3;
                                            c0792M56.m2435(3, 3, ((ViewGroup.MarginLayoutParams) c0782).topMargin, c0782.f2926, c0798);
                                        } else {
                                            i17 = 3;
                                        }
                                        i12 = i17;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = c0782.f2914;
                                        if (i10 != -1 || (c0794 = (C0792) sparseArray2.get(i10)) == null) {
                                            i11 = -1;
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            i11 = -1;
                                            c0792M56.m2435(3, 5, ((ViewGroup.MarginLayoutParams) c0782).topMargin, c0782.f2926, c0794);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = c0782.f2915;
                                    if (i14 != i11) {
                                        c0797 = (C0792) sparseArray2.get(i14);
                                        if (c0797 != null) {
                                            c0792M56.m2435(i13, i12, ((ViewGroup.MarginLayoutParams) c0782).bottomMargin, c0782.f2928, c0797);
                                        }
                                    } else {
                                        i15 = c0782.f2916;
                                        if (i15 == i11 && (c0795 = (C0792) sparseArray2.get(i15)) != null) {
                                            c0792M56.m2435(i13, i13, ((ViewGroup.MarginLayoutParams) c0782).bottomMargin, c0782.f2928, c0795);
                                        }
                                        i16 = c0782.f2917;
                                        if (i16 != -1) {
                                            view = (View) sparseArray.get(i16);
                                            c0796 = (C0792) sparseArray2.get(c0782.f2917);
                                            if (c0796 != null && view != null && (view.getLayoutParams() instanceof C0782)) {
                                                C0782 c0784 = (C0782) view.getLayoutParams();
                                                boolean z8 = z7;
                                                c0782.f2955 = z8;
                                                c0784.f2955 = z8;
                                                c0792M56.mo2426(6).m2386(c0796.mo2426(6), 0, -1, z8);
                                                c0792M56.f3104 = z8;
                                                c0784.f2968.f3104 = z8;
                                                c0792M56.mo2426(i12).m2394();
                                                c0792M56.mo2426(i13).m2394();
                                            }
                                        }
                                        f2 = 0.0f;
                                        if (f >= 0.0f) {
                                            c0792M56.f3129 = f;
                                        }
                                        f3 = c0782.f2932;
                                        if (f3 >= 0.0f) {
                                            c0792M56.f3130 = f3;
                                        }
                                    }
                                    i16 = c0782.f2917;
                                    if (i16 != -1) {
                                        view = (View) sparseArray.get(i16);
                                        c0796 = (C0792) sparseArray2.get(c0782.f2917);
                                        if (c0796 != null) {
                                            C0782 c0785 = (C0782) view.getLayoutParams();
                                            boolean z9 = z7;
                                            c0782.f2955 = z9;
                                            c0785.f2955 = z9;
                                            c0792M56.mo2426(6).m2386(c0796.mo2426(6), 0, -1, z9);
                                            c0792M56.f3104 = z9;
                                            c0785.f2968.f3104 = z9;
                                            c0792M56.mo2426(i12).m2394();
                                            c0792M56.mo2426(i13).m2394();
                                        }
                                    }
                                    f2 = 0.0f;
                                    if (f >= 0.0f) {
                                        c0792M56.f3129 = f;
                                    }
                                    f3 = c0782.f2932;
                                    if (f3 >= 0.0f) {
                                        c0792M56.f3130 = f3;
                                    }
                                }
                                i7 = i5;
                                i8 = 4;
                                if (i4 != i3) {
                                    c0799 = (C0792) sparseArray2.get(i4);
                                    if (c0799 != null) {
                                        c0792M56.m2435(i8, i7, ((ViewGroup.MarginLayoutParams) c0782).rightMargin, i45, c0799);
                                    }
                                } else if (i6 != i3) {
                                    c0792M56.m2435(i8, i8, ((ViewGroup.MarginLayoutParams) c0782).rightMargin, i45, c0793);
                                }
                                i9 = c0782.f2913;
                                if (i9 != i3) {
                                    c0798 = (C0792) sparseArray2.get(i9);
                                    if (c0798 != null) {
                                        i17 = 3;
                                        c0792M56.m2435(3, 3, ((ViewGroup.MarginLayoutParams) c0782).topMargin, c0782.f2926, c0798);
                                    } else {
                                        i17 = 3;
                                    }
                                    i12 = i17;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = c0782.f2914;
                                    if (i10 != -1) {
                                        i11 = -1;
                                        i12 = 3;
                                        i13 = 5;
                                    } else {
                                        i11 = -1;
                                        i12 = 3;
                                        i13 = 5;
                                    }
                                }
                                i14 = c0782.f2915;
                                if (i14 != i11) {
                                    c0797 = (C0792) sparseArray2.get(i14);
                                    if (c0797 != null) {
                                        c0792M56.m2435(i13, i12, ((ViewGroup.MarginLayoutParams) c0782).bottomMargin, c0782.f2928, c0797);
                                    }
                                } else {
                                    i15 = c0782.f2916;
                                    if (i15 == i11) {
                                    }
                                    i16 = c0782.f2917;
                                    if (i16 != -1) {
                                        view = (View) sparseArray.get(i16);
                                        c0796 = (C0792) sparseArray2.get(c0782.f2917);
                                        if (c0796 != null) {
                                            C0782 c0786 = (C0782) view.getLayoutParams();
                                            boolean z10 = z7;
                                            c0782.f2955 = z10;
                                            c0786.f2955 = z10;
                                            c0792M56.mo2426(6).m2386(c0796.mo2426(6), 0, -1, z10);
                                            c0792M56.f3104 = z10;
                                            c0786.f2968.f3104 = z10;
                                            c0792M56.mo2426(i12).m2394();
                                            c0792M56.mo2426(i13).m2394();
                                        }
                                    }
                                    f2 = 0.0f;
                                    if (f >= 0.0f) {
                                        c0792M56.f3129 = f;
                                    }
                                    f3 = c0782.f2932;
                                    if (f3 >= 0.0f) {
                                        c0792M56.f3130 = f3;
                                    }
                                }
                                i16 = c0782.f2917;
                                if (i16 != -1) {
                                    view = (View) sparseArray.get(i16);
                                    c0796 = (C0792) sparseArray2.get(c0782.f2917);
                                    if (c0796 != null) {
                                        C0782 c0787 = (C0782) view.getLayoutParams();
                                        boolean z11 = z7;
                                        c0782.f2955 = z11;
                                        c0787.f2955 = z11;
                                        c0792M56.mo2426(6).m2386(c0796.mo2426(6), 0, -1, z11);
                                        c0792M56.f3104 = z11;
                                        c0787.f2968.f3104 = z11;
                                        c0792M56.mo2426(i12).m2394();
                                        c0792M56.mo2426(i13).m2394();
                                    }
                                }
                                f2 = 0.0f;
                                if (f >= 0.0f) {
                                    c0792M56.f3129 = f;
                                }
                                f3 = c0782.f2932;
                                if (f3 >= 0.0f) {
                                    c0792M56.f3130 = f3;
                                }
                            }
                            if (zIsInEditMode && ((i21 = c0782.f2947) != -1 || c0782.f2948 != -1)) {
                                int i47 = c0782.f2948;
                                c0792M56.f3124 = i21;
                                c0792M56.f3125 = i47;
                            }
                            if (c0782.f2953) {
                                c0792M56.m2447(1);
                                c0792M56.m2449(((ViewGroup.MarginLayoutParams) c0782).width);
                                if (((ViewGroup.MarginLayoutParams) c0782).width == -2) {
                                    c0792M56.m2447(i34);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0782).width == -1) {
                                if (c0782.f2950) {
                                    c0792M56.m2447(3);
                                } else {
                                    c0792M56.m2447(4);
                                }
                                c0792M56.mo2426(2).f2889 = ((ViewGroup.MarginLayoutParams) c0782).leftMargin;
                                c0792M56.mo2426(4).f2889 = ((ViewGroup.MarginLayoutParams) c0782).rightMargin;
                            } else {
                                c0792M56.m2447(3);
                                c0792M56.m2449(0);
                            }
                            if (c0782.f2954) {
                                i18 = -1;
                                c0792M56.m2448(1);
                                c0792M56.m2446(((ViewGroup.MarginLayoutParams) c0782).height);
                                if (((ViewGroup.MarginLayoutParams) c0782).height == -2) {
                                    c0792M56.m2448(2);
                                }
                            } else {
                                i18 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0782).height == -1) {
                                    if (c0782.f2951) {
                                        c0792M56.m2448(3);
                                    } else {
                                        c0792M56.m2448(4);
                                    }
                                    c0792M56.mo2426(i12).f2889 = ((ViewGroup.MarginLayoutParams) c0782).topMargin;
                                    c0792M56.mo2426(i13).f2889 = ((ViewGroup.MarginLayoutParams) c0782).bottomMargin;
                                } else {
                                    c0792M56.m2448(3);
                                    c0792M56.m2446(0);
                                }
                            }
                            String str2 = c0782.f2933;
                            if (str2 == null || str2.length() == 0) {
                                c0792M56.f3122 = f2;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i19 = i18;
                                    i20 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i19 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i18;
                                    i20 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i20);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = f2;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i20, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = f2;
                                    } else {
                                        try {
                                            float f8 = Float.parseFloat(strSubstring3);
                                            float f9 = Float.parseFloat(strSubstring4);
                                            if (f8 <= f2 || f9 <= f2) {
                                                fAbs = f2;
                                            } else {
                                                fAbs = i19 == 1 ? Math.abs(f9 / f8) : Math.abs(f8 / f9);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > f2) {
                                    c0792M56.f3122 = fAbs;
                                    c0792M56.f3123 = i19;
                                }
                            }
                            float f10 = c0782.f2935;
                            float[] fArr = c0792M56.f3136;
                            fArr[0] = f10;
                            z7 = true;
                            fArr[1] = c0782.f2936;
                            c0792M56.f3134 = c0782.f2937;
                            c0792M56.f3135 = c0782.f2938;
                            int i48 = c0782.f2939;
                            int i49 = c0782.f2941;
                            int i50 = c0782.f2943;
                            float f11 = c0782.f2945;
                            c0792M56.f3091 = i48;
                            c0792M56.f3094 = i49;
                            if (i50 == Integer.MAX_VALUE) {
                                i50 = 0;
                            }
                            c0792M56.f3095 = i50;
                            c0792M56.f3096 = f11;
                            if (f11 > f2 && f11 < 1.0f && i48 == 0) {
                                c0792M56.f3091 = 2;
                            }
                            int i51 = c0782.f2940;
                            int i52 = c0782.f2942;
                            int i53 = c0782.f2944;
                            float f12 = c0782.f2946;
                            c0792M56.f3092 = i51;
                            c0792M56.f3097 = i52;
                            if (i53 == Integer.MAX_VALUE) {
                                i53 = 0;
                            }
                            c0792M56.f3098 = i53;
                            c0792M56.f3099 = f12;
                            if (f12 <= f2 || f12 >= 1.0f || i51 != 0) {
                                i34 = 2;
                            } else {
                                i34 = 2;
                                c0792M56.f3092 = 2;
                            }
                        }
                    }
                    i37++;
                    i34 = i34;
                    zIsInEditMode = zIsInEditMode;
                    childCount3 = childCount3;
                }
            } else {
                z2 = z;
            }
            if (z2) {
                c07911.f3143.m1477(c07911);
            }
        }
        m58(c07911, this.f205, i, i2);
        m57(i, i2, c07911.m2431(), c07911.m2428(), c07911.f3155, c07911.f3156);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0792 c0792M54 = m54(view);
        if ((view instanceof C1517) && !(c0792M54 instanceof C1518)) {
            C0782 c0782 = (C0782) view.getLayoutParams();
            C1518 c1518 = new C1518();
            c0782.f2968 = c1518;
            c0782.f2956 = true;
            c1518.m3426(c0782.f2949);
        }
        if (view instanceof AbstractC0780) {
            AbstractC0780 abstractC0780 = (AbstractC0780) view;
            abstractC0780.m2405();
            ((C0782) view.getLayoutParams()).f2957 = true;
            ArrayList arrayList = this.f198;
            if (!arrayList.contains(abstractC0780)) {
                arrayList.add(abstractC0780);
            }
        }
        this.f197.put(view.getId(), view);
        this.f204 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f197.remove(view.getId());
        C0792 c0792M54 = m54(view);
        this.f199.f3142.remove(c0792M54);
        c0792M54.mo2440();
        this.f198.remove(view);
        this.f204 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f204 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0791 c0791) {
        this.f206 = c0791;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f197;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f203) {
            return;
        }
        this.f203 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f202) {
            return;
        }
        this.f202 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f201) {
            return;
        }
        this.f201 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f200) {
            return;
        }
        this.f200 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0794 abstractC0794) {
        C0519 c0519 = this.f207;
        if (c0519 != null) {
            c0519.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f205 = i;
        C0793 c0793 = this.f199;
        c0793.f3154 = i;
        C1814.f6024 = c0793.m2458(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0792 m54(View view) {
        if (view == this) {
            return this.f199;
        }
        if (view == null) {
            return null;
        }
        return ((C0782) view.getLayoutParams()).f2968;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m55(AttributeSet attributeSet, int i) {
        C0793 c0793 = this.f199;
        c0793.f3131 = this;
        C0783 c0783 = this.f211;
        c0793.f3145 = c0783;
        c0793.f3144.f3705 = c0783;
        this.f197.put(getId(), this);
        this.f206 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2515.f7956, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.f200 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f200);
                } else if (index == 10) {
                    this.f201 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f201);
                } else if (index == 7) {
                    this.f202 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f202);
                } else if (index == 8) {
                    this.f203 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f203);
                } else if (index == 90) {
                    this.f205 = typedArrayObtainStyledAttributes.getInt(index, this.f205);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m56(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f207 = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0791 c0791 = new C0791();
                        this.f206 = c0791;
                        c0791.m2419(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f206 = null;
                    }
                    this.f208 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0793.f3154 = this.f205;
        C1814.f6024 = c0793.m2458(512);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: IOException -> 0x0054, XmlPullParserException -> 0x0056, TryCatch #2 {IOException -> 0x0054, XmlPullParserException -> 0x0056, blocks: (B:3:0x0022, B:36:0x00a7, B:10:0x0031, B:11:0x0039, B:34:0x008d, B:13:0x003d, B:15:0x0045, B:17:0x004c, B:22:0x0058, B:25:0x0061, B:28:0x006a, B:30:0x0072, B:31:0x0081, B:33:0x0089, B:35:0x00a4), top: B:42:0x0022 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x008d, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m56(int i) {
        Context context = getContext();
        C0519 c0519 = new C0519(8, false);
        c0519.f2208 = new SparseArray();
        c0519.f2209 = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0784 c0784 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0519.m1998(context, xml);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c0784 = new C0784(context, xml);
                                ((SparseArray) c0519.f2208).put(c0784.f2977, c0784);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C0785 c0785 = new C0785(context, xml);
                                if (c0784 != null) {
                                    ((ArrayList) c0784.f2979).add(c0785);
                                }
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        default:
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.f207 = c0519;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m57(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0783 c0783 = this.f211;
        int i5 = c0783.f2973;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c0783.f2972, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f202, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f203, iResolveSizeAndState2);
        if (z) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0308  */
    /* JADX WARN: Code duplicated, block: B:164:0x0326  */
    /* JADX WARN: Code duplicated, block: B:166:0x0329  */
    /* JADX WARN: Code duplicated, block: B:171:0x034b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0368  */
    /* JADX WARN: Code duplicated, block: B:417:0x0397 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m58(C0793 c0793, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        C0783 c0783;
        int i7;
        boolean zM2456;
        boolean z3;
        int i8;
        int i9;
        C0783 c0784;
        int i10;
        boolean z4;
        C0783 c0785;
        int i11;
        C1575 c1575;
        C3607 c3607;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        Iterator it;
        boolean z6;
        AbstractC3700 abstractC3700;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C0783 c0786 = this.f211;
        c0786.f2970 = iMax3;
        c0786.f2971 = iMax4;
        c0786.f2972 = paddingWidth;
        c0786.f2973 = i18;
        c0786.f2974 = i2;
        c0786.f2975 = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i19 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i20 = size - paddingWidth;
        int i21 = size2 - i18;
        int i22 = c0786.f2973;
        int i23 = c0786.f2972;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f200);
                iMin = iMax;
            } else {
                iMin = i20;
            }
            i19 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f200);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i19 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f202 - i23, i20);
            i19 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f201);
                iMin2 = iMax2;
            } else {
                iMin2 = i21;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f203 - i22, i21);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f201);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iM2431 = c0793.m2431();
        C1016 c1016 = c0793.f3144;
        int[] iArr = c0793.f3102;
        int i24 = iMin;
        if (i24 == iM2431 && iMin2 == c0793.m2428()) {
            c = 1;
        } else {
            c1016.f3702 = true;
            c = 1;
        }
        c0793.f3124 = 0;
        c0793.f3125 = 0;
        iArr[0] = this.f202 - i23;
        iArr[c] = this.f203 - i22;
        c0793.f3127 = 0;
        c0793.f3128 = 0;
        c0793.m2447(i19);
        c0793.m2449(i24);
        c0793.m2448(i4);
        c0793.m2446(iMin2);
        int i25 = this.f200 - i23;
        if (i25 < 0) {
            c0793.f3127 = 0;
        } else {
            c0793.f3127 = i25;
        }
        int i26 = this.f201 - i22;
        if (i26 < 0) {
            c0793.f3128 = 0;
        } else {
            c0793.f3128 = i26;
        }
        c0793.f3148 = iMax5;
        c0793.f3149 = iMax3;
        C0253 c0253 = c0793.f3143;
        C0793 c0794 = (C0793) c0253.f1480;
        ArrayList arrayList = (ArrayList) c0253.f1478;
        C0783 c0787 = c0793.f3145;
        int size3 = c0793.f3142.size();
        int iM2432 = c0793.m2431();
        int iM2428 = c0793.m2428();
        boolean zM3384 = AbstractC1471.m3384(i, 128);
        boolean z7 = zM3384 || AbstractC1471.m3384(i, 64);
        if (z7) {
            int i27 = 0;
            while (true) {
                if (i27 < size3) {
                    boolean z8 = z7;
                    C0792 c0792 = (C0792) c0793.f3142.get(i27);
                    int i28 = i27;
                    int[] iArr2 = c0792.f3141;
                    i5 = size3;
                    boolean z9 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0792.f3122 > 0.0f;
                    if ((c0792.m2437() && z9) || ((c0792.m2438() && z9) || (c0792 instanceof C1374) || c0792.m2437() || c0792.m2438())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i27 = i28 + 1;
                        z7 = z8;
                        size3 = i5;
                    }
                } else {
                    z = z7;
                    i5 = size3;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z7;
            i5 = size3;
            i6 = 1073741824;
        }
        boolean z10 = z & ((mode == i6 && mode2 == i6) || zM3384);
        if (z10) {
            int iMin3 = Math.min(iArr[0], i20);
            int iMin4 = Math.min(iArr[1], i21);
            int i29 = 1073741824;
            if (mode == 1073741824) {
                if (c0793.m2431() != iMin3) {
                    c0793.m2449(iMin3);
                    c1016.f3701 = true;
                }
                i29 = 1073741824;
            }
            if (mode2 == i29 && c0793.m2428() != iMin4) {
                c0793.m2446(iMin4);
                c1016.f3701 = true;
            }
            if (mode == i29 && mode2 == i29) {
                ArrayList<AbstractC3700> arrayList2 = c1016.f3704;
                C0793 c0795 = c1016.f3700;
                if (c1016.f3701 || c1016.f3702) {
                    for (C0792 c0796 : c0795.f3142) {
                        c0796.m2425();
                        c0796.f3080 = false;
                        c0796.f3083.m3454();
                        c0796.f3084.m5148();
                        z10 = z10;
                    }
                    z2 = z10;
                    c0795.m2425();
                    i14 = 0;
                    c0795.f3080 = false;
                    c0795.f3083.m3454();
                    c0795.f3084.m5148();
                    c1016.f3702 = false;
                } else {
                    z2 = z10;
                    i14 = 0;
                }
                c1016.m2704(c1016.f3703);
                c0795.f3124 = i14;
                int[] iArr3 = c0795.f3141;
                c0795.f3125 = i14;
                int iM2427 = c0795.m2427(i14);
                int iM2429 = c0795.m2427(1);
                if (c1016.f3701) {
                    c1016.m2705();
                }
                int iM2433 = c0795.m2432();
                int iM2434 = c0795.m2433();
                c0783 = c0787;
                c0795.f3083.f11542.mo2712(iM2433);
                c0795.f3084.f11542.mo2712(iM2434);
                c1016.m2709();
                if (iM2427 == 2 || iM2429 == 2) {
                    if (zM3384) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((AbstractC3700) it2.next()).mo2105()) {
                                zM3384 = false;
                                break;
                            }
                        }
                    }
                    if (zM3384 && iM2427 == 2) {
                        c0795.m2447(1);
                        c0795.m2449(c1016.m2706(c0795, 0));
                        c0795.f3083.f11539.mo2712(c0795.m2431());
                    }
                    if (zM3384 && iM2429 == 2) {
                        i15 = 1;
                        c0795.m2448(1);
                        c0795.m2446(c1016.m2706(c0795, 1));
                        c0795.f3084.f11539.mo2712(c0795.m2428());
                    }
                    i16 = iArr3[0];
                    if (i16 != i15 || i16 == 4) {
                        int iM2435 = c0795.m2431() + iM2433;
                        c0795.f3083.f11543.mo2712(iM2435);
                        c0795.f3083.f11539.mo2712(iM2435 - iM2433);
                        c1016.m2709();
                        i17 = iArr3[1];
                        if (i17 != 1 || i17 == 4) {
                            int iM24210 = c0795.m2428() + iM2434;
                            c0795.f3084.f11543.mo2712(iM24210);
                            c0795.f3084.f11539.mo2712(iM24210 - iM2434);
                        }
                        c1016.m2709();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (AbstractC3700 abstractC3701 : arrayList2) {
                        if (abstractC3701.f11536 == c0795 || abstractC3701.f11541) {
                            abstractC3701.mo2102();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z6 = true;
                            break;
                        }
                        abstractC3700 = (AbstractC3700) it.next();
                        if (!z5 || abstractC3700.f11536 != c0795) {
                            if (abstractC3700.f11542.f3717 || ((!abstractC3700.f11543.f3717 && !(abstractC3700 instanceof C1519)) || (!abstractC3700.f11539.f3717 && !(abstractC3700 instanceof C0563) && !(abstractC3700 instanceof C1519)))) {
                                z6 = false;
                                break;
                            }
                        }
                    }
                    c0795.m2447(iM2427);
                    c0795.m2448(iM2429);
                    zM2456 = z6;
                    i7 = 2;
                    i13 = 1073741824;
                } else {
                    iM2433 = iM2433;
                }
                i15 = 1;
                i16 = iArr3[0];
                if (i16 != i15) {
                    int iM2436 = c0795.m2431() + iM2433;
                    c0795.f3083.f11543.mo2712(iM2436);
                    c0795.f3083.f11539.mo2712(iM2436 - iM2433);
                    c1016.m2709();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iM24211 = c0795.m2428() + iM2434;
                        c0795.f3084.f11543.mo2712(iM24211);
                        c0795.f3084.f11539.mo2712(iM24211 - iM2434);
                    } else {
                        int iM24212 = c0795.m2428() + iM2434;
                        c0795.f3084.f11543.mo2712(iM24212);
                        c0795.f3084.f11539.mo2712(iM24212 - iM2434);
                    }
                    c1016.m2709();
                    z5 = true;
                } else {
                    int iM2437 = c0795.m2431() + iM2433;
                    c0795.f3083.f11543.mo2712(iM2437);
                    c0795.f3083.f11539.mo2712(iM2437 - iM2433);
                    c1016.m2709();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iM24213 = c0795.m2428() + iM2434;
                        c0795.f3084.f11543.mo2712(iM24213);
                        c0795.f3084.f11539.mo2712(iM24213 - iM2434);
                    } else {
                        int iM24214 = c0795.m2428() + iM2434;
                        c0795.f3084.f11543.mo2712(iM24214);
                        c0795.f3084.f11539.mo2712(iM24214 - iM2434);
                    }
                    c1016.m2709();
                    z5 = true;
                }
                while (r6.hasNext()) {
                    if (abstractC3701.f11536 == c0795) {
                    }
                    abstractC3701.mo2102();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    abstractC3700 = (AbstractC3700) it.next();
                    if (!z5) {
                    }
                    if (abstractC3700.f11542.f3717) {
                    }
                    z6 = false;
                    break;
                }
                c0795.m2447(iM2427);
                c0795.m2448(iM2429);
                zM2456 = z6;
                i7 = 2;
                i13 = 1073741824;
            } else {
                z2 = z10;
                c0783 = c0787;
                C0793 c0797 = c1016.f3700;
                if (c1016.f3701) {
                    for (C0792 c0798 : c0797.f3142) {
                        c0798.m2425();
                        c0798.f3080 = false;
                        C1575 c1576 = c0798.f3083;
                        c1576.f11539.f3717 = false;
                        c1576.f11541 = false;
                        c1576.m3454();
                        C3607 c3608 = c0798.f3084;
                        c3608.f11539.f3717 = false;
                        c3608.f11541 = false;
                        c3608.m5148();
                    }
                    i12 = 0;
                    c0797.m2425();
                    c0797.f3080 = false;
                    C1575 c1577 = c0797.f3083;
                    c1577.f11539.f3717 = false;
                    c1577.f11541 = false;
                    c1577.m3454();
                    C3607 c3609 = c0797.f3084;
                    c3609.f11539.f3717 = false;
                    c3609.f11541 = false;
                    c3609.m5148();
                    c1016.m2705();
                } else {
                    i12 = 0;
                }
                c1016.m2704(c1016.f3703);
                c0797.f3124 = i12;
                c0797.f3125 = i12;
                c0797.f3083.f11542.mo2712(i12);
                c0797.f3084.f11542.mo2712(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zM2456 = c0793.m2456(i12, zM3384);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM2456 = true;
                }
                if (mode2 == 1073741824) {
                    zM2456 &= c0793.m2456(1, zM3384);
                    i7++;
                }
            }
            if (zM2456) {
                c0793.mo2450(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z10;
            c0783 = c0787;
            i7 = 0;
            zM2456 = false;
        }
        if (zM2456 && i7 == 2) {
            return;
        }
        int i30 = c0793.f3154;
        if (i5 > 0) {
            int size4 = c0793.f3142.size();
            boolean zM2458 = c0793.m2458(64);
            C0783 c0788 = c0793.f3145;
            int i31 = 0;
            while (i31 < size4) {
                C0792 c0799 = (C0792) c0793.f3142.get(i31);
                if ((c0799 instanceof C1518) || (c0799 instanceof C0342) || c0799.f3105 || (zM2458 && (c1575 = c0799.f3083) != null && (c3607 = c0799.f3084) != null && c1575.f11539.f3717 && c3607.f11539.f3717)) {
                    i11 = size4;
                } else {
                    int iM24215 = c0799.m2427(0);
                    int iM24216 = c0799.m2427(1);
                    i11 = size4;
                    boolean z11 = iM24215 == 3 && c0799.f3091 != 1 && iM24216 == 3 && c0799.f3092 != 1;
                    if (!z11 && c0793.m2458(1) && !(c0799 instanceof C1374)) {
                        if (iM24215 == 3 && c0799.f3091 == 0 && iM24216 != 3 && !c0799.m2437()) {
                            z11 = true;
                        }
                        if (iM24216 == 3 && c0799.f3092 == 0 && iM24215 != 3 && !c0799.m2437()) {
                            z11 = true;
                        }
                        if ((iM24215 == 3 || iM24216 == 3) && c0799.f3122 > 0.0f) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        c0253.m1472(c0788, c0799, 0);
                    }
                }
                i31++;
                size4 = i11;
            }
            ConstraintLayout constraintLayout = c0788.f2969;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.f198;
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0780) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0253.m1477(c0793);
        int size6 = arrayList.size();
        if (i5 > 0) {
            c0253.m1476(c0793, iM2432, iM2428);
        }
        if (size6 > 0) {
            int[] iArr4 = c0793.f3141;
            boolean z12 = iArr4[0] == 2;
            boolean z13 = iArr4[1] == 2;
            int iMax7 = Math.max(c0793.m2431(), c0794.f3127);
            int iMax8 = Math.max(c0793.m2428(), c0794.f3128);
            int i34 = 0;
            boolean z14 = false;
            while (i34 < size6) {
                C0792 c07910 = (C0792) arrayList.get(i34);
                if (c07910 instanceof C1374) {
                    int iM2438 = c07910.m2431();
                    int iM24217 = c07910.m2428();
                    z4 = z13;
                    c0785 = c0783;
                    boolean zM1472 = z14 | c0253.m1472(c0785, c07910, 1);
                    int iM2439 = c07910.m2431();
                    boolean z15 = zM1472;
                    int iM24218 = c07910.m2428();
                    if (iM2439 != iM2438) {
                        c07910.m2449(iM2439);
                        if (z12 && c07910.m2432() + c07910.f3120 > iMax7) {
                            iMax7 = Math.max(iMax7, c07910.mo2426(4).m2389() + c07910.m2432() + c07910.f3120);
                        }
                        z15 = true;
                    }
                    if (iM24218 != iM24217) {
                        c07910.m2446(iM24218);
                        if (z4 && c07910.m2433() + c07910.f3121 > iMax8) {
                            iMax8 = Math.max(iMax8, c07910.mo2426(5).m2389() + c07910.m2433() + c07910.f3121);
                        }
                        z15 = true;
                    }
                    z14 = z15 | ((C1374) c07910).f4924;
                } else {
                    z4 = z13;
                    c0785 = c0783;
                }
                i34++;
                c0783 = c0785;
                z13 = z4;
            }
            boolean z16 = z13;
            int i35 = 0;
            while (true) {
                C0783 c0789 = c0783;
                if (i35 >= 2) {
                    break;
                }
                boolean zM1473 = z14;
                int i36 = 0;
                while (i36 < size6) {
                    C0792 c07911 = (C0792) arrayList.get(i36);
                    if ((!(c07911 instanceof AbstractC1544) || (c07911 instanceof C1374)) && !(c07911 instanceof C1518)) {
                        i8 = size6;
                        if (c07911.f3132 != 8 && ((!z2 || !c07911.f3083.f11539.f3717 || !c07911.f3084.f11539.f3717) && !(c07911 instanceof C1374))) {
                            int iM24310 = c07911.m2431();
                            int iM24219 = c07911.m2428();
                            i9 = i36;
                            int i37 = c07911.f3126;
                            zM1473 |= c0253.m1472(c0789, c07911, i35 == 1 ? 2 : 1);
                            c0784 = c0789;
                            int iM24311 = c07911.m2431();
                            i10 = i35;
                            int iM24220 = c07911.m2428();
                            if (iM24311 != iM24310) {
                                c07911.m2449(iM24311);
                                if (z12 && c07911.m2432() + c07911.f3120 > iMax7) {
                                    iMax7 = Math.max(iMax7, c07911.mo2426(4).m2389() + c07911.m2432() + c07911.f3120);
                                }
                                zM1473 = true;
                            }
                            if (iM24220 != iM24219) {
                                c07911.m2446(iM24220);
                                if (z16 && c07911.m2433() + c07911.f3121 > iMax8) {
                                    iMax8 = Math.max(iMax8, c07911.mo2426(5).m2389() + c07911.m2433() + c07911.f3121);
                                }
                                zM1473 = true;
                            }
                            if (c07911.f3104 && i37 != c07911.f3126) {
                                zM1473 = true;
                            }
                        }
                        i36 = i9 + 1;
                        size6 = i8;
                        i35 = i10;
                        c0789 = c0784;
                    } else {
                        i8 = size6;
                    }
                    c0784 = c0789;
                    i10 = i35;
                    i9 = i36;
                    i36 = i9 + 1;
                    size6 = i8;
                    i35 = i10;
                    c0789 = c0784;
                }
                int i38 = size6;
                c0783 = c0789;
                int i39 = i35;
                boolean z17 = zM1473;
                if (!z17) {
                    z14 = z17;
                    break;
                }
                c0253.m1476(c0793, iM2432, iM2428);
                i35 = i39 + 1;
                size6 = i38;
                z14 = false;
            }
            if (z14) {
                c0253.m1476(c0793, iM2432, iM2428);
                if (c0793.m2431() < iMax7) {
                    c0793.m2449(iMax7);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c0793.m2428() < iMax8) {
                    c0793.m2446(iMax8);
                    z3 = true;
                }
                if (z3) {
                    c0253.m1476(c0793, iM2432, iM2428);
                }
            }
        }
        c0793.f3154 = i30;
        C1814.f6024 = c0793.m2458(512);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197 = new SparseArray();
        this.f198 = new ArrayList(4);
        this.f199 = new C0793();
        this.f200 = 0;
        this.f201 = 0;
        this.f202 = Integer.MAX_VALUE;
        this.f203 = Integer.MAX_VALUE;
        this.f204 = true;
        this.f205 = 257;
        this.f206 = null;
        this.f207 = null;
        this.f208 = -1;
        this.f209 = new HashMap();
        this.f210 = new SparseArray();
        this.f211 = new C0783(this, this);
        this.f212 = 0;
        this.f213 = 0;
        m55(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0782 c0782 = new C0782(layoutParams);
        c0782.f2906 = -1;
        c0782.f2907 = -1;
        c0782.f2908 = -1.0f;
        c0782.f2909 = -1;
        c0782.f2910 = -1;
        c0782.f2911 = -1;
        c0782.f2912 = -1;
        c0782.f2913 = -1;
        c0782.f2914 = -1;
        c0782.f2915 = -1;
        c0782.f2916 = -1;
        c0782.f2917 = -1;
        c0782.f2918 = -1;
        c0782.f2919 = 0;
        c0782.f2920 = 0.0f;
        c0782.f2921 = -1;
        c0782.f2922 = -1;
        c0782.f2923 = -1;
        c0782.f2924 = -1;
        c0782.f2925 = -1;
        c0782.f2926 = -1;
        c0782.f2927 = -1;
        c0782.f2928 = -1;
        c0782.f2929 = -1;
        c0782.f2930 = -1;
        c0782.f2931 = 0.5f;
        c0782.f2932 = 0.5f;
        c0782.f2933 = null;
        c0782.f2934 = 1;
        c0782.f2935 = -1.0f;
        c0782.f2936 = -1.0f;
        c0782.f2937 = 0;
        c0782.f2938 = 0;
        c0782.f2939 = 0;
        c0782.f2940 = 0;
        c0782.f2941 = 0;
        c0782.f2942 = 0;
        c0782.f2943 = 0;
        c0782.f2944 = 0;
        c0782.f2945 = 1.0f;
        c0782.f2946 = 1.0f;
        c0782.f2947 = -1;
        c0782.f2948 = -1;
        c0782.f2949 = -1;
        c0782.f2950 = false;
        c0782.f2951 = false;
        c0782.f2952 = null;
        c0782.f2953 = true;
        c0782.f2954 = true;
        c0782.f2955 = false;
        c0782.f2956 = false;
        c0782.f2957 = false;
        c0782.f2958 = -1;
        c0782.f2959 = -1;
        c0782.f2960 = -1;
        c0782.f2961 = -1;
        c0782.f2962 = -1;
        c0782.f2963 = -1;
        c0782.f2964 = 0.5f;
        c0782.f2968 = new C0792();
        return c0782;
    }
}
