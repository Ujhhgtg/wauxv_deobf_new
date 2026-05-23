package p000;

import androidx.lifecycle.C0000;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᛸᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0938 extends AbstractC2202 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3437;

    public /* synthetic */ C0938(int i, Object obj) {
        this.f3436 = i;
        this.f3437 = obj;
    }

    @Override // p000.AbstractC2202
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void mo2434() {
        int i = this.f3436;
        Object obj = this.f3437;
        EnumC1770 enumC1770 = EnumC1770.f5891;
        switch (i) {
            case 0:
                C0943 c0943 = (C0943) ((C0662) obj).f2532;
                c0943.f916 = false;
                try {
                    C0000 c0000 = new C0937().f3435;
                    if (c0000.f300 != enumC1770) {
                        c0000.m99("setCurrentState");
                        c0000.m101(enumC1770);
                    }
                    break;
                } catch (Exception unused) {
                }
                AbstractC2205 abstractC2205 = AbstractC1034.f3778;
                c0943.m761(enumC1770);
                c0943.f3448 = null;
                break;
            default:
                C1962 c1962 = ((C1961) obj).f6495;
                c1962.f916 = false;
                C0937 c0937 = new C0937();
                C1962 c1963 = c1962.f6498;
                try {
                    C0000 c0001 = c0937.f3435;
                    if (c0001.f300 != enumC1770) {
                        c0001.m99("setCurrentState");
                        c0001.m101(enumC1770);
                    }
                    break;
                } catch (Exception unused2) {
                }
                AbstractC2205 abstractC2206 = AbstractC1034.f3778;
                C1962 c1964 = c1962.f6498;
                c1962.m761(enumC1770);
                
                break;
        }
    }

    @Override // p000.AbstractC2202
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void mo2435() {
        int i = this.f3436;
        EnumC1770 enumC1770 = EnumC1770.f5893;
        Object obj = this.f3437;
        int i2 = 1;
        switch (i) {
            case 0:
                C0662 c0662 = (C0662) obj;
                C0943 c0943 = (C0943) c0662.f2532;
                c0943.f916 = true;
                c0943.m761(enumC1770);
                try {
                    C0000 c0000 = new C0937().f3435;
                    if (c0000.f300 != enumC1770) {
                        c0000.m99("setCurrentState");
                        c0000.m101(enumC1770);
                    }
                    break;
                } catch (Exception unused) {
                }
                AbstractC2205 abstractC2205 = AbstractC1034.f3778;
                C0466 c0466 = c0943.f912;
                if (c0466 != null) {
                    c0466.m1692(c0943);
                }
                ((MaxRelativeLayout) c0662.f2531).setVisibility(8);
                break;
            default:
                C1961 c1961 = (C1961) obj;
                C1962 c1962 = c1961.f6495;
                c1962.f916 = true;
                c1962.m761(enumC1770);
                C0466 c0467 = c1962.f912;
                if (c0467 != null) {
                    c0467.m1692(c1962);
                }
                
                C0937 c0937 = new C0937();
                C1962 c1963 = c1962.f6498;
                try {
                    C0000 c0001 = c0937.f3435;
                    if (c0001.f300 != enumC1770) {
                        c0001.m99("setCurrentState");
                        c0001.m101(enumC1770);
                    }
                    break;
                } catch (Exception unused2) {
                }
                AbstractC2205 abstractC2206 = AbstractC1034.f3778;
                C1962 c1964 = c1962.f6498;
                if (c1962.f6499 == null) {
                    c1962.f6499 = new C0942(1, c1961);
                }
                c1962.f6499.m2437(c1964);
                
                if (c1962.f918) {
                    c1961.f6488.postDelayed(new RunnableC0141(11, this), 300L);
                }
                break;
        }
    }
}
