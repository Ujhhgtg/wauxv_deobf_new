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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0549 extends AbstractC1978 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f2275;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f2276;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f2278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Handler f2279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0545 f2282;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0546 f2283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public View f2287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public View f2288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f2289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f2290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f2291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f2292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f2293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f2295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public InterfaceC1985 f2296;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public ViewTreeObserver f2297;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f2298;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public boolean f2299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ArrayList f2280 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f2281 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C0102 f2284 = new C0102(this, 5);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f2285 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f2286 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f2294 = false;

    public ViewOnKeyListenerC0549(Context context, View view, int i, boolean z) {
        int i2 = 0;
        this.f2282 = new ViewTreeObserverOnGlobalLayoutListenerC0545(this, i2);
        this.f2283 = new ViewOnAttachStateChangeListenerC0546(this, i2);
        this.f2275 = context;
        this.f2287 = view;
        this.f2277 = i;
        this.f2278 = z;
        this.f2289 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2276 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2279 = new Handler();
    }

    @Override // p000.InterfaceC2763
    public final void dismiss() {
        ArrayList arrayList = this.f2281;
        int size = arrayList.size();
        if (size > 0) {
            C0548[] c0548Arr = (C0548[]) arrayList.toArray(new C0548[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0548 c0548 = c0548Arr[i];
                if (c0548.f2272.f6157.isShowing()) {
                    c0548.f2272.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0548 c0548;
        ArrayList arrayList = this.f2281;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0548 = null;
                break;
            }
            c0548 = (C0548) arrayList.get(i);
            if (!c0548.f2272.f6157.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0548 != null) {
            c0548.f2273.m3950(false);
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
        ArrayList arrayList = this.f2281;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1975 == ((C0548) arrayList.get(i)).f2273) {
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
            ((C0548) arrayList.get(i2)).f2273.m3950(false);
        }
        C0548 c0548 = (C0548) arrayList.remove(i);
        MenuC1975 menuC1976 = c0548.f2273;
        C1984 c1984 = c0548.f2272;
        C0233 c0233 = c1984.f6157;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = menuC1976.f6529;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
            if (interfaceC1986 == null || interfaceC1986 == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f2299) {
            AbstractC1981.m3978(c0233, null);
            c0233.setAnimationStyle(0);
        }
        c1984.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2289 = ((C0548) arrayList.get(size2 - 1)).f2274;
        } else {
            this.f2289 = this.f2287.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0548) arrayList.get(0)).f2273.m3950(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1985 interfaceC1985 = this.f2296;
        if (interfaceC1985 != null) {
            interfaceC1985.mo1243(menuC1975, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2297;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2297.removeGlobalOnLayoutListener(this.f2282);
            }
            this.f2297 = null;
        }
        this.f2288.removeOnAttachStateChangeListener(this.f2283);
        this.f2298.onDismiss();
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1283(boolean z) {
        Iterator it = this.f2281.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0548) it.next()).f2272.f6138.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1972) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo1284(SubMenuC2913 subMenuC2913) {
        for (C0548 c0548 : this.f2281) {
            if (subMenuC2913 == c0548.f2273) {
                c0548.f2272.f6138.requestFocus();
                return true;
            }
        }
        if (!subMenuC2913.hasVisibleItems()) {
            return false;
        }
        mo2067(subMenuC2913);
        InterfaceC1985 interfaceC1985 = this.f2296;
        if (interfaceC1985 != null) {
            interfaceC1985.mo1264(subMenuC2913);
        }
        return true;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo1285() {
        return false;
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean mo2064() {
        ArrayList arrayList = this.f2281;
        return arrayList.size() > 0 && ((C0548) arrayList.get(0)).f2272.f6157.isShowing();
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2065() {
        if (mo2064()) {
            return;
        }
        ArrayList arrayList = this.f2280;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2075((MenuC1975) it.next());
        }
        arrayList.clear();
        View view = this.f2287;
        this.f2288 = view;
        if (view != null) {
            boolean z = this.f2297 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2297 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2282);
            }
            this.f2288.addOnAttachStateChangeListener(this.f2283);
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1290(InterfaceC1985 interfaceC1985) {
        this.f2296 = interfaceC1985;
    }

    @Override // p000.InterfaceC2763
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ListView mo2066() {
        ArrayList arrayList = this.f2281;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0548) arrayList.get(arrayList.size() - 1)).f2272.f6138;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final Parcelable mo1294() {
        return null;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo2067(MenuC1975 menuC1975) {
        menuC1975.m3949(this, this.f2275);
        if (mo2064()) {
            m2075(menuC1975);
        } else {
            this.f2280.add(menuC1975);
        }
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void mo2068(View view) {
        if (this.f2287 != view) {
            this.f2287 = view;
            this.f2286 = Gravity.getAbsoluteGravity(this.f2285, view.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void mo2069(boolean z) {
        this.f2294 = z;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo2070(int i) {
        if (this.f2285 != i) {
            this.f2285 = i;
            this.f2286 = Gravity.getAbsoluteGravity(i, this.f2287.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void mo2071(int i) {
        this.f2290 = true;
        this.f2292 = i;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void mo2072(PopupWindow.OnDismissListener onDismissListener) {
        this.f2298 = onDismissListener;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void mo2073(boolean z) {
        this.f2295 = z;
    }

    @Override // p000.AbstractC1978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo2074(int i) {
        this.f2291 = true;
        this.f2293 = i;
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m2075(MenuC1975 menuC1975) {
        boolean z;
        int i;
        C0548 c0548;
        View childAt;
        Rect rect;
        Rect rect2;
        int i2;
        C0233 c0233;
        C1983 c1983;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z2;
        Method method;
        MenuItem item;
        C1972 c1972;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f2275;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1972 c1973 = new C1972(menuC1975, layoutInflaterFrom, this.f2278, R.layout.abc_cascading_menu_item_layout);
        if (!mo2064() && this.f2294) {
            c1973.f6507 = true;
        } else if (mo2064()) {
            int size = menuC1975.f6517.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC1975.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            c1973.f6507 = z;
        }
        int iM3973 = AbstractC1978.m3973(c1973, context, this.f2276);
        C1984 c1984 = new C1984(context, this.f2277);
        c1984.f6578 = this.f2284;
        c1984.f6148 = this;
        c1984.f6157.setOnDismissListener(this);
        c1984.f6147 = this.f2287;
        c1984.f6145 = this.f2286;
        c1984.f6156 = true;
        c1984.f6157.setFocusable(true);
        c1984.f6157.setInputMethodMode(2);
        c1984.m3754(c1973);
        Drawable background = c1984.f6157.getBackground();
        if (background != null) {
            Rect rect4 = c1984.f6154;
            background.getPadding(rect4);
            c1984.f6139 = rect4.left + rect4.right + iM3973;
        } else {
            c1984.f6139 = iM3973;
        }
        c1984.f6145 = this.f2286;
        ArrayList arrayList = this.f2281;
        if (arrayList.size() > 0) {
            c0548 = (C0548) arrayList.get(arrayList.size() - 1);
            MenuC1975 menuC1976 = c0548.f2273;
            int size2 = menuC1976.f6517.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = menuC1976.getItem(i5);
                if (item.hasSubMenu() && menuC1975 == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item != null) {
                C1983 c1985 = c0548.f2272.f6138;
                ListAdapter adapter = c1985.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1972 = (C1972) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1972 = (C1972) adapter;
                    headersCount = 0;
                }
                int count = c1972.getCount();
                i = 1;
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c1972.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c1985.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1985.getChildCount()) ? c1985.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    i2 = Build.VERSION.SDK_INT;
                    c0233 = c1984.f6157;
                    if (i2 <= 28) {
                        method = C1984.f6577;
                        if (method != null) {
                            try {
                                method.invoke(c0233, Boolean.FALSE);
                            } catch (Exception unused) {
                                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                            }
                        }
                    } else {
                        AbstractC1982.m3979(c0233, false);
                    }
                    AbstractC1981.m3977(c1984.f6157, null);
                    c1983 = ((C0548) arrayList.get(arrayList.size() - 1)).f2272.f6138;
                    iArr = new int[2];
                    c1983.getLocationOnScreen(iArr);
                    rect3 = new Rect();
                    this.f2288.getWindowVisibleDisplayFrame(rect3);
                    if (this.f2289 == i) {
                        if (c1983.getWidth() + iArr[0] + iM3973 > rect3.right) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                    } else if (iArr[0] - iM3973 < 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f2289 = i3;
                    c1984.f6147 = childAt;
                    if ((this.f2286 & 5) == 5) {
                        if (!z2) {
                            iM3973 = 0 - childAt.getWidth();
                        }
                    } else if (z2) {
                        iM3973 = childAt.getWidth();
                    } else {
                        iM3973 = 0 - iM3973;
                    }
                    c1984.f6140 = iM3973;
                    c1984.f6144 = true;
                    c1984.f6143 = true;
                    c1984.f6141 = 0;
                    c1984.f6142 = true;
                } else {
                    if (this.f2290) {
                        c1984.f6140 = this.f2292;
                    }
                    if (this.f2291) {
                        c1984.f6141 = this.f2293;
                        c1984.f6142 = true;
                    }
                    rect = this.f6560;
                    if (rect != null) {
                        rect2 = new Rect(rect);
                    } else {
                        rect2 = null;
                    }
                    c1984.f6155 = rect2;
                }
                arrayList.add(new C0548(c1984, menuC1975, this.f2289));
                c1984.mo2065();
                C1983 c1986 = c1984.f6138;
                c1986.setOnKeyListener(this);
                if (c0548 == null || !this.f2295 || menuC1975.f6523 == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1986, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(menuC1975.f6523);
                c1986.addHeaderView(frameLayout, null, false);
                c1984.mo2065();
                return;
            }
            i = 1;
        } else {
            i = 1;
            c0548 = null;
        }
        if (childAt != null) {
            i2 = Build.VERSION.SDK_INT;
            c0233 = c1984.f6157;
            if (i2 <= 28) {
                method = C1984.f6577;
                if (method != null) {
                    method.invoke(c0233, Boolean.FALSE);
                }
            } else {
                AbstractC1982.m3979(c0233, false);
            }
            AbstractC1981.m3977(c1984.f6157, null);
            c1983 = ((C0548) arrayList.get(arrayList.size() - 1)).f2272.f6138;
            iArr = new int[2];
            c1983.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f2288.getWindowVisibleDisplayFrame(rect3);
            if (this.f2289 == i) {
                if (c1983.getWidth() + iArr[0] + iM3973 > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM3973 < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2289 = i3;
            c1984.f6147 = childAt;
            if ((this.f2286 & 5) == 5) {
                if (!z2) {
                    iM3973 = 0 - childAt.getWidth();
                }
            } else if (z2) {
                iM3973 = childAt.getWidth();
            } else {
                iM3973 = 0 - iM3973;
            }
            c1984.f6140 = iM3973;
            c1984.f6144 = true;
            c1984.f6143 = true;
            c1984.f6141 = 0;
            c1984.f6142 = true;
        } else {
            if (this.f2290) {
                c1984.f6140 = this.f2292;
            }
            if (this.f2291) {
                c1984.f6141 = this.f2293;
                c1984.f6142 = true;
            }
            rect = this.f6560;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c1984.f6155 = rect2;
        }
        arrayList.add(new C0548(c1984, menuC1975, this.f2289));
        c1984.mo2065();
        C1983 c1987 = c1984.f6138;
        c1987.setOnKeyListener(this);
        if (c0548 == null) {
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1289(Parcelable parcelable) {
    }
}
