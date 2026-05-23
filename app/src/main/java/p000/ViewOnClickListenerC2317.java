package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲁᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2317 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7448;

    public /* synthetic */ ViewOnClickListenerC2317(int i) {
        this.f7448 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7448) {
            case 0:
                AbstractC2834.m4819(C2321.f7453);
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
            case 1:
                String[] strArr = AbstractC1574.f5469;
                String str = "EmojiGroupInfo";
                String str2 = "productID = ?";
                String[] strArr2 = {"wa.panel.emoji.group"};
                int i = AbstractC1745.f5844;
                C2800.f8930.getClass();
                C1973 c1973M3492 = AbstractC0968.m2484(C2800.m4779()).m3492();
                c1973M3492.f6370 = "delete";
                ((Number) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String[].class)}, 3, c1973M3492)).m3832(str, str2, strArr2)).intValue();
                AbstractC2834.m4823(null, 3, "清除成功");
                break;
            case 2:
                C2873 c2873 = AbstractC2342.f7529;
                String[] strArr3 = AbstractC1574.f5469;
                AbstractC2834.m4819(AbstractC2342.m4330(MagicFactory.get(-36490042145460L, strArr3)));
                AbstractC2834.m4823(null, 3, MagicFactory.get(-534074888288948L, strArr3));
                break;
            case 3:
                String[] strArr4 = AbstractC1574.f5469;
                AbstractC2834.m4819(MagicFactory.get(-464401928813236L, strArr4));
                AbstractC2834.m4823(null, 3, MagicFactory.get(-464513597962932L, strArr4));
                break;
            case 4:
                AbstractC2834.m4819(AbstractC3691.f11600);
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
            default:
                C1565.f5440.getClass();
                AbstractC2834.m4819(C1565.m3281());
                AbstractC2834.m4823(null, 3, "复制成功");
                break;
        }
    }
}
