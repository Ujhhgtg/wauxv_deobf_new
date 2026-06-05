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
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2974feyxiexzfUjhhgtg implements View.OnClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9277Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f9278Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnClickListenerC2974feyxiexzfUjhhgtg(int i, Object obj) {
        this.f9277Ujhhgtgfeyxiexzf = i;
        this.f9278Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String originContent;
        switch (this.f9277Ujhhgtgfeyxiexzf) {
            case 0:
                ((C2977Ujhhgtgfeyxiexzf) this.f9278Ujhhgtgfeyxiexzf).invoke();
                break;
            case 1:
                ((C2755feyxiexzfUjhhgtg) this.f9278Ujhhgtgfeyxiexzf).f8730Ujhhgtgfeyxiexzf.invoke();
                break;
            case 2:
                C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg = (C2834feyxiexzfUjhhgtg) this.f9278Ujhhgtgfeyxiexzf;
                EditText editText = c2834feyxiexzfUjhhgtg.f9010Ujhhgtgfeyxiexzf;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c2834feyxiexzfUjhhgtg.m4840Ujhhgtgfeyxiexzf();
                    break;
                }
                break;
            case 3:
                ((CheckBox) ((C0781feyxiexzfUjhhgtg) this.f9278Ujhhgtgfeyxiexzf).m2095Ujhhgtgfeyxiexzf(R.id.itemContactCheckBoxSelect)).performClick();
                break;
            case 4:
                ((C3245feyxiexzfUjhhgtg) this.f9278Ujhhgtgfeyxiexzf).m4746Ujhhgtgfeyxiexzf();
                break;
            case 5:
                EnumC3299Ujhhgtgfeyxiexzf enumC3299Ujhhgtgfeyxiexzf = (EnumC3299Ujhhgtgfeyxiexzf) this.f9278Ujhhgtgfeyxiexzf;
                C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                C0452Ujhhgtgfeyxiexzf.m1779Ujhhgtgfeyxiexzf(enumC3299Ujhhgtgfeyxiexzf.f10337Ujhhgtgfeyxiexzf + 1, C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf);
                break;
            case 6:
                EnumC3281Ujhhgtgfeyxiexzf enumC3281Ujhhgtgfeyxiexzf = (EnumC3281Ujhhgtgfeyxiexzf) this.f9278Ujhhgtgfeyxiexzf;
                C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                String str = C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf;
                int iM4298Ujhhgtgfeyxiexzf = enumC3281Ujhhgtgfeyxiexzf.f10303Ujhhgtgfeyxiexzf;
                int i = iM4298Ujhhgtgfeyxiexzf + 1;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String[] strArr2 = {"514914788fc461e7205bf0b6ba496c49", "f790e342a02e0f99d34b316547f9aeab", "091577322c40c05aa3dd701da29d6423"};
                if (1 > i || i >= 4) {
                    iM4298Ujhhgtgfeyxiexzf = AbstractC0804feyxiexzfUjhhgtg.f3193Ujhhgtgfeyxiexzf.m4298Ujhhgtgfeyxiexzf(3);
                }
                C3287Ujhhgtgfeyxiexzf c3287Ujhhgtgfeyxiexzf = C3287Ujhhgtgfeyxiexzf.f10316Ujhhgtgfeyxiexzf;
                String str2 = strArr2[iM4298Ujhhgtgfeyxiexzf];
                c3287Ujhhgtgfeyxiexzf.getClass();
                C3293Ujhhgtgfeyxiexzf.m4787feyxiexzfUjhhgtg(C3293Ujhhgtgfeyxiexzf.f10330Ujhhgtgfeyxiexzf, str, C3287Ujhhgtgfeyxiexzf.m4785feyxiexzfUjhhgtg(str2));
                break;
            case 7:
                ((AbstractC0384Ujhhgtgfeyxiexzf) this.f9278Ujhhgtgfeyxiexzf).m1632Ujhhgtgfeyxiexzf();
                break;
            case 8:
                C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) this.f9278Ujhhgtgfeyxiexzf;
                c3082Ujhhgtgfeyxiexzf.getClass();
                Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082Ujhhgtgfeyxiexzf, 1));
                break;
            case 9:
                MsgInfoBean msgInfoBean = (MsgInfoBean) this.f9278Ujhhgtgfeyxiexzf;
                if (C0491Ujhhgtgfeyxiexzf.f2410Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setTitle(msgInfoBean.getOrigin().getClass().getSimpleName());
                    C0492Ujhhgtgfeyxiexzf c0492Ujhhgtgfeyxiexzf = C0492Ujhhgtgfeyxiexzf.f2411Ujhhgtgfeyxiexzf;
                    if (c0492Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                        originContent = msgInfoBean.getContent();
                        if (AbstractC1150feyxiexzfUjhhgtg.m2618Ujhhgtgfeyxiexzf(originContent)) {
                            originContent = AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(originContent).toJSONString(JSONWriter.Feature.PrettyFormat);
                        }
                    } else {
                        originContent = msgInfoBean.getOriginContent();
                    }
                    builder.setMessage(originContent);
                    String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    builder.setPositiveButton("确定", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                    TextView textView = (TextView) builder.show().findViewById(android.R.id.message);
                    textView.setTextIsSelectable(true);
                    if (c0492Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                        textView.setHorizontallyScrolling(true);
                        textView.scrollTo(0, 0);
                    }
                    break;
                }
                break;
            default:
                C1390feyxiexzfUjhhgtg c1390feyxiexzfUjhhgtg = (C1390feyxiexzfUjhhgtg) this.f9278Ujhhgtgfeyxiexzf;
                EditText editText2 = c1390feyxiexzfUjhhgtg.f4889Ujhhgtgfeyxiexzf;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c1390feyxiexzfUjhhgtg.f4889Ujhhgtgfeyxiexzf;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c1390feyxiexzfUjhhgtg.f4889Ujhhgtgfeyxiexzf.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c1390feyxiexzfUjhhgtg.f4889Ujhhgtgfeyxiexzf.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c1390feyxiexzfUjhhgtg.f4889Ujhhgtgfeyxiexzf.setSelection(selectionEnd);
                    }
                    c1390feyxiexzfUjhhgtg.m4840Ujhhgtgfeyxiexzf();
                    break;
                }
                break;
        }
    }
}
