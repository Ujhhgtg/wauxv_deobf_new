package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᲁᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2037 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public CharSequence f6779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f6780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public View f6781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public String f6782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC1422 f6783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f6784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String f6785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC1422 f6786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f6787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public String f6788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public InterfaceC1422 f6789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f6790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C3620 f6791;

    public C2037() {
        String[] strArr = AbstractC1471.f5234;
        this.f6782 = "确定";
        this.f6785 = "取消";
        this.f6788 = "中立";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4053(C2037 c2037, C3620 c3620, int i) {
        String str = "取消";
        InterfaceC1422 c1356 = c3620;
        if ((i & 2) != 0) {
            c1356 = new C1356(23);
        }
        c2037.f6785 = str;
        c2037.f6786 = c1356;
        c2037.f6787 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m4054(C2037 c2037, C2070 c2070, int i) {
        String str = "确定";
        InterfaceC1422 c1356 = c2070;
        if ((i & 2) != 0) {
            c1356 = new C1356(23);
        }
        c2037.m4057(str, c1356);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1993 m4055() {
        CharSequence charSequence = this.f6779;
        String str = this.f6780;
        View view = this.f6781;
        C1993 c1993 = new C1993();
        if (charSequence != null) {
            c1993.f6606 = charSequence;
            c1993.m3984();
        }
        if (str != null) {
            c1993.f6607 = str.toString();
            c1993.m3984();
        }
        if (view != null) {
            C2036 c2036 = new C2036();
            c2036.f6315 = view;
            c1993.f6602 = c2036;
            c1993.m3984();
        }
        if (this.f6784) {
            String str2 = this.f6782;
            C2035 c2035 = new C2035(this, 0);
            c1993.f6608 = str2;
            c1993.f6613 = c2035;
            c1993.m3984();
        }
        if (this.f6787) {
            String str3 = this.f6785;
            C2035 c2037 = new C2035(this, 1);
            c1993.f6609 = str3;
            c1993.f6614 = c2037;
            c1993.m3984();
        }
        if (this.f6790) {
            String str4 = this.f6788;
            C2035 c2038 = new C2035(this, 2);
            c1993.f6610 = str4;
            c1993.f6615 = c2038;
            c1993.m3984();
        }
        c1993.f6605 = new C0441(this);
        return c1993;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4056(String str, InterfaceC1422 interfaceC1422) {
        this.f6788 = str;
        this.f6789 = interfaceC1422;
        this.f6790 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4057(String str, InterfaceC1422 interfaceC1422) {
        this.f6782 = str;
        this.f6783 = interfaceC1422;
        this.f6784 = true;
    }
}
