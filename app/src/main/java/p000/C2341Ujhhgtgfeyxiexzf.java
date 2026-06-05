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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2341Ujhhgtgfeyxiexzf extends ImageButton {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f7640Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2344Ujhhgtgfeyxiexzf f7641Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f7642Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2341Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1745Ujhhgtgfeyxiexzf.m3004Ujhhgtgfeyxiexzf(context);
        this.f7642Ujhhgtgfeyxiexzf = false;
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(this);
        this.f7640Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4485feyxiexzfUjhhgtg(attributeSet, i);
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf(this);
        this.f7641Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf;
        c2344Ujhhgtgfeyxiexzf.m3546Ujhhgtgfeyxiexzf(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4464Ujhhgtgfeyxiexzf();
        }
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf != null) {
            c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4482Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4483Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf;
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf == null || (c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf) == null) {
            return null;
        }
        return c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf;
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf == null || (c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf) == null) {
            return null;
        }
        return c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f7641Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4487feyxiexzfUjhhgtg();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4488feyxiexzfUjhhgtg(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf != null) {
            c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf != null && drawable != null && !this.f7642Ujhhgtgfeyxiexzf) {
            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c2344Ujhhgtgfeyxiexzf != null) {
            c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
            if (this.f7642Ujhhgtgfeyxiexzf) {
                return;
            }
            ImageView imageView = (ImageView) c2344Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f7642Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        ImageView imageView = (ImageView) c2344Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf;
        if (i != 0) {
            Drawable drawableM2824Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(imageView.getContext(), i);
            if (drawableM2824Ujhhgtgfeyxiexzf != null) {
                AbstractC3252feyxiexzfUjhhgtg.m4756Ujhhgtgfeyxiexzf(drawableM2824Ujhhgtgfeyxiexzf);
            }
            imageView.setImageDrawable(drawableM2824Ujhhgtgfeyxiexzf);
        } else {
            imageView.setImageDrawable(null);
        }
        c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf != null) {
            c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4496feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7640Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4497feyxiexzfUjhhgtg(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf != null) {
            if (((C1741Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf) == null) {
                c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
            }
            C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = colorStateList;
            c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = true;
            c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = this.f7641Ujhhgtgfeyxiexzf;
        if (c2344Ujhhgtgfeyxiexzf != null) {
            if (((C1741Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf) == null) {
                c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
            }
            C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf = mode;
            c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf = true;
            c2344Ujhhgtgfeyxiexzf.m3536Ujhhgtgfeyxiexzf();
        }
    }
}
