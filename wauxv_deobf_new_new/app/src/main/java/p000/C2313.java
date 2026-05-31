package p000;

import java.util.Iterator;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤝᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2313 extends AbstractC1850 implements InterfaceC1605 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2313 f7497 = new C2313();

    @Override // p000.InterfaceC1605
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final void mo2150(MsgInfoBean msgInfoBean) {
        Iterator it = AbstractC2419.m4354().iterator();
        while (it.hasNext()) {
            C2426 c2426M4355 = AbstractC2419.m4355((C2400) it.next());
            if (c2426M4355 != null) {
                c2426M4355.m4360("onHandleMsg", msgInfoBean);
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
