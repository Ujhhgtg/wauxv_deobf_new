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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2808 extends AbstractC1947 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    public final Context f8979;

    public final MenuC1944 f8980;

    public final C1941 f8981;

    public final boolean f8982;

    public final int f8983;

    public final int f8984;

    public final C1953 f8985;

    public PopupWindow.OnDismissListener f8988;

    public View f8989;

    public View f8990;

    public InterfaceC1954 f8991;

    public ViewTreeObserver f8992;

    public boolean f8993;

    public boolean f8994;

    public int f8995;

    public boolean f8997;

    public final ViewTreeObserverOnGlobalLayoutListenerC0568 f8986 = new ViewTreeObserverOnGlobalLayoutListenerC0568(this, 1);

    public final ViewOnAttachStateChangeListenerC0569 f8987 = new ViewOnAttachStateChangeListenerC0569(2, this);

    public int f8996 = 0;

    public ViewOnKeyListenerC2808(Context context, MenuC1944 menuC1944, View view, int i, boolean z) {
        this.f8979 = context;
        this.f8980 = menuC1944;
        this.f8982 = z;
        this.f8981 = new C1941(menuC1944, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f8984 = i;
        Resources resources = context.getResources();
        this.f8983 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8989 = view;
        this.f8985 = new C1953(context, i);
        menuC1944.m3755(this, context);
    }

    @Override // p000.InterfaceC2701
    public final void dismiss() {
        if (mo1967()) {
            this.f8985.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8993 = true;
        this.f8980.m3756(true);
        ViewTreeObserver viewTreeObserver = this.f8992;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8992 = this.f8990.getViewTreeObserver();
            }
            this.f8992.removeGlobalOnLayoutListener(this.f8986);
            this.f8992 = null;
        }
        this.f8990.removeOnAttachStateChangeListener(this.f8987);
        PopupWindow.OnDismissListener onDismissListener = this.f8988;
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

    @Override // p000.InterfaceC1955
    public final void mo1136(MenuC1944 menuC1944, boolean z) {
        if (menuC1944 != this.f8980) {
            return;
        }
        dismiss();
        InterfaceC1954 interfaceC1954 = this.f8991;
        if (interfaceC1954 != null) {
            interfaceC1954.mo1097(menuC1944, z);
        }
    }

    @Override // p000.InterfaceC1955
    public final void mo1137(boolean z) {
        this.f8994 = false;
        C1941 c1941 = this.f8981;
        if (c1941 != null) {
            c1941.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1138(SubMenuC2853 subMenuC2853) {
        boolean z;
        if (subMenuC2853.hasVisibleItems()) {
            C1949 c1949 = new C1949(this.f8979, subMenuC2853, this.f8990, this.f8982, this.f8984, 0);
            InterfaceC1954 interfaceC1954 = this.f8991;
            c1949.f6464 = interfaceC1954;
            AbstractC1947 abstractC1947 = c1949.f6465;
            if (abstractC1947 != null) {
                abstractC1947.mo1144(interfaceC1954);
            }
            int size = subMenuC2853.f6412.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC2853.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c1949.f6463 = z;
            AbstractC1947 abstractC1948 = c1949.f6465;
            if (abstractC1948 != null) {
                abstractC1948.mo1972(z);
            }
            c1949.f6466 = this.f8988;
            this.f8988 = null;
            this.f8980.m3756(false);
            C1953 c1953 = this.f8985;
            int width = c1953.f6065;
            int i2 = !c1953.f6067 ? 0 : c1953.f6066;
            if ((Gravity.getAbsoluteGravity(this.f8996, this.f8989.getLayoutDirection()) & 7) == 5) {
                width += this.f8989.getWidth();
            }
            if (!c1949.m3781()) {
                if (c1949.f6461 != null) {
                    c1949.m3782(width, i2, true, true);
                }
            }
            InterfaceC1954 interfaceC1955 = this.f8991;
            if (interfaceC1955 != null) {
                interfaceC1955.mo1118(subMenuC2853);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1139() {
        return false;
    }

    @Override // p000.InterfaceC2701
    public final boolean mo1967() {
        return !this.f8993 && this.f8985.f6082.isShowing();
    }

    @Override // p000.InterfaceC2701
    public final void mo1968() {
        View view;
        if (mo1967()) {
            return;
        }
        if (this.f8993 || (view = this.f8989) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f8990 = view;
        C1953 c1953 = this.f8985;
        C0223 c0223 = c1953.f6082;
        C0223 c0224 = c1953.f6082;
        c0223.setOnDismissListener(this);
        c1953.f6073 = this;
        c1953.f6081 = true;
        c0224.setFocusable(true);
        View view2 = this.f8990;
        boolean z = this.f8992 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8992 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8986);
        }
        view2.addOnAttachStateChangeListener(this.f8987);
        c1953.f6072 = view2;
        c1953.f6070 = this.f8996;
        boolean z2 = this.f8994;
        Context context = this.f8979;
        C1941 c1941 = this.f8981;
        if (!z2) {
            this.f8995 = AbstractC1947.m3779(c1941, context, this.f8983);
            this.f8994 = true;
        }
        int i = this.f8995;
        Rect rect = c1953.f6079;
        Drawable background = c0224.getBackground();
        if (background != null) {
            background.getPadding(rect);
            c1953.f6064 = rect.left + rect.right + i;
        } else {
            c1953.f6064 = i;
        }
        c0224.setInputMethodMode(2);
        Rect rect2 = this.f6455;
        c1953.f6080 = rect2 != null ? new Rect(rect2) : null;
        c1953.mo1968();
        C1952 c1952 = c1953.f6063;
        c1952.setOnKeyListener(this);
        if (this.f8997) {
            MenuC1944 menuC1944 = this.f8980;
            if (menuC1944.f6418 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1952, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(menuC1944.f6418);
                }
                frameLayout.setEnabled(false);
                c1952.addHeaderView(frameLayout, null, false);
            }
        }
        c1953.m3576(c1941);
        c1953.mo1968();
    }

    @Override // p000.InterfaceC1955
    public final void mo1144(InterfaceC1954 interfaceC1954) {
        this.f8991 = interfaceC1954;
    }

    @Override // p000.InterfaceC2701
    public final ListView mo1969() {
        return this.f8985.f6063;
    }

    @Override // p000.InterfaceC1955
    public final Parcelable mo1148() {
        return null;
    }

    @Override // p000.AbstractC1947
    public final void mo1971(View view) {
        this.f8989 = view;
    }

    @Override // p000.AbstractC1947
    public final void mo1972(boolean z) {
        this.f8981.f6402 = z;
    }

    @Override // p000.AbstractC1947
    public final void mo1973(int i) {
        this.f8996 = i;
    }

    @Override // p000.AbstractC1947
    public final void mo1974(int i) {
        this.f8985.f6065 = i;
    }

    @Override // p000.AbstractC1947
    public final void mo1975(PopupWindow.OnDismissListener onDismissListener) {
        this.f8988 = onDismissListener;
    }

    @Override // p000.AbstractC1947
    public final void mo1976(boolean z) {
        this.f8997 = z;
    }

    @Override // p000.AbstractC1947
    public final void mo1977(int i) {
        C1953 c1953 = this.f8985;
        c1953.f6066 = i;
        c1953.f6067 = true;
    }

    @Override // p000.InterfaceC1955
    public final void mo1143(Parcelable parcelable) {
    }

    @Override // p000.AbstractC1947
    public final void mo1970(MenuC1944 menuC1944) {
    }
}
