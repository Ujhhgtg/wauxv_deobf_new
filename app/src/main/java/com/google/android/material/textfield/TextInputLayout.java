package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1246feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1756feyxiexzfUjhhgtg;
import p000.AbstractC1894Ujhhgtgfeyxiexzf;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC1968Ujhhgtgfeyxiexzf;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.AbstractC2857Ujhhgtgfeyxiexzf;
import p000.AbstractC3036feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3252feyxiexzfUjhhgtg;
import p000.AbstractC3260feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0223Ujhhgtgfeyxiexzf;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C0653Ujhhgtgfeyxiexzf;
import p000.C0654Ujhhgtgfeyxiexzf;
import p000.C0945feyxiexzfUjhhgtg;
import p000.C1014feyxiexzfUjhhgtg;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C1122feyxiexzfUjhhgtg;
import p000.C1439feyxiexzfUjhhgtg;
import p000.C1969Ujhhgtgfeyxiexzf;
import p000.C1974Ujhhgtgfeyxiexzf;
import p000.C1978Ujhhgtgfeyxiexzf;
import p000.C1979Ujhhgtgfeyxiexzf;
import p000.C2364Ujhhgtgfeyxiexzf;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2384Ujhhgtgfeyxiexzf;
import p000.C2478feyxiexzfUjhhgtg;
import p000.C2531feyxiexzfUjhhgtg;
import p000.C2643feyxiexzfUjhhgtg;
import p000.C2667feyxiexzfUjhhgtg;
import p000.C2850Ujhhgtgfeyxiexzf;
import p000.C2923Ujhhgtgfeyxiexzf;
import p000.C2965Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3071Ujhhgtgfeyxiexzf;
import p000.C3072Ujhhgtgfeyxiexzf;
import p000.C3245feyxiexzfUjhhgtg;
import p000.C3327Ujhhgtgfeyxiexzf;
import p000.C3335feyxiexzfUjhhgtg;
import p000.C3382feyxiexzfUjhhgtg;
import p000.C3510feyxiexzfUjhhgtg;
import p000.InterfaceC1975Ujhhgtgfeyxiexzf;
import p000.InterfaceC3736Ujhhgtgfeyxiexzf;
import p000.RunnableC2779feyxiexzfUjhhgtg;
import p000.RunnableC3012feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static final int[][] f865feyxiexzfUjhhgtg = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final FrameLayout f866Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1122feyxiexzfUjhhgtg f867Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3335feyxiexzfUjhhgtg f868Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public EditText f869Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public CharSequence f870Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f871Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f872Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f873Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f874Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0654Ujhhgtgfeyxiexzf f875Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f876Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f877Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f878Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public InterfaceC1975Ujhhgtgfeyxiexzf f879Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C2384Ujhhgtgfeyxiexzf f880Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f881Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f882Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public CharSequence f883Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f884Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2384Ujhhgtgfeyxiexzf f885Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public ColorStateList f886Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f887Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public C3510feyxiexzfUjhhgtg f888feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3510feyxiexzfUjhhgtg f889feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public ColorStateList f890feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public ColorStateList f891feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public ColorStateList f892feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public ColorStateList f893feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public boolean f894feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public CharSequence f895feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean f896feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public C0226Ujhhgtgfeyxiexzf f897feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public C0226Ujhhgtgfeyxiexzf f898feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public StateListDrawable f899feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public boolean f900feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public C0226Ujhhgtgfeyxiexzf f901feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public C0226Ujhhgtgfeyxiexzf f902feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public C1017feyxiexzfUjhhgtg f903feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public boolean f904feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int f905feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public int f906feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public int f907feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f908feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f909feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public int f910feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f911feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f912Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Rect f913Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Rect f914Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RectF f915Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Typeface f916Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorDrawable f917Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f918feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final LinkedHashSet f919feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public ColorDrawable f920feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f921feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public Drawable f922feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ColorStateList f923feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorStateList f924Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f925Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f926feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f927feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f928Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f929feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f930Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f931Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f932feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f933feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f934Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f935feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final C2850Ujhhgtgfeyxiexzf f936Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f937Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f938Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ValueAnimator f939Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f940Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f941Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public boolean f942feyxiexzfUjhhgtg;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout), attributeSet, me.hd.wauxv.R.attr.textInputStyle);
        this.f871Ujhhgtgfeyxiexzf = -1;
        this.f872Ujhhgtgfeyxiexzf = -1;
        this.f873Ujhhgtgfeyxiexzf = -1;
        this.f874Ujhhgtgfeyxiexzf = -1;
        this.f875Ujhhgtgfeyxiexzf = new C0654Ujhhgtgfeyxiexzf(this);
        this.f879Ujhhgtgfeyxiexzf = new C1439feyxiexzfUjhhgtg(15);
        this.f913Ujhhgtgfeyxiexzf = new Rect();
        this.f914Ujhhgtgfeyxiexzf = new Rect();
        this.f915Ujhhgtgfeyxiexzf = new RectF();
        this.f919feyxiexzfUjhhgtg = new LinkedHashSet();
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = new C2850Ujhhgtgfeyxiexzf(this);
        this.f936Ujhhgtgfeyxiexzf = c2850Ujhhgtgfeyxiexzf;
        this.f942feyxiexzfUjhhgtg = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f866Ujhhgtgfeyxiexzf = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC3036feyxiexzfUjhhgtg.f9412Ujhhgtgfeyxiexzf;
        c2850Ujhhgtgfeyxiexzf.f9092feyxiexzfUjhhgtg = linearInterpolator;
        c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        c2850Ujhhgtgfeyxiexzf.f9091feyxiexzfUjhhgtg = linearInterpolator;
        c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        if (c2850Ujhhgtgfeyxiexzf.f9056Ujhhgtgfeyxiexzf != 8388659) {
            c2850Ujhhgtgfeyxiexzf.f9056Ujhhgtgfeyxiexzf = 8388659;
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2741Ujhhgtgfeyxiexzf(context2, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3152feyxiexzfUjhhgtg, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = new C1122feyxiexzfUjhhgtg(this, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf);
        this.f867Ujhhgtgfeyxiexzf = c1122feyxiexzfUjhhgtg;
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        this.f894feyxiexzfUjhhgtg = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f938Ujhhgtgfeyxiexzf = typedArray.getBoolean(47, true);
        this.f937Ujhhgtgfeyxiexzf = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f903feyxiexzfUjhhgtg = C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context2, attributeSet, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout).m2507Ujhhgtgfeyxiexzf();
        this.f905feyxiexzfUjhhgtg = context2.getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f907feyxiexzfUjhhgtg = typedArray.getDimensionPixelOffset(9, 0);
        this.f909feyxiexzfUjhhgtg = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f910feyxiexzfUjhhgtg = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f908feyxiexzfUjhhgtg = this.f909feyxiexzfUjhhgtg;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = this.f903feyxiexzfUjhhgtg.m2514Ujhhgtgfeyxiexzf();
        if (dimension >= 0.0f) {
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3952Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(dimension);
        }
        if (dimension2 >= 0.0f) {
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3953Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3954Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3955Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(dimension4);
        }
        this.f903feyxiexzfUjhhgtg = c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf();
        ColorStateList colorStateListM4560Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(context2, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf, 7);
        if (colorStateListM4560Ujhhgtgfeyxiexzf != null) {
            int defaultColor = colorStateListM4560Ujhhgtgfeyxiexzf.getDefaultColor();
            this.f929feyxiexzfUjhhgtg = defaultColor;
            this.f912Ujhhgtgfeyxiexzf = defaultColor;
            if (colorStateListM4560Ujhhgtgfeyxiexzf.isStateful()) {
                this.f930Ujhhgtgfeyxiexzf = colorStateListM4560Ujhhgtgfeyxiexzf.getColorForState(new int[]{-16842910}, -1);
                this.f931Ujhhgtgfeyxiexzf = colorStateListM4560Ujhhgtgfeyxiexzf.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f932feyxiexzfUjhhgtg = colorStateListM4560Ujhhgtgfeyxiexzf.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f931Ujhhgtgfeyxiexzf = this.f929feyxiexzfUjhhgtg;
                ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context2, me.hd.wauxv.R.color.mtrl_filled_background_color);
                this.f930Ujhhgtgfeyxiexzf = colorStateListM4559Ujhhgtgfeyxiexzf.getColorForState(new int[]{-16842910}, -1);
                this.f932feyxiexzfUjhhgtg = colorStateListM4559Ujhhgtgfeyxiexzf.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f912Ujhhgtgfeyxiexzf = 0;
            this.f929feyxiexzfUjhhgtg = 0;
            this.f930Ujhhgtgfeyxiexzf = 0;
            this.f931Ujhhgtgfeyxiexzf = 0;
            this.f932feyxiexzfUjhhgtg = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListM3601Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(1);
            this.f924Ujhhgtgfeyxiexzf = colorStateListM3601Ujhhgtgfeyxiexzf;
            this.f923feyxiexzfUjhhgtg = colorStateListM3601Ujhhgtgfeyxiexzf;
        }
        ColorStateList colorStateListM4560Ujhhgtgfeyxiexzf2 = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(context2, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf, 14);
        this.f927feyxiexzfUjhhgtg = typedArray.getColor(14, 0);
        this.f925Ujhhgtgfeyxiexzf = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_default_box_stroke_color);
        this.f933feyxiexzfUjhhgtg = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_disabled_color);
        this.f926feyxiexzfUjhhgtg = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM4560Ujhhgtgfeyxiexzf2 != null) {
            setBoxStrokeColorStateList(colorStateListM4560Ujhhgtgfeyxiexzf2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(context2, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f892feyxiexzfUjhhgtg = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(24);
        this.f893feyxiexzfUjhhgtg = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f882Ujhhgtgfeyxiexzf = typedArray.getResourceId(22, 0);
        this.f881Ujhhgtgfeyxiexzf = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f881Ujhhgtgfeyxiexzf);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f882Ujhhgtgfeyxiexzf);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(58));
        }
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = new C3335feyxiexzfUjhhgtg(this, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf);
        this.f868Ujhhgtgfeyxiexzf = c3335feyxiexzfUjhhgtg;
        boolean z4 = typedArray.getBoolean(0, true);
        c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        setImportantForAccessibility(2);
        AbstractC1894Ujhhgtgfeyxiexzf.m3229Ujhhgtgfeyxiexzf(this, 1);
        frameLayout.addView(c1122feyxiexzfUjhhgtg);
        frameLayout.addView(c3335feyxiexzfUjhhgtg);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f897feyxiexzfUjhhgtg;
        }
        int iM4211feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this.f869Ujhhgtgfeyxiexzf, me.hd.wauxv.R.attr.colorControlHighlight);
        int i = this.f906feyxiexzfUjhhgtg;
        int[][] iArr = f865feyxiexzfUjhhgtg;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f897feyxiexzfUjhhgtg;
            int i2 = this.f912Ujhhgtgfeyxiexzf;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg, i2, 0.1f), i2}), c0226Ujhhgtgfeyxiexzf, c0226Ujhhgtgfeyxiexzf);
        }
        Context context = getContext();
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = this.f897feyxiexzfUjhhgtg;
        TypedValue typedValueM4526Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4526Ujhhgtgfeyxiexzf(context, me.hd.wauxv.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM4526Ujhhgtgfeyxiexzf.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueM4526Ujhhgtgfeyxiexzf.data;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf3 = new C0226Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf2.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf);
        int iM4216feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg, color, 0.1f);
        c0226Ujhhgtgfeyxiexzf3.m1369Ujhhgtgfeyxiexzf(new ColorStateList(iArr, new int[]{iM4216feyxiexzfUjhhgtg, 0}));
        c0226Ujhhgtgfeyxiexzf3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM4216feyxiexzfUjhhgtg, color});
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf4 = new C0226Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf2.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf);
        c0226Ujhhgtgfeyxiexzf4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0226Ujhhgtgfeyxiexzf3, c0226Ujhhgtgfeyxiexzf4), c0226Ujhhgtgfeyxiexzf2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f899feyxiexzfUjhhgtg == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f899feyxiexzfUjhhgtg = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f899feyxiexzfUjhhgtg.addState(new int[0], m841Ujhhgtgfeyxiexzf(false));
        }
        return this.f899feyxiexzfUjhhgtg;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f898feyxiexzfUjhhgtg == null) {
            this.f898feyxiexzfUjhhgtg = m841Ujhhgtgfeyxiexzf(true);
        }
        return this.f898feyxiexzfUjhhgtg;
    }

    private void setEditText(EditText editText) {
        if (this.f869Ujhhgtgfeyxiexzf != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f869Ujhhgtgfeyxiexzf = editText;
        int i = this.f871Ujhhgtgfeyxiexzf;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f873Ujhhgtgfeyxiexzf);
        }
        int i2 = this.f872Ujhhgtgfeyxiexzf;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f874Ujhhgtgfeyxiexzf);
        }
        this.f900feyxiexzfUjhhgtg = false;
        m844Ujhhgtgfeyxiexzf();
        setTextInputAccessibilityDelegate(new C1979Ujhhgtgfeyxiexzf(this));
        Typeface typeface = this.f869Ujhhgtgfeyxiexzf.getTypeface();
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        c2850Ujhhgtgfeyxiexzf.m4189Ujhhgtgfeyxiexzf(typeface);
        float textSize = this.f869Ujhhgtgfeyxiexzf.getTextSize();
        if (c2850Ujhhgtgfeyxiexzf.f9057Ujhhgtgfeyxiexzf != textSize) {
            c2850Ujhhgtgfeyxiexzf.f9057Ujhhgtgfeyxiexzf = textSize;
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f869Ujhhgtgfeyxiexzf.getLetterSpacing();
        if (c2850Ujhhgtgfeyxiexzf.f9098Ujhhgtgfeyxiexzf != letterSpacing) {
            c2850Ujhhgtgfeyxiexzf.f9098Ujhhgtgfeyxiexzf = letterSpacing;
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        int gravity = this.f869Ujhhgtgfeyxiexzf.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c2850Ujhhgtgfeyxiexzf.f9056Ujhhgtgfeyxiexzf != i4) {
            c2850Ujhhgtgfeyxiexzf.f9056Ujhhgtgfeyxiexzf = i4;
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        if (c2850Ujhhgtgfeyxiexzf.f9055Ujhhgtgfeyxiexzf != gravity) {
            c2850Ujhhgtgfeyxiexzf.f9055Ujhhgtgfeyxiexzf = gravity;
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        this.f934Ujhhgtgfeyxiexzf = editText.getMinimumHeight();
        this.f869Ujhhgtgfeyxiexzf.addTextChangedListener(new C1978Ujhhgtgfeyxiexzf(this, editText));
        if (this.f923feyxiexzfUjhhgtg == null) {
            this.f923feyxiexzfUjhhgtg = this.f869Ujhhgtgfeyxiexzf.getHintTextColors();
        }
        if (this.f894feyxiexzfUjhhgtg) {
            if (TextUtils.isEmpty(this.f895feyxiexzfUjhhgtg)) {
                CharSequence hint = this.f869Ujhhgtgfeyxiexzf.getHint();
                this.f870Ujhhgtgfeyxiexzf = hint;
                setHint(hint);
                this.f869Ujhhgtgfeyxiexzf.setHint((CharSequence) null);
            }
            this.f896feyxiexzfUjhhgtg = true;
        }
        if (i3 >= 29) {
            m850Ujhhgtgfeyxiexzf();
        }
        if (this.f880Ujhhgtgfeyxiexzf != null) {
            m848Ujhhgtgfeyxiexzf(this.f869Ujhhgtgfeyxiexzf.getText());
        }
        m852Ujhhgtgfeyxiexzf();
        this.f875Ujhhgtgfeyxiexzf.m1915Ujhhgtgfeyxiexzf();
        this.f867Ujhhgtgfeyxiexzf.bringToFront();
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.bringToFront();
        Iterator it = this.f919feyxiexzfUjhhgtg.iterator();
        while (it.hasNext()) {
            ((C3327Ujhhgtgfeyxiexzf) it.next()).m4817Ujhhgtgfeyxiexzf(this);
        }
        c3335feyxiexzfUjhhgtg.m4838Ujhhgtgfeyxiexzf();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m855Ujhhgtgfeyxiexzf(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f895feyxiexzfUjhhgtg)) {
            return;
        }
        this.f895feyxiexzfUjhhgtg = charSequence;
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        if (charSequence == null || !TextUtils.equals(c2850Ujhhgtgfeyxiexzf.f9076feyxiexzfUjhhgtg, charSequence)) {
            c2850Ujhhgtgfeyxiexzf.f9076feyxiexzfUjhhgtg = charSequence;
            c2850Ujhhgtgfeyxiexzf.f9077feyxiexzfUjhhgtg = null;
            Bitmap bitmap = c2850Ujhhgtgfeyxiexzf.f9080feyxiexzfUjhhgtg;
            if (bitmap != null) {
                bitmap.recycle();
                c2850Ujhhgtgfeyxiexzf.f9080feyxiexzfUjhhgtg = null;
            }
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        if (this.f935feyxiexzfUjhhgtg) {
            return;
        }
        m845Ujhhgtgfeyxiexzf();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f884Ujhhgtgfeyxiexzf == z) {
            return;
        }
        if (z) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f885Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf != null) {
                this.f866Ujhhgtgfeyxiexzf.addView(c2384Ujhhgtgfeyxiexzf);
                this.f885Ujhhgtgfeyxiexzf.setVisibility(0);
            }
        } else {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = this.f885Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf2 != null) {
                c2384Ujhhgtgfeyxiexzf2.setVisibility(8);
            }
            this.f885Ujhhgtgfeyxiexzf = null;
        }
        this.f884Ujhhgtgfeyxiexzf = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static void m835Ujhhgtgfeyxiexzf(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m835Ujhhgtgfeyxiexzf((ViewGroup) childAt, z);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f866Ujhhgtgfeyxiexzf;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m854Ujhhgtgfeyxiexzf();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f870Ujhhgtgfeyxiexzf != null) {
            boolean z = this.f896feyxiexzfUjhhgtg;
            this.f896feyxiexzfUjhhgtg = false;
            CharSequence hint = editText.getHint();
            this.f869Ujhhgtgfeyxiexzf.setHint(this.f870Ujhhgtgfeyxiexzf);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f869Ujhhgtgfeyxiexzf.setHint(hint);
                this.f896feyxiexzfUjhhgtg = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f866Ujhhgtgfeyxiexzf;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f869Ujhhgtgfeyxiexzf) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f941Ujhhgtgfeyxiexzf = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f941Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f894feyxiexzfUjhhgtg;
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        if (z) {
            TextPaint textPaint = c2850Ujhhgtgfeyxiexzf.f9089feyxiexzfUjhhgtg;
            RectF rectF = c2850Ujhhgtgfeyxiexzf.f9054Ujhhgtgfeyxiexzf;
            int iSave = canvas2.save();
            if (c2850Ujhhgtgfeyxiexzf.f9077feyxiexzfUjhhgtg != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c2850Ujhhgtgfeyxiexzf.f9082feyxiexzfUjhhgtg);
                float f = c2850Ujhhgtgfeyxiexzf.f9065Ujhhgtgfeyxiexzf;
                float f2 = c2850Ujhhgtgfeyxiexzf.f9066Ujhhgtgfeyxiexzf;
                float f3 = c2850Ujhhgtgfeyxiexzf.f9081feyxiexzfUjhhgtg;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (c2850Ujhhgtgfeyxiexzf.f9105feyxiexzfUjhhgtg <= 1 || c2850Ujhhgtgfeyxiexzf.f9078feyxiexzfUjhhgtg) {
                    canvas2.translate(f, f2);
                    c2850Ujhhgtgfeyxiexzf.f9100Ujhhgtgfeyxiexzf.draw(canvas2);
                } else {
                    float lineStart = c2850Ujhhgtgfeyxiexzf.f9065Ujhhgtgfeyxiexzf - c2850Ujhhgtgfeyxiexzf.f9100Ujhhgtgfeyxiexzf.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c2850Ujhhgtgfeyxiexzf.f9103Ujhhgtgfeyxiexzf * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c2850Ujhhgtgfeyxiexzf.f9083feyxiexzfUjhhgtg;
                        float f6 = c2850Ujhhgtgfeyxiexzf.f9084feyxiexzfUjhhgtg;
                        float f7 = c2850Ujhhgtgfeyxiexzf.f9085feyxiexzfUjhhgtg;
                        int i2 = c2850Ujhhgtgfeyxiexzf.f9086feyxiexzfUjhhgtg;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    c2850Ujhhgtgfeyxiexzf.f9100Ujhhgtgfeyxiexzf.draw(canvas2);
                    textPaint.setAlpha((int) (c2850Ujhhgtgfeyxiexzf.f9102Ujhhgtgfeyxiexzf * f4));
                    if (i >= 31) {
                        float f8 = c2850Ujhhgtgfeyxiexzf.f9083feyxiexzfUjhhgtg;
                        float f9 = c2850Ujhhgtgfeyxiexzf.f9084feyxiexzfUjhhgtg;
                        float f10 = c2850Ujhhgtgfeyxiexzf.f9085feyxiexzfUjhhgtg;
                        int i3 = c2850Ujhhgtgfeyxiexzf.f9086feyxiexzfUjhhgtg;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c2850Ujhhgtgfeyxiexzf.f9100Ujhhgtgfeyxiexzf.getLineBaseline(0);
                    CharSequence charSequence = c2850Ujhhgtgfeyxiexzf.f9104feyxiexzfUjhhgtg;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c2850Ujhhgtgfeyxiexzf.f9083feyxiexzfUjhhgtg, c2850Ujhhgtgfeyxiexzf.f9084feyxiexzfUjhhgtg, c2850Ujhhgtgfeyxiexzf.f9085feyxiexzfUjhhgtg, c2850Ujhhgtgfeyxiexzf.f9086feyxiexzfUjhhgtg);
                    }
                    String strTrim = c2850Ujhhgtgfeyxiexzf.f9104feyxiexzfUjhhgtg.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c2850Ujhhgtgfeyxiexzf.f9100Ujhhgtgfeyxiexzf.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f902feyxiexzfUjhhgtg == null || (c0226Ujhhgtgfeyxiexzf = this.f901feyxiexzfUjhhgtg) == null) {
            return;
        }
        c0226Ujhhgtgfeyxiexzf.draw(canvas2);
        if (this.f869Ujhhgtgfeyxiexzf.isFocused()) {
            Rect bounds = this.f902feyxiexzfUjhhgtg.getBounds();
            Rect bounds2 = this.f901feyxiexzfUjhhgtg.getBounds();
            float f12 = c2850Ujhhgtgfeyxiexzf.f9051Ujhhgtgfeyxiexzf;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC3036feyxiexzfUjhhgtg.m4511Ujhhgtgfeyxiexzf(iCenterX, bounds2.right, f12);
            this.f902feyxiexzfUjhhgtg.draw(canvas2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f940Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f940Ujhhgtgfeyxiexzf = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        if (c2850Ujhhgtgfeyxiexzf != null) {
            c2850Ujhhgtgfeyxiexzf.f9087feyxiexzfUjhhgtg = drawableState;
            ColorStateList colorStateList2 = c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c2850Ujhhgtgfeyxiexzf.f9059Ujhhgtgfeyxiexzf) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f869Ujhhgtgfeyxiexzf != null) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            m855Ujhhgtgfeyxiexzf(isLaidOut() && isEnabled(), false);
        }
        m852Ujhhgtgfeyxiexzf();
        m858Ujhhgtgfeyxiexzf();
        if (z) {
            invalidate();
        }
        this.f940Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null) {
            return super.getBaseline();
        }
        return m838Ujhhgtgfeyxiexzf() + getPaddingTop() + editText.getBaseline();
    }

    public C0226Ujhhgtgfeyxiexzf getBoxBackground() {
        int i = this.f906feyxiexzfUjhhgtg;
        if (i == 1 || i == 2) {
            return this.f897feyxiexzfUjhhgtg;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f912Ujhhgtgfeyxiexzf;
    }

    public int getBoxBackgroundMode() {
        return this.f906feyxiexzfUjhhgtg;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f907feyxiexzfUjhhgtg;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM3282Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this);
        RectF rectF = this.f915Ujhhgtgfeyxiexzf;
        return zM3282Ujhhgtgfeyxiexzf ? this.f903feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF) : this.f903feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM3282Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this);
        RectF rectF = this.f915Ujhhgtgfeyxiexzf;
        return zM3282Ujhhgtgfeyxiexzf ? this.f903feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF) : this.f903feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM3282Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this);
        RectF rectF = this.f915Ujhhgtgfeyxiexzf;
        return zM3282Ujhhgtgfeyxiexzf ? this.f903feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF) : this.f903feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM3282Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this);
        RectF rectF = this.f915Ujhhgtgfeyxiexzf;
        return zM3282Ujhhgtgfeyxiexzf ? this.f903feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF) : this.f903feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f927feyxiexzfUjhhgtg;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f928Ujhhgtgfeyxiexzf;
    }

    public int getBoxStrokeWidth() {
        return this.f909feyxiexzfUjhhgtg;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f910feyxiexzfUjhhgtg;
    }

    public int getCounterMaxLength() {
        return this.f877Ujhhgtgfeyxiexzf;
    }

    public CharSequence getCounterOverflowDescription() {
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf;
        if (this.f876Ujhhgtgfeyxiexzf && this.f878Ujhhgtgfeyxiexzf && (c2384Ujhhgtgfeyxiexzf = this.f880Ujhhgtgfeyxiexzf) != null) {
            return c2384Ujhhgtgfeyxiexzf.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f891feyxiexzfUjhhgtg;
    }

    public ColorStateList getCounterTextColor() {
        return this.f890feyxiexzfUjhhgtg;
    }

    public ColorStateList getCursorColor() {
        return this.f892feyxiexzfUjhhgtg;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f893feyxiexzfUjhhgtg;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f923feyxiexzfUjhhgtg;
    }

    public EditText getEditText() {
        return this.f869Ujhhgtgfeyxiexzf;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f868Ujhhgtgfeyxiexzf.f10402Ujhhgtgfeyxiexzf;
    }

    public int getEndIconMode() {
        return this.f868Ujhhgtgfeyxiexzf.f10398Ujhhgtgfeyxiexzf;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f868Ujhhgtgfeyxiexzf.f10403Ujhhgtgfeyxiexzf;
    }

    public CheckableImageButton getEndIconView() {
        return this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf;
    }

    public CharSequence getError() {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        if (c0654Ujhhgtgfeyxiexzf.f2732Ujhhgtgfeyxiexzf) {
            return c0654Ujhhgtgfeyxiexzf.f2731Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f875Ujhhgtgfeyxiexzf.f2735Ujhhgtgfeyxiexzf;
    }

    public CharSequence getErrorContentDescription() {
        return this.f875Ujhhgtgfeyxiexzf.f2734Ujhhgtgfeyxiexzf;
    }

    public int getErrorCurrentTextColors() {
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            return c2384Ujhhgtgfeyxiexzf.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f868Ujhhgtgfeyxiexzf.f10392Ujhhgtgfeyxiexzf.getDrawable();
    }

    public CharSequence getHelperText() {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        if (c0654Ujhhgtgfeyxiexzf.f2739Ujhhgtgfeyxiexzf) {
            return c0654Ujhhgtgfeyxiexzf.f2738Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            return c2384Ujhhgtgfeyxiexzf.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f894feyxiexzfUjhhgtg) {
            return this.f895feyxiexzfUjhhgtg;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f936Ujhhgtgfeyxiexzf.m4181Ujhhgtgfeyxiexzf();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        return c2850Ujhhgtgfeyxiexzf.m4182Ujhhgtgfeyxiexzf(c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf);
    }

    public ColorStateList getHintTextColor() {
        return this.f924Ujhhgtgfeyxiexzf;
    }

    public InterfaceC1975Ujhhgtgfeyxiexzf getLengthCounter() {
        return this.f879Ujhhgtgfeyxiexzf;
    }

    public int getMaxEms() {
        return this.f872Ujhhgtgfeyxiexzf;
    }

    public int getMaxWidth() {
        return this.f874Ujhhgtgfeyxiexzf;
    }

    public int getMinEms() {
        return this.f871Ujhhgtgfeyxiexzf;
    }

    public int getMinWidth() {
        return this.f873Ujhhgtgfeyxiexzf;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f884Ujhhgtgfeyxiexzf) {
            return this.f883Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f887Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f886Ujhhgtgfeyxiexzf;
    }

    public CharSequence getPrefixText() {
        return this.f867Ujhhgtgfeyxiexzf.f4226Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f867Ujhhgtgfeyxiexzf.f4225Ujhhgtgfeyxiexzf.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f867Ujhhgtgfeyxiexzf.f4225Ujhhgtgfeyxiexzf;
    }

    public C1017feyxiexzfUjhhgtg getShapeAppearanceModel() {
        return this.f903feyxiexzfUjhhgtg;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f867Ujhhgtgfeyxiexzf.f4227Ujhhgtgfeyxiexzf.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f867Ujhhgtgfeyxiexzf.f4227Ujhhgtgfeyxiexzf.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f867Ujhhgtgfeyxiexzf.f4230Ujhhgtgfeyxiexzf;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f867Ujhhgtgfeyxiexzf.f4231Ujhhgtgfeyxiexzf;
    }

    public CharSequence getSuffixText() {
        return this.f868Ujhhgtgfeyxiexzf.f10405Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f868Ujhhgtgfeyxiexzf.f10406Ujhhgtgfeyxiexzf.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f868Ujhhgtgfeyxiexzf.f10406Ujhhgtgfeyxiexzf;
    }

    public Typeface getTypeface() {
        return this.f916Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f936Ujhhgtgfeyxiexzf.m4183Ujhhgtgfeyxiexzf(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f942feyxiexzfUjhhgtg = false;
        if (this.f869Ujhhgtgfeyxiexzf != null && this.f869Ujhhgtgfeyxiexzf.getMeasuredHeight() < (iMax = Math.max(c3335feyxiexzfUjhhgtg.getMeasuredHeight(), this.f867Ujhhgtgfeyxiexzf.getMeasuredHeight()))) {
            this.f869Ujhhgtgfeyxiexzf.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM851Ujhhgtgfeyxiexzf = m851Ujhhgtgfeyxiexzf();
        if (z || zM851Ujhhgtgfeyxiexzf) {
            this.f869Ujhhgtgfeyxiexzf.post(new RunnableC2779feyxiexzfUjhhgtg(8, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC3260feyxiexzfUjhhgtg.f10236Ujhhgtgfeyxiexzf;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f913Ujhhgtgfeyxiexzf;
            rect.set(0, 0, width, height);
            AbstractC3260feyxiexzfUjhhgtg.m4770Ujhhgtgfeyxiexzf(this, editText, rect);
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f901feyxiexzfUjhhgtg;
            if (c0226Ujhhgtgfeyxiexzf != null) {
                int i5 = rect.bottom;
                c0226Ujhhgtgfeyxiexzf.setBounds(rect.left, i5 - this.f909feyxiexzfUjhhgtg, rect.right, i5);
            }
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = this.f902feyxiexzfUjhhgtg;
            if (c0226Ujhhgtgfeyxiexzf2 != null) {
                int i6 = rect.bottom;
                c0226Ujhhgtgfeyxiexzf2.setBounds(rect.left, i6 - this.f910feyxiexzfUjhhgtg, rect.right, i6);
            }
            if (this.f894feyxiexzfUjhhgtg) {
                float textSize = this.f869Ujhhgtgfeyxiexzf.getTextSize();
                C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
                if (c2850Ujhhgtgfeyxiexzf.f9057Ujhhgtgfeyxiexzf != textSize) {
                    c2850Ujhhgtgfeyxiexzf.f9057Ujhhgtgfeyxiexzf = textSize;
                    c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
                }
                int gravity = this.f869Ujhhgtgfeyxiexzf.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c2850Ujhhgtgfeyxiexzf.f9056Ujhhgtgfeyxiexzf != i7) {
                    c2850Ujhhgtgfeyxiexzf.f9056Ujhhgtgfeyxiexzf = i7;
                    c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
                }
                if (c2850Ujhhgtgfeyxiexzf.f9055Ujhhgtgfeyxiexzf != gravity) {
                    c2850Ujhhgtgfeyxiexzf.f9055Ujhhgtgfeyxiexzf = gravity;
                    c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
                }
                if (this.f869Ujhhgtgfeyxiexzf == null) {
                    throw new IllegalStateException();
                }
                boolean zM3282Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f914Ujhhgtgfeyxiexzf;
                rect2.bottom = i8;
                int i9 = this.f906feyxiexzfUjhhgtg;
                if (i9 == 1) {
                    rect2.left = m842Ujhhgtgfeyxiexzf(rect.left, zM3282Ujhhgtgfeyxiexzf);
                    rect2.top = rect.top + this.f907feyxiexzfUjhhgtg;
                    rect2.right = m843Ujhhgtgfeyxiexzf(rect.right, zM3282Ujhhgtgfeyxiexzf);
                } else if (i9 != 2) {
                    rect2.left = m842Ujhhgtgfeyxiexzf(rect.left, zM3282Ujhhgtgfeyxiexzf);
                    rect2.top = getPaddingTop();
                    rect2.right = m843Ujhhgtgfeyxiexzf(rect.right, zM3282Ujhhgtgfeyxiexzf);
                } else {
                    rect2.left = this.f869Ujhhgtgfeyxiexzf.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m838Ujhhgtgfeyxiexzf();
                    rect2.right = rect.right - this.f869Ujhhgtgfeyxiexzf.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c2850Ujhhgtgfeyxiexzf.f9053Ujhhgtgfeyxiexzf;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c2850Ujhhgtgfeyxiexzf.f9088feyxiexzfUjhhgtg = true;
                }
                if (this.f869Ujhhgtgfeyxiexzf == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c2850Ujhhgtgfeyxiexzf.f9090feyxiexzfUjhhgtg;
                textPaint.setTextSize(c2850Ujhhgtgfeyxiexzf.f9057Ujhhgtgfeyxiexzf);
                textPaint.setTypeface(c2850Ujhhgtgfeyxiexzf.f9070Ujhhgtgfeyxiexzf);
                textPaint.setLetterSpacing(c2850Ujhhgtgfeyxiexzf.f9098Ujhhgtgfeyxiexzf);
                float f = -textPaint.ascent();
                rect2.left = this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f906feyxiexzfUjhhgtg != 1 || this.f869Ujhhgtgfeyxiexzf.getMinLines() > 1) ? rect.top + this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f906feyxiexzfUjhhgtg != 1 || this.f869Ujhhgtgfeyxiexzf.getMinLines() > 1) ? rect.bottom - this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c2850Ujhhgtgfeyxiexzf.f9052Ujhhgtgfeyxiexzf;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c2850Ujhhgtgfeyxiexzf.f9088feyxiexzfUjhhgtg = true;
                }
                c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
                if (!m840Ujhhgtgfeyxiexzf() || this.f935feyxiexzfUjhhgtg) {
                    return;
                }
                m845Ujhhgtgfeyxiexzf();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f942feyxiexzfUjhhgtg;
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (!z) {
            c3335feyxiexzfUjhhgtg.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f942feyxiexzfUjhhgtg = true;
        }
        if (this.f885Ujhhgtgfeyxiexzf != null && (editText = this.f869Ujhhgtgfeyxiexzf) != null) {
            this.f885Ujhhgtgfeyxiexzf.setGravity(editText.getGravity());
            this.f885Ujhhgtgfeyxiexzf.setPadding(this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingLeft(), this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingTop(), this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingRight(), this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingBottom());
        }
        c3335feyxiexzfUjhhgtg.m4838Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1974Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1974Ujhhgtgfeyxiexzf c1974Ujhhgtgfeyxiexzf = (C1974Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c1974Ujhhgtgfeyxiexzf.f9210Ujhhgtgfeyxiexzf);
        setError(c1974Ujhhgtgfeyxiexzf.f6480Ujhhgtgfeyxiexzf);
        if (c1974Ujhhgtgfeyxiexzf.f6481Ujhhgtgfeyxiexzf) {
            post(new RunnableC3012feyxiexzfUjhhgtg(16, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f904feyxiexzfUjhhgtg) {
            InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf = this.f903feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf;
            RectF rectF = this.f915Ujhhgtgfeyxiexzf;
            float fMo2475Ujhhgtgfeyxiexzf = interfaceC3736Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
            float fMo2475Ujhhgtgfeyxiexzf2 = this.f903feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
            float fMo2475Ujhhgtgfeyxiexzf3 = this.f903feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
            float fMo2475Ujhhgtgfeyxiexzf4 = this.f903feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF);
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f903feyxiexzfUjhhgtg;
            AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg.f3973Ujhhgtgfeyxiexzf;
            AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg2 = c1017feyxiexzfUjhhgtg.f3974Ujhhgtgfeyxiexzf;
            AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg3 = c1017feyxiexzfUjhhgtg.f3976Ujhhgtgfeyxiexzf;
            AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg4 = c1017feyxiexzfUjhhgtg.f3975Ujhhgtgfeyxiexzf;
            C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = new C3382feyxiexzfUjhhgtg();
            C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg2 = new C3382feyxiexzfUjhhgtg();
            C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg3 = new C3382feyxiexzfUjhhgtg();
            C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg4 = new C3382feyxiexzfUjhhgtg();
            C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(fMo2475Ujhhgtgfeyxiexzf2);
            C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf2 = new C2923Ujhhgtgfeyxiexzf(fMo2475Ujhhgtgfeyxiexzf);
            C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf3 = new C2923Ujhhgtgfeyxiexzf(fMo2475Ujhhgtgfeyxiexzf4);
            C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf4 = new C2923Ujhhgtgfeyxiexzf(fMo2475Ujhhgtgfeyxiexzf3);
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg2 = new C1017feyxiexzfUjhhgtg();
            c1017feyxiexzfUjhhgtg2.f3973Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtg2;
            c1017feyxiexzfUjhhgtg2.f3974Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtg;
            c1017feyxiexzfUjhhgtg2.f3975Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtg3;
            c1017feyxiexzfUjhhgtg2.f3976Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtg4;
            c1017feyxiexzfUjhhgtg2.f3977Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf;
            c1017feyxiexzfUjhhgtg2.f3978Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf2;
            c1017feyxiexzfUjhhgtg2.f3979Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf4;
            c1017feyxiexzfUjhhgtg2.f3980Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf3;
            c1017feyxiexzfUjhhgtg2.f3981Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
            c1017feyxiexzfUjhhgtg2.f3982Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg2;
            c1017feyxiexzfUjhhgtg2.f3983Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg3;
            c1017feyxiexzfUjhhgtg2.f3984Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg4;
            this.f904feyxiexzfUjhhgtg = z;
            setShapeAppearanceModel(c1017feyxiexzfUjhhgtg2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1974Ujhhgtgfeyxiexzf c1974Ujhhgtgfeyxiexzf = new C1974Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        if (m847Ujhhgtgfeyxiexzf()) {
            c1974Ujhhgtgfeyxiexzf.f6480Ujhhgtgfeyxiexzf = getError();
        }
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c1974Ujhhgtgfeyxiexzf.f6481Ujhhgtgfeyxiexzf = c3335feyxiexzfUjhhgtg.f10398Ujhhgtgfeyxiexzf != 0 && c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf.f804Ujhhgtgfeyxiexzf;
        return c1974Ujhhgtgfeyxiexzf;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f912Ujhhgtgfeyxiexzf != i) {
            this.f912Ujhhgtgfeyxiexzf = i;
            this.f929feyxiexzfUjhhgtg = i;
            this.f931Ujhhgtgfeyxiexzf = i;
            this.f932feyxiexzfUjhhgtg = i;
            m837Ujhhgtgfeyxiexzf();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f929feyxiexzfUjhhgtg = defaultColor;
        this.f912Ujhhgtgfeyxiexzf = defaultColor;
        this.f930Ujhhgtgfeyxiexzf = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f931Ujhhgtgfeyxiexzf = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f932feyxiexzfUjhhgtg = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m837Ujhhgtgfeyxiexzf();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f906feyxiexzfUjhhgtg) {
            return;
        }
        this.f906feyxiexzfUjhhgtg = i;
        if (this.f869Ujhhgtgfeyxiexzf != null) {
            m844Ujhhgtgfeyxiexzf();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f907feyxiexzfUjhhgtg = i;
    }

    public void setBoxCornerFamily(int i) {
        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = this.f903feyxiexzfUjhhgtg.m2514Ujhhgtgfeyxiexzf();
        InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf = this.f903feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3948Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5055Ujhhgtgfeyxiexzf(i);
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3952Ujhhgtgfeyxiexzf = interfaceC3736Ujhhgtgfeyxiexzf;
        InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf2 = this.f903feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3949Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5055Ujhhgtgfeyxiexzf(i);
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3953Ujhhgtgfeyxiexzf = interfaceC3736Ujhhgtgfeyxiexzf2;
        InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf3 = this.f903feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3951Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5055Ujhhgtgfeyxiexzf(i);
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3955Ujhhgtgfeyxiexzf = interfaceC3736Ujhhgtgfeyxiexzf3;
        InterfaceC3736Ujhhgtgfeyxiexzf interfaceC3736Ujhhgtgfeyxiexzf4 = this.f903feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf;
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3950Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5055Ujhhgtgfeyxiexzf(i);
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3954Ujhhgtgfeyxiexzf = interfaceC3736Ujhhgtgfeyxiexzf4;
        this.f903feyxiexzfUjhhgtg = c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf();
        m837Ujhhgtgfeyxiexzf();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f927feyxiexzfUjhhgtg != i) {
            this.f927feyxiexzfUjhhgtg = i;
            m858Ujhhgtgfeyxiexzf();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f925Ujhhgtgfeyxiexzf = colorStateList.getDefaultColor();
            this.f933feyxiexzfUjhhgtg = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f926feyxiexzfUjhhgtg = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f927feyxiexzfUjhhgtg = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f927feyxiexzfUjhhgtg != colorStateList.getDefaultColor()) {
            this.f927feyxiexzfUjhhgtg = colorStateList.getDefaultColor();
        }
        m858Ujhhgtgfeyxiexzf();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f928Ujhhgtgfeyxiexzf != colorStateList) {
            this.f928Ujhhgtgfeyxiexzf = colorStateList;
            m858Ujhhgtgfeyxiexzf();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f909feyxiexzfUjhhgtg = i;
        m858Ujhhgtgfeyxiexzf();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f910feyxiexzfUjhhgtg = i;
        m858Ujhhgtgfeyxiexzf();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f876Ujhhgtgfeyxiexzf != z) {
            C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
            if (z) {
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = new C2384Ujhhgtgfeyxiexzf(getContext(), null);
                this.f880Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf;
                c2384Ujhhgtgfeyxiexzf.setId(me.hd.wauxv.R.id.textinput_counter);
                Typeface typeface = this.f916Ujhhgtgfeyxiexzf;
                if (typeface != null) {
                    this.f880Ujhhgtgfeyxiexzf.setTypeface(typeface);
                }
                this.f880Ujhhgtgfeyxiexzf.setMaxLines(1);
                c0654Ujhhgtgfeyxiexzf.m1914Ujhhgtgfeyxiexzf(this.f880Ujhhgtgfeyxiexzf, 2);
                ((ViewGroup.MarginLayoutParams) this.f880Ujhhgtgfeyxiexzf.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_textinput_counter_margin_start));
                m849Ujhhgtgfeyxiexzf();
                if (this.f880Ujhhgtgfeyxiexzf != null) {
                    EditText editText = this.f869Ujhhgtgfeyxiexzf;
                    m848Ujhhgtgfeyxiexzf(editText != null ? editText.getText() : null);
                }
            } else {
                c0654Ujhhgtgfeyxiexzf.m1920Ujhhgtgfeyxiexzf(this.f880Ujhhgtgfeyxiexzf, 2);
                this.f880Ujhhgtgfeyxiexzf = null;
            }
            this.f876Ujhhgtgfeyxiexzf = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f877Ujhhgtgfeyxiexzf != i) {
            if (i > 0) {
                this.f877Ujhhgtgfeyxiexzf = i;
            } else {
                this.f877Ujhhgtgfeyxiexzf = -1;
            }
            if (!this.f876Ujhhgtgfeyxiexzf || this.f880Ujhhgtgfeyxiexzf == null) {
                return;
            }
            EditText editText = this.f869Ujhhgtgfeyxiexzf;
            m848Ujhhgtgfeyxiexzf(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f881Ujhhgtgfeyxiexzf != i) {
            this.f881Ujhhgtgfeyxiexzf = i;
            m849Ujhhgtgfeyxiexzf();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f891feyxiexzfUjhhgtg != colorStateList) {
            this.f891feyxiexzfUjhhgtg = colorStateList;
            m849Ujhhgtgfeyxiexzf();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f882Ujhhgtgfeyxiexzf != i) {
            this.f882Ujhhgtgfeyxiexzf = i;
            m849Ujhhgtgfeyxiexzf();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f890feyxiexzfUjhhgtg != colorStateList) {
            this.f890feyxiexzfUjhhgtg = colorStateList;
            m849Ujhhgtgfeyxiexzf();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f892feyxiexzfUjhhgtg != colorStateList) {
            this.f892feyxiexzfUjhhgtg = colorStateList;
            m850Ujhhgtgfeyxiexzf();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f893feyxiexzfUjhhgtg != colorStateList) {
            this.f893feyxiexzfUjhhgtg = colorStateList;
            if (m847Ujhhgtgfeyxiexzf() || (this.f880Ujhhgtgfeyxiexzf != null && this.f878Ujhhgtgfeyxiexzf)) {
                m850Ujhhgtgfeyxiexzf();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f923feyxiexzfUjhhgtg = colorStateList;
        this.f924Ujhhgtgfeyxiexzf = colorStateList;
        if (this.f869Ujhhgtgfeyxiexzf != null) {
            m855Ujhhgtgfeyxiexzf(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m835Ujhhgtgfeyxiexzf(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        CharSequence text = i != 0 ? c3335feyxiexzfUjhhgtg.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        Drawable drawableM2824Ujhhgtgfeyxiexzf = i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), i) : null;
        TextInputLayout textInputLayout = c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
        checkableImageButton.setImageDrawable(drawableM2824Ujhhgtgfeyxiexzf);
        if (drawableM2824Ujhhgtgfeyxiexzf != null) {
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf);
            AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf);
        }
    }

    public void setEndIconMinSize(int i) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (i < 0) {
            c3335feyxiexzfUjhhgtg.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c3335feyxiexzfUjhhgtg.f10402Ujhhgtgfeyxiexzf) {
            c3335feyxiexzfUjhhgtg.f10402Ujhhgtgfeyxiexzf = i;
            CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f868Ujhhgtgfeyxiexzf.m4832Ujhhgtgfeyxiexzf(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
        View.OnLongClickListener onLongClickListener = c3335feyxiexzfUjhhgtg.f10404Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10404Ujhhgtgfeyxiexzf = onLongClickListener;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10403Ujhhgtgfeyxiexzf = scaleType;
        c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf.setScaleType(scaleType);
        c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf != colorStateList) {
            c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf = colorStateList;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf, colorStateList, c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf != mode) {
            c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf = mode;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f868Ujhhgtgfeyxiexzf.m4833Ujhhgtgfeyxiexzf(z);
    }

    public void setError(CharSequence charSequence) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        if (!c0654Ujhhgtgfeyxiexzf.f2732Ujhhgtgfeyxiexzf) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0654Ujhhgtgfeyxiexzf.m1919Ujhhgtgfeyxiexzf();
            return;
        }
        c0654Ujhhgtgfeyxiexzf.m1916Ujhhgtgfeyxiexzf();
        c0654Ujhhgtgfeyxiexzf.f2731Ujhhgtgfeyxiexzf = charSequence;
        c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf.setText(charSequence);
        int i = c0654Ujhhgtgfeyxiexzf.f2729Ujhhgtgfeyxiexzf;
        if (i != 1) {
            c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf = 1;
        }
        c0654Ujhhgtgfeyxiexzf.m1922Ujhhgtgfeyxiexzf(i, c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf, c0654Ujhhgtgfeyxiexzf.m1921Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2735Ujhhgtgfeyxiexzf = i;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            c2384Ujhhgtgfeyxiexzf.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2734Ujhhgtgfeyxiexzf = charSequence;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            c2384Ujhhgtgfeyxiexzf.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout = c0654Ujhhgtgfeyxiexzf.f2723Ujhhgtgfeyxiexzf;
        if (c0654Ujhhgtgfeyxiexzf.f2732Ujhhgtgfeyxiexzf == z) {
            return;
        }
        c0654Ujhhgtgfeyxiexzf.m1916Ujhhgtgfeyxiexzf();
        if (z) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = new C2384Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2722Ujhhgtgfeyxiexzf, null);
            c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf;
            c2384Ujhhgtgfeyxiexzf.setId(me.hd.wauxv.R.id.textinput_error);
            c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf.setTextAlignment(5);
            Typeface typeface = c0654Ujhhgtgfeyxiexzf.f2743feyxiexzfUjhhgtg;
            if (typeface != null) {
                c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf.setTypeface(typeface);
            }
            int i = c0654Ujhhgtgfeyxiexzf.f2736Ujhhgtgfeyxiexzf;
            c0654Ujhhgtgfeyxiexzf.f2736Ujhhgtgfeyxiexzf = i;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf2 != null) {
                c0654Ujhhgtgfeyxiexzf.f2723Ujhhgtgfeyxiexzf.m846Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf2, i);
            }
            ColorStateList colorStateList = c0654Ujhhgtgfeyxiexzf.f2737Ujhhgtgfeyxiexzf;
            c0654Ujhhgtgfeyxiexzf.f2737Ujhhgtgfeyxiexzf = colorStateList;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf3 = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf3 != null && colorStateList != null) {
                c2384Ujhhgtgfeyxiexzf3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0654Ujhhgtgfeyxiexzf.f2734Ujhhgtgfeyxiexzf;
            c0654Ujhhgtgfeyxiexzf.f2734Ujhhgtgfeyxiexzf = charSequence;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf4 = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf4 != null) {
                c2384Ujhhgtgfeyxiexzf4.setContentDescription(charSequence);
            }
            int i2 = c0654Ujhhgtgfeyxiexzf.f2735Ujhhgtgfeyxiexzf;
            c0654Ujhhgtgfeyxiexzf.f2735Ujhhgtgfeyxiexzf = i2;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf5 = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf5 != null) {
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                c2384Ujhhgtgfeyxiexzf5.setAccessibilityLiveRegion(i2);
            }
            c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf.setVisibility(4);
            c0654Ujhhgtgfeyxiexzf.m1914Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf, 0);
        } else {
            c0654Ujhhgtgfeyxiexzf.m1919Ujhhgtgfeyxiexzf();
            c0654Ujhhgtgfeyxiexzf.m1920Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf, 0);
            c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf = null;
            textInputLayout.m852Ujhhgtgfeyxiexzf();
            textInputLayout.m858Ujhhgtgfeyxiexzf();
        }
        c0654Ujhhgtgfeyxiexzf.f2732Ujhhgtgfeyxiexzf = z;
    }

    public void setErrorIconDrawable(int i) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.m4834Ujhhgtgfeyxiexzf(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), i) : null);
        AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10393Ujhhgtgfeyxiexzf);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf;
        View.OnLongClickListener onLongClickListener = c3335feyxiexzfUjhhgtg.f10395Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10395Ujhhgtgfeyxiexzf = onLongClickListener;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (c3335feyxiexzfUjhhgtg.f10393Ujhhgtgfeyxiexzf != colorStateList) {
            c3335feyxiexzfUjhhgtg.f10393Ujhhgtgfeyxiexzf = colorStateList;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf, colorStateList, c3335feyxiexzfUjhhgtg.f10394Ujhhgtgfeyxiexzf);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (c3335feyxiexzfUjhhgtg.f10394Ujhhgtgfeyxiexzf != mode) {
            c3335feyxiexzfUjhhgtg.f10394Ujhhgtgfeyxiexzf = mode;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10393Ujhhgtgfeyxiexzf, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2736Ujhhgtgfeyxiexzf = i;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            c0654Ujhhgtgfeyxiexzf.f2723Ujhhgtgfeyxiexzf.m846Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2737Ujhhgtgfeyxiexzf = colorStateList;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf == null || colorStateList == null) {
            return;
        }
        c2384Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f937Ujhhgtgfeyxiexzf != z) {
            this.f937Ujhhgtgfeyxiexzf = z;
            m855Ujhhgtgfeyxiexzf(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        if (zIsEmpty) {
            if (c0654Ujhhgtgfeyxiexzf.f2739Ujhhgtgfeyxiexzf) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0654Ujhhgtgfeyxiexzf.f2739Ujhhgtgfeyxiexzf) {
            setHelperTextEnabled(true);
        }
        c0654Ujhhgtgfeyxiexzf.m1916Ujhhgtgfeyxiexzf();
        c0654Ujhhgtgfeyxiexzf.f2738Ujhhgtgfeyxiexzf = charSequence;
        c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg.setText(charSequence);
        int i = c0654Ujhhgtgfeyxiexzf.f2729Ujhhgtgfeyxiexzf;
        if (i != 2) {
            c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf = 2;
        }
        c0654Ujhhgtgfeyxiexzf.m1922Ujhhgtgfeyxiexzf(i, c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf, c0654Ujhhgtgfeyxiexzf.m1921Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2742feyxiexzfUjhhgtg = colorStateList;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
        if (c2384Ujhhgtgfeyxiexzf == null || colorStateList == null) {
            return;
        }
        c2384Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout = c0654Ujhhgtgfeyxiexzf.f2723Ujhhgtgfeyxiexzf;
        if (c0654Ujhhgtgfeyxiexzf.f2739Ujhhgtgfeyxiexzf == z) {
            return;
        }
        c0654Ujhhgtgfeyxiexzf.m1916Ujhhgtgfeyxiexzf();
        if (z) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = new C2384Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2722Ujhhgtgfeyxiexzf, null);
            c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg = c2384Ujhhgtgfeyxiexzf;
            c2384Ujhhgtgfeyxiexzf.setId(me.hd.wauxv.R.id.textinput_helper_text);
            c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg.setTextAlignment(5);
            Typeface typeface = c0654Ujhhgtgfeyxiexzf.f2743feyxiexzfUjhhgtg;
            if (typeface != null) {
                c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg.setTypeface(typeface);
            }
            c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg.setVisibility(4);
            c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg.setAccessibilityLiveRegion(1);
            int i = c0654Ujhhgtgfeyxiexzf.f2741feyxiexzfUjhhgtg;
            c0654Ujhhgtgfeyxiexzf.f2741feyxiexzfUjhhgtg = i;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
            if (c2384Ujhhgtgfeyxiexzf2 != null) {
                c2384Ujhhgtgfeyxiexzf2.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0654Ujhhgtgfeyxiexzf.f2742feyxiexzfUjhhgtg;
            c0654Ujhhgtgfeyxiexzf.f2742feyxiexzfUjhhgtg = colorStateList;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf3 = c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
            if (c2384Ujhhgtgfeyxiexzf3 != null && colorStateList != null) {
                c2384Ujhhgtgfeyxiexzf3.setTextColor(colorStateList);
            }
            c0654Ujhhgtgfeyxiexzf.m1914Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg, 1);
            c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg.setAccessibilityDelegate(new C0653Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf));
        } else {
            c0654Ujhhgtgfeyxiexzf.m1916Ujhhgtgfeyxiexzf();
            int i2 = c0654Ujhhgtgfeyxiexzf.f2729Ujhhgtgfeyxiexzf;
            if (i2 == 2) {
                c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf = 0;
            }
            c0654Ujhhgtgfeyxiexzf.m1922Ujhhgtgfeyxiexzf(i2, c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf, c0654Ujhhgtgfeyxiexzf.m1921Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg, ""));
            c0654Ujhhgtgfeyxiexzf.m1920Ujhhgtgfeyxiexzf(c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg, 1);
            c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg = null;
            textInputLayout.m852Ujhhgtgfeyxiexzf();
            textInputLayout.m858Ujhhgtgfeyxiexzf();
        }
        c0654Ujhhgtgfeyxiexzf.f2739Ujhhgtgfeyxiexzf = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2741feyxiexzfUjhhgtg = i;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            c2384Ujhhgtgfeyxiexzf.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f894feyxiexzfUjhhgtg) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f938Ujhhgtgfeyxiexzf = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f894feyxiexzfUjhhgtg) {
            this.f894feyxiexzfUjhhgtg = z;
            if (z) {
                CharSequence hint = this.f869Ujhhgtgfeyxiexzf.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f895feyxiexzfUjhhgtg)) {
                        setHint(hint);
                    }
                    this.f869Ujhhgtgfeyxiexzf.setHint((CharSequence) null);
                }
                this.f896feyxiexzfUjhhgtg = true;
            } else {
                this.f896feyxiexzfUjhhgtg = false;
                if (!TextUtils.isEmpty(this.f895feyxiexzfUjhhgtg) && TextUtils.isEmpty(this.f869Ujhhgtgfeyxiexzf.getHint())) {
                    this.f869Ujhhgtgfeyxiexzf.setHint(this.f895feyxiexzfUjhhgtg);
                }
                setHintInternal(null);
            }
            if (this.f869Ujhhgtgfeyxiexzf != null) {
                m854Ujhhgtgfeyxiexzf();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout = c2850Ujhhgtgfeyxiexzf.f9050Ujhhgtgfeyxiexzf;
        C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = new C1969Ujhhgtgfeyxiexzf(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c1969Ujhhgtgfeyxiexzf.f6462Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf = colorStateList;
        }
        float f = c1969Ujhhgtgfeyxiexzf.f6463Ujhhgtgfeyxiexzf;
        if (f != 0.0f) {
            c2850Ujhhgtgfeyxiexzf.f9058Ujhhgtgfeyxiexzf = f;
        }
        ColorStateList colorStateList2 = c1969Ujhhgtgfeyxiexzf.f6453Ujhhgtgfeyxiexzf;
        if (colorStateList2 != null) {
            c2850Ujhhgtgfeyxiexzf.f9096feyxiexzfUjhhgtg = colorStateList2;
        }
        c2850Ujhhgtgfeyxiexzf.f9094feyxiexzfUjhhgtg = c1969Ujhhgtgfeyxiexzf.f6457Ujhhgtgfeyxiexzf;
        c2850Ujhhgtgfeyxiexzf.f9095feyxiexzfUjhhgtg = c1969Ujhhgtgfeyxiexzf.f6458Ujhhgtgfeyxiexzf;
        c2850Ujhhgtgfeyxiexzf.f9093feyxiexzfUjhhgtg = c1969Ujhhgtgfeyxiexzf.f6459Ujhhgtgfeyxiexzf;
        c2850Ujhhgtgfeyxiexzf.f9097feyxiexzfUjhhgtg = c1969Ujhhgtgfeyxiexzf.f6461Ujhhgtgfeyxiexzf;
        C2643feyxiexzfUjhhgtg c2643feyxiexzfUjhhgtg = c2850Ujhhgtgfeyxiexzf.f9074feyxiexzfUjhhgtg;
        if (c2643feyxiexzfUjhhgtg != null) {
            c2643feyxiexzfUjhhgtg.f8490Ujhhgtgfeyxiexzf = true;
        }
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(8, c2850Ujhhgtgfeyxiexzf);
        c1969Ujhhgtgfeyxiexzf.m3301Ujhhgtgfeyxiexzf();
        c2850Ujhhgtgfeyxiexzf.f9074feyxiexzfUjhhgtg = new C2643feyxiexzfUjhhgtg(c2965Ujhhgtgfeyxiexzf, c1969Ujhhgtgfeyxiexzf.f6466Ujhhgtgfeyxiexzf);
        c1969Ujhhgtgfeyxiexzf.m3303Ujhhgtgfeyxiexzf(textInputLayout.getContext(), c2850Ujhhgtgfeyxiexzf.f9074feyxiexzfUjhhgtg);
        c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        this.f924Ujhhgtgfeyxiexzf = c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf;
        if (this.f869Ujhhgtgfeyxiexzf != null) {
            m855Ujhhgtgfeyxiexzf(false, false);
            m854Ujhhgtgfeyxiexzf();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f924Ujhhgtgfeyxiexzf != colorStateList) {
            if (this.f923feyxiexzfUjhhgtg == null) {
                C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
                if (c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf != colorStateList) {
                    c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf = colorStateList;
                    c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
                }
            }
            this.f924Ujhhgtgfeyxiexzf = colorStateList;
            if (this.f869Ujhhgtgfeyxiexzf != null) {
                m855Ujhhgtgfeyxiexzf(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC1975Ujhhgtgfeyxiexzf interfaceC1975Ujhhgtgfeyxiexzf) {
        this.f879Ujhhgtgfeyxiexzf = interfaceC1975Ujhhgtgfeyxiexzf;
    }

    public void setMaxEms(int i) {
        this.f872Ujhhgtgfeyxiexzf = i;
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f874Ujhhgtgfeyxiexzf = i;
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f871Ujhhgtgfeyxiexzf = i;
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f873Ujhhgtgfeyxiexzf = i;
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf.setContentDescription(i != 0 ? c3335feyxiexzfUjhhgtg.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf.setImageDrawable(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if (z && c3335feyxiexzfUjhhgtg.f10398Ujhhgtgfeyxiexzf != 1) {
            c3335feyxiexzfUjhhgtg.m4832Ujhhgtgfeyxiexzf(1);
        } else if (z) {
            c3335feyxiexzfUjhhgtg.getClass();
        } else {
            c3335feyxiexzfUjhhgtg.m4832Ujhhgtgfeyxiexzf(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf = colorStateList;
        AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf, colorStateList, c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf = mode;
        AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f885Ujhhgtgfeyxiexzf == null) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = new C2384Ujhhgtgfeyxiexzf(getContext(), null);
            this.f885Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf;
            c2384Ujhhgtgfeyxiexzf.setId(me.hd.wauxv.R.id.textinput_placeholder);
            this.f885Ujhhgtgfeyxiexzf.setImportantForAccessibility(2);
            C3510feyxiexzfUjhhgtg c3510feyxiexzfUjhhgtgM839Ujhhgtgfeyxiexzf = m839Ujhhgtgfeyxiexzf();
            this.f888feyxiexzfUjhhgtg = c3510feyxiexzfUjhhgtgM839Ujhhgtgfeyxiexzf;
            c3510feyxiexzfUjhhgtgM839Ujhhgtgfeyxiexzf.f5860Ujhhgtgfeyxiexzf = 67L;
            this.f889feyxiexzfUjhhgtg = m839Ujhhgtgfeyxiexzf();
            setPlaceholderTextAppearance(this.f887Ujhhgtgfeyxiexzf);
            setPlaceholderTextColor(this.f886Ujhhgtgfeyxiexzf);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f884Ujhhgtgfeyxiexzf) {
                setPlaceholderTextEnabled(true);
            }
            this.f883Ujhhgtgfeyxiexzf = charSequence;
        }
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        m856Ujhhgtgfeyxiexzf(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f887Ujhhgtgfeyxiexzf = i;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f885Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            c2384Ujhhgtgfeyxiexzf.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f886Ujhhgtgfeyxiexzf != colorStateList) {
            this.f886Ujhhgtgfeyxiexzf = colorStateList;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f885Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf == null || colorStateList == null) {
                return;
            }
            c2384Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        c1122feyxiexzfUjhhgtg.getClass();
        c1122feyxiexzfUjhhgtg.f4226Ujhhgtgfeyxiexzf = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c1122feyxiexzfUjhhgtg.f4225Ujhhgtgfeyxiexzf.setText(charSequence);
        c1122feyxiexzfUjhhgtg.m2595Ujhhgtgfeyxiexzf();
    }

    public void setPrefixTextAppearance(int i) {
        this.f867Ujhhgtgfeyxiexzf.f4225Ujhhgtgfeyxiexzf.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f867Ujhhgtgfeyxiexzf.f4225Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f897feyxiexzfUjhhgtg;
        if (c0226Ujhhgtgfeyxiexzf == null || c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf == c1017feyxiexzfUjhhgtg) {
            return;
        }
        this.f903feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg;
        m837Ujhhgtgfeyxiexzf();
    }

    public void setStartIconCheckable(boolean z) {
        this.f867Ujhhgtgfeyxiexzf.f4227Ujhhgtgfeyxiexzf.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        if (i < 0) {
            c1122feyxiexzfUjhhgtg.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c1122feyxiexzfUjhhgtg.f4230Ujhhgtgfeyxiexzf) {
            c1122feyxiexzfUjhhgtg.f4230Ujhhgtgfeyxiexzf = i;
            CheckableImageButton checkableImageButton = c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButton = c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf;
        View.OnLongClickListener onLongClickListener = c1122feyxiexzfUjhhgtg.f4232Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        c1122feyxiexzfUjhhgtg.f4232Ujhhgtgfeyxiexzf = onLongClickListener;
        CheckableImageButton checkableImageButton = c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        c1122feyxiexzfUjhhgtg.f4231Ujhhgtgfeyxiexzf = scaleType;
        c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        if (c1122feyxiexzfUjhhgtg.f4228Ujhhgtgfeyxiexzf != colorStateList) {
            c1122feyxiexzfUjhhgtg.f4228Ujhhgtgfeyxiexzf = colorStateList;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c1122feyxiexzfUjhhgtg.f4224Ujhhgtgfeyxiexzf, c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf, colorStateList, c1122feyxiexzfUjhhgtg.f4229Ujhhgtgfeyxiexzf);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        if (c1122feyxiexzfUjhhgtg.f4229Ujhhgtgfeyxiexzf != mode) {
            c1122feyxiexzfUjhhgtg.f4229Ujhhgtgfeyxiexzf = mode;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(c1122feyxiexzfUjhhgtg.f4224Ujhhgtgfeyxiexzf, c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf, c1122feyxiexzfUjhhgtg.f4228Ujhhgtgfeyxiexzf, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f867Ujhhgtgfeyxiexzf.m2593Ujhhgtgfeyxiexzf(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.getClass();
        c3335feyxiexzfUjhhgtg.f10405Ujhhgtgfeyxiexzf = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c3335feyxiexzfUjhhgtg.f10406Ujhhgtgfeyxiexzf.setText(charSequence);
        c3335feyxiexzfUjhhgtg.m4839Ujhhgtgfeyxiexzf();
    }

    public void setSuffixTextAppearance(int i) {
        this.f868Ujhhgtgfeyxiexzf.f10406Ujhhgtgfeyxiexzf.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f868Ujhhgtgfeyxiexzf.f10406Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C1979Ujhhgtgfeyxiexzf c1979Ujhhgtgfeyxiexzf) {
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText != null) {
            AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(editText, c1979Ujhhgtgfeyxiexzf);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f916Ujhhgtgfeyxiexzf) {
            this.f916Ujhhgtgfeyxiexzf = typeface;
            this.f936Ujhhgtgfeyxiexzf.m4189Ujhhgtgfeyxiexzf(typeface);
            C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
            if (typeface != c0654Ujhhgtgfeyxiexzf.f2743feyxiexzfUjhhgtg) {
                c0654Ujhhgtgfeyxiexzf.f2743feyxiexzfUjhhgtg = typeface;
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
                if (c2384Ujhhgtgfeyxiexzf != null) {
                    c2384Ujhhgtgfeyxiexzf.setTypeface(typeface);
                }
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
                if (c2384Ujhhgtgfeyxiexzf2 != null) {
                    c2384Ujhhgtgfeyxiexzf2.setTypeface(typeface);
                }
            }
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf3 = this.f880Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf3 != null) {
                c2384Ujhhgtgfeyxiexzf3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m836Ujhhgtgfeyxiexzf(float f) {
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        if (c2850Ujhhgtgfeyxiexzf.f9051Ujhhgtgfeyxiexzf == f) {
            return;
        }
        if (this.f939Ujhhgtgfeyxiexzf == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f939Ujhhgtgfeyxiexzf = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf));
            this.f939Ujhhgtgfeyxiexzf.setDuration(AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionDurationMedium4, Opcodes.GOTO));
            this.f939Ujhhgtgfeyxiexzf.addUpdateListener(new C2478feyxiexzfUjhhgtg(5, this));
        }
        this.f939Ujhhgtgfeyxiexzf.setFloatValues(c2850Ujhhgtgfeyxiexzf.f9051Ujhhgtgfeyxiexzf, f);
        this.f939Ujhhgtgfeyxiexzf.start();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m837Ujhhgtgfeyxiexzf() {
        int i;
        int i2;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f897feyxiexzfUjhhgtg;
        if (c0226Ujhhgtgfeyxiexzf == null) {
            return;
        }
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf;
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg2 = this.f903feyxiexzfUjhhgtg;
        if (c1017feyxiexzfUjhhgtg != c1017feyxiexzfUjhhgtg2) {
            c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg2);
        }
        if (this.f906feyxiexzfUjhhgtg == 2 && (i = this.f908feyxiexzfUjhhgtg) > -1 && (i2 = this.f911feyxiexzfUjhhgtg) != 0) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = this.f897feyxiexzfUjhhgtg;
            c0226Ujhhgtgfeyxiexzf2.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = i;
            c0226Ujhhgtgfeyxiexzf2.invalidateSelf();
            c0226Ujhhgtgfeyxiexzf2.m1373Ujhhgtgfeyxiexzf(ColorStateList.valueOf(i2));
        }
        int iM4260Ujhhgtgfeyxiexzf = this.f912Ujhhgtgfeyxiexzf;
        if (this.f906feyxiexzfUjhhgtg == 1) {
            iM4260Ujhhgtgfeyxiexzf = AbstractC2857Ujhhgtgfeyxiexzf.m4260Ujhhgtgfeyxiexzf(this.f912Ujhhgtgfeyxiexzf, AbstractC2855feyxiexzfUjhhgtg.m4210feyxiexzfUjhhgtg(getContext(), me.hd.wauxv.R.attr.colorSurface, 0));
        }
        this.f912Ujhhgtgfeyxiexzf = iM4260Ujhhgtgfeyxiexzf;
        this.f897feyxiexzfUjhhgtg.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(iM4260Ujhhgtgfeyxiexzf));
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf3 = this.f901feyxiexzfUjhhgtg;
        if (c0226Ujhhgtgfeyxiexzf3 != null && this.f902feyxiexzfUjhhgtg != null) {
            if (this.f908feyxiexzfUjhhgtg > -1 && this.f911feyxiexzfUjhhgtg != 0) {
                c0226Ujhhgtgfeyxiexzf3.m1369Ujhhgtgfeyxiexzf(this.f869Ujhhgtgfeyxiexzf.isFocused() ? ColorStateList.valueOf(this.f925Ujhhgtgfeyxiexzf) : ColorStateList.valueOf(this.f911feyxiexzfUjhhgtg));
                this.f902feyxiexzfUjhhgtg.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(this.f911feyxiexzfUjhhgtg));
            }
            invalidate();
        }
        m853Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m838Ujhhgtgfeyxiexzf() {
        float fM4181Ujhhgtgfeyxiexzf;
        if (!this.f894feyxiexzfUjhhgtg) {
            return 0;
        }
        int i = this.f906feyxiexzfUjhhgtg;
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        if (i == 0) {
            fM4181Ujhhgtgfeyxiexzf = c2850Ujhhgtgfeyxiexzf.m4181Ujhhgtgfeyxiexzf();
        } else {
            if (i != 2) {
                return 0;
            }
            fM4181Ujhhgtgfeyxiexzf = c2850Ujhhgtgfeyxiexzf.m4181Ujhhgtgfeyxiexzf() / 2.0f;
        }
        return (int) fM4181Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3510feyxiexzfUjhhgtg m839Ujhhgtgfeyxiexzf() {
        C3510feyxiexzfUjhhgtg c3510feyxiexzfUjhhgtg = new C3510feyxiexzfUjhhgtg();
        c3510feyxiexzfUjhhgtg.f5861Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionDurationShort2, 87);
        c3510feyxiexzfUjhhgtg.f5862Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionEasingLinearInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9412Ujhhgtgfeyxiexzf);
        return c3510feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean m840Ujhhgtgfeyxiexzf() {
        return this.f894feyxiexzfUjhhgtg && !TextUtils.isEmpty(this.f895feyxiexzfUjhhgtg) && (this.f897feyxiexzfUjhhgtg instanceof C3072Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf m841Ujhhgtgfeyxiexzf(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0945feyxiexzfUjhhgtg c0945feyxiexzfUjhhgtg = new C0945feyxiexzfUjhhgtg();
        C0945feyxiexzfUjhhgtg c0945feyxiexzfUjhhgtg2 = new C0945feyxiexzfUjhhgtg();
        C0945feyxiexzfUjhhgtg c0945feyxiexzfUjhhgtg3 = new C0945feyxiexzfUjhhgtg();
        C0945feyxiexzfUjhhgtg c0945feyxiexzfUjhhgtg4 = new C0945feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = new C3382feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg2 = new C3382feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg3 = new C3382feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg4 = new C3382feyxiexzfUjhhgtg();
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(f);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf2 = new C2923Ujhhgtgfeyxiexzf(f);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf3 = new C2923Ujhhgtgfeyxiexzf(dimensionPixelOffset);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf4 = new C2923Ujhhgtgfeyxiexzf(dimensionPixelOffset);
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = new C1017feyxiexzfUjhhgtg();
        c1017feyxiexzfUjhhgtg.f3973Ujhhgtgfeyxiexzf = c0945feyxiexzfUjhhgtg;
        c1017feyxiexzfUjhhgtg.f3974Ujhhgtgfeyxiexzf = c0945feyxiexzfUjhhgtg2;
        c1017feyxiexzfUjhhgtg.f3975Ujhhgtgfeyxiexzf = c0945feyxiexzfUjhhgtg3;
        c1017feyxiexzfUjhhgtg.f3976Ujhhgtgfeyxiexzf = c0945feyxiexzfUjhhgtg4;
        c1017feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf;
        c1017feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf2;
        c1017feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf4;
        c1017feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf3;
        c1017feyxiexzfUjhhgtg.f3981Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        c1017feyxiexzfUjhhgtg.f3982Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg2;
        c1017feyxiexzfUjhhgtg.f3983Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg3;
        c1017feyxiexzfUjhhgtg.f3984Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg4;
        Context context = getContext();
        Paint paint = C0226Ujhhgtgfeyxiexzf.f1526feyxiexzfUjhhgtg;
        TypedValue typedValueM4526Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4526Ujhhgtgfeyxiexzf(context, me.hd.wauxv.R.attr.colorSurface, C0226Ujhhgtgfeyxiexzf.class.getSimpleName());
        int i = typedValueM4526Ujhhgtgfeyxiexzf.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i != 0 ? context.getColor(i) : typedValueM4526Ujhhgtgfeyxiexzf.data);
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf();
        c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(context);
        c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateListValueOf);
        c0226Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(dimensionPixelOffset2);
        c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1512Ujhhgtgfeyxiexzf == null) {
            c0223Ujhhgtgfeyxiexzf.f1512Ujhhgtgfeyxiexzf = new Rect();
        }
        c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1512Ujhhgtgfeyxiexzf.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        c0226Ujhhgtgfeyxiexzf.invalidateSelf();
        return c0226Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int m842Ujhhgtgfeyxiexzf(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingLeft() : this.f868Ujhhgtgfeyxiexzf.m4828Ujhhgtgfeyxiexzf();
        } else {
            compoundPaddingLeft = this.f867Ujhhgtgfeyxiexzf.m2591Ujhhgtgfeyxiexzf();
        }
        return compoundPaddingLeft + i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m843Ujhhgtgfeyxiexzf(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f869Ujhhgtgfeyxiexzf.getCompoundPaddingRight() : this.f867Ujhhgtgfeyxiexzf.m2591Ujhhgtgfeyxiexzf();
        } else {
            compoundPaddingRight = this.f868Ujhhgtgfeyxiexzf.m4828Ujhhgtgfeyxiexzf();
        }
        return i - compoundPaddingRight;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m844Ujhhgtgfeyxiexzf() {
        int i = this.f906feyxiexzfUjhhgtg;
        if (i == 0) {
            this.f897feyxiexzfUjhhgtg = null;
            this.f901feyxiexzfUjhhgtg = null;
            this.f902feyxiexzfUjhhgtg = null;
        } else if (i == 1) {
            this.f897feyxiexzfUjhhgtg = new C0226Ujhhgtgfeyxiexzf(this.f903feyxiexzfUjhhgtg);
            this.f901feyxiexzfUjhhgtg = new C0226Ujhhgtgfeyxiexzf();
            this.f902feyxiexzfUjhhgtg = new C0226Ujhhgtgfeyxiexzf();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(new StringBuilder(), this.f906feyxiexzfUjhhgtg, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f894feyxiexzfUjhhgtg || (this.f897feyxiexzfUjhhgtg instanceof C3072Ujhhgtgfeyxiexzf)) {
                this.f897feyxiexzfUjhhgtg = new C0226Ujhhgtgfeyxiexzf(this.f903feyxiexzfUjhhgtg);
            } else {
                C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f903feyxiexzfUjhhgtg;
                int i2 = C3072Ujhhgtgfeyxiexzf.f9513feyxiexzfUjhhgtg;
                if (c1017feyxiexzfUjhhgtg == null) {
                    c1017feyxiexzfUjhhgtg = new C1017feyxiexzfUjhhgtg();
                }
                C3071Ujhhgtgfeyxiexzf c3071Ujhhgtgfeyxiexzf = new C3071Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg, new RectF());
                C3072Ujhhgtgfeyxiexzf c3072Ujhhgtgfeyxiexzf = new C3072Ujhhgtgfeyxiexzf(c3071Ujhhgtgfeyxiexzf);
                c3072Ujhhgtgfeyxiexzf.f9514feyxiexzfUjhhgtg = c3071Ujhhgtgfeyxiexzf;
                this.f897feyxiexzfUjhhgtg = c3072Ujhhgtgfeyxiexzf;
            }
            this.f901feyxiexzfUjhhgtg = null;
            this.f902feyxiexzfUjhhgtg = null;
        }
        m853Ujhhgtgfeyxiexzf();
        m858Ujhhgtgfeyxiexzf();
        if (this.f906feyxiexzfUjhhgtg == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f907feyxiexzfUjhhgtg = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC3085Ujhhgtgfeyxiexzf.m4567Ujhhgtgfeyxiexzf(getContext())) {
                this.f907feyxiexzfUjhhgtg = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f869Ujhhgtgfeyxiexzf != null && this.f906feyxiexzfUjhhgtg == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f869Ujhhgtgfeyxiexzf;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f869Ujhhgtgfeyxiexzf.getPaddingEnd(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC3085Ujhhgtgfeyxiexzf.m4567Ujhhgtgfeyxiexzf(getContext())) {
                EditText editText2 = this.f869Ujhhgtgfeyxiexzf;
                Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f869Ujhhgtgfeyxiexzf.getPaddingEnd(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f906feyxiexzfUjhhgtg != 0) {
            m854Ujhhgtgfeyxiexzf();
        }
        EditText editText3 = this.f869Ujhhgtgfeyxiexzf;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f906feyxiexzfUjhhgtg;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m845Ujhhgtgfeyxiexzf() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (m840Ujhhgtgfeyxiexzf()) {
            int width = this.f869Ujhhgtgfeyxiexzf.getWidth();
            int gravity = this.f869Ujhhgtgfeyxiexzf.getGravity();
            C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
            boolean zM4179Ujhhgtgfeyxiexzf = c2850Ujhhgtgfeyxiexzf.m4179Ujhhgtgfeyxiexzf(c2850Ujhhgtgfeyxiexzf.f9076feyxiexzfUjhhgtg);
            c2850Ujhhgtgfeyxiexzf.f9078feyxiexzfUjhhgtg = zM4179Ujhhgtgfeyxiexzf;
            Rect rect = c2850Ujhhgtgfeyxiexzf.f9053Ujhhgtgfeyxiexzf;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM4179Ujhhgtgfeyxiexzf) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf;
                    }
                } else if (zM4179Ujhhgtgfeyxiexzf) {
                    f = rect.right;
                    f2 = c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f915Ujhhgtgfeyxiexzf;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c2850Ujhhgtgfeyxiexzf.f9078feyxiexzfUjhhgtg) {
                        f5 = c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c2850Ujhhgtgfeyxiexzf.f9078feyxiexzfUjhhgtg) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c2850Ujhhgtgfeyxiexzf.m4181Ujhhgtgfeyxiexzf() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f905feyxiexzfUjhhgtg;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f908feyxiexzfUjhhgtg);
                C3072Ujhhgtgfeyxiexzf c3072Ujhhgtgfeyxiexzf = (C3072Ujhhgtgfeyxiexzf) this.f897feyxiexzfUjhhgtg;
                c3072Ujhhgtgfeyxiexzf.getClass();
                c3072Ujhhgtgfeyxiexzf.m4546Ujhhgtgfeyxiexzf(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f915Ujhhgtgfeyxiexzf;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c2850Ujhhgtgfeyxiexzf.f9101Ujhhgtgfeyxiexzf / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c2850Ujhhgtgfeyxiexzf.m4181Ujhhgtgfeyxiexzf() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m846Ujhhgtgfeyxiexzf(C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf, int i) {
        try {
            c2384Ujhhgtgfeyxiexzf.setTextAppearance(i);
            if (c2384Ujhhgtgfeyxiexzf.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c2384Ujhhgtgfeyxiexzf.setTextAppearance(me.hd.wauxv.R.style.TextAppearance_AppCompat_Caption);
        c2384Ujhhgtgfeyxiexzf.setTextColor(getContext().getColor(me.hd.wauxv.R.color.design_error));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final boolean m847Ujhhgtgfeyxiexzf() {
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f875Ujhhgtgfeyxiexzf;
        return (c0654Ujhhgtgfeyxiexzf.f2730Ujhhgtgfeyxiexzf != 1 || c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf == null || TextUtils.isEmpty(c0654Ujhhgtgfeyxiexzf.f2731Ujhhgtgfeyxiexzf)) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m848Ujhhgtgfeyxiexzf(Editable editable) {
        ((C1439feyxiexzfUjhhgtg) this.f879Ujhhgtgfeyxiexzf).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f878Ujhhgtgfeyxiexzf;
        int i = this.f877Ujhhgtgfeyxiexzf;
        if (i == -1) {
            this.f880Ujhhgtgfeyxiexzf.setText(String.valueOf(length));
            this.f880Ujhhgtgfeyxiexzf.setContentDescription(null);
            this.f878Ujhhgtgfeyxiexzf = false;
        } else {
            this.f878Ujhhgtgfeyxiexzf = length > i;
            Context context = getContext();
            this.f880Ujhhgtgfeyxiexzf.setContentDescription(context.getString(this.f878Ujhhgtgfeyxiexzf ? me.hd.wauxv.R.string.character_counter_overflowed_content_description : me.hd.wauxv.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f877Ujhhgtgfeyxiexzf)));
            if (z != this.f878Ujhhgtgfeyxiexzf) {
                m849Ujhhgtgfeyxiexzf();
            }
            String str = C2531feyxiexzfUjhhgtg.f8244Ujhhgtgfeyxiexzf;
            C2531feyxiexzfUjhhgtg c2531feyxiexzfUjhhgtg = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C2531feyxiexzfUjhhgtg.f8247Ujhhgtgfeyxiexzf : C2531feyxiexzfUjhhgtg.f8246Ujhhgtgfeyxiexzf;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f880Ujhhgtgfeyxiexzf;
            String string = getContext().getString(me.hd.wauxv.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f877Ujhhgtgfeyxiexzf));
            c2531feyxiexzfUjhhgtg.getClass();
            C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtg = AbstractC1968Ujhhgtgfeyxiexzf.f6449Ujhhgtgfeyxiexzf;
            c2384Ujhhgtgfeyxiexzf.setText(string != null ? c2531feyxiexzfUjhhgtg.m3798Ujhhgtgfeyxiexzf(string).toString() : null);
        }
        if (this.f869Ujhhgtgfeyxiexzf == null || z == this.f878Ujhhgtgfeyxiexzf) {
            return;
        }
        m855Ujhhgtgfeyxiexzf(false, false);
        m858Ujhhgtgfeyxiexzf();
        m852Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m849Ujhhgtgfeyxiexzf() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f880Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            m846Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf, this.f878Ujhhgtgfeyxiexzf ? this.f881Ujhhgtgfeyxiexzf : this.f882Ujhhgtgfeyxiexzf);
            if (!this.f878Ujhhgtgfeyxiexzf && (colorStateList2 = this.f890feyxiexzfUjhhgtg) != null) {
                this.f880Ujhhgtgfeyxiexzf.setTextColor(colorStateList2);
            }
            if (!this.f878Ujhhgtgfeyxiexzf || (colorStateList = this.f891feyxiexzfUjhhgtg) == null) {
                return;
            }
            this.f880Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m850Ujhhgtgfeyxiexzf() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f892feyxiexzfUjhhgtg;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM4524Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4524Ujhhgtgfeyxiexzf(context, me.hd.wauxv.R.attr.colorControlActivated);
            if (typedValueM4524Ujhhgtgfeyxiexzf != null) {
                int i = typedValueM4524Ujhhgtgfeyxiexzf.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, i);
                } else {
                    int i2 = typedValueM4524Ujhhgtgfeyxiexzf.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f869Ujhhgtgfeyxiexzf.getTextCursorDrawable().mutate();
        if ((m847Ujhhgtgfeyxiexzf() || (this.f880Ujhhgtgfeyxiexzf != null && this.f878Ujhhgtgfeyxiexzf)) && (colorStateList = this.f893feyxiexzfUjhhgtg) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m851Ujhhgtgfeyxiexzf() {
        boolean z;
        if (this.f869Ujhhgtgfeyxiexzf == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
            if (c1122feyxiexzfUjhhgtg.getMeasuredWidth() > 0) {
                int measuredWidth = c1122feyxiexzfUjhhgtg.getMeasuredWidth() - this.f869Ujhhgtgfeyxiexzf.getPaddingLeft();
                if (this.f917Ujhhgtgfeyxiexzf == null || this.f918feyxiexzfUjhhgtg != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f917Ujhhgtgfeyxiexzf = colorDrawable;
                    this.f918feyxiexzfUjhhgtg = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f869Ujhhgtgfeyxiexzf.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f917Ujhhgtgfeyxiexzf;
                if (drawable != colorDrawable2) {
                    this.f869Ujhhgtgfeyxiexzf.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f917Ujhhgtgfeyxiexzf != null) {
                Drawable[] compoundDrawablesRelative2 = this.f869Ujhhgtgfeyxiexzf.getCompoundDrawablesRelative();
                this.f869Ujhhgtgfeyxiexzf.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f917Ujhhgtgfeyxiexzf = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f917Ujhhgtgfeyxiexzf != null) {
            Drawable[] compoundDrawablesRelative3 = this.f869Ujhhgtgfeyxiexzf.getCompoundDrawablesRelative();
            this.f869Ujhhgtgfeyxiexzf.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f917Ujhhgtgfeyxiexzf = null;
            z = true;
        } else {
            z = false;
        }
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        if ((c3335feyxiexzfUjhhgtg.m4830Ujhhgtgfeyxiexzf() || ((c3335feyxiexzfUjhhgtg.f10398Ujhhgtgfeyxiexzf != 0 && c3335feyxiexzfUjhhgtg.m4829Ujhhgtgfeyxiexzf()) || c3335feyxiexzfUjhhgtg.f10405Ujhhgtgfeyxiexzf != null)) && c3335feyxiexzfUjhhgtg.getMeasuredWidth() > 0) {
            int measuredWidth2 = c3335feyxiexzfUjhhgtg.f10406Ujhhgtgfeyxiexzf.getMeasuredWidth() - this.f869Ujhhgtgfeyxiexzf.getPaddingRight();
            if (c3335feyxiexzfUjhhgtg.m4830Ujhhgtgfeyxiexzf()) {
                checkableImageButton = c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf;
            } else if (c3335feyxiexzfUjhhgtg.f10398Ujhhgtgfeyxiexzf != 0 && c3335feyxiexzfUjhhgtg.m4829Ujhhgtgfeyxiexzf()) {
                checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f869Ujhhgtgfeyxiexzf.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f920feyxiexzfUjhhgtg;
            if (colorDrawable3 != null && this.f921feyxiexzfUjhhgtg != measuredWidth2) {
                this.f921feyxiexzfUjhhgtg = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f869Ujhhgtgfeyxiexzf.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f920feyxiexzfUjhhgtg, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f920feyxiexzfUjhhgtg = colorDrawable4;
                this.f921feyxiexzfUjhhgtg = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f920feyxiexzfUjhhgtg;
            if (drawable2 != colorDrawable5) {
                this.f922feyxiexzfUjhhgtg = drawable2;
                this.f869Ujhhgtgfeyxiexzf.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f920feyxiexzfUjhhgtg != null) {
            Drawable[] compoundDrawablesRelative5 = this.f869Ujhhgtgfeyxiexzf.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f920feyxiexzfUjhhgtg) {
                this.f869Ujhhgtgfeyxiexzf.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f922feyxiexzfUjhhgtg, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f920feyxiexzfUjhhgtg = null;
            return z2;
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m852Ujhhgtgfeyxiexzf() {
        Drawable background;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf;
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || this.f906feyxiexzfUjhhgtg != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC3252feyxiexzfUjhhgtg.f10197Ujhhgtgfeyxiexzf;
        Drawable drawableMutate = background.mutate();
        if (m847Ujhhgtgfeyxiexzf()) {
            drawableMutate.setColorFilter(C2364Ujhhgtgfeyxiexzf.m3586Ujhhgtgfeyxiexzf(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f878Ujhhgtgfeyxiexzf && (c2384Ujhhgtgfeyxiexzf = this.f880Ujhhgtgfeyxiexzf) != null) {
            drawableMutate.setColorFilter(C2364Ujhhgtgfeyxiexzf.m3586Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f869Ujhhgtgfeyxiexzf.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m853Ujhhgtgfeyxiexzf() {
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        if (editText == null || this.f897feyxiexzfUjhhgtg == null) {
            return;
        }
        if ((this.f900feyxiexzfUjhhgtg || editText.getBackground() == null) && this.f906feyxiexzfUjhhgtg != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f869Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            editText2.setBackground(editTextBoxBackground);
            this.f900feyxiexzfUjhhgtg = true;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m854Ujhhgtgfeyxiexzf() {
        if (this.f906feyxiexzfUjhhgtg != 1) {
            FrameLayout frameLayout = this.f866Ujhhgtgfeyxiexzf;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM838Ujhhgtgfeyxiexzf = m838Ujhhgtgfeyxiexzf();
            if (iM838Ujhhgtgfeyxiexzf != layoutParams.topMargin) {
                layoutParams.topMargin = iM838Ujhhgtgfeyxiexzf;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m855Ujhhgtgfeyxiexzf(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f869Ujhhgtgfeyxiexzf;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f869Ujhhgtgfeyxiexzf;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f923feyxiexzfUjhhgtg;
        C2850Ujhhgtgfeyxiexzf c2850Ujhhgtgfeyxiexzf = this.f936Ujhhgtgfeyxiexzf;
        if (colorStateList2 != null) {
            c2850Ujhhgtgfeyxiexzf.m4185Ujhhgtgfeyxiexzf(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f923feyxiexzfUjhhgtg;
            c2850Ujhhgtgfeyxiexzf.m4185Ujhhgtgfeyxiexzf(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f933feyxiexzfUjhhgtg) : this.f933feyxiexzfUjhhgtg));
        } else if (m847Ujhhgtgfeyxiexzf()) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = this.f875Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf;
            c2850Ujhhgtgfeyxiexzf.m4185Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf2 != null ? c2384Ujhhgtgfeyxiexzf2.getTextColors() : null);
        } else if (this.f878Ujhhgtgfeyxiexzf && (c2384Ujhhgtgfeyxiexzf = this.f880Ujhhgtgfeyxiexzf) != null) {
            c2850Ujhhgtgfeyxiexzf.m4185Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf.getTextColors());
        } else if (z4 && (colorStateList = this.f924Ujhhgtgfeyxiexzf) != null && c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf != colorStateList) {
            c2850Ujhhgtgfeyxiexzf.f9060Ujhhgtgfeyxiexzf = colorStateList;
            c2850Ujhhgtgfeyxiexzf.m4184Ujhhgtgfeyxiexzf(false);
        }
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        if (z3 || !this.f937Ujhhgtgfeyxiexzf || (isEnabled() && z4)) {
            if (z2 || this.f935feyxiexzfUjhhgtg) {
                ValueAnimator valueAnimator = this.f939Ujhhgtgfeyxiexzf;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f939Ujhhgtgfeyxiexzf.cancel();
                }
                if (z && this.f938Ujhhgtgfeyxiexzf) {
                    m836Ujhhgtgfeyxiexzf(1.0f);
                } else {
                    c2850Ujhhgtgfeyxiexzf.m4187Ujhhgtgfeyxiexzf(1.0f);
                }
                this.f935feyxiexzfUjhhgtg = false;
                if (m840Ujhhgtgfeyxiexzf()) {
                    m845Ujhhgtgfeyxiexzf();
                }
                EditText editText3 = this.f869Ujhhgtgfeyxiexzf;
                m856Ujhhgtgfeyxiexzf(editText3 != null ? editText3.getText() : null);
                c1122feyxiexzfUjhhgtg.f4233Ujhhgtgfeyxiexzf = false;
                c1122feyxiexzfUjhhgtg.m2595Ujhhgtgfeyxiexzf();
                c3335feyxiexzfUjhhgtg.f10407Ujhhgtgfeyxiexzf = false;
                c3335feyxiexzfUjhhgtg.m4839Ujhhgtgfeyxiexzf();
                return;
            }
            return;
        }
        if (z2 || !this.f935feyxiexzfUjhhgtg) {
            ValueAnimator valueAnimator2 = this.f939Ujhhgtgfeyxiexzf;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f939Ujhhgtgfeyxiexzf.cancel();
            }
            if (z && this.f938Ujhhgtgfeyxiexzf) {
                m836Ujhhgtgfeyxiexzf(0.0f);
            } else {
                c2850Ujhhgtgfeyxiexzf.m4187Ujhhgtgfeyxiexzf(0.0f);
            }
            if (m840Ujhhgtgfeyxiexzf() && !((C3072Ujhhgtgfeyxiexzf) this.f897feyxiexzfUjhhgtg).f9514feyxiexzfUjhhgtg.f9512Ujhhgtgfeyxiexzf.isEmpty() && m840Ujhhgtgfeyxiexzf()) {
                ((C3072Ujhhgtgfeyxiexzf) this.f897feyxiexzfUjhhgtg).m4546Ujhhgtgfeyxiexzf(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f935feyxiexzfUjhhgtg = true;
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf3 = this.f885Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf3 != null && this.f884Ujhhgtgfeyxiexzf) {
                c2384Ujhhgtgfeyxiexzf3.setText((CharSequence) null);
                AbstractC1756feyxiexzfUjhhgtg.m3050Ujhhgtgfeyxiexzf(this.f866Ujhhgtgfeyxiexzf, this.f889feyxiexzfUjhhgtg);
                this.f885Ujhhgtgfeyxiexzf.setVisibility(4);
            }
            c1122feyxiexzfUjhhgtg.f4233Ujhhgtgfeyxiexzf = true;
            c1122feyxiexzfUjhhgtg.m2595Ujhhgtgfeyxiexzf();
            c3335feyxiexzfUjhhgtg.f10407Ujhhgtgfeyxiexzf = true;
            c3335feyxiexzfUjhhgtg.m4839Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m856Ujhhgtgfeyxiexzf(Editable editable) {
        ((C1439feyxiexzfUjhhgtg) this.f879Ujhhgtgfeyxiexzf).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f866Ujhhgtgfeyxiexzf;
        if (length != 0 || this.f935feyxiexzfUjhhgtg) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f885Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf == null || !this.f884Ujhhgtgfeyxiexzf) {
                return;
            }
            c2384Ujhhgtgfeyxiexzf.setText((CharSequence) null);
            AbstractC1756feyxiexzfUjhhgtg.m3050Ujhhgtgfeyxiexzf(frameLayout, this.f889feyxiexzfUjhhgtg);
            this.f885Ujhhgtgfeyxiexzf.setVisibility(4);
            return;
        }
        if (this.f885Ujhhgtgfeyxiexzf == null || !this.f884Ujhhgtgfeyxiexzf || TextUtils.isEmpty(this.f883Ujhhgtgfeyxiexzf)) {
            return;
        }
        this.f885Ujhhgtgfeyxiexzf.setText(this.f883Ujhhgtgfeyxiexzf);
        AbstractC1756feyxiexzfUjhhgtg.m3050Ujhhgtgfeyxiexzf(frameLayout, this.f888feyxiexzfUjhhgtg);
        this.f885Ujhhgtgfeyxiexzf.setVisibility(0);
        this.f885Ujhhgtgfeyxiexzf.bringToFront();
        announceForAccessibility(this.f883Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m857Ujhhgtgfeyxiexzf(boolean z, boolean z2) {
        int defaultColor = this.f928Ujhhgtgfeyxiexzf.getDefaultColor();
        int colorForState = this.f928Ujhhgtgfeyxiexzf.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f928Ujhhgtgfeyxiexzf.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f911feyxiexzfUjhhgtg = colorForState2;
        } else if (z2) {
            this.f911feyxiexzfUjhhgtg = colorForState;
        } else {
            this.f911feyxiexzfUjhhgtg = defaultColor;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m858Ujhhgtgfeyxiexzf() {
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf;
        EditText editText;
        EditText editText2;
        if (this.f897feyxiexzfUjhhgtg == null || this.f906feyxiexzfUjhhgtg == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f869Ujhhgtgfeyxiexzf) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f869Ujhhgtgfeyxiexzf) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f911feyxiexzfUjhhgtg = this.f933feyxiexzfUjhhgtg;
        } else if (m847Ujhhgtgfeyxiexzf()) {
            if (this.f928Ujhhgtgfeyxiexzf != null) {
                m857Ujhhgtgfeyxiexzf(z2, z);
            } else {
                this.f911feyxiexzfUjhhgtg = getErrorCurrentTextColors();
            }
        } else if (!this.f878Ujhhgtgfeyxiexzf || (c2384Ujhhgtgfeyxiexzf = this.f880Ujhhgtgfeyxiexzf) == null) {
            if (z2) {
                this.f911feyxiexzfUjhhgtg = this.f927feyxiexzfUjhhgtg;
            } else if (z) {
                this.f911feyxiexzfUjhhgtg = this.f926feyxiexzfUjhhgtg;
            } else {
                this.f911feyxiexzfUjhhgtg = this.f925Ujhhgtgfeyxiexzf;
            }
        } else if (this.f928Ujhhgtgfeyxiexzf != null) {
            m857Ujhhgtgfeyxiexzf(z2, z);
        } else {
            this.f911feyxiexzfUjhhgtg = c2384Ujhhgtgfeyxiexzf.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m850Ujhhgtgfeyxiexzf();
        }
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout = c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout2 = c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf;
        c3335feyxiexzfUjhhgtg.m4837Ujhhgtgfeyxiexzf();
        AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(textInputLayout2, c3335feyxiexzfUjhhgtg.f10392Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10393Ujhhgtgfeyxiexzf);
        AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(textInputLayout2, checkableImageButton, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf);
        if (c3335feyxiexzfUjhhgtg.m4827Ujhhgtgfeyxiexzf() instanceof C3245feyxiexzfUjhhgtg) {
            if (!textInputLayout.m847Ujhhgtgfeyxiexzf() || checkableImageButton.getDrawable() == null) {
                AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = this.f867Ujhhgtgfeyxiexzf;
        AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(c1122feyxiexzfUjhhgtg.f4224Ujhhgtgfeyxiexzf, c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf, c1122feyxiexzfUjhhgtg.f4228Ujhhgtgfeyxiexzf);
        if (this.f906feyxiexzfUjhhgtg == 2) {
            int i = this.f908feyxiexzfUjhhgtg;
            if (z2 && isEnabled()) {
                this.f908feyxiexzfUjhhgtg = this.f910feyxiexzfUjhhgtg;
            } else {
                this.f908feyxiexzfUjhhgtg = this.f909feyxiexzfUjhhgtg;
            }
            if (this.f908feyxiexzfUjhhgtg != i && m840Ujhhgtgfeyxiexzf() && !this.f935feyxiexzfUjhhgtg) {
                if (m840Ujhhgtgfeyxiexzf()) {
                    ((C3072Ujhhgtgfeyxiexzf) this.f897feyxiexzfUjhhgtg).m4546Ujhhgtgfeyxiexzf(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m845Ujhhgtgfeyxiexzf();
            }
        }
        if (this.f906feyxiexzfUjhhgtg == 1) {
            if (!isEnabled()) {
                this.f912Ujhhgtgfeyxiexzf = this.f930Ujhhgtgfeyxiexzf;
            } else if (z && !z2) {
                this.f912Ujhhgtgfeyxiexzf = this.f932feyxiexzfUjhhgtg;
            } else if (z2) {
                this.f912Ujhhgtgfeyxiexzf = this.f931Ujhhgtgfeyxiexzf;
            } else {
                this.f912Ujhhgtgfeyxiexzf = this.f929feyxiexzfUjhhgtg;
            }
        }
        m837Ujhhgtgfeyxiexzf();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f867Ujhhgtgfeyxiexzf.f4227Ujhhgtgfeyxiexzf;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f867Ujhhgtgfeyxiexzf.m2592Ujhhgtgfeyxiexzf(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f868Ujhhgtgfeyxiexzf.m4834Ujhhgtgfeyxiexzf(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f868Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout = c3335feyxiexzfUjhhgtg.f10390Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButton = c3335feyxiexzfUjhhgtg.f10396Ujhhgtgfeyxiexzf;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf, c3335feyxiexzfUjhhgtg.f10401Ujhhgtgfeyxiexzf);
            AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, c3335feyxiexzfUjhhgtg.f10400Ujhhgtgfeyxiexzf);
        }
    }
}
