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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2073 extends AbstractC2867 implements InterfaceC1577 {

    public static final C2073 f6869;

    public static final List f6870;

    public static final String f6871;

    public static final String f6872;

    public static final String f6873;

    public static final C2058 f6874;

    static {
        AbstractC1574.m3300(-516293723683508L);
        AbstractC1574.m3300(-516336673356468L);
        AbstractC1574.m3300(-516379623029428L);
        AbstractC1574.m3300(-516422572702388L);
        AbstractC1574.m3300(-516465522375348L);
        AbstractC1574.m3300(-516542831786676L);
        String[] strArr = AbstractC1574.f5469;
        f6869 = new C2073("MsgInfoHook");
        f6870 = AbstractC0745.listOf("${time}", "${relativeTime}", "${type}", "${msgId}", "${msgSvrId}", "${atUserList}");
        f6871 = "聊天";
        f6872 = "消息底部详情";
        f6873 = "为聊天列表项目的底部添加自定义文本";
        f6874 = new C2058(2);
    }

    @Override // p000.InterfaceC1577
    public final void mo3334(ViewGroup viewGroup) {
        if (mo3264()) {
            RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
            relativeLayout.setVisibility(8);
            relativeLayout.setId(R.id.MsgInfo_RelativeLayout);
            TextView textView = new TextView(viewGroup.getContext());
            textView.setId(R.id.MsgInfo_TextView);
            relativeLayout.addView(textView);
            viewGroup.addView(relativeLayout);
        }
    }

    @Override // p000.InterfaceC1577
    public final void mo3335(Object obj, ViewGroup viewGroup, Object obj2, MsgInfoBean msgInfoBean) {
        String str;
        String str2;
        if (mo3264()) {
            RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.MsgInfo_RelativeLayout);
            if (msgInfoBean.getType() == EnumC3673.f11489.f11492) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.setVisibility(0);
            if (msgInfoBean.isSend()) {
                layoutParams.addRule(11);
                layoutParams.setMarginEnd((int) AbstractC3681.m5322(Integer.valueOf(C2068.f6864.m2538()), relativeLayout.getContext()));
            } else {
                layoutParams.addRule(9);
                layoutParams.setMarginStart((int) AbstractC3681.m5322(Integer.valueOf(C2065.f6861.m2538()), relativeLayout.getContext()));
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.MsgLeftSwipe_SwipeMenu);
            if (viewGroup2 != null) {
                layoutParams.addRule(3, viewGroup2.getId());
            } else {
                
                
                View viewFindViewById = viewGroup.findViewById(C1565.m3280() ? C2080.f6882.m2538() : AbstractC0968.m2475(C2081.m3884()));
                if (viewFindViewById != null) {
                    layoutParams.addRule(3, viewFindViewById.getId());
                }
            }
            relativeLayout.setLayoutParams(layoutParams);
            TextView textView = (TextView) viewGroup.findViewById(R.id.MsgInfo_TextView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (AbstractC3681.m5331(textView.getContext())) {
                gradientDrawable.setColor(Color.parseColor(C2062.f6858.m2542()));
                textView.setTextColor(Color.parseColor(C2063.f6859.m2542()));
            } else {
                gradientDrawable.setColor(Color.parseColor(C2066.f6862.m2542()));
                textView.setTextColor(Color.parseColor(C2067.f6863.m2542()));
            }
            gradientDrawable.setCornerRadius(5.0f);
            textView.setBackground(gradientDrawable);
            int iM5322 = (int) AbstractC3681.m5322(5, textView.getContext());
            textView.setPadding(iM5322, iM5322, iM5322, iM5322);
            
            String strM2542 = C2071.f6867.m2542();
            String[] strArr = AbstractC1574.f5469;
            String strM4857 = AbstractC2849.m4857(strM2542, "${time}", AbstractC3681.m5339(msgInfoBean.getCreateTime(), C2072.f6868.m2542(), null, 2));
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
            String strM4858 = AbstractC2849.m4857(strM4857, "${relativeTime}", str);
            String str4 = "${type}";
            StringBuilder sb = new StringBuilder();
            sb.append("0x");
            int type = msgInfoBean.getType();
            AbstractC3681.m5317(16);
            String string = Integer.toString(type, 16);
            "toString(...)";
            String upperCase = string.toUpperCase(Locale.ROOT);
            "toUpperCase(...)";
            sb.append(upperCase);
            String strM4859 = AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(strM4858, "${type}", sb.toString()), "${msgId}", String.valueOf(msgInfoBean.getMsgId())), "${msgSvrId}", String.valueOf(msgInfoBean.getMsgSvrId()));
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
            textView.setText(AbstractC2849.m4857(strM4859, "${atUserList}", str2));
            Integer numValueOf = Integer.valueOf(C2064.f6860.m2538());
            Context context = textView.getContext();
            textView.setTextSize((numValueOf.floatValue() * context.getResources().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().scaledDensity);
            relativeLayout.setOnClickListener(new ViewOnClickListenerC0103(8, msgInfoBean));
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6873;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6872;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6871;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f6874;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
