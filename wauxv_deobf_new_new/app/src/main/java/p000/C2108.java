package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲁᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2108 extends AbstractC2927 implements InterfaceC1589 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2108 f6996;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final List f6997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f6998;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f6999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f7000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2059 f7001;

    static {
        AbstractC1471.m3394(-538833712052867L);
        AbstractC1471.m3394(-538876661725827L);
        AbstractC1471.m3394(-538919611398787L);
        AbstractC1471.m3394(-538962561071747L);
        AbstractC1471.m3394(-539005510744707L);
        AbstractC1471.m3394(-539082820156035L);
        String[] strArr = AbstractC1471.f5234;
        f6996 = new C2108("MsgInfoHook");
        f6997 = AbstractC0740.m2311("${time}", "${relativeTime}", "${type}", "${msgId}", "${msgSvrId}", "${atUserList}");
        f6998 = "聊天";
        f6999 = "消息底部详情";
        f7000 = "为聊天列表项目的底部添加自定义文本";
        f7001 = new C2059(21);
    }

    @Override // p000.InterfaceC1589
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3498(ViewGroup viewGroup) {
        if (mo3445()) {
            RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
            relativeLayout.setVisibility(8);
            relativeLayout.setId(R.id.MsgInfo_RelativeLayout);
            TextView textView = new TextView(viewGroup.getContext());
            textView.setId(R.id.MsgInfo_TextView);
            relativeLayout.addView(textView);
            viewGroup.addView(relativeLayout);
        }
    }

    @Override // p000.InterfaceC1589
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3499(Object obj, ViewGroup viewGroup, Object obj2, MsgInfoBean msgInfoBean) {
        String str;
        String str2;
        if (mo3445()) {
            RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.MsgInfo_RelativeLayout);
            if (msgInfoBean.getType() == EnumC3733.f11638.f11641) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.setVisibility(0);
            if (msgInfoBean.isSend()) {
                layoutParams.addRule(11);
                layoutParams.setMarginEnd((int) AbstractC2234.m4163(Integer.valueOf(C2103.f6991.m2662()), relativeLayout.getContext()));
            } else {
                layoutParams.addRule(9);
                layoutParams.setMarginStart((int) AbstractC2234.m4163(Integer.valueOf(C2100.f6988.m2662()), relativeLayout.getContext()));
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.MsgLeftSwipe_SwipeMenu);
            if (viewGroup2 != null) {
                layoutParams.addRule(3, viewGroup2.getId());
            } else {
                C2114.f7007.getClass();
                C1576.f5470.getClass();
                View viewFindViewById = viewGroup.findViewById(C1576.m3460() ? C2113.f7006.m2662() : AbstractC1468.m3308(C2114.m4067()));
                if (viewFindViewById != null) {
                    layoutParams.addRule(3, viewFindViewById.getId());
                }
            }
            relativeLayout.setLayoutParams(layoutParams);
            TextView textView = (TextView) viewGroup.findViewById(R.id.MsgInfo_TextView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (AbstractC2234.m4176(textView.getContext())) {
                gradientDrawable.setColor(Color.parseColor(C2097.f6985.m2666()));
                textView.setTextColor(Color.parseColor(C2098.f6986.m2666()));
            } else {
                gradientDrawable.setColor(Color.parseColor(C2101.f6989.m2666()));
                textView.setTextColor(Color.parseColor(C2102.f6990.m2666()));
            }
            gradientDrawable.setCornerRadius(5.0f);
            textView.setBackground(gradientDrawable);
            int iM4163 = (int) AbstractC2234.m4163(5, textView.getContext());
            textView.setPadding(iM4163, iM4163, iM4163, iM4163);
            f6996.getClass();
            String strM2666 = C2106.f6994.m2666();
            String[] strArr = AbstractC1471.f5234;
            String strM4918 = AbstractC2909.m4918(strM2666, "${time}", AbstractC2234.m4188(msgInfoBean.getCreateTime(), C2107.f6995.m2666(), null, 2));
            String str3 = "${relativeTime}";
            long createTime = msgInfoBean.getCreateTime();
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            long epochDay = LocalDate.now(zoneIdSystemDefault).toEpochDay() - Instant.ofEpochMilli(createTime).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay();
            if (epochDay > 1) {
                str = epochDay + "天前";
            } else if (epochDay == 1) {
                str = "昨天";
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - createTime;
                if (jCurrentTimeMillis <= 0) {
                    str = "刚刚";
                } else {
                    long j = jCurrentTimeMillis / ((long) 60000);
                    long j2 = jCurrentTimeMillis / ((long) 3600000);
                    if (j < 1) {
                        str = "刚刚";
                    } else if (j2 < 1) {
                        str = j + "分钟前";
                    } else {
                        str = Math.max(j2, 1L) + "小时前";
                    }
                }
            }
            String strM4919 = AbstractC2909.m4918(strM4918, str3, str);
            String str4 = "${type}";
            StringBuilder sb = new StringBuilder();
            sb.append("0x");
            int type = msgInfoBean.getType();
            AbstractC2727.m4694(16);
            String string = Integer.toString(type, 16);
            "toString(...)";
            String upperCase = string.toUpperCase(Locale.ROOT);
            "toUpperCase(...)";
            sb.append(upperCase);
            String strM49110 = AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(strM4919, str4, sb.toString()), "${msgId}", String.valueOf(msgInfoBean.getMsgId())), "${msgSvrId}", String.valueOf(msgInfoBean.getMsgSvrId()));
            String str5 = "${atUserList}";
            if (msgInfoBean.getAtUserList().isEmpty()) {
                str2 = "";
            } else if (msgInfoBean.isAnnounceAll()) {
                str2 = "@群公告";
            } else if (msgInfoBean.isNotifyAll()) {
                str2 = "@全体";
            } else if (msgInfoBean.isAtMe()) {
                str2 = "@我";
            } else {
                str2 = "@" + msgInfoBean.getAtUserList().size() + (char) 20154;
            }
            textView.setText(AbstractC2909.m4918(strM49110, str5, str2));
            Integer numValueOf = Integer.valueOf(C2099.f6987.m2662());
            Context context = textView.getContext();
            textView.setTextSize((numValueOf.floatValue() * context.getResources().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().scaledDensity);
            relativeLayout.setOnClickListener(new ViewOnClickListenerC0111(msgInfoBean, 9));
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7000;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f6999;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f6998;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f7001;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
