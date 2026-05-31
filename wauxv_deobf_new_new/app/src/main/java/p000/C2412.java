package p000;

import java.io.File;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2412 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public /* synthetic */ Object f7728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Map f7730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f7731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ long f7732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f7733;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2412(String str, Map map, String str2, long j, Consumer consumer, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f7729 = str;
        this.f7730 = map;
        this.f7731 = str2;
        this.f7732 = j;
        this.f7733 = consumer;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        return ((C2412) mo1343((InterfaceC0841) obj2, (InterfaceC0882) obj)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        C2412 c2412 = new C2412(this.f7729, this.f7730, this.f7731, this.f7732, this.f7733, interfaceC0841);
        c2412.f7728 = obj;
        return c2412;
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Exception {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f7728;
        int i = this.f7727;
        if (i == 0) {
            AbstractC1470.m3372(obj);
            C2410 c2410 = new C2410(this.f7730, this.f7731, this.f7732, 0);
            C1006 c1006 = AbstractC1080.f3904;
            C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0882, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(this.f7729, c2410, null, 0)));
            this.f7728 = null;
            this.f7727 = 1;
            obj = c2180.m4138(this);
            EnumC0883 enumC0883 = EnumC0883.f3332;
            if (obj == enumC0883) {
                return enumC0883;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1470.m3372(obj);
        }
        this.f7733.accept((File) obj);
        return C3554.UNIT;
    }
}
