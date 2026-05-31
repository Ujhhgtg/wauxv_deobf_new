package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲁᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3668 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f11418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f11419;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f11421;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f11423;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3668(String str, String str2, String str3, String str4, InterfaceC0841 interfaceC0841, int i) {
        super(2, interfaceC0841);
        this.f11417 = i;
        this.f11420 = str;
        this.f11421 = str2;
        this.f11422 = str3;
        this.f11423 = str4;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f11417) {
            case 0:
                break;
        }
        return ((C3668) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f11417) {
            case 0:
                C3668 c3668 = new C3668(this.f11420, this.f11421, this.f11422, this.f11423, interfaceC0841, 0);
                c3668.f11419 = obj;
                return c3668;
            default:
                C3668 c3669 = new C3668(this.f11420, this.f11421, this.f11422, this.f11423, interfaceC0841, 1);
                c3669.f11419 = obj;
                return c3669;
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        int i = this.f11417;
        C3554 c3554 = C3554.UNIT;
        String str = this.f11423;
        String str2 = this.f11422;
        String str3 = this.f11421;
        EnumC0883 enumC0883 = EnumC0883.f3332;
        InterfaceC0841 interfaceC0841 = null;
        String str4 = this.f11420;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f11419;
                int i2 = this.f11418;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                    return c3554;
                }
                AbstractC1470.m3372(obj);
                AbstractC2894.m4856(null, 3, "开始下载" + str4 + "图片");
                String str5 = str2 + str;
                C2593 c2593 = new C2593(C3667.f11416.m2666() + '/' + str4 + '-' + str3 + ".png", 3);
                C1006 c1006 = AbstractC1080.f3904;
                C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0882, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(str5, c2593, interfaceC0841, 4)));
                this.f11419 = null;
                this.f11418 = 1;
                return c2180.m4138(this) == enumC0883 ? enumC0883 : c3554;
            default:
                String[] strArr2 = AbstractC1471.f5234;
                InterfaceC0882 interfaceC0883 = (InterfaceC0882) this.f11419;
                int i3 = this.f11418;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                    return c3554;
                }
                AbstractC1470.m3372(obj);
                AbstractC2894.m4856(null, 3, "开始下载" + str4 + "图片");
                String str6 = str2 + str;
                C2593 c2594 = new C2593(C3672.f11446.m2666() + '/' + str4 + '-' + str3 + ".png", 6);
                C1006 c1007 = AbstractC1080.f3904;
                C2180 c2181 = new C2180(AbstractC1470.m3361(interfaceC0883, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(str6, c2594, interfaceC0841, 7)));
                this.f11419 = null;
                this.f11418 = 1;
                return c2181.m4138(this) == enumC0883 ? enumC0883 : c3554;
        }
    }
}
