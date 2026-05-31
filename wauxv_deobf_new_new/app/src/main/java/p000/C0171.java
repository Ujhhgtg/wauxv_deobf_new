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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0171 extends AbstractC3591 implements Animatable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Context f1249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0131 f1250 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public ArrayList f1251 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0168 f1252 = new C0168(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0169 f1248 = new C0169();

    public C0171(Context context, int i) {
        this.f1249 = context;
    }

    @Override // p000.AbstractC3591, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0169 c0169 = this.f1248;
        c0169.f1242.draw(canvas);
        if (c0169.f1243.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getAlpha() : this.f1248.f1242.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1248.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getColorFilter() : this.f1248.f1242.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11215 != null) {
            return new C0170(this.f11215.getConstantState(), 0);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1248.f1242.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1248.f1242.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getOpacity() : this.f1248.f1242.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0169 c0169;
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0169 = this.f1248;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM3402 = AbstractC1471.m3402(resources, theme, attributeSet, AbstractC1272.f4637);
                    int resourceId = typedArrayM3402.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3600 c3600 = new C3600();
                        ThreadLocal threadLocal = AbstractC2638.f8340;
                        c3600.f11215 = resources.getDrawable(resourceId, theme);
                        new C3599(c3600.f11215.getConstantState());
                        c3600.f11275 = false;
                        c3600.setCallback(this.f1252);
                        C3600 c3601 = c0169.f1242;
                        if (c3601 != null) {
                            c3601.setCallback(null);
                        }
                        c0169.f1242 = c3600;
                    }
                    typedArrayM3402.recycle();
                } else if (a.F.equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1272.f4638);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1249;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c0169.f1242.f11271.f11258.f11256.get(string));
                        if (c0169.f1244 == null) {
                            c0169.f1244 = new ArrayList();
                            c0169.f1245 = new C0274(0);
                        }
                        c0169.f1244.add(animatorLoadAnimator);
                        c0169.f1245.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0169.f1243 == null) {
            c0169.f1243 = new AnimatorSet();
        }
        c0169.f1243.playTogether(c0169.f1244);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.isAutoMirrored() : this.f1248.f1242.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f11215;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1248.f1243.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.isStateful() : this.f1248.f1242.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1248.f1242.setBounds(rect);
        }
    }

    @Override // p000.AbstractC3591, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.setLevel(i) : this.f1248.f1242.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.setState(iArr) : this.f1248.f1242.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1248.f1242.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1248.f1242.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1248.f1242.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f1248.f1242.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f1248.f1242.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f1248.f1242.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1248.f1242.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0169 c0169 = this.f1248;
        if (c0169.f1243.isStarted()) {
            return;
        }
        c0169.f1243.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1248.f1243.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
