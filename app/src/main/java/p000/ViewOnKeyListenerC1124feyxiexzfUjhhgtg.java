package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1124feyxiexzfUjhhgtg extends AbstractC0365Ujhhgtgfeyxiexzf implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Context f4236Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final MenuC0355Ujhhgtgfeyxiexzf f4237Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0359Ujhhgtgfeyxiexzf f4238Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean f4239Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f4240Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f4241Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0371Ujhhgtgfeyxiexzf f4242Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f4245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public View f4246Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public View f4247Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public InterfaceC0372Ujhhgtgfeyxiexzf f4248Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public ViewTreeObserver f4249Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f4250Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f4251Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f4252Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f4254Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2783feyxiexzfUjhhgtg f4243Ujhhgtgfeyxiexzf = new ViewTreeObserverOnGlobalLayoutListenerC2783feyxiexzfUjhhgtg(this, 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg f4244Ujhhgtgfeyxiexzf = new ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg(3, this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f4253Ujhhgtgfeyxiexzf = 0;

    public ViewOnKeyListenerC1124feyxiexzfUjhhgtg(Context context, MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, View view, int i, boolean z) {
        this.f4236Ujhhgtgfeyxiexzf = context;
        this.f4237Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
        this.f4239Ujhhgtgfeyxiexzf = z;
        this.f4238Ujhhgtgfeyxiexzf = new C0359Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f4241Ujhhgtgfeyxiexzf = i;
        Resources resources = context.getResources();
        this.f4240Ujhhgtgfeyxiexzf = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4246Ujhhgtgfeyxiexzf = view;
        this.f4242Ujhhgtgfeyxiexzf = new C0371Ujhhgtgfeyxiexzf(context, i);
        menuC0355Ujhhgtgfeyxiexzf.m1543Ujhhgtgfeyxiexzf(this, context);
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    public final void dismiss() {
        if (mo1415Ujhhgtgfeyxiexzf()) {
            this.f4242Ujhhgtgfeyxiexzf.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4250Ujhhgtgfeyxiexzf = true;
        this.f4237Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(true);
        ViewTreeObserver viewTreeObserver = this.f4249Ujhhgtgfeyxiexzf;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4249Ujhhgtgfeyxiexzf = this.f4247Ujhhgtgfeyxiexzf.getViewTreeObserver();
            }
            this.f4249Ujhhgtgfeyxiexzf.removeGlobalOnLayoutListener(this.f4243Ujhhgtgfeyxiexzf);
            this.f4249Ujhhgtgfeyxiexzf = null;
        }
        this.f4247Ujhhgtgfeyxiexzf.removeOnAttachStateChangeListener(this.f4244Ujhhgtgfeyxiexzf);
        PopupWindow.OnDismissListener onDismissListener = this.f4245Ujhhgtgfeyxiexzf;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1592Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, boolean z) {
        if (menuC0355Ujhhgtgfeyxiexzf != this.f4237Ujhhgtgfeyxiexzf) {
            return;
        }
        dismiss();
        InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf = this.f4248Ujhhgtgfeyxiexzf;
        if (interfaceC0372Ujhhgtgfeyxiexzf != null) {
            interfaceC0372Ujhhgtgfeyxiexzf.mo1599Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, z);
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1593Ujhhgtgfeyxiexzf(boolean z) {
        this.f4251Ujhhgtgfeyxiexzf = false;
        C0359Ujhhgtgfeyxiexzf c0359Ujhhgtgfeyxiexzf = this.f4238Ujhhgtgfeyxiexzf;
        if (c0359Ujhhgtgfeyxiexzf != null) {
            c0359Ujhhgtgfeyxiexzf.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo1594Ujhhgtgfeyxiexzf(SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg) {
        boolean z;
        if (subMenuC1191feyxiexzfUjhhgtg.hasVisibleItems()) {
            C0362Ujhhgtgfeyxiexzf c0362Ujhhgtgfeyxiexzf = new C0362Ujhhgtgfeyxiexzf(this.f4236Ujhhgtgfeyxiexzf, subMenuC1191feyxiexzfUjhhgtg, this.f4247Ujhhgtgfeyxiexzf, this.f4239Ujhhgtgfeyxiexzf, this.f4241Ujhhgtgfeyxiexzf, 0);
            InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf = this.f4248Ujhhgtgfeyxiexzf;
            c0362Ujhhgtgfeyxiexzf.f2065Ujhhgtgfeyxiexzf = interfaceC0372Ujhhgtgfeyxiexzf;
            AbstractC0365Ujhhgtgfeyxiexzf abstractC0365Ujhhgtgfeyxiexzf = c0362Ujhhgtgfeyxiexzf.f2066Ujhhgtgfeyxiexzf;
            if (abstractC0365Ujhhgtgfeyxiexzf != null) {
                abstractC0365Ujhhgtgfeyxiexzf.mo1597Ujhhgtgfeyxiexzf(interfaceC0372Ujhhgtgfeyxiexzf);
            }
            int size = subMenuC1191feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC1191feyxiexzfUjhhgtg.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c0362Ujhhgtgfeyxiexzf.f2064Ujhhgtgfeyxiexzf = z;
            AbstractC0365Ujhhgtgfeyxiexzf abstractC0365Ujhhgtgfeyxiexzf2 = c0362Ujhhgtgfeyxiexzf.f2066Ujhhgtgfeyxiexzf;
            if (abstractC0365Ujhhgtgfeyxiexzf2 != null) {
                abstractC0365Ujhhgtgfeyxiexzf2.mo1586Ujhhgtgfeyxiexzf(z);
            }
            c0362Ujhhgtgfeyxiexzf.f2067Ujhhgtgfeyxiexzf = this.f4245Ujhhgtgfeyxiexzf;
            this.f4245Ujhhgtgfeyxiexzf = null;
            this.f4237Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(false);
            C0371Ujhhgtgfeyxiexzf c0371Ujhhgtgfeyxiexzf = this.f4242Ujhhgtgfeyxiexzf;
            int width = c0371Ujhhgtgfeyxiexzf.f1591Ujhhgtgfeyxiexzf;
            int i2 = !c0371Ujhhgtgfeyxiexzf.f1593Ujhhgtgfeyxiexzf ? 0 : c0371Ujhhgtgfeyxiexzf.f1592Ujhhgtgfeyxiexzf;
            if ((Gravity.getAbsoluteGravity(this.f4253Ujhhgtgfeyxiexzf, this.f4246Ujhhgtgfeyxiexzf.getLayoutDirection()) & 7) == 5) {
                width += this.f4246Ujhhgtgfeyxiexzf.getWidth();
            }
            if (!c0362Ujhhgtgfeyxiexzf.m1576Ujhhgtgfeyxiexzf()) {
                if (c0362Ujhhgtgfeyxiexzf.f2062Ujhhgtgfeyxiexzf != null) {
                    c0362Ujhhgtgfeyxiexzf.m1578Ujhhgtgfeyxiexzf(width, i2, true, true);
                }
            }
            InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf2 = this.f4248Ujhhgtgfeyxiexzf;
            if (interfaceC0372Ujhhgtgfeyxiexzf2 != null) {
                interfaceC0372Ujhhgtgfeyxiexzf2.mo1600Ujhhgtgfeyxiexzf(subMenuC1191feyxiexzfUjhhgtg);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final boolean mo1595Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final boolean mo1415Ujhhgtgfeyxiexzf() {
        return !this.f4250Ujhhgtgfeyxiexzf && this.f4242Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.isShowing();
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1416Ujhhgtgfeyxiexzf() {
        View view;
        if (mo1415Ujhhgtgfeyxiexzf()) {
            return;
        }
        if (this.f4250Ujhhgtgfeyxiexzf || (view = this.f4246Ujhhgtgfeyxiexzf) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4247Ujhhgtgfeyxiexzf = view;
        C0371Ujhhgtgfeyxiexzf c0371Ujhhgtgfeyxiexzf = this.f4242Ujhhgtgfeyxiexzf;
        C2351Ujhhgtgfeyxiexzf c2351Ujhhgtgfeyxiexzf = c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
        C2351Ujhhgtgfeyxiexzf c2351Ujhhgtgfeyxiexzf2 = c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
        c2351Ujhhgtgfeyxiexzf.setOnDismissListener(this);
        c0371Ujhhgtgfeyxiexzf.f1599Ujhhgtgfeyxiexzf = this;
        c0371Ujhhgtgfeyxiexzf.f1607Ujhhgtgfeyxiexzf = true;
        c2351Ujhhgtgfeyxiexzf2.setFocusable(true);
        View view2 = this.f4247Ujhhgtgfeyxiexzf;
        boolean z = this.f4249Ujhhgtgfeyxiexzf == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4249Ujhhgtgfeyxiexzf = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4243Ujhhgtgfeyxiexzf);
        }
        view2.addOnAttachStateChangeListener(this.f4244Ujhhgtgfeyxiexzf);
        c0371Ujhhgtgfeyxiexzf.f1598Ujhhgtgfeyxiexzf = view2;
        c0371Ujhhgtgfeyxiexzf.f1596Ujhhgtgfeyxiexzf = this.f4253Ujhhgtgfeyxiexzf;
        boolean z2 = this.f4251Ujhhgtgfeyxiexzf;
        Context context = this.f4236Ujhhgtgfeyxiexzf;
        C0359Ujhhgtgfeyxiexzf c0359Ujhhgtgfeyxiexzf = this.f4238Ujhhgtgfeyxiexzf;
        if (!z2) {
            this.f4252Ujhhgtgfeyxiexzf = AbstractC0365Ujhhgtgfeyxiexzf.m1580Ujhhgtgfeyxiexzf(c0359Ujhhgtgfeyxiexzf, context, this.f4240Ujhhgtgfeyxiexzf);
            this.f4251Ujhhgtgfeyxiexzf = true;
        }
        int i = this.f4252Ujhhgtgfeyxiexzf;
        Rect rect = c0371Ujhhgtgfeyxiexzf.f1605Ujhhgtgfeyxiexzf;
        Drawable background = c2351Ujhhgtgfeyxiexzf2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            c0371Ujhhgtgfeyxiexzf.f1590Ujhhgtgfeyxiexzf = rect.left + rect.right + i;
        } else {
            c0371Ujhhgtgfeyxiexzf.f1590Ujhhgtgfeyxiexzf = i;
        }
        c2351Ujhhgtgfeyxiexzf2.setInputMethodMode(2);
        Rect rect2 = this.f2073Ujhhgtgfeyxiexzf;
        c0371Ujhhgtgfeyxiexzf.f1606Ujhhgtgfeyxiexzf = rect2 != null ? new Rect(rect2) : null;
        c0371Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
        C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf = c0371Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
        c0363Ujhhgtgfeyxiexzf.setOnKeyListener(this);
        if (this.f4254Ujhhgtgfeyxiexzf) {
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f4237Ujhhgtgfeyxiexzf;
            if (menuC0355Ujhhgtgfeyxiexzf.f2015Ujhhgtgfeyxiexzf != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0363Ujhhgtgfeyxiexzf, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0355Ujhhgtgfeyxiexzf.f2015Ujhhgtgfeyxiexzf);
                }
                frameLayout.setEnabled(false);
                c0363Ujhhgtgfeyxiexzf.addHeaderView(frameLayout, null, false);
            }
        }
        c0371Ujhhgtgfeyxiexzf.m1414Ujhhgtgfeyxiexzf(c0359Ujhhgtgfeyxiexzf);
        c0371Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo1597Ujhhgtgfeyxiexzf(InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf) {
        this.f4248Ujhhgtgfeyxiexzf = interfaceC0372Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final ListView mo1417Ujhhgtgfeyxiexzf() {
        return this.f4242Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final Parcelable mo1598Ujhhgtgfeyxiexzf() {
        return null;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final void mo1585Ujhhgtgfeyxiexzf(View view) {
        this.f4246Ujhhgtgfeyxiexzf = view;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo1586Ujhhgtgfeyxiexzf(boolean z) {
        this.f4238Ujhhgtgfeyxiexzf.f2054Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo1587Ujhhgtgfeyxiexzf(int i) {
        this.f4253Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1588Ujhhgtgfeyxiexzf(int i) {
        this.f4242Ujhhgtgfeyxiexzf.f1591Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public final void mo1589Ujhhgtgfeyxiexzf(PopupWindow.OnDismissListener onDismissListener) {
        this.f4245Ujhhgtgfeyxiexzf = onDismissListener;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public final void mo1590Ujhhgtgfeyxiexzf(boolean z) {
        this.f4254Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public final void mo1591Ujhhgtgfeyxiexzf(int i) {
        C0371Ujhhgtgfeyxiexzf c0371Ujhhgtgfeyxiexzf = this.f4242Ujhhgtgfeyxiexzf;
        c0371Ujhhgtgfeyxiexzf.f1592Ujhhgtgfeyxiexzf = i;
        c0371Ujhhgtgfeyxiexzf.f1593Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo1596Ujhhgtgfeyxiexzf(Parcelable parcelable) {
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final void mo1584Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
    }
}
