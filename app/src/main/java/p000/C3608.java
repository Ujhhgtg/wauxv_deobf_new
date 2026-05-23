package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3608 extends AbstractC2862 implements InterfaceC1429 {

    public final /* synthetic */ int f11268;

    public int f11269;

    public /* synthetic */ Object f11270;

    public final /* synthetic */ String f11271;

    public final /* synthetic */ String f11272;

    public final /* synthetic */ String f11273;

    public final /* synthetic */ String f11274;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3608(String str, String str2, String str3, String str4, InterfaceC0842 interfaceC0842, int i) {
        super(2, interfaceC0842);
        this.f11268 = i;
        this.f11271 = str;
        this.f11272 = str2;
        this.f11273 = str3;
        this.f11274 = str4;
    }

    @Override // p000.InterfaceC1429
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f11268) {
            case 0:
                break;
        }
        return ((C3608) mo1197(interfaceC0842, interfaceC0883)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f11268) {
            case 0:
                C3608 c3608 = new C3608(this.f11271, this.f11272, this.f11273, this.f11274, interfaceC0842, 0);
                c3608.f11270 = obj;
                return c3608;
            default:
                C3608 c3609 = new C3608(this.f11271, this.f11272, this.f11273, this.f11274, interfaceC0842, 1);
                c3609.f11270 = obj;
                return c3609;
        }
    }

    @Override // p000.AbstractC0370
    public final Object mo1198(Object obj) throws Throwable {
        int i = this.f11268;
        Unit unit = Unit.INSTANCE;
        String str = this.f11274;
        String str2 = this.f11273;
        String str3 = this.f11272;
        EnumC0884 enumC0884 = EnumC0884.f3325;
        InterfaceC0842 interfaceC0842 = null;
        String str4 = this.f11271;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f11270;
                int i2 = this.f11269;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                    return unit;
                }
                AbstractC0743.m2188(obj);
                AbstractC2834.m4823(null, 3, "开始下载" + str4 + "图片");
                String str5 = str2 + str;
                C2536 c2536 = new C2536(C3607.f11267.m2542() + '/' + str4 + '-' + str3 + ".png", 3);
                C1002 c1002 = AbstractC1075.f3893;
                C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0883, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(str5, c2536, interfaceC0842, 4)));
                this.f11270 = null;
                this.f11269 = 1;
                return c2146.m3954(this) == enumC0884 ? enumC0884 : unit;
            default:
                String[] strArr2 = AbstractC1574.f5469;
                InterfaceC0883 interfaceC0884 = (InterfaceC0883) this.f11270;
                int i3 = this.f11269;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                    return unit;
                }
                AbstractC0743.m2188(obj);
                AbstractC2834.m4823(null, 3, "开始下载" + str4 + "图片");
                String str6 = str2 + str;
                C2536 c2537 = new C2536(C3612.f11297.m2542() + '/' + str4 + '-' + str3 + ".png", 6);
                C1002 c1003 = AbstractC1075.f3893;
                C2146 c2147 = new C2146(AbstractC2203.m4025(interfaceC0884, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(str6, c2537, interfaceC0842, 7)));
                this.f11270 = null;
                this.f11269 = 1;
                return c2147.m3954(this) == enumC0884 ? enumC0884 : unit;
        }
    }
}
