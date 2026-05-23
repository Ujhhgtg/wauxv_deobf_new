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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᛸᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1944 implements Menu {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final int[] f6406 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f6407;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Resources f6408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f6409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f6410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC1942 f6411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f6412;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f6413;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f6414;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ArrayList f6415;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f6416;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f6417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public CharSequence f6418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public MenuItemC1946 f6425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f6419 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f6420 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f6421 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f6422 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ArrayList f6423 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6424 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f6426 = false;

    public MenuC1944(Context context) {
        boolean zM2646;
        boolean z = false;
        this.f6407 = context;
        Resources resources = context.getResources();
        this.f6408 = resources;
        this.f6412 = new ArrayList();
        this.f6413 = new ArrayList();
        this.f6414 = true;
        this.f6415 = new ArrayList();
        this.f6416 = new ArrayList();
        this.f6417 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM2646 = AbstractC1076.m2646(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM2646 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM2646) {
                z = true;
            }
        }
        this.f6410 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return mo3754(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f6407.getPackageManager();
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
            MenuItemC1946 menuItemC1946Mo3754 = mo3754(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC1946Mo3754.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC1946Mo3754.f6433 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = menuItemC1946Mo3754;
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
        MenuItemC1946 menuItemC1946 = this.f6425;
        if (menuItemC1946 != null) {
            mo3757(menuItemC1946);
        }
        this.f6412.clear();
        m3768(true);
    }

    public final void clearHeader() {
        this.f6418 = null;
        m3768(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3756(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i2);
            if (menuItemC1946.f6427 == i) {
                return menuItemC1946;
            }
            if (menuItemC1946.hasSubMenu() && (menuItemFindItem = menuItemC1946.f6441.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f6412.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemC1946) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3760(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m3769(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemC1946 menuItemC1946M3760 = m3760(i, keyEvent);
        boolean zM3769 = menuItemC1946M3760 != null ? m3769(menuItemC1946M3760, null, i2) : false;
        if ((i2 & 2) != 0) {
            m3756(true);
        }
        return zM3769;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemC1946) arrayList.get(i3)).f6428 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((MenuItemC1946) arrayList.get(i3)).f6428 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m3768(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemC1946) arrayList.get(i2)).f6427 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m3768(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i2);
            if (menuItemC1946.f6428 == i) {
                menuItemC1946.m3776(z2);
                menuItemC1946.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f6426 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i2);
            if (menuItemC1946.f6428 == i) {
                menuItemC1946.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f6412;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i2);
            if (menuItemC1946.f6428 == i) {
                int i3 = menuItemC1946.f6450;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                menuItemC1946.f6450 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m3768(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f6409 = z;
        m3768(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6412.size();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public MenuItemC1946 mo3754(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f6406[i5] << 16) | (65535 & i3);
        MenuItemC1946 menuItemC1946 = new MenuItemC1946(this, i, i2, i3, i6, charSequence);
        ArrayList arrayList = this.f6412;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemC1946) arrayList.get(size)).f6430 <= i6) {
                i4 = size + 1;
                arrayList.add(i4, menuItemC1946);
                m3768(true);
                return menuItemC1946;
            }
        }
        i4 = 0;
        arrayList.add(i4, menuItemC1946);
        m3768(true);
        return menuItemC1946;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3755(InterfaceC1955 interfaceC1955, Context context) {
        this.f6424.add(new WeakReference(interfaceC1955));
        interfaceC1955.mo1147(context, this);
        this.f6417 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3756(boolean z) {
        if (this.f6422) {
            return;
        }
        this.f6422 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6424;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
            if (interfaceC1955 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1955.mo1136(this, z);
            }
        }
        this.f6422 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean mo3757(MenuItemC1946 menuItemC1946) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6424;
        boolean zMo1142 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6425 == menuItemC1946) {
            m3772();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
                if (interfaceC1955 != null) {
                    zMo1142 = interfaceC1955.mo1142(menuItemC1946);
                    if (zMo1142) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m3771();
            if (zMo1142) {
                this.f6425 = null;
            }
        }
        return zMo1142;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean mo3758(MenuC1944 menuC1944, MenuItem menuItem) {
        InterfaceC1942 interfaceC1942 = this.f6411;
        return interfaceC1942 != null && interfaceC1942.mo1101(menuItem);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean mo3759(MenuItemC1946 menuItemC1946) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6424;
        boolean zMo1145 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3772();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
            if (interfaceC1955 != null) {
                zMo1145 = interfaceC1955.mo1145(menuItemC1946);
                if (zMo1145) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m3771();
        if (zMo1145) {
            this.f6425 = menuItemC1946;
        }
        return zMo1145;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final MenuItemC1946 m3760(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6423;
        arrayList.clear();
        m3761(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC1946) arrayList.get(0);
        }
        boolean zMo3766 = mo3766();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i2);
            char c = zMo3766 ? menuItemC1946.f6436 : menuItemC1946.f6434;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo3766 && c == '\b' && i == 67))) {
                return menuItemC1946;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3761(List list, int i, KeyEvent keyEvent) {
        boolean zMo3766 = mo3766();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f6412;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i2);
                if (menuItemC1946.hasSubMenu()) {
                    menuItemC1946.f6441.m3761(list, i, keyEvent);
                }
                char c = zMo3766 ? menuItemC1946.f6436 : menuItemC1946.f6434;
                if ((modifiers & 69647) == ((zMo3766 ? menuItemC1946.f6437 : menuItemC1946.f6435) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo3766 && c == '\b' && i == 67)) && menuItemC1946.isEnabled()) {
                        list.add(menuItemC1946);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3762() {
        ArrayList arrayListM3764 = m3764();
        if (this.f6417) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6424;
            boolean zMo1139 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
                if (interfaceC1955 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1139 |= interfaceC1955.mo1139();
                }
            }
            ArrayList arrayList = this.f6415;
            ArrayList arrayList2 = this.f6416;
            if (zMo1139) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM3764.size();
                for (int i = 0; i < size; i++) {
                    MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayListM3764.get(i);
                    if ((menuItemC1946.f6450 & 32) == 32) {
                        arrayList.add(menuItemC1946);
                    } else {
                        arrayList2.add(menuItemC1946);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m3764());
            }
            this.f6417 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList m3764() {
        boolean z = this.f6414;
        ArrayList arrayList = this.f6413;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f6412;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList2.get(i);
            if (menuItemC1946.isVisible()) {
                arrayList.add(menuItemC1946);
            }
        }
        this.f6414 = false;
        this.f6417 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean mo3765() {
        return this.f6426;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean mo3766() {
        return this.f6409;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean mo3767() {
        return this.f6410;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3768(boolean z) {
        if (this.f6419) {
            this.f6420 = true;
            if (z) {
                this.f6421 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f6414 = true;
            this.f6417 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6424;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m3772();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
            if (interfaceC1955 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1955.mo1137(z);
            }
        }
        m3771();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean m3769(MenuItem menuItem, InterfaceC1955 interfaceC1955, int i) {
        boolean zExpandActionView;
        MenuItemC1946 menuItemC1946 = (MenuItemC1946) menuItem;
        boolean zMo1138 = false;
        if (menuItemC1946 == null || !menuItemC1946.isEnabled()) {
            return false;
        }
        MenuC1944 menuC1944 = menuItemC1946.f6440;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC1946.f6442;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC1946)) && !menuC1944.mo3758(menuC1944, menuItemC1946)) {
            Intent intent = menuItemC1946.f6433;
            if (intent != null) {
                try {
                    menuC1944.f6407.startActivity(intent);
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
        if ((menuItemC1946.f6451 & 8) != 0 && menuItemC1946.f6452 != null) {
            zExpandActionView |= menuItemC1946.expandActionView();
            if (zExpandActionView) {
                m3756(true);
            }
        } else if (menuItemC1946.hasSubMenu()) {
            if ((i & 4) == 0) {
                m3756(false);
            }
            if (!menuItemC1946.hasSubMenu()) {
                SubMenuC2853 subMenuC2853 = new SubMenuC2853(this.f6407, this, menuItemC1946);
                menuItemC1946.f6441 = subMenuC2853;
                subMenuC2853.setHeaderTitle(menuItemC1946.f6431);
            }
            SubMenuC2853 subMenuC2854 = menuItemC1946.f6441;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6424;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1138 = interfaceC1955 != null ? interfaceC1955.mo1138(subMenuC2854) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC1955 interfaceC1956 = (InterfaceC1955) weakReference.get();
                    if (interfaceC1956 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1138) {
                        zMo1138 = interfaceC1956.mo1138(subMenuC2854);
                    }
                }
            }
            zExpandActionView |= zMo1138;
            if (!zExpandActionView) {
                m3756(true);
            }
        } else if ((i & 1) == 0) {
            m3756(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3770(int i, CharSequence charSequence, int i2, View view) {
        if (view != null) {
            this.f6418 = null;
        } else {
            if (i > 0) {
                this.f6418 = this.f6408.getText(i);
            } else if (charSequence != null) {
                this.f6418 = charSequence;
            }
            if (i2 > 0) {
                this.f6407.getDrawable(i2);
            }
        }
        m3768(false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3771() {
        this.f6419 = false;
        if (this.f6420) {
            this.f6420 = false;
            m3768(this.f6421);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m3772() {
        if (this.f6419) {
            return;
        }
        this.f6419 = true;
        this.f6420 = false;
        this.f6421 = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return mo3754(0, 0, 0, this.f6408.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f6408.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3754(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemC1946 menuItemC1946Mo3754 = mo3754(i, i2, i3, charSequence);
        SubMenuC2853 subMenuC2853 = new SubMenuC2853(this.f6407, this, menuItemC1946Mo3754);
        menuItemC1946Mo3754.f6441 = subMenuC2853;
        subMenuC2853.setHeaderTitle(menuItemC1946Mo3754.f6431);
        return subMenuC2853;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo3754(i, i2, i3, this.f6408.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f6408.getString(i4));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public MenuC1944 mo3763() {
        return this;
    }
}
