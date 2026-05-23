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
import p000.AbstractC0781;
import p000.AbstractC0782;
import p000.AbstractC0795;
import p000.AbstractC1532;
import p000.AbstractC2201;
import p000.AbstractC2461;
import p000.AbstractC3640;
import p000.C0243;
import p000.C0367;
import p000.C0542;
import p000.C0582;
import p000.C0783;
import p000.C0784;
import p000.C0785;
import p000.C0786;
import p000.C0792;
import p000.C0793;
import p000.C0794;
import p000.C1013;
import p000.C1367;
import p000.C1505;
import p000.C1506;
import p000.C1507;
import p000.C1564;
import p000.C1791;
import p000.C3549;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final SparseArray f197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0794 f199;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f202;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f204;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0792 f206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C0542 f207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public HashMap f209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final SparseArray f210;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C0784 f211;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f212;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f213;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197 = new SparseArray();
        this.f198 = new ArrayList(4);
        this.f199 = new C0794();
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
        this.f211 = new C0784(this, this);
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
    public static C0783 m53() {
        C0783 c0783 = new C0783(-2, -2);
        c0783.f2899 = -1;
        c0783.f2900 = -1;
        c0783.f2901 = -1.0f;
        c0783.f2902 = -1;
        c0783.f2903 = -1;
        c0783.f2904 = -1;
        c0783.f2905 = -1;
        c0783.f2906 = -1;
        c0783.f2907 = -1;
        c0783.f2908 = -1;
        c0783.f2909 = -1;
        c0783.f2910 = -1;
        c0783.f2911 = -1;
        c0783.f2912 = 0;
        c0783.f2913 = 0.0f;
        c0783.f2914 = -1;
        c0783.f2915 = -1;
        c0783.f2916 = -1;
        c0783.f2917 = -1;
        c0783.f2918 = -1;
        c0783.f2919 = -1;
        c0783.f2920 = -1;
        c0783.f2921 = -1;
        c0783.f2922 = -1;
        c0783.f2923 = -1;
        c0783.f2924 = 0.5f;
        c0783.f2925 = 0.5f;
        c0783.f2926 = null;
        c0783.f2927 = 1;
        c0783.f2928 = -1.0f;
        c0783.f2929 = -1.0f;
        c0783.f2930 = 0;
        c0783.f2931 = 0;
        c0783.f2932 = 0;
        c0783.f2933 = 0;
        c0783.f2934 = 0;
        c0783.f2935 = 0;
        c0783.f2936 = 0;
        c0783.f2937 = 0;
        c0783.f2938 = 1.0f;
        c0783.f2939 = 1.0f;
        c0783.f2940 = -1;
        c0783.f2941 = -1;
        c0783.f2942 = -1;
        c0783.f2943 = false;
        c0783.f2944 = false;
        c0783.f2945 = null;
        c0783.f2946 = true;
        c0783.f2947 = true;
        c0783.f2948 = false;
        c0783.f2949 = false;
        c0783.f2950 = false;
        c0783.f2951 = -1;
        c0783.f2952 = -1;
        c0783.f2953 = -1;
        c0783.f2954 = -1;
        c0783.f2955 = -1;
        c0783.f2956 = -1;
        c0783.f2957 = 0.5f;
        c0783.f2961 = new C0793();
        return c0783;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0783;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f198;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0781) arrayList.get(i)).getClass();
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
        C0783 c0783 = new C0783(context, attributeSet);
        c0783.f2899 = -1;
        c0783.f2900 = -1;
        c0783.f2901 = -1.0f;
        c0783.f2902 = -1;
        c0783.f2903 = -1;
        c0783.f2904 = -1;
        c0783.f2905 = -1;
        c0783.f2906 = -1;
        c0783.f2907 = -1;
        c0783.f2908 = -1;
        c0783.f2909 = -1;
        c0783.f2910 = -1;
        c0783.f2911 = -1;
        c0783.f2912 = 0;
        c0783.f2913 = 0.0f;
        c0783.f2914 = -1;
        c0783.f2915 = -1;
        c0783.f2916 = -1;
        c0783.f2917 = -1;
        c0783.f2918 = -1;
        c0783.f2919 = -1;
        c0783.f2920 = -1;
        c0783.f2921 = -1;
        c0783.f2922 = -1;
        c0783.f2923 = -1;
        c0783.f2924 = 0.5f;
        c0783.f2925 = 0.5f;
        c0783.f2926 = null;
        c0783.f2927 = 1;
        c0783.f2928 = -1.0f;
        c0783.f2929 = -1.0f;
        c0783.f2930 = 0;
        c0783.f2931 = 0;
        c0783.f2932 = 0;
        c0783.f2933 = 0;
        c0783.f2934 = 0;
        c0783.f2935 = 0;
        c0783.f2936 = 0;
        c0783.f2937 = 0;
        c0783.f2938 = 1.0f;
        c0783.f2939 = 1.0f;
        c0783.f2940 = -1;
        c0783.f2941 = -1;
        c0783.f2942 = -1;
        c0783.f2943 = false;
        c0783.f2944 = false;
        c0783.f2945 = null;
        c0783.f2946 = true;
        c0783.f2947 = true;
        c0783.f2948 = false;
        c0783.f2949 = false;
        c0783.f2950 = false;
        c0783.f2951 = -1;
        c0783.f2952 = -1;
        c0783.f2953 = -1;
        c0783.f2954 = -1;
        c0783.f2955 = -1;
        c0783.f2956 = -1;
        c0783.f2957 = 0.5f;
        c0783.f2961 = new C0793();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2461.f7810);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC0782.f2898.get(index);
            switch (i3) {
                case 1:
                    c0783.f2942 = typedArrayObtainStyledAttributes.getInt(index, c0783.f2942);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2911);
                    c0783.f2911 = resourceId;
                    if (resourceId == -1) {
                        c0783.f2911 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0783.f2912 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2912);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0783.f2913) % 360.0f;
                    c0783.f2913 = f;
                    if (f < 0.0f) {
                        c0783.f2913 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0783.f2899 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0783.f2899);
                    break;
                case 6:
                    c0783.f2900 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0783.f2900);
                    break;
                case 7:
                    c0783.f2901 = typedArrayObtainStyledAttributes.getFloat(index, c0783.f2901);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2902);
                    c0783.f2902 = resourceId2;
                    if (resourceId2 == -1) {
                        c0783.f2902 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2903);
                    c0783.f2903 = resourceId3;
                    if (resourceId3 == -1) {
                        c0783.f2903 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2904);
                    c0783.f2904 = resourceId4;
                    if (resourceId4 == -1) {
                        c0783.f2904 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2905);
                    c0783.f2905 = resourceId5;
                    if (resourceId5 == -1) {
                        c0783.f2905 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2906);
                    c0783.f2906 = resourceId6;
                    if (resourceId6 == -1) {
                        c0783.f2906 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2907);
                    c0783.f2907 = resourceId7;
                    if (resourceId7 == -1) {
                        c0783.f2907 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2908);
                    c0783.f2908 = resourceId8;
                    if (resourceId8 == -1) {
                        c0783.f2908 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2909);
                    c0783.f2909 = resourceId9;
                    if (resourceId9 == -1) {
                        c0783.f2909 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2910);
                    c0783.f2910 = resourceId10;
                    if (resourceId10 == -1) {
                        c0783.f2910 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2914);
                    c0783.f2914 = resourceId11;
                    if (resourceId11 == -1) {
                        c0783.f2914 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2915);
                    c0783.f2915 = resourceId12;
                    if (resourceId12 == -1) {
                        c0783.f2915 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2916);
                    c0783.f2916 = resourceId13;
                    if (resourceId13 == -1) {
                        c0783.f2916 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0783.f2917);
                    c0783.f2917 = resourceId14;
                    if (resourceId14 == -1) {
                        c0783.f2917 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.ILOAD /* 21 */:
                    c0783.f2918 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2918);
                    break;
                case Opcodes.LLOAD /* 22 */:
                    c0783.f2919 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2919);
                    break;
                case Opcodes.FLOAD /* 23 */:
                    c0783.f2920 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2920);
                    break;
                case Opcodes.DLOAD /* 24 */:
                    c0783.f2921 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2921);
                    break;
                case Opcodes.ALOAD /* 25 */:
                    c0783.f2922 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2922);
                    break;
                case 26:
                    c0783.f2923 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2923);
                    break;
                case 27:
                    c0783.f2943 = typedArrayObtainStyledAttributes.getBoolean(index, c0783.f2943);
                    break;
                case 28:
                    c0783.f2944 = typedArrayObtainStyledAttributes.getBoolean(index, c0783.f2944);
                    break;
                case 29:
                    c0783.f2924 = typedArrayObtainStyledAttributes.getFloat(index, c0783.f2924);
                    break;
                case 30:
                    c0783.f2925 = typedArrayObtainStyledAttributes.getFloat(index, c0783.f2925);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0783.f2932 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0783.f2933 = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c0783.f2934 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2934);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0783.f2934) == -2) {
                            c0783.f2934 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c0783.f2936 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2936);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0783.f2936) == -2) {
                            c0783.f2936 = -2;
                        }
                    }
                    break;
                case 35:
                    c0783.f2938 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0783.f2938));
                    c0783.f2932 = 2;
                    break;
                case 36:
                    try {
                        c0783.f2935 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2935);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0783.f2935) == -2) {
                            c0783.f2935 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0783.f2937 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0783.f2937);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0783.f2937) == -2) {
                            c0783.f2937 = -2;
                        }
                    }
                    break;
                case 38:
                    c0783.f2939 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0783.f2939));
                    c0783.f2933 = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0783.f2926 = string;
                            c0783.f2927 = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c0783.f2926.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c0783.f2926.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c0783.f2927 = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c0783.f2927 = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c0783.f2926.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c0783.f2926.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = c0783.f2926.substring(i, iIndexOf2);
                                    String strSubstring4 = c0783.f2926.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring3);
                                            float f3 = Float.parseFloat(strSubstring4);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (c0783.f2927 == 1) {
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
                            c0783.f2928 = typedArrayObtainStyledAttributes.getFloat(index, c0783.f2928);
                            break;
                        case Opcodes.IALOAD /* 46 */:
                            c0783.f2929 = typedArrayObtainStyledAttributes.getFloat(index, c0783.f2929);
                            break;
                        case 47:
                            c0783.f2930 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0783.f2931 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0783.f2940 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0783.f2940);
                            break;
                        case Opcodes.AALOAD /* 50 */:
                            c0783.f2941 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0783.f2941);
                            break;
                        case Opcodes.BALOAD /* 51 */:
                            c0783.f2945 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0783.m2291();
        return c0783;
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
        return this.f199.f3147;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0783 c0783 = (C0783) childAt.getLayoutParams();
            C0793 c0793 = c0783.f2961;
            if (childAt.getVisibility() != 8 || c0783.f2949 || c0783.f2950 || zIsInEditMode) {
                int iM2317 = c0793.m2317();
                int iM2318 = c0793.m2318();
                childAt.layout(iM2317, iM2318, c0793.m2316() + iM2317, c0793.m2313() + iM2318);
            }
        }
        ArrayList arrayList = this.f198;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0781) arrayList.get(i6)).getClass();
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
        C0783 c0783;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C0793 c0793;
        int i7;
        int i8;
        C0793 c0794;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C0793 c0795;
        int i14;
        int i15;
        C0793 c0796;
        int i16;
        float f2;
        float f3;
        View view;
        C0793 c0797;
        C0793 c0798;
        C0793 c0799;
        int i17;
        C0793 c07910;
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
        int iM2288;
        boolean z4;
        C0793 c07911;
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
        C0794 c07912 = this.f199;
        if (!z6) {
            int i24 = this.f212;
            if (i24 == i && this.f213 == i2) {
                m57(i, i2, c07912.m2316(), c07912.m2313(), c07912.f3148, c07912.f3149);
                return;
            }
            if (i24 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f213) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= c07912.m2313()) {
                this.f212 = i;
                this.f213 = i2;
                m57(i, i2, c07912.m2316(), c07912.m2313(), c07912.f3148, c07912.f3149);
                return;
            }
        }
        this.f212 = i;
        this.f213 = i2;
        c07912.f3139 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
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
                    C0793 c0793M54 = m54(getChildAt(i26));
                    if (c0793M54 != null) {
                        c0793M54.mo2325();
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
                                c07911 = viewFindViewById == this ? c07912 : viewFindViewById == null ? null : ((C0783) viewFindViewById.getLayoutParams()).f2961;
                            }
                            c07911.f3126 = resourceName;
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
                C0792 c0792 = this.f206;
                if (c0792 != null) {
                    c0792.m2302(this);
                }
                c07912.f3135.clear();
                ArrayList arrayList2 = this.f198;
                int size = arrayList2.size();
                if (size > 0) {
                    int i29 = 0;
                    while (i29 < size) {
                        AbstractC0781 abstractC0781 = (AbstractC0781) arrayList2.get(i29);
                        HashMap map = abstractC0781.f2897;
                        if (abstractC0781.isInEditMode()) {
                            abstractC0781.setIds(abstractC0781.f2895);
                        }
                        AbstractC1532 abstractC1532 = abstractC0781.f2894;
                        if (abstractC1532 == null) {
                            z3 = z;
                            arrayList = arrayList2;
                        } else {
                            abstractC1532.f5368 = i22;
                            Arrays.fill(abstractC1532.f5367, (Object) null);
                            int i30 = i22;
                            while (i30 < abstractC0781.f2892) {
                                int i31 = abstractC0781.f2891[i30];
                                View view2 = (View) sparseArray.get(i31);
                                if (view2 == null && (iM2288 = abstractC0781.m2288(this, (str = (String) map.get(Integer.valueOf(i31))))) != 0) {
                                    abstractC0781.f2891[i30] = iM2288;
                                    map.put(Integer.valueOf(iM2288), str);
                                    view2 = (View) sparseArray.get(iM2288);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    AbstractC1532 abstractC1533 = abstractC0781.f2894;
                                    C0793 c0793M55 = m54(view3);
                                    abstractC1533.getClass();
                                    if (c0793M55 != abstractC1533 && c0793M55 != null) {
                                        int i32 = abstractC1533.f5368 + 1;
                                        C0793[] c0793Arr = abstractC1533.f5367;
                                        if (i32 > c0793Arr.length) {
                                            abstractC1533.f5367 = (C0793[]) Arrays.copyOf(c0793Arr, c0793Arr.length * 2);
                                        }
                                        C0793[] c0793Arr2 = abstractC1533.f5367;
                                        int i33 = abstractC1533.f5368;
                                        c0793Arr2[i33] = c0793M55;
                                        abstractC1533.f5368 = i33 + 1;
                                    }
                                }
                                i30++;
                                z = z;
                                arrayList2 = arrayList2;
                            }
                            z3 = z;
                            arrayList = arrayList2;
                            abstractC0781.f2894.mo3086();
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
                sparseArray2.put(0, c07912);
                sparseArray2.put(getId(), c07912);
                for (int i36 = 0; i36 < childCount3; i36++) {
                    View childAt2 = getChildAt(i36);
                    sparseArray2.put(childAt2.getId(), m54(childAt2));
                }
                int i37 = 0;
                while (i37 < childCount3) {
                    View childAt3 = getChildAt(i37);
                    C0793 c0793M56 = m54(childAt3);
                    if (c0793M56 != null) {
                        C0783 c0784 = (C0783) childAt3.getLayoutParams();
                        c07912.f3135.add(c0793M56);
                        C0793 c07913 = c0793M56.f3112;
                        if (c07913 != null) {
                            ((C0794) c07913).f3135.remove(c0793M56);
                            c0793M56.mo2325();
                        }
                        c0793M56.f3112 = c07912;
                        c0784.m2291();
                        c0793M56.f3125 = childAt3.getVisibility();
                        c0793M56.f3124 = childAt3;
                        if (childAt3 instanceof AbstractC0781) {
                            ((AbstractC0781) childAt3).mo51(c0793M56, c07912.f3139);
                        }
                        if (c0784.f2949) {
                            C1506 c1506 = (C1506) c0793M56;
                            int i38 = c0784.f2958;
                            int i39 = c0784.f2959;
                            float f5 = c0784.f2960;
                            if (f5 == -1.0f) {
                                b = -1;
                                if (i38 != -1) {
                                    if (i38 > -1) {
                                        c1506.f5317 = -1.0f;
                                        c1506.f5318 = i38;
                                        c1506.f5319 = -1;
                                    }
                                } else if (i39 != -1 && i39 > -1) {
                                    c1506.f5317 = -1.0f;
                                    c1506.f5318 = -1;
                                    c1506.f5319 = i39;
                                }
                            } else if (f5 > -1.0f) {
                                c1506.f5317 = f5;
                                b = -1;
                                c1506.f5318 = -1;
                                c1506.f5319 = -1;
                            }
                        } else {
                            int i40 = c0784.f2951;
                            int i41 = c0784.f2952;
                            int i42 = c0784.f2953;
                            int i43 = c0784.f2954;
                            int i44 = c0784.f2955;
                            int i45 = c0784.f2956;
                            float f6 = c0784.f2957;
                            i37 = i37;
                            int i46 = c0784.f2911;
                            if (i46 != -1) {
                                C0793 c07914 = (C0793) sparseArray2.get(i46);
                                if (c07914 != null) {
                                    float f7 = c0784.f2913;
                                    f4 = 0.0f;
                                    c0793M56.m2320(7, 7, c0784.f2912, 0, c07914);
                                    c0793M56.f3096 = f7;
                                } else {
                                    f4 = 0.0f;
                                }
                                c0783 = c0784;
                                zIsInEditMode = zIsInEditMode;
                                childCount3 = childCount3;
                                i13 = 5;
                                i12 = 3;
                                f2 = f4;
                            } else {
                                c0783 = c0784;
                                if (i40 != -1) {
                                    C0793 c07915 = (C0793) sparseArray2.get(i40);
                                    if (c07915 != null) {
                                        i4 = i42;
                                        zIsInEditMode = zIsInEditMode;
                                        i6 = i43;
                                        i3 = -1;
                                        i5 = 2;
                                        childCount3 = childCount3;
                                        f = f6;
                                        c0793M56.m2320(2, 2, ((ViewGroup.MarginLayoutParams) c0783).leftMargin, i44, c07915);
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
                                    if (i41 != -1 && (c0793 = (C0793) sparseArray2.get(i41)) != null) {
                                        c0793M56.m2320(2, 4, ((ViewGroup.MarginLayoutParams) c0783).leftMargin, i44, c0793);
                                        i7 = 2;
                                        i8 = 4;
                                    }
                                    if (i4 != i3) {
                                        c07910 = (C0793) sparseArray2.get(i4);
                                        if (c07910 != null) {
                                            c0793M56.m2320(i8, i7, ((ViewGroup.MarginLayoutParams) c0783).rightMargin, i45, c07910);
                                        }
                                    } else if (i6 != i3 && (c0794 = (C0793) sparseArray2.get(i6)) != null) {
                                        c0793M56.m2320(i8, i8, ((ViewGroup.MarginLayoutParams) c0783).rightMargin, i45, c0794);
                                    }
                                    i9 = c0783.f2906;
                                    if (i9 != i3) {
                                        c0799 = (C0793) sparseArray2.get(i9);
                                        if (c0799 != null) {
                                            i17 = 3;
                                            c0793M56.m2320(3, 3, ((ViewGroup.MarginLayoutParams) c0783).topMargin, c0783.f2919, c0799);
                                        } else {
                                            i17 = 3;
                                        }
                                        i12 = i17;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = c0783.f2907;
                                        if (i10 != -1 || (c0795 = (C0793) sparseArray2.get(i10)) == null) {
                                            i11 = -1;
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            i11 = -1;
                                            c0793M56.m2320(3, 5, ((ViewGroup.MarginLayoutParams) c0783).topMargin, c0783.f2919, c0795);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = c0783.f2908;
                                    if (i14 != i11) {
                                        c0798 = (C0793) sparseArray2.get(i14);
                                        if (c0798 != null) {
                                            c0793M56.m2320(i13, i12, ((ViewGroup.MarginLayoutParams) c0783).bottomMargin, c0783.f2921, c0798);
                                        }
                                    } else {
                                        i15 = c0783.f2909;
                                        if (i15 == i11 && (c0796 = (C0793) sparseArray2.get(i15)) != null) {
                                            c0793M56.m2320(i13, i13, ((ViewGroup.MarginLayoutParams) c0783).bottomMargin, c0783.f2921, c0796);
                                        }
                                        i16 = c0783.f2910;
                                        if (i16 != -1) {
                                            view = (View) sparseArray.get(i16);
                                            c0797 = (C0793) sparseArray2.get(c0783.f2910);
                                            if (c0797 != null && view != null && (view.getLayoutParams() instanceof C0783)) {
                                                C0783 c0785 = (C0783) view.getLayoutParams();
                                                boolean z8 = z7;
                                                c0783.f2948 = z8;
                                                c0785.f2948 = z8;
                                                c0793M56.mo2311(6).m2271(c0797.mo2311(6), 0, -1, z8);
                                                c0793M56.f3097 = z8;
                                                c0785.f2961.f3097 = z8;
                                                c0793M56.mo2311(i12).m2279();
                                                c0793M56.mo2311(i13).m2279();
                                            }
                                        }
                                        f2 = 0.0f;
                                        if (f >= 0.0f) {
                                            c0793M56.f3122 = f;
                                        }
                                        f3 = c0783.f2925;
                                        if (f3 >= 0.0f) {
                                            c0793M56.f3123 = f3;
                                        }
                                    }
                                    i16 = c0783.f2910;
                                    if (i16 != -1) {
                                        view = (View) sparseArray.get(i16);
                                        c0797 = (C0793) sparseArray2.get(c0783.f2910);
                                        if (c0797 != null) {
                                            C0783 c0786 = (C0783) view.getLayoutParams();
                                            boolean z9 = z7;
                                            c0783.f2948 = z9;
                                            c0786.f2948 = z9;
                                            c0793M56.mo2311(6).m2271(c0797.mo2311(6), 0, -1, z9);
                                            c0793M56.f3097 = z9;
                                            c0786.f2961.f3097 = z9;
                                            c0793M56.mo2311(i12).m2279();
                                            c0793M56.mo2311(i13).m2279();
                                        }
                                    }
                                    f2 = 0.0f;
                                    if (f >= 0.0f) {
                                        c0793M56.f3122 = f;
                                    }
                                    f3 = c0783.f2925;
                                    if (f3 >= 0.0f) {
                                        c0793M56.f3123 = f3;
                                    }
                                }
                                i7 = i5;
                                i8 = 4;
                                if (i4 != i3) {
                                    c07910 = (C0793) sparseArray2.get(i4);
                                    if (c07910 != null) {
                                        c0793M56.m2320(i8, i7, ((ViewGroup.MarginLayoutParams) c0783).rightMargin, i45, c07910);
                                    }
                                } else if (i6 != i3) {
                                    c0793M56.m2320(i8, i8, ((ViewGroup.MarginLayoutParams) c0783).rightMargin, i45, c0794);
                                }
                                i9 = c0783.f2906;
                                if (i9 != i3) {
                                    c0799 = (C0793) sparseArray2.get(i9);
                                    if (c0799 != null) {
                                        i17 = 3;
                                        c0793M56.m2320(3, 3, ((ViewGroup.MarginLayoutParams) c0783).topMargin, c0783.f2919, c0799);
                                    } else {
                                        i17 = 3;
                                    }
                                    i12 = i17;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = c0783.f2907;
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
                                i14 = c0783.f2908;
                                if (i14 != i11) {
                                    c0798 = (C0793) sparseArray2.get(i14);
                                    if (c0798 != null) {
                                        c0793M56.m2320(i13, i12, ((ViewGroup.MarginLayoutParams) c0783).bottomMargin, c0783.f2921, c0798);
                                    }
                                } else {
                                    i15 = c0783.f2909;
                                    if (i15 == i11) {
                                    }
                                    i16 = c0783.f2910;
                                    if (i16 != -1) {
                                        view = (View) sparseArray.get(i16);
                                        c0797 = (C0793) sparseArray2.get(c0783.f2910);
                                        if (c0797 != null) {
                                            C0783 c0787 = (C0783) view.getLayoutParams();
                                            boolean z10 = z7;
                                            c0783.f2948 = z10;
                                            c0787.f2948 = z10;
                                            c0793M56.mo2311(6).m2271(c0797.mo2311(6), 0, -1, z10);
                                            c0793M56.f3097 = z10;
                                            c0787.f2961.f3097 = z10;
                                            c0793M56.mo2311(i12).m2279();
                                            c0793M56.mo2311(i13).m2279();
                                        }
                                    }
                                    f2 = 0.0f;
                                    if (f >= 0.0f) {
                                        c0793M56.f3122 = f;
                                    }
                                    f3 = c0783.f2925;
                                    if (f3 >= 0.0f) {
                                        c0793M56.f3123 = f3;
                                    }
                                }
                                i16 = c0783.f2910;
                                if (i16 != -1) {
                                    view = (View) sparseArray.get(i16);
                                    c0797 = (C0793) sparseArray2.get(c0783.f2910);
                                    if (c0797 != null) {
                                        C0783 c0788 = (C0783) view.getLayoutParams();
                                        boolean z11 = z7;
                                        c0783.f2948 = z11;
                                        c0788.f2948 = z11;
                                        c0793M56.mo2311(6).m2271(c0797.mo2311(6), 0, -1, z11);
                                        c0793M56.f3097 = z11;
                                        c0788.f2961.f3097 = z11;
                                        c0793M56.mo2311(i12).m2279();
                                        c0793M56.mo2311(i13).m2279();
                                    }
                                }
                                f2 = 0.0f;
                                if (f >= 0.0f) {
                                    c0793M56.f3122 = f;
                                }
                                f3 = c0783.f2925;
                                if (f3 >= 0.0f) {
                                    c0793M56.f3123 = f3;
                                }
                            }
                            if (zIsInEditMode && ((i21 = c0783.f2940) != -1 || c0783.f2941 != -1)) {
                                int i47 = c0783.f2941;
                                c0793M56.f3117 = i21;
                                c0793M56.f3118 = i47;
                            }
                            if (c0783.f2946) {
                                c0793M56.m2332(1);
                                c0793M56.m2334(((ViewGroup.MarginLayoutParams) c0783).width);
                                if (((ViewGroup.MarginLayoutParams) c0783).width == -2) {
                                    c0793M56.m2332(i34);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0783).width == -1) {
                                if (c0783.f2943) {
                                    c0793M56.m2332(3);
                                } else {
                                    c0793M56.m2332(4);
                                }
                                c0793M56.mo2311(2).f2882 = ((ViewGroup.MarginLayoutParams) c0783).leftMargin;
                                c0793M56.mo2311(4).f2882 = ((ViewGroup.MarginLayoutParams) c0783).rightMargin;
                            } else {
                                c0793M56.m2332(3);
                                c0793M56.m2334(0);
                            }
                            if (c0783.f2947) {
                                i18 = -1;
                                c0793M56.m2333(1);
                                c0793M56.m2331(((ViewGroup.MarginLayoutParams) c0783).height);
                                if (((ViewGroup.MarginLayoutParams) c0783).height == -2) {
                                    c0793M56.m2333(2);
                                }
                            } else {
                                i18 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0783).height == -1) {
                                    if (c0783.f2944) {
                                        c0793M56.m2333(3);
                                    } else {
                                        c0793M56.m2333(4);
                                    }
                                    c0793M56.mo2311(i12).f2882 = ((ViewGroup.MarginLayoutParams) c0783).topMargin;
                                    c0793M56.mo2311(i13).f2882 = ((ViewGroup.MarginLayoutParams) c0783).bottomMargin;
                                } else {
                                    c0793M56.m2333(3);
                                    c0793M56.m2331(0);
                                }
                            }
                            String str2 = c0783.f2926;
                            if (str2 == null || str2.length() == 0) {
                                c0793M56.f3115 = f2;
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
                                    c0793M56.f3115 = fAbs;
                                    c0793M56.f3116 = i19;
                                }
                            }
                            float f10 = c0783.f2928;
                            float[] fArr = c0793M56.f3129;
                            fArr[0] = f10;
                            z7 = true;
                            fArr[1] = c0783.f2929;
                            c0793M56.f3127 = c0783.f2930;
                            c0793M56.f3128 = c0783.f2931;
                            int i48 = c0783.f2932;
                            int i49 = c0783.f2934;
                            int i50 = c0783.f2936;
                            float f11 = c0783.f2938;
                            c0793M56.f3084 = i48;
                            c0793M56.f3087 = i49;
                            if (i50 == Integer.MAX_VALUE) {
                                i50 = 0;
                            }
                            c0793M56.f3088 = i50;
                            c0793M56.f3089 = f11;
                            if (f11 > f2 && f11 < 1.0f && i48 == 0) {
                                c0793M56.f3084 = 2;
                            }
                            int i51 = c0783.f2933;
                            int i52 = c0783.f2935;
                            int i53 = c0783.f2937;
                            float f12 = c0783.f2939;
                            c0793M56.f3085 = i51;
                            c0793M56.f3090 = i52;
                            if (i53 == Integer.MAX_VALUE) {
                                i53 = 0;
                            }
                            c0793M56.f3091 = i53;
                            c0793M56.f3092 = f12;
                            if (f12 <= f2 || f12 >= 1.0f || i51 != 0) {
                                i34 = 2;
                            } else {
                                i34 = 2;
                                c0793M56.f3085 = 2;
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
                c07912.f3136.m1331(c07912);
            }
        }
        m58(c07912, this.f205, i, i2);
        m57(i, i2, c07912.m2316(), c07912.m2313(), c07912.f3148, c07912.f3149);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0793 c0793M54 = m54(view);
        if ((view instanceof C1505) && !(c0793M54 instanceof C1506)) {
            C0783 c0783 = (C0783) view.getLayoutParams();
            C1506 c1506 = new C1506();
            c0783.f2961 = c1506;
            c0783.f2949 = true;
            c1506.m3245(c0783.f2942);
        }
        if (view instanceof AbstractC0781) {
            AbstractC0781 abstractC0781 = (AbstractC0781) view;
            abstractC0781.m2290();
            ((C0783) view.getLayoutParams()).f2950 = true;
            ArrayList arrayList = this.f198;
            if (!arrayList.contains(abstractC0781)) {
                arrayList.add(abstractC0781);
            }
        }
        this.f197.put(view.getId(), view);
        this.f204 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f197.remove(view.getId());
        C0793 c0793M54 = m54(view);
        this.f199.f3135.remove(c0793M54);
        c0793M54.mo2325();
        this.f198.remove(view);
        this.f204 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f204 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0792 c0792) {
        this.f206 = c0792;
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

    public void setOnConstraintsChanged(AbstractC0795 abstractC0795) {
        C0542 c0542 = this.f207;
        if (c0542 != null) {
            c0542.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f205 = i;
        C0794 c0794 = this.f199;
        c0794.f3147 = i;
        C1791.f5968 = c0794.m2343(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0793 m54(View view) {
        if (view == this) {
            return this.f199;
        }
        if (view == null) {
            return null;
        }
        return ((C0783) view.getLayoutParams()).f2961;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m55(AttributeSet attributeSet, int i) {
        C0794 c0794 = this.f199;
        c0794.f3124 = this;
        C0784 c0784 = this.f211;
        c0794.f3138 = c0784;
        c0794.f3137.f3698 = c0784;
        this.f197.put(getId(), this);
        this.f206 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2461.f7810, i, 0);
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
                        C0792 c0792 = new C0792();
                        this.f206 = c0792;
                        c0792.m2304(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f206 = null;
                    }
                    this.f208 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0794.f3147 = this.f205;
        C1791.f5968 = c0794.m2343(512);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[Catch: IOException -> 0x0053, XmlPullParserException -> 0x0055, TryCatch #2 {IOException -> 0x0053, XmlPullParserException -> 0x0055, blocks: (B:3:0x0021, B:36:0x00a6, B:10:0x0030, B:11:0x0038, B:34:0x008c, B:13:0x003c, B:15:0x0044, B:17:0x004b, B:22:0x0057, B:25:0x0060, B:28:0x0069, B:30:0x0071, B:31:0x0080, B:33:0x0088, B:35:0x00a3), top: B:42:0x0021 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x008c, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m56(int i) {
        Context context = getContext();
        C0542 c0542 = new C0542(7, false);
        c0542.f2252 = new SparseArray();
        c0542.f2253 = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0785 c0785 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0542.m1904(context, xml);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c0785 = new C0785(context, xml);
                                ((SparseArray) c0542.f2252).put(c0785.f2970, c0785);
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
                                C0786 c0786 = new C0786(context, xml);
                                if (c0785 != null) {
                                    ((ArrayList) c0785.f2972).add(c0786);
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
        this.f207 = c0542;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m57(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0784 c0784 = this.f211;
        int i5 = c0784.f2966;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c0784.f2965, i, 0);
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
    public final void m58(C0794 c0794, int i, int i2, int i3) {
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
        C0784 c0784;
        int i7;
        boolean zM2341;
        boolean z3;
        int i8;
        int i9;
        C0784 c0785;
        int i10;
        boolean z4;
        C0784 c0786;
        int i11;
        C1564 c1564;
        C3549 c3549;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        Iterator it;
        boolean z6;
        AbstractC3640 abstractC3640;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C0784 c0787 = this.f211;
        c0787.f2963 = iMax3;
        c0787.f2964 = iMax4;
        c0787.f2965 = paddingWidth;
        c0787.f2966 = i18;
        c0787.f2967 = i2;
        c0787.f2968 = i3;
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
        int i22 = c0787.f2966;
        int i23 = c0787.f2965;
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
        int iM2316 = c0794.m2316();
        C1013 c1013 = c0794.f3137;
        int[] iArr = c0794.f3095;
        int i24 = iMin;
        if (i24 == iM2316 && iMin2 == c0794.m2313()) {
            c = 1;
        } else {
            c1013.f3695 = true;
            c = 1;
        }
        c0794.f3117 = 0;
        c0794.f3118 = 0;
        iArr[0] = this.f202 - i23;
        iArr[c] = this.f203 - i22;
        c0794.f3120 = 0;
        c0794.f3121 = 0;
        c0794.m2332(i19);
        c0794.m2334(i24);
        c0794.m2333(i4);
        c0794.m2331(iMin2);
        int i25 = this.f200 - i23;
        if (i25 < 0) {
            c0794.f3120 = 0;
        } else {
            c0794.f3120 = i25;
        }
        int i26 = this.f201 - i22;
        if (i26 < 0) {
            c0794.f3121 = 0;
        } else {
            c0794.f3121 = i26;
        }
        c0794.f3141 = iMax5;
        c0794.f3142 = iMax3;
        C0243 c0243 = c0794.f3136;
        C0794 c0795 = (C0794) c0243.f1406;
        ArrayList arrayList = (ArrayList) c0243.f1404;
        C0784 c0788 = c0794.f3138;
        int size3 = c0794.f3135.size();
        int iM2317 = c0794.m2316();
        int iM2313 = c0794.m2313();
        boolean zM3968 = AbstractC2201.m3968(i, 128);
        boolean z7 = zM3968 || AbstractC2201.m3968(i, 64);
        if (z7) {
            int i27 = 0;
            while (true) {
                if (i27 < size3) {
                    boolean z8 = z7;
                    C0793 c0793 = (C0793) c0794.f3135.get(i27);
                    int i28 = i27;
                    int[] iArr2 = c0793.f3134;
                    i5 = size3;
                    boolean z9 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0793.f3115 > 0.0f;
                    if ((c0793.m2322() && z9) || ((c0793.m2323() && z9) || (c0793 instanceof C1367) || c0793.m2322() || c0793.m2323())) {
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
        boolean z10 = z & ((mode == i6 && mode2 == i6) || zM3968);
        if (z10) {
            int iMin3 = Math.min(iArr[0], i20);
            int iMin4 = Math.min(iArr[1], i21);
            int i29 = 1073741824;
            if (mode == 1073741824) {
                if (c0794.m2316() != iMin3) {
                    c0794.m2334(iMin3);
                    c1013.f3694 = true;
                }
                i29 = 1073741824;
            }
            if (mode2 == i29 && c0794.m2313() != iMin4) {
                c0794.m2331(iMin4);
                c1013.f3694 = true;
            }
            if (mode == i29 && mode2 == i29) {
                ArrayList<AbstractC3640> arrayList2 = c1013.f3697;
                C0794 c0796 = c1013.f3693;
                if (c1013.f3694 || c1013.f3695) {
                    for (C0793 c0797 : c0796.f3135) {
                        c0797.m2310();
                        c0797.f3073 = false;
                        c0797.f3076.m3274();
                        c0797.f3077.m5142();
                        z10 = z10;
                    }
                    z2 = z10;
                    c0796.m2310();
                    i14 = 0;
                    c0796.f3073 = false;
                    c0796.f3076.m3274();
                    c0796.f3077.m5142();
                    c1013.f3695 = false;
                } else {
                    z2 = z10;
                    i14 = 0;
                }
                c1013.m2580(c1013.f3696);
                c0796.f3117 = i14;
                int[] iArr3 = c0796.f3134;
                c0796.f3118 = i14;
                int iM2312 = c0796.m2312(i14);
                int iM2314 = c0796.m2312(1);
                if (c1013.f3694) {
                    c1013.m2581();
                }
                int iM2318 = c0796.m2317();
                int iM2319 = c0796.m2318();
                c0784 = c0788;
                c0796.f3076.f11393.mo2588(iM2318);
                c0796.f3077.f11393.mo2588(iM2319);
                c1013.m2585();
                if (iM2312 == 2 || iM2314 == 2) {
                    if (zM3968) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((AbstractC3640) it2.next()).mo2008()) {
                                zM3968 = false;
                                break;
                            }
                        }
                    }
                    if (zM3968 && iM2312 == 2) {
                        c0796.m2332(1);
                        c0796.m2334(c1013.m2582(c0796, 0));
                        c0796.f3076.f11390.mo2588(c0796.m2316());
                    }
                    if (zM3968 && iM2314 == 2) {
                        i15 = 1;
                        c0796.m2333(1);
                        c0796.m2331(c1013.m2582(c0796, 1));
                        c0796.f3077.f11390.mo2588(c0796.m2313());
                    }
                    i16 = iArr3[0];
                    if (i16 != i15 || i16 == 4) {
                        int iM23110 = c0796.m2316() + iM2318;
                        c0796.f3076.f11394.mo2588(iM23110);
                        c0796.f3076.f11390.mo2588(iM23110 - iM2318);
                        c1013.m2585();
                        i17 = iArr3[1];
                        if (i17 != 1 || i17 == 4) {
                            int iM2315 = c0796.m2313() + iM2319;
                            c0796.f3077.f11394.mo2588(iM2315);
                            c0796.f3077.f11390.mo2588(iM2315 - iM2319);
                        }
                        c1013.m2585();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (AbstractC3640 abstractC3641 : arrayList2) {
                        if (abstractC3641.f11387 == c0796 || abstractC3641.f11392) {
                            abstractC3641.mo2005();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z6 = true;
                            break;
                        }
                        abstractC3640 = (AbstractC3640) it.next();
                        if (!z5 || abstractC3640.f11387 != c0796) {
                            if (abstractC3640.f11393.f3710 || ((!abstractC3640.f11394.f3710 && !(abstractC3640 instanceof C1507)) || (!abstractC3640.f11390.f3710 && !(abstractC3640 instanceof C0582) && !(abstractC3640 instanceof C1507)))) {
                                z6 = false;
                                break;
                            }
                        }
                    }
                    c0796.m2332(iM2312);
                    c0796.m2333(iM2314);
                    zM2341 = z6;
                    i7 = 2;
                    i13 = 1073741824;
                } else {
                    iM2318 = iM2318;
                }
                i15 = 1;
                i16 = iArr3[0];
                if (i16 != i15) {
                    int iM23111 = c0796.m2316() + iM2318;
                    c0796.f3076.f11394.mo2588(iM23111);
                    c0796.f3076.f11390.mo2588(iM23111 - iM2318);
                    c1013.m2585();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iM23112 = c0796.m2313() + iM2319;
                        c0796.f3077.f11394.mo2588(iM23112);
                        c0796.f3077.f11390.mo2588(iM23112 - iM2319);
                    } else {
                        int iM23113 = c0796.m2313() + iM2319;
                        c0796.f3077.f11394.mo2588(iM23113);
                        c0796.f3077.f11390.mo2588(iM23113 - iM2319);
                    }
                    c1013.m2585();
                    z5 = true;
                } else {
                    int iM23114 = c0796.m2316() + iM2318;
                    c0796.f3076.f11394.mo2588(iM23114);
                    c0796.f3076.f11390.mo2588(iM23114 - iM2318);
                    c1013.m2585();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iM23115 = c0796.m2313() + iM2319;
                        c0796.f3077.f11394.mo2588(iM23115);
                        c0796.f3077.f11390.mo2588(iM23115 - iM2319);
                    } else {
                        int iM23116 = c0796.m2313() + iM2319;
                        c0796.f3077.f11394.mo2588(iM23116);
                        c0796.f3077.f11390.mo2588(iM23116 - iM2319);
                    }
                    c1013.m2585();
                    z5 = true;
                }
                while (r6.hasNext()) {
                    if (abstractC3641.f11387 == c0796) {
                    }
                    abstractC3641.mo2005();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    abstractC3640 = (AbstractC3640) it.next();
                    if (!z5) {
                    }
                    if (abstractC3640.f11393.f3710) {
                    }
                    z6 = false;
                    break;
                }
                c0796.m2332(iM2312);
                c0796.m2333(iM2314);
                zM2341 = z6;
                i7 = 2;
                i13 = 1073741824;
            } else {
                z2 = z10;
                c0784 = c0788;
                C0794 c0798 = c1013.f3693;
                if (c1013.f3694) {
                    for (C0793 c0799 : c0798.f3135) {
                        c0799.m2310();
                        c0799.f3073 = false;
                        C1564 c1565 = c0799.f3076;
                        c1565.f11390.f3710 = false;
                        c1565.f11392 = false;
                        c1565.m3274();
                        C3549 c35410 = c0799.f3077;
                        c35410.f11390.f3710 = false;
                        c35410.f11392 = false;
                        c35410.m5142();
                    }
                    i12 = 0;
                    c0798.m2310();
                    c0798.f3073 = false;
                    C1564 c1566 = c0798.f3076;
                    c1566.f11390.f3710 = false;
                    c1566.f11392 = false;
                    c1566.m3274();
                    C3549 c35411 = c0798.f3077;
                    c35411.f11390.f3710 = false;
                    c35411.f11392 = false;
                    c35411.m5142();
                    c1013.m2581();
                } else {
                    i12 = 0;
                }
                c1013.m2580(c1013.f3696);
                c0798.f3117 = i12;
                c0798.f3118 = i12;
                c0798.f3076.f11393.mo2588(i12);
                c0798.f3077.f11393.mo2588(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zM2341 = c0794.m2341(i12, zM3968);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM2341 = true;
                }
                if (mode2 == 1073741824) {
                    zM2341 &= c0794.m2341(1, zM3968);
                    i7++;
                }
            }
            if (zM2341) {
                c0794.mo2335(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z10;
            c0784 = c0788;
            i7 = 0;
            zM2341 = false;
        }
        if (zM2341 && i7 == 2) {
            return;
        }
        int i30 = c0794.f3147;
        if (i5 > 0) {
            int size4 = c0794.f3135.size();
            boolean zM2343 = c0794.m2343(64);
            C0784 c0789 = c0794.f3138;
            int i31 = 0;
            while (i31 < size4) {
                C0793 c07910 = (C0793) c0794.f3135.get(i31);
                if ((c07910 instanceof C1506) || (c07910 instanceof C0367) || c07910.f3098 || (zM2343 && (c1564 = c07910.f3076) != null && (c3549 = c07910.f3077) != null && c1564.f11390.f3710 && c3549.f11390.f3710)) {
                    i11 = size4;
                } else {
                    int iM23117 = c07910.m2312(0);
                    int iM23118 = c07910.m2312(1);
                    i11 = size4;
                    boolean z11 = iM23117 == 3 && c07910.f3084 != 1 && iM23118 == 3 && c07910.f3085 != 1;
                    if (!z11 && c0794.m2343(1) && !(c07910 instanceof C1367)) {
                        if (iM23117 == 3 && c07910.f3084 == 0 && iM23118 != 3 && !c07910.m2322()) {
                            z11 = true;
                        }
                        if (iM23118 == 3 && c07910.f3085 == 0 && iM23117 != 3 && !c07910.m2322()) {
                            z11 = true;
                        }
                        if ((iM23117 == 3 || iM23118 == 3) && c07910.f3115 > 0.0f) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        c0243.m1326(c0789, c07910, 0);
                    }
                }
                i31++;
                size4 = i11;
            }
            ConstraintLayout constraintLayout = c0789.f2962;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.f198;
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0781) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0243.m1331(c0794);
        int size6 = arrayList.size();
        if (i5 > 0) {
            c0243.m1330(c0794, iM2317, iM2313);
        }
        if (size6 > 0) {
            int[] iArr4 = c0794.f3134;
            boolean z12 = iArr4[0] == 2;
            boolean z13 = iArr4[1] == 2;
            int iMax7 = Math.max(c0794.m2316(), c0795.f3120);
            int iMax8 = Math.max(c0794.m2313(), c0795.f3121);
            int i34 = 0;
            boolean z14 = false;
            while (i34 < size6) {
                C0793 c07911 = (C0793) arrayList.get(i34);
                if (c07911 instanceof C1367) {
                    int iM23119 = c07911.m2316();
                    int iM23120 = c07911.m2313();
                    z4 = z13;
                    c0786 = c0784;
                    boolean zM1326 = z14 | c0243.m1326(c0786, c07911, 1);
                    int iM23121 = c07911.m2316();
                    boolean z15 = zM1326;
                    int iM23122 = c07911.m2313();
                    if (iM23121 != iM23119) {
                        c07911.m2334(iM23121);
                        if (z12 && c07911.m2317() + c07911.f3113 > iMax7) {
                            iMax7 = Math.max(iMax7, c07911.mo2311(4).m2274() + c07911.m2317() + c07911.f3113);
                        }
                        z15 = true;
                    }
                    if (iM23122 != iM23120) {
                        c07911.m2331(iM23122);
                        if (z4 && c07911.m2318() + c07911.f3114 > iMax8) {
                            iMax8 = Math.max(iMax8, c07911.mo2311(5).m2274() + c07911.m2318() + c07911.f3114);
                        }
                        z15 = true;
                    }
                    z14 = z15 | ((C1367) c07911).f4899;
                } else {
                    z4 = z13;
                    c0786 = c0784;
                }
                i34++;
                c0784 = c0786;
                z13 = z4;
            }
            boolean z16 = z13;
            int i35 = 0;
            while (true) {
                C0784 c07810 = c0784;
                if (i35 >= 2) {
                    break;
                }
                boolean zM1327 = z14;
                int i36 = 0;
                while (i36 < size6) {
                    C0793 c07912 = (C0793) arrayList.get(i36);
                    if ((!(c07912 instanceof AbstractC1532) || (c07912 instanceof C1367)) && !(c07912 instanceof C1506)) {
                        i8 = size6;
                        if (c07912.f3125 != 8 && ((!z2 || !c07912.f3076.f11390.f3710 || !c07912.f3077.f11390.f3710) && !(c07912 instanceof C1367))) {
                            int iM23123 = c07912.m2316();
                            int iM23124 = c07912.m2313();
                            i9 = i36;
                            int i37 = c07912.f3119;
                            zM1327 |= c0243.m1326(c07810, c07912, i35 == 1 ? 2 : 1);
                            c0785 = c07810;
                            int iM23125 = c07912.m2316();
                            i10 = i35;
                            int iM23126 = c07912.m2313();
                            if (iM23125 != iM23123) {
                                c07912.m2334(iM23125);
                                if (z12 && c07912.m2317() + c07912.f3113 > iMax7) {
                                    iMax7 = Math.max(iMax7, c07912.mo2311(4).m2274() + c07912.m2317() + c07912.f3113);
                                }
                                zM1327 = true;
                            }
                            if (iM23126 != iM23124) {
                                c07912.m2331(iM23126);
                                if (z16 && c07912.m2318() + c07912.f3114 > iMax8) {
                                    iMax8 = Math.max(iMax8, c07912.mo2311(5).m2274() + c07912.m2318() + c07912.f3114);
                                }
                                zM1327 = true;
                            }
                            if (c07912.f3097 && i37 != c07912.f3119) {
                                zM1327 = true;
                            }
                        }
                        i36 = i9 + 1;
                        size6 = i8;
                        i35 = i10;
                        c07810 = c0785;
                    } else {
                        i8 = size6;
                    }
                    c0785 = c07810;
                    i10 = i35;
                    i9 = i36;
                    i36 = i9 + 1;
                    size6 = i8;
                    i35 = i10;
                    c07810 = c0785;
                }
                int i38 = size6;
                c0784 = c07810;
                int i39 = i35;
                boolean z17 = zM1327;
                if (!z17) {
                    z14 = z17;
                    break;
                }
                c0243.m1330(c0794, iM2317, iM2313);
                i35 = i39 + 1;
                size6 = i38;
                z14 = false;
            }
            if (z14) {
                c0243.m1330(c0794, iM2317, iM2313);
                if (c0794.m2316() < iMax7) {
                    c0794.m2334(iMax7);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c0794.m2313() < iMax8) {
                    c0794.m2331(iMax8);
                    z3 = true;
                }
                if (z3) {
                    c0243.m1330(c0794, iM2317, iM2313);
                }
            }
        }
        c0794.f3147 = i30;
        C1791.f5968 = c0794.m2343(512);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197 = new SparseArray();
        this.f198 = new ArrayList(4);
        this.f199 = new C0794();
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
        this.f211 = new C0784(this, this);
        this.f212 = 0;
        this.f213 = 0;
        m55(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0783 c0783 = new C0783(layoutParams);
        c0783.f2899 = -1;
        c0783.f2900 = -1;
        c0783.f2901 = -1.0f;
        c0783.f2902 = -1;
        c0783.f2903 = -1;
        c0783.f2904 = -1;
        c0783.f2905 = -1;
        c0783.f2906 = -1;
        c0783.f2907 = -1;
        c0783.f2908 = -1;
        c0783.f2909 = -1;
        c0783.f2910 = -1;
        c0783.f2911 = -1;
        c0783.f2912 = 0;
        c0783.f2913 = 0.0f;
        c0783.f2914 = -1;
        c0783.f2915 = -1;
        c0783.f2916 = -1;
        c0783.f2917 = -1;
        c0783.f2918 = -1;
        c0783.f2919 = -1;
        c0783.f2920 = -1;
        c0783.f2921 = -1;
        c0783.f2922 = -1;
        c0783.f2923 = -1;
        c0783.f2924 = 0.5f;
        c0783.f2925 = 0.5f;
        c0783.f2926 = null;
        c0783.f2927 = 1;
        c0783.f2928 = -1.0f;
        c0783.f2929 = -1.0f;
        c0783.f2930 = 0;
        c0783.f2931 = 0;
        c0783.f2932 = 0;
        c0783.f2933 = 0;
        c0783.f2934 = 0;
        c0783.f2935 = 0;
        c0783.f2936 = 0;
        c0783.f2937 = 0;
        c0783.f2938 = 1.0f;
        c0783.f2939 = 1.0f;
        c0783.f2940 = -1;
        c0783.f2941 = -1;
        c0783.f2942 = -1;
        c0783.f2943 = false;
        c0783.f2944 = false;
        c0783.f2945 = null;
        c0783.f2946 = true;
        c0783.f2947 = true;
        c0783.f2948 = false;
        c0783.f2949 = false;
        c0783.f2950 = false;
        c0783.f2951 = -1;
        c0783.f2952 = -1;
        c0783.f2953 = -1;
        c0783.f2954 = -1;
        c0783.f2955 = -1;
        c0783.f2956 = -1;
        c0783.f2957 = 0.5f;
        c0783.f2961 = new C0793();
        return c0783;
    }
}
