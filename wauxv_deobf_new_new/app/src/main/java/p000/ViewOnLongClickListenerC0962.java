package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲈᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0962 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f3501;

    public /* synthetic */ ViewOnLongClickListenerC0962(Object obj, int i) {
        this.f3500 = i;
        this.f3501 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object c2641;
        int i = this.f3500;
        Object obj = this.f3501;
        switch (i) {
            case 0:
                ((InterfaceC1433) obj).invoke(view);
                break;
            default:
                C1574 c1574 = (C1574) obj;
                C2782 c2782 = C2782.f8943;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                int i2 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(c2641).m3558();
                String[] strArr = AbstractC1471.f5234;
                c1300M3558.f6475 = "field_userName";
                String str = (String) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127();
                C1300 c1300M3559 = AbstractC2727.m4713(c2641).m3558();
                c1300M3559.f6475 = "field_type";
                int iIntValue = ((Number) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127()).intValue();
                C1300 c1300M35510 = AbstractC2727.m4713(c2641).m3558();
                c1300M35510.f6475 = "field_thumbUrl";
                String str2 = (String) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
                C1300 c1300M35511 = AbstractC2727.m4713(c2641).m3558();
                c1300M35511.f6475 = "field_imageBgUrl";
                String str3 = (String) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127();
                C1300 c1300M35512 = AbstractC2727.m4713(c2641).m3558();
                c1300M35512.f6475 = "field_videoBgUrl";
                String str4 = (String) ((C1316) AbstractC2844.m4775(c1300M35512)).m3127();
                if (iIntValue == 1 || iIntValue == 2 || iIntValue == 3) {
                    if (str2 != null) {
                        StringBuilder sbM4787 = AbstractC2844.m4787(str);
                        sbM4787.append(".thumbUrl.png");
                        String string = sbM4787.toString();
                        c2782.getClass();
                        C1006 c1006 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C2176(str2, string, (InterfaceC0841) null));
                    }
                    if (str3 != null) {
                        StringBuilder sbM4788 = AbstractC2844.m4787(str);
                        sbM4788.append(".imageBgUrl.png");
                        String string2 = sbM4788.toString();
                        c2782.getClass();
                        C1006 c1007 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C2176(str3, string2, (InterfaceC0841) null));
                    }
                    if (str4 != null) {
                        StringBuilder sbM4789 = AbstractC2844.m4787(str);
                        sbM4789.append(".videoBgUrl.png");
                        String string3 = sbM4789.toString();
                        c2782.getClass();
                        C1006 c1008 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C2176(str4, string3, (InterfaceC0841) null));
                    }
                    AbstractC2894.m4856(null, 3, "下载完成");
                } else {
                    AbstractC2894.m4856(null, 3, "暂不支持的封面类型 " + iIntValue);
                }
                break;
        }
        return true;
    }
}
