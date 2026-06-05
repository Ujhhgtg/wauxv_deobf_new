package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2787feyxiexzfUjhhgtg extends AbstractC0365Ujhhgtgfeyxiexzf implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Context f8804Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f8805Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f8806Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean f8807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Handler f8808Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2783feyxiexzfUjhhgtg f8811Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg f8812Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public View f8816Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public View f8817Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8818Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f8819Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public boolean f8820Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f8821Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8822Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f8824Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public InterfaceC0372Ujhhgtgfeyxiexzf f8825feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public ViewTreeObserver f8826feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f8827feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f8828feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final ArrayList f8809Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f8810Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final C2965Ujhhgtgfeyxiexzf f8813Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(5, this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f8814Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f8815Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f8823Ujhhgtgfeyxiexzf = false;

    public ViewOnKeyListenerC2787feyxiexzfUjhhgtg(Context context, View view, int i, boolean z) {
        int i2 = 0;
        this.f8811Ujhhgtgfeyxiexzf = new ViewTreeObserverOnGlobalLayoutListenerC2783feyxiexzfUjhhgtg(this, i2);
        this.f8812Ujhhgtgfeyxiexzf = new ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg(i2, this);
        this.f8804Ujhhgtgfeyxiexzf = context;
        this.f8816Ujhhgtgfeyxiexzf = view;
        this.f8806Ujhhgtgfeyxiexzf = i;
        this.f8807Ujhhgtgfeyxiexzf = z;
        this.f8818Ujhhgtgfeyxiexzf = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f8805Ujhhgtgfeyxiexzf = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8808Ujhhgtgfeyxiexzf = new Handler();
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    public final void dismiss() {
        ArrayList arrayList = this.f8810Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        if (size > 0) {
            C2786Ujhhgtgfeyxiexzf[] c2786UjhhgtgfeyxiexzfArr = (C2786Ujhhgtgfeyxiexzf[]) arrayList.toArray(new C2786Ujhhgtgfeyxiexzf[size]);
            for (int i = size - 1; i >= 0; i--) {
                C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf = c2786UjhhgtgfeyxiexzfArr[i];
                if (c2786Ujhhgtgfeyxiexzf.f8801Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.isShowing()) {
                    c2786Ujhhgtgfeyxiexzf.f8801Ujhhgtgfeyxiexzf.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f8810Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2786Ujhhgtgfeyxiexzf = null;
                break;
            }
            c2786Ujhhgtgfeyxiexzf = (C2786Ujhhgtgfeyxiexzf) arrayList.get(i);
            if (!c2786Ujhhgtgfeyxiexzf.f8801Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c2786Ujhhgtgfeyxiexzf != null) {
            c2786Ujhhgtgfeyxiexzf.f8802Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(false);
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
        ArrayList arrayList = this.f8810Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0355Ujhhgtgfeyxiexzf == ((C2786Ujhhgtgfeyxiexzf) arrayList.get(i)).f8802Ujhhgtgfeyxiexzf) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C2786Ujhhgtgfeyxiexzf) arrayList.get(i2)).f8802Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(false);
        }
        C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf = (C2786Ujhhgtgfeyxiexzf) arrayList.remove(i);
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf2 = c2786Ujhhgtgfeyxiexzf.f8802Ujhhgtgfeyxiexzf;
        C0371Ujhhgtgfeyxiexzf c0371Ujhhgtgfeyxiexzf = c2786Ujhhgtgfeyxiexzf.f8801Ujhhgtgfeyxiexzf;
        C2351Ujhhgtgfeyxiexzf c2351Ujhhgtgfeyxiexzf = c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = menuC0355Ujhhgtgfeyxiexzf2.f2021Ujhhgtgfeyxiexzf;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
            if (interfaceC0368Ujhhgtgfeyxiexzf == null || interfaceC0368Ujhhgtgfeyxiexzf == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f8828feyxiexzfUjhhgtg) {
            AbstractC0361Ujhhgtgfeyxiexzf.m1574Ujhhgtgfeyxiexzf(c2351Ujhhgtgfeyxiexzf, null);
            c2351Ujhhgtgfeyxiexzf.setAnimationStyle(0);
        }
        c0371Ujhhgtgfeyxiexzf.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f8818Ujhhgtgfeyxiexzf = ((C2786Ujhhgtgfeyxiexzf) arrayList.get(size2 - 1)).f8803Ujhhgtgfeyxiexzf;
        } else {
            this.f8818Ujhhgtgfeyxiexzf = this.f8816Ujhhgtgfeyxiexzf.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C2786Ujhhgtgfeyxiexzf) arrayList.get(0)).f8802Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf = this.f8825feyxiexzfUjhhgtg;
        if (interfaceC0372Ujhhgtgfeyxiexzf != null) {
            interfaceC0372Ujhhgtgfeyxiexzf.mo1599Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, true);
        }
        ViewTreeObserver viewTreeObserver = this.f8826feyxiexzfUjhhgtg;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f8826feyxiexzfUjhhgtg.removeGlobalOnLayoutListener(this.f8811Ujhhgtgfeyxiexzf);
            }
            this.f8826feyxiexzfUjhhgtg = null;
        }
        this.f8817Ujhhgtgfeyxiexzf.removeOnAttachStateChangeListener(this.f8812Ujhhgtgfeyxiexzf);
        this.f8827feyxiexzfUjhhgtg.onDismiss();
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1593Ujhhgtgfeyxiexzf(boolean z) {
        Iterator it = this.f8810Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C2786Ujhhgtgfeyxiexzf) it.next()).f8801Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0359Ujhhgtgfeyxiexzf) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo1594Ujhhgtgfeyxiexzf(SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg) {
        for (C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf : this.f8810Ujhhgtgfeyxiexzf) {
            if (subMenuC1191feyxiexzfUjhhgtg == c2786Ujhhgtgfeyxiexzf.f8802Ujhhgtgfeyxiexzf) {
                c2786Ujhhgtgfeyxiexzf.f8801Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf.requestFocus();
                return true;
            }
        }
        if (!subMenuC1191feyxiexzfUjhhgtg.hasVisibleItems()) {
            return false;
        }
        mo1584Ujhhgtgfeyxiexzf(subMenuC1191feyxiexzfUjhhgtg);
        InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf = this.f8825feyxiexzfUjhhgtg;
        if (interfaceC0372Ujhhgtgfeyxiexzf != null) {
            interfaceC0372Ujhhgtgfeyxiexzf.mo1600Ujhhgtgfeyxiexzf(subMenuC1191feyxiexzfUjhhgtg);
        }
        return true;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final boolean mo1595Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final boolean mo1415Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f8810Ujhhgtgfeyxiexzf;
        return arrayList.size() > 0 && ((C2786Ujhhgtgfeyxiexzf) arrayList.get(0)).f8801Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.isShowing();
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1416Ujhhgtgfeyxiexzf() {
        if (mo1415Ujhhgtgfeyxiexzf()) {
            return;
        }
        ArrayList arrayList = this.f8809Ujhhgtgfeyxiexzf;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4068Ujhhgtgfeyxiexzf((MenuC0355Ujhhgtgfeyxiexzf) it.next());
        }
        arrayList.clear();
        View view = this.f8816Ujhhgtgfeyxiexzf;
        this.f8817Ujhhgtgfeyxiexzf = view;
        if (view != null) {
            boolean z = this.f8826feyxiexzfUjhhgtg == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f8826feyxiexzfUjhhgtg = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8811Ujhhgtgfeyxiexzf);
            }
            this.f8817Ujhhgtgfeyxiexzf.addOnAttachStateChangeListener(this.f8812Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo1597Ujhhgtgfeyxiexzf(InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf) {
        this.f8825feyxiexzfUjhhgtg = interfaceC0372Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1040feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final ListView mo1417Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f8810Ujhhgtgfeyxiexzf;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C2786Ujhhgtgfeyxiexzf) arrayList.get(arrayList.size() - 1)).f8801Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final Parcelable mo1598Ujhhgtgfeyxiexzf() {
        return null;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final void mo1584Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        menuC0355Ujhhgtgfeyxiexzf.m1543Ujhhgtgfeyxiexzf(this, this.f8804Ujhhgtgfeyxiexzf);
        if (mo1415Ujhhgtgfeyxiexzf()) {
            m4068Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf);
        } else {
            this.f8809Ujhhgtgfeyxiexzf.add(menuC0355Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final void mo1585Ujhhgtgfeyxiexzf(View view) {
        if (this.f8816Ujhhgtgfeyxiexzf != view) {
            this.f8816Ujhhgtgfeyxiexzf = view;
            this.f8815Ujhhgtgfeyxiexzf = Gravity.getAbsoluteGravity(this.f8814Ujhhgtgfeyxiexzf, view.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo1586Ujhhgtgfeyxiexzf(boolean z) {
        this.f8823Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo1587Ujhhgtgfeyxiexzf(int i) {
        if (this.f8814Ujhhgtgfeyxiexzf != i) {
            this.f8814Ujhhgtgfeyxiexzf = i;
            this.f8815Ujhhgtgfeyxiexzf = Gravity.getAbsoluteGravity(i, this.f8816Ujhhgtgfeyxiexzf.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1588Ujhhgtgfeyxiexzf(int i) {
        this.f8819Ujhhgtgfeyxiexzf = true;
        this.f8821Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public final void mo1589Ujhhgtgfeyxiexzf(PopupWindow.OnDismissListener onDismissListener) {
        this.f8827feyxiexzfUjhhgtg = onDismissListener;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public final void mo1590Ujhhgtgfeyxiexzf(boolean z) {
        this.f8824Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.AbstractC0365Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public final void mo1591Ujhhgtgfeyxiexzf(int i) {
        this.f8820Ujhhgtgfeyxiexzf = true;
        this.f8822Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x013a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m4068Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        boolean z;
        int i;
        C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf;
        View childAt;
        Rect rect;
        Rect rect2;
        int i2;
        C2351Ujhhgtgfeyxiexzf c2351Ujhhgtgfeyxiexzf;
        C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z2;
        Method method;
        MenuItem item;
        C0359Ujhhgtgfeyxiexzf c0359Ujhhgtgfeyxiexzf;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f8804Ujhhgtgfeyxiexzf;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0359Ujhhgtgfeyxiexzf c0359Ujhhgtgfeyxiexzf2 = new C0359Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, layoutInflaterFrom, this.f8807Ujhhgtgfeyxiexzf, R.layout.abc_cascading_menu_item_layout);
        if (!mo1415Ujhhgtgfeyxiexzf() && this.f8823Ujhhgtgfeyxiexzf) {
            c0359Ujhhgtgfeyxiexzf2.f2054Ujhhgtgfeyxiexzf = true;
        } else if (mo1415Ujhhgtgfeyxiexzf()) {
            int size = menuC0355Ujhhgtgfeyxiexzf.f2009Ujhhgtgfeyxiexzf.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC0355Ujhhgtgfeyxiexzf.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            c0359Ujhhgtgfeyxiexzf2.f2054Ujhhgtgfeyxiexzf = z;
        }
        int iM1580Ujhhgtgfeyxiexzf = AbstractC0365Ujhhgtgfeyxiexzf.m1580Ujhhgtgfeyxiexzf(c0359Ujhhgtgfeyxiexzf2, context, this.f8805Ujhhgtgfeyxiexzf);
        C0371Ujhhgtgfeyxiexzf c0371Ujhhgtgfeyxiexzf = new C0371Ujhhgtgfeyxiexzf(context, this.f8806Ujhhgtgfeyxiexzf);
        c0371Ujhhgtgfeyxiexzf.f2078feyxiexzfUjhhgtg = this.f8813Ujhhgtgfeyxiexzf;
        c0371Ujhhgtgfeyxiexzf.f1599Ujhhgtgfeyxiexzf = this;
        c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.setOnDismissListener(this);
        c0371Ujhhgtgfeyxiexzf.f1598Ujhhgtgfeyxiexzf = this.f8816Ujhhgtgfeyxiexzf;
        c0371Ujhhgtgfeyxiexzf.f1596Ujhhgtgfeyxiexzf = this.f8815Ujhhgtgfeyxiexzf;
        c0371Ujhhgtgfeyxiexzf.f1607Ujhhgtgfeyxiexzf = true;
        c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.setFocusable(true);
        c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.setInputMethodMode(2);
        c0371Ujhhgtgfeyxiexzf.m1414Ujhhgtgfeyxiexzf(c0359Ujhhgtgfeyxiexzf2);
        Drawable background = c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.getBackground();
        if (background != null) {
            Rect rect4 = c0371Ujhhgtgfeyxiexzf.f1605Ujhhgtgfeyxiexzf;
            background.getPadding(rect4);
            c0371Ujhhgtgfeyxiexzf.f1590Ujhhgtgfeyxiexzf = rect4.left + rect4.right + iM1580Ujhhgtgfeyxiexzf;
        } else {
            c0371Ujhhgtgfeyxiexzf.f1590Ujhhgtgfeyxiexzf = iM1580Ujhhgtgfeyxiexzf;
        }
        c0371Ujhhgtgfeyxiexzf.f1596Ujhhgtgfeyxiexzf = this.f8815Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f8810Ujhhgtgfeyxiexzf;
        if (arrayList.size() > 0) {
            c2786Ujhhgtgfeyxiexzf = (C2786Ujhhgtgfeyxiexzf) arrayList.get(arrayList.size() - 1);
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf2 = c2786Ujhhgtgfeyxiexzf.f8802Ujhhgtgfeyxiexzf;
            int size2 = menuC0355Ujhhgtgfeyxiexzf2.f2009Ujhhgtgfeyxiexzf.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = menuC0355Ujhhgtgfeyxiexzf2.getItem(i5);
                if (item.hasSubMenu() && menuC0355Ujhhgtgfeyxiexzf == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item != null) {
                C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf2 = c2786Ujhhgtgfeyxiexzf.f8801Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
                ListAdapter adapter = c0363Ujhhgtgfeyxiexzf2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0359Ujhhgtgfeyxiexzf = (C0359Ujhhgtgfeyxiexzf) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0359Ujhhgtgfeyxiexzf = (C0359Ujhhgtgfeyxiexzf) adapter;
                    headersCount = 0;
                }
                int count = c0359Ujhhgtgfeyxiexzf.getCount();
                i = 1;
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c0359Ujhhgtgfeyxiexzf.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c0363Ujhhgtgfeyxiexzf2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0363Ujhhgtgfeyxiexzf2.getChildCount()) ? c0363Ujhhgtgfeyxiexzf2.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    i2 = Build.VERSION.SDK_INT;
                    c2351Ujhhgtgfeyxiexzf = c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
                    if (i2 <= 28) {
                        method = C0371Ujhhgtgfeyxiexzf.f2077feyxiexzfUjhhgtg;
                        if (method != null) {
                            try {
                                method.invoke(c2351Ujhhgtgfeyxiexzf, Boolean.FALSE);
                            } catch (Exception unused) {
                                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                            }
                        }
                    } else {
                        AbstractC0364Ujhhgtgfeyxiexzf.m1579Ujhhgtgfeyxiexzf(c2351Ujhhgtgfeyxiexzf, false);
                    }
                    AbstractC0361Ujhhgtgfeyxiexzf.m1573Ujhhgtgfeyxiexzf(c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf, null);
                    c0363Ujhhgtgfeyxiexzf = ((C2786Ujhhgtgfeyxiexzf) arrayList.get(arrayList.size() - 1)).f8801Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
                    iArr = new int[2];
                    c0363Ujhhgtgfeyxiexzf.getLocationOnScreen(iArr);
                    rect3 = new Rect();
                    this.f8817Ujhhgtgfeyxiexzf.getWindowVisibleDisplayFrame(rect3);
                    if (this.f8818Ujhhgtgfeyxiexzf == i) {
                        if (c0363Ujhhgtgfeyxiexzf.getWidth() + iArr[0] + iM1580Ujhhgtgfeyxiexzf > rect3.right) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                    } else if (iArr[0] - iM1580Ujhhgtgfeyxiexzf < 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f8818Ujhhgtgfeyxiexzf = i3;
                    c0371Ujhhgtgfeyxiexzf.f1598Ujhhgtgfeyxiexzf = childAt;
                    if ((this.f8815Ujhhgtgfeyxiexzf & 5) == 5) {
                        if (!z2) {
                            iM1580Ujhhgtgfeyxiexzf = 0 - childAt.getWidth();
                        }
                    } else if (z2) {
                        iM1580Ujhhgtgfeyxiexzf = childAt.getWidth();
                    } else {
                        iM1580Ujhhgtgfeyxiexzf = 0 - iM1580Ujhhgtgfeyxiexzf;
                    }
                    c0371Ujhhgtgfeyxiexzf.f1591Ujhhgtgfeyxiexzf = iM1580Ujhhgtgfeyxiexzf;
                    c0371Ujhhgtgfeyxiexzf.f1595Ujhhgtgfeyxiexzf = true;
                    c0371Ujhhgtgfeyxiexzf.f1594Ujhhgtgfeyxiexzf = true;
                    c0371Ujhhgtgfeyxiexzf.f1592Ujhhgtgfeyxiexzf = 0;
                    c0371Ujhhgtgfeyxiexzf.f1593Ujhhgtgfeyxiexzf = true;
                } else {
                    if (this.f8819Ujhhgtgfeyxiexzf) {
                        c0371Ujhhgtgfeyxiexzf.f1591Ujhhgtgfeyxiexzf = this.f8821Ujhhgtgfeyxiexzf;
                    }
                    if (this.f8820Ujhhgtgfeyxiexzf) {
                        c0371Ujhhgtgfeyxiexzf.f1592Ujhhgtgfeyxiexzf = this.f8822Ujhhgtgfeyxiexzf;
                        c0371Ujhhgtgfeyxiexzf.f1593Ujhhgtgfeyxiexzf = true;
                    }
                    rect = this.f2073Ujhhgtgfeyxiexzf;
                    if (rect != null) {
                        rect2 = new Rect(rect);
                    } else {
                        rect2 = null;
                    }
                    c0371Ujhhgtgfeyxiexzf.f1606Ujhhgtgfeyxiexzf = rect2;
                }
                arrayList.add(new C2786Ujhhgtgfeyxiexzf(c0371Ujhhgtgfeyxiexzf, menuC0355Ujhhgtgfeyxiexzf, this.f8818Ujhhgtgfeyxiexzf));
                c0371Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
                C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf3 = c0371Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
                c0363Ujhhgtgfeyxiexzf3.setOnKeyListener(this);
                if (c2786Ujhhgtgfeyxiexzf == null || !this.f8824Ujhhgtgfeyxiexzf || menuC0355Ujhhgtgfeyxiexzf.f2015Ujhhgtgfeyxiexzf == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0363Ujhhgtgfeyxiexzf3, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(menuC0355Ujhhgtgfeyxiexzf.f2015Ujhhgtgfeyxiexzf);
                c0363Ujhhgtgfeyxiexzf3.addHeaderView(frameLayout, null, false);
                c0371Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
                return;
            }
            i = 1;
        } else {
            i = 1;
            c2786Ujhhgtgfeyxiexzf = null;
        }
        if (childAt != null) {
            i2 = Build.VERSION.SDK_INT;
            c2351Ujhhgtgfeyxiexzf = c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
            if (i2 <= 28) {
                method = C0371Ujhhgtgfeyxiexzf.f2077feyxiexzfUjhhgtg;
                if (method != null) {
                    method.invoke(c2351Ujhhgtgfeyxiexzf, Boolean.FALSE);
                }
            } else {
                AbstractC0364Ujhhgtgfeyxiexzf.m1579Ujhhgtgfeyxiexzf(c2351Ujhhgtgfeyxiexzf, false);
            }
            AbstractC0361Ujhhgtgfeyxiexzf.m1573Ujhhgtgfeyxiexzf(c0371Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf, null);
            c0363Ujhhgtgfeyxiexzf = ((C2786Ujhhgtgfeyxiexzf) arrayList.get(arrayList.size() - 1)).f8801Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
            iArr = new int[2];
            c0363Ujhhgtgfeyxiexzf.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f8817Ujhhgtgfeyxiexzf.getWindowVisibleDisplayFrame(rect3);
            if (this.f8818Ujhhgtgfeyxiexzf == i) {
                if (c0363Ujhhgtgfeyxiexzf.getWidth() + iArr[0] + iM1580Ujhhgtgfeyxiexzf > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM1580Ujhhgtgfeyxiexzf < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f8818Ujhhgtgfeyxiexzf = i3;
            c0371Ujhhgtgfeyxiexzf.f1598Ujhhgtgfeyxiexzf = childAt;
            if ((this.f8815Ujhhgtgfeyxiexzf & 5) == 5) {
                if (!z2) {
                    iM1580Ujhhgtgfeyxiexzf = 0 - childAt.getWidth();
                }
            } else if (z2) {
                iM1580Ujhhgtgfeyxiexzf = childAt.getWidth();
            } else {
                iM1580Ujhhgtgfeyxiexzf = 0 - iM1580Ujhhgtgfeyxiexzf;
            }
            c0371Ujhhgtgfeyxiexzf.f1591Ujhhgtgfeyxiexzf = iM1580Ujhhgtgfeyxiexzf;
            c0371Ujhhgtgfeyxiexzf.f1595Ujhhgtgfeyxiexzf = true;
            c0371Ujhhgtgfeyxiexzf.f1594Ujhhgtgfeyxiexzf = true;
            c0371Ujhhgtgfeyxiexzf.f1592Ujhhgtgfeyxiexzf = 0;
            c0371Ujhhgtgfeyxiexzf.f1593Ujhhgtgfeyxiexzf = true;
        } else {
            if (this.f8819Ujhhgtgfeyxiexzf) {
                c0371Ujhhgtgfeyxiexzf.f1591Ujhhgtgfeyxiexzf = this.f8821Ujhhgtgfeyxiexzf;
            }
            if (this.f8820Ujhhgtgfeyxiexzf) {
                c0371Ujhhgtgfeyxiexzf.f1592Ujhhgtgfeyxiexzf = this.f8822Ujhhgtgfeyxiexzf;
                c0371Ujhhgtgfeyxiexzf.f1593Ujhhgtgfeyxiexzf = true;
            }
            rect = this.f2073Ujhhgtgfeyxiexzf;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c0371Ujhhgtgfeyxiexzf.f1606Ujhhgtgfeyxiexzf = rect2;
        }
        arrayList.add(new C2786Ujhhgtgfeyxiexzf(c0371Ujhhgtgfeyxiexzf, menuC0355Ujhhgtgfeyxiexzf, this.f8818Ujhhgtgfeyxiexzf));
        c0371Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
        C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf4 = c0371Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
        c0363Ujhhgtgfeyxiexzf4.setOnKeyListener(this);
        if (c2786Ujhhgtgfeyxiexzf == null) {
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo1596Ujhhgtgfeyxiexzf(Parcelable parcelable) {
    }
}
