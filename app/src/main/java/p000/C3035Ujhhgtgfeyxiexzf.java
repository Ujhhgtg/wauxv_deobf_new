package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.umeng.ccg.a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3035Ujhhgtgfeyxiexzf extends AbstractC1852Ujhhgtgfeyxiexzf implements Animatable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Context f9408Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2994Ujhhgtgfeyxiexzf f9409Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public ArrayList f9410Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C3032Ujhhgtgfeyxiexzf f9411Ujhhgtgfeyxiexzf = new C3032Ujhhgtgfeyxiexzf(this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3033feyxiexzfUjhhgtg f9407Ujhhgtgfeyxiexzf = new C3033feyxiexzfUjhhgtg();

    public C3035Ujhhgtgfeyxiexzf(Context context, int i) {
        this.f9408Ujhhgtgfeyxiexzf = context;
    }

    @Override // p000.AbstractC1852Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C3033feyxiexzfUjhhgtg c3033feyxiexzfUjhhgtg = this.f9407Ujhhgtgfeyxiexzf;
        c3033feyxiexzfUjhhgtg.f9401Ujhhgtgfeyxiexzf.draw(canvas);
        if (c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getAlpha() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f9407Ujhhgtgfeyxiexzf.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getColorFilter() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f6219Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        return new C3034feyxiexzfUjhhgtg(0, this.f6219Ujhhgtgfeyxiexzf.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getOpacity() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3033feyxiexzfUjhhgtg c3033feyxiexzfUjhhgtg;
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c3033feyxiexzfUjhhgtg = this.f9407Ujhhgtgfeyxiexzf;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM4521Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSet, AbstractC3516feyxiexzfUjhhgtg.f10966Ujhhgtgfeyxiexzf);
                    int resourceId = typedArrayM4521Ujhhgtgfeyxiexzf.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1888feyxiexzfUjhhgtg c1888feyxiexzfUjhhgtg = new C1888feyxiexzfUjhhgtg();
                        ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
                        c1888feyxiexzfUjhhgtg.f6219Ujhhgtgfeyxiexzf = resources.getDrawable(resourceId, theme);
                        new C1880feyxiexzfUjhhgtg(c1888feyxiexzfUjhhgtg.f6219Ujhhgtgfeyxiexzf.getConstantState());
                        c1888feyxiexzfUjhhgtg.f6326Ujhhgtgfeyxiexzf = false;
                        c1888feyxiexzfUjhhgtg.setCallback(this.f9411Ujhhgtgfeyxiexzf);
                        C1888feyxiexzfUjhhgtg c1888feyxiexzfUjhhgtg2 = c3033feyxiexzfUjhhgtg.f9401Ujhhgtgfeyxiexzf;
                        if (c1888feyxiexzfUjhhgtg2 != null) {
                            c1888feyxiexzfUjhhgtg2.setCallback(null);
                        }
                        c3033feyxiexzfUjhhgtg.f9401Ujhhgtgfeyxiexzf = c1888feyxiexzfUjhhgtg;
                    }
                    typedArrayM4521Ujhhgtgfeyxiexzf.recycle();
                } else if (a.F.equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC3516feyxiexzfUjhhgtg.f10967Ujhhgtgfeyxiexzf);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f9408Ujhhgtgfeyxiexzf;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c3033feyxiexzfUjhhgtg.f9401Ujhhgtgfeyxiexzf.f6322Ujhhgtgfeyxiexzf.f6282Ujhhgtgfeyxiexzf.f6276Ujhhgtgfeyxiexzf.get(string));
                        if (c3033feyxiexzfUjhhgtg.f9403Ujhhgtgfeyxiexzf == null) {
                            c3033feyxiexzfUjhhgtg.f9403Ujhhgtgfeyxiexzf = new ArrayList();
                            c3033feyxiexzfUjhhgtg.f9404Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
                        }
                        c3033feyxiexzfUjhhgtg.f9403Ujhhgtgfeyxiexzf.add(animatorLoadAnimator);
                        c3033feyxiexzfUjhhgtg.f9404Ujhhgtgfeyxiexzf.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf == null) {
            c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf = new AnimatorSet();
        }
        c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf.playTogether(c3033feyxiexzfUjhhgtg.f9403Ujhhgtgfeyxiexzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.isAutoMirrored() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f9407Ujhhgtgfeyxiexzf.f9402Ujhhgtgfeyxiexzf.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.isStateful() : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setBounds(rect);
        }
    }

    @Override // p000.AbstractC1852Ujhhgtgfeyxiexzf, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.setLevel(i) : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.setState(iArr) : this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f9407Ujhhgtgfeyxiexzf.f9401Ujhhgtgfeyxiexzf.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C3033feyxiexzfUjhhgtg c3033feyxiexzfUjhhgtg = this.f9407Ujhhgtgfeyxiexzf;
        if (c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf.isStarted()) {
            return;
        }
        c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f9407Ujhhgtgfeyxiexzf.f9402Ujhhgtgfeyxiexzf.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
