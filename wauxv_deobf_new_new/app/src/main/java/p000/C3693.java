package p000;

import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲁᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3693 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ long f11498;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ TextView f11499;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f11500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11501;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ List f11502;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f11503;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3693(long j, TextView textView, ProgressBar progressBar, int i, List list, String str, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f11498 = j;
        this.f11499 = textView;
        this.f11500 = progressBar;
        this.f11501 = i;
        this.f11502 = list;
        this.f11503 = str;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) throws Throwable {
        C3693 c3693 = (C3693) mo1343((InterfaceC0841) obj2, (InterfaceC0882) obj);
        C3554 c3554 = C3554.UNIT;
        c3693.mo1344(c3554);
        return c3554;
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        return new C3693(this.f11498, this.f11499, this.f11500, this.f11501, this.f11502, this.f11503, interfaceC0841);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        AbstractC1470.m3372(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f11498;
        StringBuilder sbM4787 = AbstractC2844.m4787(this.f11503);
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("载入 ");
        int i = this.f11501;
        sb.append(i + 1);
        sb.append('/');
        List list = this.f11502;
        sb.append(list.size());
        sb.append(", 耗时 ");
        sb.append(jCurrentTimeMillis);
        sb.append("ms");
        sbM4787.append(sb.toString());
        sbM4787.append('\n');
        this.f11499.setText(sbM4787.toString());
        this.f11500.setProgress(((i + 1) * 100) / list.size());
        return C3554.UNIT;
    }
}
