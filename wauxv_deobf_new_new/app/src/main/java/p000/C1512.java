package p000;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1512 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1512 f5328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f5329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C1493 f5332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2933 f5333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2933 f5334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C2933 f5335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f5336;

    static {
        AbstractC1471.m3394(-573279349766787L);
        AbstractC1471.m3394(-573322299439747L);
        AbstractC1471.m3394(-573365249112707L);
        AbstractC1471.m3394(-573408198785667L);
        AbstractC1471.m3394(-573451148458627L);
        AbstractC1471.m3394(-573494098131587L);
        AbstractC1471.m3394(-573537047804547L);
        AbstractC1471.m3394(-573579997477507L);
        AbstractC1471.m3394(-573622947150467L);
        AbstractC1471.m3394(-573665896823427L);
        AbstractC1471.m3394(-573708846496387L);
        AbstractC1471.m3394(-573751796169347L);
        AbstractC1471.m3394(-573794745842307L);
        AbstractC1471.m3394(-573837695515267L);
        AbstractC1471.m3394(-573880645188227L);
        AbstractC1471.m3394(-573923594861187L);
        AbstractC1471.m3394(-573966544534147L);
        AbstractC1471.m3394(-574009494207107L);
        AbstractC1471.m3394(-574052443880067L);
        AbstractC1471.m3394(-574095393553027L);
        AbstractC1471.m3394(-574138343225987L);
        String[] strArr = AbstractC1471.f5234;
        f5328 = new C1512("GroupOwnerTitleHook");
        f5329 = "群组";
        f5330 = "显示群头衔";
        f5331 = "在微信群成员聊天列表显示对应的头衔";
        f5332 = new C1493(1);
        f5333 = new C2933(new C1356(6));
        f5334 = new C2933(new C1356(7));
        f5335 = new C2933(new C1356(8));
        f5336 = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0181  */
    /* JADX WARN: Code duplicated, block: B:50:0x0188  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0188, please report this as an issue */
    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) throws IllegalAccessException, InvocationTargetException {
        boolean zM3322;
        boolean zBooleanValue;
        C2348 c2348;
        String str;
        String str2;
        C1499 c1499;
        TextView textView;
        CharSequence text;
        String strValueOf;
        String str3;
        String[] strArr = AbstractC1471.f5234;
        if (mo3445() && msgInfoBean.isGroupChat()) {
            C2348 c2349 = (C2348) f5336.get(msgInfoBean.getSendTalker());
            C0325 c0325 = AbstractC0657.f2540;
            String talker = msgInfoBean.getTalker();
            String sendTalker = msgInfoBean.getSendTalker();
            C2348 c23410 = new C2348(talker, sendTalker);
            C0325 c0326 = AbstractC0657.f2540;
            Boolean bool = (Boolean) c0326.get(c23410);
            if (bool != null) {
                zM3322 = bool.booleanValue();
            } else {
                C0665.f2551.getClass();
                Object objM2156 = C0665.m2156(talker);
                if (objM2156 == null) {
                    zM3322 = false;
                } else {
                    C0643.f2506.getClass();
                    int i = AbstractC1768.f5906;
                    C1300 c1300M3558 = AbstractC2727.m4713(objM2156).m3558();
                    c1300M3558.f6475 = "field_roomowner";
                    zM3322 = AbstractC1469.m3322((String) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127(), sendTalker);
                    c0326.put(c23410, Boolean.valueOf(zM3322));
                }
            }
            if (zM3322) {
                if (c2349 == null || (str3 = (String) c2349.f7567) == null) {
                    str3 = "群主";
                }
                c2348 = new C2348(str3, (C1499) f5333.getValue());
            } else {
                String talker2 = msgInfoBean.getTalker();
                String sendTalker2 = msgInfoBean.getSendTalker();
                C2348 c23411 = new C2348(talker2, sendTalker2);
                C0325 c0327 = AbstractC0657.f2541;
                Boolean bool2 = (Boolean) c0327.get(c23411);
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    C0665.f2551.getClass();
                    Object objM2157 = C0665.m2156(talker2);
                    if (objM2157 == null) {
                        zBooleanValue = false;
                    } else {
                        C0643.f2506.getClass();
                        Object objInvoke = AbstractC0972.m2610(C0642.f2505).invoke(objM2157, sendTalker2);
                        if (objInvoke != null) {
                            int i2 = AbstractC1768.f5906;
                            C1300 c1300M3559 = AbstractC2727.m4713(objInvoke).m3558();
                            c1300M3559.f6475 = "f";
                            if ((((Number) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127()).intValue() & 2048) != 0) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = false;
                        }
                        c0327.put(c23411, Boolean.valueOf(zBooleanValue));
                    }
                }
                if (!zBooleanValue) {
                    if (c2349 == null) {
                        c2348 = new C2348("群员", (C1499) f5335.getValue());
                    }
                    str2 = (String) c2349.f7567;
                    c1499 = (C1499) c2349.f7568;
                    int i3 = AbstractC1768.f5906;
                    C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
                    c1300M35510.f6475 = "userTV";
                    textView = (TextView) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
                    if (textView != null) {
                        text = textView.getText();
                    } else {
                        text = null;
                    }
                    strValueOf = String.valueOf(text);
                    if (textView != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + ' ' + strValueOf);
                        spannableStringBuilder.setSpan(c1499, 0, str2.length(), 33);
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str2.length(), 33);
                        textView.setText(spannableStringBuilder);
                    }
                    if (textView != null) {
                        textView.setEllipsize(null);
                    }
                }
                if (c2349 == null || (str = (String) c2349.f7567) == null) {
                    str = "管理";
                }
                c2348 = new C2348(str, (C1499) f5334.getValue());
            }
            c2349 = c2348;
            str2 = (String) c2349.f7567;
            c1499 = (C1499) c2349.f7568;
            int i4 = AbstractC1768.f5906;
            C1300 c1300M35511 = AbstractC2727.m4713(obj).m3558();
            c1300M35511.f6475 = "userTV";
            textView = (TextView) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127();
            if (textView != null) {
                text = textView.getText();
            } else {
                text = null;
            }
            strValueOf = String.valueOf(text);
            if (textView != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2 + ' ' + strValueOf);
                spannableStringBuilder2.setSpan(c1499, 0, str2.length(), 33);
                spannableStringBuilder2.setSpan(new StyleSpan(1), 0, str2.length(), 33);
                textView.setText(spannableStringBuilder2);
            }
            if (textView != null) {
                textView.setEllipsize(null);
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f5331;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f5330;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f5329;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f5332;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
