package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.umeng.analytics.pro.bc;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0085 {

    public static final C0085 f1027;

    public static final C0085 f1028;

    public static final C0085 f1029;

    public static final C0085 f1030;

    public static final C0085 f1031;

    public static final C0085 f1032;

    public static final C0085 f1033;

    public static final C0085 f1034;

    public static final C0085 f1035;

    public static final C0085 f1036;

    public static final C0085 f1037;

    public final Object f1038;

    public final int f1039;

    public final Class f1040;

    public final InterfaceC0102 f1041;

    /* JADX WARN: Code duplicated, block: B:62:0x0256  */
    static {
        boolean z;
        new C0085(1);
        new C0085(2);
        new C0085(4);
        new C0085(8);
        f1027 = new C0085(16);
        new C0085(32);
        new C0085(64);
        new C0085(128);
        new C0085(256, AbstractC0095.class);
        new C0085(512, AbstractC0095.class);
        new C0085(1024, AbstractC0096.class);
        new C0085(2048, AbstractC0096.class);
        f1028 = new C0085(4096);
        f1029 = new C0085(8192);
        new C0085(16384);
        new C0085(32768);
        new C0085(65536);
        new C0085(131072, AbstractC0100.class);
        f1030 = new C0085(262144);
        f1031 = new C0085(524288);
        f1032 = new C0085(1048576);
        new C0085(2097152, AbstractC0101.class);
        new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        f1033 = new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, AbstractC0098.class);
        f1034 = new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        f1035 = new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new C0085(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        new C0085(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
        new C0085(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        new C0085(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
        new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        f1036 = new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, AbstractC0099.class);
        new C0085(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, AbstractC0097.class);
        new C0085(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
        new C0085(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        new C0085(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        new C0085(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        new C0085(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
        new C0085(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
        new C0085(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
        new C0085(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        f1037 = new C0085(i >= 34 ? AbstractC0088.m1069() : null, 16908382, null, null, null);
        int i2 = 0;
        if (i >= 36) {
            z = (false ? i * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001;
        }
        new C0085(z ? AbstractC0090.m1084() : null, R.id.ALT, null, null, null);
    }

    public C0085(int i) {
        this(null, i, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0085)) {
            return false;
        }
        Object obj2 = ((C0085) obj).f1038;
        Object obj3 = this.f1038;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1038;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM1087 = C0092.m1087(this.f1039);
        if (strM1087.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1038;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM1087 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM1087);
        return sb.toString();
    }

    public final int m1062() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1038).getId();
    }

    public C0085(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0085(Object obj, int i, String str, InterfaceC0102 interfaceC0102, Class cls) {
        this.f1039 = i;
        this.f1041 = interfaceC0102;
        if (obj == null) {
            this.f1038 = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f1038 = obj;
        }
        this.f1040 = cls;
    }
}
