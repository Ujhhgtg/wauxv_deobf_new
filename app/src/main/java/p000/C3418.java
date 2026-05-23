package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3418 implements InterfaceC0975 {

    public Toolbar f10763;

    public int f10764;

    public View f10765;

    public Drawable f10766;

    public Drawable f10767;

    public Drawable f10768;

    public boolean f10769;

    public CharSequence f10770;

    public CharSequence f10771;

    public CharSequence f10772;

    public Window.Callback f10773;

    public int f10774;

    public Drawable f10775;

    public final void m4932(int i) {
        View view;
        Toolbar toolbar = this.f10763;
        int i2 = this.f10764 ^ i;
        this.f10764 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m4933();
                }
                if ((this.f10764 & 4) != 0) {
                    Drawable drawable = this.f10768;
                    if (drawable == null) {
                        drawable = this.f10775;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m4934();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f10770);
                    toolbar.setSubtitle(this.f10771);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f10765) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void m4933() {
        Toolbar toolbar = this.f10763;
        if ((this.f10764 & 4) != 0) {
            if (TextUtils.isEmpty(this.f10772)) {
                toolbar.setNavigationContentDescription(this.f10774);
            } else {
                toolbar.setNavigationContentDescription(this.f10772);
            }
        }
    }

    public final void m4934() {
        Drawable drawable;
        int i = this.f10764;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f10767) == null) {
            drawable = this.f10766;
        }
        this.f10763.setLogo(drawable);
    }
}
