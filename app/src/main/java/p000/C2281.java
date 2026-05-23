package p000;

import java.io.IOException;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2281 extends AbstractC1823 implements InterfaceC1593 {

    public static final C2281 f7376 = new C2281();

    @Override // p000.InterfaceC1593
    public final void mo2039(MsgInfoBean msgInfoBean) throws IOException {
        for (C2355 c2355 : AbstractC2371.f7619) {
            
            c2355.m4332("onHandleMsg", msgInfoBean);
        }
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
