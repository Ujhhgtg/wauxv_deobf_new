package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONWriter;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0103 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1050;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1051;

    public /* synthetic */ ViewOnClickListenerC0103(int i, Object obj) {
        this.f1050 = i;
        this.f1051 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String originContent;
        switch (this.f1050) {
            case 0:
                ((C0106) this.f1051).invoke();
                break;
            case 1:
                ((C0655) this.f1051).f2517.invoke();
                break;
            case 2:
                C0727 c0727 = (C0727) this.f1051;
                EditText editText = c0727.f2750;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0727.m2830();
                    break;
                }
                break;
            case 3:
                ((CheckBox) ((C2452) this.f1051).m4425(R.id.itemContactCheckBoxSelect)).performClick();
                break;
            case 4:
                ((C1118) this.f1051).m2693();
                break;
            case 5:
                C1158.f4281.m2545(((EnumC1154) this.f1051).f4270);
                break;
            case 6:
                C1159.f4282.m2545(((EnumC1157) this.f1051).f4279);
                break;
            case 7:
                ((AbstractC1966) this.f1051).m3797();
                break;
            case 8:
                MsgInfoBean msgInfoBean = (MsgInfoBean) this.f1051;
                if (C2069.f6865.m2536()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setTitle(msgInfoBean.getOrigin().getClass().getSimpleName());
                    C2070 c2070 = C2070.f6866;
                    if (c2070.m2536()) {
                        originContent = msgInfoBean.getContent();
                        if (AbstractC2834.m4820(originContent)) {
                            originContent = AbstractC2834.m4821(originContent).toJSONString(JSONWriter.Feature.PrettyFormat);
                        }
                    } else {
                        originContent = msgInfoBean.getOriginContent();
                    }
                    builder.setMessage(originContent);
                    String[] strArr = AbstractC1574.f5469;
                    builder.setPositiveButton("确定", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                    TextView textView = (TextView) builder.show().findViewById(android.R.id.message);
                    textView.setTextIsSelectable(true);
                    if (c2070.m2536()) {
                        textView.setHorizontallyScrolling(true);
                        textView.scrollTo(0, 0);
                    }
                    break;
                }
                break;
            default:
                C2338 c2338 = (C2338) this.f1051;
                EditText editText2 = c2338.f7523;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c2338.f7523;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c2338.f7523.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c2338.f7523.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c2338.f7523.setSelection(selectionEnd);
                    }
                    c2338.m2830();
                    break;
                }
                break;
        }
    }
}
