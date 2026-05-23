package p000;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲇᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1500 extends AbstractC2867 implements InterfaceC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1500 f5295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5296;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5297;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f5298;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C1338 f5299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2873 f5300;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C2873 f5301;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C2873 f5302;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final LinkedHashMap f5303;

    static {
        AbstractC1574.m3300(-548059301804724L);
        AbstractC1574.m3300(-548102251477684L);
        AbstractC1574.m3300(-548145201150644L);
        AbstractC1574.m3300(-548188150823604L);
        AbstractC1574.m3300(-548231100496564L);
        AbstractC1574.m3300(-548274050169524L);
        AbstractC1574.m3300(-548316999842484L);
        AbstractC1574.m3300(-548359949515444L);
        AbstractC1574.m3300(-548402899188404L);
        AbstractC1574.m3300(-548445848861364L);
        AbstractC1574.m3300(-548488798534324L);
        AbstractC1574.m3300(-548531748207284L);
        AbstractC1574.m3300(-548574697880244L);
        AbstractC1574.m3300(-548617647553204L);
        AbstractC1574.m3300(-548660597226164L);
        AbstractC1574.m3300(-548703546899124L);
        AbstractC1574.m3300(-548746496572084L);
        AbstractC1574.m3300(-548789446245044L);
        AbstractC1574.m3300(-548832395918004L);
        AbstractC1574.m3300(-548875345590964L);
        AbstractC1574.m3300(-548918295263924L);
        String[] strArr = AbstractC1574.f5469;
        f5295 = new C1500("GroupOwnerTitleHook");
        f5296 = "群组";
        f5297 = "显示群头衔";
        f5298 = "在微信群成员聊天列表显示对应的头衔";
        f5299 = new C1338(15);
        f5300 = new C2873(new C1354(5));
        f5301 = new C2873(new C1354(6));
        f5302 = new C2873(new C1354(7));
        f5303 = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0181  */
    /* JADX WARN: Code duplicated, block: B:50:0x0188  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0188, please report this as an issue */
    @Override // p000.InterfaceC1578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) throws IllegalAccessException, InvocationTargetException {
        boolean zM4087;
        boolean zBooleanValue;
        C2315 c2315;
        String str;
        String str2;
        C1487 c1487;
        TextView textView;
        CharSequence text;
        String strValueOf;
        String str3;
        String[] strArr = AbstractC1574.f5469;
        if (mo3264() && msgInfoBean.isGroupChat()) {
            C2315 c2316 = (C2315) f5303.get(msgInfoBean.getSendTalker());
            C0313 c0313 = AbstractC0667.f2547;
            String talker = msgInfoBean.getTalker();
            String sendTalker = msgInfoBean.getSendTalker();
            C2315 c2317 = new C2315(talker, sendTalker);
            C0313 c0314 = AbstractC0667.f2547;
            Boolean bool = (Boolean) c0314.get(c2317);
            if (bool != null) {
                zM4087 = bool.booleanValue();
            } else {
                
                Object objM2066 = C0674.m2066(talker);
                if (objM2066 == null) {
                    zM4087 = false;
                } else {
                    
                    int i = 0;
                    C1299 c1299M3490 = AbstractC0968.startMethodResolution_(objM2066).m3490();
                    c1299M3490.name = "field_roomowner";
                    zM4087 = AbstractC2207.m4087((String) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024(), sendTalker);
                    c0314.put(c2317, Boolean.valueOf(zM4087));
                }
            }
            if (zM4087) {
                if (c2316 == null || (str3 = (String) c2316.f7445) == null) {
                    str3 = "群主";
                }
                c2315 = new C2315(str3, (C1487) f5300.getValue());
            } else {
                String talker2 = msgInfoBean.getTalker();
                String sendTalker2 = msgInfoBean.getSendTalker();
                C2315 c2318 = new C2315(talker2, sendTalker2);
                C0313 c0315 = AbstractC0667.f2548;
                Boolean bool2 = (Boolean) c0315.get(c2318);
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    
                    Object objM2067 = C0674.m2066(talker2);
                    if (objM2067 == null) {
                        zBooleanValue = false;
                    } else {
                        
                        Object objInvoke = AbstractC1574.dexToMethod(C0651.f2503).invoke(objM2067, sendTalker2);
                        if (objInvoke != null) {
                            int i2 = 0;
                            C1299 c1299M3491 = AbstractC0968.startMethodResolution_(objInvoke).m3490();
                            c1299M3491.name = "f";
                            if ((((Number) ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).m3024()).intValue() & 2048) != 0) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = false;
                        }
                        c0315.put(c2318, Boolean.valueOf(zBooleanValue));
                    }
                }
                if (!zBooleanValue) {
                    if (c2316 == null) {
                        c2315 = new C2315("群员", (C1487) f5302.getValue());
                    }
                    str2 = (String) c2316.f7445;
                    c1487 = (C1487) c2316.f7446;
                    int i3 = 0;
                    C1299 c1299M3492 = AbstractC0968.startMethodResolution_(obj).m3490();
                    c1299M3492.name = "userTV";
                    textView = (TextView) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
                    if (textView != null) {
                        text = textView.getText();
                    } else {
                        text = null;
                    }
                    strValueOf = String.valueOf(text);
                    if (textView != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + ' ' + strValueOf);
                        spannableStringBuilder.setSpan(c1487, 0, str2.length(), 33);
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str2.length(), 33);
                        textView.setText(spannableStringBuilder);
                    }
                    if (textView != null) {
                        textView.setEllipsize(null);
                    }
                }
                if (c2316 == null || (str = (String) c2316.f7445) == null) {
                    str = "管理";
                }
                c2315 = new C2315(str, (C1487) f5301.getValue());
            }
            c2316 = c2315;
            str2 = (String) c2316.f7445;
            c1487 = (C1487) c2316.f7446;
            int i4 = 0;
            C1299 c1299M3493 = AbstractC0968.startMethodResolution_(obj).m3490();
            c1299M3493.name = "userTV";
            textView = (TextView) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024();
            if (textView != null) {
                text = textView.getText();
            } else {
                text = null;
            }
            strValueOf = String.valueOf(text);
            if (textView != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2 + ' ' + strValueOf);
                spannableStringBuilder2.setSpan(c1487, 0, str2.length(), 33);
                spannableStringBuilder2.setSpan(new StyleSpan(1), 0, str2.length(), 33);
                textView.setText(spannableStringBuilder2);
            }
            if (textView != null) {
                textView.setEllipsize(null);
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f5298;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f5297;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f5296;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f5299;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
