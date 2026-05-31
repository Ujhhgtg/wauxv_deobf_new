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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2867 extends AbstractC1978 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f9140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final MenuC1975 f9141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1972 f9142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f9143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f9144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f9145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C1984 f9146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f9149;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public View f9150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public View f9151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC1985 f9152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public ViewTreeObserver f9153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f9154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f9155;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f9156;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f9158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0545 f9147 = new ViewTreeObserverOnGlobalLayoutListenerC0545(this, 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0546 f9148 = new ViewOnAttachStateChangeListenerC0546(this, 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f9157 = 0;

    public ViewOnKeyListenerC2867(Context context, MenuC1975 menuC1975, View view, int i, boolean z) {
        this.f9140 = context;
        this.f9141 = menuC1975;
        this.f9143 = z;
        this.f9142 = new C1972(menuC1975, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f9145 = i;
        Resources resources = context.getResources();
        this.f9144 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9150 = view;
        this.f9146 = new C1984(context, i);
        menuC1975.m3949(this, context);
    }

    @Override // p000.InterfaceC2763
    public final void dismiss() {
        if (mo2064()) {
            this.f9146.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9154 = true;
        this.f9141.m3950(true);
        ViewTreeObserver viewTreeObserver = this.f9153;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9153 = this.f9151.getViewTreeObserver();
            }
            this.f9153.removeGlobalOnLayoutListener(this.f9147);
            this.f9153 = null;
        }
        this.f9151.removeOnAttachStateChangeListener(this.f9148);
        PopupWindow.OnDismissListener onDismissListener = this.f9149;
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

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1282(MenuC1975 menuC1975, boolean z) {
        if (menuC1975 != this.f9141) {
            return;
        }
        dismiss();
        InterfaceC1985 interfaceC1985 = this.f9152;
        if (interfaceC1985 != null) {
            interfaceC1985.mo1243(menuC1975, z);
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1283(boolean z) {
        this.f9155 = false;
        C1972 c1972 = this.f9142;
        if (c1972 != null) {
            c1972.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo1284(SubMenuC2913 subMenuC2913) {
        boolean z;
        if (subMenuC2913.hasVisibleItems()) {
            C1980 c1980 = new C1980(this.f9140, subMenuC2913, this.f9151, this.f9143, this.f9145, 0);
            InterfaceC1985 interfaceC1985 = this.f9152;
            c1980.f6569 = interfaceC1985;
            AbstractC1978 abstractC1978 = c1980.f6570;
            if (abstractC1978 != null) {
                abstractC1978.mo1290(interfaceC1985);
            }
            int size = subMenuC2913.f6517.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC2913.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c1980.f6568 = z;
            AbstractC1978 abstractC1979 = c1980.f6570;
            if (abstractC1979 != null) {
                abstractC1979.mo2069(z);
            }
            c1980.f6571 = this.f9149;
            this.f9149 = null;
            this.f9141.m3950(false);
            C1984 c1984 = this.f9146;
            int width = c1984.f6140;
            int i2 = !c1984.f6142 ? 0 : c1984.f6141;
            if ((Gravity.getAbsoluteGravity(this.f9157, this.f9150.getLayoutDirection()) & 7) == 5) {
                width += this.f9150.getWidth();
            }
            if (!c1980.m3975()) {
                if (c1980.f6566 != null) {
                    c1980.m3976(width, i2, true, true);
                }
            }
            InterfaceC1985 interfaceC1986 = this.f9152;
            if (interfaceC1986 != null) {
                interfaceC1986.mo1264(subMenuC2913);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo1285() {
        return false;
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo2064() {
        return !this.f9154 && this.f9146.f6157.isShowing();
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2065() {
        View view;
        if (mo2064()) {
            return;
        }
        if (this.f9154 || (view = this.f9150) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9151 = view;
        C1984 c1984 = this.f9146;
        C0233 c0233 = c1984.f6157;
        C0233 c0234 = c1984.f6157;
        c0233.setOnDismissListener(this);
        c1984.f6148 = this;
        c1984.f6156 = true;
        c0234.setFocusable(true);
        View view2 = this.f9151;
        boolean z = this.f9153 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9153 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9147);
        }
        view2.addOnAttachStateChangeListener(this.f9148);
        c1984.f6147 = view2;
        c1984.f6145 = this.f9157;
        boolean z2 = this.f9155;
        Context context = this.f9140;
        C1972 c1972 = this.f9142;
        if (!z2) {
            this.f9156 = AbstractC1978.m3973(c1972, context, this.f9144);
            this.f9155 = true;
        }
        int i = this.f9156;
        Rect rect = c1984.f6154;
        Drawable background = c0234.getBackground();
        if (background != null) {
            background.getPadding(rect);
            c1984.f6139 = rect.left + rect.right + i;
        } else {
            c1984.f6139 = i;
        }
        c0234.setInputMethodMode(2);
        Rect rect2 = this.f6560;
        c1984.f6155 = rect2 != null ? new Rect(rect2) : null;
        c1984.mo2065();
        C1983 c1983 = c1984.f6138;
        c1983.setOnKeyListener(this);
        if (this.f9158) {
            MenuC1975 menuC1975 = this.f9141;
            if (menuC1975.f6523 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1983, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1975.f6523);
                }
                frameLayout.setEnabled(false);
                c1983.addHeaderView(frameLayout, null, false);
            }
        }
        c1984.m3754(c1972);
        c1984.mo2065();
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1290(InterfaceC1985 interfaceC1985) {
        this.f9152 = interfaceC1985;
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final ListView mo2066() {
        return this.f9146.f6138;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final Parcelable mo1294() {
        return null;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo2068(View view) {
        this.f9150 = view;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo2069(boolean z) {
        this.f9142.f6507 = z;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo2070(int i) {
        this.f9157 = i;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo2071(int i) {
        this.f9146.f6140 = i;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final void mo2072(PopupWindow.OnDismissListener onDismissListener) {
        this.f9149 = onDismissListener;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2073(boolean z) {
        this.f9158 = z;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final void mo2074(int i) {
        C1984 c1984 = this.f9146;
        c1984.f6141 = i;
        c1984.f6142 = true;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1289(Parcelable parcelable) {
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2067(MenuC1975 menuC1975) {
    }
}
