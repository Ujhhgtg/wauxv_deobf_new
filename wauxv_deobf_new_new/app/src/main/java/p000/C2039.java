package p000;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᲁᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2039 extends ContextThemeWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f6793 = 0;

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        C2034 c2034 = C2034.f6774;
        if (c2034 != null) {
            return c2034;
        }
        C2034 c2035 = new C2034();
        C2034.f6774 = c2035;
        return c2035;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return super.getResources();
    }
}
