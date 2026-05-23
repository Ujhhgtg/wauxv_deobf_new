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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2365 implements InterfaceC1425 {

    public final /* synthetic */ int f7600;

    public final /* synthetic */ long f7601;

    public final /* synthetic */ Object f7602;

    public /* synthetic */ C2365(Object obj, long j, int i) {
        this.f7600 = i;
        this.f7602 = obj;
        this.f7601 = j;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IOException {
        StringBuilder sb;
        switch (this.f7600) {
            case 0:
                Map map = (Map) this.f7602;
                C3515 c3515 = (C3515) obj;
                OkHttpClient okHttpClient = c3515.f1765;
                Request.Builder builder = c3515.f1764;
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j = this.f7601;
                builderNewBuilder.connectTimeout(j, TimeUnit.SECONDS);
                builderNewBuilder.readTimeout(j, TimeUnit.SECONDS);
                builderNewBuilder.writeTimeout(j, TimeUnit.SECONDS);
                AbstractC2271.m4154(builderNewBuilder);
                OkHttpClient okHttpClientM4155 = AbstractC2272.m4155(builderNewBuilder.build());
                c3515.f1765 = okHttpClientM4155;
                Cache cache = okHttpClientM4155.cache();
                builder.tag(C1391.class, cache != null ? new C1391(OkHttpUtils.diskLruCache(cache)) : null);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                break;
            default:
                C2732 c2732 = (C2732) this.f7602;
                C0816 c0816 = (C0816) obj;
                String[] strArr = AbstractC1574.f5469;
                c0816.f3198 = "搜索好友";
                String str = "好友";
                ArrayList arrayListM4031 = AbstractC2203.m4031();
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(arrayListM4031, 10));
                Iterator it = arrayListM4031.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    final long j2 = this.f7601;
                    if (!zHasNext) {
                        c0816.m2367("好友", arrayList);
                        c0816.f3199 = R.drawable.ic_contact_confirm_24dp;
                        String str2 = "点赞";
                        InterfaceC1429 interfaceC1429 = new InterfaceC1429() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲁᤞᲈᛸ
                            @Override // p000.InterfaceC1429
                            public final Object mo1196(Object obj2, Object obj3) {
                                long j3;
                                List list = (List) obj2;
                                String[] strArr2 = AbstractC1574.f5469;
                                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((C0801) it2.next()).f3160);
                                }
                                Set setM2209 = AbstractC0744.m2209(arrayList2);
                                C2731 c2731 = C2731.f8798;
                                Set setM2541 = c2731.m2541();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = setM2541.iterator();
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
                                Set setM2208 = AbstractC0744.m2208(arrayList3);
                                if (!setM2209.isEmpty()) {
                                    setM2208.add(j3 + '|' + AbstractC0744.m2196(setM2209, ";", null, null, null, 62));
                                }
                                c2731.m2547(setM2208);
                                AbstractC2834.m4823(null, 3, "已点赞");
                                return Boolean.FALSE;
                            }
                        };
                        c0816.f3202 = "点赞";
                        c0816.f3204 = interfaceC1429;
                    } else {
                        FriendInfo friendInfo = (FriendInfo) it.next();
                        String wxid = friendInfo.getWxid();
                        StringBuilder sb2 = new StringBuilder();
                        String nickname = friendInfo.getNickname();
                        if ((AbstractC2652.m4653(C2523.m4530(new C2523("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
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
                        
                        arrayList.add(new C0801(wxid, string, wxid2, C2732.m4728(j2).contains(friendInfo.getWxid())));
                    }
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
