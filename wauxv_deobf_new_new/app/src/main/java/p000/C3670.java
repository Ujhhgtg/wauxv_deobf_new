package p000;

import java.io.File;
import java.math.BigInteger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲁᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3670 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public String f11431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public String f11432;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public /* synthetic */ Object f11434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f11436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f11437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f11438;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11439;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3670(String str, String str2, String str3, String str4, String str5, InterfaceC0841 interfaceC0841, int i) {
        super(2, interfaceC0841);
        this.f11430 = i;
        this.f11435 = str;
        this.f11436 = str2;
        this.f11437 = str3;
        this.f11438 = str4;
        this.f11439 = str5;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f11430) {
            case 0:
                break;
        }
        return ((C3670) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f11430) {
            case 0:
                C3670 c3670 = new C3670(this.f11435, this.f11436, this.f11437, this.f11438, this.f11439, interfaceC0841, 0);
                c3670.f11434 = obj;
                return c3670;
            default:
                C3670 c3671 = new C3670(this.f11435, this.f11436, this.f11437, this.f11438, this.f11439, interfaceC0841, 1);
                c3671.f11434 = obj;
                return c3671;
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Exception {
        String str;
        Object objM4138;
        String str2;
        String str3;
        Object objM4139;
        String str4;
        int i = this.f11430;
        C3554 c3554 = C3554.UNIT;
        String str5 = this.f11439;
        String str6 = this.f11438;
        EnumC0883 enumC0883 = EnumC0883.f3332;
        InterfaceC0841 interfaceC0841 = null;
        String str7 = this.f11435;
        String str8 = this.f11436;
        String str9 = this.f11437;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f11434;
                int i2 = this.f11433;
                if (i2 == 0) {
                    AbstractC1470.m3372(obj);
                    AbstractC2894.m4856(null, 3, "开始下载视频");
                    StringBuilder sb = new StringBuilder();
                    C3667 c3667 = C3667.f11416;
                    sb.append(c3667.m2666());
                    sb.append('/');
                    sb.append(str7);
                    sb.append('-');
                    sb.append(str8);
                    sb.append('-');
                    sb.append(str9);
                    sb.append(".tmp.mp4");
                    String string = sb.toString();
                    str = c3667.m2666() + '/' + str7 + '-' + str8 + ".decrypt.mp4";
                    String str10 = str6 + str5;
                    C2593 c2593 = new C2593(string, 5);
                    C1006 c1006 = AbstractC1080.f3904;
                    C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0882, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(str10, c2593, null, 6)));
                    this.f11434 = null;
                    this.f11431 = string;
                    this.f11432 = str;
                    this.f11433 = 1;
                    objM4138 = c2180.m4138(this);
                    if (objM4138 == enumC0883) {
                        return enumC0883;
                    }
                    str2 = string;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str11 = this.f11432;
                    str2 = this.f11431;
                    AbstractC1470.m3372(obj);
                    str = str11;
                    objM4138 = obj;
                }
                C1139.m2857(str2, str, new BigInteger(str9));
                ((File) objM4138).delete();
                AbstractC2894.m4856(null, 3, "下载视频完成");
                return c3554;
            default:
                String[] strArr2 = AbstractC1471.f5234;
                InterfaceC0882 interfaceC0883 = (InterfaceC0882) this.f11434;
                int i3 = this.f11433;
                if (i3 == 0) {
                    AbstractC1470.m3372(obj);
                    AbstractC2894.m4856(null, 3, "开始下载视频");
                    StringBuilder sb2 = new StringBuilder();
                    C3672 c3672 = C3672.f11446;
                    sb2.append(c3672.m2666());
                    sb2.append('/');
                    sb2.append(str7);
                    sb2.append('-');
                    sb2.append(str8);
                    sb2.append('-');
                    sb2.append(str9);
                    sb2.append(".tmp.mp4");
                    String string2 = sb2.toString();
                    str3 = c3672.m2666() + '/' + str7 + '-' + str8 + ".decrypt.mp4";
                    String str12 = str6 + str5;
                    C2593 c2594 = new C2593(string2, 8);
                    C1006 c1007 = AbstractC1080.f3904;
                    C2180 c2181 = new C2180(AbstractC1470.m3361(interfaceC0883, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(str12, c2594, interfaceC0841, 9)));
                    this.f11434 = null;
                    this.f11431 = string2;
                    this.f11432 = str3;
                    this.f11433 = 1;
                    objM4139 = c2181.m4138(this);
                    if (objM4139 == enumC0883) {
                        return enumC0883;
                    }
                    str4 = string2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str13 = this.f11432;
                    str4 = this.f11431;
                    AbstractC1470.m3372(obj);
                    str3 = str13;
                    objM4139 = obj;
                }
                C1139.m2857(str4, str3, new BigInteger(str9));
                ((File) objM4139).delete();
                AbstractC2894.m4856(null, 3, "下载视频完成");
                return c3554;
        }
    }
}
