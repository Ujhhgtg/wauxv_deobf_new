package p000;

import android.widget.LinearLayout;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2007 {

    public CharSequence f6678;

    public String f6679;

    public LinearLayout f6680;

    public String f6681;

    public InterfaceC1414 f6682;

    public boolean f6683;

    public String f6684;

    public InterfaceC1414 f6685;

    public boolean f6686;

    public String f6687;

    public InterfaceC1414 f6688;

    public boolean f6689;

    public C3561 f6690;

    public C2007() {
        String[] strArr = AbstractC1574.f5469;
        this.f6681 = "确定";
        this.f6684 = "取消";
        this.f6687 = "中立";
    }

    public static void m3866(C2007 c2007, C3561 c3561, int i) {
        String str = "取消";
        InterfaceC1414 c1354 = c3561;
        if ((i & 2) != 0) {
            c1354 = new C1354(22);
        }
        c2007.f6684 = "取消";
        c2007.f6685 = c1354;
        c2007.f6686 = true;
    }

    public static void m3867(C2007 c2007, C2042 c2042, int i) {
        String str = "确定";
        InterfaceC1414 c1354 = c2042;
        if ((i & 2) != 0) {
            c1354 = new C1354(22);
        }
        c2007.m3870("确定", c1354);
    }

    public final C1962 m3868() {
        CharSequence charSequence = this.f6678;
        String str = this.f6679;
        LinearLayout linearLayout = this.f6680;
        C1962 c1962 = new C1962();
        if (charSequence != null) {
            c1962.f6501 = charSequence;
            c1962.m3790();
        }
        if (str != null) {
            c1962.f6502 = str.toString();
            c1962.m3790();
        }
        if (linearLayout != null) {
            C2006 c2006 = new C2006();
            c2006.f6241 = linearLayout;
            c1962.f6497 = c2006;
            c1962.m3790();
        }
        if (this.f6683) {
            String str2 = this.f6681;
            C2005 c2005 = new C2005(this, 0);
            c1962.f6503 = str2;
            c1962.f6508 = c2005;
            c1962.m3790();
        }
        if (this.f6686) {
            String str3 = this.f6684;
            C2005 c2007 = new C2005(this, 1);
            c1962.f6504 = str3;
            c1962.f6509 = c2007;
            c1962.m3790();
        }
        if (this.f6689) {
            String str4 = this.f6687;
            C2005 c2008 = new C2005(this, 2);
            c1962.f6505 = str4;
            c1962.f6510 = c2008;
            c1962.m3790();
        }
        c1962.f6500 = new C0466(this);
        return c1962;
    }

    public final void m3869(String str, InterfaceC1414 interfaceC1414) {
        this.f6687 = str;
        this.f6688 = interfaceC1414;
        this.f6689 = true;
    }

    public final void m3870(String str, InterfaceC1414 interfaceC1414) {
        this.f6681 = str;
        this.f6682 = interfaceC1414;
        this.f6683 = true;
    }
}
