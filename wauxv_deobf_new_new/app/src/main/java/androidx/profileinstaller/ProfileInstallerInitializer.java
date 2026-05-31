package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p000.AbstractC2464;
import p000.C2135;
import p000.InterfaceC1650;
import p000.RunnableC2463;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1650 {
    @Override // p000.InterfaceC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final List mo92() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo93(Context context) {
        AbstractC2464.m4397(new RunnableC2463(this, context.getApplicationContext()));
        return new C2135(9);
    }
}
