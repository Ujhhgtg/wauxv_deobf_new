package p000;

import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1345 extends AbstractC0592 {

    public final /* synthetic */ C1348 f4815;

    public final /* synthetic */ C1349 f4816;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345(C1349 c1349, C1348 c1348) {
        super(1);
        this.f4816 = c1349;
        this.f4815 = c1348;
    }

    @Override // p000.AbstractC0592
    public final void mo2019() {
        int i = 0;
        this.f4816.f4826 = false;
    }

    @Override // p000.AbstractC0592
    public final void mo2020() {
        this.f4816.f4826 = true;
    }

    @Override // p000.AbstractC0592
    public final C3669 mo2021(C3669 c3669, List list) {
        Objects.toString(c3669);
        C1349 c1349 = this.f4816;
        
        int i = 0;
        
        c1349.m3057(c3669, new C1348(this.f4815));
        return c3669;
    }
}
