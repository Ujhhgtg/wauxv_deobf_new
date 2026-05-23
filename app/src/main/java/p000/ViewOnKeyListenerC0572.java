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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲈᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0572 extends AbstractC1947 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Context f2313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f2315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f2316;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Handler f2317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0568 f2320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0569 f2321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public View f2325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public View f2326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f2327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f2328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f2329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f2330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f2331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f2333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC1954 f2334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public ViewTreeObserver f2335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f2336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f2318 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f2319 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C0094 f2322 = new C0094(5, this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f2323 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f2324 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f2332 = false;

    public ViewOnKeyListenerC0572(Context context, View view, int i, boolean z) {
        int i2 = 0;
        this.f2320 = new ViewTreeObserverOnGlobalLayoutListenerC0568(this, i2);
        this.f2321 = new ViewOnAttachStateChangeListenerC0569(i2, this);
        this.f2313 = context;
        this.f2325 = view;
        this.f2315 = i;
        this.f2316 = z;
        this.f2327 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2314 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2317 = new Handler();
    }

    @Override // p000.InterfaceC2701
    public final void dismiss() {
        ArrayList arrayList = this.f2319;
        int size = arrayList.size();
        if (size > 0) {
            C0571[] c0571Arr = (C0571[]) arrayList.toArray(new C0571[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0571 c0571 = c0571Arr[i];
                if (c0571.f2310.f6082.isShowing()) {
                    c0571.f2310.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0571 c0571;
        ArrayList arrayList = this.f2319;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0571 = null;
                break;
            }
            c0571 = (C0571) arrayList.get(i);
            if (!c0571.f2310.f6082.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0571 != null) {
            c0571.f2311.m3756(false);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1136(MenuC1944 menuC1944, boolean z) {
        ArrayList arrayList = this.f2319;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1944 == ((C0571) arrayList.get(i)).f2311) {
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
            ((C0571) arrayList.get(i2)).f2311.m3756(false);
        }
        C0571 c0571 = (C0571) arrayList.remove(i);
        MenuC1944 menuC1945 = c0571.f2311;
        C1953 c1953 = c0571.f2310;
        C0223 c0223 = c1953.f6082;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = menuC1945.f6424;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
            if (interfaceC1955 == null || interfaceC1955 == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f2337) {
            AbstractC1950.m3784(c0223, null);
            c0223.setAnimationStyle(0);
        }
        c1953.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2327 = ((C0571) arrayList.get(size2 - 1)).f2312;
        } else {
            this.f2327 = this.f2325.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0571) arrayList.get(0)).f2311.m3756(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1954 interfaceC1954 = this.f2334;
        if (interfaceC1954 != null) {
            interfaceC1954.mo1097(menuC1944, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2335;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2335.removeGlobalOnLayoutListener(this.f2320);
            }
            this.f2335 = null;
        }
        this.f2326.removeOnAttachStateChangeListener(this.f2321);
        this.f2336.onDismiss();
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1137(boolean z) {
        Iterator it = this.f2319.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0571) it.next()).f2310.f6063.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1941) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo1138(SubMenuC2853 subMenuC2853) {
        for (C0571 c0571 : this.f2319) {
            if (subMenuC2853 == c0571.f2311) {
                c0571.f2310.f6063.requestFocus();
                return true;
            }
        }
        if (!subMenuC2853.hasVisibleItems()) {
            return false;
        }
        mo1970(subMenuC2853);
        InterfaceC1954 interfaceC1954 = this.f2334;
        if (interfaceC1954 != null) {
            interfaceC1954.mo1118(subMenuC2853);
        }
        return true;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo1139() {
        return false;
    }

    @Override // p000.InterfaceC2701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean mo1967() {
        ArrayList arrayList = this.f2319;
        return arrayList.size() > 0 && ((C0571) arrayList.get(0)).f2310.f6082.isShowing();
    }

    @Override // p000.InterfaceC2701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1968() {
        if (mo1967()) {
            return;
        }
        ArrayList arrayList = this.f2318;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1978((MenuC1944) it.next());
        }
        arrayList.clear();
        View view = this.f2325;
        this.f2326 = view;
        if (view != null) {
            boolean z = this.f2335 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2335 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2320);
            }
            this.f2326.addOnAttachStateChangeListener(this.f2321);
        }
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1144(InterfaceC1954 interfaceC1954) {
        this.f2334 = interfaceC1954;
    }

    @Override // p000.InterfaceC2701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ListView mo1969() {
        ArrayList arrayList = this.f2319;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0571) arrayList.get(arrayList.size() - 1)).f2310.f6063;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final Parcelable mo1148() {
        return null;
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo1970(MenuC1944 menuC1944) {
        menuC1944.m3755(this, this.f2313);
        if (mo1967()) {
            m1978(menuC1944);
        } else {
            this.f2318.add(menuC1944);
        }
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void mo1971(View view) {
        if (this.f2325 != view) {
            this.f2325 = view;
            this.f2324 = Gravity.getAbsoluteGravity(this.f2323, view.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void mo1972(boolean z) {
        this.f2332 = z;
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo1973(int i) {
        if (this.f2323 != i) {
            this.f2323 = i;
            this.f2324 = Gravity.getAbsoluteGravity(i, this.f2325.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void mo1974(int i) {
        this.f2328 = true;
        this.f2330 = i;
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void mo1975(PopupWindow.OnDismissListener onDismissListener) {
        this.f2336 = onDismissListener;
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void mo1976(boolean z) {
        this.f2333 = z;
    }

    @Override // p000.AbstractC1947
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo1977(int i) {
        this.f2329 = true;
        this.f2331 = i;
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
    public final void m1978(MenuC1944 menuC1944) {
        boolean z;
        int i;
        C0571 c0571;
        View childAt;
        Rect rect;
        Rect rect2;
        int i2;
        C0223 c0223;
        C1952 c1952;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z2;
        Method method;
        MenuItem item;
        C1941 c1941;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f2313;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1941 c1942 = new C1941(menuC1944, layoutInflaterFrom, this.f2316, R.layout.abc_cascading_menu_item_layout);
        if (!mo1967() && this.f2332) {
            c1942.f6402 = true;
        } else if (mo1967()) {
            int size = menuC1944.f6412.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC1944.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            c1942.f6402 = z;
        }
        int iM3779 = AbstractC1947.m3779(c1942, context, this.f2314);
        C1953 c1953 = new C1953(context, this.f2315);
        c1953.f6473 = this.f2322;
        c1953.f6073 = this;
        c1953.f6082.setOnDismissListener(this);
        c1953.f6072 = this.f2325;
        c1953.f6070 = this.f2324;
        c1953.f6081 = true;
        c1953.f6082.setFocusable(true);
        c1953.f6082.setInputMethodMode(2);
        c1953.m3576(c1942);
        Drawable background = c1953.f6082.getBackground();
        if (background != null) {
            Rect rect4 = c1953.f6079;
            background.getPadding(rect4);
            c1953.f6064 = rect4.left + rect4.right + iM3779;
        } else {
            c1953.f6064 = iM3779;
        }
        c1953.f6070 = this.f2324;
        ArrayList arrayList = this.f2319;
        if (arrayList.size() > 0) {
            c0571 = (C0571) arrayList.get(arrayList.size() - 1);
            MenuC1944 menuC1945 = c0571.f2311;
            int size2 = menuC1945.f6412.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = menuC1945.getItem(i5);
                if (item.hasSubMenu() && menuC1944 == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item != null) {
                C1952 c1954 = c0571.f2310.f6063;
                ListAdapter adapter = c1954.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1941 = (C1941) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1941 = (C1941) adapter;
                    headersCount = 0;
                }
                int count = c1941.getCount();
                i = 1;
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c1941.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c1954.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1954.getChildCount()) ? c1954.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    i2 = Build.VERSION.SDK_INT;
                    c0223 = c1953.f6082;
                    if (i2 <= 28) {
                        method = C1953.f6472;
                        if (method != null) {
                            try {
                                method.invoke(c0223, Boolean.FALSE);
                            } catch (Exception unused) {
                                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                            }
                        }
                    } else {
                        AbstractC1951.m3785(c0223, false);
                    }
                    AbstractC1950.m3783(c1953.f6082, null);
                    c1952 = ((C0571) arrayList.get(arrayList.size() - 1)).f2310.f6063;
                    iArr = new int[2];
                    c1952.getLocationOnScreen(iArr);
                    rect3 = new Rect();
                    this.f2326.getWindowVisibleDisplayFrame(rect3);
                    if (this.f2327 == i) {
                        if (c1952.getWidth() + iArr[0] + iM3779 > rect3.right) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                    } else if (iArr[0] - iM3779 < 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f2327 = i3;
                    c1953.f6072 = childAt;
                    if ((this.f2324 & 5) == 5) {
                        if (!z2) {
                            iM3779 = 0 - childAt.getWidth();
                        }
                    } else if (z2) {
                        iM3779 = childAt.getWidth();
                    } else {
                        iM3779 = 0 - iM3779;
                    }
                    c1953.f6065 = iM3779;
                    c1953.f6069 = true;
                    c1953.f6068 = true;
                    c1953.f6066 = 0;
                    c1953.f6067 = true;
                } else {
                    if (this.f2328) {
                        c1953.f6065 = this.f2330;
                    }
                    if (this.f2329) {
                        c1953.f6066 = this.f2331;
                        c1953.f6067 = true;
                    }
                    rect = this.f6455;
                    if (rect != null) {
                        rect2 = new Rect(rect);
                    } else {
                        rect2 = null;
                    }
                    c1953.f6080 = rect2;
                }
                arrayList.add(new C0571(c1953, menuC1944, this.f2327));
                c1953.mo1968();
                C1952 c1955 = c1953.f6063;
                c1955.setOnKeyListener(this);
                if (c0571 == null || !this.f2333 || menuC1944.f6418 == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1955, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(menuC1944.f6418);
                c1955.addHeaderView(frameLayout, null, false);
                c1953.mo1968();
                return;
            }
            i = 1;
        } else {
            i = 1;
            c0571 = null;
        }
        if (childAt != null) {
            i2 = Build.VERSION.SDK_INT;
            c0223 = c1953.f6082;
            if (i2 <= 28) {
                method = C1953.f6472;
                if (method != null) {
                    method.invoke(c0223, Boolean.FALSE);
                }
            } else {
                AbstractC1951.m3785(c0223, false);
            }
            AbstractC1950.m3783(c1953.f6082, null);
            c1952 = ((C0571) arrayList.get(arrayList.size() - 1)).f2310.f6063;
            iArr = new int[2];
            c1952.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f2326.getWindowVisibleDisplayFrame(rect3);
            if (this.f2327 == i) {
                if (c1952.getWidth() + iArr[0] + iM3779 > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM3779 < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2327 = i3;
            c1953.f6072 = childAt;
            if ((this.f2324 & 5) == 5) {
                if (!z2) {
                    iM3779 = 0 - childAt.getWidth();
                }
            } else if (z2) {
                iM3779 = childAt.getWidth();
            } else {
                iM3779 = 0 - iM3779;
            }
            c1953.f6065 = iM3779;
            c1953.f6069 = true;
            c1953.f6068 = true;
            c1953.f6066 = 0;
            c1953.f6067 = true;
        } else {
            if (this.f2328) {
                c1953.f6065 = this.f2330;
            }
            if (this.f2329) {
                c1953.f6066 = this.f2331;
                c1953.f6067 = true;
            }
            rect = this.f6455;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c1953.f6080 = rect2;
        }
        arrayList.add(new C0571(c1953, menuC1944, this.f2327));
        c1953.mo1968();
        C1952 c1956 = c1953.f6063;
        c1956.setOnKeyListener(this);
        if (c0571 == null) {
        }
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1143(Parcelable parcelable) {
    }
}
