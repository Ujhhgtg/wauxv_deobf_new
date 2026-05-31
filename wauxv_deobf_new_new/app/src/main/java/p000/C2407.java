package p000;

import de.robv.android.xposed.XC_MethodHook;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2407 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final XC_MethodHook.Unhook f7715;

    public C2407(XC_MethodHook.Unhook unhook) {
        this.f7715 = unhook;
    }

    public final String toString() {
        return "HookHandle(delegate=" + this.f7715.getHookedMethod() + ')';
    }
}
