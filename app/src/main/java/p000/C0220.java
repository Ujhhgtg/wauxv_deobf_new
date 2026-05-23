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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᤝᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0220 extends ImageButton {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0146 f1348;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0221 f1349;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f1350;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3401.m4926(context);
        this.f1350 = false;
        AbstractC2918.m4917(this, getContext());
        C0146 c0146 = new C0146(this);
        this.f1348 = c0146;
        c0146.m1175(attributeSet, i);
        C0221 c0221 = new C0221(this);
        this.f1349 = c0221;
        c0221.m1270(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            c0146.m1154();
        }
        C0221 c0221 = this.f1349;
        if (c0221 != null) {
            c0221.m1258();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            return c0146.m1172();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            return c0146.m1173();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C3402 c3402;
        C0221 c0221 = this.f1349;
        if (c0221 == null || (c3402 = (C3402) c0221.f1353) == null) {
            return null;
        }
        return c3402.f10726;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C3402 c3402;
        C0221 c0221 = this.f1349;
        if (c0221 == null || (c3402 = (C3402) c0221.f1353) == null) {
            return null;
        }
        return c3402.f10727;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f1349.f1352).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            c0146.m1177();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            c0146.m1178(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0221 c0221 = this.f1349;
        if (c0221 != null) {
            c0221.m1258();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0221 c0221 = this.f1349;
        if (c0221 != null && drawable != null && !this.f1350) {
            c0221.f1351 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0221 != null) {
            c0221.m1258();
            if (this.f1350) {
                return;
            }
            ImageView imageView = (ImageView) c0221.f1352;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0221.f1351);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1350 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0221 c0221 = this.f1349;
        ImageView imageView = (ImageView) c0221.f1352;
        if (i != 0) {
            Drawable drawableM5076 = AbstractC3471.m5076(imageView.getContext(), i);
            if (drawableM5076 != null) {
                AbstractC1105.m2674(drawableM5076);
            }
            imageView.setImageDrawable(drawableM5076);
        } else {
            imageView.setImageDrawable(null);
        }
        c0221.m1258();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0221 c0221 = this.f1349;
        if (c0221 != null) {
            c0221.m1258();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            c0146.m1186(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0146 c0146 = this.f1348;
        if (c0146 != null) {
            c0146.m1187(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0221 c0221 = this.f1349;
        if (c0221 != null) {
            if (((C3402) c0221.f1353) == null) {
                c0221.f1353 = new C3402();
            }
            C3402 c3402 = (C3402) c0221.f1353;
            c3402.f10726 = colorStateList;
            c3402.f10729 = true;
            c0221.m1258();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0221 c0221 = this.f1349;
        if (c0221 != null) {
            if (((C3402) c0221.f1353) == null) {
                c0221.f1353 = new C3402();
            }
            C3402 c3402 = (C3402) c0221.f1353;
            c3402.f10727 = mode;
            c3402.f10728 = true;
            c0221.m1258();
        }
    }
}
