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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᤝᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1975 implements Menu {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final int[] f6511 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f6512;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Resources f6513;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f6514;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f6515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC1973 f6516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f6517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f6518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f6519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ArrayList f6520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f6521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f6522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public CharSequence f6523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public MenuItemC1977 f6530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f6524 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f6525 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f6526 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f6527 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ArrayList f6528 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6529 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f6531 = false;

    public MenuC1975(Context context) {
        boolean zM2772;
        boolean z = false;
        this.f6512 = context;
        Resources resources = context.getResources();
        this.f6513 = resources;
        this.f6517 = new ArrayList();
        this.f6518 = new ArrayList();
        this.f6519 = true;
        this.f6520 = new ArrayList();
        this.f6521 = new ArrayList();
        this.f6522 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM2772 = AbstractC1081.m2772(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM2772 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM2772) {
                z = true;
            }
        }
        this.f6515 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return mo3948(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f6512.getPackageManager();
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
            MenuItemC1977 menuItemC1977Mo3948 = mo3948(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC1977Mo3948.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC1977Mo3948.f6538 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = menuItemC1977Mo3948;
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
        MenuItemC1977 menuItemC1977 = this.f6530;
        if (menuItemC1977 != null) {
            mo3951(menuItemC1977);
        }
        this.f6517.clear();
        m3962(true);
    }

    public final void clearHeader() {
        this.f6523 = null;
        m3962(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3950(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i2);
            if (menuItemC1977.f6532 == i) {
                return menuItemC1977;
            }
            if (menuItemC1977.hasSubMenu() && (menuItemFindItem = menuItemC1977.f6546.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f6517.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemC1977) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3954(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m3963(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemC1977 menuItemC1977M3954 = m3954(i, keyEvent);
        boolean zM3963 = menuItemC1977M3954 != null ? m3963(menuItemC1977M3954, null, i2) : false;
        if ((i2 & 2) != 0) {
            m3950(true);
        }
        return zM3963;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemC1977) arrayList.get(i3)).f6533 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((MenuItemC1977) arrayList.get(i3)).f6533 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m3962(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemC1977) arrayList.get(i2)).f6532 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m3962(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i2);
            if (menuItemC1977.f6533 == i) {
                menuItemC1977.m3970(z2);
                menuItemC1977.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f6531 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i2);
            if (menuItemC1977.f6533 == i) {
                menuItemC1977.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f6517;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i2);
            if (menuItemC1977.f6533 == i) {
                int i3 = menuItemC1977.f6555;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                menuItemC1977.f6555 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m3962(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f6514 = z;
        m3962(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6517.size();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public MenuItemC1977 mo3948(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f6511[i5] << 16) | (65535 & i3);
        MenuItemC1977 menuItemC1977 = new MenuItemC1977(this, i, i2, i3, i6, charSequence);
        ArrayList arrayList = this.f6517;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemC1977) arrayList.get(size)).f6535 <= i6) {
                i4 = size + 1;
                arrayList.add(i4, menuItemC1977);
                m3962(true);
                return menuItemC1977;
            }
        }
        i4 = 0;
        arrayList.add(i4, menuItemC1977);
        m3962(true);
        return menuItemC1977;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3949(InterfaceC1986 interfaceC1986, Context context) {
        this.f6529.add(new WeakReference(interfaceC1986));
        interfaceC1986.mo1293(context, this);
        this.f6522 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3950(boolean z) {
        if (this.f6527) {
            return;
        }
        this.f6527 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6529;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
            if (interfaceC1986 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1986.mo1282(this, z);
            }
        }
        this.f6527 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean mo3951(MenuItemC1977 menuItemC1977) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6529;
        boolean zMo1288 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6530 == menuItemC1977) {
            m3966();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
                if (interfaceC1986 != null) {
                    zMo1288 = interfaceC1986.mo1288(menuItemC1977);
                    if (zMo1288) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m3965();
            if (zMo1288) {
                this.f6530 = null;
            }
        }
        return zMo1288;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean mo3952(MenuC1975 menuC1975, MenuItem menuItem) {
        InterfaceC1973 interfaceC1973 = this.f6516;
        return interfaceC1973 != null && interfaceC1973.mo1247(menuItem);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean mo3953(MenuItemC1977 menuItemC1977) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6529;
        boolean zMo1291 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3966();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
            if (interfaceC1986 != null) {
                zMo1291 = interfaceC1986.mo1291(menuItemC1977);
                if (zMo1291) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m3965();
        if (zMo1291) {
            this.f6530 = menuItemC1977;
        }
        return zMo1291;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final MenuItemC1977 m3954(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6528;
        arrayList.clear();
        m3955(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC1977) arrayList.get(0);
        }
        boolean zMo3960 = mo3960();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i2);
            char c = zMo3960 ? menuItemC1977.f6541 : menuItemC1977.f6539;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo3960 && c == '\b' && i == 67))) {
                return menuItemC1977;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3955(List list, int i, KeyEvent keyEvent) {
        boolean zMo3960 = mo3960();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f6517;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i2);
                if (menuItemC1977.hasSubMenu()) {
                    menuItemC1977.f6546.m3955(list, i, keyEvent);
                }
                char c = zMo3960 ? menuItemC1977.f6541 : menuItemC1977.f6539;
                if ((modifiers & 69647) == ((zMo3960 ? menuItemC1977.f6542 : menuItemC1977.f6540) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo3960 && c == '\b' && i == 67)) && menuItemC1977.isEnabled()) {
                        list.add(menuItemC1977);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3956() {
        ArrayList arrayListM3958 = m3958();
        if (this.f6522) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6529;
            boolean zMo1285 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
                if (interfaceC1986 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1285 |= interfaceC1986.mo1285();
                }
            }
            ArrayList arrayList = this.f6520;
            ArrayList arrayList2 = this.f6521;
            if (zMo1285) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM3958.size();
                for (int i = 0; i < size; i++) {
                    MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayListM3958.get(i);
                    if ((menuItemC1977.f6555 & 32) == 32) {
                        arrayList.add(menuItemC1977);
                    } else {
                        arrayList2.add(menuItemC1977);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m3958());
            }
            this.f6522 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList m3958() {
        boolean z = this.f6519;
        ArrayList arrayList = this.f6518;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f6517;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList2.get(i);
            if (menuItemC1977.isVisible()) {
                arrayList.add(menuItemC1977);
            }
        }
        this.f6519 = false;
        this.f6522 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean mo3959() {
        return this.f6531;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean mo3960() {
        return this.f6514;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean mo3961() {
        return this.f6515;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3962(boolean z) {
        if (this.f6524) {
            this.f6525 = true;
            if (z) {
                this.f6526 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f6519 = true;
            this.f6522 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6529;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m3966();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
            if (interfaceC1986 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1986.mo1283(z);
            }
        }
        m3965();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean m3963(MenuItem menuItem, InterfaceC1986 interfaceC1986, int i) {
        boolean zExpandActionView;
        MenuItemC1977 menuItemC1977 = (MenuItemC1977) menuItem;
        boolean zMo1284 = false;
        if (menuItemC1977 == null || !menuItemC1977.isEnabled()) {
            return false;
        }
        MenuC1975 menuC1975 = menuItemC1977.f6545;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC1977.f6547;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC1977)) && !menuC1975.mo3952(menuC1975, menuItemC1977)) {
            Intent intent = menuItemC1977.f6538;
            if (intent != null) {
                try {
                    menuC1975.f6512.startActivity(intent);
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
        if ((menuItemC1977.f6556 & 8) != 0 && menuItemC1977.f6557 != null) {
            zExpandActionView |= menuItemC1977.expandActionView();
            if (zExpandActionView) {
                m3950(true);
            }
        } else if (menuItemC1977.hasSubMenu()) {
            if ((i & 4) == 0) {
                m3950(false);
            }
            if (!menuItemC1977.hasSubMenu()) {
                SubMenuC2913 subMenuC2913 = new SubMenuC2913(this.f6512, this, menuItemC1977);
                menuItemC1977.f6546 = subMenuC2913;
                subMenuC2913.setHeaderTitle(menuItemC1977.f6536);
            }
            SubMenuC2913 subMenuC2914 = menuItemC1977.f6546;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f6529;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo1284 = interfaceC1986 != null ? interfaceC1986.mo1284(subMenuC2914) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    InterfaceC1986 interfaceC1987 = (InterfaceC1986) weakReference.get();
                    if (interfaceC1987 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1284) {
                        zMo1284 = interfaceC1987.mo1284(subMenuC2914);
                    }
                }
            }
            zExpandActionView |= zMo1284;
            if (!zExpandActionView) {
                m3950(true);
            }
        } else if ((i & 1) == 0) {
            m3950(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3964(int i, CharSequence charSequence, int i2, View view) {
        if (view != null) {
            this.f6523 = null;
        } else {
            if (i > 0) {
                this.f6523 = this.f6513.getText(i);
            } else if (charSequence != null) {
                this.f6523 = charSequence;
            }
            if (i2 > 0) {
                this.f6512.getDrawable(i2);
            }
        }
        m3962(false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3965() {
        this.f6524 = false;
        if (this.f6525) {
            this.f6525 = false;
            m3962(this.f6526);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m3966() {
        if (this.f6524) {
            return;
        }
        this.f6524 = true;
        this.f6525 = false;
        this.f6526 = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return mo3948(0, 0, 0, this.f6513.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f6513.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3948(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemC1977 menuItemC1977Mo3948 = mo3948(i, i2, i3, charSequence);
        SubMenuC2913 subMenuC2913 = new SubMenuC2913(this.f6512, this, menuItemC1977Mo3948);
        menuItemC1977Mo3948.f6546 = subMenuC2913;
        subMenuC2913.setHeaderTitle(menuItemC1977Mo3948.f6536);
        return subMenuC2913;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo3948(i, i2, i3, this.f6513.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f6513.getString(i4));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public MenuC1975 mo3957() {
        return this;
    }
}
