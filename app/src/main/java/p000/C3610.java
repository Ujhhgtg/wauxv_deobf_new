package p000;

import java.io.File;
import java.math.BigInteger;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤝᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3610 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f11281;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public String f11282;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public String f11283;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f11284;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public /* synthetic */ Object f11285;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f11286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f11287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f11288;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f11290;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3610(String str, String str2, String str3, String str4, String str5, InterfaceC0842 interfaceC0842, int i) {
        super(2, interfaceC0842);
        this.f11281 = i;
        this.f11286 = str;
        this.f11287 = str2;
        this.f11288 = str3;
        this.f11289 = str4;
        this.f11290 = str5;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f11281) {
            case 0:
                break;
        }
        return ((C3610) mo1197(interfaceC0842, interfaceC0883)).mo1198(C3497.f10997);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f11281) {
            case 0:
                C3610 c3610 = new C3610(this.f11286, this.f11287, this.f11288, this.f11289, this.f11290, interfaceC0842, 0);
                c3610.f11285 = obj;
                return c3610;
            default:
                C3610 c3611 = new C3610(this.f11286, this.f11287, this.f11288, this.f11289, this.f11290, interfaceC0842, 1);
                c3611.f11285 = obj;
                return c3611;
        }
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Exception {
        String str;
        Object objM3954;
        String str2;
        String str3;
        Object objM3955;
        String str4;
        int i = this.f11281;
        C3497 c3497 = C3497.f10997;
        String str5 = this.f11290;
        String str6 = this.f11289;
        EnumC0884 enumC0884 = EnumC0884.f3325;
        InterfaceC0842 interfaceC0842 = null;
        String str7 = this.f11286;
        String str8 = this.f11287;
        String str9 = this.f11288;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f11285;
                int i2 = this.f11284;
                if (i2 == 0) {
                    AbstractC0743.m2188(obj);
                    AbstractC2834.m4823(null, 3, "开始下载视频");
                    StringBuilder sb = new StringBuilder();
                    C3607 c3607 = C3607.f11267;
                    sb.append(c3607.m2542());
                    sb.append('/');
                    sb.append(str7);
                    sb.append('-');
                    sb.append(str8);
                    sb.append('-');
                    sb.append(str9);
                    sb.append(".tmp.mp4");
                    String string = sb.toString();
                    str = c3607.m2542() + '/' + str7 + '-' + str8 + ".decrypt.mp4";
                    String str10 = str6 + str5;
                    C2536 c2536 = new C2536(string, 5);
                    C1002 c1002 = AbstractC1075.f3893;
                    C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0883, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(str10, c2536, null, 6)));
                    this.f11285 = null;
                    this.f11282 = string;
                    this.f11283 = str;
                    this.f11284 = 1;
                    objM3954 = c2146.m3954(this);
                    if (objM3954 == enumC0884) {
                        return enumC0884;
                    }
                    str2 = string;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str11 = this.f11283;
                    str2 = this.f11282;
                    AbstractC0743.m2188(obj);
                    str = str11;
                    objM3954 = obj;
                }
                C1133.m2707(str2, str, new BigInteger(str9));
                ((File) objM3954).delete();
                AbstractC2834.m4823(null, 3, "下载视频完成");
                return c3497;
            default:
                String[] strArr2 = AbstractC1574.f5469;
                InterfaceC0883 interfaceC0884 = (InterfaceC0883) this.f11285;
                int i3 = this.f11284;
                if (i3 == 0) {
                    AbstractC0743.m2188(obj);
                    AbstractC2834.m4823(null, 3, "开始下载视频");
                    StringBuilder sb2 = new StringBuilder();
                    C3612 c3612 = C3612.f11297;
                    sb2.append(c3612.m2542());
                    sb2.append('/');
                    sb2.append(str7);
                    sb2.append('-');
                    sb2.append(str8);
                    sb2.append('-');
                    sb2.append(str9);
                    sb2.append(".tmp.mp4");
                    String string2 = sb2.toString();
                    str3 = c3612.m2542() + '/' + str7 + '-' + str8 + ".decrypt.mp4";
                    String str12 = str6 + str5;
                    C2536 c2537 = new C2536(string2, 8);
                    C1002 c1003 = AbstractC1075.f3893;
                    C2146 c2147 = new C2146(AbstractC2203.m4025(interfaceC0884, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(str12, c2537, interfaceC0842, 9)));
                    this.f11285 = null;
                    this.f11282 = string2;
                    this.f11283 = str3;
                    this.f11284 = 1;
                    objM3955 = c2147.m3954(this);
                    if (objM3955 == enumC0884) {
                        return enumC0884;
                    }
                    str4 = string2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str13 = this.f11283;
                    str4 = this.f11282;
                    AbstractC0743.m2188(obj);
                    str3 = str13;
                    objM3955 = obj;
                }
                C1133.m2707(str4, str3, new BigInteger(str9));
                ((File) objM3955).delete();
                AbstractC2834.m4823(null, 3, "下载视频完成");
                return c3497;
        }
    }
}
