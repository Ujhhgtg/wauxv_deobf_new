package p000;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲁᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0326 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0326 f1630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f1631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0325 f1634;

    static {
        String[] strArr = AbstractC1471.f5234;
        f1630 = new C0326("AutoTransformVoiceHook");
        f1631 = "聊天";
        f1632 = "自动语音转文";
        f1633 = "自动将微信聊天列表的语音消息转文字";
        f1634 = new C0325(100, 0.75f, true, 0);
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (mo3445() && msgInfoBean.isVoice()) {
            Long lValueOf = Long.valueOf(msgInfoBean.getMsgId());
            C0325 c0325 = f1634;
            Object obj3 = c0325.get(lValueOf);
            Boolean bool = Boolean.TRUE;
            if (AbstractC1469.m3322(obj3, bool)) {
                return;
            }
            int i = AbstractC1768.f5906;
            C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
            C0212.f1356.getClass();
            C0211 c0211 = C0211.f1355;
            c1300M3558.f4724 = AbstractC0972.m2610(c0211).getDeclaringClass();
            Object objM3126 = ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3126();
            C3483.f10960.getClass();
            Object objInvoke = AbstractC0972.m2610(c0211).invoke(objM3126, (Class) AbstractC0280.m1531(AbstractC0972.m2608(C3482.f10959).getInterfaces()));
            long msgId = msgInfoBean.getMsgId();
            C2004 c2004M3560 = AbstractC2727.m4713(objInvoke).m3560();
            c2004M3560.f6649 = new C2868(21);
            if (AbstractC1469.m3322(((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Long.TYPE)}, 1, c2004M3560)).m4026(Long.valueOf(msgId)).toString(), "NoTransform")) {
                c0325.put(Long.valueOf(msgInfoBean.getMsgId()), bool);
                Object origin = msgInfoBean.getOrigin();
                C2004 c2004M3561 = AbstractC2727.m4713(objInvoke).m3560();
                c2004M3561.f6648 = Void.TYPE;
                C2092.f6978.getClass();
                Class clsM2608 = AbstractC0972.m2608(C2091.f6977);
                C0702 c0702M4549 = AbstractC2574.m4549(Boolean.TYPE);
                Class cls = Integer.TYPE;
                ((C2013) AbstractC2844.m4777(new Object[]{clsM2608, c0702M4549, AbstractC2574.m4549(cls), AbstractC2574.m4549(cls)}, 4, c2004M3561)).m4025(origin, Boolean.FALSE, -1, 0);
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f1633;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f1632;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f1631;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
