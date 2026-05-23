package p000;

import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3633 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ long f11349;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ TextView f11350;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f11351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f11352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ List f11353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f11354;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3633(long j, TextView textView, ProgressBar progressBar, int i, List list, String str, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f11349 = j;
        this.f11350 = textView;
        this.f11351 = progressBar;
        this.f11352 = i;
        this.f11353 = list;
        this.f11354 = str;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) throws Throwable {
        C3633 c3633 = (C3633) mo1197((InterfaceC0842) obj2, (InterfaceC0883) obj);
        Unit unit = Unit.INSTANCE;
        c3633.mo1198(unit);
        return unit;
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        return new C3633(this.f11349, this.f11350, this.f11351, this.f11352, this.f11353, this.f11354, interfaceC0842);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        AbstractC0743.m2188(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f11349;
        StringBuilder sbM4753 = AbstractC2784.m4753(this.f11354);
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("载入 ");
        int i = this.f11352;
        sb.append(i + 1);
        sb.append('/');
        List list = this.f11353;
        sb.append(list.size());
        sb.append(", 耗时 ");
        sb.append(jCurrentTimeMillis);
        sb.append("ms");
        sbM4753.append(sb.toString());
        sbM4753.append('\n');
        this.f11350.setText(sbM4753.toString());
        this.f11351.setProgress(((i + 1) * 100) / list.size());
        return Unit.INSTANCE;
    }
}
