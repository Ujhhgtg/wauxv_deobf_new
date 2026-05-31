package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲇᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2350 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7571;

    public /* synthetic */ ViewOnClickListenerC2350(int i) {
        this.f7571 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7571) {
            case 0:
                AbstractC2894.m4852(C2361.f7588);
                AbstractC2894.m4856(null, 3, "复制成功");
                break;
            case 1:
                String[] strArr = AbstractC1471.f5234;
                String str = "EmojiGroupInfo";
                String str2 = "productID like ?";
                String[] strArr2 = {"wauxv.panel.emoji.%"};
                int i = AbstractC1768.f5906;
                C2859.f9091.getClass();
                C2004 c2004M3560 = AbstractC2727.m4713(C2859.m4812()).m3560();
                c2004M3560.f6475 = "delete";
                ((Number) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String[].class)}, 3, c2004M3560)).m4026(str, str2, strArr2)).intValue();
                AbstractC2894.m4856(null, 3, "清除成功");
                break;
            case 2:
                C2933 c2933 = AbstractC2381.f7642;
                String[] strArr3 = AbstractC1471.f5234;
                AbstractC2894.m4852(AbstractC2381.m4344("Plugin"));
                AbstractC2894.m4856(null, 3, "复制成功");
                break;
            case 3:
                String[] strArr4 = AbstractC1471.f5234;
                AbstractC2894.m4852("1.2.7.r1405.70100cc(1405)");
                AbstractC2894.m4856(null, 3, "复制成功");
                break;
            case 4:
                AbstractC2894.m4852(AbstractC3754.f11757);
                AbstractC2894.m4856(null, 3, "复制成功");
                break;
            default:
                C1576.f5470.getClass();
                AbstractC2894.m4852(C1576.m3461());
                AbstractC2894.m4856(null, 3, "复制成功");
                break;
        }
    }
}
