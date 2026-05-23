package p000;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᤝᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0314 extends AbstractC2867 implements InterfaceC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0314 f1554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f1557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C0313 f1558;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1554 = new C0314("AutoTransformVoiceHook");
        f1555 = "聊天";
        f1556 = "自动语音转文";
        f1557 = "自动将微信聊天列表的语音消息转文字";
        f1558 = new C0313(100, 0.75f, true, 0);
    }

    @Override // p000.InterfaceC1578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (mo3264() && msgInfoBean.isVoice()) {
            Long lValueOf = Long.valueOf(msgInfoBean.getMsgId());
            C0313 c0313 = f1558;
            Object obj3 = c0313.get(lValueOf);
            Boolean bool = Boolean.TRUE;
            if (AbstractC2207.m4087(obj3, bool)) {
                return;
            }
            int i = AbstractC1745.f5844;
            C1299 c1299M3490 = AbstractC0968.m2484(obj2).m3490();
            C0204.f1288.getClass();
            C0203 c0203 = C0203.f1287;
            c1299M3490.f4725 = AbstractC1574.m3315(c0203).getDeclaringClass();
            Object objM3023 = ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3023();
            C3426.f10800.getClass();
            Object objInvoke = AbstractC1574.m3315(c0203).invoke(objM3023, (Class) AbstractC0270.m1385(AbstractC1574.m3313(C3425.f10799).getInterfaces()));
            long msgId = msgInfoBean.getMsgId();
            C1973 c1973M3492 = AbstractC0968.m2484(objInvoke).m3492();
            c1973M3492.f6544 = new C2798(29);
            if (AbstractC2207.m4087(((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(Long.TYPE)}, 1, c1973M3492)).m3832(Long.valueOf(msgId)).toString(), "NoTransform")) {
                c0313.put(Long.valueOf(msgInfoBean.getMsgId()), bool);
                Object origin = msgInfoBean.getOrigin();
                C1973 c1973M3493 = AbstractC0968.m2484(objInvoke).m3492();
                c1973M3493.f6543 = Void.TYPE;
                C2060.f6855.getClass();
                Class clsM3313 = AbstractC1574.m3313(C2059.f6854);
                C0707 c0707M4527 = AbstractC2519.m4527(Boolean.TYPE);
                Class cls = Integer.TYPE;
                ((C1982) AbstractC2784.m4743(new Object[]{clsM3313, c0707M4527, AbstractC2519.m4527(cls), AbstractC2519.m4527(cls)}, 4, c1973M3493)).m3831(origin, Boolean.FALSE, -1, 0);
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f1557;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f1556;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f1555;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
