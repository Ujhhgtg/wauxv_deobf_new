package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲀᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0230 extends ImageButton {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0154 f1422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0231 f1423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f1424;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3460.m4988(context);
        this.f1424 = false;
        AbstractC2977.m4979(this, getContext());
        C0154 c0154 = new C0154(this);
        this.f1422 = c0154;
        c0154.m1321(attributeSet, i);
        C0231 c0231 = new C0231(this);
        this.f1423 = c0231;
        c0231.m1416(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            c0154.m1300();
        }
        C0231 c0231 = this.f1423;
        if (c0231 != null) {
            c0231.m1404();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            return c0154.m1318();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            return c0154.m1319();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C3461 c3461;
        C0231 c0231 = this.f1423;
        if (c0231 == null || (c3461 = (C3461) c0231.f1427) == null) {
            return null;
        }
        return c3461.f10893;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C3461 c3461;
        C0231 c0231 = this.f1423;
        if (c0231 == null || (c3461 = (C3461) c0231.f1427) == null) {
            return null;
        }
        return c3461.f10894;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f1423.f1426).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            c0154.m1323();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            c0154.m1324(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0231 c0231 = this.f1423;
        if (c0231 != null) {
            c0231.m1404();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0231 c0231 = this.f1423;
        if (c0231 != null && drawable != null && !this.f1424) {
            c0231.f1425 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0231 != null) {
            c0231.m1404();
            if (this.f1424) {
                return;
            }
            ImageView imageView = (ImageView) c0231.f1426;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0231.f1425);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1424 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0231 c0231 = this.f1423;
        ImageView imageView = (ImageView) c0231.f1426;
        if (i != 0) {
            Drawable drawableM3667 = C1787.m3667(imageView.getContext(), i);
            if (drawableM3667 != null) {
                AbstractC1111.m2823(drawableM3667);
            }
            imageView.setImageDrawable(drawableM3667);
        } else {
            imageView.setImageDrawable(null);
        }
        c0231.m1404();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0231 c0231 = this.f1423;
        if (c0231 != null) {
            c0231.m1404();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            c0154.m1332(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0154 c0154 = this.f1422;
        if (c0154 != null) {
            c0154.m1333(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0231 c0231 = this.f1423;
        if (c0231 != null) {
            if (((C3461) c0231.f1427) == null) {
                c0231.f1427 = new C3461();
            }
            C3461 c3461 = (C3461) c0231.f1427;
            c3461.f10893 = colorStateList;
            c3461.f10896 = true;
            c0231.m1404();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0231 c0231 = this.f1423;
        if (c0231 != null) {
            if (((C3461) c0231.f1427) == null) {
                c0231.f1427 = new C3461();
            }
            C3461 c3461 = (C3461) c0231.f1427;
            c3461.f10894 = mode;
            c3461.f10895 = true;
            c0231.m1404();
        }
    }
}
