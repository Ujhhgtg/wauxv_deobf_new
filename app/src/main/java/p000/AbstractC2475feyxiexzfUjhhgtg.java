package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.slider.Slider;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2475feyxiexzfUjhhgtg extends View {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Paint f8027Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Paint f8028Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Paint f8029Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Paint f8030Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Paint f8031Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Paint f8032Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Paint f8033Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2473feyxiexzfUjhhgtg f8034Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final AccessibilityManager f8035Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public RunnableC2474feyxiexzfUjhhgtg f8036Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int f8037Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final ArrayList f8038Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final ArrayList f8039Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f8040Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f8041Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ValueAnimator f8042Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public ValueAnimator f8043Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int f8044Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f8045Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f8046Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int f8047Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f8048Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f8049feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f8050feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8051feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f8052feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f8053feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f8054feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f8055feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public int f8056feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f8057feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8058feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f8059feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8060feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public int f8061feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public int f8062feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f8063feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8064feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final int f8065feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f8066feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public MotionEvent f8067feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public boolean f8068feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public float f8069feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f8070feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public ArrayList f8071feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8072feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f8073Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f8074Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float[] f8075Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f8076Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f8077Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8078Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f8079feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f8080feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean f8081feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ColorStateList f8082feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public ColorStateList f8083feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ColorStateList f8084feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorStateList f8085Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f8086Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final Path f8087feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final RectF f8088feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RectF f8089Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f8090feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Drawable f8091Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public List f8092Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public float f8093feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f8094feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ViewTreeObserverOnScrollChangedListenerC2477feyxiexzfUjhhgtg f8095Ujhhgtgfeyxiexzf;

    /* JADX WARN: Type inference failed for: r1v5, types: [上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴ要点脸ᛱUjhhgtgᛱᛳ] */
    public AbstractC2475feyxiexzfUjhhgtg(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.f8038Ujhhgtgfeyxiexzf = new ArrayList();
        this.f8039Ujhhgtgfeyxiexzf = new ArrayList();
        this.f8040Ujhhgtgfeyxiexzf = new ArrayList();
        this.f8041Ujhhgtgfeyxiexzf = false;
        this.f8061feyxiexzfUjhhgtg = -1;
        this.f8062feyxiexzfUjhhgtg = -1;
        this.f8068feyxiexzfUjhhgtg = false;
        this.f8071feyxiexzfUjhhgtg = new ArrayList();
        this.f8072feyxiexzfUjhhgtg = -1;
        this.f8073Ujhhgtgfeyxiexzf = -1;
        this.f8074Ujhhgtgfeyxiexzf = 0.0f;
        this.f8076Ujhhgtgfeyxiexzf = true;
        this.f8080feyxiexzfUjhhgtg = false;
        this.f8087feyxiexzfUjhhgtg = new Path();
        this.f8088feyxiexzfUjhhgtg = new RectF();
        this.f8089Ujhhgtgfeyxiexzf = new RectF();
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf();
        this.f8090feyxiexzfUjhhgtg = c0226Ujhhgtgfeyxiexzf;
        this.f8092Ujhhgtgfeyxiexzf = Collections.EMPTY_LIST;
        this.f8094feyxiexzfUjhhgtg = 0;
        final Slider slider = (Slider) this;
        this.f8095Ujhhgtgfeyxiexzf = new ViewTreeObserver.OnScrollChangedListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴ要点脸ᛱUjhhgtgᛱᛳ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                slider.m3754Ujhhgtgfeyxiexzf();
            }
        };
        Context context2 = getContext();
        this.f8027Ujhhgtgfeyxiexzf = new Paint();
        this.f8028Ujhhgtgfeyxiexzf = new Paint();
        Paint paint = new Paint(1);
        this.f8029Ujhhgtgfeyxiexzf = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f8030Ujhhgtgfeyxiexzf = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f8031Ujhhgtgfeyxiexzf = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f8032Ujhhgtgfeyxiexzf = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f8033Ujhhgtgfeyxiexzf = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f8052feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f8045Ujhhgtgfeyxiexzf = dimensionPixelOffset;
        this.f8056feyxiexzfUjhhgtg = dimensionPixelOffset;
        this.f8046Ujhhgtgfeyxiexzf = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f8047Ujhhgtgfeyxiexzf = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f8048Ujhhgtgfeyxiexzf = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f8049feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f8050feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f8065feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        AbstractC1243feyxiexzfUjhhgtg.m2730Ujhhgtgfeyxiexzf(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = AbstractC0799feyxiexzfUjhhgtg.f3146feyxiexzfUjhhgtg;
        AbstractC1243feyxiexzfUjhhgtg.m2731Ujhhgtgfeyxiexzf(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        this.f8037Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.f8069feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f8070feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f8069feyxiexzfUjhhgtg));
        this.f8074Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f8051feyxiexzfUjhhgtg = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(24);
        int i = zHasValue ? 24 : 26;
        int i2 = zHasValue ? 24 : 25;
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, i);
        setTrackInactiveTintList(colorStateListM4561Ujhhgtgfeyxiexzf == null ? AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context2, R.color.material_slider_inactive_track_color) : colorStateListM4561Ujhhgtgfeyxiexzf);
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf2 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, i2);
        setTrackActiveTintList(colorStateListM4561Ujhhgtgfeyxiexzf2 == null ? AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context2, R.color.material_slider_active_track_color) : colorStateListM4561Ujhhgtgfeyxiexzf2);
        c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(15, 0.0f));
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf3 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListM4561Ujhhgtgfeyxiexzf3 == null ? AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context2, R.color.material_slider_halo_color) : colorStateListM4561Ujhhgtgfeyxiexzf3);
        this.f8076Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(23, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(18);
        int i3 = zHasValue2 ? 18 : 20;
        int i4 = zHasValue2 ? 18 : 19;
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf4 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, i3);
        setTickInactiveTintList(colorStateListM4561Ujhhgtgfeyxiexzf4 == null ? AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListM4561Ujhhgtgfeyxiexzf4);
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf5 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, i4);
        setTickActiveTintList(colorStateListM4561Ujhhgtgfeyxiexzf5 == null ? AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context2, R.color.material_slider_active_tick_marks_color) : colorStateListM4561Ujhhgtgfeyxiexzf5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(29, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(28, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.f8063feyxiexzfUjhhgtg / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f8063feyxiexzfUjhhgtg / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        c0226Ujhhgtgfeyxiexzf.m1372Ujhhgtgfeyxiexzf();
        this.f8044Ujhhgtgfeyxiexzf = ViewConfiguration.get(context2).getScaledTouchSlop();
        C2473feyxiexzfUjhhgtg c2473feyxiexzfUjhhgtg = new C2473feyxiexzfUjhhgtg(slider);
        this.f8034Ujhhgtgfeyxiexzf = c2473feyxiexzfUjhhgtg;
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, c2473feyxiexzfUjhhgtg);
        this.f8035Ujhhgtgfeyxiexzf = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f8034Ujhhgtgfeyxiexzf.m5020Ujhhgtgfeyxiexzf(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8027Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(this.f8086Ujhhgtgfeyxiexzf));
        this.f8028Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(this.f8085Ujhhgtgfeyxiexzf));
        this.f8031Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(this.f8084feyxiexzfUjhhgtg));
        this.f8032Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(this.f8083feyxiexzfUjhhgtg));
        this.f8033Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(this.f8085Ujhhgtgfeyxiexzf));
        for (C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg : this.f8038Ujhhgtgfeyxiexzf) {
            if (c1759feyxiexzfUjhhgtg.isStateful()) {
                c1759feyxiexzfUjhhgtg.setState(getDrawableState());
            }
        }
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f8090feyxiexzfUjhhgtg;
        if (c0226Ujhhgtgfeyxiexzf.isStateful()) {
            c0226Ujhhgtgfeyxiexzf.setState(getDrawableState());
        }
        int iM3739Ujhhgtgfeyxiexzf = m3739Ujhhgtgfeyxiexzf(this.f8082feyxiexzfUjhhgtg);
        Paint paint = this.f8030Ujhhgtgfeyxiexzf;
        paint.setColor(iM3739Ujhhgtgfeyxiexzf);
        paint.setAlpha(63);
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f8034Ujhhgtgfeyxiexzf.f10915Ujhhgtgfeyxiexzf;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public List<Float> getValues() {
        return new ArrayList(this.f8071feyxiexzfUjhhgtg);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f8095Ujhhgtgfeyxiexzf);
        for (C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg : this.f8038Ujhhgtgfeyxiexzf) {
            ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
            if (viewGroupM3280Ujhhgtgfeyxiexzf == null) {
                c1759feyxiexzfUjhhgtg.getClass();
            } else {
                c1759feyxiexzfUjhhgtg.getClass();
                int[] iArr = new int[2];
                viewGroupM3280Ujhhgtgfeyxiexzf.getLocationOnScreen(iArr);
                c1759feyxiexzfUjhhgtg.f5914feyxiexzfUjhhgtg = iArr[0];
                viewGroupM3280Ujhhgtgfeyxiexzf.getWindowVisibleDisplayFrame(c1759feyxiexzfUjhhgtg.f5907feyxiexzfUjhhgtg);
                viewGroupM3280Ujhhgtgfeyxiexzf.addOnLayoutChangeListener(c1759feyxiexzfUjhhgtg.f5906feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        RunnableC2474feyxiexzfUjhhgtg runnableC2474feyxiexzfUjhhgtg = this.f8036Ujhhgtgfeyxiexzf;
        if (runnableC2474feyxiexzfUjhhgtg != null) {
            removeCallbacks(runnableC2474feyxiexzfUjhhgtg);
        }
        this.f8041Ujhhgtgfeyxiexzf = false;
        for (C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg : this.f8038Ujhhgtgfeyxiexzf) {
            ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
            C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = viewGroupM3280Ujhhgtgfeyxiexzf == null ? null : new C0709Ujhhgtgfeyxiexzf(viewGroupM3280Ujhhgtgfeyxiexzf);
            if (c0709Ujhhgtgfeyxiexzf != null) {
                ((ViewOverlay) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf).remove(c1759feyxiexzfUjhhgtg);
                ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf2 = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
                if (viewGroupM3280Ujhhgtgfeyxiexzf2 == null) {
                    c1759feyxiexzfUjhhgtg.getClass();
                } else {
                    viewGroupM3280Ujhhgtgfeyxiexzf2.removeOnLayoutChangeListener(c1759feyxiexzfUjhhgtg.f5906feyxiexzfUjhhgtg);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f8095Ujhhgtgfeyxiexzf);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        AbstractC2475feyxiexzfUjhhgtg abstractC2475feyxiexzfUjhhgtg = this;
        Canvas canvas2 = canvas;
        if (abstractC2475feyxiexzfUjhhgtg.f8081feyxiexzfUjhhgtg) {
            abstractC2475feyxiexzfUjhhgtg.m3757feyxiexzfUjhhgtg();
            abstractC2475feyxiexzfUjhhgtg.m3743Ujhhgtgfeyxiexzf();
        }
        super.onDraw(canvas);
        int iM3733Ujhhgtgfeyxiexzf = abstractC2475feyxiexzfUjhhgtg.m3733Ujhhgtgfeyxiexzf();
        int i3 = 0;
        float fFloatValue = ((Float) abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.get(0)).floatValue();
        ArrayList arrayList = abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f3 = abstractC2475feyxiexzfUjhhgtg.f8070feyxiexzfUjhhgtg;
        RectF rectF = abstractC2475feyxiexzfUjhhgtg.f8088feyxiexzfUjhhgtg;
        if (fFloatValue2 < f3 || (abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size() > 1 && fFloatValue > abstractC2475feyxiexzfUjhhgtg.f8069feyxiexzfUjhhgtg)) {
            int i4 = abstractC2475feyxiexzfUjhhgtg.f8079feyxiexzfUjhhgtg;
            float[] fArrM3738Ujhhgtgfeyxiexzf = abstractC2475feyxiexzfUjhhgtg.m3738Ujhhgtgfeyxiexzf();
            int i5 = abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg;
            float f4 = i4;
            float f5 = (fArrM3738Ujhhgtgfeyxiexzf[1] * f4) + i5;
            float f6 = i5 + i4;
            Paint paint = abstractC2475feyxiexzfUjhhgtg.f8027Ujhhgtgfeyxiexzf;
            if (f5 < f6) {
                int i6 = abstractC2475feyxiexzfUjhhgtg.f8060feyxiexzfUjhhgtg;
                if (i6 > 0) {
                    float f7 = f5 + i6;
                    float f8 = iM3733Ujhhgtgfeyxiexzf;
                    f = 2.0f;
                    float f9 = abstractC2475feyxiexzfUjhhgtg.f8055feyxiexzfUjhhgtg / 2.0f;
                    rectF.set(f7, f8 - f9, i5 + i4 + f9, f9 + f8);
                    abstractC2475feyxiexzfUjhhgtg.m3755Ujhhgtgfeyxiexzf(canvas2, paint, rectF, 3);
                } else {
                    f = 2.0f;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f10 = iM3733Ujhhgtgfeyxiexzf;
                    canvas2.drawLine(f5, f10, abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg + i4, f10, paint);
                }
            } else {
                f = 2.0f;
            }
            int i7 = abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg;
            float f11 = i7;
            float f12 = (fArrM3738Ujhhgtgfeyxiexzf[i3] * f4) + f11;
            if (f12 > f11) {
                int i8 = abstractC2475feyxiexzfUjhhgtg.f8060feyxiexzfUjhhgtg;
                if (i8 > 0) {
                    float f13 = abstractC2475feyxiexzfUjhhgtg.f8055feyxiexzfUjhhgtg / f;
                    float f14 = iM3733Ujhhgtgfeyxiexzf;
                    rectF.set(i7 - f13, f14 - f13, f12 - i8, f13 + f14);
                    abstractC2475feyxiexzfUjhhgtg.m3755Ujhhgtgfeyxiexzf(canvas2, paint, rectF, 2);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f15 = iM3733Ujhhgtgfeyxiexzf;
                    canvas2.drawLine(abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg, f15, f12, f15, paint);
                }
            }
        } else {
            i3 = 0;
            f = 2.0f;
        }
        if (fFloatValue2 > abstractC2475feyxiexzfUjhhgtg.f8069feyxiexzfUjhhgtg) {
            int i9 = abstractC2475feyxiexzfUjhhgtg.f8079feyxiexzfUjhhgtg;
            float[] fArrM3738Ujhhgtgfeyxiexzf2 = abstractC2475feyxiexzfUjhhgtg.m3738Ujhhgtgfeyxiexzf();
            float f16 = abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg;
            float f17 = i9;
            float fM3759feyxiexzfUjhhgtg = (fArrM3738Ujhhgtgfeyxiexzf2[1] * f17) + f16;
            float fM3759feyxiexzfUjhhgtg2 = (fArrM3738Ujhhgtgfeyxiexzf2[i3] * f17) + f16;
            int i10 = abstractC2475feyxiexzfUjhhgtg.f8060feyxiexzfUjhhgtg;
            Paint paint2 = abstractC2475feyxiexzfUjhhgtg.f8028Ujhhgtgfeyxiexzf;
            if (i10 > 0) {
                int i11 = abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size() == 1 ? abstractC2475feyxiexzfUjhhgtg.m3742Ujhhgtgfeyxiexzf() ? 3 : 2 : 4;
                for (int i12 = i3; i12 < abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size(); i12++) {
                    if (abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size() > 1) {
                        if (i12 > 0) {
                            fM3759feyxiexzfUjhhgtg2 = abstractC2475feyxiexzfUjhhgtg.m3759feyxiexzfUjhhgtg(((Float) abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.get(i12 - 1)).floatValue());
                        }
                        fM3759feyxiexzfUjhhgtg = abstractC2475feyxiexzfUjhhgtg.m3759feyxiexzfUjhhgtg(((Float) abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.get(i12)).floatValue());
                        if (abstractC2475feyxiexzfUjhhgtg.m3742Ujhhgtgfeyxiexzf()) {
                            fM3759feyxiexzfUjhhgtg = fM3759feyxiexzfUjhhgtg2;
                            fM3759feyxiexzfUjhhgtg2 = fM3759feyxiexzfUjhhgtg;
                        }
                    }
                    int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i11);
                    if (iM2713feyxiexzfUjhhgtg != 1) {
                        if (iM2713feyxiexzfUjhhgtg == 2) {
                            fM3759feyxiexzfUjhhgtg2 += abstractC2475feyxiexzfUjhhgtg.f8060feyxiexzfUjhhgtg;
                            fM3759feyxiexzfUjhhgtg = (abstractC2475feyxiexzfUjhhgtg.f8055feyxiexzfUjhhgtg / f) + fM3759feyxiexzfUjhhgtg;
                        } else if (iM2713feyxiexzfUjhhgtg == 3) {
                            f2 = abstractC2475feyxiexzfUjhhgtg.f8060feyxiexzfUjhhgtg;
                            fM3759feyxiexzfUjhhgtg2 += f2;
                        }
                        if (fM3759feyxiexzfUjhhgtg2 >= fM3759feyxiexzfUjhhgtg) {
                            float f18 = iM3733Ujhhgtgfeyxiexzf;
                            float f19 = abstractC2475feyxiexzfUjhhgtg.f8055feyxiexzfUjhhgtg / f;
                            rectF.set(fM3759feyxiexzfUjhhgtg2, f18 - f19, fM3759feyxiexzfUjhhgtg, f19 + f18);
                            abstractC2475feyxiexzfUjhhgtg.m3755Ujhhgtgfeyxiexzf(canvas2, paint2, rectF, i11);
                        }
                    } else {
                        fM3759feyxiexzfUjhhgtg2 -= abstractC2475feyxiexzfUjhhgtg.f8055feyxiexzfUjhhgtg / f;
                        f2 = abstractC2475feyxiexzfUjhhgtg.f8060feyxiexzfUjhhgtg;
                    }
                    fM3759feyxiexzfUjhhgtg -= f2;
                    if (fM3759feyxiexzfUjhhgtg2 >= fM3759feyxiexzfUjhhgtg) {
                        float f110 = iM3733Ujhhgtgfeyxiexzf;
                        float f111 = abstractC2475feyxiexzfUjhhgtg.f8055feyxiexzfUjhhgtg / f;
                        rectF.set(fM3759feyxiexzfUjhhgtg2, f110 - f111, fM3759feyxiexzfUjhhgtg, f111 + f110);
                        abstractC2475feyxiexzfUjhhgtg.m3755Ujhhgtgfeyxiexzf(canvas2, paint2, rectF, i11);
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f20 = iM3733Ujhhgtgfeyxiexzf;
                canvas2.drawLine(fM3759feyxiexzfUjhhgtg2, f20, fM3759feyxiexzfUjhhgtg, f20, paint2);
            }
        }
        if (abstractC2475feyxiexzfUjhhgtg.f8076Ujhhgtgfeyxiexzf && abstractC2475feyxiexzfUjhhgtg.f8074Ujhhgtgfeyxiexzf > 0.0f) {
            float[] fArrM3738Ujhhgtgfeyxiexzf3 = abstractC2475feyxiexzfUjhhgtg.m3738Ujhhgtgfeyxiexzf();
            int iCeil = (int) Math.ceil(((abstractC2475feyxiexzfUjhhgtg.f8075Ujhhgtgfeyxiexzf.length / f) - 1.0f) * fArrM3738Ujhhgtgfeyxiexzf3[i3]);
            int iFloor = (int) Math.floor(((abstractC2475feyxiexzfUjhhgtg.f8075Ujhhgtgfeyxiexzf.length / f) - 1.0f) * fArrM3738Ujhhgtgfeyxiexzf3[1]);
            Paint paint3 = abstractC2475feyxiexzfUjhhgtg.f8031Ujhhgtgfeyxiexzf;
            if (iCeil > 0) {
                canvas2.drawPoints(abstractC2475feyxiexzfUjhhgtg.f8075Ujhhgtgfeyxiexzf, i3, iCeil * 2, paint3);
            }
            if (iCeil <= iFloor) {
                canvas2.drawPoints(abstractC2475feyxiexzfUjhhgtg.f8075Ujhhgtgfeyxiexzf, iCeil * 2, ((iFloor - iCeil) + 1) * 2, abstractC2475feyxiexzfUjhhgtg.f8032Ujhhgtgfeyxiexzf);
            }
            int i13 = (iFloor + 1) * 2;
            float[] fArr = abstractC2475feyxiexzfUjhhgtg.f8075Ujhhgtgfeyxiexzf;
            if (i13 < fArr.length) {
                canvas2.drawPoints(fArr, i13, fArr.length - i13, paint3);
            }
        }
        if (abstractC2475feyxiexzfUjhhgtg.f8063feyxiexzfUjhhgtg <= 0) {
            i = 0;
        } else {
            int size = abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size();
            Paint paint4 = abstractC2475feyxiexzfUjhhgtg.f8033Ujhhgtgfeyxiexzf;
            if (size >= 1) {
                ArrayList arrayList2 = abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg;
                float fFloatValue3 = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
                float f21 = abstractC2475feyxiexzfUjhhgtg.f8070feyxiexzfUjhhgtg;
                if (fFloatValue3 < f21) {
                    canvas2.drawPoint(abstractC2475feyxiexzfUjhhgtg.m3759feyxiexzfUjhhgtg(f21), iM3733Ujhhgtgfeyxiexzf, paint4);
                }
            }
            if (abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size() > 1) {
                i = 0;
                float fFloatValue4 = ((Float) abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.get(0)).floatValue();
                float f22 = abstractC2475feyxiexzfUjhhgtg.f8069feyxiexzfUjhhgtg;
                if (fFloatValue4 > f22) {
                    canvas2.drawPoint(abstractC2475feyxiexzfUjhhgtg.m3759feyxiexzfUjhhgtg(f22), iM3733Ujhhgtgfeyxiexzf, paint4);
                }
            } else {
                i = 0;
            }
        }
        if ((abstractC2475feyxiexzfUjhhgtg.f8068feyxiexzfUjhhgtg || abstractC2475feyxiexzfUjhhgtg.isFocused()) && abstractC2475feyxiexzfUjhhgtg.isEnabled()) {
            int i14 = abstractC2475feyxiexzfUjhhgtg.f8079feyxiexzfUjhhgtg;
            if (!(abstractC2475feyxiexzfUjhhgtg.getBackground() instanceof RippleDrawable)) {
                int iM3746Ujhhgtgfeyxiexzf = (int) ((abstractC2475feyxiexzfUjhhgtg.m3746Ujhhgtgfeyxiexzf(((Float) abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.get(abstractC2475feyxiexzfUjhhgtg.f8073Ujhhgtgfeyxiexzf)).floatValue()) * i14) + abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg);
                if (Build.VERSION.SDK_INT < 28) {
                    int i15 = abstractC2475feyxiexzfUjhhgtg.f8059feyxiexzfUjhhgtg;
                    canvas2.clipRect(iM3746Ujhhgtgfeyxiexzf - i15, iM3733Ujhhgtgfeyxiexzf - i15, iM3746Ujhhgtgfeyxiexzf + i15, i15 + iM3733Ujhhgtgfeyxiexzf, Region.Op.UNION);
                }
                canvas2.drawCircle(iM3746Ujhhgtgfeyxiexzf, iM3733Ujhhgtgfeyxiexzf, abstractC2475feyxiexzfUjhhgtg.f8059feyxiexzfUjhhgtg, abstractC2475feyxiexzfUjhhgtg.f8030Ujhhgtgfeyxiexzf);
            }
        }
        abstractC2475feyxiexzfUjhhgtg.m3754Ujhhgtgfeyxiexzf();
        int i16 = abstractC2475feyxiexzfUjhhgtg.f8079feyxiexzfUjhhgtg;
        while (i < abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.size()) {
            float fFloatValue5 = ((Float) abstractC2475feyxiexzfUjhhgtg.f8071feyxiexzfUjhhgtg.get(i)).floatValue();
            Drawable drawable = abstractC2475feyxiexzfUjhhgtg.f8091Ujhhgtgfeyxiexzf;
            if (drawable != null) {
                i2 = iM3733Ujhhgtgfeyxiexzf;
                abstractC2475feyxiexzfUjhhgtg.m3735Ujhhgtgfeyxiexzf(canvas2, i16, i2, fFloatValue5, drawable);
            } else {
                i2 = iM3733Ujhhgtgfeyxiexzf;
                if (i < abstractC2475feyxiexzfUjhhgtg.f8092Ujhhgtgfeyxiexzf.size()) {
                    abstractC2475feyxiexzfUjhhgtg.m3735Ujhhgtgfeyxiexzf(canvas, i16, i2, fFloatValue5, (Drawable) abstractC2475feyxiexzfUjhhgtg.f8092Ujhhgtgfeyxiexzf.get(i));
                } else {
                    if (!abstractC2475feyxiexzfUjhhgtg.isEnabled()) {
                        canvas.drawCircle((abstractC2475feyxiexzfUjhhgtg.m3746Ujhhgtgfeyxiexzf(fFloatValue5) * i16) + abstractC2475feyxiexzfUjhhgtg.f8056feyxiexzfUjhhgtg, i2, abstractC2475feyxiexzfUjhhgtg.getThumbRadius(), abstractC2475feyxiexzfUjhhgtg.f8029Ujhhgtgfeyxiexzf);
                    }
                    abstractC2475feyxiexzfUjhhgtg.m3735Ujhhgtgfeyxiexzf(canvas, i16, i2, fFloatValue5, abstractC2475feyxiexzfUjhhgtg.f8090feyxiexzfUjhhgtg);
                }
            }
            i++;
            abstractC2475feyxiexzfUjhhgtg = this;
            canvas2 = canvas;
            iM3733Ujhhgtgfeyxiexzf = i2;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C2473feyxiexzfUjhhgtg c2473feyxiexzfUjhhgtg = this.f8034Ujhhgtgfeyxiexzf;
        if (!z) {
            this.f8072feyxiexzfUjhhgtg = -1;
            c2473feyxiexzfUjhhgtg.m5017Ujhhgtgfeyxiexzf(this.f8073Ujhhgtgfeyxiexzf);
            return;
        }
        if (i == 1) {
            m3744Ujhhgtgfeyxiexzf(Integer.MAX_VALUE);
        } else if (i == 2) {
            m3744Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
        } else if (i == 17) {
            m3745Ujhhgtgfeyxiexzf(Integer.MAX_VALUE);
        } else if (i == 66) {
            m3745Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
        }
        c2473feyxiexzfUjhhgtg.m5024Ujhhgtgfeyxiexzf(this.f8073Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f8071feyxiexzfUjhhgtg.size() == 1) {
            this.f8072feyxiexzfUjhhgtg = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f8072feyxiexzfUjhhgtg == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.f8072feyxiexzfUjhhgtg = this.f8073Ujhhgtgfeyxiexzf;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    m3744Ujhhgtgfeyxiexzf(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    m3744Ujhhgtgfeyxiexzf(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case Opcodes.ILOAD /* 21 */:
                            m3745Ujhhgtgfeyxiexzf(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case Opcodes.LLOAD /* 22 */:
                            m3745Ujhhgtgfeyxiexzf(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case Opcodes.FLOAD /* 23 */:
                            this.f8072feyxiexzfUjhhgtg = this.f8073Ujhhgtgfeyxiexzf;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    m3744Ujhhgtgfeyxiexzf(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(m3744Ujhhgtgfeyxiexzf(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m3744Ujhhgtgfeyxiexzf(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.f8080feyxiexzfUjhhgtg | keyEvent.isLongPress();
        this.f8080feyxiexzfUjhhgtg = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f = this.f8074Ujhhgtgfeyxiexzf;
            fRound = f != 0.0f ? f : 1.0f;
            float f2 = (this.f8070feyxiexzfUjhhgtg - this.f8069feyxiexzfUjhhgtg) / fRound;
            float f3 = 20;
            if (f2 > f3) {
                fRound *= Math.round(f2 / f3);
            }
        } else {
            float f4 = this.f8074Ujhhgtgfeyxiexzf;
            if (f4 != 0.0f) {
                fRound = f4;
            }
        }
        if (i == 21) {
            if (!m3742Ujhhgtgfeyxiexzf()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (m3742Ujhhgtgfeyxiexzf()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i == 70 || i == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (m3750Ujhhgtgfeyxiexzf(this.f8072feyxiexzfUjhhgtg, fValueOf.floatValue() + ((Float) this.f8071feyxiexzfUjhhgtg.get(this.f8072feyxiexzfUjhhgtg)).floatValue())) {
                m3753Ujhhgtgfeyxiexzf();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m3744Ujhhgtgfeyxiexzf(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m3744Ujhhgtgfeyxiexzf(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f8072feyxiexzfUjhhgtg = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f8080feyxiexzfUjhhgtg = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f8053feyxiexzfUjhhgtg;
        int i4 = this.f8054feyxiexzfUjhhgtg;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((C1759feyxiexzfUjhhgtg) this.f8038Ujhhgtgfeyxiexzf.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C2476feyxiexzfUjhhgtg c2476feyxiexzfUjhhgtg = (C2476feyxiexzfUjhhgtg) parcelable;
        super.onRestoreInstanceState(c2476feyxiexzfUjhhgtg.getSuperState());
        this.f8069feyxiexzfUjhhgtg = c2476feyxiexzfUjhhgtg.f8096Ujhhgtgfeyxiexzf;
        this.f8070feyxiexzfUjhhgtg = c2476feyxiexzfUjhhgtg.f8097Ujhhgtgfeyxiexzf;
        m3749Ujhhgtgfeyxiexzf(c2476feyxiexzfUjhhgtg.f8098Ujhhgtgfeyxiexzf);
        this.f8074Ujhhgtgfeyxiexzf = c2476feyxiexzfUjhhgtg.f8099Ujhhgtgfeyxiexzf;
        if (c2476feyxiexzfUjhhgtg.f8100Ujhhgtgfeyxiexzf) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2476feyxiexzfUjhhgtg c2476feyxiexzfUjhhgtg = new C2476feyxiexzfUjhhgtg(super.onSaveInstanceState());
        c2476feyxiexzfUjhhgtg.f8096Ujhhgtgfeyxiexzf = this.f8069feyxiexzfUjhhgtg;
        c2476feyxiexzfUjhhgtg.f8097Ujhhgtgfeyxiexzf = this.f8070feyxiexzfUjhhgtg;
        c2476feyxiexzfUjhhgtg.f8098Ujhhgtgfeyxiexzf = new ArrayList(this.f8071feyxiexzfUjhhgtg);
        c2476feyxiexzfUjhhgtg.f8099Ujhhgtgfeyxiexzf = this.f8074Ujhhgtgfeyxiexzf;
        c2476feyxiexzfUjhhgtg.f8100Ujhhgtgfeyxiexzf = hasFocus();
        return c2476feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f8079feyxiexzfUjhhgtg = Math.max(i - (this.f8056feyxiexzfUjhhgtg * 2), 0);
        m3743Ujhhgtgfeyxiexzf();
        m3753Ujhhgtgfeyxiexzf();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        int i;
        float f;
        Slider slider;
        if (isEnabled()) {
            float x = motionEvent.getX();
            float f2 = (x - this.f8056feyxiexzfUjhhgtg) / this.f8079feyxiexzfUjhhgtg;
            this.f8093feyxiexzfUjhhgtg = f2;
            float fMax = Math.max(0.0f, f2);
            this.f8093feyxiexzfUjhhgtg = fMax;
            this.f8093feyxiexzfUjhhgtg = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i2 = this.f8044Ujhhgtgfeyxiexzf;
                if (actionMasked == 1) {
                    this.f8068feyxiexzfUjhhgtg = false;
                    motionEvent2 = this.f8067feyxiexzfUjhhgtg;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f = i2;
                        if (Math.abs(this.f8067feyxiexzfUjhhgtg.getX() - motionEvent.getX()) <= f && Math.abs(this.f8067feyxiexzfUjhhgtg.getY() - motionEvent.getY()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            m3747Ujhhgtgfeyxiexzf();
                        }
                    }
                    if (this.f8072feyxiexzfUjhhgtg != -1) {
                        m3751Ujhhgtgfeyxiexzf();
                        m3753Ujhhgtgfeyxiexzf();
                        if (this.f8060feyxiexzfUjhhgtg > 0 && (i = this.f8061feyxiexzfUjhhgtg) != -1 && this.f8062feyxiexzfUjhhgtg != -1) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.f8062feyxiexzfUjhhgtg);
                        }
                        this.f8072feyxiexzfUjhhgtg = -1;
                        it = this.f8040Ujhhgtgfeyxiexzf.iterator();
                        if (it.hasNext()) {
                            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.f8068feyxiexzfUjhhgtg) {
                        if (!m3741Ujhhgtgfeyxiexzf(motionEvent) || Math.abs(x - this.f8066feyxiexzfUjhhgtg) >= i2) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m3747Ujhhgtgfeyxiexzf();
                        }
                    }
                    Slider slider2 = (Slider) this;
                    if (slider2.getActiveThumbIndex() == -1) {
                        slider2.setActiveThumbIndex(0);
                    }
                    this.f8068feyxiexzfUjhhgtg = true;
                    m3751Ujhhgtgfeyxiexzf();
                    m3753Ujhhgtgfeyxiexzf();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.f8068feyxiexzfUjhhgtg = false;
                    motionEvent2 = this.f8067feyxiexzfUjhhgtg;
                    if (motionEvent2 != null) {
                        f = i2;
                        if (Math.abs(this.f8067feyxiexzfUjhhgtg.getX() - motionEvent.getX()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            m3747Ujhhgtgfeyxiexzf();
                        }
                    }
                    if (this.f8072feyxiexzfUjhhgtg != -1) {
                        m3751Ujhhgtgfeyxiexzf();
                        m3753Ujhhgtgfeyxiexzf();
                        if (this.f8060feyxiexzfUjhhgtg > 0) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.f8062feyxiexzfUjhhgtg);
                        }
                        this.f8072feyxiexzfUjhhgtg = -1;
                        it = this.f8040Ujhhgtgfeyxiexzf.iterator();
                        if (it.hasNext()) {
                            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
                        }
                    }
                    invalidate();
                }
            } else {
                this.f8066feyxiexzfUjhhgtg = x;
                if (!m3741Ujhhgtgfeyxiexzf(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.f8068feyxiexzfUjhhgtg = true;
                    m3751Ujhhgtgfeyxiexzf();
                    m3753Ujhhgtgfeyxiexzf();
                    int i3 = this.f8060feyxiexzfUjhhgtg;
                    if (i3 > 0) {
                        int i4 = this.f8057feyxiexzfUjhhgtg;
                        this.f8061feyxiexzfUjhhgtg = i4;
                        this.f8062feyxiexzfUjhhgtg = i3;
                        int iRound = Math.round(i4 * 0.5f);
                        int i5 = this.f8057feyxiexzfUjhhgtg - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.f8060feyxiexzfUjhhgtg - (i5 / 2));
                    }
                    invalidate();
                    m3747Ujhhgtgfeyxiexzf();
                }
            }
            setPressed(this.f8068feyxiexzfUjhhgtg);
            this.f8067feyxiexzfUjhhgtg = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
            C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = viewGroupM3280Ujhhgtgfeyxiexzf == null ? null : new C0709Ujhhgtgfeyxiexzf(viewGroupM3280Ujhhgtgfeyxiexzf);
            if (c0709Ujhhgtgfeyxiexzf == null) {
                return;
            }
            Iterator it = this.f8038Ujhhgtgfeyxiexzf.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf).remove((C1759feyxiexzfUjhhgtg) it.next());
            }
        }
    }

    public void setActiveThumbIndex(int i) {
        this.f8072feyxiexzfUjhhgtg = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.f8094feyxiexzfUjhhgtg = i;
        this.f8081feyxiexzfUjhhgtg = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m3749Ujhhgtgfeyxiexzf(arrayList);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3732Ujhhgtgfeyxiexzf(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f8057feyxiexzfUjhhgtg, this.f8058feyxiexzfUjhhgtg);
        } else {
            float fMax = Math.max(this.f8057feyxiexzfUjhhgtg, this.f8058feyxiexzfUjhhgtg) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m3733Ujhhgtgfeyxiexzf() {
        int i = this.f8053feyxiexzfUjhhgtg / 2;
        int i2 = this.f8054feyxiexzfUjhhgtg;
        return i + ((i2 == 1 || i2 == 3) ? ((C1759feyxiexzfUjhhgtg) this.f8038Ujhhgtgfeyxiexzf.get(0)).getIntrinsicHeight() : 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ValueAnimator m3734Ujhhgtgfeyxiexzf(boolean z) {
        int iM2833Ujhhgtgfeyxiexzf;
        TimeInterpolator timeInterpolatorM2834Ujhhgtgfeyxiexzf;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f8043Ujhhgtgfeyxiexzf : this.f8042Ujhhgtgfeyxiexzf;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iM2833Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorM2834Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9416Ujhhgtgfeyxiexzf);
        } else {
            iM2833Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(getContext(), R.attr.motionDurationShort3, Opcodes.LNEG);
            timeInterpolatorM2834Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9414Ujhhgtgfeyxiexzf);
        }
        valueAnimatorOfFloat.setDuration(iM2833Ujhhgtgfeyxiexzf);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM2834Ujhhgtgfeyxiexzf);
        valueAnimatorOfFloat.addUpdateListener(new C2478feyxiexzfUjhhgtg(i, this));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3735Ujhhgtgfeyxiexzf(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f8056feyxiexzfUjhhgtg + ((int) (m3746Ujhhgtgfeyxiexzf(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3736Ujhhgtgfeyxiexzf() {
        if (!this.f8041Ujhhgtgfeyxiexzf) {
            this.f8041Ujhhgtgfeyxiexzf = true;
            ValueAnimator valueAnimatorM3734Ujhhgtgfeyxiexzf = m3734Ujhhgtgfeyxiexzf(true);
            this.f8042Ujhhgtgfeyxiexzf = valueAnimatorM3734Ujhhgtgfeyxiexzf;
            this.f8043Ujhhgtgfeyxiexzf = null;
            valueAnimatorM3734Ujhhgtgfeyxiexzf.start();
        }
        ArrayList arrayList = this.f8038Ujhhgtgfeyxiexzf;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.f8071feyxiexzfUjhhgtg.size() && it.hasNext(); i++) {
            if (i != this.f8073Ujhhgtgfeyxiexzf) {
                m3748Ujhhgtgfeyxiexzf((C1759feyxiexzfUjhhgtg) it.next(), ((Float) this.f8071feyxiexzfUjhhgtg.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f8071feyxiexzfUjhhgtg.size())));
        }
        m3748Ujhhgtgfeyxiexzf((C1759feyxiexzfUjhhgtg) it.next(), ((Float) this.f8071feyxiexzfUjhhgtg.get(this.f8073Ujhhgtgfeyxiexzf)).floatValue());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3737Ujhhgtgfeyxiexzf() {
        if (this.f8041Ujhhgtgfeyxiexzf) {
            this.f8041Ujhhgtgfeyxiexzf = false;
            ValueAnimator valueAnimatorM3734Ujhhgtgfeyxiexzf = m3734Ujhhgtgfeyxiexzf(false);
            this.f8043Ujhhgtgfeyxiexzf = valueAnimatorM3734Ujhhgtgfeyxiexzf;
            this.f8042Ujhhgtgfeyxiexzf = null;
            valueAnimatorM3734Ujhhgtgfeyxiexzf.addListener(new C2994Ujhhgtgfeyxiexzf(2, this));
            this.f8043Ujhhgtgfeyxiexzf.start();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final float[] m3738Ujhhgtgfeyxiexzf() {
        float fFloatValue = ((Float) this.f8071feyxiexzfUjhhgtg.get(0)).floatValue();
        ArrayList arrayList = this.f8071feyxiexzfUjhhgtg;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f8071feyxiexzfUjhhgtg.size() == 1) {
            fFloatValue = this.f8069feyxiexzfUjhhgtg;
        }
        float fM3746Ujhhgtgfeyxiexzf = m3746Ujhhgtgfeyxiexzf(fFloatValue);
        float fM3746Ujhhgtgfeyxiexzf2 = m3746Ujhhgtgfeyxiexzf(fFloatValue2);
        return m3742Ujhhgtgfeyxiexzf() ? new float[]{fM3746Ujhhgtgfeyxiexzf2, fM3746Ujhhgtgfeyxiexzf} : new float[]{fM3746Ujhhgtgfeyxiexzf, fM3746Ujhhgtgfeyxiexzf2};
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m3739Ujhhgtgfeyxiexzf(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m3740Ujhhgtgfeyxiexzf(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.f8074Ujhhgtgfeyxiexzf)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m3741Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean m3742Ujhhgtgfeyxiexzf() {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3743Ujhhgtgfeyxiexzf() {
        if (this.f8074Ujhhgtgfeyxiexzf <= 0.0f) {
            return;
        }
        m3757feyxiexzfUjhhgtg();
        int iMin = Math.min((int) (((this.f8070feyxiexzfUjhhgtg - this.f8069feyxiexzfUjhhgtg) / this.f8074Ujhhgtgfeyxiexzf) + 1.0f), (this.f8079feyxiexzfUjhhgtg / this.f8050feyxiexzfUjhhgtg) + 1);
        float[] fArr = this.f8075Ujhhgtgfeyxiexzf;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f8075Ujhhgtgfeyxiexzf = new float[iMin * 2];
        }
        float f = this.f8079feyxiexzfUjhhgtg / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f8075Ujhhgtgfeyxiexzf;
            fArr2[i] = ((i / 2.0f) * f) + this.f8056feyxiexzfUjhhgtg;
            fArr2[i + 1] = m3733Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final boolean m3744Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8073Ujhhgtgfeyxiexzf;
        long j = ((long) i2) + ((long) i);
        long size = this.f8071feyxiexzfUjhhgtg.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f8073Ujhhgtgfeyxiexzf = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f8072feyxiexzfUjhhgtg != -1) {
            this.f8072feyxiexzfUjhhgtg = i3;
        }
        m3753Ujhhgtgfeyxiexzf();
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m3745Ujhhgtgfeyxiexzf(int i) {
        if (m3742Ujhhgtgfeyxiexzf()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        m3744Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final float m3746Ujhhgtgfeyxiexzf(float f) {
        float f2 = this.f8069feyxiexzfUjhhgtg;
        float f3 = (f - f2) / (this.f8070feyxiexzfUjhhgtg - f2);
        return m3742Ujhhgtgfeyxiexzf() ? 1.0f - f3 : f3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3747Ujhhgtgfeyxiexzf() {
        Iterator it = this.f8040Ujhhgtgfeyxiexzf.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m3748Ujhhgtgfeyxiexzf(C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg, float f) {
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(c1759feyxiexzfUjhhgtg.f5902feyxiexzfUjhhgtg, str)) {
            c1759feyxiexzfUjhhgtg.f5902feyxiexzfUjhhgtg = str;
            c1759feyxiexzfUjhhgtg.f5905feyxiexzfUjhhgtg.f6471Ujhhgtgfeyxiexzf = true;
            c1759feyxiexzfUjhhgtg.invalidateSelf();
        }
        int iM3746Ujhhgtgfeyxiexzf = (this.f8056feyxiexzfUjhhgtg + ((int) (m3746Ujhhgtgfeyxiexzf(f) * this.f8079feyxiexzfUjhhgtg))) - (c1759feyxiexzfUjhhgtg.getIntrinsicWidth() / 2);
        int iM3733Ujhhgtgfeyxiexzf = m3733Ujhhgtgfeyxiexzf() - ((this.f8058feyxiexzfUjhhgtg / 2) + this.f8065feyxiexzfUjhhgtg);
        c1759feyxiexzfUjhhgtg.setBounds(iM3746Ujhhgtgfeyxiexzf, iM3733Ujhhgtgfeyxiexzf - c1759feyxiexzfUjhhgtg.getIntrinsicHeight(), c1759feyxiexzfUjhhgtg.getIntrinsicWidth() + iM3746Ujhhgtgfeyxiexzf, iM3733Ujhhgtgfeyxiexzf);
        Rect rect = new Rect(c1759feyxiexzfUjhhgtg.getBounds());
        AbstractC3260feyxiexzfUjhhgtg.m4770Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this), this, rect);
        c1759feyxiexzfUjhhgtg.setBounds(rect);
        ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
        ((ViewOverlay) (viewGroupM3280Ujhhgtgfeyxiexzf == null ? null : new C0709Ujhhgtgfeyxiexzf(viewGroupM3280Ujhhgtgfeyxiexzf)).f2944Ujhhgtgfeyxiexzf).add(c1759feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3749Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf;
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f8071feyxiexzfUjhhgtg.size() == arrayList.size() && this.f8071feyxiexzfUjhhgtg.equals(arrayList)) {
            return;
        }
        this.f8071feyxiexzfUjhhgtg = arrayList;
        this.f8081feyxiexzfUjhhgtg = true;
        this.f8073Ujhhgtgfeyxiexzf = 0;
        m3753Ujhhgtgfeyxiexzf();
        ArrayList<C1759feyxiexzfUjhhgtg> arrayList2 = this.f8038Ujhhgtgfeyxiexzf;
        if (arrayList2.size() > this.f8071feyxiexzfUjhhgtg.size()) {
            List<C1759feyxiexzfUjhhgtg> listSubList = arrayList2.subList(this.f8071feyxiexzfUjhhgtg.size(), arrayList2.size());
            for (C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg : listSubList) {
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                if (isAttachedToWindow()) {
                    ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf2 = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
                    C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = viewGroupM3280Ujhhgtgfeyxiexzf2 == null ? null : new C0709Ujhhgtgfeyxiexzf(viewGroupM3280Ujhhgtgfeyxiexzf2);
                    if (c0709Ujhhgtgfeyxiexzf != null) {
                        ((ViewOverlay) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf).remove(c1759feyxiexzfUjhhgtg);
                        ViewGroup viewGroupM3280Ujhhgtgfeyxiexzf3 = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this);
                        if (viewGroupM3280Ujhhgtgfeyxiexzf3 == null) {
                            c1759feyxiexzfUjhhgtg.getClass();
                        } else {
                            viewGroupM3280Ujhhgtgfeyxiexzf3.removeOnLayoutChangeListener(c1759feyxiexzfUjhhgtg.f5906feyxiexzfUjhhgtg);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f8071feyxiexzfUjhhgtg.size()) {
            Context context = getContext();
            int i = this.f8037Ujhhgtgfeyxiexzf;
            C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg2 = new C1759feyxiexzfUjhhgtg(context, i);
            TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(c1759feyxiexzfUjhhgtg2.f5903feyxiexzfUjhhgtg, null, AbstractC0799feyxiexzfUjhhgtg.f3154feyxiexzfUjhhgtg, 0, i, new int[0]);
            Context context2 = c1759feyxiexzfUjhhgtg2.f5903feyxiexzfUjhhgtg;
            c1759feyxiexzfUjhhgtg2.f5913feyxiexzfUjhhgtg = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(8, true);
            c1759feyxiexzfUjhhgtg2.f5912feyxiexzfUjhhgtg = z;
            if (z) {
                C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c1759feyxiexzfUjhhgtg2.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
                c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3958Ujhhgtgfeyxiexzf = c1759feyxiexzfUjhhgtg2.m3054Ujhhgtgfeyxiexzf();
                c1759feyxiexzfUjhhgtg2.setShapeAppearanceModel(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
            } else {
                c1759feyxiexzfUjhhgtg2.f5913feyxiexzfUjhhgtg = 0;
            }
            CharSequence text = typedArrayM2740Ujhhgtgfeyxiexzf.getText(6);
            boolean zEquals = TextUtils.equals(c1759feyxiexzfUjhhgtg2.f5902feyxiexzfUjhhgtg, text);
            C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = c1759feyxiexzfUjhhgtg2.f5905feyxiexzfUjhhgtg;
            if (!zEquals) {
                c1759feyxiexzfUjhhgtg2.f5902feyxiexzfUjhhgtg = text;
                c1970Ujhhgtgfeyxiexzf.f6471Ujhhgtgfeyxiexzf = true;
                c1759feyxiexzfUjhhgtg2.invalidateSelf();
            }
            C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = (!typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(0) || (resourceId = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(0, 0)) == 0) ? null : new C1969Ujhhgtgfeyxiexzf(context2, resourceId);
            if (c1969Ujhhgtgfeyxiexzf != null && typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(1)) {
                c1969Ujhhgtgfeyxiexzf.f6462Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayM2740Ujhhgtgfeyxiexzf, 1);
            }
            c1970Ujhhgtgfeyxiexzf.m3310Ujhhgtgfeyxiexzf(c1969Ujhhgtgfeyxiexzf, context2);
            TypedValue typedValueM4526Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4526Ujhhgtgfeyxiexzf(context2, R.attr.colorOnBackground, C1759feyxiexzfUjhhgtg.class.getCanonicalName());
            int i2 = typedValueM4526Ujhhgtgfeyxiexzf.resourceId;
            int color = i2 != 0 ? context2.getColor(i2) : typedValueM4526Ujhhgtgfeyxiexzf.data;
            TypedValue typedValueM4526Ujhhgtgfeyxiexzf2 = C3052Ujhhgtgfeyxiexzf.m4526Ujhhgtgfeyxiexzf(context2, android.R.attr.colorBackground, C1759feyxiexzfUjhhgtg.class.getCanonicalName());
            int i3 = typedValueM4526Ujhhgtgfeyxiexzf2.resourceId;
            c1759feyxiexzfUjhhgtg2.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(typedArrayM2740Ujhhgtgfeyxiexzf.getColor(7, AbstractC2857Ujhhgtgfeyxiexzf.m4260Ujhhgtgfeyxiexzf(AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(color, Opcodes.IFEQ), AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(i3 != 0 ? context2.getColor(i3) : typedValueM4526Ujhhgtgfeyxiexzf2.data, 229)))));
            TypedValue typedValueM4526Ujhhgtgfeyxiexzf3 = C3052Ujhhgtgfeyxiexzf.m4526Ujhhgtgfeyxiexzf(context2, R.attr.colorSurface, C1759feyxiexzfUjhhgtg.class.getCanonicalName());
            int i4 = typedValueM4526Ujhhgtgfeyxiexzf3.resourceId;
            c1759feyxiexzfUjhhgtg2.m1373Ujhhgtgfeyxiexzf(ColorStateList.valueOf(i4 != 0 ? context2.getColor(i4) : typedValueM4526Ujhhgtgfeyxiexzf3.data));
            c1759feyxiexzfUjhhgtg2.f5908feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(2, 0);
            c1759feyxiexzfUjhhgtg2.f5909feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(4, 0);
            c1759feyxiexzfUjhhgtg2.f5910feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(5, 0);
            c1759feyxiexzfUjhhgtg2.f5911feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(3, 0);
            typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
            arrayList2.add(c1759feyxiexzfUjhhgtg2);
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (isAttachedToWindow() && (viewGroupM3280Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this)) != null) {
                int[] iArr = new int[2];
                viewGroupM3280Ujhhgtgfeyxiexzf.getLocationOnScreen(iArr);
                c1759feyxiexzfUjhhgtg2.f5914feyxiexzfUjhhgtg = iArr[0];
                viewGroupM3280Ujhhgtgfeyxiexzf.getWindowVisibleDisplayFrame(c1759feyxiexzfUjhhgtg2.f5907feyxiexzfUjhhgtg);
                viewGroupM3280Ujhhgtgfeyxiexzf.addOnLayoutChangeListener(c1759feyxiexzfUjhhgtg2.f5906feyxiexzfUjhhgtg);
            }
        }
        int i5 = arrayList2.size() == 1 ? 0 : 1;
        for (C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg3 : arrayList2) {
            c1759feyxiexzfUjhhgtg3.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = i5;
            c1759feyxiexzfUjhhgtg3.invalidateSelf();
        }
        Iterator it = this.f8039Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Iterator it2 = this.f8071feyxiexzfUjhhgtg.iterator();
            if (it2.hasNext()) {
                ((Float) it2.next()).getClass();
                throw null;
            }
        }
        postInvalidate();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean m3750Ujhhgtgfeyxiexzf(int i, float f) {
        this.f8073Ujhhgtgfeyxiexzf = i;
        if (Math.abs(f - ((Float) this.f8071feyxiexzfUjhhgtg.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f8094feyxiexzfUjhhgtg == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.f8056feyxiexzfUjhhgtg) / this.f8079feyxiexzfUjhhgtg;
                float f3 = this.f8069feyxiexzfUjhhgtg;
                minSeparation = ((f3 - this.f8070feyxiexzfUjhhgtg) * f2) + f3;
            }
        }
        if (m3742Ujhhgtgfeyxiexzf()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        float fFloatValue = i2 >= this.f8071feyxiexzfUjhhgtg.size() ? this.f8070feyxiexzfUjhhgtg : ((Float) this.f8071feyxiexzfUjhhgtg.get(i2)).floatValue() - minSeparation;
        int i3 = i - 1;
        float fFloatValue2 = i3 < 0 ? this.f8069feyxiexzfUjhhgtg : minSeparation + ((Float) this.f8071feyxiexzfUjhhgtg.get(i3)).floatValue();
        if (f < fFloatValue2) {
            f = fFloatValue2;
        } else if (f > fFloatValue) {
            f = fFloatValue;
        }
        this.f8071feyxiexzfUjhhgtg.set(i, Float.valueOf(f));
        Iterator it = this.f8039Ujhhgtgfeyxiexzf.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            ((Float) this.f8071feyxiexzfUjhhgtg.get(i)).getClass();
            throw null;
        }
        AccessibilityManager accessibilityManager = this.f8035Ujhhgtgfeyxiexzf;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f8036Ujhhgtgfeyxiexzf;
            if (runnable == null) {
                this.f8036Ujhhgtgfeyxiexzf = new RunnableC2474feyxiexzfUjhhgtg(this);
            } else {
                removeCallbacks(runnable);
            }
            RunnableC2474feyxiexzfUjhhgtg runnableC2474feyxiexzfUjhhgtg = this.f8036Ujhhgtgfeyxiexzf;
            runnableC2474feyxiexzfUjhhgtg.f8025Ujhhgtgfeyxiexzf = i;
            postDelayed(runnableC2474feyxiexzfUjhhgtg, 200L);
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m3751Ujhhgtgfeyxiexzf() {
        double dRound;
        float f = this.f8093feyxiexzfUjhhgtg;
        float f2 = this.f8074Ujhhgtgfeyxiexzf;
        if (f2 > 0.0f) {
            int i = (int) ((this.f8070feyxiexzfUjhhgtg - this.f8069feyxiexzfUjhhgtg) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (m3742Ujhhgtgfeyxiexzf()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f8070feyxiexzfUjhhgtg;
        float f4 = this.f8069feyxiexzfUjhhgtg;
        m3750Ujhhgtgfeyxiexzf(this.f8072feyxiexzfUjhhgtg, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3752Ujhhgtgfeyxiexzf(int i, Rect rect) {
        int iM3746Ujhhgtgfeyxiexzf = this.f8056feyxiexzfUjhhgtg + ((int) (m3746Ujhhgtgfeyxiexzf(getValues().get(i).floatValue()) * this.f8079feyxiexzfUjhhgtg));
        int iM3733Ujhhgtgfeyxiexzf = m3733Ujhhgtgfeyxiexzf();
        int iMax = Math.max(this.f8057feyxiexzfUjhhgtg / 2, this.f8051feyxiexzfUjhhgtg / 2);
        int iMax2 = Math.max(this.f8058feyxiexzfUjhhgtg / 2, this.f8051feyxiexzfUjhhgtg / 2);
        rect.set(iM3746Ujhhgtgfeyxiexzf - iMax, iM3733Ujhhgtgfeyxiexzf - iMax2, iM3746Ujhhgtgfeyxiexzf + iMax, iM3733Ujhhgtgfeyxiexzf + iMax2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3753Ujhhgtgfeyxiexzf() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iM3746Ujhhgtgfeyxiexzf = (int) ((m3746Ujhhgtgfeyxiexzf(((Float) this.f8071feyxiexzfUjhhgtg.get(this.f8073Ujhhgtgfeyxiexzf)).floatValue()) * this.f8079feyxiexzfUjhhgtg) + this.f8056feyxiexzfUjhhgtg);
            int iM3733Ujhhgtgfeyxiexzf = m3733Ujhhgtgfeyxiexzf();
            int i = this.f8059feyxiexzfUjhhgtg;
            background.setHotspotBounds(iM3746Ujhhgtgfeyxiexzf - i, iM3733Ujhhgtgfeyxiexzf - i, iM3746Ujhhgtgfeyxiexzf + i, iM3733Ujhhgtgfeyxiexzf + i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m3754Ujhhgtgfeyxiexzf() {
        int i = this.f8054feyxiexzfUjhhgtg;
        if (i == 0 || i == 1) {
            if (this.f8072feyxiexzfUjhhgtg == -1 || !isEnabled()) {
                m3737Ujhhgtgfeyxiexzf();
                return;
            } else {
                m3736Ujhhgtgfeyxiexzf();
                return;
            }
        }
        if (i == 2) {
            m3737Ujhhgtgfeyxiexzf();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f8054feyxiexzfUjhhgtg);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            AbstractC1937feyxiexzfUjhhgtg.m3280Ujhhgtgfeyxiexzf(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                m3736Ujhhgtgfeyxiexzf();
                return;
            }
        }
        m3737Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3755Ujhhgtgfeyxiexzf(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = this.f8055feyxiexzfUjhhgtg / 2.0f;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        if (iM2713feyxiexzfUjhhgtg == 1) {
            f = this.f8064feyxiexzfUjhhgtg;
        } else if (iM2713feyxiexzfUjhhgtg != 2) {
            if (iM2713feyxiexzfUjhhgtg == 3) {
                f2 = this.f8064feyxiexzfUjhhgtg;
            }
            f = f2;
        } else {
            f = f2;
            f2 = this.f8064feyxiexzfUjhhgtg;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.f8087feyxiexzfUjhhgtg;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(f2, f);
        float fMax = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iM2713feyxiexzfUjhhgtg2 = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        RectF rectF2 = this.f8089Ujhhgtgfeyxiexzf;
        if (iM2713feyxiexzfUjhhgtg2 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
        } else if (iM2713feyxiexzfUjhhgtg2 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3756feyxiexzfUjhhgtg() {
        boolean z;
        int iMax = Math.max(this.f8052feyxiexzfUjhhgtg, Math.max(this.f8055feyxiexzfUjhhgtg + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.f8058feyxiexzfUjhhgtg));
        boolean z2 = true;
        if (iMax == this.f8053feyxiexzfUjhhgtg) {
            z = false;
        } else {
            this.f8053feyxiexzfUjhhgtg = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f8057feyxiexzfUjhhgtg / 2) - this.f8046Ujhhgtgfeyxiexzf, 0), Math.max((this.f8055feyxiexzfUjhhgtg - this.f8047Ujhhgtgfeyxiexzf) / 2, 0)), Math.max(Math.max(this.f8077Ujhhgtgfeyxiexzf - this.f8048Ujhhgtgfeyxiexzf, 0), Math.max(this.f8078Ujhhgtgfeyxiexzf - this.f8049feyxiexzfUjhhgtg, 0))) + this.f8045Ujhhgtgfeyxiexzf;
        if (this.f8056feyxiexzfUjhhgtg == iMax2) {
            z2 = false;
        } else {
            this.f8056feyxiexzfUjhhgtg = iMax2;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (isLaidOut()) {
                this.f8079feyxiexzfUjhhgtg = Math.max(getWidth() - (this.f8056feyxiexzfUjhhgtg * 2), 0);
                m3743Ujhhgtgfeyxiexzf();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3757feyxiexzfUjhhgtg() {
        if (this.f8081feyxiexzfUjhhgtg) {
            float f = this.f8069feyxiexzfUjhhgtg;
            float f2 = this.f8070feyxiexzfUjhhgtg;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.f8069feyxiexzfUjhhgtg + ") must be smaller than valueTo(" + this.f8070feyxiexzfUjhhgtg + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.f8070feyxiexzfUjhhgtg + ") must be greater than valueFrom(" + this.f8069feyxiexzfUjhhgtg + ")");
            }
            if (this.f8074Ujhhgtgfeyxiexzf > 0.0f && !m3758feyxiexzfUjhhgtg(f2)) {
                throw new IllegalStateException("The stepSize(" + this.f8074Ujhhgtgfeyxiexzf + ") must be 0, or a factor of the valueFrom(" + this.f8069feyxiexzfUjhhgtg + ")-valueTo(" + this.f8070feyxiexzfUjhhgtg + ") range");
            }
            for (Float f3 : this.f8071feyxiexzfUjhhgtg) {
                if (f3.floatValue() < this.f8069feyxiexzfUjhhgtg || f3.floatValue() > this.f8070feyxiexzfUjhhgtg) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.f8069feyxiexzfUjhhgtg + "), and lower or equal to valueTo(" + this.f8070feyxiexzfUjhhgtg + ")");
                }
                if (this.f8074Ujhhgtgfeyxiexzf > 0.0f && !m3758feyxiexzfUjhhgtg(f3.floatValue())) {
                    float f4 = this.f8069feyxiexzfUjhhgtg;
                    float f5 = this.f8074Ujhhgtgfeyxiexzf;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.f8074Ujhhgtgfeyxiexzf;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.f8094feyxiexzfUjhhgtg != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f8074Ujhhgtgfeyxiexzf + ")");
                }
                if (minSeparation < f6 || !m3740Ujhhgtgfeyxiexzf(minSeparation)) {
                    float f7 = this.f8074Ujhhgtgfeyxiexzf;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float f8 = this.f8074Ujhhgtgfeyxiexzf;
            if (f8 != 0.0f) {
                if (((int) f8) != f8) {
                    Log.w("上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ要点脸", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f9 = this.f8069feyxiexzfUjhhgtg;
                if (((int) f9) != f9) {
                    Log.w("上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ要点脸", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.f8070feyxiexzfUjhhgtg;
                if (((int) f10) != f10) {
                    Log.w("上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ要点脸", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f8081feyxiexzfUjhhgtg = false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean m3758feyxiexzfUjhhgtg(float f) {
        return m3740Ujhhgtgfeyxiexzf(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f8069feyxiexzfUjhhgtg)), MathContext.DECIMAL64).doubleValue());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float m3759feyxiexzfUjhhgtg(float f) {
        return (m3746Ujhhgtgfeyxiexzf(f) * this.f8079feyxiexzfUjhhgtg) + this.f8056feyxiexzfUjhhgtg;
    }

    public void setValues(List<Float> list) {
        m3749Ujhhgtgfeyxiexzf(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f8091Ujhhgtgfeyxiexzf = null;
        this.f8092Ujhhgtgfeyxiexzf = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f8092Ujhhgtgfeyxiexzf;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            m3732Ujhhgtgfeyxiexzf(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
