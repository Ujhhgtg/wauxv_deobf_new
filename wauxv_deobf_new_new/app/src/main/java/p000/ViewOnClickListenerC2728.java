package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᤞᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2728 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2735 f8750;

    public /* synthetic */ ViewOnClickListenerC2728(C2735 c2735, int i) {
        this.f8749 = i;
        this.f8750 = c2735;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8749) {
            case 0:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/LuckyPray/DexKit");
                break;
            case 1:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/BillyWei01/FastKV");
                break;
            case 2:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/kongzue/DialogX");
                break;
            case 3:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/cinit/QAuxiliary");
                break;
            case 4:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/suzhelan/TimTool");
                break;
            case 5:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/fankes/TSBattery");
                break;
            case 6:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/KitsunePie/QQCleaner");
                break;
            case 7:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/LSPosed/LSPosed");
                break;
            case 8:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/Lagrio");
                break;
            case 9:
                AbstractC2234.m4181(this.f8750.f8763, "https://t.me/Hd_WAuxiliary_CI");
                break;
            case 10:
                AbstractC2234.m4181(this.f8750.f8763, "https://t.me/Hd_WAuxiliary");
                break;
            case 11:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/HdShare/WAuxiliary_Public");
                break;
            case Opcodes.FCONST_1 /* 12 */:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/HdShare/WAuxiliary_Plugin");
                break;
            case 13:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/HighCapable/YukiHookAPI");
                break;
            case Opcodes.DCONST_0 /* 14 */:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/HighCapable/KavaRef");
                break;
            case 15:
                AbstractC2234.m4181(this.f8750.f8763, "https://github.com/BetterAndroid/BetterAndroid");
                break;
            case 16:
                String[] strArr = AbstractC1471.f5234;
                C2735 c2735 = this.f8750;
                LinearLayout linearLayout = c2735.f8770;
                LinearLayout linearLayout2 = null;
                if (linearLayout == null) {
                    "llSearchRow";
                    linearLayout = null;
                }
                linearLayout.setVisibility(0);
                EditText editText = c2735.f8771;
                if (editText == null) {
                    "edtSearchInput";
                    editText = null;
                }
                editText.requestFocus();
                editText.post(new RunnableC1326(editText, 4, c2735));
                LinearLayout linearLayout3 = c2735.f8767;
                if (linearLayout3 == null) {
                    "llTabRow";
                } else {
                    linearLayout2 = linearLayout3;
                }
                linearLayout2.setVisibility(8);
                break;
            default:
                this.f8750.m4717();
                break;
        }
    }
}
