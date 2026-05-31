package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.Request;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2413 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f7735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7736;

    public /* synthetic */ C2413(Object obj, long j, int i) {
        this.f7734 = i;
        this.f7736 = obj;
        this.f7735 = j;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IOException {
        StringBuilder sb;
        switch (this.f7734) {
            case 0:
                Map map = (Map) this.f7736;
                C3573 c3573 = (C3573) obj;
                OkHttpClient okHttpClient = c3573.f1736;
                Request.Builder builder = c3573.f1735;
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j = this.f7735;
                builderNewBuilder.connectTimeout(j, timeUnit);
                builderNewBuilder.readTimeout(j, timeUnit);
                builderNewBuilder.writeTimeout(j, timeUnit);
                AbstractC2303.m4283(builderNewBuilder);
                OkHttpClient okHttpClientM4284 = AbstractC2304.m4284(builderNewBuilder.build());
                c3573.f1736 = okHttpClientM4284;
                Cache cache = okHttpClientM4284.cache();
                builder.tag(C1399.class, cache != null ? new C1399(OkHttpUtils.diskLruCache(cache)) : null);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                break;
            default:
                C2792 c2792 = (C2792) this.f7736;
                C0815 c0815 = (C0815) obj;
                String[] strArr = AbstractC1471.f5234;
                c0815.f3205 = "搜索好友";
                String str = "好友";
                ArrayList arrayListM4250 = AbstractC2240.m4250();
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(arrayListM4250, 10));
                Iterator it = arrayListM4250.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    final long j2 = this.f7735;
                    if (!zHasNext) {
                        c0815.m2483(str, arrayList);
                        c0815.f3206 = R.drawable.ic_contact_confirm_24dp;
                        String str2 = "点赞";
                        InterfaceC1437 interfaceC1437 = new InterfaceC1437() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᲈᤝᛸᤞ
                            @Override // p000.InterfaceC1437
                            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
                            public final Object mo1342(Object obj2, Object obj3) {
                                long j3;
                                List list = (List) obj2;
                                String[] strArr2 = AbstractC1471.f5234;
                                ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((C0800) it2.next()).f3167);
                                }
                                Set setM2308 = AbstractC0739.m2308(arrayList2);
                                C2791 c2791 = C2791.f8960;
                                Set setM2665 = c2791.m2665();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = setM2665.iterator();
                                while (true) {
                                    boolean zHasNext2 = it3.hasNext();
                                    j3 = j2;
                                    if (!zHasNext2) {
                                        break;
                                    }
                                    Object next = it3.next();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j3);
                                    sb2.append('|');
                                    if (!((String) next).startsWith(sb2.toString())) {
                                        arrayList3.add(next);
                                    }
                                }
                                Set setM2307 = AbstractC0739.m2307(arrayList3);
                                if (!setM2308.isEmpty()) {
                                    setM2307.add(j3 + '|' + AbstractC0739.m2295(setM2308, ";", null, null, null, 62));
                                }
                                c2791.m2671(setM2307);
                                AbstractC2894.m4856(null, 3, "已点赞");
                                return Boolean.FALSE;
                            }
                        };
                        c0815.f3209 = str2;
                        c0815.f3211 = interfaceC1437;
                    } else {
                        FriendInfo friendInfo = (FriendInfo) it.next();
                        String wxid = friendInfo.getWxid();
                        StringBuilder sb2 = new StringBuilder();
                        String nickname = friendInfo.getNickname();
                        if ((AbstractC2713.m4687(C2579.m4552(new C2579("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
                            sb2.append("已过滤此昵称...");
                        } else {
                            String str3 = nickname.length() > 8 ? nickname : null;
                            if (str3 != null) {
                                String strSubstring = str3.substring(0, 8);
                                "substring(...)";
                                sb2.append(strSubstring);
                                sb2.append("...");
                                sb = sb2;
                            } else {
                                sb = null;
                            }
                            if (sb == null) {
                                sb2.append(nickname);
                            }
                        }
                        String remark = friendInfo.getRemark();
                        String str4 = remark.length() > 0 ? remark : null;
                        if (str4 != null) {
                            sb2.append("(" + str4 + ')');
                        }
                        String string = sb2.toString();
                        String wxid2 = friendInfo.getWxid();
                        c2792.getClass();
                        arrayList.add(new C0800(wxid, string, wxid2, C2792.m4762(j2).contains(friendInfo.getWxid())));
                    }
                    break;
                }
                break;
        }
        return C3554.UNIT;
    }
}
