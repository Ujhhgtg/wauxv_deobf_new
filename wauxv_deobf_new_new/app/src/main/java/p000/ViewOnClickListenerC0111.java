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
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.lang.reflect.InvocationTargetException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0111 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1119;

    public /* synthetic */ ViewOnClickListenerC0111(Object obj, int i) {
        this.f1118 = i;
        this.f1119 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String originContent;
        switch (this.f1118) {
            case 0:
                ((C0114) this.f1119).invoke();
                break;
            case 1:
                ((C0646) this.f1119).f2519.invoke();
                break;
            case 2:
                C0722 c0722 = (C0722) this.f1119;
                EditText editText = c0722.f2744;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0722.m2952();
                    break;
                }
                break;
            case 3:
                ((CheckBox) ((C2503) this.f1119).m4446(R.id.itemContactCheckBoxSelect)).performClick();
                break;
            case 4:
                ((C1124) this.f1119).m2842();
                break;
            case 5:
                EnumC1158 enumC1158 = (EnumC1158) this.f1119;
                C2952.f9477.getClass();
                C2199.m4144(enumC1158.f4273 + 1, C2952.f9478);
                break;
            case 6:
                EnumC1160 enumC1160 = (EnumC1160) this.f1119;
                C2952.f9477.getClass();
                String str = C2952.f9478;
                int iM1095 = enumC1160.f4278;
                int i = iM1095 + 1;
                String[] strArr = AbstractC1471.f5234;
                String[] strArr2 = {"514914788fc461e7205bf0b6ba496c49", "f790e342a02e0f99d34b316547f9aeab", "091577322c40c05aa3dd701da29d6423"};
                if (1 > i || i >= 4) {
                    iM1095 = AbstractC2528.f8059.m1095(3);
                }
                C1166 c1166 = C1166.f4288;
                String str2 = strArr2[iM1095];
                c1166.getClass();
                C1172.m2907(C1172.f4298, str, C1166.m2905(str2));
                break;
            case 7:
                ((AbstractC1997) this.f1119).m3991();
                break;
            case 8:
                C0942 c0942 = (C0942) this.f1119;
                c0942.getClass();
                AbstractC0034.m889(new RunnableC0935(c0942, 1));
                break;
            case 9:
                MsgInfoBean msgInfoBean = (MsgInfoBean) this.f1119;
                if (C2104.f6992.m2660()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setTitle(msgInfoBean.getOrigin().getClass().getSimpleName());
                    C2105 c2105 = C2105.f6993;
                    if (c2105.m2660()) {
                        originContent = msgInfoBean.getContent();
                        if (AbstractC2894.m4853(originContent)) {
                            originContent = AbstractC2894.m4854(originContent).toJSONString(JSONWriter.Feature.PrettyFormat);
                        }
                    } else {
                        originContent = msgInfoBean.getOriginContent();
                    }
                    builder.setMessage(originContent);
                    String[] strArr3 = AbstractC1471.f5234;
                    builder.setPositiveButton("确定", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                    TextView textView = (TextView) builder.show().findViewById(android.R.id.message);
                    textView.setTextIsSelectable(true);
                    if (c2105.m2660()) {
                        textView.setHorizontallyScrolling(true);
                        textView.scrollTo(0, 0);
                    }
                    break;
                }
                break;
            default:
                C2377 c2377 = (C2377) this.f1119;
                EditText editText2 = c2377.f7636;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c2377.f7636;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c2377.f7636.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c2377.f7636.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c2377.f7636.setSelection(selectionEnd);
                    }
                    c2377.m2952();
                    break;
                }
                break;
        }
    }
}
