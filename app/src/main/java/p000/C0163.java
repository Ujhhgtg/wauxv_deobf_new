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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0163 extends AbstractC3533 implements Animatable {

    public final Context f1181;

    public C0123 f1182 = null;

    public ArrayList f1183 = null;

    public final C0160 f1184 = new C0160(this);

    public final C0161 f1180 = new C0161();

    public C0163(Context context, int i) {
        this.f1181 = context;
    }

    @Override // p000.AbstractC3533, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0161 c0161 = this.f1180;
        c0161.f1174.draw(canvas);
        if (c0161.f1175.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getAlpha() : this.f1180.f1174.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getColorFilter() : this.f1180.f1174.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11066 == null) {
            return null;
        }
        return new C0162(0, this.f11066.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1180.f1174.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1180.f1174.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getOpacity() : this.f1180.f1174.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0161 c0161;
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0161 = this.f1180;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM3165 = AbstractC1458.m3165(resources, theme, attributeSet, AbstractC1270.f4638);
                    int resourceId = typedArrayM3165.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3542 c3542 = new C3542();
                        ThreadLocal threadLocal = AbstractC2582.f8187;
                        c3542.f11066 = resources.getDrawable(resourceId, theme);
                        new C3541(c3542.f11066.getConstantState());
                        c3542.f11126 = false;
                        c3542.setCallback(this.f1184);
                        C3542 c3543 = c0161.f1174;
                        if (c3543 != null) {
                            c3543.setCallback(null);
                        }
                        c0161.f1174 = c3542;
                    }
                    typedArrayM3165.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1270.f4639);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1181;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c0161.f1174.f11122.f11109.f11107.get(string));
                        if (c0161.f1176 == null) {
                            c0161.f1176 = new ArrayList();
                            c0161.f1177 = new C0264(0);
                        }
                        c0161.f1176.add(animatorLoadAnimator);
                        c0161.f1177.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0161.f1175 == null) {
            c0161.f1175 = new AnimatorSet();
        }
        c0161.f1175.playTogether(c0161.f1176);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.isAutoMirrored() : this.f1180.f1174.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f11066;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1180.f1175.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.isStateful() : this.f1180.f1174.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1180.f1174.setBounds(rect);
        }
    }

    @Override // p000.AbstractC3533, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.setLevel(i) : this.f1180.f1174.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.setState(iArr) : this.f1180.f1174.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1180.f1174.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1180.f1174.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1180.f1174.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f1180.f1174.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f1180.f1174.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f1180.f1174.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1180.f1174.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0161 c0161 = this.f1180;
        if (c0161.f1175.isStarted()) {
            return;
        }
        c0161.f1175.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1180.f1175.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
