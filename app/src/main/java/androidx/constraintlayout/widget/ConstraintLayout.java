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
import p000.AbstractC0548Ujhhgtgfeyxiexzf;
import p000.AbstractC0773feyxiexzfUjhhgtg;
import p000.AbstractC2229feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.AbstractC3643Ujhhgtgfeyxiexzf;
import p000.AbstractC3644Ujhhgtgfeyxiexzf;
import p000.AbstractC3657Ujhhgtgfeyxiexzf;
import p000.C0072Ujhhgtgfeyxiexzf;
import p000.C0527Ujhhgtgfeyxiexzf;
import p000.C0528Ujhhgtgfeyxiexzf;
import p000.C0546Ujhhgtgfeyxiexzf;
import p000.C0577Ujhhgtgfeyxiexzf;
import p000.C1868feyxiexzfUjhhgtg;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2480feyxiexzfUjhhgtg;
import p000.C2629Ujhhgtgfeyxiexzf;
import p000.C2699Ujhhgtgfeyxiexzf;
import p000.C3258feyxiexzfUjhhgtg;
import p000.C3618Ujhhgtgfeyxiexzf;
import p000.C3645Ujhhgtgfeyxiexzf;
import p000.C3646Ujhhgtgfeyxiexzf;
import p000.C3647Ujhhgtgfeyxiexzf;
import p000.C3648Ujhhgtgfeyxiexzf;
import p000.C3654Ujhhgtgfeyxiexzf;
import p000.C3655Ujhhgtgfeyxiexzf;
import p000.C3656Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final SparseArray f198Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f199Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3656Ujhhgtgfeyxiexzf f200Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f203Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f204Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f205Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f206Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3654Ujhhgtgfeyxiexzf f207Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C2629Ujhhgtgfeyxiexzf f208Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f209Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public HashMap f210Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final SparseArray f211Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C3646Ujhhgtgfeyxiexzf f212Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f213Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f214Ujhhgtgfeyxiexzf;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198Ujhhgtgfeyxiexzf = new SparseArray();
        this.f199Ujhhgtgfeyxiexzf = new ArrayList(4);
        this.f200Ujhhgtgfeyxiexzf = new C3656Ujhhgtgfeyxiexzf();
        this.f201Ujhhgtgfeyxiexzf = 0;
        this.f202Ujhhgtgfeyxiexzf = 0;
        this.f203Ujhhgtgfeyxiexzf = Integer.MAX_VALUE;
        this.f204Ujhhgtgfeyxiexzf = Integer.MAX_VALUE;
        this.f205Ujhhgtgfeyxiexzf = true;
        this.f206Ujhhgtgfeyxiexzf = 257;
        this.f207Ujhhgtgfeyxiexzf = null;
        this.f208Ujhhgtgfeyxiexzf = null;
        this.f209Ujhhgtgfeyxiexzf = -1;
        this.f210Ujhhgtgfeyxiexzf = new HashMap();
        this.f211Ujhhgtgfeyxiexzf = new SparseArray();
        this.f212Ujhhgtgfeyxiexzf = new C3646Ujhhgtgfeyxiexzf(this, this);
        this.f213Ujhhgtgfeyxiexzf = 0;
        this.f214Ujhhgtgfeyxiexzf = 0;
        m55Ujhhgtgfeyxiexzf(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C3645Ujhhgtgfeyxiexzf m53Ujhhgtgfeyxiexzf() {
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = new C3645Ujhhgtgfeyxiexzf(-2, -2);
        c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11409Ujhhgtgfeyxiexzf = 0;
        c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf = 0.0f;
        c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11415Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11417Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11419Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11420feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11421feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg = null;
        c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg = 1;
        c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11427feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11428feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg = 1.0f;
        c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg = 1.0f;
        c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg = false;
        c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg = false;
        c3645Ujhhgtgfeyxiexzf.f11442feyxiexzfUjhhgtg = null;
        c3645Ujhhgtgfeyxiexzf.f11443feyxiexzfUjhhgtg = true;
        c3645Ujhhgtgfeyxiexzf.f11444Ujhhgtgfeyxiexzf = true;
        c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11446Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11447Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11448Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11449Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11450feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11451feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11452feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11453feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11454feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11458feyxiexzfUjhhgtg = new C3655Ujhhgtgfeyxiexzf();
        return c3645Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3645Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f199Ujhhgtgfeyxiexzf;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC3643Ujhhgtgfeyxiexzf) arrayList.get(i)).getClass();
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
        this.f205Ujhhgtgfeyxiexzf = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m53Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = new C3645Ujhhgtgfeyxiexzf(context, attributeSet);
        c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11409Ujhhgtgfeyxiexzf = 0;
        c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf = 0.0f;
        c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11415Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11417Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11419Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11420feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11421feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg = null;
        c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg = 1;
        c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11427feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11428feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg = 1.0f;
        c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg = 1.0f;
        c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg = false;
        c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg = false;
        c3645Ujhhgtgfeyxiexzf.f11442feyxiexzfUjhhgtg = null;
        c3645Ujhhgtgfeyxiexzf.f11443feyxiexzfUjhhgtg = true;
        c3645Ujhhgtgfeyxiexzf.f11444Ujhhgtgfeyxiexzf = true;
        c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11446Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11447Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11448Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11449Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11450feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11451feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11452feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11453feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11454feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11458feyxiexzfUjhhgtg = new C3655Ujhhgtgfeyxiexzf();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3057Ujhhgtgfeyxiexzf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC3644Ujhhgtgfeyxiexzf.f11395Ujhhgtgfeyxiexzf.get(index);
            switch (i3) {
                case 1:
                    c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf = resourceId;
                    if (resourceId == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c3645Ujhhgtgfeyxiexzf.f11409Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11409Ujhhgtgfeyxiexzf);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf) % 360.0f;
                    c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf = f;
                    if (f < 0.0f) {
                        c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf);
                    break;
                case 6:
                    c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf);
                    break;
                case 7:
                    c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf = resourceId2;
                    if (resourceId2 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf = resourceId3;
                    if (resourceId3 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf = resourceId4;
                    if (resourceId4 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf = resourceId5;
                    if (resourceId5 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf = resourceId6;
                    if (resourceId6 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf = resourceId7;
                    if (resourceId7 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf = resourceId8;
                    if (resourceId8 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf = resourceId9;
                    if (resourceId9 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf = resourceId10;
                    if (resourceId10 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf = resourceId11;
                    if (resourceId11 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf = resourceId12;
                    if (resourceId12 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf = resourceId13;
                    if (resourceId13 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf);
                    c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf = resourceId14;
                    if (resourceId14 == -1) {
                        c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case Opcodes.ILOAD /* 21 */:
                    c3645Ujhhgtgfeyxiexzf.f11415Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11415Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.LLOAD /* 22 */:
                    c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.FLOAD /* 23 */:
                    c3645Ujhhgtgfeyxiexzf.f11417Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11417Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.DLOAD /* 24 */:
                    c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.ALOAD /* 25 */:
                    c3645Ujhhgtgfeyxiexzf.f11419Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11419Ujhhgtgfeyxiexzf);
                    break;
                case 26:
                    c3645Ujhhgtgfeyxiexzf.f11420feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11420feyxiexzfUjhhgtg);
                    break;
                case 27:
                    c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getBoolean(index, c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg);
                    break;
                case 28:
                    c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getBoolean(index, c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg);
                    break;
                case 29:
                    c3645Ujhhgtgfeyxiexzf.f11421feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11421feyxiexzfUjhhgtg);
                    break;
                case 30:
                    c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg) == -2) {
                            c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg) == -2) {
                            c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg = -2;
                        }
                    }
                    break;
                case 35:
                    c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg));
                    c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg = 2;
                    break;
                case 36:
                    try {
                        c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg) == -2) {
                            c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg) == -2) {
                            c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg = -2;
                        }
                    }
                    break;
                case 38:
                    c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg));
                    c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg = string;
                            c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg.substring(i, iIndexOf2);
                                    String strSubstring4 = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring3);
                                            float f3 = Float.parseFloat(strSubstring4);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg == 1) {
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
                            c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg);
                            break;
                        case Opcodes.IALOAD /* 46 */:
                            c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg);
                            break;
                        case 47:
                            c3645Ujhhgtgfeyxiexzf.f11427feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c3645Ujhhgtgfeyxiexzf.f11428feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg);
                            break;
                        case Opcodes.AALOAD /* 50 */:
                            c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg);
                            break;
                        case Opcodes.BALOAD /* 51 */:
                            c3645Ujhhgtgfeyxiexzf.f11442feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c3645Ujhhgtgfeyxiexzf.m5305Ujhhgtgfeyxiexzf();
        return c3645Ujhhgtgfeyxiexzf;
    }

    public int getMaxHeight() {
        return this.f204Ujhhgtgfeyxiexzf;
    }

    public int getMaxWidth() {
        return this.f203Ujhhgtgfeyxiexzf;
    }

    public int getMinHeight() {
        return this.f202Ujhhgtgfeyxiexzf;
    }

    public int getMinWidth() {
        return this.f201Ujhhgtgfeyxiexzf;
    }

    public int getOptimizationLevel() {
        return this.f200Ujhhgtgfeyxiexzf.f11644Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) childAt.getLayoutParams();
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11458feyxiexzfUjhhgtg;
            if (childAt.getVisibility() != 8 || c3645Ujhhgtgfeyxiexzf.f11446Ujhhgtgfeyxiexzf || c3645Ujhhgtgfeyxiexzf.f11447Ujhhgtgfeyxiexzf || zIsInEditMode) {
                int iM5330Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.m5330Ujhhgtgfeyxiexzf();
                int iM5331Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.m5331Ujhhgtgfeyxiexzf();
                childAt.layout(iM5330Ujhhgtgfeyxiexzf, iM5331Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf() + iM5330Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf() + iM5331Ujhhgtgfeyxiexzf);
            }
        }
        ArrayList arrayList = this.f199Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC3643Ujhhgtgfeyxiexzf) arrayList.get(i6)).getClass();
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
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf;
        int i7;
        int i8;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3;
        int i14;
        int i15;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4;
        int i16;
        float f2;
        float f3;
        View view;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf6;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf7;
        int i17;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf8;
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
        int iM5303Ujhhgtgfeyxiexzf;
        boolean z4;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf9;
        boolean z5 = true;
        int i22 = 0;
        if (!this.f205Ujhhgtgfeyxiexzf) {
            int childCount = getChildCount();
            for (int i23 = 0; i23 < childCount; i23++) {
                if (getChildAt(i23).isLayoutRequested()) {
                    this.f205Ujhhgtgfeyxiexzf = true;
                    break;
                }
            }
        }
        boolean z6 = this.f205Ujhhgtgfeyxiexzf;
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf = this.f200Ujhhgtgfeyxiexzf;
        if (!z6) {
            int i24 = this.f213Ujhhgtgfeyxiexzf;
            if (i24 == i && this.f214Ujhhgtgfeyxiexzf == i2) {
                m57Ujhhgtgfeyxiexzf(i, i2, c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf.f11645Ujhhgtgfeyxiexzf, c3656Ujhhgtgfeyxiexzf.f11646Ujhhgtgfeyxiexzf);
                return;
            }
            if (i24 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f214Ujhhgtgfeyxiexzf) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf()) {
                this.f213Ujhhgtgfeyxiexzf = i;
                this.f214Ujhhgtgfeyxiexzf = i2;
                m57Ujhhgtgfeyxiexzf(i, i2, c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf.f11645Ujhhgtgfeyxiexzf, c3656Ujhhgtgfeyxiexzf.f11646Ujhhgtgfeyxiexzf);
                return;
            }
        }
        this.f213Ujhhgtgfeyxiexzf = i;
        this.f214Ujhhgtgfeyxiexzf = i2;
        c3656Ujhhgtgfeyxiexzf.f11636Ujhhgtgfeyxiexzf = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        if (this.f205Ujhhgtgfeyxiexzf) {
            this.f205Ujhhgtgfeyxiexzf = false;
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
                    C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf = m54Ujhhgtgfeyxiexzf(getChildAt(i26));
                    if (c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf != null) {
                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf.mo5338feyxiexzfUjhhgtg();
                    }
                }
                SparseArray sparseArray = this.f198Ujhhgtgfeyxiexzf;
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
                                    if (this.f210Ujhhgtgfeyxiexzf == null) {
                                        this.f210Ujhhgtgfeyxiexzf = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    this.f210Ujhhgtgfeyxiexzf.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
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
                                c3655Ujhhgtgfeyxiexzf9 = viewFindViewById == this ? c3656Ujhhgtgfeyxiexzf : viewFindViewById == null ? null : ((C3645Ujhhgtgfeyxiexzf) viewFindViewById.getLayoutParams()).f11458feyxiexzfUjhhgtg;
                            }
                            c3655Ujhhgtgfeyxiexzf9.f11623Ujhhgtgfeyxiexzf = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            z4 = z5;
                        }
                        i27++;
                        z5 = z4;
                    }
                }
                boolean z7 = z5;
                if (this.f209Ujhhgtgfeyxiexzf != -1) {
                    for (int i28 = 0; i28 < childCount3; i28++) {
                        getChildAt(i28).getId();
                    }
                }
                C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf = this.f207Ujhhgtgfeyxiexzf;
                if (c3654Ujhhgtgfeyxiexzf != null) {
                    c3654Ujhhgtgfeyxiexzf.m5316Ujhhgtgfeyxiexzf(this);
                }
                c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.clear();
                ArrayList arrayList2 = this.f199Ujhhgtgfeyxiexzf;
                int size = arrayList2.size();
                if (size > 0) {
                    int i29 = 0;
                    while (i29 < size) {
                        AbstractC3643Ujhhgtgfeyxiexzf abstractC3643Ujhhgtgfeyxiexzf = (AbstractC3643Ujhhgtgfeyxiexzf) arrayList2.get(i29);
                        HashMap map = abstractC3643Ujhhgtgfeyxiexzf.f11394Ujhhgtgfeyxiexzf;
                        if (abstractC3643Ujhhgtgfeyxiexzf.isInEditMode()) {
                            abstractC3643Ujhhgtgfeyxiexzf.setIds(abstractC3643Ujhhgtgfeyxiexzf.f11392Ujhhgtgfeyxiexzf);
                        }
                        AbstractC0548Ujhhgtgfeyxiexzf abstractC0548Ujhhgtgfeyxiexzf = abstractC3643Ujhhgtgfeyxiexzf.f11391Ujhhgtgfeyxiexzf;
                        if (abstractC0548Ujhhgtgfeyxiexzf == null) {
                            z3 = z;
                            arrayList = arrayList2;
                        } else {
                            abstractC0548Ujhhgtgfeyxiexzf.f2540feyxiexzfUjhhgtg = i22;
                            Arrays.fill(abstractC0548Ujhhgtgfeyxiexzf.f2539feyxiexzfUjhhgtg, (Object) null);
                            int i30 = i22;
                            while (i30 < abstractC3643Ujhhgtgfeyxiexzf.f11389Ujhhgtgfeyxiexzf) {
                                int i31 = abstractC3643Ujhhgtgfeyxiexzf.f11388Ujhhgtgfeyxiexzf[i30];
                                View view2 = (View) sparseArray.get(i31);
                                if (view2 == null && (iM5303Ujhhgtgfeyxiexzf = abstractC3643Ujhhgtgfeyxiexzf.m5303Ujhhgtgfeyxiexzf(this, (str = (String) map.get(Integer.valueOf(i31))))) != 0) {
                                    abstractC3643Ujhhgtgfeyxiexzf.f11388Ujhhgtgfeyxiexzf[i30] = iM5303Ujhhgtgfeyxiexzf;
                                    map.put(Integer.valueOf(iM5303Ujhhgtgfeyxiexzf), str);
                                    view2 = (View) sparseArray.get(iM5303Ujhhgtgfeyxiexzf);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    AbstractC0548Ujhhgtgfeyxiexzf abstractC0548Ujhhgtgfeyxiexzf2 = abstractC3643Ujhhgtgfeyxiexzf.f11391Ujhhgtgfeyxiexzf;
                                    C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf2 = m54Ujhhgtgfeyxiexzf(view3);
                                    abstractC0548Ujhhgtgfeyxiexzf2.getClass();
                                    if (c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf2 != abstractC0548Ujhhgtgfeyxiexzf2 && c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf2 != null) {
                                        int i32 = abstractC0548Ujhhgtgfeyxiexzf2.f2540feyxiexzfUjhhgtg + 1;
                                        C3655Ujhhgtgfeyxiexzf[] c3655UjhhgtgfeyxiexzfArr = abstractC0548Ujhhgtgfeyxiexzf2.f2539feyxiexzfUjhhgtg;
                                        if (i32 > c3655UjhhgtgfeyxiexzfArr.length) {
                                            abstractC0548Ujhhgtgfeyxiexzf2.f2539feyxiexzfUjhhgtg = (C3655Ujhhgtgfeyxiexzf[]) Arrays.copyOf(c3655UjhhgtgfeyxiexzfArr, c3655UjhhgtgfeyxiexzfArr.length * 2);
                                        }
                                        C3655Ujhhgtgfeyxiexzf[] c3655UjhhgtgfeyxiexzfArr2 = abstractC0548Ujhhgtgfeyxiexzf2.f2539feyxiexzfUjhhgtg;
                                        int i33 = abstractC0548Ujhhgtgfeyxiexzf2.f2540feyxiexzfUjhhgtg;
                                        c3655UjhhgtgfeyxiexzfArr2[i33] = c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf2;
                                        abstractC0548Ujhhgtgfeyxiexzf2.f2540feyxiexzfUjhhgtg = i33 + 1;
                                    }
                                }
                                i30++;
                                z = z;
                                arrayList2 = arrayList2;
                            }
                            z3 = z;
                            arrayList = arrayList2;
                            abstractC3643Ujhhgtgfeyxiexzf.f11391Ujhhgtgfeyxiexzf.mo1836feyxiexzfUjhhgtg();
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
                SparseArray sparseArray2 = this.f211Ujhhgtgfeyxiexzf;
                sparseArray2.clear();
                sparseArray2.put(0, c3656Ujhhgtgfeyxiexzf);
                sparseArray2.put(getId(), c3656Ujhhgtgfeyxiexzf);
                for (int i36 = 0; i36 < childCount3; i36++) {
                    View childAt2 = getChildAt(i36);
                    sparseArray2.put(childAt2.getId(), m54Ujhhgtgfeyxiexzf(childAt2));
                }
                int i37 = 0;
                while (i37 < childCount3) {
                    View childAt3 = getChildAt(i37);
                    C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3 = m54Ujhhgtgfeyxiexzf(childAt3);
                    if (c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3 != null) {
                        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf2 = (C3645Ujhhgtgfeyxiexzf) childAt3.getLayoutParams();
                        c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.add(c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3);
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf10 = c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11609feyxiexzfUjhhgtg;
                        if (c3655Ujhhgtgfeyxiexzf10 != null) {
                            ((C3656Ujhhgtgfeyxiexzf) c3655Ujhhgtgfeyxiexzf10).f11632feyxiexzfUjhhgtg.remove(c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3);
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo5338feyxiexzfUjhhgtg();
                        }
                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11609feyxiexzfUjhhgtg = c3656Ujhhgtgfeyxiexzf;
                        c3645Ujhhgtgfeyxiexzf2.m5305Ujhhgtgfeyxiexzf();
                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11622Ujhhgtgfeyxiexzf = childAt3.getVisibility();
                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11621Ujhhgtgfeyxiexzf = childAt3;
                        if (childAt3 instanceof AbstractC3643Ujhhgtgfeyxiexzf) {
                            ((AbstractC3643Ujhhgtgfeyxiexzf) childAt3).mo51Ujhhgtgfeyxiexzf(c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3, c3656Ujhhgtgfeyxiexzf.f11636Ujhhgtgfeyxiexzf);
                        }
                        if (c3645Ujhhgtgfeyxiexzf2.f11446Ujhhgtgfeyxiexzf) {
                            C0527Ujhhgtgfeyxiexzf c0527Ujhhgtgfeyxiexzf = (C0527Ujhhgtgfeyxiexzf) c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3;
                            int i38 = c3645Ujhhgtgfeyxiexzf2.f11455feyxiexzfUjhhgtg;
                            int i39 = c3645Ujhhgtgfeyxiexzf2.f11456Ujhhgtgfeyxiexzf;
                            float f5 = c3645Ujhhgtgfeyxiexzf2.f11457Ujhhgtgfeyxiexzf;
                            if (f5 == -1.0f) {
                                b = -1;
                                if (i38 != -1) {
                                    if (i38 > -1) {
                                        c0527Ujhhgtgfeyxiexzf.f2484feyxiexzfUjhhgtg = -1.0f;
                                        c0527Ujhhgtgfeyxiexzf.f2485feyxiexzfUjhhgtg = i38;
                                        c0527Ujhhgtgfeyxiexzf.f2486Ujhhgtgfeyxiexzf = -1;
                                    }
                                } else if (i39 != -1 && i39 > -1) {
                                    c0527Ujhhgtgfeyxiexzf.f2484feyxiexzfUjhhgtg = -1.0f;
                                    c0527Ujhhgtgfeyxiexzf.f2485feyxiexzfUjhhgtg = -1;
                                    c0527Ujhhgtgfeyxiexzf.f2486Ujhhgtgfeyxiexzf = i39;
                                }
                            } else if (f5 > -1.0f) {
                                c0527Ujhhgtgfeyxiexzf.f2484feyxiexzfUjhhgtg = f5;
                                b = -1;
                                c0527Ujhhgtgfeyxiexzf.f2485feyxiexzfUjhhgtg = -1;
                                c0527Ujhhgtgfeyxiexzf.f2486Ujhhgtgfeyxiexzf = -1;
                            }
                        } else {
                            int i40 = c3645Ujhhgtgfeyxiexzf2.f11448Ujhhgtgfeyxiexzf;
                            int i41 = c3645Ujhhgtgfeyxiexzf2.f11449Ujhhgtgfeyxiexzf;
                            int i42 = c3645Ujhhgtgfeyxiexzf2.f11450feyxiexzfUjhhgtg;
                            int i43 = c3645Ujhhgtgfeyxiexzf2.f11451feyxiexzfUjhhgtg;
                            int i44 = c3645Ujhhgtgfeyxiexzf2.f11452feyxiexzfUjhhgtg;
                            int i45 = c3645Ujhhgtgfeyxiexzf2.f11453feyxiexzfUjhhgtg;
                            float f6 = c3645Ujhhgtgfeyxiexzf2.f11454feyxiexzfUjhhgtg;
                            i37 = i37;
                            int i46 = c3645Ujhhgtgfeyxiexzf2.f11408Ujhhgtgfeyxiexzf;
                            if (i46 != -1) {
                                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf11 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i46);
                                if (c3655Ujhhgtgfeyxiexzf11 != null) {
                                    float f7 = c3645Ujhhgtgfeyxiexzf2.f11410Ujhhgtgfeyxiexzf;
                                    f4 = 0.0f;
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(7, 7, c3645Ujhhgtgfeyxiexzf2.f11409Ujhhgtgfeyxiexzf, 0, c3655Ujhhgtgfeyxiexzf11);
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11593Ujhhgtgfeyxiexzf = f7;
                                } else {
                                    f4 = 0.0f;
                                }
                                c3645Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf2;
                                zIsInEditMode = zIsInEditMode;
                                childCount3 = childCount3;
                                i13 = 5;
                                i12 = 3;
                                f2 = f4;
                            } else {
                                c3645Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf2;
                                if (i40 != -1) {
                                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf12 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i40);
                                    if (c3655Ujhhgtgfeyxiexzf12 != null) {
                                        i4 = i42;
                                        zIsInEditMode = zIsInEditMode;
                                        i6 = i43;
                                        i3 = -1;
                                        i5 = 2;
                                        childCount3 = childCount3;
                                        f = f6;
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(2, 2, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).leftMargin, i44, c3655Ujhhgtgfeyxiexzf12);
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
                                    if (i41 != -1 && (c3655Ujhhgtgfeyxiexzf = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i41)) != null) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(2, 4, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).leftMargin, i44, c3655Ujhhgtgfeyxiexzf);
                                        i7 = 2;
                                        i8 = 4;
                                    }
                                    if (i4 != i3) {
                                        c3655Ujhhgtgfeyxiexzf8 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i4);
                                        if (c3655Ujhhgtgfeyxiexzf8 != null) {
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i8, i7, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).rightMargin, i45, c3655Ujhhgtgfeyxiexzf8);
                                        }
                                    } else if (i6 != i3 && (c3655Ujhhgtgfeyxiexzf2 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i6)) != null) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i8, i8, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).rightMargin, i45, c3655Ujhhgtgfeyxiexzf2);
                                    }
                                    i9 = c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf;
                                    if (i9 != i3) {
                                        c3655Ujhhgtgfeyxiexzf7 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i9);
                                        if (c3655Ujhhgtgfeyxiexzf7 != null) {
                                            i17 = 3;
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(3, 3, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).topMargin, c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf7);
                                        } else {
                                            i17 = 3;
                                        }
                                        i12 = i17;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf;
                                        if (i10 != -1 || (c3655Ujhhgtgfeyxiexzf3 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i10)) == null) {
                                            i11 = -1;
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            i11 = -1;
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(3, 5, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).topMargin, c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf3);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf;
                                    if (i14 != i11) {
                                        c3655Ujhhgtgfeyxiexzf6 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i14);
                                        if (c3655Ujhhgtgfeyxiexzf6 != null) {
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i13, i12, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).bottomMargin, c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf6);
                                        }
                                    } else {
                                        i15 = c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf;
                                        if (i15 == i11 && (c3655Ujhhgtgfeyxiexzf4 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i15)) != null) {
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i13, i13, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).bottomMargin, c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf4);
                                        }
                                        i16 = c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf;
                                        if (i16 != -1) {
                                            view = (View) sparseArray.get(i16);
                                            c3655Ujhhgtgfeyxiexzf5 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf);
                                            if (c3655Ujhhgtgfeyxiexzf5 != null && view != null && (view.getLayoutParams() instanceof C3645Ujhhgtgfeyxiexzf)) {
                                                C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf3 = (C3645Ujhhgtgfeyxiexzf) view.getLayoutParams();
                                                boolean z8 = z7;
                                                c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = z8;
                                                c3645Ujhhgtgfeyxiexzf3.f11445Ujhhgtgfeyxiexzf = z8;
                                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(6).m5286Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf5.mo1814Ujhhgtgfeyxiexzf(6), 0, -1, z8);
                                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11594feyxiexzfUjhhgtg = z8;
                                                c3645Ujhhgtgfeyxiexzf3.f11458feyxiexzfUjhhgtg.f11594feyxiexzfUjhhgtg = z8;
                                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i12).m5294Ujhhgtgfeyxiexzf();
                                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i13).m5294Ujhhgtgfeyxiexzf();
                                            }
                                        }
                                        f2 = 0.0f;
                                        if (f >= 0.0f) {
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11619Ujhhgtgfeyxiexzf = f;
                                        }
                                        f3 = c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg;
                                        if (f3 >= 0.0f) {
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11620Ujhhgtgfeyxiexzf = f3;
                                        }
                                    }
                                    i16 = c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf;
                                    if (i16 != -1) {
                                        view = (View) sparseArray.get(i16);
                                        c3655Ujhhgtgfeyxiexzf5 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf);
                                        if (c3655Ujhhgtgfeyxiexzf5 != null) {
                                            C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf4 = (C3645Ujhhgtgfeyxiexzf) view.getLayoutParams();
                                            boolean z9 = z7;
                                            c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = z9;
                                            c3645Ujhhgtgfeyxiexzf4.f11445Ujhhgtgfeyxiexzf = z9;
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(6).m5286Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf5.mo1814Ujhhgtgfeyxiexzf(6), 0, -1, z9);
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11594feyxiexzfUjhhgtg = z9;
                                            c3645Ujhhgtgfeyxiexzf4.f11458feyxiexzfUjhhgtg.f11594feyxiexzfUjhhgtg = z9;
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i12).m5294Ujhhgtgfeyxiexzf();
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i13).m5294Ujhhgtgfeyxiexzf();
                                        }
                                    }
                                    f2 = 0.0f;
                                    if (f >= 0.0f) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11619Ujhhgtgfeyxiexzf = f;
                                    }
                                    f3 = c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg;
                                    if (f3 >= 0.0f) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11620Ujhhgtgfeyxiexzf = f3;
                                    }
                                }
                                i7 = i5;
                                i8 = 4;
                                if (i4 != i3) {
                                    c3655Ujhhgtgfeyxiexzf8 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i4);
                                    if (c3655Ujhhgtgfeyxiexzf8 != null) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i8, i7, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).rightMargin, i45, c3655Ujhhgtgfeyxiexzf8);
                                    }
                                } else if (i6 != i3) {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i8, i8, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).rightMargin, i45, c3655Ujhhgtgfeyxiexzf2);
                                }
                                i9 = c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf;
                                if (i9 != i3) {
                                    c3655Ujhhgtgfeyxiexzf7 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i9);
                                    if (c3655Ujhhgtgfeyxiexzf7 != null) {
                                        i17 = 3;
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(3, 3, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).topMargin, c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf7);
                                    } else {
                                        i17 = 3;
                                    }
                                    i12 = i17;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf;
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
                                i14 = c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf;
                                if (i14 != i11) {
                                    c3655Ujhhgtgfeyxiexzf6 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(i14);
                                    if (c3655Ujhhgtgfeyxiexzf6 != null) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5333Ujhhgtgfeyxiexzf(i13, i12, ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).bottomMargin, c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf6);
                                    }
                                } else {
                                    i15 = c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf;
                                    if (i15 == i11) {
                                    }
                                    i16 = c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf;
                                    if (i16 != -1) {
                                        view = (View) sparseArray.get(i16);
                                        c3655Ujhhgtgfeyxiexzf5 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf);
                                        if (c3655Ujhhgtgfeyxiexzf5 != null) {
                                            C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf5 = (C3645Ujhhgtgfeyxiexzf) view.getLayoutParams();
                                            boolean z10 = z7;
                                            c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = z10;
                                            c3645Ujhhgtgfeyxiexzf5.f11445Ujhhgtgfeyxiexzf = z10;
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(6).m5286Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf5.mo1814Ujhhgtgfeyxiexzf(6), 0, -1, z10);
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11594feyxiexzfUjhhgtg = z10;
                                            c3645Ujhhgtgfeyxiexzf5.f11458feyxiexzfUjhhgtg.f11594feyxiexzfUjhhgtg = z10;
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i12).m5294Ujhhgtgfeyxiexzf();
                                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i13).m5294Ujhhgtgfeyxiexzf();
                                        }
                                    }
                                    f2 = 0.0f;
                                    if (f >= 0.0f) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11619Ujhhgtgfeyxiexzf = f;
                                    }
                                    f3 = c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg;
                                    if (f3 >= 0.0f) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11620Ujhhgtgfeyxiexzf = f3;
                                    }
                                }
                                i16 = c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf;
                                if (i16 != -1) {
                                    view = (View) sparseArray.get(i16);
                                    c3655Ujhhgtgfeyxiexzf5 = (C3655Ujhhgtgfeyxiexzf) sparseArray2.get(c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf);
                                    if (c3655Ujhhgtgfeyxiexzf5 != null) {
                                        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf6 = (C3645Ujhhgtgfeyxiexzf) view.getLayoutParams();
                                        boolean z11 = z7;
                                        c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = z11;
                                        c3645Ujhhgtgfeyxiexzf6.f11445Ujhhgtgfeyxiexzf = z11;
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(6).m5286Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf5.mo1814Ujhhgtgfeyxiexzf(6), 0, -1, z11);
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11594feyxiexzfUjhhgtg = z11;
                                        c3645Ujhhgtgfeyxiexzf6.f11458feyxiexzfUjhhgtg.f11594feyxiexzfUjhhgtg = z11;
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i12).m5294Ujhhgtgfeyxiexzf();
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i13).m5294Ujhhgtgfeyxiexzf();
                                    }
                                }
                                f2 = 0.0f;
                                if (f >= 0.0f) {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11619Ujhhgtgfeyxiexzf = f;
                                }
                                f3 = c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg;
                                if (f3 >= 0.0f) {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11620Ujhhgtgfeyxiexzf = f3;
                                }
                            }
                            if (zIsInEditMode && ((i21 = c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg) != -1 || c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg != -1)) {
                                int i47 = c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg;
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11614feyxiexzfUjhhgtg = i21;
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11615feyxiexzfUjhhgtg = i47;
                            }
                            if (c3645Ujhhgtgfeyxiexzf.f11443feyxiexzfUjhhgtg) {
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(1);
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5347feyxiexzfUjhhgtg(((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).width);
                                if (((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).width == -2) {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(i34);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).width == -1) {
                                if (c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg) {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(3);
                                } else {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(4);
                                }
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(2).f11379Ujhhgtgfeyxiexzf = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).leftMargin;
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(4).f11379Ujhhgtgfeyxiexzf = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).rightMargin;
                            } else {
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(3);
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5347feyxiexzfUjhhgtg(0);
                            }
                            if (c3645Ujhhgtgfeyxiexzf.f11444Ujhhgtgfeyxiexzf) {
                                i18 = -1;
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(1);
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5344feyxiexzfUjhhgtg(((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).height);
                                if (((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).height == -2) {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(2);
                                }
                            } else {
                                i18 = -1;
                                if (((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).height == -1) {
                                    if (c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg) {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(3);
                                    } else {
                                        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(4);
                                    }
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i12).f11379Ujhhgtgfeyxiexzf = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).topMargin;
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.mo1814Ujhhgtgfeyxiexzf(i13).f11379Ujhhgtgfeyxiexzf = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).bottomMargin;
                                } else {
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(3);
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.m5344feyxiexzfUjhhgtg(0);
                                }
                            }
                            String str2 = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg;
                            if (str2 == null || str2.length() == 0) {
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11612feyxiexzfUjhhgtg = f2;
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
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11612feyxiexzfUjhhgtg = fAbs;
                                    c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11613feyxiexzfUjhhgtg = i19;
                                }
                            }
                            float f10 = c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg;
                            float[] fArr = c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11626feyxiexzfUjhhgtg;
                            fArr[0] = f10;
                            z7 = true;
                            fArr[1] = c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11624feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11427feyxiexzfUjhhgtg;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11625feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11428feyxiexzfUjhhgtg;
                            int i48 = c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg;
                            int i49 = c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg;
                            int i50 = c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg;
                            float f11 = c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11581Ujhhgtgfeyxiexzf = i48;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11584Ujhhgtgfeyxiexzf = i49;
                            if (i50 == Integer.MAX_VALUE) {
                                i50 = 0;
                            }
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11585Ujhhgtgfeyxiexzf = i50;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11586Ujhhgtgfeyxiexzf = f11;
                            if (f11 > f2 && f11 < 1.0f && i48 == 0) {
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11581Ujhhgtgfeyxiexzf = 2;
                            }
                            int i51 = c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg;
                            int i52 = c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg;
                            int i53 = c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg;
                            float f12 = c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11582Ujhhgtgfeyxiexzf = i51;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11587Ujhhgtgfeyxiexzf = i52;
                            if (i53 == Integer.MAX_VALUE) {
                                i53 = 0;
                            }
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11588Ujhhgtgfeyxiexzf = i53;
                            c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11589Ujhhgtgfeyxiexzf = f12;
                            if (f12 <= f2 || f12 >= 1.0f || i51 != 0) {
                                i34 = 2;
                            } else {
                                i34 = 2;
                                c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf3.f11582Ujhhgtgfeyxiexzf = 2;
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
                c3656Ujhhgtgfeyxiexzf.f11633feyxiexzfUjhhgtg.m3613feyxiexzfUjhhgtg(c3656Ujhhgtgfeyxiexzf);
            }
        }
        m58Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, this.f206Ujhhgtgfeyxiexzf, i, i2);
        m57Ujhhgtgfeyxiexzf(i, i2, c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf.f11645Ujhhgtgfeyxiexzf, c3656Ujhhgtgfeyxiexzf.f11646Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf = m54Ujhhgtgfeyxiexzf(view);
        if ((view instanceof C0546Ujhhgtgfeyxiexzf) && !(c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf instanceof C0527Ujhhgtgfeyxiexzf)) {
            C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) view.getLayoutParams();
            C0527Ujhhgtgfeyxiexzf c0527Ujhhgtgfeyxiexzf = new C0527Ujhhgtgfeyxiexzf();
            c3645Ujhhgtgfeyxiexzf.f11458feyxiexzfUjhhgtg = c0527Ujhhgtgfeyxiexzf;
            c3645Ujhhgtgfeyxiexzf.f11446Ujhhgtgfeyxiexzf = true;
            c0527Ujhhgtgfeyxiexzf.m1819feyxiexzfUjhhgtg(c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg);
        }
        if (view instanceof AbstractC3643Ujhhgtgfeyxiexzf) {
            AbstractC3643Ujhhgtgfeyxiexzf abstractC3643Ujhhgtgfeyxiexzf = (AbstractC3643Ujhhgtgfeyxiexzf) view;
            abstractC3643Ujhhgtgfeyxiexzf.m5304Ujhhgtgfeyxiexzf();
            ((C3645Ujhhgtgfeyxiexzf) view.getLayoutParams()).f11447Ujhhgtgfeyxiexzf = true;
            ArrayList arrayList = this.f199Ujhhgtgfeyxiexzf;
            if (!arrayList.contains(abstractC3643Ujhhgtgfeyxiexzf)) {
                arrayList.add(abstractC3643Ujhhgtgfeyxiexzf);
            }
        }
        this.f198Ujhhgtgfeyxiexzf.put(view.getId(), view);
        this.f205Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f198Ujhhgtgfeyxiexzf.remove(view.getId());
        C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf = m54Ujhhgtgfeyxiexzf(view);
        this.f200Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.remove(c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf);
        c3655UjhhgtgfeyxiexzfM54Ujhhgtgfeyxiexzf.mo5338feyxiexzfUjhhgtg();
        this.f199Ujhhgtgfeyxiexzf.remove(view);
        this.f205Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f205Ujhhgtgfeyxiexzf = true;
        super.requestLayout();
    }

    public void setConstraintSet(C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf) {
        this.f207Ujhhgtgfeyxiexzf = c3654Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f198Ujhhgtgfeyxiexzf;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f204Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f204Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f203Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f203Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f202Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f202Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f201Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f201Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC3657Ujhhgtgfeyxiexzf abstractC3657Ujhhgtgfeyxiexzf) {
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f208Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            c2629Ujhhgtgfeyxiexzf.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f206Ujhhgtgfeyxiexzf = i;
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf = this.f200Ujhhgtgfeyxiexzf;
        c3656Ujhhgtgfeyxiexzf.f11644Ujhhgtgfeyxiexzf = i;
        C0072Ujhhgtgfeyxiexzf.f1112Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5355feyxiexzfUjhhgtg(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3655Ujhhgtgfeyxiexzf m54Ujhhgtgfeyxiexzf(View view) {
        if (view == this) {
            return this.f200Ujhhgtgfeyxiexzf;
        }
        if (view == null) {
            return null;
        }
        return ((C3645Ujhhgtgfeyxiexzf) view.getLayoutParams()).f11458feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m55Ujhhgtgfeyxiexzf(AttributeSet attributeSet, int i) {
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf = this.f200Ujhhgtgfeyxiexzf;
        c3656Ujhhgtgfeyxiexzf.f11621Ujhhgtgfeyxiexzf = this;
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf = this.f212Ujhhgtgfeyxiexzf;
        c3656Ujhhgtgfeyxiexzf.f11635feyxiexzfUjhhgtg = c3646Ujhhgtgfeyxiexzf;
        c3656Ujhhgtgfeyxiexzf.f11634Ujhhgtgfeyxiexzf.f10221Ujhhgtgfeyxiexzf = c3646Ujhhgtgfeyxiexzf;
        this.f198Ujhhgtgfeyxiexzf.put(getId(), this);
        this.f207Ujhhgtgfeyxiexzf = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3057Ujhhgtgfeyxiexzf, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.f201Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f201Ujhhgtgfeyxiexzf);
                } else if (index == 10) {
                    this.f202Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f202Ujhhgtgfeyxiexzf);
                } else if (index == 7) {
                    this.f203Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f203Ujhhgtgfeyxiexzf);
                } else if (index == 8) {
                    this.f204Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f204Ujhhgtgfeyxiexzf);
                } else if (index == 90) {
                    this.f206Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, this.f206Ujhhgtgfeyxiexzf);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m56Ujhhgtgfeyxiexzf(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f208Ujhhgtgfeyxiexzf = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf = new C3654Ujhhgtgfeyxiexzf();
                        this.f207Ujhhgtgfeyxiexzf = c3654Ujhhgtgfeyxiexzf;
                        c3654Ujhhgtgfeyxiexzf.m5318Ujhhgtgfeyxiexzf(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f207Ujhhgtgfeyxiexzf = null;
                    }
                    this.f209Ujhhgtgfeyxiexzf = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c3656Ujhhgtgfeyxiexzf.f11644Ujhhgtgfeyxiexzf = this.f206Ujhhgtgfeyxiexzf;
        C0072Ujhhgtgfeyxiexzf.f1112Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5355feyxiexzfUjhhgtg(512);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: IOException -> 0x0054, XmlPullParserException -> 0x0056, TryCatch #2 {IOException -> 0x0054, XmlPullParserException -> 0x0056, blocks: (B:3:0x0022, B:36:0x00a7, B:10:0x0031, B:11:0x0039, B:34:0x008d, B:13:0x003d, B:15:0x0045, B:17:0x004c, B:22:0x0058, B:25:0x0061, B:28:0x006a, B:30:0x0072, B:31:0x0081, B:33:0x0089, B:35:0x00a4), top: B:42:0x0022 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x008d, please report this as an issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m56Ujhhgtgfeyxiexzf(int i) {
        Context context = getContext();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(8, false);
        c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf = new SparseArray();
        c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C3647Ujhhgtgfeyxiexzf c3647Ujhhgtgfeyxiexzf = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2629Ujhhgtgfeyxiexzf.m3954feyxiexzfUjhhgtg(context, xml);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c3647Ujhhgtgfeyxiexzf = new C3647Ujhhgtgfeyxiexzf(context, xml);
                                ((SparseArray) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).put(c3647Ujhhgtgfeyxiexzf.f11467Ujhhgtgfeyxiexzf, c3647Ujhhgtgfeyxiexzf);
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
                                C3648Ujhhgtgfeyxiexzf c3648Ujhhgtgfeyxiexzf = new C3648Ujhhgtgfeyxiexzf(context, xml);
                                if (c3647Ujhhgtgfeyxiexzf != null) {
                                    ((ArrayList) c3647Ujhhgtgfeyxiexzf.f11469Ujhhgtgfeyxiexzf).add(c3648Ujhhgtgfeyxiexzf);
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
        this.f208Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m57Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf = this.f212Ujhhgtgfeyxiexzf;
        int i5 = c3646Ujhhgtgfeyxiexzf.f11463Ujhhgtgfeyxiexzf;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c3646Ujhhgtgfeyxiexzf.f11462Ujhhgtgfeyxiexzf, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f203Ujhhgtgfeyxiexzf, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f204Ujhhgtgfeyxiexzf, iResolveSizeAndState2);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m58Ujhhgtgfeyxiexzf(C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf, int i, int i2, int i3) {
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
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf;
        int i7;
        boolean zM5353feyxiexzfUjhhgtg;
        boolean z3;
        int i8;
        int i9;
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf2;
        int i10;
        boolean z4;
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf3;
        int i11;
        C0577Ujhhgtgfeyxiexzf c0577Ujhhgtgfeyxiexzf;
        C1868feyxiexzfUjhhgtg c1868feyxiexzfUjhhgtg;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        Iterator it;
        boolean z6;
        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf4 = this.f212Ujhhgtgfeyxiexzf;
        c3646Ujhhgtgfeyxiexzf4.f11460Ujhhgtgfeyxiexzf = iMax3;
        c3646Ujhhgtgfeyxiexzf4.f11461Ujhhgtgfeyxiexzf = iMax4;
        c3646Ujhhgtgfeyxiexzf4.f11462Ujhhgtgfeyxiexzf = paddingWidth;
        c3646Ujhhgtgfeyxiexzf4.f11463Ujhhgtgfeyxiexzf = i18;
        c3646Ujhhgtgfeyxiexzf4.f11464Ujhhgtgfeyxiexzf = i2;
        c3646Ujhhgtgfeyxiexzf4.f11465Ujhhgtgfeyxiexzf = i3;
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
        int i22 = c3646Ujhhgtgfeyxiexzf4.f11463Ujhhgtgfeyxiexzf;
        int i23 = c3646Ujhhgtgfeyxiexzf4.f11462Ujhhgtgfeyxiexzf;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f201Ujhhgtgfeyxiexzf);
                iMin = iMax;
            } else {
                iMin = i20;
            }
            i19 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f201Ujhhgtgfeyxiexzf);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i19 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f203Ujhhgtgfeyxiexzf - i23, i20);
            i19 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f202Ujhhgtgfeyxiexzf);
                iMin2 = iMax2;
            } else {
                iMin2 = i21;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f204Ujhhgtgfeyxiexzf - i22, i21);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f202Ujhhgtgfeyxiexzf);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iM5329Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf();
        C3258feyxiexzfUjhhgtg c3258feyxiexzfUjhhgtg = c3656Ujhhgtgfeyxiexzf.f11634Ujhhgtgfeyxiexzf;
        int[] iArr = c3656Ujhhgtgfeyxiexzf.f11592Ujhhgtgfeyxiexzf;
        int i24 = iMin;
        if (i24 == iM5329Ujhhgtgfeyxiexzf && iMin2 == c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf()) {
            c = 1;
        } else {
            c3258feyxiexzfUjhhgtg.f10218Ujhhgtgfeyxiexzf = true;
            c = 1;
        }
        c3656Ujhhgtgfeyxiexzf.f11614feyxiexzfUjhhgtg = 0;
        c3656Ujhhgtgfeyxiexzf.f11615feyxiexzfUjhhgtg = 0;
        iArr[0] = this.f203Ujhhgtgfeyxiexzf - i23;
        iArr[c] = this.f204Ujhhgtgfeyxiexzf - i22;
        c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg = 0;
        c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf = 0;
        c3656Ujhhgtgfeyxiexzf.m5345feyxiexzfUjhhgtg(i19);
        c3656Ujhhgtgfeyxiexzf.m5347feyxiexzfUjhhgtg(i24);
        c3656Ujhhgtgfeyxiexzf.m5346feyxiexzfUjhhgtg(i4);
        c3656Ujhhgtgfeyxiexzf.m5344feyxiexzfUjhhgtg(iMin2);
        int i25 = this.f201Ujhhgtgfeyxiexzf - i23;
        if (i25 < 0) {
            c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg = 0;
        } else {
            c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg = i25;
        }
        int i26 = this.f202Ujhhgtgfeyxiexzf - i22;
        if (i26 < 0) {
            c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf = 0;
        } else {
            c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf = i26;
        }
        c3656Ujhhgtgfeyxiexzf.f11638feyxiexzfUjhhgtg = iMax5;
        c3656Ujhhgtgfeyxiexzf.f11639feyxiexzfUjhhgtg = iMax3;
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.f11633feyxiexzfUjhhgtg;
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf2 = (C3656Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
        ArrayList arrayList = (ArrayList) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf5 = c3656Ujhhgtgfeyxiexzf.f11635feyxiexzfUjhhgtg;
        int size3 = c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.size();
        int iM5329Ujhhgtgfeyxiexzf2 = c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf();
        int iM5326Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf();
        boolean zM5173Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5173Ujhhgtgfeyxiexzf(i, 128);
        boolean z7 = zM5173Ujhhgtgfeyxiexzf || AbstractC3594Ujhhgtgfeyxiexzf.m5173Ujhhgtgfeyxiexzf(i, 64);
        if (z7) {
            int i27 = 0;
            while (true) {
                if (i27 < size3) {
                    boolean z8 = z7;
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = (C3655Ujhhgtgfeyxiexzf) c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.get(i27);
                    int i28 = i27;
                    int[] iArr2 = c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
                    i5 = size3;
                    boolean z9 = (iArr2[0] == 3) && (iArr2[1] == 3) && c3655Ujhhgtgfeyxiexzf.f11612feyxiexzfUjhhgtg > 0.0f;
                    if ((c3655Ujhhgtgfeyxiexzf.m5335Ujhhgtgfeyxiexzf() && z9) || ((c3655Ujhhgtgfeyxiexzf.m5336Ujhhgtgfeyxiexzf() && z9) || (c3655Ujhhgtgfeyxiexzf instanceof C3618Ujhhgtgfeyxiexzf) || c3655Ujhhgtgfeyxiexzf.m5335Ujhhgtgfeyxiexzf() || c3655Ujhhgtgfeyxiexzf.m5336Ujhhgtgfeyxiexzf())) {
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
        boolean z10 = z & ((mode == i6 && mode2 == i6) || zM5173Ujhhgtgfeyxiexzf);
        if (z10) {
            int iMin3 = Math.min(iArr[0], i20);
            int iMin4 = Math.min(iArr[1], i21);
            int i29 = 1073741824;
            if (mode == 1073741824) {
                if (c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf() != iMin3) {
                    c3656Ujhhgtgfeyxiexzf.m5347feyxiexzfUjhhgtg(iMin3);
                    c3258feyxiexzfUjhhgtg.f10217Ujhhgtgfeyxiexzf = true;
                }
                i29 = 1073741824;
            }
            if (mode2 == i29 && c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf() != iMin4) {
                c3656Ujhhgtgfeyxiexzf.m5344feyxiexzfUjhhgtg(iMin4);
                c3258feyxiexzfUjhhgtg.f10217Ujhhgtgfeyxiexzf = true;
            }
            if (mode == i29 && mode2 == i29) {
                ArrayList<AbstractC2229feyxiexzfUjhhgtg> arrayList2 = c3258feyxiexzfUjhhgtg.f10220Ujhhgtgfeyxiexzf;
                C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf3 = c3258feyxiexzfUjhhgtg.f10216Ujhhgtgfeyxiexzf;
                if (c3258feyxiexzfUjhhgtg.f10217Ujhhgtgfeyxiexzf || c3258feyxiexzfUjhhgtg.f10218Ujhhgtgfeyxiexzf) {
                    for (C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 : c3656Ujhhgtgfeyxiexzf3.f11632feyxiexzfUjhhgtg) {
                        c3655Ujhhgtgfeyxiexzf2.m5324Ujhhgtgfeyxiexzf();
                        c3655Ujhhgtgfeyxiexzf2.f11570Ujhhgtgfeyxiexzf = false;
                        c3655Ujhhgtgfeyxiexzf2.f11573Ujhhgtgfeyxiexzf.m1847Ujhhgtgfeyxiexzf();
                        c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf.m3202Ujhhgtgfeyxiexzf();
                        z10 = z10;
                    }
                    z2 = z10;
                    c3656Ujhhgtgfeyxiexzf3.m5324Ujhhgtgfeyxiexzf();
                    i14 = 0;
                    c3656Ujhhgtgfeyxiexzf3.f11570Ujhhgtgfeyxiexzf = false;
                    c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.m1847Ujhhgtgfeyxiexzf();
                    c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.m3202Ujhhgtgfeyxiexzf();
                    c3258feyxiexzfUjhhgtg.f10218Ujhhgtgfeyxiexzf = false;
                } else {
                    z2 = z10;
                    i14 = 0;
                }
                c3258feyxiexzfUjhhgtg.m4761Ujhhgtgfeyxiexzf(c3258feyxiexzfUjhhgtg.f10219Ujhhgtgfeyxiexzf);
                c3656Ujhhgtgfeyxiexzf3.f11614feyxiexzfUjhhgtg = i14;
                int[] iArr3 = c3656Ujhhgtgfeyxiexzf3.f11631Ujhhgtgfeyxiexzf;
                c3656Ujhhgtgfeyxiexzf3.f11615feyxiexzfUjhhgtg = i14;
                int iM5325Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf3.m5325Ujhhgtgfeyxiexzf(i14);
                int iM5325Ujhhgtgfeyxiexzf2 = c3656Ujhhgtgfeyxiexzf3.m5325Ujhhgtgfeyxiexzf(1);
                if (c3258feyxiexzfUjhhgtg.f10217Ujhhgtgfeyxiexzf) {
                    c3258feyxiexzfUjhhgtg.m4762Ujhhgtgfeyxiexzf();
                }
                int iM5330Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf3.m5330Ujhhgtgfeyxiexzf();
                int iM5331Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf3.m5331Ujhhgtgfeyxiexzf();
                c3646Ujhhgtgfeyxiexzf = c3646Ujhhgtgfeyxiexzf5;
                c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5330Ujhhgtgfeyxiexzf);
                c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5331Ujhhgtgfeyxiexzf);
                c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                if (iM5325Ujhhgtgfeyxiexzf == 2 || iM5325Ujhhgtgfeyxiexzf2 == 2) {
                    if (zM5173Ujhhgtgfeyxiexzf) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((AbstractC2229feyxiexzfUjhhgtg) it2.next()).mo1824Ujhhgtgfeyxiexzf()) {
                                zM5173Ujhhgtgfeyxiexzf = false;
                                break;
                            }
                        }
                    }
                    if (zM5173Ujhhgtgfeyxiexzf && iM5325Ujhhgtgfeyxiexzf == 2) {
                        c3656Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(1);
                        c3656Ujhhgtgfeyxiexzf3.m5347feyxiexzfUjhhgtg(c3258feyxiexzfUjhhgtg.m4763Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf3, 0));
                        c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf3.m5329Ujhhgtgfeyxiexzf());
                    }
                    if (zM5173Ujhhgtgfeyxiexzf && iM5325Ujhhgtgfeyxiexzf2 == 2) {
                        i15 = 1;
                        c3656Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(1);
                        c3656Ujhhgtgfeyxiexzf3.m5344feyxiexzfUjhhgtg(c3258feyxiexzfUjhhgtg.m4763Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf3, 1));
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf());
                    }
                    i16 = iArr3[0];
                    if (i16 != i15 || i16 == 4) {
                        int iM5329Ujhhgtgfeyxiexzf3 = c3656Ujhhgtgfeyxiexzf3.m5329Ujhhgtgfeyxiexzf() + iM5330Ujhhgtgfeyxiexzf;
                        c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf3);
                        c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf3 - iM5330Ujhhgtgfeyxiexzf);
                        c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                        i17 = iArr3[1];
                        if (i17 != 1 || i17 == 4) {
                            int iM5326Ujhhgtgfeyxiexzf2 = c3656Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf() + iM5331Ujhhgtgfeyxiexzf;
                            c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf2);
                            c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf2 - iM5331Ujhhgtgfeyxiexzf);
                        }
                        c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg2 : arrayList2) {
                        if (abstractC2229feyxiexzfUjhhgtg2.f7255Ujhhgtgfeyxiexzf == c3656Ujhhgtgfeyxiexzf3 || abstractC2229feyxiexzfUjhhgtg2.f7260Ujhhgtgfeyxiexzf) {
                            abstractC2229feyxiexzfUjhhgtg2.mo1822Ujhhgtgfeyxiexzf();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z6 = true;
                            break;
                        }
                        abstractC2229feyxiexzfUjhhgtg = (AbstractC2229feyxiexzfUjhhgtg) it.next();
                        if (!z5 || abstractC2229feyxiexzfUjhhgtg.f7255Ujhhgtgfeyxiexzf != c3656Ujhhgtgfeyxiexzf3) {
                            if (abstractC2229feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf || ((!abstractC2229feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf && !(abstractC2229feyxiexzfUjhhgtg instanceof C0528Ujhhgtgfeyxiexzf)) || (!abstractC2229feyxiexzfUjhhgtg.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf && !(abstractC2229feyxiexzfUjhhgtg instanceof C2699Ujhhgtgfeyxiexzf) && !(abstractC2229feyxiexzfUjhhgtg instanceof C0528Ujhhgtgfeyxiexzf)))) {
                                z6 = false;
                                break;
                            }
                        }
                    }
                    c3656Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(iM5325Ujhhgtgfeyxiexzf);
                    c3656Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(iM5325Ujhhgtgfeyxiexzf2);
                    zM5353feyxiexzfUjhhgtg = z6;
                    i7 = 2;
                    i13 = 1073741824;
                } else {
                    iM5330Ujhhgtgfeyxiexzf = iM5330Ujhhgtgfeyxiexzf;
                }
                i15 = 1;
                i16 = iArr3[0];
                if (i16 != i15) {
                    int iM5329Ujhhgtgfeyxiexzf4 = c3656Ujhhgtgfeyxiexzf3.m5329Ujhhgtgfeyxiexzf() + iM5330Ujhhgtgfeyxiexzf;
                    c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf4);
                    c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf4 - iM5330Ujhhgtgfeyxiexzf);
                    c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iM5326Ujhhgtgfeyxiexzf3 = c3656Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf() + iM5331Ujhhgtgfeyxiexzf;
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf3);
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf3 - iM5331Ujhhgtgfeyxiexzf);
                    } else {
                        int iM5326Ujhhgtgfeyxiexzf4 = c3656Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf() + iM5331Ujhhgtgfeyxiexzf;
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf4);
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf4 - iM5331Ujhhgtgfeyxiexzf);
                    }
                    c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                    z5 = true;
                } else {
                    int iM5329Ujhhgtgfeyxiexzf5 = c3656Ujhhgtgfeyxiexzf3.m5329Ujhhgtgfeyxiexzf() + iM5330Ujhhgtgfeyxiexzf;
                    c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf5);
                    c3656Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf5 - iM5330Ujhhgtgfeyxiexzf);
                    c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                    i17 = iArr3[1];
                    if (i17 != 1) {
                        int iM5326Ujhhgtgfeyxiexzf5 = c3656Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf() + iM5331Ujhhgtgfeyxiexzf;
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf5);
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf5 - iM5331Ujhhgtgfeyxiexzf);
                    } else {
                        int iM5326Ujhhgtgfeyxiexzf6 = c3656Ujhhgtgfeyxiexzf3.m5326Ujhhgtgfeyxiexzf() + iM5331Ujhhgtgfeyxiexzf;
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf6);
                        c3656Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM5326Ujhhgtgfeyxiexzf6 - iM5331Ujhhgtgfeyxiexzf);
                    }
                    c3258feyxiexzfUjhhgtg.m4766Ujhhgtgfeyxiexzf();
                    z5 = true;
                }
                while (r6.hasNext()) {
                    if (abstractC2229feyxiexzfUjhhgtg2.f7255Ujhhgtgfeyxiexzf == c3656Ujhhgtgfeyxiexzf3) {
                    }
                    abstractC2229feyxiexzfUjhhgtg2.mo1822Ujhhgtgfeyxiexzf();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    abstractC2229feyxiexzfUjhhgtg = (AbstractC2229feyxiexzfUjhhgtg) it.next();
                    if (!z5) {
                    }
                    if (abstractC2229feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf) {
                    }
                    z6 = false;
                    break;
                }
                c3656Ujhhgtgfeyxiexzf3.m5345feyxiexzfUjhhgtg(iM5325Ujhhgtgfeyxiexzf);
                c3656Ujhhgtgfeyxiexzf3.m5346feyxiexzfUjhhgtg(iM5325Ujhhgtgfeyxiexzf2);
                zM5353feyxiexzfUjhhgtg = z6;
                i7 = 2;
                i13 = 1073741824;
            } else {
                z2 = z10;
                c3646Ujhhgtgfeyxiexzf = c3646Ujhhgtgfeyxiexzf5;
                C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf4 = c3258feyxiexzfUjhhgtg.f10216Ujhhgtgfeyxiexzf;
                if (c3258feyxiexzfUjhhgtg.f10217Ujhhgtgfeyxiexzf) {
                    for (C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 : c3656Ujhhgtgfeyxiexzf4.f11632feyxiexzfUjhhgtg) {
                        c3655Ujhhgtgfeyxiexzf3.m5324Ujhhgtgfeyxiexzf();
                        c3655Ujhhgtgfeyxiexzf3.f11570Ujhhgtgfeyxiexzf = false;
                        C0577Ujhhgtgfeyxiexzf c0577Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf;
                        c0577Ujhhgtgfeyxiexzf2.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf = false;
                        c0577Ujhhgtgfeyxiexzf2.f7260Ujhhgtgfeyxiexzf = false;
                        c0577Ujhhgtgfeyxiexzf2.m1847Ujhhgtgfeyxiexzf();
                        C1868feyxiexzfUjhhgtg c1868feyxiexzfUjhhgtg2 = c3655Ujhhgtgfeyxiexzf3.f11574Ujhhgtgfeyxiexzf;
                        c1868feyxiexzfUjhhgtg2.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf = false;
                        c1868feyxiexzfUjhhgtg2.f7260Ujhhgtgfeyxiexzf = false;
                        c1868feyxiexzfUjhhgtg2.m3202Ujhhgtgfeyxiexzf();
                    }
                    i12 = 0;
                    c3656Ujhhgtgfeyxiexzf4.m5324Ujhhgtgfeyxiexzf();
                    c3656Ujhhgtgfeyxiexzf4.f11570Ujhhgtgfeyxiexzf = false;
                    C0577Ujhhgtgfeyxiexzf c0577Ujhhgtgfeyxiexzf3 = c3656Ujhhgtgfeyxiexzf4.f11573Ujhhgtgfeyxiexzf;
                    c0577Ujhhgtgfeyxiexzf3.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf = false;
                    c0577Ujhhgtgfeyxiexzf3.f7260Ujhhgtgfeyxiexzf = false;
                    c0577Ujhhgtgfeyxiexzf3.m1847Ujhhgtgfeyxiexzf();
                    C1868feyxiexzfUjhhgtg c1868feyxiexzfUjhhgtg3 = c3656Ujhhgtgfeyxiexzf4.f11574Ujhhgtgfeyxiexzf;
                    c1868feyxiexzfUjhhgtg3.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf = false;
                    c1868feyxiexzfUjhhgtg3.f7260Ujhhgtgfeyxiexzf = false;
                    c1868feyxiexzfUjhhgtg3.m3202Ujhhgtgfeyxiexzf();
                    c3258feyxiexzfUjhhgtg.m4762Ujhhgtgfeyxiexzf();
                } else {
                    i12 = 0;
                }
                c3258feyxiexzfUjhhgtg.m4761Ujhhgtgfeyxiexzf(c3258feyxiexzfUjhhgtg.f10219Ujhhgtgfeyxiexzf);
                c3656Ujhhgtgfeyxiexzf4.f11614feyxiexzfUjhhgtg = i12;
                c3656Ujhhgtgfeyxiexzf4.f11615feyxiexzfUjhhgtg = i12;
                c3656Ujhhgtgfeyxiexzf4.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(i12);
                c3656Ujhhgtgfeyxiexzf4.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zM5353feyxiexzfUjhhgtg = c3656Ujhhgtgfeyxiexzf.m5353feyxiexzfUjhhgtg(i12, zM5173Ujhhgtgfeyxiexzf);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM5353feyxiexzfUjhhgtg = true;
                }
                if (mode2 == 1073741824) {
                    zM5353feyxiexzfUjhhgtg &= c3656Ujhhgtgfeyxiexzf.m5353feyxiexzfUjhhgtg(1, zM5173Ujhhgtgfeyxiexzf);
                    i7++;
                }
            }
            if (zM5353feyxiexzfUjhhgtg) {
                c3656Ujhhgtgfeyxiexzf.mo5348feyxiexzfUjhhgtg(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z10;
            c3646Ujhhgtgfeyxiexzf = c3646Ujhhgtgfeyxiexzf5;
            i7 = 0;
            zM5353feyxiexzfUjhhgtg = false;
        }
        if (zM5353feyxiexzfUjhhgtg && i7 == 2) {
            return;
        }
        int i30 = c3656Ujhhgtgfeyxiexzf.f11644Ujhhgtgfeyxiexzf;
        if (i5 > 0) {
            int size4 = c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.size();
            boolean zM5355feyxiexzfUjhhgtg = c3656Ujhhgtgfeyxiexzf.m5355feyxiexzfUjhhgtg(64);
            C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf6 = c3656Ujhhgtgfeyxiexzf.f11635feyxiexzfUjhhgtg;
            int i31 = 0;
            while (i31 < size4) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4 = (C3655Ujhhgtgfeyxiexzf) c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.get(i31);
                if ((c3655Ujhhgtgfeyxiexzf4 instanceof C0527Ujhhgtgfeyxiexzf) || (c3655Ujhhgtgfeyxiexzf4 instanceof C2480feyxiexzfUjhhgtg) || c3655Ujhhgtgfeyxiexzf4.f11595feyxiexzfUjhhgtg || (zM5355feyxiexzfUjhhgtg && (c0577Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf4.f11573Ujhhgtgfeyxiexzf) != null && (c1868feyxiexzfUjhhgtg = c3655Ujhhgtgfeyxiexzf4.f11574Ujhhgtgfeyxiexzf) != null && c0577Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf && c1868feyxiexzfUjhhgtg.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf)) {
                    i11 = size4;
                } else {
                    int iM5325Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf4.m5325Ujhhgtgfeyxiexzf(0);
                    int iM5325Ujhhgtgfeyxiexzf4 = c3655Ujhhgtgfeyxiexzf4.m5325Ujhhgtgfeyxiexzf(1);
                    i11 = size4;
                    boolean z11 = iM5325Ujhhgtgfeyxiexzf3 == 3 && c3655Ujhhgtgfeyxiexzf4.f11581Ujhhgtgfeyxiexzf != 1 && iM5325Ujhhgtgfeyxiexzf4 == 3 && c3655Ujhhgtgfeyxiexzf4.f11582Ujhhgtgfeyxiexzf != 1;
                    if (!z11 && c3656Ujhhgtgfeyxiexzf.m5355feyxiexzfUjhhgtg(1) && !(c3655Ujhhgtgfeyxiexzf4 instanceof C3618Ujhhgtgfeyxiexzf)) {
                        if (iM5325Ujhhgtgfeyxiexzf3 == 3 && c3655Ujhhgtgfeyxiexzf4.f11581Ujhhgtgfeyxiexzf == 0 && iM5325Ujhhgtgfeyxiexzf4 != 3 && !c3655Ujhhgtgfeyxiexzf4.m5335Ujhhgtgfeyxiexzf()) {
                            z11 = true;
                        }
                        if (iM5325Ujhhgtgfeyxiexzf4 == 3 && c3655Ujhhgtgfeyxiexzf4.f11582Ujhhgtgfeyxiexzf == 0 && iM5325Ujhhgtgfeyxiexzf3 != 3 && !c3655Ujhhgtgfeyxiexzf4.m5335Ujhhgtgfeyxiexzf()) {
                            z11 = true;
                        }
                        if ((iM5325Ujhhgtgfeyxiexzf3 == 3 || iM5325Ujhhgtgfeyxiexzf4 == 3) && c3655Ujhhgtgfeyxiexzf4.f11612feyxiexzfUjhhgtg > 0.0f) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        c2366Ujhhgtgfeyxiexzf.m3608Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf6, c3655Ujhhgtgfeyxiexzf4, 0);
                    }
                }
                i31++;
                size4 = i11;
            }
            ConstraintLayout constraintLayout = c3646Ujhhgtgfeyxiexzf6.f11459Ujhhgtgfeyxiexzf;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.f199Ujhhgtgfeyxiexzf;
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC3643Ujhhgtgfeyxiexzf) arrayList3.get(i33)).getClass();
                }
            }
        }
        c2366Ujhhgtgfeyxiexzf.m3613feyxiexzfUjhhgtg(c3656Ujhhgtgfeyxiexzf);
        int size6 = arrayList.size();
        if (i5 > 0) {
            c2366Ujhhgtgfeyxiexzf.m3612Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, iM5329Ujhhgtgfeyxiexzf2, iM5326Ujhhgtgfeyxiexzf);
        }
        if (size6 > 0) {
            int[] iArr4 = c3656Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
            boolean z12 = iArr4[0] == 2;
            boolean z13 = iArr4[1] == 2;
            int iMax7 = Math.max(c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf2.f11617feyxiexzfUjhhgtg);
            int iMax8 = Math.max(c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf(), c3656Ujhhgtgfeyxiexzf2.f11618Ujhhgtgfeyxiexzf);
            int i34 = 0;
            boolean z14 = false;
            while (i34 < size6) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5 = (C3655Ujhhgtgfeyxiexzf) arrayList.get(i34);
                if (c3655Ujhhgtgfeyxiexzf5 instanceof C3618Ujhhgtgfeyxiexzf) {
                    int iM5329Ujhhgtgfeyxiexzf6 = c3655Ujhhgtgfeyxiexzf5.m5329Ujhhgtgfeyxiexzf();
                    int iM5326Ujhhgtgfeyxiexzf7 = c3655Ujhhgtgfeyxiexzf5.m5326Ujhhgtgfeyxiexzf();
                    z4 = z13;
                    c3646Ujhhgtgfeyxiexzf3 = c3646Ujhhgtgfeyxiexzf;
                    boolean zM3608Ujhhgtgfeyxiexzf = z14 | c2366Ujhhgtgfeyxiexzf.m3608Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf3, c3655Ujhhgtgfeyxiexzf5, 1);
                    int iM5329Ujhhgtgfeyxiexzf7 = c3655Ujhhgtgfeyxiexzf5.m5329Ujhhgtgfeyxiexzf();
                    boolean z15 = zM3608Ujhhgtgfeyxiexzf;
                    int iM5326Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf5.m5326Ujhhgtgfeyxiexzf();
                    if (iM5329Ujhhgtgfeyxiexzf7 != iM5329Ujhhgtgfeyxiexzf6) {
                        c3655Ujhhgtgfeyxiexzf5.m5347feyxiexzfUjhhgtg(iM5329Ujhhgtgfeyxiexzf7);
                        if (z12 && c3655Ujhhgtgfeyxiexzf5.m5330Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf5.f11610feyxiexzfUjhhgtg > iMax7) {
                            iMax7 = Math.max(iMax7, c3655Ujhhgtgfeyxiexzf5.mo1814Ujhhgtgfeyxiexzf(4).m5289Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf5.m5330Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf5.f11610feyxiexzfUjhhgtg);
                        }
                        z15 = true;
                    }
                    if (iM5326Ujhhgtgfeyxiexzf8 != iM5326Ujhhgtgfeyxiexzf7) {
                        c3655Ujhhgtgfeyxiexzf5.m5344feyxiexzfUjhhgtg(iM5326Ujhhgtgfeyxiexzf8);
                        if (z4 && c3655Ujhhgtgfeyxiexzf5.m5331Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf5.f11611feyxiexzfUjhhgtg > iMax8) {
                            iMax8 = Math.max(iMax8, c3655Ujhhgtgfeyxiexzf5.mo1814Ujhhgtgfeyxiexzf(5).m5289Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf5.m5331Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf5.f11611feyxiexzfUjhhgtg);
                        }
                        z15 = true;
                    }
                    z14 = z15 | ((C3618Ujhhgtgfeyxiexzf) c3655Ujhhgtgfeyxiexzf5).f11277Ujhhgtgfeyxiexzf;
                } else {
                    z4 = z13;
                    c3646Ujhhgtgfeyxiexzf3 = c3646Ujhhgtgfeyxiexzf;
                }
                i34++;
                c3646Ujhhgtgfeyxiexzf = c3646Ujhhgtgfeyxiexzf3;
                z13 = z4;
            }
            boolean z16 = z13;
            int i35 = 0;
            while (true) {
                C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf7 = c3646Ujhhgtgfeyxiexzf;
                if (i35 >= 2) {
                    break;
                }
                boolean zM3608Ujhhgtgfeyxiexzf2 = z14;
                int i36 = 0;
                while (i36 < size6) {
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf6 = (C3655Ujhhgtgfeyxiexzf) arrayList.get(i36);
                    if ((!(c3655Ujhhgtgfeyxiexzf6 instanceof AbstractC0548Ujhhgtgfeyxiexzf) || (c3655Ujhhgtgfeyxiexzf6 instanceof C3618Ujhhgtgfeyxiexzf)) && !(c3655Ujhhgtgfeyxiexzf6 instanceof C0527Ujhhgtgfeyxiexzf)) {
                        i8 = size6;
                        if (c3655Ujhhgtgfeyxiexzf6.f11622Ujhhgtgfeyxiexzf != 8 && ((!z2 || !c3655Ujhhgtgfeyxiexzf6.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf || !c3655Ujhhgtgfeyxiexzf6.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf) && !(c3655Ujhhgtgfeyxiexzf6 instanceof C3618Ujhhgtgfeyxiexzf))) {
                            int iM5329Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf6.m5329Ujhhgtgfeyxiexzf();
                            int iM5326Ujhhgtgfeyxiexzf9 = c3655Ujhhgtgfeyxiexzf6.m5326Ujhhgtgfeyxiexzf();
                            i9 = i36;
                            int i37 = c3655Ujhhgtgfeyxiexzf6.f11616feyxiexzfUjhhgtg;
                            zM3608Ujhhgtgfeyxiexzf2 |= c2366Ujhhgtgfeyxiexzf.m3608Ujhhgtgfeyxiexzf(c3646Ujhhgtgfeyxiexzf7, c3655Ujhhgtgfeyxiexzf6, i35 == 1 ? 2 : 1);
                            c3646Ujhhgtgfeyxiexzf2 = c3646Ujhhgtgfeyxiexzf7;
                            int iM5329Ujhhgtgfeyxiexzf9 = c3655Ujhhgtgfeyxiexzf6.m5329Ujhhgtgfeyxiexzf();
                            i10 = i35;
                            int iM5326Ujhhgtgfeyxiexzf10 = c3655Ujhhgtgfeyxiexzf6.m5326Ujhhgtgfeyxiexzf();
                            if (iM5329Ujhhgtgfeyxiexzf9 != iM5329Ujhhgtgfeyxiexzf8) {
                                c3655Ujhhgtgfeyxiexzf6.m5347feyxiexzfUjhhgtg(iM5329Ujhhgtgfeyxiexzf9);
                                if (z12 && c3655Ujhhgtgfeyxiexzf6.m5330Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf6.f11610feyxiexzfUjhhgtg > iMax7) {
                                    iMax7 = Math.max(iMax7, c3655Ujhhgtgfeyxiexzf6.mo1814Ujhhgtgfeyxiexzf(4).m5289Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf6.m5330Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf6.f11610feyxiexzfUjhhgtg);
                                }
                                zM3608Ujhhgtgfeyxiexzf2 = true;
                            }
                            if (iM5326Ujhhgtgfeyxiexzf10 != iM5326Ujhhgtgfeyxiexzf9) {
                                c3655Ujhhgtgfeyxiexzf6.m5344feyxiexzfUjhhgtg(iM5326Ujhhgtgfeyxiexzf10);
                                if (z16 && c3655Ujhhgtgfeyxiexzf6.m5331Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf6.f11611feyxiexzfUjhhgtg > iMax8) {
                                    iMax8 = Math.max(iMax8, c3655Ujhhgtgfeyxiexzf6.mo1814Ujhhgtgfeyxiexzf(5).m5289Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf6.m5331Ujhhgtgfeyxiexzf() + c3655Ujhhgtgfeyxiexzf6.f11611feyxiexzfUjhhgtg);
                                }
                                zM3608Ujhhgtgfeyxiexzf2 = true;
                            }
                            if (c3655Ujhhgtgfeyxiexzf6.f11594feyxiexzfUjhhgtg && i37 != c3655Ujhhgtgfeyxiexzf6.f11616feyxiexzfUjhhgtg) {
                                zM3608Ujhhgtgfeyxiexzf2 = true;
                            }
                        }
                        i36 = i9 + 1;
                        size6 = i8;
                        i35 = i10;
                        c3646Ujhhgtgfeyxiexzf7 = c3646Ujhhgtgfeyxiexzf2;
                    } else {
                        i8 = size6;
                    }
                    c3646Ujhhgtgfeyxiexzf2 = c3646Ujhhgtgfeyxiexzf7;
                    i10 = i35;
                    i9 = i36;
                    i36 = i9 + 1;
                    size6 = i8;
                    i35 = i10;
                    c3646Ujhhgtgfeyxiexzf7 = c3646Ujhhgtgfeyxiexzf2;
                }
                int i38 = size6;
                c3646Ujhhgtgfeyxiexzf = c3646Ujhhgtgfeyxiexzf7;
                int i39 = i35;
                boolean z17 = zM3608Ujhhgtgfeyxiexzf2;
                if (!z17) {
                    z14 = z17;
                    break;
                }
                c2366Ujhhgtgfeyxiexzf.m3612Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, iM5329Ujhhgtgfeyxiexzf2, iM5326Ujhhgtgfeyxiexzf);
                i35 = i39 + 1;
                size6 = i38;
                z14 = false;
            }
            if (z14) {
                c2366Ujhhgtgfeyxiexzf.m3612Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, iM5329Ujhhgtgfeyxiexzf2, iM5326Ujhhgtgfeyxiexzf);
                if (c3656Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf() < iMax7) {
                    c3656Ujhhgtgfeyxiexzf.m5347feyxiexzfUjhhgtg(iMax7);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c3656Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf() < iMax8) {
                    c3656Ujhhgtgfeyxiexzf.m5344feyxiexzfUjhhgtg(iMax8);
                    z3 = true;
                }
                if (z3) {
                    c2366Ujhhgtgfeyxiexzf.m3612Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, iM5329Ujhhgtgfeyxiexzf2, iM5326Ujhhgtgfeyxiexzf);
                }
            }
        }
        c3656Ujhhgtgfeyxiexzf.f11644Ujhhgtgfeyxiexzf = i30;
        C0072Ujhhgtgfeyxiexzf.f1112Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf.m5355feyxiexzfUjhhgtg(512);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f198Ujhhgtgfeyxiexzf = new SparseArray();
        this.f199Ujhhgtgfeyxiexzf = new ArrayList(4);
        this.f200Ujhhgtgfeyxiexzf = new C3656Ujhhgtgfeyxiexzf();
        this.f201Ujhhgtgfeyxiexzf = 0;
        this.f202Ujhhgtgfeyxiexzf = 0;
        this.f203Ujhhgtgfeyxiexzf = Integer.MAX_VALUE;
        this.f204Ujhhgtgfeyxiexzf = Integer.MAX_VALUE;
        this.f205Ujhhgtgfeyxiexzf = true;
        this.f206Ujhhgtgfeyxiexzf = 257;
        this.f207Ujhhgtgfeyxiexzf = null;
        this.f208Ujhhgtgfeyxiexzf = null;
        this.f209Ujhhgtgfeyxiexzf = -1;
        this.f210Ujhhgtgfeyxiexzf = new HashMap();
        this.f211Ujhhgtgfeyxiexzf = new SparseArray();
        this.f212Ujhhgtgfeyxiexzf = new C3646Ujhhgtgfeyxiexzf(this, this);
        this.f213Ujhhgtgfeyxiexzf = 0;
        this.f214Ujhhgtgfeyxiexzf = 0;
        m55Ujhhgtgfeyxiexzf(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = new C3645Ujhhgtgfeyxiexzf(layoutParams);
        c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11409Ujhhgtgfeyxiexzf = 0;
        c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf = 0.0f;
        c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11415Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11417Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11419Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11420feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11421feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg = null;
        c3645Ujhhgtgfeyxiexzf.f11424feyxiexzfUjhhgtg = 1;
        c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg = -1.0f;
        c3645Ujhhgtgfeyxiexzf.f11427feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11428feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg = 0;
        c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg = 1.0f;
        c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg = 1.0f;
        c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg = false;
        c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg = false;
        c3645Ujhhgtgfeyxiexzf.f11442feyxiexzfUjhhgtg = null;
        c3645Ujhhgtgfeyxiexzf.f11443feyxiexzfUjhhgtg = true;
        c3645Ujhhgtgfeyxiexzf.f11444Ujhhgtgfeyxiexzf = true;
        c3645Ujhhgtgfeyxiexzf.f11445Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11446Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11447Ujhhgtgfeyxiexzf = false;
        c3645Ujhhgtgfeyxiexzf.f11448Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11449Ujhhgtgfeyxiexzf = -1;
        c3645Ujhhgtgfeyxiexzf.f11450feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11451feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11452feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11453feyxiexzfUjhhgtg = -1;
        c3645Ujhhgtgfeyxiexzf.f11454feyxiexzfUjhhgtg = 0.5f;
        c3645Ujhhgtgfeyxiexzf.f11458feyxiexzfUjhhgtg = new C3655Ujhhgtgfeyxiexzf();
        return c3645Ujhhgtgfeyxiexzf;
    }
}
