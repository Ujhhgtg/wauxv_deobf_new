package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p000.AbstractC2411;
import p000.C2102;
import p000.InterfaceC1636;
import p000.RunnableC2410;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1636 {
    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final List mo92() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo93(Context context) {
        AbstractC2411.m4376(new RunnableC2410(this, context.getApplicationContext()));
        return new C2102(9);
    }
}
