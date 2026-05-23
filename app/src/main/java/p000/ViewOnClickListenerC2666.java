package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2666 implements View.OnClickListener {

    public final /* synthetic */ int f8590;

    public final /* synthetic */ C2675 f8591;

    public /* synthetic */ ViewOnClickListenerC2666(C2675 c2675, int i) {
        this.f8590 = i;
        this.f8591 = c2675;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8590) {
            case 0:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/LuckyPray/DexKit");
                break;
            case 1:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/BillyWei01/FastKV");
                break;
            case 2:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/kongzue/DialogX");
                break;
            case 3:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/cinit/QAuxiliary");
                break;
            case 4:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/suzhelan/TimTool");
                break;
            case 5:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/fankes/TSBattery");
                break;
            case 6:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/KitsunePie/QQCleaner");
                break;
            case 7:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/LSPosed/LSPosed");
                break;
            case 8:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/Lagrio");
                break;
            case 9:
                AbstractC3681.m5335(this.f8591.f8605, "https://t.me/Hd_WAuxiliary_CI");
                break;
            case 10:
                AbstractC3681.m5335(this.f8591.f8605, "https://t.me/Hd_WAuxiliary");
                break;
            case 11:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/HdShare/WAuxiliary_Public");
                break;
            case 12 /* 12 */:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/HdShare/WAuxiliary_Plugin");
                break;
            case 13:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/HighCapable/YukiHookAPI");
                break;
            case 14 /* 14 */:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/HighCapable/KavaRef");
                break;
            case 15:
                AbstractC3681.m5335(this.f8591.f8605, "https://github.com/BetterAndroid/BetterAndroid");
                break;
            case 16:
                String[] strArr = AbstractC1574.f5469;
                C2675 c2675 = this.f8591;
                LinearLayout linearLayout = c2675.f8612;
                LinearLayout linearLayout2 = null;
                if (linearLayout == null) {
                    "llSearchRow";
                    linearLayout = null;
                }
                linearLayout.setVisibility(0);
                EditText editText = c2675.f8613;
                if (editText == null) {
                    "edtSearchInput";
                    editText = null;
                }
                editText.requestFocus();
                editText.post(new RunnableC1324(editText, 4, c2675));
                LinearLayout linearLayout3 = c2675.f8609;
                if (linearLayout3 == null) {
                    "llTabRow";
                } else {
                    linearLayout2 = linearLayout3;
                }
                linearLayout2.setVisibility(8);
                break;
            default:
                this.f8591.m4683();
                break;
        }
    }
}
