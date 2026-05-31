package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲀᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2124 extends AbstractC2927 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2124 f7023;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7026;

    static {
        String[] strArr = AbstractC1471.f5234;
        f7023 = new C2124("MsgRepeatHook");
        f7024 = "菜单";
        f7025 = "消息复读";
        f7026 = "支持直接复读部分的简单消息到上下文";
    }

    @Override // p000.InterfaceC1588
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final List mo2908(MsgInfoBean msgInfoBean) {
        String[] strArr = AbstractC1471.f5234;
        if (mo3445()) {
            if (msgInfoBean.isText()) {
                return Collections.singletonList(new C0631(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1964(15)));
            }
            if (msgInfoBean.isImage()) {
                return Collections.singletonList(new C0631(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1964(16)));
            }
            if (msgInfoBean.isVoice()) {
                return Collections.singletonList(new C0631(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1964(17)));
            }
            if (msgInfoBean.isVideo()) {
                return Collections.singletonList(new C0631(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1964(18)));
            }
            if (msgInfoBean.isEmoji()) {
                return Collections.singletonList(new C0631(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1964(19)));
            }
            if (msgInfoBean.isQuote()) {
                return Collections.singletonList(new C0631(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1964(20)));
            }
        }
        return C1191.f4326;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7026;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7025;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7024;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
