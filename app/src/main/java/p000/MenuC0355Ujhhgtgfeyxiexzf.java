package p000;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0355Ujhhgtgfeyxiexzf implements Menu {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final int[] f2003Ujhhgtgfeyxiexzf = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f2004Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Resources f2005Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f2006Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f2007Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public InterfaceC0360Ujhhgtgfeyxiexzf f2008Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f2009Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ArrayList f2010Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f2011Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final ArrayList f2012Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f2013Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f2014Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public CharSequence f2015Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f2022Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f2016Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f2017Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f2018Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f2019Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final ArrayList f2020Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f2021Ujhhgtgfeyxiexzf = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public boolean f2023Ujhhgtgfeyxiexzf = false;

    public MenuC0355Ujhhgtgfeyxiexzf(Context context) {
        boolean zM4729Ujhhgtgfeyxiexzf;
        boolean z = false;
        this.f2004Ujhhgtgfeyxiexzf = context;
        Resources resources = context.getResources();
        this.f2005Ujhhgtgfeyxiexzf = resources;
        this.f2009Ujhhgtgfeyxiexzf = new ArrayList();
        this.f2010Ujhhgtgfeyxiexzf = new ArrayList();
        this.f2011Ujhhgtgfeyxiexzf = true;
        this.f2012Ujhhgtgfeyxiexzf = new ArrayList();
        this.f2013Ujhhgtgfeyxiexzf = new ArrayList();
        this.f2014Ujhhgtgfeyxiexzf = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM4729Ujhhgtgfeyxiexzf = AbstractC3223feyxiexzfUjhhgtg.m4729Ujhhgtgfeyxiexzf(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM4729Ujhhgtgfeyxiexzf = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM4729Ujhhgtgfeyxiexzf) {
                z = true;
            }
        }
        this.f2007Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return mo1542Ujhhgtgfeyxiexzf(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2004Ujhhgtgfeyxiexzf.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf = mo1542Ujhhgtgfeyxiexzf(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf.f2030Ujhhgtgfeyxiexzf = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2022Ujhhgtgfeyxiexzf;
        if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
            mo1545Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
        }
        this.f2009Ujhhgtgfeyxiexzf.clear();
        m1556Ujhhgtgfeyxiexzf(true);
    }

    public final void clearHeader() {
        this.f2015Ujhhgtgfeyxiexzf = null;
        m1556Ujhhgtgfeyxiexzf(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m1544Ujhhgtgfeyxiexzf(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2);
            if (menuItemC0357Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf == i) {
                return menuItemC0357Ujhhgtgfeyxiexzf;
            }
            if (menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu() && (menuItemFindItem = menuItemC0357Ujhhgtgfeyxiexzf.f2038Ujhhgtgfeyxiexzf.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2009Ujhhgtgfeyxiexzf.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m1548Ujhhgtgfeyxiexzf(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m1557Ujhhgtgfeyxiexzf(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357UjhhgtgfeyxiexzfM1548Ujhhgtgfeyxiexzf = m1548Ujhhgtgfeyxiexzf(i, keyEvent);
        boolean zM1557Ujhhgtgfeyxiexzf = menuItemC0357UjhhgtgfeyxiexzfM1548Ujhhgtgfeyxiexzf != null ? m1557Ujhhgtgfeyxiexzf(menuItemC0357UjhhgtgfeyxiexzfM1548Ujhhgtgfeyxiexzf, null, i2) : false;
        if ((i2 & 2) != 0) {
            m1544Ujhhgtgfeyxiexzf(true);
        }
        return zM1557Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i3)).f2025Ujhhgtgfeyxiexzf == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i3)).f2025Ujhhgtgfeyxiexzf != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m1556Ujhhgtgfeyxiexzf(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2)).f2024Ujhhgtgfeyxiexzf == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m1556Ujhhgtgfeyxiexzf(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2);
            if (menuItemC0357Ujhhgtgfeyxiexzf.f2025Ujhhgtgfeyxiexzf == i) {
                menuItemC0357Ujhhgtgfeyxiexzf.m1564Ujhhgtgfeyxiexzf(z2);
                menuItemC0357Ujhhgtgfeyxiexzf.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f2023Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2);
            if (menuItemC0357Ujhhgtgfeyxiexzf.f2025Ujhhgtgfeyxiexzf == i) {
                menuItemC0357Ujhhgtgfeyxiexzf.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2);
            if (menuItemC0357Ujhhgtgfeyxiexzf.f2025Ujhhgtgfeyxiexzf == i) {
                int i3 = menuItemC0357Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                menuItemC0357Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m1556Ujhhgtgfeyxiexzf(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2006Ujhhgtgfeyxiexzf = z;
        m1556Ujhhgtgfeyxiexzf(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2009Ujhhgtgfeyxiexzf.size();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf mo1542Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2003Ujhhgtgfeyxiexzf[i5] << 16) | (65535 & i3);
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = new MenuItemC0357Ujhhgtgfeyxiexzf(this, i, i2, i3, i6, charSequence);
        ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(size)).f2027Ujhhgtgfeyxiexzf <= i6) {
                i4 = size + 1;
                arrayList.add(i4, menuItemC0357Ujhhgtgfeyxiexzf);
                m1556Ujhhgtgfeyxiexzf(true);
                return menuItemC0357Ujhhgtgfeyxiexzf;
            }
        }
        i4 = 0;
        arrayList.add(i4, menuItemC0357Ujhhgtgfeyxiexzf);
        m1556Ujhhgtgfeyxiexzf(true);
        return menuItemC0357Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1543Ujhhgtgfeyxiexzf(InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf, Context context) {
        this.f2021Ujhhgtgfeyxiexzf.add(new WeakReference(interfaceC0368Ujhhgtgfeyxiexzf));
        interfaceC0368Ujhhgtgfeyxiexzf.mo1583Ujhhgtgfeyxiexzf(context, this);
        this.f2014Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1544Ujhhgtgfeyxiexzf(boolean z) {
        if (this.f2019Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f2019Ujhhgtgfeyxiexzf = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2021Ujhhgtgfeyxiexzf;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
            if (interfaceC0368Ujhhgtgfeyxiexzf == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0368Ujhhgtgfeyxiexzf.mo1592Ujhhgtgfeyxiexzf(this, z);
            }
        }
        this.f2019Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean mo1545Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2021Ujhhgtgfeyxiexzf;
        boolean zMo1581Ujhhgtgfeyxiexzf = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2022Ujhhgtgfeyxiexzf == menuItemC0357Ujhhgtgfeyxiexzf) {
            m1560Ujhhgtgfeyxiexzf();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
                if (interfaceC0368Ujhhgtgfeyxiexzf != null) {
                    zMo1581Ujhhgtgfeyxiexzf = interfaceC0368Ujhhgtgfeyxiexzf.mo1581Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
                    if (zMo1581Ujhhgtgfeyxiexzf) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m1559Ujhhgtgfeyxiexzf();
            if (zMo1581Ujhhgtgfeyxiexzf) {
                this.f2022Ujhhgtgfeyxiexzf = null;
            }
        }
        return zMo1581Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean mo1546Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItem menuItem) {
        InterfaceC0360Ujhhgtgfeyxiexzf interfaceC0360Ujhhgtgfeyxiexzf = this.f2008Ujhhgtgfeyxiexzf;
        return interfaceC0360Ujhhgtgfeyxiexzf != null && interfaceC0360Ujhhgtgfeyxiexzf.mo1571Ujhhgtgfeyxiexzf(menuItem);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean mo1547Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2021Ujhhgtgfeyxiexzf;
        boolean zMo1582Ujhhgtgfeyxiexzf = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m1560Ujhhgtgfeyxiexzf();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
            if (interfaceC0368Ujhhgtgfeyxiexzf != null) {
                zMo1582Ujhhgtgfeyxiexzf = interfaceC0368Ujhhgtgfeyxiexzf.mo1582Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
                if (zMo1582Ujhhgtgfeyxiexzf) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m1559Ujhhgtgfeyxiexzf();
        if (zMo1582Ujhhgtgfeyxiexzf) {
            this.f2022Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
        }
        return zMo1582Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final MenuItemC0357Ujhhgtgfeyxiexzf m1548Ujhhgtgfeyxiexzf(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2020Ujhhgtgfeyxiexzf;
        arrayList.clear();
        m1549Ujhhgtgfeyxiexzf(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(0);
        }
        boolean zMo1554Ujhhgtgfeyxiexzf = mo1554Ujhhgtgfeyxiexzf();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2);
            char c = zMo1554Ujhhgtgfeyxiexzf ? menuItemC0357Ujhhgtgfeyxiexzf.f2033Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf.f2031Ujhhgtgfeyxiexzf;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo1554Ujhhgtgfeyxiexzf && c == '\b' && i == 67))) {
                return menuItemC0357Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m1549Ujhhgtgfeyxiexzf(List list, int i, KeyEvent keyEvent) {
        boolean zMo1554Ujhhgtgfeyxiexzf = mo1554Ujhhgtgfeyxiexzf();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f2009Ujhhgtgfeyxiexzf;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i2);
                if (menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu()) {
                    menuItemC0357Ujhhgtgfeyxiexzf.f2038Ujhhgtgfeyxiexzf.m1549Ujhhgtgfeyxiexzf(list, i, keyEvent);
                }
                char c = zMo1554Ujhhgtgfeyxiexzf ? menuItemC0357Ujhhgtgfeyxiexzf.f2033Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf.f2031Ujhhgtgfeyxiexzf;
                if ((modifiers & 69647) == ((zMo1554Ujhhgtgfeyxiexzf ? menuItemC0357Ujhhgtgfeyxiexzf.f2034Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf.f2032Ujhhgtgfeyxiexzf) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo1554Ujhhgtgfeyxiexzf && c == '\b' && i == 67)) && menuItemC0357Ujhhgtgfeyxiexzf.isEnabled()) {
                        list.add(menuItemC0357Ujhhgtgfeyxiexzf);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1550Ujhhgtgfeyxiexzf() {
        ArrayList arrayListM1552Ujhhgtgfeyxiexzf = m1552Ujhhgtgfeyxiexzf();
        if (this.f2014Ujhhgtgfeyxiexzf) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2021Ujhhgtgfeyxiexzf;
            boolean zMo1595Ujhhgtgfeyxiexzf = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
                if (interfaceC0368Ujhhgtgfeyxiexzf == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1595Ujhhgtgfeyxiexzf |= interfaceC0368Ujhhgtgfeyxiexzf.mo1595Ujhhgtgfeyxiexzf();
                }
            }
            ArrayList arrayList = this.f2012Ujhhgtgfeyxiexzf;
            ArrayList arrayList2 = this.f2013Ujhhgtgfeyxiexzf;
            if (zMo1595Ujhhgtgfeyxiexzf) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM1552Ujhhgtgfeyxiexzf.size();
                for (int i = 0; i < size; i++) {
                    MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayListM1552Ujhhgtgfeyxiexzf.get(i);
                    if ((menuItemC0357Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf & 32) == 32) {
                        arrayList.add(menuItemC0357Ujhhgtgfeyxiexzf);
                    } else {
                        arrayList2.add(menuItemC0357Ujhhgtgfeyxiexzf);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m1552Ujhhgtgfeyxiexzf());
            }
            this.f2014Ujhhgtgfeyxiexzf = false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ArrayList m1552Ujhhgtgfeyxiexzf() {
        boolean z = this.f2011Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f2010Ujhhgtgfeyxiexzf;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList2.get(i);
            if (menuItemC0357Ujhhgtgfeyxiexzf.isVisible()) {
                arrayList.add(menuItemC0357Ujhhgtgfeyxiexzf);
            }
        }
        this.f2011Ujhhgtgfeyxiexzf = false;
        this.f2014Ujhhgtgfeyxiexzf = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo1553Ujhhgtgfeyxiexzf() {
        return this.f2023Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean mo1554Ujhhgtgfeyxiexzf() {
        return this.f2006Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean mo1555Ujhhgtgfeyxiexzf() {
        return this.f2007Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1556Ujhhgtgfeyxiexzf(boolean z) {
        if (this.f2016Ujhhgtgfeyxiexzf) {
            this.f2017Ujhhgtgfeyxiexzf = true;
            if (z) {
                this.f2018Ujhhgtgfeyxiexzf = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2011Ujhhgtgfeyxiexzf = true;
            this.f2014Ujhhgtgfeyxiexzf = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2021Ujhhgtgfeyxiexzf;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m1560Ujhhgtgfeyxiexzf();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
            if (interfaceC0368Ujhhgtgfeyxiexzf == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0368Ujhhgtgfeyxiexzf.mo1593Ujhhgtgfeyxiexzf(z);
            }
        }
        m1559Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m1557Ujhhgtgfeyxiexzf(MenuItem menuItem, InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf, int i) {
        boolean zExpandActionView;
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) menuItem;
        boolean zMo1594Ujhhgtgfeyxiexzf = false;
        if (menuItemC0357Ujhhgtgfeyxiexzf == null || !menuItemC0357Ujhhgtgfeyxiexzf.isEnabled()) {
            return false;
        }
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC0357Ujhhgtgfeyxiexzf.f2039Ujhhgtgfeyxiexzf;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC0357Ujhhgtgfeyxiexzf)) && !menuC0355Ujhhgtgfeyxiexzf.mo1546Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItemC0357Ujhhgtgfeyxiexzf)) {
            Intent intent = menuItemC0357Ujhhgtgfeyxiexzf.f2030Ujhhgtgfeyxiexzf;
            if (intent != null) {
                try {
                    menuC0355Ujhhgtgfeyxiexzf.f2004Ujhhgtgfeyxiexzf.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    zExpandActionView = false;
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((menuItemC0357Ujhhgtgfeyxiexzf.f2048feyxiexzfUjhhgtg & 8) != 0 && menuItemC0357Ujhhgtgfeyxiexzf.f2049feyxiexzfUjhhgtg != null) {
            zExpandActionView |= menuItemC0357Ujhhgtgfeyxiexzf.expandActionView();
            if (zExpandActionView) {
                m1544Ujhhgtgfeyxiexzf(true);
            }
        } else if (menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu()) {
            if ((i & 4) == 0) {
                m1544Ujhhgtgfeyxiexzf(false);
            }
            if (!menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu()) {
                SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg = new SubMenuC1191feyxiexzfUjhhgtg(this.f2004Ujhhgtgfeyxiexzf, this, menuItemC0357Ujhhgtgfeyxiexzf);
                menuItemC0357Ujhhgtgfeyxiexzf.f2038Ujhhgtgfeyxiexzf = subMenuC1191feyxiexzfUjhhgtg;
                subMenuC1191feyxiexzfUjhhgtg.setHeaderTitle(menuItemC0357Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
            }
            SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg2 = menuItemC0357Ujhhgtgfeyxiexzf.f2038Ujhhgtgfeyxiexzf;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2021Ujhhgtgfeyxiexzf;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1594Ujhhgtgfeyxiexzf = interfaceC0368Ujhhgtgfeyxiexzf != null ? interfaceC0368Ujhhgtgfeyxiexzf.mo1594Ujhhgtgfeyxiexzf(subMenuC1191feyxiexzfUjhhgtg2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf2 = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
                    if (interfaceC0368Ujhhgtgfeyxiexzf2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1594Ujhhgtgfeyxiexzf) {
                        zMo1594Ujhhgtgfeyxiexzf = interfaceC0368Ujhhgtgfeyxiexzf2.mo1594Ujhhgtgfeyxiexzf(subMenuC1191feyxiexzfUjhhgtg2);
                    }
                }
            }
            zExpandActionView |= zMo1594Ujhhgtgfeyxiexzf;
            if (!zExpandActionView) {
                m1544Ujhhgtgfeyxiexzf(true);
            }
        } else if ((i & 1) == 0) {
            m1544Ujhhgtgfeyxiexzf(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m1558Ujhhgtgfeyxiexzf(int i, CharSequence charSequence, int i2, View view) {
        if (view != null) {
            this.f2015Ujhhgtgfeyxiexzf = null;
        } else {
            if (i > 0) {
                this.f2015Ujhhgtgfeyxiexzf = this.f2005Ujhhgtgfeyxiexzf.getText(i);
            } else if (charSequence != null) {
                this.f2015Ujhhgtgfeyxiexzf = charSequence;
            }
            if (i2 > 0) {
                this.f2004Ujhhgtgfeyxiexzf.getDrawable(i2);
            }
        }
        m1556Ujhhgtgfeyxiexzf(false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1559Ujhhgtgfeyxiexzf() {
        this.f2016Ujhhgtgfeyxiexzf = false;
        if (this.f2017Ujhhgtgfeyxiexzf) {
            this.f2017Ujhhgtgfeyxiexzf = false;
            m1556Ujhhgtgfeyxiexzf(this.f2018Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m1560Ujhhgtgfeyxiexzf() {
        if (this.f2016Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f2016Ujhhgtgfeyxiexzf = true;
        this.f2017Ujhhgtgfeyxiexzf = false;
        this.f2018Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return mo1542Ujhhgtgfeyxiexzf(0, 0, 0, this.f2005Ujhhgtgfeyxiexzf.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2005Ujhhgtgfeyxiexzf.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1542Ujhhgtgfeyxiexzf(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf = mo1542Ujhhgtgfeyxiexzf(i, i2, i3, charSequence);
        SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg = new SubMenuC1191feyxiexzfUjhhgtg(this.f2004Ujhhgtgfeyxiexzf, this, menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf);
        menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf.f2038Ujhhgtgfeyxiexzf = subMenuC1191feyxiexzfUjhhgtg;
        subMenuC1191feyxiexzfUjhhgtg.setHeaderTitle(menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        return subMenuC1191feyxiexzfUjhhgtg;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo1542Ujhhgtgfeyxiexzf(i, i2, i3, this.f2005Ujhhgtgfeyxiexzf.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2005Ujhhgtgfeyxiexzf.getString(i4));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MenuC0355Ujhhgtgfeyxiexzf mo1551Ujhhgtgfeyxiexzf() {
        return this;
    }
}
